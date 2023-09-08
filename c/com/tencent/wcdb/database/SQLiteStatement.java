package com.tencent.wcdb.database;

import com.tencent.wcdb.support.CancellationSignal;

public final class SQLiteStatement extends SQLiteProgram {
    public SQLiteStatement(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        super(sQLiteDatabase, str, objArr, (CancellationSignal) null);
    }

    public void execute() {
        execute((CancellationSignal) null);
    }

    public long executeInsert() {
        return executeInsert((CancellationSignal) null);
    }

    public int executeUpdateDelete() {
        return executeUpdateDelete((CancellationSignal) null);
    }

    public long simpleQueryForLong() {
        return simpleQueryForLong((CancellationSignal) null);
    }

    public String simpleQueryForString() {
        return simpleQueryForString((CancellationSignal) null);
    }

    public String toString() {
        return "SQLiteProgram: " + getSql();
    }

    public void execute(CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            getSession().execute(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
            releaseReference();
        } catch (SQLiteException e) {
            checkCorruption(e);
            throw e;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public long executeInsert(CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            long executeForLastInsertedRowId = getSession().executeForLastInsertedRowId(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
            releaseReference();
            return executeForLastInsertedRowId;
        } catch (SQLiteDatabaseCorruptException e) {
            checkCorruption(e);
            throw e;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public int executeUpdateDelete(CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            int executeForChangedRowCount = getSession().executeForChangedRowCount(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
            releaseReference();
            return executeForChangedRowCount;
        } catch (SQLiteDatabaseCorruptException e) {
            checkCorruption(e);
            throw e;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public long simpleQueryForLong(CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            long executeForLong = getSession().executeForLong(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
            releaseReference();
            return executeForLong;
        } catch (SQLiteDatabaseCorruptException e) {
            checkCorruption(e);
            throw e;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public String simpleQueryForString(CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            String executeForString = getSession().executeForString(getSql(), getBindArgs(), getConnectionFlags(), cancellationSignal);
            releaseReference();
            return executeForString;
        } catch (SQLiteDatabaseCorruptException e) {
            checkCorruption(e);
            throw e;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }
}
