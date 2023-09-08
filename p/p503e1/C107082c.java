package p503e1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p436a1.C103272w;
import p560i2.C108325f;
import rx3.C90109v;
import sx3.C64186f0;

/* renamed from: e1.c */
public final class C107082c {

    /* renamed from: a */
    public final String f320543a;

    /* renamed from: b */
    public final float f320544b;

    /* renamed from: c */
    public final float f320545c;

    /* renamed from: d */
    public final float f320546d;

    /* renamed from: e */
    public final float f320547e;

    /* renamed from: f */
    public final C107123l f320548f;

    /* renamed from: g */
    public final long f320549g;

    /* renamed from: h */
    public final int f320550h;

    /* renamed from: i */
    public final boolean f320551i;

    /* renamed from: e1.c$a */
    public static final class C107083a {

        /* renamed from: a */
        public final String f320552a;

        /* renamed from: b */
        public final float f320553b;

        /* renamed from: c */
        public final float f320554c;

        /* renamed from: d */
        public final float f320555d;

        /* renamed from: e */
        public final float f320556e;

        /* renamed from: f */
        public final long f320557f;

        /* renamed from: g */
        public final int f320558g;

        /* renamed from: h */
        public final boolean f320559h;

        /* renamed from: i */
        public final ArrayList<C107084a> f320560i;

        /* renamed from: j */
        public C107084a f320561j;

        /* renamed from: k */
        public boolean f320562k;

        /* renamed from: e1.c$a$a */
        public static final class C107084a {

            /* renamed from: a */
            public String f320563a;

            /* renamed from: b */
            public float f320564b;

            /* renamed from: c */
            public float f320565c;

            /* renamed from: d */
            public float f320566d;

            /* renamed from: e */
            public float f320567e;

            /* renamed from: f */
            public float f320568f;

            /* renamed from: g */
            public float f320569g;

            /* renamed from: h */
            public float f320570h;

            /* renamed from: i */
            public List<? extends C31381e> f320571i;

            /* renamed from: j */
            public List<C107126n> f320572j;

            public C107084a() {
                this((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, (List) null, 1023, (C8480h) null);
            }

            public C107084a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends C31381e> list, List<C107126n> list2, int i, C8480h hVar) {
                str = (i & 1) != 0 ? "" : str;
                f = (i & 2) != 0 ? 0.0f : f;
                f2 = (i & 4) != 0 ? 0.0f : f2;
                f3 = (i & 8) != 0 ? 0.0f : f3;
                f4 = (i & 16) != 0 ? 1.0f : f4;
                f5 = (i & 32) != 0 ? 1.0f : f5;
                f6 = (i & 64) != 0 ? 0.0f : f6;
                f7 = (i & 128) != 0 ? 0.0f : f7;
                if ((i & 256) != 0) {
                    int i2 = C107125m.f320673a;
                    list = C64186f0.f181907d;
                }
                list2 = (i & 512) != 0 ? new ArrayList<>() : list2;
                C87412m.m108594g(str, "name");
                C87412m.m108594g(list, "clipPathData");
                C87412m.m108594g(list2, "children");
                this.f320563a = str;
                this.f320564b = f;
                this.f320565c = f2;
                this.f320566d = f3;
                this.f320567e = f4;
                this.f320568f = f5;
                this.f320569g = f6;
                this.f320570h = f7;
                this.f320571i = list;
                this.f320572j = list2;
            }
        }

        public C107083a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2, C8480h hVar) {
            long j2;
            int i3 = i2;
            String str2 = (i3 & 1) != 0 ? "" : str;
            if ((i3 & 32) != 0) {
                int i4 = C103272w.f304516h;
                j2 = C103272w.f304515g;
            } else {
                j2 = j;
            }
            int i5 = (i3 & 64) != 0 ? 5 : i;
            boolean z2 = (i3 & 128) != 0 ? false : z;
            this.f320552a = str2;
            this.f320553b = f;
            this.f320554c = f2;
            this.f320555d = f3;
            this.f320556e = f4;
            this.f320557f = j2;
            this.f320558g = i5;
            this.f320559h = z2;
            ArrayList<C107084a> arrayList = new ArrayList<>();
            this.f320560i = arrayList;
            C107084a aVar = new C107084a((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, (List) null, 1023, (C8480h) null);
            this.f320561j = aVar;
            arrayList.add(aVar);
        }

        /* renamed from: a */
        public final C107083a mo157542a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends C31381e> list) {
            String str2 = str;
            C87412m.m108594g(str2, "name");
            List<? extends C31381e> list2 = list;
            C87412m.m108594g(list2, "clipPathData");
            mo157544c();
            this.f320560i.add(new C107084a(str2, f, f2, f3, f4, f5, f6, f7, list2, (List) null, 512, (C8480h) null));
            return this;
        }

        /* renamed from: b */
        public final C107083a mo157543b() {
            mo157544c();
            ArrayList<C107084a> arrayList = this.f320560i;
            C107084a remove = arrayList.remove(arrayList.size() - 1);
            ArrayList<C107084a> arrayList2 = this.f320560i;
            arrayList2.get(arrayList2.size() - 1).f320572j.add(new C107123l(remove.f320563a, remove.f320564b, remove.f320565c, remove.f320566d, remove.f320567e, remove.f320568f, remove.f320569g, remove.f320570h, remove.f320571i, remove.f320572j));
            return this;
        }

        /* renamed from: c */
        public final void mo157544c() {
            if (!(!this.f320562k)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }
    }

    public C107082c(String str, float f, float f2, float f3, float f4, C107123l lVar, long j, int i, boolean z, C8480h hVar) {
        this.f320543a = str;
        this.f320544b = f;
        this.f320545c = f2;
        this.f320546d = f3;
        this.f320547e = f4;
        this.f320548f = lVar;
        this.f320549g = j;
        this.f320550h = i;
        this.f320551i = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107082c)) {
            return false;
        }
        C107082c cVar = (C107082c) obj;
        if (!C87412m.m108589b(this.f320543a, cVar.f320543a) || !C108325f.m146734a(this.f320544b, cVar.f320544b) || !C108325f.m146734a(this.f320545c, cVar.f320545c)) {
            return false;
        }
        if (!(this.f320546d == cVar.f320546d)) {
            return false;
        }
        if (!(this.f320547e == cVar.f320547e) || !C87412m.m108589b(this.f320548f, cVar.f320548f) || !C103272w.m136781c(this.f320549g, cVar.f320549g)) {
            return false;
        }
        return (this.f320550h == cVar.f320550h) && this.f320551i == cVar.f320551i;
    }

    public int hashCode() {
        long j = this.f320549g;
        int i = C103272w.f304516h;
        return (((((((((((((((this.f320543a.hashCode() * 31) + Float.floatToIntBits(this.f320544b)) * 31) + Float.floatToIntBits(this.f320545c)) * 31) + Float.floatToIntBits(this.f320546d)) * 31) + Float.floatToIntBits(this.f320547e)) * 31) + this.f320548f.hashCode()) * 31) + C90109v.m112737a(j)) * 31) + this.f320550h) * 31) + (this.f320551i ? 1231 : 1237);
    }
}
