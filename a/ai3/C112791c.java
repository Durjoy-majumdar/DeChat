package ai3;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.CursorIndexOutOfBoundsException;
import android.database.DataSetObserver;
import android.util.SparseArray;
import com.tencent.wcdb.AbstractCursor;

/* renamed from: ai3.c */
public class C112791c extends AbstractCursor {

    /* renamed from: d */
    public final String[] f337732d;

    /* renamed from: e */
    public SparseArray<Object[]> f337733e;

    /* renamed from: f */
    public final int f337734f;

    /* renamed from: g */
    public int f337735g = 3000;

    /* renamed from: h */
    public int f337736h;

    /* renamed from: ai3.c$a */
    public class C112792a {

        /* renamed from: a */
        public Object[] f337737a;

        /* renamed from: b */
        public int f337738b;

        /* renamed from: c */
        public final int f337739c;

        public C112792a(int i, int i2, Object[] objArr) {
            this.f337738b = i;
            this.f337739c = i2;
            this.f337737a = objArr;
        }

        /* renamed from: a */
        public C112792a mo164555a(Object obj) {
            int i = this.f337738b;
            if (i != this.f337739c) {
                Object[] objArr = this.f337737a;
                this.f337738b = i + 1;
                objArr[i] = obj;
                return this;
            }
            throw new CursorIndexOutOfBoundsException("No more columns left.");
        }
    }

    public C112791c(String[] strArr) {
        this.f337732d = strArr;
        this.f337734f = strArr.length;
        this.f337733e = new SparseArray<>();
    }

    /* renamed from: a */
    public C112792a mo164553a(int i) {
        Object[] objArr;
        int i2 = i / this.f337735g;
        if (this.f337733e.indexOfKey(i2) < 0) {
            objArr = new Object[(this.f337735g * this.f337734f)];
            this.f337733e.put(i2, objArr);
        } else {
            objArr = this.f337733e.get(i2);
        }
        int i3 = this.f337734f;
        int i4 = (i % this.f337735g) * i3;
        int i5 = i3 + i4;
        int i6 = i + 1;
        int i7 = this.f337736h;
        if (i6 <= i7) {
            i6 = i7;
        }
        this.f337736h = i6;
        return new C112792a(i4, i5, objArr);
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    public final Object get(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f337734f)) {
            throw new CursorIndexOutOfBoundsException("Requested column: " + i + ", # of columns: " + this.f337734f);
        }
        int i3 = this.mPos;
        if (i3 < 0) {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        } else if (i3 < this.f337736h) {
            int i4 = this.f337735g;
            return this.f337733e.get(i3 / i4)[((i3 % i4) * i2) + i];
        } else {
            throw new CursorIndexOutOfBoundsException("After last row.");
        }
    }

    public byte[] getBlob(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        return (byte[]) obj;
    }

    public String[] getColumnNames() {
        return this.f337732d;
    }

    public int getCount() {
        return this.f337736h;
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

    public boolean isNull(int i) {
        return get(i) == null;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}
