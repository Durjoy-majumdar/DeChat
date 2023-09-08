package p735w1;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: w1.a */
public final class C37958a implements CharSequence {

    /* renamed from: d */
    public final String f100413d;

    /* renamed from: e */
    public final List<C37961b<C111699r>> f100414e;

    /* renamed from: f */
    public final List<C37961b<C37966k>> f100415f;

    /* renamed from: g */
    public final List<C37961b<? extends Object>> f100416g;

    public C37958a(String str, List<C37961b<C111699r>> list, List<C37961b<C37966k>> list2, List<? extends C37961b<? extends Object>> list3) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(list, "spanStyles");
        C87412m.m108594g(list2, "paragraphStyles");
        C87412m.m108594g(list3, "annotations");
        this.f100413d = str;
        this.f100414e = list;
        this.f100415f = list2;
        this.f100416g = list3;
        int size = list2.size();
        int i = -1;
        int i2 = 0;
        while (i2 < size) {
            C37961b bVar = list2.get(i2);
            boolean z = true;
            if (bVar.f100427b >= i) {
                if (bVar.f100428c > this.f100413d.length() ? false : z) {
                    i = bVar.f100428c;
                    i2++;
                } else {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + bVar.f100427b + ", " + bVar.f100428c + ") is out of boundary").toString());
                }
            } else {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    /* renamed from: a */
    public final C37958a mo61440a(C37958a aVar) {
        C87412m.m108594g(aVar, "other");
        C37959a aVar2 = new C37959a(this);
        aVar2.mo61450c(aVar);
        return aVar2.mo61453f();
    }

    /* renamed from: b */
    public C37958a subSequence(int i, int i2) {
        if (!(i <= i2)) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
        } else if (i == 0 && i2 == this.f100413d.length()) {
            return this;
        } else {
            String substring = this.f100413d.substring(i, i2);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new C37958a(substring, C37962b.m41689a(this.f100414e, i, i2), C37962b.m41689a(this.f100415f, i, i2), C37962b.m41689a(this.f100416g, i, i2));
        }
    }

    public final char charAt(int i) {
        return this.f100413d.charAt(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37958a)) {
            return false;
        }
        C37958a aVar = (C37958a) obj;
        return C87412m.m108589b(this.f100413d, aVar.f100413d) && C87412m.m108589b(this.f100414e, aVar.f100414e) && C87412m.m108589b(this.f100415f, aVar.f100415f) && C87412m.m108589b(this.f100416g, aVar.f100416g);
    }

    public int hashCode() {
        return (((((this.f100413d.hashCode() * 31) + this.f100414e.hashCode()) * 31) + this.f100415f.hashCode()) * 31) + this.f100416g.hashCode();
    }

    public final int length() {
        return this.f100413d.length();
    }

    public String toString() {
        return this.f100413d;
    }

    /* renamed from: w1.a$b */
    public static final class C37961b<T> {

        /* renamed from: a */
        public final T f100426a;

        /* renamed from: b */
        public final int f100427b;

        /* renamed from: c */
        public final int f100428c;

        /* renamed from: d */
        public final String f100429d;

        public C37961b(T t, int i, int i2, String str) {
            C87412m.m108594g(str, "tag");
            this.f100426a = t;
            this.f100427b = i;
            this.f100428c = i2;
            this.f100429d = str;
            if (!(i <= i2)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37961b)) {
                return false;
            }
            C37961b bVar = (C37961b) obj;
            return C87412m.m108589b(this.f100426a, bVar.f100426a) && this.f100427b == bVar.f100427b && this.f100428c == bVar.f100428c && C87412m.m108589b(this.f100429d, bVar.f100429d);
        }

        public int hashCode() {
            T t = this.f100426a;
            return ((((((t == null ? 0 : t.hashCode()) * 31) + this.f100427b) * 31) + this.f100428c) * 31) + this.f100429d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.f100426a + ", start=" + this.f100427b + ", end=" + this.f100428c + ", tag=" + this.f100429d + ')';
        }

        public C37961b(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    /* renamed from: w1.a$a */
    public static final class C37959a {

        /* renamed from: a */
        public final StringBuilder f100417a;

        /* renamed from: b */
        public final List<C37960a<C111699r>> f100418b;

        /* renamed from: c */
        public final List<C37960a<C37966k>> f100419c;

        /* renamed from: d */
        public final List<C37960a<? extends Object>> f100420d;

        /* renamed from: e */
        public final List<C37960a<? extends Object>> f100421e;

        public C37959a(int i, int i2, C8480h hVar) {
            this.f100417a = new StringBuilder((i2 & 1) != 0 ? 16 : i);
            this.f100418b = new ArrayList();
            this.f100419c = new ArrayList();
            this.f100420d = new ArrayList();
            this.f100421e = new ArrayList();
        }

        /* renamed from: a */
        public final void mo61448a(C111699r rVar, int i, int i2) {
            C87412m.m108594g(rVar, "style");
            ((ArrayList) this.f100418b).add(new C37960a(rVar, i, i2, (String) null, 8, (C8480h) null));
        }

        /* renamed from: b */
        public final void mo61449b(String str) {
            C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
            this.f100417a.append(str);
        }

        /* renamed from: c */
        public final void mo61450c(C37958a aVar) {
            C87412m.m108594g(aVar, MimeTypes.BASE_TYPE_TEXT);
            int length = this.f100417a.length();
            this.f100417a.append(aVar.f100413d);
            List<C37961b<C111699r>> list = aVar.f100414e;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C37961b bVar = list.get(i);
                mo61448a((C111699r) bVar.f100426a, bVar.f100427b + length, bVar.f100428c + length);
            }
            List<C37961b<C37966k>> list2 = aVar.f100415f;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C37961b bVar2 = list2.get(i2);
                C37966k kVar = (C37966k) bVar2.f100426a;
                int i3 = length + bVar2.f100428c;
                C87412m.m108594g(kVar, "style");
                ((ArrayList) this.f100419c).add(new C37960a(kVar, length + bVar2.f100427b, i3, (String) null, 8, (C8480h) null));
            }
            List<C37961b<? extends Object>> list3 = aVar.f100416g;
            int size3 = list3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                C37961b bVar3 = list3.get(i4);
                ((ArrayList) this.f100420d).add(new C37960a(bVar3.f100426a, bVar3.f100427b + length, bVar3.f100428c + length, bVar3.f100429d));
            }
        }

        /* renamed from: d */
        public final void mo61451d(int i) {
            if (i < ((ArrayList) this.f100421e).size()) {
                while (((ArrayList) this.f100421e).size() - 1 >= i) {
                    if (!((ArrayList) this.f100421e).isEmpty()) {
                        ArrayList arrayList = (ArrayList) this.f100421e;
                        ((C37960a) arrayList.remove(arrayList.size() - 1)).f100424c = this.f100417a.length();
                    } else {
                        throw new IllegalStateException("Nothing to pop.".toString());
                    }
                }
                return;
            }
            throw new IllegalStateException((i + " should be less than " + ((ArrayList) this.f100421e).size()).toString());
        }

        /* renamed from: e */
        public final int mo61452e(C111699r rVar) {
            C87412m.m108594g(rVar, "style");
            C37960a aVar = new C37960a(rVar, this.f100417a.length(), 0, (String) null, 12, (C8480h) null);
            ((ArrayList) this.f100421e).add(aVar);
            ((ArrayList) this.f100418b).add(aVar);
            return ((ArrayList) this.f100421e).size() - 1;
        }

        /* renamed from: f */
        public final C37958a mo61453f() {
            String sb = this.f100417a.toString();
            C87412m.m108593f(sb, "text.toString()");
            ArrayList arrayList = (ArrayList) this.f100418b;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(((C37960a) arrayList.get(i)).mo61454a(this.f100417a.length()));
            }
            ArrayList arrayList3 = (ArrayList) this.f100419c;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList4.add(((C37960a) arrayList3.get(i2)).mo61454a(this.f100417a.length()));
            }
            ArrayList arrayList5 = (ArrayList) this.f100420d;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size3 = arrayList5.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList6.add(((C37960a) arrayList5.get(i3)).mo61454a(this.f100417a.length()));
            }
            return new C37958a(sb, arrayList2, arrayList4, arrayList6);
        }

        /* renamed from: w1.a$a$a */
        public static final class C37960a<T> {

            /* renamed from: a */
            public final T f100422a;

            /* renamed from: b */
            public final int f100423b;

            /* renamed from: c */
            public int f100424c;

            /* renamed from: d */
            public final String f100425d;

            public C37960a(T t, int i, int i2, String str) {
                C87412m.m108594g(str, "tag");
                this.f100422a = t;
                this.f100423b = i;
                this.f100424c = i2;
                this.f100425d = str;
            }

            /* renamed from: a */
            public final C37961b<T> mo61454a(int i) {
                int i2 = this.f100424c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    return new C37961b<>(this.f100422a, this.f100423b, i, this.f100425d);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C37960a)) {
                    return false;
                }
                C37960a aVar = (C37960a) obj;
                return C87412m.m108589b(this.f100422a, aVar.f100422a) && this.f100423b == aVar.f100423b && this.f100424c == aVar.f100424c && C87412m.m108589b(this.f100425d, aVar.f100425d);
            }

            public int hashCode() {
                T t = this.f100422a;
                return ((((((t == null ? 0 : t.hashCode()) * 31) + this.f100423b) * 31) + this.f100424c) * 31) + this.f100425d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f100422a + ", start=" + this.f100423b + ", end=" + this.f100424c + ", tag=" + this.f100425d + ')';
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C37960a(Object obj, int i, int i2, String str, int i3, C8480h hVar) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C37959a(C37958a aVar) {
            this(0, 1, (C8480h) null);
            C87412m.m108594g(aVar, MimeTypes.BASE_TYPE_TEXT);
            mo61450c(aVar);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C37958a(java.lang.String r1, java.util.List r2, java.util.List r3, int r4, gy3.C8480h r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L_0x0006
            sx3.f0 r2 = sx3.C64186f0.f181907d
        L_0x0006:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x000c
            sx3.f0 r3 = sx3.C64186f0.f181907d
        L_0x000c:
            java.lang.String r4 = "text"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "spanStyles"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "paragraphStyles"
            gy3.C87412m.m108594g(r3, r4)
            sx3.f0 r4 = sx3.C64186f0.f181907d
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p735w1.C37958a.<init>(java.lang.String, java.util.List, java.util.List, int, gy3.h):void");
    }
}
