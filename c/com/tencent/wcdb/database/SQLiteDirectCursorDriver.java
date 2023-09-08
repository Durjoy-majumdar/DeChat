package com.tencent.wcdb.database;

import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.CancellationSignal;

public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {
    private static SQLiteDatabase.CursorFactory DEFAULT_FACTORY = SQLiteCursor.FACTORY;
    private final CancellationSignal mCancellationSignal;
    private final SQLiteDatabase mDatabase;
    private final String mEditTable;
    private SQLiteProgram mQuery;
    private final String mSql;

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, CancellationSignal cancellationSignal) {
        this.mDatabase = sQLiteDatabase;
        this.mEditTable = str2;
        this.mSql = str;
        this.mCancellationSignal = cancellationSignal;
    }

    public void cursorClosed() {
    }

    public void cursorDeactivated() {
    }

    public void cursorRequeried(Cursor cursor) {
    }

    public Cursor query(SQLiteDatabase.CursorFactory cursorFactory, Object[] objArr) {
        if (cursorFactory == null) {
            cursorFactory = DEFAULT_FACTORY;
        }
        SQLiteClosable sQLiteClosable = null;
        try {
            SQLiteProgram newQuery = cursorFactory.newQuery(this.mDatabase, this.mSql, objArr, this.mCancellationSignal);
            Cursor newCursor = cursorFactory.newCursor(this.mDatabase, this, this.mEditTable, newQuery);
            this.mQuery = newQuery;
            return newCursor;
        } catch (RuntimeException e) {
            if (sQLiteClosable != null) {
                sQLiteClosable.close();
            }
            throw e;
        }
    }

    public void setBindArguments(String[] strArr) {
        this.mQuery.bindAllArgsAsStrings(strArr);
    }

    public String toString() {
        return "SQLiteDirectCursorDriver: " + this.mSql;
    }
}
