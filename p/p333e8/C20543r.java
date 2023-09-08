package p333e8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: e8.r */
public class C20543r {

    /* renamed from: h */
    public static final Comparator<C20546c> f57816h = new C20544a();

    /* renamed from: i */
    public static final Comparator<C20546c> f57817i = new C20545b();

    /* renamed from: a */
    public final int f57818a;

    /* renamed from: b */
    public final ArrayList<C20546c> f57819b = new ArrayList<>();

    /* renamed from: c */
    public final C20546c[] f57820c = new C20546c[5];

    /* renamed from: d */
    public int f57821d = -1;

    /* renamed from: e */
    public int f57822e;

    /* renamed from: f */
    public int f57823f;

    /* renamed from: g */
    public int f57824g;

    /* renamed from: e8.r$a */
    public static class C20544a implements Comparator<C20546c> {
        public int compare(Object obj, Object obj2) {
            return ((C20546c) obj).f57825a - ((C20546c) obj2).f57825a;
        }
    }

    /* renamed from: e8.r$b */
    public static class C20545b implements Comparator<C20546c> {
        public int compare(Object obj, Object obj2) {
            float f = ((C20546c) obj).f57827c;
            float f2 = ((C20546c) obj2).f57827c;
            if (f < f2) {
                return -1;
            }
            return f2 < f ? 1 : 0;
        }
    }

    /* renamed from: e8.r$c */
    public static class C20546c {

        /* renamed from: a */
        public int f57825a;

        /* renamed from: b */
        public int f57826b;

        /* renamed from: c */
        public float f57827c;
    }

    public C20543r(int i) {
        this.f57818a = i;
    }

    /* renamed from: a */
    public void mo32125a(int i, float f) {
        C20546c cVar;
        if (this.f57821d != 1) {
            Collections.sort(this.f57819b, f57816h);
            this.f57821d = 1;
        }
        int i2 = this.f57824g;
        if (i2 > 0) {
            C20546c[] cVarArr = this.f57820c;
            int i3 = i2 - 1;
            this.f57824g = i3;
            cVar = cVarArr[i3];
        } else {
            cVar = new C20546c();
        }
        int i4 = this.f57822e;
        this.f57822e = i4 + 1;
        cVar.f57825a = i4;
        cVar.f57826b = i;
        cVar.f57827c = f;
        this.f57819b.add(cVar);
        this.f57823f += i;
        while (true) {
            int i5 = this.f57823f;
            int i6 = this.f57818a;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C20546c cVar2 = this.f57819b.get(0);
                int i8 = cVar2.f57826b;
                if (i8 <= i7) {
                    this.f57823f -= i8;
                    this.f57819b.remove(0);
                    int i9 = this.f57824g;
                    if (i9 < 5) {
                        C20546c[] cVarArr2 = this.f57820c;
                        this.f57824g = i9 + 1;
                        cVarArr2[i9] = cVar2;
                    }
                } else {
                    cVar2.f57826b = i8 - i7;
                    this.f57823f -= i7;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public float mo32126b(float f) {
        if (this.f57821d != 0) {
            Collections.sort(this.f57819b, f57817i);
            this.f57821d = 0;
        }
        float f2 = f * ((float) this.f57823f);
        int i = 0;
        for (int i2 = 0; i2 < this.f57819b.size(); i2++) {
            C20546c cVar = this.f57819b.get(i2);
            i += cVar.f57826b;
            if (((float) i) >= f2) {
                return cVar.f57827c;
            }
        }
        if (this.f57819b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<C20546c> arrayList = this.f57819b;
        return arrayList.get(arrayList.size() - 1).f57827c;
    }
}
