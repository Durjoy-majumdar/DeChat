package com.tencent.wcdb.database;

import android.os.SystemClock;
import android.util.Printer;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.database.SQLiteTrace;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.OperationCanceledException;
import com.tencent.wcdb.support.PrefixPrinter;
import com.tencent.xweb.file.XVFSFile;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import org.json.JSONArray;
import org.json.JSONObject;

public final class SQLiteConnectionPool implements Closeable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONNECTION_FLAG_INTERACTIVE = 4;
    public static final int CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY = 2;
    public static final int CONNECTION_FLAG_READ_ONLY = 1;
    private static final long CONNECTION_POOL_BUSY_MILLIS = 3000;
    private static final int OPEN_FLAG_REOPEN_MASK = 268435473;
    private static final String TAG = "WCDB.SQLiteConnectionPool";
    private final WeakHashMap<SQLiteConnection, AcquiredConnectionStatus> mAcquiredConnections = new WeakHashMap<>();
    private final ArrayList<SQLiteConnection> mAvailableNonPrimaryConnections = new ArrayList<>();
    private SQLiteConnection mAvailablePrimaryConnection;
    private volatile SQLiteChangeListener mChangeListener;
    private volatile SQLiteCheckpointListener mCheckpointListener;
    private SQLiteCipherSpec mCipher;
    private final SQLiteDatabaseConfiguration mConfiguration;
    private final AtomicBoolean mConnectionLeaked = new AtomicBoolean();
    private ConnectionWaiter mConnectionWaiterPool;
    private ConnectionWaiter mConnectionWaiterQueue;
    private final WeakReference<SQLiteDatabase> mDB;
    private boolean mIsOpen;
    /* access modifiers changed from: private */
    public final Object mLock = new Object();
    private int mMaxConnectionPoolSize;
    private int mNextConnectionId;
    private byte[] mPassword;
    private volatile SQLiteTrace mTraceCallback;

    public enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    public static class ConnectionPoolBusyInfo {
        public int activeConnections;
        public ArrayList<String> activeOperationDescriptions;
        public ArrayList<SQLiteTrace.TraceInfo<String>> activeSql;
        public ArrayList<SQLiteTrace.TraceInfo<StackTraceElement[]>> activeTransactions;
        public int availableConnections;
        public int idleConnections;
        public String label;

        private ConnectionPoolBusyInfo() {
            this.activeOperationDescriptions = new ArrayList<>();
            this.activeSql = new ArrayList<>();
            this.activeTransactions = new ArrayList<>();
        }
    }

    public static final class ConnectionWaiter {
        public SQLiteConnection mAssignedConnection;
        public int mConnectionFlags;
        public RuntimeException mException;
        public ConnectionWaiter mNext;
        public int mNonce;
        public int mPriority;
        public String mSql;
        public long mStartTime;
        public Thread mThread;
        public boolean mWantPrimaryConnection;

        private ConnectionWaiter() {
        }
    }

    static {
        Class<SQLiteConnectionPool> cls = SQLiteConnectionPool.class;
    }

    private SQLiteConnectionPool(SQLiteDatabase sQLiteDatabase, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i) {
        this.mDB = new WeakReference<>(sQLiteDatabase);
        this.mConfiguration = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        setMaxConnectionPoolSizeLocked(i);
    }

    /* access modifiers changed from: private */
    public void cancelConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
        ConnectionWaiter connectionWaiter2;
        if (connectionWaiter.mAssignedConnection == null && connectionWaiter.mException == null) {
            ConnectionWaiter connectionWaiter3 = null;
            ConnectionWaiter connectionWaiter4 = this.mConnectionWaiterQueue;
            while (true) {
                ConnectionWaiter connectionWaiter5 = connectionWaiter4;
                connectionWaiter2 = connectionWaiter3;
                connectionWaiter3 = connectionWaiter5;
                if (connectionWaiter3 == connectionWaiter) {
                    break;
                }
                connectionWaiter4 = connectionWaiter3.mNext;
            }
            if (connectionWaiter2 != null) {
                connectionWaiter2.mNext = connectionWaiter.mNext;
            } else {
                this.mConnectionWaiterQueue = connectionWaiter.mNext;
            }
            connectionWaiter.mException = new OperationCanceledException();
            LockSupport.unpark(connectionWaiter.mThread);
            wakeConnectionWaitersLocked();
        }
    }

    private void closeAvailableConnectionsAndLogExceptionsLocked() {
        closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            this.mAvailablePrimaryConnection = null;
        }
    }

    private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        for (int i = 0; i < size; i++) {
            closeConnectionAndLogExceptionsLocked(this.mAvailableNonPrimaryConnections.get(i));
        }
        this.mAvailableNonPrimaryConnections.clear();
    }

    private void closeConnectionAndLogExceptionsLocked(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.close();
        } catch (RuntimeException e) {
            Log.m164293e(TAG, "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection + e.getMessage());
        }
    }

    private void closeExcessConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        while (true) {
            int i = size - 1;
            if (size > this.mMaxConnectionPoolSize - 1) {
                closeConnectionAndLogExceptionsLocked(this.mAvailableNonPrimaryConnections.remove(i));
                size = i;
            } else {
                return;
            }
        }
    }

    private void discardAcquiredConnectionsLocked() {
        markAcquiredConnectionsLocked(AcquiredConnectionStatus.DISCARD);
    }

    private void dispose(boolean z) {
        if (!z) {
            synchronized (this.mLock) {
                throwIfClosedLocked();
                this.mIsOpen = false;
                closeAvailableConnectionsAndLogExceptionsLocked();
                int size = this.mAcquiredConnections.size();
                if (size != 0) {
                    Log.m164297i(TAG, "The connection pool for " + this.mConfiguration.label + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
                }
                wakeConnectionWaitersLocked();
            }
        }
    }

    private void finishAcquireConnectionLocked(SQLiteConnection sQLiteConnection, int i) {
        try {
            sQLiteConnection.setOnlyAllowReadOnlyOperations((i & 1) != 0);
            this.mAcquiredConnections.put(sQLiteConnection, AcquiredConnectionStatus.NORMAL);
        } catch (RuntimeException e) {
            Log.m164293e(TAG, "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i);
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            throw e;
        }
    }

    private ConnectionPoolBusyInfo gatherConnectionPoolBusyInfoLocked() {
        ConnectionPoolBusyInfo connectionPoolBusyInfo = new ConnectionPoolBusyInfo();
        connectionPoolBusyInfo.activeConnections = 0;
        connectionPoolBusyInfo.idleConnections = 0;
        if (!this.mAcquiredConnections.isEmpty()) {
            for (SQLiteConnection next : this.mAcquiredConnections.keySet()) {
                SQLiteTrace.TraceInfo<StackTraceElement[]> tracePersistAcquisitionUnsafe = next.tracePersistAcquisitionUnsafe();
                if (tracePersistAcquisitionUnsafe != null) {
                    connectionPoolBusyInfo.activeTransactions.add(tracePersistAcquisitionUnsafe);
                }
                SQLiteTrace.TraceInfo<String> traceCurrentOperationUnsafe = next.traceCurrentOperationUnsafe();
                if (traceCurrentOperationUnsafe != null) {
                    connectionPoolBusyInfo.activeSql.add(traceCurrentOperationUnsafe);
                    String describeCurrentOperationUnsafe = next.describeCurrentOperationUnsafe();
                    if (describeCurrentOperationUnsafe != null) {
                        connectionPoolBusyInfo.activeOperationDescriptions.add(describeCurrentOperationUnsafe);
                    }
                    connectionPoolBusyInfo.activeConnections++;
                } else {
                    connectionPoolBusyInfo.idleConnections++;
                }
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        connectionPoolBusyInfo.availableConnections = size;
        if (this.mAvailablePrimaryConnection != null) {
            connectionPoolBusyInfo.availableConnections = size + 1;
        }
        return connectionPoolBusyInfo;
    }

    private static int getPriority(int i) {
        return (i & 4) != 0 ? 1 : 0;
    }

    private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean z, int i) {
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        if (connectionWaiter == null) {
            return false;
        }
        int priority = getPriority(i);
        while (priority <= connectionWaiter.mPriority) {
            if (z || !connectionWaiter.mWantPrimaryConnection) {
                return true;
            }
            connectionWaiter = connectionWaiter.mNext;
            if (connectionWaiter == null) {
                return false;
            }
        }
        return false;
    }

    private void logConnectionPoolBusy(ConnectionPoolBusyInfo connectionPoolBusyInfo, long j, int i) {
        StringBuilder sb = new StringBuilder();
        if (j != 0) {
            Thread currentThread = Thread.currentThread();
            sb.append("The connection pool for database '");
            sb.append(connectionPoolBusyInfo.label);
            sb.append("' has been unable to grant a connection to thread ");
            sb.append(currentThread.getId());
            sb.append(" (");
            sb.append(currentThread.getName());
            sb.append(") ");
            sb.append("with flags 0x");
            sb.append(Integer.toHexString(i));
            sb.append(" for ");
            sb.append(((float) j) * 0.001f);
            sb.append(" seconds.\n");
        }
        sb.append("Connections: ");
        sb.append(connectionPoolBusyInfo.activeConnections);
        sb.append(" active, ");
        sb.append(connectionPoolBusyInfo.idleConnections);
        sb.append(" idle, ");
        sb.append(connectionPoolBusyInfo.availableConnections);
        sb.append(" available.\n");
        if (!connectionPoolBusyInfo.activeOperationDescriptions.isEmpty()) {
            sb.append("\nRequests in progress:\n");
            Iterator<String> it = connectionPoolBusyInfo.activeOperationDescriptions.iterator();
            while (it.hasNext()) {
                sb.append("  ");
                sb.append(it.next());
                sb.append("\n");
            }
        }
        Log.m164301w(TAG, sb.toString());
    }

    private void markAcquiredConnectionsLocked(AcquiredConnectionStatus acquiredConnectionStatus) {
        if (!this.mAcquiredConnections.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.mAcquiredConnections.size());
            for (Map.Entry next : this.mAcquiredConnections.entrySet()) {
                AcquiredConnectionStatus acquiredConnectionStatus2 = (AcquiredConnectionStatus) next.getValue();
                if (!(acquiredConnectionStatus == acquiredConnectionStatus2 || acquiredConnectionStatus2 == AcquiredConnectionStatus.DISCARD)) {
                    arrayList.add((SQLiteConnection) next.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mAcquiredConnections.put((SQLiteConnection) arrayList.get(i), acquiredConnectionStatus);
            }
        }
    }

    private ConnectionWaiter obtainConnectionWaiterLocked(Thread thread, long j, int i, boolean z, String str, int i2) {
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterPool;
        if (connectionWaiter != null) {
            this.mConnectionWaiterPool = connectionWaiter.mNext;
            connectionWaiter.mNext = null;
        } else {
            connectionWaiter = new ConnectionWaiter();
        }
        connectionWaiter.mThread = thread;
        connectionWaiter.mStartTime = j;
        connectionWaiter.mPriority = i;
        connectionWaiter.mWantPrimaryConnection = z;
        connectionWaiter.mSql = str;
        connectionWaiter.mConnectionFlags = i2;
        return connectionWaiter;
    }

    public static SQLiteConnectionPool open(SQLiteDatabase sQLiteDatabase, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        return open(sQLiteDatabase, sQLiteDatabaseConfiguration, bArr, sQLiteCipherSpec, 1);
    }

    private SQLiteConnection openConnectionLocked(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z) {
        int i = this.mNextConnectionId;
        this.mNextConnectionId = i + 1;
        return SQLiteConnection.open(this, sQLiteDatabaseConfiguration, i, z, this.mPassword, this.mCipher);
    }

    private void reconfigureAllConnectionsLocked() {
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException e) {
                Log.m164294e(TAG, "Failed to reconfigure available primary connection, closing it: " + this.mAvailablePrimaryConnection, e);
                closeConnectionAndLogExceptionsLocked(this.mAvailablePrimaryConnection);
                this.mAvailablePrimaryConnection = null;
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection2 = this.mAvailableNonPrimaryConnections.get(i);
            try {
                sQLiteConnection2.reconfigure(this.mConfiguration);
            } catch (RuntimeException e2) {
                Log.m164294e(TAG, "Failed to reconfigure available non-primary connection, closing it: " + sQLiteConnection2, e2);
                closeConnectionAndLogExceptionsLocked(sQLiteConnection2);
                this.mAvailableNonPrimaryConnections.remove(i);
                size += -1;
                i--;
            }
            i++;
        }
        markAcquiredConnectionsLocked(AcquiredConnectionStatus.RECONFIGURE);
    }

    private boolean recycleConnectionLocked(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
        if (acquiredConnectionStatus == AcquiredConnectionStatus.RECONFIGURE) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException e) {
                Log.m164294e(TAG, "Failed to reconfigure released connection, closing it: " + sQLiteConnection, e);
                acquiredConnectionStatus = AcquiredConnectionStatus.DISCARD;
            }
        }
        if (acquiredConnectionStatus != AcquiredConnectionStatus.DISCARD) {
            return true;
        }
        closeConnectionAndLogExceptionsLocked(sQLiteConnection);
        return false;
    }

    private void recycleConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
        connectionWaiter.mNext = this.mConnectionWaiterPool;
        connectionWaiter.mThread = null;
        connectionWaiter.mSql = null;
        connectionWaiter.mAssignedConnection = null;
        connectionWaiter.mException = null;
        connectionWaiter.mNonce++;
        this.mConnectionWaiterPool = connectionWaiter;
    }

    private void setMaxConnectionPoolSizeLocked(int i) {
        if (i <= 0) {
            i = (this.mConfiguration.openFlags & 536870912) != 0 ? 4 : 1;
        }
        this.mMaxConnectionPoolSize = i;
        Log.m164298i(TAG, "Max connection pool size is %d.", Integer.valueOf(i));
    }

    private void throwIfClosedLocked() {
        if (!this.mIsOpen) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    private SQLiteConnection tryAcquireNonPrimaryConnectionLocked(String str, int i) {
        int size = this.mAvailableNonPrimaryConnections.size();
        if (size > 1 && str != null) {
            for (int i2 = 0; i2 < size; i2++) {
                SQLiteConnection sQLiteConnection = this.mAvailableNonPrimaryConnections.get(i2);
                if (sQLiteConnection.isPreparedStatementInCache(str)) {
                    this.mAvailableNonPrimaryConnections.remove(i2);
                    finishAcquireConnectionLocked(sQLiteConnection, i);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection remove = this.mAvailableNonPrimaryConnections.remove(size - 1);
            finishAcquireConnectionLocked(remove, i);
            return remove;
        }
        int size2 = this.mAcquiredConnections.size();
        if (this.mAvailablePrimaryConnection != null) {
            size2++;
        }
        if (size2 >= this.mMaxConnectionPoolSize) {
            return null;
        }
        SQLiteConnection openConnectionLocked = openConnectionLocked(this.mConfiguration, false);
        finishAcquireConnectionLocked(openConnectionLocked, i);
        return openConnectionLocked;
    }

    private SQLiteConnection tryAcquirePrimaryConnectionLocked(int i) {
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            this.mAvailablePrimaryConnection = null;
            finishAcquireConnectionLocked(sQLiteConnection, i);
            return sQLiteConnection;
        }
        for (SQLiteConnection isPrimaryConnection : this.mAcquiredConnections.keySet()) {
            if (isPrimaryConnection.isPrimaryConnection()) {
                return null;
            }
        }
        SQLiteConnection openConnectionLocked = openConnectionLocked(this.mConfiguration, true);
        finishAcquireConnectionLocked(openConnectionLocked, i);
        return openConnectionLocked;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: com.tencent.wcdb.support.CancellationSignal$OnCancelListener} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.tencent.wcdb.support.CancellationSignal$OnCancelListener} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: com.tencent.wcdb.support.CancellationSignal$OnCancelListener} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.tencent.wcdb.support.CancellationSignal$OnCancelListener} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.tencent.wcdb.database.SQLiteConnectionPool$ConnectionPoolBusyInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.tencent.wcdb.support.CancellationSignal$OnCancelListener} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: com.tencent.wcdb.database.SQLiteConnectionPool$ConnectionPoolBusyInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: com.tencent.wcdb.support.CancellationSignal$OnCancelListener} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: com.tencent.wcdb.support.CancellationSignal$OnCancelListener} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: com.tencent.wcdb.database.SQLiteConnectionPool$ConnectionPoolBusyInfo} */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        if (r10 == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        r10.setOnCancelListener(new com.tencent.wcdb.database.SQLiteConnectionPool.C1164941(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2 = r1.mStartTime + CONNECTION_POOL_BUSY_MILLIS;
        r6 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r9.mConnectionLeaked.compareAndSet(true, false) == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007e, code lost:
        r8 = r9.mLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        wakeConnectionWaitersLocked();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0084, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0089, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r6 * com.tencent.tav.coremedia.TimeUtil.SECOND_TO_US);
        java.lang.Thread.interrupted();
        r6 = r9.mLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0096, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0097, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        throwIfClosedLocked();
        r7 = r1.mAssignedConnection;
        r8 = r1.mException;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009e, code lost:
        if (r7 != null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a0, code lost:
        if (r8 == null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a3, code lost:
        r7 = android.os.SystemClock.uptimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a9, code lost:
        if (r7 >= r2) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ab, code lost:
        r22 = r2;
        r24 = r7 - r2;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b3, code lost:
        r2 = gatherConnectionPoolBusyInfoLocked();
        r24 = 3000;
        r22 = r7 + CONNECTION_POOL_BUSY_MILLIS;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bd, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00be, code lost:
        if (r2 == 0) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r6 = r7 - r1.mStartTime;
        logConnectionPoolBusy(r2, r6, r0);
        r14 = r9.mDB.get();
        r13 = r9.mTraceCallback;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d2, code lost:
        if (r14 == null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d4, code lost:
        if (r13 == null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00da, code lost:
        r8 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r13.onConnectionPoolBusy(r14, r28, r6, r21, r2.activeSql, r2.activeTransactions);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ea, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ec, code lost:
        r8 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ed, code lost:
        r15 = r8;
        r2 = r22;
        r6 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f3, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f4, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        recycleConnectionWaiterLocked(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f7, code lost:
        if (r7 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f9, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00fa, code lost:
        if (r10 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00fc, code lost:
        r10.setOnCancelListener(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00ff, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0100, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0101, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0102, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0103, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0105, code lost:
        r0 = th;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0107, code lost:
        r0 = th;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0109, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x010a, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x010b, code lost:
        if (r10 != null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x010d, code lost:
        r10.setOnCancelListener(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0110, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.wcdb.database.SQLiteConnection waitForConnection(java.lang.String r28, int r29, com.tencent.wcdb.support.CancellationSignal r30) {
        /*
            r27 = this;
            r9 = r27
            r0 = r29
            r10 = r30
            r1 = r0 & 2
            r11 = 1
            r12 = 0
            if (r1 == 0) goto L_0x000f
            r21 = 1
            goto L_0x0011
        L_0x000f:
            r21 = 0
        L_0x0011:
            java.lang.Object r13 = r9.mLock
            monitor-enter(r13)
            r27.throwIfClosedLocked()     // Catch:{ all -> 0x0111 }
            if (r10 == 0) goto L_0x001c
            r30.throwIfCanceled()     // Catch:{ all -> 0x0111 }
        L_0x001c:
            r15 = 0
            if (r21 != 0) goto L_0x0024
            com.tencent.wcdb.database.SQLiteConnection r1 = r27.tryAcquireNonPrimaryConnectionLocked(r28, r29)     // Catch:{ all -> 0x0111 }
            goto L_0x0025
        L_0x0024:
            r1 = r15
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            com.tencent.wcdb.database.SQLiteConnection r1 = r9.tryAcquirePrimaryConnectionLocked(r0)     // Catch:{ all -> 0x0111 }
        L_0x002b:
            if (r1 == 0) goto L_0x002f
            monitor-exit(r13)     // Catch:{ all -> 0x0111 }
            return r1
        L_0x002f:
            int r14 = getPriority(r29)     // Catch:{ all -> 0x0111 }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0111 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0111 }
            r1 = r27
            r5 = r14
            r6 = r21
            r7 = r28
            r8 = r29
            com.tencent.wcdb.database.SQLiteConnectionPool$ConnectionWaiter r1 = r1.obtainConnectionWaiterLocked(r2, r3, r5, r6, r7, r8)     // Catch:{ all -> 0x0111 }
            com.tencent.wcdb.database.SQLiteConnectionPool$ConnectionWaiter r2 = r9.mConnectionWaiterQueue     // Catch:{ all -> 0x0111 }
            r3 = r15
        L_0x004b:
            if (r2 == 0) goto L_0x005c
            int r4 = r2.mPriority     // Catch:{ all -> 0x0111 }
            if (r14 <= r4) goto L_0x0054
            r1.mNext = r2     // Catch:{ all -> 0x0111 }
            goto L_0x005c
        L_0x0054:
            com.tencent.wcdb.database.SQLiteConnectionPool$ConnectionWaiter r3 = r2.mNext     // Catch:{ all -> 0x0111 }
            r26 = r3
            r3 = r2
            r2 = r26
            goto L_0x004b
        L_0x005c:
            if (r3 == 0) goto L_0x0061
            r3.mNext = r1     // Catch:{ all -> 0x0111 }
            goto L_0x0063
        L_0x0061:
            r9.mConnectionWaiterQueue = r1     // Catch:{ all -> 0x0111 }
        L_0x0063:
            int r2 = r1.mNonce     // Catch:{ all -> 0x0111 }
            monitor-exit(r13)     // Catch:{ all -> 0x0111 }
            if (r10 == 0) goto L_0x0070
            com.tencent.wcdb.database.SQLiteConnectionPool$1 r3 = new com.tencent.wcdb.database.SQLiteConnectionPool$1
            r3.<init>(r1, r2)
            r10.setOnCancelListener(r3)
        L_0x0070:
            long r2 = r1.mStartTime     // Catch:{ all -> 0x0109 }
            r4 = 3000(0xbb8, double:1.482E-320)
            long r2 = r2 + r4
            r6 = r4
        L_0x0076:
            java.util.concurrent.atomic.AtomicBoolean r8 = r9.mConnectionLeaked     // Catch:{ all -> 0x0109 }
            boolean r8 = r8.compareAndSet(r11, r12)     // Catch:{ all -> 0x0109 }
            if (r8 == 0) goto L_0x0089
            java.lang.Object r8 = r9.mLock     // Catch:{ all -> 0x0109 }
            monitor-enter(r8)     // Catch:{ all -> 0x0109 }
            r27.wakeConnectionWaitersLocked()     // Catch:{ all -> 0x0086 }
            monitor-exit(r8)     // Catch:{ all -> 0x0086 }
            goto L_0x0089
        L_0x0086:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x0089:
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r13
            java.util.concurrent.locks.LockSupport.parkNanos(r6)     // Catch:{ all -> 0x0109 }
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0109 }
            java.lang.Object r6 = r9.mLock     // Catch:{ all -> 0x0109 }
            monitor-enter(r6)     // Catch:{ all -> 0x0109 }
            r27.throwIfClosedLocked()     // Catch:{ all -> 0x0101 }
            com.tencent.wcdb.database.SQLiteConnection r7 = r1.mAssignedConnection     // Catch:{ all -> 0x0101 }
            java.lang.RuntimeException r8 = r1.mException     // Catch:{ all -> 0x0101 }
            if (r7 != 0) goto L_0x00f3
            if (r8 == 0) goto L_0x00a3
            goto L_0x00f3
        L_0x00a3:
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0101 }
            int r13 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r13 >= 0) goto L_0x00b3
            long r13 = r7 - r2
            r22 = r2
            r24 = r13
            r2 = r15
            goto L_0x00bd
        L_0x00b3:
            com.tencent.wcdb.database.SQLiteConnectionPool$ConnectionPoolBusyInfo r2 = r27.gatherConnectionPoolBusyInfoLocked()     // Catch:{ all -> 0x0101 }
            long r13 = r7 + r4
            r24 = r4
            r22 = r13
        L_0x00bd:
            monitor-exit(r6)     // Catch:{ all -> 0x0101 }
            if (r2 == 0) goto L_0x00ec
            long r13 = r1.mStartTime     // Catch:{ all -> 0x0109 }
            long r6 = r7 - r13
            r9.logConnectionPoolBusy(r2, r6, r0)     // Catch:{ all -> 0x0109 }
            java.lang.ref.WeakReference<com.tencent.wcdb.database.SQLiteDatabase> r3 = r9.mDB     // Catch:{ all -> 0x0109 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0109 }
            r14 = r3
            com.tencent.wcdb.database.SQLiteDatabase r14 = (com.tencent.wcdb.database.SQLiteDatabase) r14     // Catch:{ all -> 0x0109 }
            com.tencent.wcdb.database.SQLiteTrace r13 = r9.mTraceCallback     // Catch:{ all -> 0x0109 }
            if (r14 == 0) goto L_0x00ec
            if (r13 == 0) goto L_0x00ec
            java.util.ArrayList<com.tencent.wcdb.database.SQLiteTrace$TraceInfo<java.lang.String>> r3 = r2.activeSql     // Catch:{ all -> 0x0109 }
            java.util.ArrayList<com.tencent.wcdb.database.SQLiteTrace$TraceInfo<java.lang.StackTraceElement[]>> r2 = r2.activeTransactions     // Catch:{ all -> 0x0109 }
            r8 = r15
            r15 = r28
            r16 = r6
            r18 = r21
            r19 = r3
            r20 = r2
            r13.onConnectionPoolBusy(r14, r15, r16, r18, r19, r20)     // Catch:{ all -> 0x00e9 }
            goto L_0x00ed
        L_0x00e9:
            r0 = move-exception
            r2 = r8
            goto L_0x010b
        L_0x00ec:
            r8 = r15
        L_0x00ed:
            r15 = r8
            r2 = r22
            r6 = r24
            goto L_0x0076
        L_0x00f3:
            r2 = r15
            r9.recycleConnectionWaiterLocked(r1)     // Catch:{ all -> 0x0107 }
            if (r7 == 0) goto L_0x0100
            monitor-exit(r6)     // Catch:{ all -> 0x0107 }
            if (r10 == 0) goto L_0x00ff
            r10.setOnCancelListener(r2)
        L_0x00ff:
            return r7
        L_0x0100:
            throw r8     // Catch:{ all -> 0x0107 }
        L_0x0101:
            r0 = move-exception
            r2 = r15
        L_0x0103:
            monitor-exit(r6)     // Catch:{ all -> 0x0107 }
            throw r0     // Catch:{ all -> 0x0105 }
        L_0x0105:
            r0 = move-exception
            goto L_0x010b
        L_0x0107:
            r0 = move-exception
            goto L_0x0103
        L_0x0109:
            r0 = move-exception
            r2 = r15
        L_0x010b:
            if (r10 == 0) goto L_0x0110
            r10.setOnCancelListener(r2)
        L_0x0110:
            throw r0
        L_0x0111:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0111 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnectionPool.waitForConnection(java.lang.String, int, com.tencent.wcdb.support.CancellationSignal):com.tencent.wcdb.database.SQLiteConnection");
    }

    private void wakeConnectionWaitersLocked() {
        SQLiteConnection sQLiteConnection;
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        ConnectionWaiter connectionWaiter2 = null;
        boolean z = false;
        boolean z2 = false;
        while (connectionWaiter != null) {
            boolean z3 = true;
            if (this.mIsOpen) {
                try {
                    if (connectionWaiter.mWantPrimaryConnection || z) {
                        sQLiteConnection = null;
                    } else {
                        sQLiteConnection = tryAcquireNonPrimaryConnectionLocked(connectionWaiter.mSql, connectionWaiter.mConnectionFlags);
                        if (sQLiteConnection == null) {
                            z = true;
                        }
                    }
                    if (sQLiteConnection == null && !z2 && (sQLiteConnection = tryAcquirePrimaryConnectionLocked(connectionWaiter.mConnectionFlags)) == null) {
                        z2 = true;
                    }
                    if (sQLiteConnection != null) {
                        connectionWaiter.mAssignedConnection = sQLiteConnection;
                    } else if (!z || !z2) {
                        z3 = false;
                    } else {
                        return;
                    }
                } catch (RuntimeException e) {
                    connectionWaiter.mException = e;
                }
            }
            ConnectionWaiter connectionWaiter3 = connectionWaiter.mNext;
            if (z3) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.mNext = connectionWaiter3;
                } else {
                    this.mConnectionWaiterQueue = connectionWaiter3;
                }
                connectionWaiter.mNext = null;
                LockSupport.unpark(connectionWaiter.mThread);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    public SQLiteConnection acquireConnection(String str, int i, CancellationSignal cancellationSignal) {
        long uptimeMillis = SystemClock.uptimeMillis();
        SQLiteConnection waitForConnection = waitForConnection(str, i, cancellationSignal);
        SQLiteTrace sQLiteTrace = this.mTraceCallback;
        if (sQLiteTrace != null) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            SQLiteDatabase sQLiteDatabase = this.mDB.get();
            if (sQLiteDatabase != null) {
                sQLiteTrace.onConnectionObtained(sQLiteDatabase, str, uptimeMillis2, (i & 2) != 0);
            }
        }
        return waitForConnection;
    }

    public void close() {
        dispose(false);
    }

    public void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
            if (sQLiteConnection != null) {
                sQLiteConnection.collectDbStats(arrayList);
            }
            Iterator<SQLiteConnection> it = this.mAvailableNonPrimaryConnections.iterator();
            while (it.hasNext()) {
                it.next().collectDbStats(arrayList);
            }
            for (SQLiteConnection collectDbStatsUnsafe : this.mAcquiredConnections.keySet()) {
                collectDbStatsUnsafe.collectDbStatsUnsafe(arrayList);
            }
        }
    }

    public void dump(Printer printer, boolean z) {
        Printer create = PrefixPrinter.create(printer, "    ");
        synchronized (this.mLock) {
            printer.println("Connection pool for " + this.mConfiguration.path + XVFSFile.PATH_SEPARATOR);
            StringBuilder sb = new StringBuilder();
            sb.append("  Open: ");
            sb.append(this.mIsOpen);
            printer.println(sb.toString());
            printer.println("  Max connections: " + this.mMaxConnectionPoolSize);
            printer.println("  Available primary connection:");
            SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
            if (sQLiteConnection != null) {
                sQLiteConnection.dump(create, z);
            } else {
                create.println("<none>");
            }
            printer.println("  Available non-primary connections:");
            int i = 0;
            if (!this.mAvailableNonPrimaryConnections.isEmpty()) {
                int size = this.mAvailableNonPrimaryConnections.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.mAvailableNonPrimaryConnections.get(i2).dump(create, z);
                }
            } else {
                create.println("<none>");
            }
            printer.println("  Acquired connections:");
            if (!this.mAcquiredConnections.isEmpty()) {
                for (Map.Entry next : this.mAcquiredConnections.entrySet()) {
                    ((SQLiteConnection) next.getKey()).dump(create, z);
                    create.println("  Status: " + next.getValue());
                }
            } else {
                create.println("<none>");
            }
            printer.println("  Connection waiters:");
            if (this.mConnectionWaiterQueue != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
                while (connectionWaiter != null) {
                    create.println(i + ": waited for " + (uptimeMillis - connectionWaiter.mStartTime) + " ms - thread=" + connectionWaiter.mThread + ", priority=" + connectionWaiter.mPriority + ", sql='" + connectionWaiter.mSql + "'");
                    connectionWaiter = connectionWaiter.mNext;
                    i++;
                }
            } else {
                create.println("<none>");
            }
        }
    }

    public JSONObject dumpJSON(boolean z) {
        JSONObject put;
        synchronized (this.mLock) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONObject put2 = new JSONObject().put("path", this.mConfiguration.path).put(WeChatBrands.Business.GROUP_OPEN, this.mIsOpen).put("maxConn", this.mMaxConnectionPoolSize);
            SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
            put = put2.put("availablePrimary", (Object) null).put("availableNonPrimary", jSONArray).put("acquired", jSONArray2).put("waiters", jSONArray3);
            Iterator<SQLiteConnection> it = this.mAvailableNonPrimaryConnections.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().dumpJSON(z));
            }
            for (Map.Entry next : this.mAcquiredConnections.entrySet()) {
                jSONArray2.put(((SQLiteConnection) next.getKey()).dumpJSON(z).put("status", ((AcquiredConnectionStatus) next.getValue()).toString()));
            }
            for (ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue; connectionWaiter != null; connectionWaiter = connectionWaiter.mNext) {
                jSONArray3.put(new JSONObject().put("duration", SystemClock.uptimeMillis() - connectionWaiter.mStartTime).put("thread", connectionWaiter.mThread.toString()).put(DownloadInfo.PRIORITY, connectionWaiter.mPriority).put("sql", connectionWaiter.mSql));
            }
        }
        return put;
    }

    public void finalize() {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public SQLiteChangeListener getChangeListener() {
        return this.mChangeListener;
    }

    public SQLiteCheckpointListener getCheckpointListener() {
        return this.mCheckpointListener;
    }

    public SQLiteTrace getTraceCallback() {
        return this.mTraceCallback;
    }

    public void notifyChanges(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        SQLiteDatabase sQLiteDatabase = this.mDB.get();
        SQLiteChangeListener sQLiteChangeListener = this.mChangeListener;
        if (sQLiteChangeListener != null && sQLiteDatabase != null) {
            sQLiteChangeListener.onChange(sQLiteDatabase, str, str2, jArr, jArr2, jArr3);
        }
    }

    public void notifyCheckpoint(String str, int i) {
        SQLiteDatabase sQLiteDatabase = this.mDB.get();
        SQLiteCheckpointListener sQLiteCheckpointListener = this.mCheckpointListener;
        if (sQLiteCheckpointListener != null && sQLiteDatabase != null) {
            sQLiteCheckpointListener.onWALCommit(sQLiteDatabase, str, i);
        }
    }

    public void onConnectionLeaked() {
        Log.m164301w(TAG, "A SQLiteConnection object for database '" + this.mConfiguration.label + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
        this.mConnectionLeaked.set(true);
    }

    public void reconfigure(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration != null) {
            synchronized (this.mLock) {
                throwIfClosedLocked();
                boolean z = ((sQLiteDatabaseConfiguration.openFlags ^ this.mConfiguration.openFlags) & 536870912) != 0;
                if (z) {
                    if (this.mAcquiredConnections.isEmpty()) {
                        closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
                    } else {
                        throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                }
                if (sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != this.mConfiguration.foreignKeyConstraintsEnabled) {
                    if (!this.mAcquiredConnections.isEmpty()) {
                        throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfiguration;
                if (((sQLiteDatabaseConfiguration2.openFlags ^ sQLiteDatabaseConfiguration.openFlags) & OPEN_FLAG_REOPEN_MASK) == 0 && DatabaseUtils.objectEquals(sQLiteDatabaseConfiguration2.vfsName, sQLiteDatabaseConfiguration.vfsName)) {
                    if (sQLiteDatabaseConfiguration.extensions.containsAll(this.mConfiguration.extensions)) {
                        this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                        setMaxConnectionPoolSizeLocked(0);
                        closeExcessConnectionsAndLogExceptionsLocked();
                        reconfigureAllConnectionsLocked();
                        wakeConnectionWaitersLocked();
                    }
                }
                if (z) {
                    closeAvailableConnectionsAndLogExceptionsLocked();
                }
                SQLiteConnection openConnectionLocked = openConnectionLocked(sQLiteDatabaseConfiguration, true);
                closeAvailableConnectionsAndLogExceptionsLocked();
                discardAcquiredConnectionsLocked();
                this.mAvailablePrimaryConnection = openConnectionLocked;
                this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                setMaxConnectionPoolSizeLocked(0);
                wakeConnectionWaitersLocked();
            }
            return;
        }
        throw new IllegalArgumentException("configuration must not be null.");
    }

    public void releaseConnection(SQLiteConnection sQLiteConnection) {
        synchronized (this.mLock) {
            AcquiredConnectionStatus remove = this.mAcquiredConnections.remove(sQLiteConnection);
            if (remove == null) {
                throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            } else if (!this.mIsOpen) {
                closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            } else if (sQLiteConnection.isPrimaryConnection()) {
                if (recycleConnectionLocked(sQLiteConnection, remove)) {
                    this.mAvailablePrimaryConnection = sQLiteConnection;
                }
                wakeConnectionWaitersLocked();
            } else if (this.mAvailableNonPrimaryConnections.size() >= this.mMaxConnectionPoolSize - 1) {
                closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            } else {
                if (recycleConnectionLocked(sQLiteConnection, remove)) {
                    this.mAvailableNonPrimaryConnections.add(sQLiteConnection);
                }
                wakeConnectionWaitersLocked();
            }
        }
    }

    public void setChangeListener(SQLiteChangeListener sQLiteChangeListener, boolean z) {
        boolean z2 = sQLiteChangeListener != null;
        if (!z2) {
            z = false;
        }
        synchronized (this.mLock) {
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
            if (!(sQLiteDatabaseConfiguration.updateNotificationEnabled == z2 && sQLiteDatabaseConfiguration.updateNotificationRowID == z)) {
                sQLiteDatabaseConfiguration.updateNotificationEnabled = z2;
                sQLiteDatabaseConfiguration.updateNotificationRowID = z;
                closeExcessConnectionsAndLogExceptionsLocked();
                reconfigureAllConnectionsLocked();
            }
            this.mChangeListener = sQLiteChangeListener;
        }
    }

    public void setCheckpointListener(SQLiteCheckpointListener sQLiteCheckpointListener) {
        SQLiteDatabase sQLiteDatabase = this.mDB.get();
        if (this.mCheckpointListener != null) {
            this.mCheckpointListener.onDetach(sQLiteDatabase);
        }
        this.mCheckpointListener = sQLiteCheckpointListener;
        if (this.mCheckpointListener != null) {
            this.mCheckpointListener.onAttach(sQLiteDatabase);
        }
    }

    public void setTraceCallback(SQLiteTrace sQLiteTrace) {
        this.mTraceCallback = sQLiteTrace;
    }

    public boolean shouldYieldConnection(SQLiteConnection sQLiteConnection, int i) {
        synchronized (this.mLock) {
            if (!this.mAcquiredConnections.containsKey(sQLiteConnection)) {
                throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            } else if (!this.mIsOpen) {
                return false;
            } else {
                boolean isSessionBlockingImportantConnectionWaitersLocked = isSessionBlockingImportantConnectionWaitersLocked(sQLiteConnection.isPrimaryConnection(), i);
                return isSessionBlockingImportantConnectionWaitersLocked;
            }
        }
    }

    public String toString() {
        return "SQLiteConnectionPool: " + this.mConfiguration.path;
    }

    public void traceExecute(String str, int i, long j) {
        SQLiteDatabase sQLiteDatabase = this.mDB.get();
        SQLiteTrace sQLiteTrace = this.mTraceCallback;
        if (sQLiteTrace != null && sQLiteDatabase != null && str != null) {
            sQLiteTrace.onSQLExecuted(sQLiteDatabase, str, i, j);
        }
    }

    public static SQLiteConnectionPool open(SQLiteDatabase sQLiteDatabase, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i) {
        SQLiteCipherSpec sQLiteCipherSpec2;
        if (sQLiteDatabaseConfiguration != null) {
            SQLiteConnectionPool sQLiteConnectionPool = new SQLiteConnectionPool(sQLiteDatabase, sQLiteDatabaseConfiguration, i);
            sQLiteConnectionPool.mPassword = bArr;
            if (sQLiteCipherSpec == null) {
                sQLiteCipherSpec2 = null;
            } else {
                sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
            }
            sQLiteConnectionPool.mCipher = sQLiteCipherSpec2;
            sQLiteConnectionPool.open();
            return sQLiteConnectionPool;
        }
        throw new IllegalArgumentException("configuration must not be null.");
    }

    private void open() {
        this.mAvailablePrimaryConnection = openConnectionLocked(this.mConfiguration, true);
        this.mIsOpen = true;
    }
}
