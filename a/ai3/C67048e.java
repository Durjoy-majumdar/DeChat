package ai3;

import ai3.C112793f;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.util.SparseArray;
import com.tencent.wcdb.AbstractCursor;
import java.util.HashMap;

/* renamed from: ai3.e */
public class C67048e extends AbstractCursor implements C67047d {

    /* renamed from: d */
    public DataSetObserver f192594d = new C67049a();

    /* renamed from: e */
    public C67047d f192595e;

    /* renamed from: f */
    public C67047d[] f192596f;

    /* renamed from: ai3.e$a */
    public class C67049a extends DataSetObserver {
        public C67049a() {
        }

        public void onChanged() {
            C67048e.this.mPos = -1;
        }

        public void onInvalidated() {
            C67048e.this.mPos = -1;
        }
    }

    public C67048e(C67047d[] dVarArr) {
        this.f192596f = dVarArr;
        int i = 0;
        this.f192595e = dVarArr[0];
        while (true) {
            C67047d[] dVarArr2 = this.f192596f;
            if (i < dVarArr2.length) {
                C67047d dVar = dVarArr2[i];
                if (dVar != null) {
                    dVar.registerDataSetObserver(this.f192594d);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: B0 */
    public HashMap mo91032B0() {
        return null;
    }

    /* renamed from: K0 */
    public void mo91033K0(int i) {
        for (C67047d dVar : this.f192596f) {
            if (dVar != null) {
                dVar.mo91033K0(i);
            }
        }
    }

    /* renamed from: N */
    public boolean mo91034N(Object obj) {
        boolean z = false;
        for (C67047d dVar : this.f192596f) {
            if (dVar != null && dVar.mo91034N(obj)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: R */
    public boolean mo91035R(Object obj, C112789a aVar) {
        boolean z = false;
        for (C67047d dVar : this.f192596f) {
            if (dVar != null && dVar.mo91035R(obj, aVar)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: X */
    public boolean mo91036X(int i) {
        boolean z = true;
        for (C67047d dVar : this.f192596f) {
            if (dVar != null && !dVar.mo91036X(i)) {
                z = false;
            }
        }
        return z;
    }

    public void close() {
        for (C67047d dVar : this.f192596f) {
            if (dVar != null) {
                dVar.close();
            }
        }
        super.close();
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    /* renamed from: d0 */
    public SparseArray<Object>[] mo91037d0() {
        int length = this.f192596f.length;
        SparseArray<Object>[] sparseArrayArr = new SparseArray[length];
        for (int i = 0; i < length; i++) {
            SparseArray<Object>[] d0 = this.f192596f[i].mo91037d0();
            sparseArrayArr[i] = d0 != null ? d0[0] : null;
        }
        return sparseArrayArr;
    }

    public void deactivate() {
        for (C67047d dVar : this.f192596f) {
            if (dVar != null) {
                dVar.deactivate();
            }
        }
        super.deactivate();
    }

    public byte[] getBlob(int i) {
        return this.f192595e.getBlob(i);
    }

    public String[] getColumnNames() {
        C67047d dVar = this.f192595e;
        return dVar != null ? dVar.getColumnNames() : new String[0];
    }

    public int getCount() {
        int i = 0;
        for (C67047d dVar : this.f192596f) {
            if (dVar != null) {
                i += dVar.getCount();
            }
        }
        return i;
    }

    public double getDouble(int i) {
        return this.f192595e.getDouble(i);
    }

    public float getFloat(int i) {
        return this.f192595e.getFloat(i);
    }

    public int getInt(int i) {
        return this.f192595e.getInt(i);
    }

    public C112789a getItem(int i) {
        int length = this.f192596f.length;
        for (int i2 = 0; i2 < length; i2++) {
            int count = this.f192596f[i2].getCount();
            if (i < count) {
                return this.f192596f[i2].getItem(i);
            }
            i -= count;
        }
        return null;
    }

    public long getLong(int i) {
        return this.f192595e.getLong(i);
    }

    public short getShort(int i) {
        return this.f192595e.getShort(i);
    }

    public String getString(int i) {
        return this.f192595e.getString(i);
    }

    public boolean isNull(int i) {
        return this.f192595e.isNull(i);
    }

    public boolean onMove(int i, int i2) {
        this.f192595e = null;
        int length = this.f192596f.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            C67047d dVar = this.f192596f[i3];
            if (dVar != null) {
                if (i2 < dVar.getCount() + i4) {
                    this.f192595e = this.f192596f[i3];
                    break;
                }
                i4 += this.f192596f[i3].getCount();
            }
            i3++;
        }
        C67047d dVar2 = this.f192595e;
        if (dVar2 != null) {
            return dVar2.moveToPosition(i2 - i4);
        }
        return false;
    }

    /* renamed from: p0 */
    public C112789a mo91039p0(Object obj) {
        return this.f192595e.mo91039p0(obj);
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        for (C67047d dVar : this.f192596f) {
            if (dVar != null) {
                dVar.registerContentObserver(contentObserver);
            }
        }
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        for (C67047d dVar : this.f192596f) {
            if (dVar != null) {
                dVar.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public boolean requery() {
        for (C67047d dVar : this.f192596f) {
            if (dVar != null && !dVar.requery()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: u0 */
    public void mo91040u0(C112793f.C67050c cVar) {
        for (C67047d dVar : this.f192596f) {
            if (dVar != null) {
                dVar.mo91040u0(cVar);
            }
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        for (C67047d dVar : this.f192596f) {
            if (dVar != null) {
                dVar.unregisterContentObserver(contentObserver);
            }
        }
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        for (C67047d dVar : this.f192596f) {
            if (dVar != null) {
                dVar.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: v0 */
    public void mo91041v0(boolean z) {
        for (C67047d dVar : this.f192596f) {
            if (dVar != null) {
                dVar.mo91041v0(z);
            }
        }
    }

    /* renamed from: w0 */
    public boolean mo91042w0() {
        boolean z = true;
        for (C67047d dVar : this.f192596f) {
            if (dVar != null && !dVar.mo91042w0()) {
                z = false;
            }
        }
        return z;
    }
}
