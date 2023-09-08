package ai3;

import ai3.C112791c;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.util.SparseArray;
import com.tencent.p014mm.p136ui.C75029y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteCursorDriver;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteProgram;
import com.tencent.wcdb.support.CancellationSignal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ai3.f */
public class C112793f extends AbstractCursor implements C67047d {

    /* renamed from: r */
    public static final SQLiteDatabase.CursorFactory f337741r = new C112795b();

    /* renamed from: d */
    public final String[] f337742d;

    /* renamed from: e */
    public final C112796h f337743e;

    /* renamed from: f */
    public final SQLiteCursorDriver f337744f;

    /* renamed from: g */
    public int f337745g = -1;

    /* renamed from: h */
    public Map<String, Integer> f337746h;

    /* renamed from: i */
    public int f337747i = 3000;

    /* renamed from: j */
    public C67050c f337748j;

    /* renamed from: n */
    public boolean f337749n;

    /* renamed from: o */
    public C112790b<C112789a> f337750o;

    /* renamed from: p */
    public C112791c f337751p;

    /* renamed from: q */
    public boolean f337752q;

    /* renamed from: ai3.f$c */
    public interface C67050c {
    }

    /* renamed from: ai3.f$a */
    public class C112794a extends C112790b<C112789a> {
        public C112794a(boolean z) {
            super(z);
        }
    }

    /* renamed from: ai3.f$b */
    public class C112795b implements SQLiteDatabase.CursorFactory {
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram) {
            return new C112793f(sQLiteCursorDriver, str, (C112796h) sQLiteProgram);
        }

