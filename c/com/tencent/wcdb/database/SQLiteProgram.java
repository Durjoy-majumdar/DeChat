package com.tencent.wcdb.database;

import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.support.CancellationSignal;
import java.util.Arrays;

public abstract class SQLiteProgram extends SQLiteClosable {
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private static final String TAG = "WCDB.SQLiteProgram";
    private final Object[] mBindArgs;
    private SQLiteSession mBoundSession;
    private final String[] mColumnNames;
    private final SQLiteDatabase mDatabase;
    private final int mNumParameters;
    public SQLiteConnection.PreparedStatement mPreparedStatement;
    private final boolean mReadOnly;
    private final String mSql;

    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        this.mDatabase = sQLiteDatabase;
        String trim = str.trim();
        this.mSql = trim;
        int sqlStatementType = DatabaseUtils.getSqlStatementType(trim);
        if (sqlStatementType == 4 || sqlStatementType == 5 || sqlStatementType == 6) {
            this.mReadOnly = false;
            this.mColumnNames = EMPTY_STRING_ARRAY;
            this.mNumParameters = 0;
        } else {
            boolean z = true;
            boolean z2 = sqlStatementType == 1;
            SQLiteStatementInfo sQLiteStatementInfo = new SQLiteStatementInfo();
            sQLiteDatabase.getThreadSession().prepare(trim, sQLiteDatabase.getThreadDefaultConnectionFlags(z2), cancellationSignal, sQLiteStatementInfo);
            this.mReadOnly = (sqlStatementType == 8 || !sQLiteStatementInfo.readOnly) ? false : z;
            this.mColumnNames = sQLiteStatementInfo.columnNames;
            this.mNumParameters = sQLiteStatementInfo.numParameters;
        }
        if (objArr == null || objArr.length <= this.mNumParameters) {
            int i = this.mNumParameters;
            if (i != 0) {
                Object[] objArr2 = new Object[i];
                this.mBindArgs = objArr2;
                if (objArr != null) {
                    System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                }
            } else {
                this.mBindArgs = null;
            }
            this.mPreparedStatement = null;
            this.mBoundSession = null;
            return;
        }
        throw new IllegalArgumentException("Too many bind arguments.  " + objArr.length + " arguments were provided but the statement needs " + this.mNumParameters + " arguments.");
    }

    private void bind(int i, Object obj) {
        if (i < 1 || i > this.mNumParameters) {
            throw new IllegalArgumentException("Cannot bind argument at index " + i + " because the index is out of range.  The statement has " + this.mNumParameters + " parameters.");
        }
        this.mBindArgs[i - 1] = obj;
    }

    public synchronized boolean acquirePreparedStatement(boolean z) {
        SQLiteSession threadSession = this.mDatabase.getThreadSession();
        SQLiteSession sQLiteSession = this.mBoundSession;
        if (threadSession == sQLiteSession) {
            return false;
        }
        if (sQLiteSession == null) {
            SQLiteConnection.PreparedStatement acquirePreparedStatement = threadSession.acquirePreparedStatement(this.mSql, this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly), z);
            this.mPreparedStatement = acquirePreparedStatement;
            acquirePreparedStatement.bindArguments(this.mBindArgs);
            this.mBoundSession = threadSession;
            return true;
        }
        throw new IllegalStateException("SQLiteProgram has bound to another thread.");
    }

    public void bindAllArgs(Object[] objArr) {
        for (int length = objArr.length; length != 0; length--) {
            bind(length, objArr[length - 1]);
        }
    }

    public void bindAllArgsAsStrings(String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                bindString(length, strArr[length - 1]);
            }
        }
    }

    public void bindBlob(int i, byte[] bArr) {
        if (bArr != null) {
            bind(i, bArr);
            return;
        }
        throw new IllegalArgumentException("the bind value at index " + i + " is null");
    }

    public void bindDouble(int i, double d) {
        bind(i, Double.valueOf(d));
    }

    public void bindLong(int i, long j) {
        bind(i, Long.valueOf(j));
    }

    public void bindNull(int i) {
        bind(i, (Object) null);
    }

    public void bindString(int i, String str) {
        if (str != null) {
            bind(i, str);
            return;
        }
        throw new IllegalArgumentException("the bind value at index " + i + " is null");
    }

    public final void checkCorruption(SQLiteException sQLiteException) {
        boolean z = true;
        if (!(sQLiteException instanceof SQLiteDatabaseCorruptException) && (!(sQLiteException instanceof SQLiteFullException) || !this.mReadOnly)) {
            z = false;
        }
        if (z) {
            SQLiteDebug.collectLastIOTraceStats(this.mDatabase);
            SQLiteDebug.setLastCorruptionException(sQLiteException);
            this.mDatabase.onCorruption();
        }
    }

    public void clearBindings() {
        Object[] objArr = this.mBindArgs;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    public void finalize() {
        synchronized (this) {
            if (this.mBoundSession != null || this.mPreparedStatement != null) {
                throw new SQLiteMisuseException("Acquired prepared statement is not released.");
            }
        }
        super.finalize();
    }

    public final Object[] getBindArgs() {
        return this.mBindArgs;
    }

    public final String[] getColumnNames() {
        return this.mColumnNames;
    }

    public final int getConnectionFlags() {
        return this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly);
    }

    public final SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    public final SQLiteSession getSession() {
        return this.mDatabase.getThreadSession();
    }

    public final String getSql() {
        return this.mSql;
    }

    @Deprecated
    public final int getUniqueId() {
        return -1;
    }

    public void onAllReferencesReleased() {
        releasePreparedStatement();
        clearBindings();
    }

    public synchronized void releasePreparedStatement() {
        SQLiteSession sQLiteSession = this.mBoundSession;
        if (sQLiteSession != null || this.mPreparedStatement != null) {
            if (sQLiteSession != null) {
                if (this.mPreparedStatement != null) {
                    if (sQLiteSession == this.mDatabase.getThreadSession()) {
                        this.mBoundSession.releasePreparedStatement(this.mPreparedStatement);
                        this.mPreparedStatement = null;
                        this.mBoundSession = null;
                        return;
                    }
                    throw new IllegalStateException("SQLiteProgram has bound to another thread.");
                }
            }
            throw new IllegalStateException("Internal state error.");
        }
    }
}
