package com.tencent.wcdb;

import android.database.ContentObserver;
import android.database.DataSetObserver;

public class MergeCursor extends AbstractCursor {
    private Cursor mCursor;
    private Cursor[] mCursors;
    private DataSetObserver mObserver = new DataSetObserver() {
        public void onChanged() {
            MergeCursor.this.mPos = -1;
        }

        public void onInvalidated() {
            MergeCursor.this.mPos = -1;
        }
    };

    public MergeCursor(Cursor[] cursorArr) {
        this.mCursors = cursorArr;
        int i = 0;
        this.mCursor = cursorArr[0];
        while (true) {
            Cursor[] cursorArr2 = this.mCursors;
            if (i < cursorArr2.length) {
                Cursor cursor = cursorArr2[i];
                if (cursor != null) {
                    cursor.registerDataSetObserver(this.mObserver);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void close() {
        for (Cursor cursor : this.mCursors) {
            if (cursor != null) {
                cursor.close();
            }
        }
        super.close();
    }

    public void deactivate() {
        for (Cursor cursor : this.mCursors) {
            if (cursor != null) {
                cursor.deactivate();
            }
        }
        super.deactivate();
    }

    public byte[] getBlob(int i) {
        return this.mCursor.getBlob(i);
    }

    public String[] getColumnNames() {
        Cursor cursor = this.mCursor;
        return cursor != null ? cursor.getColumnNames() : new String[0];
    }

    public int getCount() {
        int i = 0;
        for (Cursor cursor : this.mCursors) {
            if (cursor != null) {
                i += cursor.getCount();
            }
        }
        return i;
    }

    public double getDouble(int i) {
        return this.mCursor.getDouble(i);
    }

    public float getFloat(int i) {
        return this.mCursor.getFloat(i);
    }

    public int getInt(int i) {
        return this.mCursor.getInt(i);
    }

    public long getLong(int i) {
        return this.mCursor.getLong(i);
    }

    public short getShort(int i) {
        return this.mCursor.getShort(i);
    }

    public String getString(int i) {
        return this.mCursor.getString(i);
    }

    public int getType(int i) {
        return this.mCursor.getType(i);
    }

    public boolean isNull(int i) {
        return this.mCursor.isNull(i);
    }

    public boolean onMove(int i, int i2) {
        this.mCursor = null;
        int length = this.mCursors.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Cursor cursor = this.mCursors[i3];
            if (cursor != null) {
                if (i2 < cursor.getCount() + i4) {
                    this.mCursor = this.mCursors[i3];
                    break;
                }
                i4 += this.mCursors[i3].getCount();
            }
            i3++;
        }
        Cursor cursor2 = this.mCursor;
        if (cursor2 != null) {
            return cursor2.moveToPosition(i2 - i4);
        }
        return false;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        for (Cursor cursor : this.mCursors) {
            if (cursor != null) {
                cursor.registerContentObserver(contentObserver);
            }
        }
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        for (Cursor cursor : this.mCursors) {
            if (cursor != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public boolean requery() {
        for (Cursor cursor : this.mCursors) {
            if (cursor != null && !cursor.requery()) {
                return false;
            }
        }
        return true;
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        for (Cursor cursor : this.mCursors) {
            if (cursor != null) {
                cursor.unregisterContentObserver(contentObserver);
            }
        }
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        for (Cursor cursor : this.mCursors) {
            if (cursor != null) {
                cursor.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }
}
