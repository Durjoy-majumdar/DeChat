package com.tencent.wcdb.database;

import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;

public class SQLiteDirectCursor extends AbstractCursor {
    public static final SQLiteDatabase.CursorFactory FACTORY = new SQLiteDatabase.CursorFactory() {
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram) {
            return new SQLiteDirectCursor(sQLiteCursorDriver, str, (SQLiteDirectQuery) sQLiteProgram);
        }

        public SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
            return new SQLiteDirectQuery(sQLiteDatabase, str, objArr, cancellationSignal);
        }
    };
    private static final String TAG = "WCDB.SQLiteDirectCursor";
    private final String[] mColumns;
    private int mCount;
    private boolean mCountFinished;
    private final SQLiteCursorDriver mDriver;
    private final SQLiteDirectQuery mQuery;

    public SQLiteDirectCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteDirectQuery sQLiteDirectQuery) {
        if (sQLiteDirectQuery != null) {
            this.mQuery = sQLiteDirectQuery;
            this.mDriver = sQLiteCursorDriver;
            this.mColumns = sQLiteDirectQuery.getColumnNames();
            this.mCount = -1;
            this.mCountFinished = false;
            return;
        }
        throw new IllegalArgumentException("query object cannot be null");
    }

    public void close() {
        super.close();
        this.mQuery.close();
        this.mDriver.cursorClosed();
    }

    public void deactivate() {
        super.deactivate();
        this.mDriver.cursorDeactivated();
    }

    public byte[] getBlob(int i) {
        return this.mQuery.getBlob(i);
    }

    public String[] getColumnNames() {
        return this.mColumns;
    }

    public int getCount() {
        if (!this.mCountFinished) {
            Log.m164301w(TAG, "Count query on SQLiteDirectCursor is slow. Iterate through the end to get count or use other implementations.");
            this.mCount = this.mPos + this.mQuery.step(Integer.MAX_VALUE) + 1;
            this.mCountFinished = true;
            this.mQuery.reset(false);
            this.mPos = this.mQuery.step(this.mPos + 1) - 1;
        }
        return this.mCount;
    }

    public double getDouble(int i) {
        return this.mQuery.getDouble(i);
    }

    public float getFloat(int i) {
        return (float) this.mQuery.getDouble(i);
    }

    public int getInt(int i) {
        return (int) this.mQuery.getLong(i);
    }

    public long getLong(int i) {
        return this.mQuery.getLong(i);
    }

    public short getShort(int i) {
        return (short) ((int) this.mQuery.getLong(i));
    }

    public String getString(int i) {
        return this.mQuery.getString(i);
    }

    public int getType(int i) {
        return this.mQuery.getType(i);
    }

    public boolean isNull(int i) {
        return getType(i) == 0;
    }

    public boolean moveToPosition(int i) {
        int i2;
        int i3;
        if (i < 0) {
            this.mQuery.reset(false);
            this.mPos = -1;
            return false;
        } else if (!this.mCountFinished || i < (i3 = this.mCount)) {
            int i4 = this.mPos;
            if (i < i4) {
                Log.m164301w(TAG, "Moving backward on SQLiteDirectCursor is slow. Get rid of backward movement or use other implementations.");
                this.mQuery.reset(false);
                i2 = this.mQuery.step(i + 1) - 1;
            } else if (i == i4) {
                return true;
            } else {
                i2 = i4 + this.mQuery.step(i - i4);
            }
            if (i2 < i) {
                int i5 = i2 + 1;
                this.mCount = i5;
                this.mCountFinished = true;
                this.mPos = i5;
            } else {
                this.mPos = i2;
                if (i2 >= this.mCount) {
                    this.mCount = i2 + 1;
                    this.mCountFinished = false;
                }
            }
            return this.mPos < this.mCount;
        } else {
            this.mPos = i3;
            return false;
        }
    }

    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            if (!this.mQuery.getDatabase().isOpen()) {
                return false;
            }
            this.mPos = -1;
            this.mCountFinished = false;
            this.mCount = -1;
            this.mDriver.cursorRequeried(this);
            this.mQuery.reset(false);
            try {
                return super.requery();
            } catch (IllegalStateException e) {
                Log.m164302w(TAG, "requery() failed " + e.getMessage(), e);
                return false;
            }
        }
    }
}
