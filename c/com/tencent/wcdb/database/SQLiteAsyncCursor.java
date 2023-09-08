package com.tencent.wcdb.database;

import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.CursorIndexOutOfBoundsException;
import com.tencent.wcdb.StaleDataException;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.CancellationSignal;

public class SQLiteAsyncCursor extends AbstractCursor {
    public static final SQLiteDatabase.CursorFactory FACTORY = new SQLiteDatabase.CursorFactory() {
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram) {
            return new SQLiteAsyncCursor(sQLiteCursorDriver, str, (SQLiteAsyncQuery) sQLiteProgram);
        }

        public SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
            return new SQLiteAsyncQuery(sQLiteDatabase, str, objArr, cancellationSignal);
        }
    };
    private static final int MAX_KEEP_CHUNKS = 32;
    private static final int MAX_PREFETCH = 256;
    private static final int MIN_FETCH_ROWS = 32;
    private static final String TAG = "WCDB.SQLiteAsyncCursor";
    private final String[] mColumns;
    /* access modifiers changed from: private */
    public volatile int mCount;
    private long mCurrentRow;
    private final SQLiteCursorDriver mDriver;
    /* access modifiers changed from: private */
    public final SQLiteAsyncQuery mQuery;
    private QueryThread mQueryThread;
    /* access modifiers changed from: private */
    public final Object mWaitLock;
    /* access modifiers changed from: private */
    public ChunkedCursorWindow mWindow;

    public class QueryThread extends Thread {
        private int mFetchPos = 0;
        private int mMinPos = 0;
        private volatile int mRequestPos = 0;

        public QueryThread() {
            super("SQLiteAsyncCursor.QueryThread");
        }

        public void quit() {
            interrupt();
        }

        public void requestPos(int i) {
            synchronized (this) {
                this.mRequestPos = i;
                notifyAll();
            }
        }

        public void run() {
            int i;
            int i2;
            int fillRows;
            try {
                int count = SQLiteAsyncCursor.this.mQuery.getCount();
                synchronized (SQLiteAsyncCursor.this.mWaitLock) {
                    int unused = SQLiteAsyncCursor.this.mCount = count;
                    SQLiteAsyncCursor.this.mWaitLock.notifyAll();
                }
                while (!Thread.interrupted()) {
                    synchronized (this) {
                        while (this.mRequestPos + 256 <= this.mFetchPos && this.mRequestPos >= this.mMinPos) {
                            wait();
                        }
                        i = this.mRequestPos;
                        i2 = i + 256;
                    }
                    if (i < this.mMinPos) {
                        SQLiteAsyncCursor.this.mQuery.reset();
                        this.mFetchPos = 0;
                        SQLiteAsyncCursor.this.mWindow.clear();
                        this.mMinPos = 0;
                    }
                    if (this.mFetchPos < i2) {
                        if (SQLiteAsyncCursor.this.mWindow.getNumChunks() > 32) {
                            long removeChunk = SQLiteAsyncCursor.this.mWindow.removeChunk(this.mMinPos);
                            if (removeChunk != -1) {
                                this.mMinPos = (int) removeChunk;
                            }
                        }
                        synchronized (SQLiteAsyncCursor.this.mWaitLock) {
                            fillRows = SQLiteAsyncCursor.this.mQuery.fillRows(SQLiteAsyncCursor.this.mWindow, this.mFetchPos, 32);
                            int i3 = this.mFetchPos;
                            if (i3 <= i && i3 + fillRows > i) {
                                SQLiteAsyncCursor.this.mWaitLock.notifyAll();
                            }
                        }
                        this.mFetchPos += fillRows;
                    }
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                SQLiteAsyncCursor.this.mQuery.release();
                throw th;
            }
            SQLiteAsyncCursor.this.mQuery.release();
        }
    }

    public SQLiteAsyncCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteAsyncQuery sQLiteAsyncQuery) {
        if (sQLiteAsyncQuery != null) {
            this.mQuery = sQLiteAsyncQuery;
            this.mDriver = sQLiteCursorDriver;
            this.mColumns = sQLiteAsyncQuery.getColumnNames();
            this.mCount = -1;
            this.mWaitLock = new Object();
            this.mWindow = new ChunkedCursorWindow(TPMediaCodecProfileLevel.HEVCMainTierLevel62);
            QueryThread queryThread = new QueryThread();
            this.mQueryThread = queryThread;
            queryThread.start();
            return;
        }
        throw new IllegalArgumentException("query object cannot be null");
    }

    private void checkValidRow() {
        if (this.mCurrentRow == 0) {
            if (!isValidPosition(this.mPos)) {
                throw new CursorIndexOutOfBoundsException(this.mPos, this.mCount);
            }
            throw new StaleDataException("Cannot get valid Row object");
        }
    }

    private boolean isValidPosition(int i) {
        return i >= 0 && i < getCount();
    }

    private boolean requestRow() {
        if (this.mWindow == null || !isValidPosition(this.mPos)) {
            return false;
        }
        this.mQueryThread.requestPos(this.mPos);
        long rowUnsafe = this.mWindow.getRowUnsafe(this.mPos);
        this.mCurrentRow = rowUnsafe;
        if (rowUnsafe == 0) {
            this.mCurrentRow = waitForRow(this.mPos);
        }
        return this.mCurrentRow != 0;
    }

    private long waitForRow(int i) {
        long rowUnsafe;
        try {
            synchronized (this.mWaitLock) {
                while (true) {
                    rowUnsafe = this.mWindow.getRowUnsafe(i);
                    if (rowUnsafe == 0) {
                        if (isValidPosition(i)) {
                            this.mWaitLock.wait();
                        } else {
                            throw new CursorIndexOutOfBoundsException(this.mPos, this.mCount);
                        }
                    }
                }
            }
            return rowUnsafe;
        } catch (InterruptedException unused) {
            return 0;
        }
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
        checkValidRow();
        return this.mWindow.getBlobUnsafe(this.mCurrentRow, i);
    }

    public String[] getColumnNames() {
        return this.mColumns;
    }

    public int getCount() {
        if (this.mCount >= 0) {
            return this.mCount;
        }
        if (this.mWindow == null) {
            return -1;
        }
        try {
            synchronized (this.mWaitLock) {
                while (this.mCount < 0) {
                    this.mWaitLock.wait();
                }
            }
        } catch (InterruptedException unused) {
        }
        return this.mCount;
    }

    public double getDouble(int i) {
        checkValidRow();
        return this.mWindow.getDoubleUnsafe(this.mCurrentRow, i);
    }

    public float getFloat(int i) {
        return (float) getDouble(i);
    }

    public int getInt(int i) {
        return (int) getLong(i);
    }

    public long getLong(int i) {
        checkValidRow();
        return this.mWindow.getLongUnsafe(this.mCurrentRow, i);
    }

    public short getShort(int i) {
        return (short) ((int) getLong(i));
    }

    public String getString(int i) {
        checkValidRow();
        return this.mWindow.getStringUnsafe(this.mCurrentRow, i);
    }

    public int getType(int i) {
        checkValidRow();
        return this.mWindow.getTypeUnsafe(this.mCurrentRow, i);
    }

    public boolean isNull(int i) {
        return getType(i) == 0;
    }

    public boolean moveToPosition(int i) {
        if (i < -1) {
            i = -1;
        }
        if (i != this.mPos) {
            this.mWindow.endRowUnsafe(this.mCurrentRow);
            this.mCurrentRow = 0;
        }
        int count = getCount();
        if (i >= count) {
            this.mPos = count;
            return false;
        }
        this.mPos = i;
        return i >= 0 && requestRow();
    }

    public void onDeactivateOrClose() {
        long j = this.mCurrentRow;
        if (j != 0) {
            this.mWindow.endRowUnsafe(j);
            this.mCurrentRow = 0;
        }
        QueryThread queryThread = this.mQueryThread;
        if (queryThread != null) {
            queryThread.quit();
            try {
                this.mQueryThread.join();
            } catch (InterruptedException unused) {
            }
            this.mQueryThread = null;
        }
        ChunkedCursorWindow chunkedCursorWindow = this.mWindow;
        if (chunkedCursorWindow != null) {
            chunkedCursorWindow.close();
            this.mWindow = null;
        }
        this.mCount = -1;
        this.mPos = -1;
        super.onDeactivateOrClose();
    }
}
