package com.tencent.p014mm.p136ui.conversation;

import android.database.AbstractCursor;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.ui.conversation.b1 */
public class C44954b1 extends AbstractCursor {

    /* renamed from: d */
    public DataSetObserver f121946d = new C44955a();

    /* renamed from: e */
    public int f121947e = -1;

    /* renamed from: f */
    public Cursor f121948f;

    /* renamed from: g */
    public C44956b[] f121949g;

    /* renamed from: h */
    public int f121950h = 1;

    /* renamed from: i */
    public int f121951i = 100;

    /* renamed from: j */
    public int f121952j = -1;

    /* renamed from: n */
    public LinkedList<C44958d> f121953n = new LinkedList<>();

    /* renamed from: o */
    public final C44957c f121954o = new C44957c();

    /* renamed from: com.tencent.mm.ui.conversation.b1$a */
    public class C44955a extends DataSetObserver {
        public C44955a() {
        }

        public void onChanged() {
            int unused = C44954b1.this.mPos = -1;
            C44954b1.this.mo70253c();
        }

        public void onInvalidated() {
            int unused = C44954b1.this.mPos = -1;
            C44954b1.this.mo70253c();
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.b1$b */
    public static abstract class C44956b {

        /* renamed from: a */
        public final LinkedHashMap<String, Integer> f121956a = new LinkedHashMap<>();

        /* renamed from: a */
        public abstract C44959e mo70250a(Cursor cursor, int i);

        /* renamed from: b */
        public C44959e mo70277b(int i) {
            Cursor d = mo70251d();
            if (d == null) {
                return new C44959e((long) i, 0);
            }
            if (i < 0) {
                try {
                    return C44959e.f121964f;
                } catch (Throwable unused) {
                    return C44959e.f121964f;
                }
            } else {
                d.moveToPosition(i);
                return mo70250a(d, i);
            }
        }

        /* renamed from: c */
        public final int mo70278c(Cursor cursor, String str) {
            Integer num = this.f121956a.get(str);
            if (num != null) {
                return num.intValue();
            }
            String[] columnNames = cursor.getColumnNames();
            for (int i = 0; i < columnNames.length; i++) {
                if (str.equals(columnNames[i])) {
                    this.f121956a.put(str, Integer.valueOf(i));
                    return i;
                }
            }
            this.f121956a.put(str, -1);
            return -1;
        }

        /* renamed from: d */
        public abstract Cursor mo70251d();
    }

    /* renamed from: com.tencent.mm.ui.conversation.b1$c */
    public static final class C44957c {

        /* renamed from: a */
        public long f121957a = 0;

        /* renamed from: b */
        public long f121958b = 0;

        /* renamed from: c */
        public long f121959c = 0;

        /* renamed from: d */
        public long f121960d = 0;

        /* renamed from: e */
        public long f121961e = 0;

        public String toString() {
            try {
                return String.format("total=%d, hit=%d [%.2f%%], reset,fill=%d, %d [%.2f%%], compare=%d [%.2f%%]", new Object[]{Long.valueOf(this.f121957a), Long.valueOf(this.f121958b), Float.valueOf((((float) this.f121958b) * 100.0f) / ((float) this.f121957a)), Long.valueOf(this.f121959c), Long.valueOf(this.f121960d), Float.valueOf((((float) this.f121959c) * 100.0f) / ((float) this.f121960d)), Long.valueOf(this.f121961e), Float.valueOf((((float) this.f121961e) * 100.0f) / ((float) this.f121957a))});
            } catch (Throwable unused) {
                return "total=" + this.f121957a + "hit=" + this.f121958b + "clearWindow=" + this.f121959c + "fillWindow=" + this.f121960d + "compare=" + this.f121961e;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.b1$d */
    public static final class C44958d {

        /* renamed from: a */
        public final int f121962a;

        /* renamed from: b */
        public final int f121963b;

        public C44958d(int i, int i2, C44959e eVar) {
            this.f121962a = i;
            this.f121963b = i2;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.b1$f */
    public enum C44960f {
        ASC(1),
        DESC(-1);
        

        /* renamed from: d */
        public final int f121970d;

        /* access modifiers changed from: public */
        C44960f(int i) {
            this.f121970d = i;
        }
    }

    public C44954b1(C44960f fVar, C44956b... bVarArr) {
        this.f121950h = fVar.f121970d;
        if (bVarArr.length < 2) {
            this.f121949g = bVarArr;
        } else {
            this.f121949g = new C44956b[]{bVarArr[0], bVarArr[1]};
        }
        this.f121948f = this.f121949g[0].mo70251d();
        for (int i = 0; i < this.f121949g.length; i++) {
            if (mo70257e(i) != null) {
                mo70257e(i).registerDataSetObserver(this.f121946d);
            }
        }
    }

    /* renamed from: c */
    public void mo70253c() {
        if (this.f121952j != -1) {
            this.f121954o.f121959c++;
        }
        this.f121952j = -1;
        this.f121953n = new LinkedList<>();
    }

    public void close() {
        int length = this.f121949g.length;
        for (int i = 0; i < length; i++) {
            if (mo70257e(i) != null) {
                mo70257e(i).close();
            }
        }
        super.close();
    }

    /* renamed from: d */
    public final Cursor mo70255d() {
        Cursor cursor = this.f121948f;
        if (cursor == null || cursor.isClosed()) {
            onMove(-1, this.f121947e);
        }
        return this.f121948f;
    }

    public void deactivate() {
        int length = this.f121949g.length;
        for (int i = 0; i < length; i++) {
            if (mo70257e(i) != null) {
                mo70257e(i).deactivate();
            }
        }
        super.deactivate();
    }

    /* renamed from: e */
    public final Cursor mo70257e(int i) {
        return this.f121949g[i].mo70251d();
    }

    public byte[] getBlob(int i) {
        return mo70255d().getBlob(i);
    }

    public String[] getColumnNames() {
        return this.f121948f != null ? mo70255d().getColumnNames() : new String[0];
    }

    public int getCount() {
        int length = this.f121949g.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo70257e(i2) != null) {
                i += mo70257e(i2).getCount();
            }
        }
        return i;
    }

    public double getDouble(int i) {
        return mo70255d().getDouble(i);
    }

    public float getFloat(int i) {
        return mo70255d().getFloat(i);
    }

    public int getInt(int i) {
        return mo70255d().getInt(i);
    }

    public long getLong(int i) {
        return mo70255d().getLong(i);
    }

    public short getShort(int i) {
        return mo70255d().getShort(i);
    }

    public String getString(int i) {
        return mo70255d().getString(i);
    }

    public int getType(int i) {
        return mo70255d().getType(i);
    }

    public boolean isNull(int i) {
        return mo70255d().isNull(i);
    }

    public boolean onMove(int i, int i2) {
        String str;
        C44958d dVar;
        int i3;
        String str2;
        long j;
        int i4 = i2;
        C44957c cVar = this.f121954o;
        cVar.f121957a++;
        this.f121947e = i4;
        C44956b[] bVarArr = this.f121949g;
        int i5 = 0;
        String str3 = "MergeSortCursorWrapper";
        if (bVarArr.length < 2) {
            try {
                cVar.f121958b++;
                Cursor d = bVarArr[0].mo70251d();
                this.f121948f = d;
                return d.moveToPosition(i4);
            } catch (Throwable th) {
                Log.m105928w(str3, "onMoveOneCursorOnly fail:" + th.getMessage());
                return false;
            }
        } else {
            int i6 = this.f121952j;
            int size = this.f121953n.size() + i6;
            if (i6 > i4 || i4 >= size) {
                this.f121954o.f121960d++;
                C44956b[] bVarArr2 = this.f121949g;
                C44956b bVar = bVarArr2[0];
                C44956b bVar2 = bVarArr2[1];
                if (i4 <= 0) {
                    i3 = this.f121951i;
                } else {
                    int i7 = this.f121951i;
                    i3 = i7 * (((i7 - 1) + i4) / i7);
                }
                int i8 = i3 * 2;
                int min = Math.min(i8, getCount());
                if (min < i8) {
                    i3 = min;
                }
                C44959e b = bVar.mo70277b(0);
                C44959e b2 = bVar2.mo70277b(0);
                LinkedList<C44958d> linkedList = new LinkedList<>();
                int i9 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i15 < i3) {
                    C44959e eVar = C44959e.f121964f;
                    if (eVar == b && eVar == b2) {
                        break;
                    }
                    if (eVar == b) {
                        linkedList.add(new C44958d(1, i16, b2));
                        i16++;
                        b2 = bVar2.mo70277b(i16);
                    } else if (eVar == b2) {
                        linkedList.add(new C44958d(i5, i9, b));
                        i9++;
                        b = bVar.mo70277b(i9);
                    } else {
                        str2 = str3;
                        j = 1;
                        this.f121954o.f121961e++;
                        if (this.f121950h * b.compareTo(b2) <= 0) {
                            linkedList.add(new C44958d(0, i9, b));
                            i9++;
                            b = bVar.mo70277b(i9);
                        } else {
                            linkedList.add(new C44958d(1, i16, b2));
                            i16++;
                            b2 = bVar2.mo70277b(i16);
                        }
                        i15++;
                        long j2 = j;
                        str3 = str2;
                        i5 = 0;
                    }
                    str2 = str3;
                    j = 1;
                    i15++;
                    long j25 = j;
                    str3 = str2;
                    i5 = 0;
                }
                String str4 = str3;
                if (linkedList.size() != i3) {
                    str = str4;
                    Log.m105929w(str, "fillWindow K=%d, N=%d (%d), iterator=[%d, %d]", 0, Integer.valueOf(linkedList.size()), Integer.valueOf(i3), Integer.valueOf(i9), Integer.valueOf(i16));
                } else {
                    str = str4;
                }
                this.f121952j = 0;
                this.f121953n = linkedList;
            } else {
                this.f121954o.f121958b++;
                str = str3;
            }
            try {
                dVar = this.f121953n.get(i4 - this.f121952j);
            } catch (IndexOutOfBoundsException e) {
                Log.m105928w(str, "locateElement fail:" + e.getMessage());
                dVar = null;
            }
            if (dVar != null) {
                try {
                    Cursor d2 = this.f121949g[dVar.f121962a].mo70251d();
                    this.f121948f = d2;
                    return d2.moveToPosition(dVar.f121963b);
                } catch (Throwable th4) {
                    Log.m105928w(str, "onMoveTwoCursorMixed fail:" + th4.getMessage());
                }
            }
            return false;
        }
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        int length = this.f121949g.length;
        for (int i = 0; i < length; i++) {
            if (mo70257e(i) != null) {
                mo70257e(i).registerContentObserver(contentObserver);
            }
        }
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        int length = this.f121949g.length;
        for (int i = 0; i < length; i++) {
            if (mo70257e(i) != null) {
                mo70257e(i).registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public boolean requery() {
        int length = this.f121949g.length;
        for (int i = 0; i < length; i++) {
            if (mo70257e(i) != null && !mo70257e(i).requery()) {
                return false;
            }
        }
        return true;
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        int length = this.f121949g.length;
        for (int i = 0; i < length; i++) {
            if (mo70257e(i) != null) {
                mo70257e(i).unregisterContentObserver(contentObserver);
            }
        }
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        int length = this.f121949g.length;
        for (int i = 0; i < length; i++) {
            if (mo70257e(i) != null) {
                mo70257e(i).unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.b1$e */
    public static class C44959e implements Comparable<C44959e> {

        /* renamed from: f */
        public static final C44959e f121964f = new C44959e(0, 0);

        /* renamed from: d */
        public long f121965d;

        /* renamed from: e */
        public int f121966e;

        public C44959e() {
            this.f121965d = 0;
            this.f121966e = 0;
        }

        /* renamed from: a */
        public int compareTo(C44959e eVar) {
            if (this == eVar) {
                return 0;
            }
            if (!(eVar == null || f121964f == eVar)) {
                int i = this.f121966e;
                int i2 = eVar.f121966e;
                if (i == i2 && this.f121965d == eVar.f121965d) {
                    return 0;
                }
                if (i != i2) {
                    return i - i2;
                }
                int i3 = ((this.f121965d - eVar.f121965d) > 0 ? 1 : ((this.f121965d - eVar.f121965d) == 0 ? 0 : -1));
                if (i3 < 0) {
                    return -1;
                }
                if (i3 == 0) {
                    return 0;
                }
            }
            return 1;
        }

        public int hashCode() {
            return (this.f121966e << 31) | ((int) this.f121965d);
        }

        public C44959e(long j, int i) {
            this.f121965d = j;
            this.f121966e = i;
        }
    }
}
