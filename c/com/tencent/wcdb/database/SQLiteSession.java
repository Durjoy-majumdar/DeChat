package com.tencent.wcdb.database;

import android.database.sqlite.SQLiteTransactionListener;
import android.util.Pair;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.support.CancellationSignal;

public final class SQLiteSession {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int TRANSACTION_MODE_DEFERRED = 0;
    public static final int TRANSACTION_MODE_EXCLUSIVE = 2;
    public static final int TRANSACTION_MODE_IMMEDIATE = 1;
    private SQLiteConnection mConnection;
    private int mConnectionFlags;
    private final SQLiteConnectionPool mConnectionPool;
    private int mConnectionUseCount;
    private Transaction mTransactionPool;
    private Transaction mTransactionStack;

    public static final class Transaction {
        public boolean mChildFailed;
        public SQLiteTransactionListener mListener;
        public boolean mMarkedSuccessful;
        public int mMode;
        public Transaction mParent;

        private Transaction() {
        }
    }

    public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool != null) {
            this.mConnectionPool = sQLiteConnectionPool;
            return;
        }
        throw new IllegalArgumentException("connectionPool must not be null");
    }

    private void acquireConnection(String str, int i, boolean z, CancellationSignal cancellationSignal) {
        if (this.mConnection == null) {
            SQLiteConnection acquireConnection = this.mConnectionPool.acquireConnection(str, i, cancellationSignal);
            this.mConnection = acquireConnection;
            this.mConnectionFlags = i;
            acquireConnection.setAcquisitionState(true, z);
        }
        this.mConnectionUseCount++;
    }

    private void beginTransactionUnchecked(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (this.mTransactionStack == null) {
            acquireConnection((String) null, i2, true, cancellationSignal);
        }
        try {
            if (this.mTransactionStack == null) {
                if (i == 1) {
                    this.mConnection.execute("BEGIN IMMEDIATE;", (Object[]) null, cancellationSignal);
                } else if (i != 2) {
                    this.mConnection.execute("BEGIN;", (Object[]) null, cancellationSignal);
                } else {
                    this.mConnection.execute("BEGIN EXCLUSIVE;", (Object[]) null, cancellationSignal);
                }
            }
            if (sQLiteTransactionListener != null) {
                sQLiteTransactionListener.onBegin();
            }
            Transaction obtainTransaction = obtainTransaction(i, sQLiteTransactionListener);
            obtainTransaction.mParent = this.mTransactionStack;
            this.mTransactionStack = obtainTransaction;
        } catch (RuntimeException e) {
            if (this.mTransactionStack == null) {
                this.mConnection.execute("ROLLBACK;", (Object[]) null, cancellationSignal);
            }
            throw e;
        } catch (Throwable th) {
            if (this.mTransactionStack == null) {
                releaseConnection();
            }
            throw th;
        }
    }

    private void endTransactionUnchecked(CancellationSignal cancellationSignal, boolean z) {
        RuntimeException e;
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        Transaction transaction = this.mTransactionStack;
        boolean z2 = false;
        boolean z3 = (transaction.mMarkedSuccessful || z) && !transaction.mChildFailed;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        if (sQLiteTransactionListener != null) {
            if (z3) {
                try {
                    sQLiteTransactionListener.onCommit();
                } catch (RuntimeException e2) {
                    e = e2;
                }
            } else {
                sQLiteTransactionListener.onRollback();
            }
        }
        z2 = z3;
        e = null;
        this.mTransactionStack = transaction.mParent;
        recycleTransaction(transaction);
        Transaction transaction2 = this.mTransactionStack;
        if (transaction2 == null) {
            if (z2) {
                try {
                    this.mConnection.execute("COMMIT;", (Object[]) null, cancellationSignal);
                } catch (Throwable th) {
                    releaseConnection();
                    throw th;
                }
            } else {
                this.mConnection.execute("ROLLBACK;", (Object[]) null, cancellationSignal);
            }
            releaseConnection();
        } else if (!z2) {
            transaction2.mChildFailed = true;
        }
        if (e != null) {
            throw e;
        }
    }

    private boolean executeSpecial(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        int sqlStatementType = DatabaseUtils.getSqlStatementType(str);
        if (sqlStatementType == 4) {
            beginTransaction(2, (SQLiteTransactionListener) null, i, cancellationSignal);
            return true;
        } else if (sqlStatementType == 5) {
            setTransactionSuccessful();
            endTransaction(cancellationSignal);
            return true;
        } else if (sqlStatementType != 6) {
            return false;
        } else {
            endTransaction(cancellationSignal);
            return true;
        }
    }

    private Transaction obtainTransaction(int i, SQLiteTransactionListener sQLiteTransactionListener) {
        Transaction transaction = this.mTransactionPool;
        if (transaction != null) {
            this.mTransactionPool = transaction.mParent;
            transaction.mParent = null;
            transaction.mMarkedSuccessful = false;
            transaction.mChildFailed = false;
        } else {
            transaction = new Transaction();
        }
        transaction.mMode = i;
        transaction.mListener = sQLiteTransactionListener;
        return transaction;
    }

    private void recycleTransaction(Transaction transaction) {
        transaction.mParent = this.mTransactionPool;
        transaction.mListener = null;
        this.mTransactionPool = transaction;
    }

    private void releaseConnection() {
        int i = this.mConnectionUseCount - 1;
        this.mConnectionUseCount = i;
        if (i == 0) {
            try {
                this.mConnection.setAcquisitionState(false, false);
                this.mConnectionPool.releaseConnection(this.mConnection);
            } finally {
                this.mConnection = null;
            }
        }
    }

    private void throwIfNestedTransaction() {
        if (hasNestedTransaction()) {
            throw new IllegalStateException("Cannot perform this operation because a nested transaction is in progress.");
        }
    }

    private void throwIfNoTransaction() {
        if (this.mTransactionStack == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    private void throwIfTransactionMarkedSuccessful() {
        Transaction transaction = this.mTransactionStack;
        if (transaction != null && transaction.mMarkedSuccessful) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    private boolean yieldTransactionUnchecked(long j, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (!this.mConnectionPool.shouldYieldConnection(this.mConnection, this.mConnectionFlags)) {
            return false;
        }
        Transaction transaction = this.mTransactionStack;
        int i = transaction.mMode;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        int i2 = this.mConnectionFlags;
        endTransactionUnchecked(cancellationSignal, true);
        if (j > 0) {
            try {
                Thread.sleep(j);
            } catch (InterruptedException unused) {
            }
        }
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, cancellationSignal);
        return true;
    }

    public SQLiteConnection acquireConnectionForNativeHandle(int i) {
        acquireConnection((String) null, i, true, (CancellationSignal) null);
        return this.mConnection;
    }

    public SQLiteConnection.PreparedStatement acquirePreparedStatement(String str, int i, boolean z) {
        acquireConnection(str, i, z, (CancellationSignal) null);
        return this.mConnection.acquirePreparedStatement(str);
    }

    public void beginTransaction(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, CancellationSignal cancellationSignal) {
        throwIfTransactionMarkedSuccessful();
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, cancellationSignal);
    }

    public void endTransaction(CancellationSignal cancellationSignal) {
        throwIfNoTransaction();
        endTransactionUnchecked(cancellationSignal, false);
    }

    public void execute(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (!executeSpecial(str, objArr, i, cancellationSignal)) {
            acquireConnection(str, i, false, cancellationSignal);
            try {
                this.mConnection.execute(str, objArr, cancellationSignal);
            } finally {
                releaseConnection();
            }
        }
    }

    public int executeForChangedRowCount(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0;
        } else {
            acquireConnection(str, i, false, cancellationSignal);
            try {
                return this.mConnection.executeForChangedRowCount(str, objArr, cancellationSignal);
            } finally {
                releaseConnection();
            }
        }
    }

    public int executeForCursorWindow(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3, CancellationSignal cancellationSignal) {
        int i4 = i3;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (cursorWindow != null) {
            Object[] objArr2 = objArr;
            if (executeSpecial(str, objArr, i4, cancellationSignal2)) {
                cursorWindow.clear();
                return 0;
            }
            acquireConnection(str, i4, false, cancellationSignal2);
            try {
                return this.mConnection.executeForCursorWindow(str, objArr, cursorWindow, i, i2, z, cancellationSignal);
            } finally {
                releaseConnection();
            }
        } else {
            throw new IllegalArgumentException("window must not be null.");
        }
    }

    public long executeForLastInsertedRowId(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0;
        } else {
            acquireConnection(str, i, false, cancellationSignal);
            try {
                return this.mConnection.executeForLastInsertedRowId(str, objArr, cancellationSignal);
            } finally {
                releaseConnection();
            }
        }
    }

    public long executeForLong(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0;
        } else {
            acquireConnection(str, i, false, cancellationSignal);
            try {
                return this.mConnection.executeForLong(str, objArr, cancellationSignal);
            } finally {
                releaseConnection();
            }
        }
    }

    public String executeForString(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return null;
        } else {
            acquireConnection(str, i, false, cancellationSignal);
            try {
                return this.mConnection.executeForString(str, objArr, cancellationSignal);
            } finally {
                releaseConnection();
            }
        }
    }

    public boolean hasConnection() {
        return this.mConnection != null;
    }

    public boolean hasNestedTransaction() {
        Transaction transaction = this.mTransactionStack;
        return (transaction == null || transaction.mParent == null) ? false : true;
    }

    public boolean hasTransaction() {
        return this.mTransactionStack != null;
    }

    public void prepare(String str, int i, CancellationSignal cancellationSignal, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str != null) {
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            acquireConnection(str, i, false, cancellationSignal);
            try {
                this.mConnection.prepare(str, sQLiteStatementInfo);
            } finally {
                releaseConnection();
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public void releaseConnectionForNativeHandle(Exception exc) {
        try {
            SQLiteConnection sQLiteConnection = this.mConnection;
            if (sQLiteConnection != null) {
                sQLiteConnection.endNativeHandle(exc);
            }
        } finally {
            releaseConnection();
        }
    }

    public void releasePreparedStatement(SQLiteConnection.PreparedStatement preparedStatement) {
        SQLiteConnection sQLiteConnection = this.mConnection;
        if (sQLiteConnection != null) {
            sQLiteConnection.releasePreparedStatement(preparedStatement);
            releaseConnection();
        }
    }

    public void setTransactionSuccessful() {
        throwIfNoTransaction();
        throwIfTransactionMarkedSuccessful();
        this.mTransactionStack.mMarkedSuccessful = true;
    }

    public Pair<Integer, Integer> walCheckpoint(String str, int i) {
        acquireConnection((String) null, i, false, (CancellationSignal) null);
        try {
            return this.mConnection.walCheckpoint(str);
        } finally {
            releaseConnection();
        }
    }

    public boolean yieldTransaction(long j, boolean z, CancellationSignal cancellationSignal) {
        if (z) {
            throwIfNoTransaction();
            throwIfTransactionMarkedSuccessful();
            throwIfNestedTransaction();
        } else {
            Transaction transaction = this.mTransactionStack;
            if (transaction == null || transaction.mMarkedSuccessful || transaction.mParent != null) {
                return false;
            }
        }
        if (this.mTransactionStack.mChildFailed) {
            return false;
        }
        return yieldTransactionUnchecked(j, cancellationSignal);
    }
}
