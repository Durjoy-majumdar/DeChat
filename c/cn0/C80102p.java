package cn0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: cn0.p */
public class C80102p {

    /* renamed from: h */
    public static final Comparator<C80105c> f234587h = new C80103a();

    /* renamed from: i */
    public static final Comparator<C80105c> f234588i = new C80104b();

    /* renamed from: a */
    public final int f234589a;

    /* renamed from: b */
    public final ArrayList<C80105c> f234590b = new ArrayList<>();

    /* renamed from: c */
    public final C80105c[] f234591c = new C80105c[5];

    /* renamed from: d */
    public int f234592d = -1;

    /* renamed from: e */
    public int f234593e;

    /* renamed from: f */
    public int f234594f;

    /* renamed from: g */
    public int f234595g;

    /* renamed from: cn0.p$a */
    public class C80103a implements Comparator<C80105c> {
        public int compare(Object obj, Object obj2) {
            return ((C80105c) obj).f234596a - ((C80105c) obj2).f234596a;
        }
    }

    /* renamed from: cn0.p$b */
    public class C80104b implements Comparator<C80105c> {
        public int compare(Object obj, Object obj2) {
            float f = ((C80105c) obj).f234598c;
            float f2 = ((C80105c) obj2).f234598c;
            if (f < f2) {
                return -1;
            }
            return f2 < f ? 1 : 0;
        }
    }

    /* renamed from: cn0.p$c */
    public static class C80105c {

        /* renamed from: a */
        public int f234596a;

        /* renamed from: b */
        public int f234597b;

        /* renamed from: c */
        public float f234598c;
    }

    public C80102p(int i) {
        this.f234589a = i;
    }

    /* renamed from: a */
    public void mo110346a(int i, float f) {
        C80105c cVar;
        if (this.f234592d != 1) {
            Collections.sort(this.f234590b, f234587h);
            this.f234592d = 1;
        }
        int i2 = this.f234595g;
        if (i2 > 0) {
            C80105c[] cVarArr = this.f234591c;
            int i3 = i2 - 1;
            this.f234595g = i3;
            cVar = cVarArr[i3];
        } else {
            cVar = new C80105c();
        }
        int i4 = this.f234593e;
        this.f234593e = i4 + 1;
        cVar.f234596a = i4;
        cVar.f234597b = i;
        cVar.f234598c = f;
        this.f234590b.add(cVar);
        this.f234594f += i;
        while (true) {
            int i5 = this.f234594f;
            int i6 = this.f234589a;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C80105c cVar2 = this.f234590b.get(0);
                int i8 = cVar2.f234597b;
                if (i8 <= i7) {
                    this.f234594f -= i8;
                    this.f234590b.remove(0);
                    int i9 = this.f234595g;
                    if (i9 < 5) {
                        C80105c[] cVarArr2 = this.f234591c;
                        this.f234595g = i9 + 1;
                        cVarArr2[i9] = cVar2;
                    }
                } else {
                    cVar2.f234597b = i8 - i7;
                    this.f234594f -= i7;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public float mo110347b(float f) {
        if (this.f234592d != 0) {
            Collections.sort(this.f234590b, f234588i);
            this.f234592d = 0;
        }
        float f2 = f * ((float) this.f234594f);
        int i = 0;
        for (int i2 = 0; i2 < this.f234590b.size(); i2++) {
            C80105c cVar = this.f234590b.get(i2);
            i += cVar.f234597b;
            if (((float) i) >= f2) {
                return cVar.f234598c;
            }
        }
        if (this.f234590b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<C80105c> arrayList = this.f234590b;
        return arrayList.get(arrayList.size() - 1).f234598c;
    }
}
