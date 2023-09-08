package com.tencent.wcdb;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import java.util.ArrayList;

public class MatrixCursor extends AbstractCursor {
    private final int columnCount;
    private final String[] columnNames;
    /* access modifiers changed from: private */
    public Object[] data;
    private int rowCount;

    public class RowBuilder {
        private final int endIndex;
        private int index;

        public RowBuilder(int i, int i2) {
            this.index = i;
            this.endIndex = i2;
        }

        public RowBuilder add(Object obj) {
            if (this.index != this.endIndex) {
                Object[] access$000 = MatrixCursor.this.data;
                int i = this.index;
                this.index = i + 1;
                access$000[i] = obj;
                return this;
            }
            throw new CursorIndexOutOfBoundsException("No more columns left.");
        }
    }

    public MatrixCursor(String[] strArr, int i) {
        this.rowCount = 0;
        this.columnNames = strArr;
        int length = strArr.length;
        this.columnCount = length;
        this.data = new Object[(length * (i < 1 ? 1 : i))];
    }

    private void ensureCapacity(int i) {
        Object[] objArr = this.data;
        if (i > objArr.length) {
            int length = objArr.length * 2;
            if (length >= i) {
                i = length;
            }
            Object[] objArr2 = new Object[i];
            this.data = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    private Object get(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.columnCount)) {
            throw new CursorIndexOutOfBoundsException("Requested column: " + i + ", # of columns: " + this.columnCount);
        }
        int i3 = this.mPos;
        if (i3 < 0) {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        } else if (i3 < this.rowCount) {
            return this.data[(i3 * i2) + i];
        } else {
            throw new CursorIndexOutOfBoundsException("After last row.");
        }
    }

    public void addRow(Object[] objArr) {
        int length = objArr.length;
        int i = this.columnCount;
        if (length == i) {
            int i2 = this.rowCount;
            this.rowCount = i2 + 1;
            int i3 = i2 * i;
            ensureCapacity(i + i3);
            System.arraycopy(objArr, 0, this.data, i3, this.columnCount);
            return;
        }
        throw new IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.length = " + objArr.length);
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    public byte[] getBlob(int i) {
        return (byte[]) get(i);
    }

    public String[] getColumnNames() {
        return this.columnNames;
    }

    public int getCount() {
        return this.rowCount;
    }

    public double getDouble(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0.0d;
        }
        return obj instanceof Number ? ((Number) obj).doubleValue() : Double.parseDouble(obj.toString());
    }

    public float getFloat(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0.0f;
        }
        return obj instanceof Number ? ((Number) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public int getInt(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        return obj instanceof Number ? ((Number) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public long getLong(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        return obj instanceof Number ? ((Number) obj).longValue() : Long.parseLong(obj.toString());
    }

    public short getShort(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        return obj instanceof Number ? ((Number) obj).shortValue() : Short.parseShort(obj.toString());
    }

    public String getString(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public int getType(int i) {
        return DatabaseUtils.getTypeOfObject(get(i));
    }

    public boolean isNull(int i) {
        return get(i) == null;
    }

    public RowBuilder newRow() {
        int i = this.rowCount + 1;
        this.rowCount = i;
        int i2 = i * this.columnCount;
        ensureCapacity(i2);
        return new RowBuilder(i2 - this.columnCount, i2);
    }

    public void registerContentObserver(ContentObserver contentObserver) {
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public MatrixCursor(String[] strArr) {
        this(strArr, 16);
    }

    public void addRow(Iterable<?> iterable) {
        int i = this.rowCount;
        int i2 = this.columnCount;
        int i3 = i * i2;
        int i4 = i2 + i3;
        ensureCapacity(i4);
        if (iterable instanceof ArrayList) {
            addRow((ArrayList) iterable, i3);
            return;
        }
        Object[] objArr = this.data;
        for (Object next : iterable) {
            if (i3 != i4) {
                objArr[i3] = next;
                i3++;
            } else {
                throw new IllegalArgumentException("columnValues.size() > columnNames.length");
            }
        }
        if (i3 == i4) {
            this.rowCount++;
            return;
        }
        throw new IllegalArgumentException("columnValues.size() < columnNames.length");
    }

    private void addRow(ArrayList<?> arrayList, int i) {
        int size = arrayList.size();
        if (size == this.columnCount) {
            this.rowCount++;
            Object[] objArr = this.data;
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i + i2] = arrayList.get(i2);
            }
            return;
        }
        throw new IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.size() = " + size);
    }
}