        public SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
            return new C112796h(sQLiteDatabase, str, objArr, cancellationSignal);
        }
    }

    public C112793f(SQLiteCursorDriver sQLiteCursorDriver, String str, C112796h hVar) {
        if (hVar != null) {
            this.f337744f = sQLiteCursorDriver;
            this.f337746h = null;
            this.f337743e = hVar;
            String[] columnNames = hVar.getColumnNames();
            this.f337742d = columnNames;
            this.mRowIdColumnIndex = DatabaseUtils.findRowIdColumnIndex(columnNames);
            return;
        }
        throw new IllegalArgumentException("query object cannot be null");
    }

    /* renamed from: B0 */
    public HashMap mo91032B0() {
        return this.f337750o.f337729e;
    }

    /* renamed from: K0 */
    public void mo91033K0(int i) {
        if (i <= 15000 && i >= 2000) {
            this.f337747i = i;
        }
    }

    /* renamed from: N */
    public boolean mo91034N(Object obj) {
        C112790b<C112789a> bVar;
        if (this.f337749n && (bVar = this.f337750o) != null) {
            return bVar.mo164549N(obj);
        }
        return false;
    }

    /* renamed from: R */
    public boolean mo91035R(Object obj, C112789a aVar) {
        C112790b<C112789a> bVar;
        boolean z;
        boolean z2 = this.f337749n;
        if (!z2 || (bVar = this.f337750o) == null) {
            if (!z2) {
                C112791c cVar = this.f337751p;
                cVar.mPos = 0;
                cVar.f337733e.clear();
            }
            return false;
        }
        if (!this.f337752q && (obj instanceof Object[]) && bVar.mo164549N(obj)) {
            Object[] objArr = (Object[]) obj;
            this.f337745g -= objArr.length;
            this.f337747i -= objArr.length;
        }
        C112790b<C112789a> bVar2 = this.f337750o;
        bVar2.getClass();
        if (aVar != null) {
            Log.m105926v("MicroMsg.CursorDataWindow", "newcursor cursor update Memory key : " + obj + "values : " + aVar);
            bVar2.f337729e.put(obj, aVar);
        } else if (obj instanceof Object[]) {
            Object[] objArr2 = (Object[]) obj;
            for (Object remove : objArr2) {
                bVar2.f337729e.remove(remove);
            }
            SparseArray<Object> sparseArray = new SparseArray<>();
            int i = 0;
            for (int i2 = 0; i2 < bVar2.f337728d.size(); i2++) {
                int keyAt = bVar2.f337728d.keyAt(i2);
                Object valueAt = bVar2.f337728d.valueAt(i2);
                int length = objArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z = true;
                        break;
                    } else if (objArr2[i3].equals(valueAt)) {
                        i++;
                        z = false;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z) {
                    sparseArray.put(keyAt - i, valueAt);
                } else {
                    Log.m105924i("MicroMsg.CursorDataWindow", "newcursor delete index : " + i2 + " obj : " + valueAt);
                }
            }
            if (bVar2.f337728d.size() != sparseArray.size()) {
                Log.m105924i("MicroMsg.CursorDataWindow", "newcursor oldposition size :" + bVar2.f337728d.size() + " newposistion Size : " + sparseArray.size());
            }
            bVar2.f337728d = sparseArray;
        } else {
            if (bVar2.f337730f == null) {
                bVar2.f337730f = new ArrayList<>();
            }
            if (!bVar2.f337730f.contains(obj)) {
                bVar2.f337730f.add(obj);
                Log.m105924i("MicroMsg.CursorDataWindow", "newcursor cursor clearData : " + obj);
            }
            bVar2.f337729e.remove(obj);
        }
        return false;
    }

    /* renamed from: X */
    public boolean mo91036X(int i) {
        if (!this.f337749n) {
            return false;
        }
        this.f337750o.getClass();
        return i <= 50;
    }

    /* renamed from: a */
    public final int mo164556a(int i) {
        int i2;
        boolean z;
        Object obj;
        boolean z2;
        int i3 = i;
        int i4 = 4;
        int i5 = 3;
        int i6 = 2;
        if (this.f337749n) {
            if (this.f337750o == null) {
                this.f337750o = new C112794a(true);
            }
            this.f337750o.getClass();
            C112796h hVar = this.f337743e;
            C112790b<C112789a> bVar = this.f337750o;
            int i7 = this.f337747i;
            hVar.acquireReference();
            bVar.acquireReference();
            if (i3 > 0) {
                try {
                    int step = hVar.step(i3);
                    if (step < i3) {
                        Log.m105929w("WCDB.SQLiteNewQuery", "startPos %d > actual rows %d", Integer.valueOf(i), Integer.valueOf(step));
                        bVar.releaseReference();
                        hVar.releaseReference();
                        return step;
                    }
                } catch (IllegalStateException e) {
                    Log.printErrStackTrace("WCDB.SQLiteNewQuery", e, "fillWindow failed", new Object[0]);
                    bVar.releaseReference();
                    hVar.releaseReference();
                    return 0;
                } catch (SQLiteException e2) {
                    Log.m105920e("WCDB.SQLiteNewQuery", "exception: " + e2.getMessage() + "; query: " + hVar.getSql());
                    hVar.checkCorruption(e2);
                    throw e2;
                } catch (Throwable th) {
                    bVar.releaseReference();
                    hVar.releaseReference();
                    throw th;
                }
            }
            int length = hVar.getColumnNames().length;
            int i8 = i7 + i3;
            while (true) {
                if (i3 < i8) {
                    if (hVar.step(1) != 1) {
                        z2 = true;
                        break;
                    }
                    bVar.mo164551b(i3);
                    int i9 = 0;
                    while (i9 < length) {
                        int type = hVar.getType(i9);
                        if (type == 0) {
                            T t = bVar.f337731g;
                            if (t != null) {
                                t.mo69645q(i9);
                            }
                        } else if (type == 1) {
                            long j = hVar.getLong(i9);
                            T t2 = bVar.f337731g;
                            if (t2 != null) {
                                t2.mo69635B1(i9, j);
                            }
                        } else if (type == i6) {
                            double d = hVar.getDouble(i9);
                            T t3 = bVar.f337731g;
                            if (t3 != null) {
                                t3.mo69641c1(i9, d);
                            }
                        } else if (type == i5) {
                            String string = hVar.getString(i9);
                            T t4 = bVar.f337731g;
                            if (t4 != null) {
                                t4.mo69636L1(i9, string);
                            }
                        } else if (type == i4) {
                            byte[] blob = hVar.getBlob(i9);
                            T t5 = bVar.f337731g;
                            if (t5 != null) {
                                t5.mo69637Y(i9, blob);
                            }
                        } else {
                            bVar.mo164550a(i3, 1);
                            throw new SQLiteException("Unknown column type when filling window.");
                        }
                        i9++;
                        i4 = 4;
                        i5 = 3;
                        i6 = 2;
                    }
                    bVar.mo164550a(i3, 0);
                    i3++;
                    i4 = 4;
                    i5 = 3;
                    i6 = 2;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                i3 += hVar.step(Integer.MAX_VALUE);
            }
            hVar.reset(true);
            bVar.releaseReference();
            hVar.releaseReference();
            return i3;
        }
        if (this.f337751p == null) {
            this.f337751p = new C112791c(this.f337742d);
        }
        C112796h hVar2 = this.f337743e;
        C112791c cVar = this.f337751p;
        int i15 = this.f337747i;
        hVar2.acquireReference();
        if (i3 > 0) {
            try {
                i2 = hVar2.step(i3);
                if (i2 < i3) {
                    Log.m105929w("WCDB.SQLiteNewQuery", "startPos %d > actual rows %d", Integer.valueOf(i), Integer.valueOf(i2));
                    hVar2.releaseReference();
                    return i2;
                }
            } catch (SQLiteException e3) {
                Log.m105920e("WCDB.SQLiteNewQuery", "exception: " + e3.getMessage() + "; query: " + hVar2.getSql());
                hVar2.checkCorruption(e3);
                throw e3;
            } catch (Throwable th4) {
                hVar2.releaseReference();
                throw th4;
            }
        }
        int length2 = hVar2.getColumnNames().length;
        int i16 = i15 + i3;
        while (true) {
            if (i3 < i16) {
                if (hVar2.step(1) != 1) {
                    z = true;
                    break;
                }
                C112791c.C112792a a = cVar.mo164553a(i3);
                for (int i17 = 0; i17 < length2; i17++) {
                    int type2 = hVar2.getType(i17);
                    if (type2 == 0) {
                        obj = null;
                    } else if (type2 == 1) {
                        obj = Long.valueOf(hVar2.getLong(i17));
                    } else if (type2 == 2) {
                        obj = Double.valueOf(hVar2.getDouble(i17));
                    } else if (type2 == 3) {
                        obj = hVar2.getString(i17);
                    } else if (type2 == 4) {
                        obj = hVar2.getBlob(i17);
                    } else {
                        throw new SQLiteException("Unknown column type when filling window.");
                    }
                    a.mo164555a(obj);
                }
                i3++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            i3 += hVar2.step(Integer.MAX_VALUE);
        }
        i2 = i3;
        hVar2.reset(true);
        hVar2.releaseReference();
        return i2;
    }

    public void checkPosition() {
        super.checkPosition();
    }

    public void close() {
        super.close();
        synchronized (this) {
            this.f337743e.close();
            this.f337744f.cursorClosed();
        }
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    /* renamed from: d0 */
    public SparseArray<Object>[] mo91037d0() {
        if (!this.f337749n) {
            return null;
        }
        return new SparseArray[]{this.f337750o.f337728d};
    }

    public void deactivate() {
        super.deactivate();
        this.f337744f.cursorDeactivated();
    }

    public void finalize() {
        try {
            if (this.f337750o != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public byte[] getBlob(int i) {
        if (!this.f337749n) {
            return this.f337751p.getBlob(i);
        }
        return null;
    }

    public int getColumnIndex(String str) {
        if (this.f337746h == null) {
            String[] strArr = this.f337742d;
            int length = strArr.length;
            HashMap hashMap = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                hashMap.put(strArr[i], Integer.valueOf(i));
            }
            this.f337746h = hashMap;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Exception exc = new Exception();
            com.tencent.wcdb.support.Log.m164294e("WCDB.SQLiteNewCursor", "requesting column name with table name -- " + str, exc);
            str = str.substring(lastIndexOf + 1);
        }
        Integer num = this.f337746h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public String[] getColumnNames() {
        return this.f337742d;
    }

    public int getCount() {
        if (this.f337745g == -1) {
            int a = mo164556a(0);
            this.f337745g = a;
            C112790b<C112789a> bVar = this.f337750o;
            if (bVar != null) {
                this.f337752q = a != -1 && a == bVar.f337728d.size();
            }
        }
        if (!this.f337749n || !this.f337752q) {
            return this.f337745g;
        }
        C112790b<C112789a> bVar2 = this.f337750o;
        if (bVar2 == null) {
            return 0;
        }
        return bVar2.f337728d.size();
    }

    public double getDouble(int i) {
        if (!this.f337749n) {
            return this.f337751p.getDouble(i);
        }
        return 0.0d;
    }

    public float getFloat(int i) {
        if (!this.f337749n) {
            return this.f337751p.getFloat(i);
        }
        return 0.0f;
    }

    public int getInt(int i) {
        if (!this.f337749n) {
            return this.f337751p.getInt(i);
        }
        return 0;
    }

    public C112789a getItem(int i) {
        C112790b<C112789a> bVar = this.f337750o;
        ArrayList<T> arrayList = null;
        if (bVar == null) {
            return null;
        }
        if (bVar.f337728d.indexOfKey(i) > -1) {
            Object obj = bVar.f337728d.get(i);
            C112789a aVar = (C112789a) bVar.f337729e.get(obj);
            if (aVar != null) {
                return aVar;
            }
            Log.m105925i("MicroMsg.CursorDataWindow", "get data null %s", obj);
            if (bVar.f337730f.size() != 0) {
                ArrayList<Object> arrayList2 = bVar.f337730f;
                C67050c cVar = C112793f.this.f337748j;
                if (cVar != null) {
                    arrayList = C75029y.this.mo103512s(arrayList2);
                }
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        C112789a aVar2 = (C112789a) arrayList.get(i2);
                        if (aVar2 != null) {
                            bVar.f337729e.put(aVar2.getKey(), aVar2);
                        } else {
                            Log.m105920e("MicroMsg.CursorDataWindow", "newcursor obj is null");
                        }
                    }
                }
                bVar.f337730f.clear();
            }
            C112789a aVar3 = (C112789a) bVar.f337729e.get(obj);
            if (aVar3 != null) {
                return aVar3;
            }
            Log.m105920e("MicroMsg.CursorDataWindow", "newcursor error obj : " + obj + "pos:" + i);
            return aVar3;
        }
        Log.m105920e("MicroMsg.CursorDataWindow", "newcursor cursor getItem error: pos " + i + " loaded num :" + bVar.f337728d.size());
        return null;
    }

    public long getLong(int i) {
        if (!this.f337749n) {
            return this.f337751p.getLong(i);
        }
        return 0;
    }

    public short getShort(int i) {
        if (!this.f337749n) {
            return this.f337751p.getShort(i);
        }
        return 0;
    }

    public String getString(int i) {
        if (!this.f337749n) {
            return this.f337751p.getString(i);
        }
        return null;
    }

    public boolean isNull(int i) {
        if (!this.f337749n) {
            return this.f337751p.isNull(i);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onMove(int r6, int r7) {
        /*
            r5 = this;
            boolean r6 = r5.f337749n
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x001f
            ai3.b<ai3.a> r6 = r5.f337750o
            if (r6 == 0) goto L_0x0016
            android.util.SparseArray<java.lang.Object> r6 = r6.f337728d
            int r6 = r6.indexOfKey(r7)
            r2 = -1
            if (r6 <= r2) goto L_0x0014
            r0 = 1
        L_0x0014:
            if (r0 != 0) goto L_0x0062
        L_0x0016:
            int r6 = r5.f337747i
            int r7 = r7 / r6
            int r7 = r7 * r6
            r5.mo164556a(r7)
            goto L_0x0062
        L_0x001f:
            ai3.c r6 = r5.f337751p
            if (r6 != 0) goto L_0x002e
            if (r6 != 0) goto L_0x002e
            ai3.c r6 = new ai3.c
            java.lang.String[] r2 = r5.f337742d
            r6.<init>(r2)
            r5.f337751p = r6
        L_0x002e:
            ai3.c r6 = r5.f337751p
            int r2 = r6.f337735g
            int r2 = r7 / r2
            android.util.SparseArray<java.lang.Object[]> r3 = r6.f337733e
            int r3 = r3.indexOfKey(r2)
            if (r3 >= 0) goto L_0x003d
            goto L_0x0052
        L_0x003d:
            int r3 = r6.f337735g
            int r3 = r7 % r3
            int r4 = r6.f337734f
            int r3 = r3 * r4
            android.util.SparseArray<java.lang.Object[]> r6 = r6.f337733e
            java.lang.Object r6 = r6.get(r2)
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r6 = r6[r3]
            if (r6 == 0) goto L_0x0052
            r0 = 1
        L_0x0052:
            if (r0 != 0) goto L_0x005d
            int r6 = r5.f337747i
            int r0 = r7 / r6
            int r0 = r0 * r6
            r5.mo164556a(r0)
        L_0x005d:
            ai3.c r6 = r5.f337751p
            r6.moveToPosition(r7)
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ai3.C112793f.onMove(int, int):boolean");
    }

    /* renamed from: p0 */
    public C112789a mo91039p0(Object obj) {
        if (!this.f337749n) {
            com.tencent.wcdb.support.Log.m164293e("WCDB.SQLiteNewCursor", "newcursor getItemByKey error " + obj);
            return null;
        }
        C112790b<C112789a> bVar = this.f337750o;
        if (bVar == null) {
            com.tencent.wcdb.support.Log.m164293e("WCDB.SQLiteNewCursor", "newcursor error getItemByKey window is null");
            return null;
        }
        HashMap<Object, T> hashMap = bVar.f337729e;
        if (hashMap == null) {
            return null;
        }
        return (C112789a) hashMap.get(obj);
    }

    public void registerContentObserver(ContentObserver contentObserver) {
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.f337743e.getDatabase().isOpen()) {
                    return false;
                }
                C112790b<C112789a> bVar = this.f337750o;
                if (bVar != null) {
                    Log.m105924i("MicroMsg.CursorDataWindow", "clearData");
                    bVar.f337728d.clear();
                    bVar.f337729e.clear();
                }
                this.mPos = -1;
                this.f337745g = -1;
                this.f337744f.cursorRequeried(this);
                try {
                    return super.requery();
                } catch (IllegalStateException e) {
                    com.tencent.wcdb.support.Log.m164302w("WCDB.SQLiteNewCursor", "requery() failed " + e.getMessage(), e);
                    return false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: u0 */
    public void mo91040u0(C67050c cVar) {
        this.f337748j = cVar;
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    /* renamed from: v0 */
    public void mo91041v0(boolean z) {
        this.f337749n = z;
    }

    /* renamed from: w0 */
    public boolean mo91042w0() {
        return this.f337752q;
    }
}
