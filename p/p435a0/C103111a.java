package p435a0;

import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import p560i2.C108322d;
import p560i2.C108325f;
import p560i2.C33183o;
import p721v0.C111294a;

/* renamed from: a0.a */
public final class C103111a {

    /* renamed from: a */
    public static final C103111a f304234a = new C103111a();

    /* renamed from: b */
    public static final C103115d f304235b = new C103121j();

    /* renamed from: c */
    public static final C103115d f304236c = new C103114c();

    /* renamed from: d */
    public static final C103123l f304237d = new C103122k();

    /* renamed from: e */
    public static final C103123l f304238e = new C103112a();

    /* renamed from: f */
    public static final C103116e f304239f = new C103113b();

    /* renamed from: g */
    public static final C103116e f304240g = new C103119h();

    /* renamed from: h */
    public static final C103116e f304241h = new C103118g();

    /* renamed from: i */
    public static final C103116e f304242i = new C103117f();

    /* renamed from: a0.a$a */
    public static final class C103112a implements C103123l {
        /* renamed from: a */
        public float mo142862a() {
            return (float) 0;
        }

        /* renamed from: b */
        public void mo142863b(C108322d dVar, int i, int[] iArr, int[] iArr2) {
            C87412m.m108594g(dVar, "<this>");
            C87412m.m108594g(iArr, "sizes");
            C87412m.m108594g(iArr2, "outPositions");
            C103111a.f304234a.mo142857c(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* renamed from: a0.a$b */
    public static final class C103113b implements C103116e {

        /* renamed from: a */
        public final float f304243a = ((float) 0);

        /* renamed from: a */
        public float mo142862a() {
            return this.f304243a;
        }

        /* renamed from: b */
        public void mo142863b(C108322d dVar, int i, int[] iArr, int[] iArr2) {
            C87412m.m108594g(dVar, "<this>");
            C87412m.m108594g(iArr, "sizes");
            C87412m.m108594g(iArr2, "outPositions");
            C103111a.f304234a.mo142855a(i, iArr, iArr2, false);
        }

        /* renamed from: c */
        public void mo142865c(C108322d dVar, int i, int[] iArr, C33183o oVar, int[] iArr2) {
            C87412m.m108594g(dVar, "<this>");
            C87412m.m108594g(iArr, "sizes");
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(iArr2, "outPositions");
            if (oVar == C33183o.Ltr) {
                C103111a.f304234a.mo142855a(i, iArr, iArr2, false);
            } else {
                C103111a.f304234a.mo142855a(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* renamed from: a0.a$c */
    public static final class C103114c implements C103115d {
        /* renamed from: a */
        public float mo142862a() {
            return (float) 0;
        }

        /* renamed from: c */
        public void mo142865c(C108322d dVar, int i, int[] iArr, C33183o oVar, int[] iArr2) {
            C87412m.m108594g(dVar, "<this>");
            C87412m.m108594g(iArr, "sizes");
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(iArr2, "outPositions");
            if (oVar == C33183o.Ltr) {
                C103111a.f304234a.mo142857c(i, iArr, iArr2, false);
            } else {
                C103111a.f304234a.mo142856b(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    /* renamed from: a0.a$d */
    public interface C103115d {
        /* renamed from: a */
        float mo142862a();

        /* renamed from: c */
        void mo142865c(C108322d dVar, int i, int[] iArr, C33183o oVar, int[] iArr2);
    }

    /* renamed from: a0.a$e */
    public interface C103116e extends C103115d, C103123l {
    }

    /* renamed from: a0.a$f */
    public static final class C103117f implements C103116e {

        /* renamed from: a */
        public final float f304244a = ((float) 0);

        /* renamed from: a */
        public float mo142862a() {
            return this.f304244a;
        }

        /* renamed from: b */
        public void mo142863b(C108322d dVar, int i, int[] iArr, int[] iArr2) {
            C87412m.m108594g(dVar, "<this>");
            C87412m.m108594g(iArr, "sizes");
            C87412m.m108594g(iArr2, "outPositions");
            C103111a.f304234a.mo142858d(i, iArr, iArr2, false);
        }

        /* renamed from: c */
        public void mo142865c(C108322d dVar, int i, int[] iArr, C33183o oVar, int[] iArr2) {
            C87412m.m108594g(dVar, "<this>");
            C87412m.m108594g(iArr, "sizes");
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(iArr2, "outPositions");
            if (oVar == C33183o.Ltr) {
                C103111a.f304234a.mo142858d(i, iArr, iArr2, false);
            } else {
                C103111a.f304234a.mo142858d(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* renamed from: a0.a$g */
    public static final class C103118g implements C103116e {

        /* renamed from: a */
        public final float f304245a = ((float) 0);

        /* renamed from: a */
        public float mo142862a() {
            return this.f304245a;
        }

        /* renamed from: b */
        public void mo142863b(C108322d dVar, int i, int[] iArr, int[] iArr2) {
            C87412m.m108594g(dVar, "<this>");
            C87412m.m108594g(iArr, "sizes");
            C87412m.m108594g(iArr2, "outPositions");
            C103111a.f304234a.mo142859e(i, iArr, iArr2, false);
        }

        /* renamed from: c */
        public void mo142865c(C108322d dVar, int i, int[] iArr, C33183o oVar, int[] iArr2) {
            C87412m.m108594g(dVar, "<this>");
            C87412m.m108594g(iArr, "sizes");
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(iArr2, "outPositions");
            if (oVar == C33183o.Ltr) {
                C103111a.f304234a.mo142859e(i, iArr, iArr2, false);
            } else {
                C103111a.f304234a.mo142859e(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* renamed from: a0.a$h */
    public static final class C103119h implements C103116e {

        /* renamed from: a */
        public final float f304246a = ((float) 0);

        /* renamed from: a */
        public float mo142862a() {
            return this.f304246a;
        }

        /* renamed from: b */
        public void mo142863b(C108322d dVar, int i, int[] iArr, int[] iArr2) {
            C87412m.m108594g(dVar, "<this>");
            C87412m.m108594g(iArr, "sizes");
            C87412m.m108594g(iArr2, "outPositions");
            C103111a.f304234a.mo142860f(i, iArr, iArr2, false);
        }

        /* renamed from: c */
        public void mo142865c(C108322d dVar, int i, int[] iArr, C33183o oVar, int[] iArr2) {
            C87412m.m108594g(dVar, "<this>");
            C87412m.m108594g(iArr, "sizes");
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(iArr2, "outPositions");
            if (oVar == C33183o.Ltr) {
                C103111a.f304234a.mo142860f(i, iArr, iArr2, false);
            } else {
                C103111a.f304234a.mo142860f(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* renamed from: a0.a$i */
    public static final class C103120i implements C103116e {

        /* renamed from: a */
        public final float f304247a;

        /* renamed from: b */
        public final boolean f304248b;

        /* renamed from: c */
        public final C32227p<Integer, C33183o, Integer> f304249c;

        /* renamed from: d */
        public final float f304250d;

        public C103120i(float f, boolean z, C32227p pVar, C8480h hVar) {
            this.f304247a = f;
            this.f304248b = z;
            this.f304249c = pVar;
            this.f304250d = f;
        }

        /* renamed from: a */
        public float mo142862a() {
            return this.f304250d;
        }

        /* renamed from: b */
        public void mo142863b(C108322d dVar, int i, int[] iArr, int[] iArr2) {
            C87412m.m108594g(dVar, "<this>");
            C87412m.m108594g(iArr, "sizes");
            C87412m.m108594g(iArr2, "outPositions");
            mo142865c(dVar, i, iArr, C33183o.Ltr, iArr2);
        }

        /* renamed from: c */
        public void mo142865c(C108322d dVar, int i, int[] iArr, C33183o oVar, int[] iArr2) {
            int i2;
            int i3;
            C87412m.m108594g(dVar, "<this>");
            C87412m.m108594g(iArr, "sizes");
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(iArr2, "outPositions");
            if (!(iArr.length == 0)) {
                int M = dVar.mo143032M(this.f304247a);
                boolean z = this.f304248b && oVar == C33183o.Rtl;
                C103111a aVar = C103111a.f304234a;
                if (!z) {
                    int length = iArr.length;
                    int i4 = 0;
                    i3 = 0;
                    i2 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        int i6 = iArr[i4];
                        int min = Math.min(i3, i - i6);
                        iArr2[i5] = min;
                        int min2 = Math.min(M, (i - min) - i6);
                        int i7 = iArr2[i5] + i6 + min2;
                        i4++;
                        i5++;
                        int i8 = i7;
                        i2 = min2;
                        i3 = i8;
                    }
                } else {
                    int i9 = 0;
                    int i15 = 0;
                    for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                        int i16 = iArr[length2];
                        int min3 = Math.min(i3, i - i16);
                        iArr2[length2] = min3;
                        i15 = Math.min(M, (i - min3) - i16);
                        i9 = iArr2[length2] + i16 + i15;
                    }
                }
                int i17 = i3 - i2;
                C32227p<Integer, C33183o, Integer> pVar = this.f304249c;
                if (pVar != null && i17 < i) {
                    int intValue = pVar.invoke(Integer.valueOf(i - i17), oVar).intValue();
                    int length3 = iArr2.length;
                    for (int i18 = 0; i18 < length3; i18++) {
                        iArr2[i18] = iArr2[i18] + intValue;
                    }
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C103120i)) {
                return false;
            }
            C103120i iVar = (C103120i) obj;
            return C108325f.m146734a(this.f304247a, iVar.f304247a) && this.f304248b == iVar.f304248b && C87412m.m108589b(this.f304249c, iVar.f304249c);
        }

        public int hashCode() {
            int floatToIntBits = Float.floatToIntBits(this.f304247a) * 31;
            boolean z = this.f304248b;
            if (z) {
                z = true;
            }
            int i = (floatToIntBits + (z ? 1 : 0)) * 31;
            C32227p<Integer, C33183o, Integer> pVar = this.f304249c;
            return i + (pVar == null ? 0 : pVar.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f304248b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append(C108325f.m146735b(this.f304247a));
            sb.append(", ");
            sb.append(this.f304249c);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: a0.a$j */
    public static final class C103121j implements C103115d {
        /* renamed from: a */
        public float mo142862a() {
            return (float) 0;
        }

        /* renamed from: c */
        public void mo142865c(C108322d dVar, int i, int[] iArr, C33183o oVar, int[] iArr2) {
            C87412m.m108594g(dVar, "<this>");
            C87412m.m108594g(iArr, "sizes");
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(iArr2, "outPositions");
            if (oVar == C33183o.Ltr) {
                C103111a.f304234a.mo142856b(iArr, iArr2, false);
            } else {
                C103111a.f304234a.mo142857c(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* renamed from: a0.a$k */
    public static final class C103122k implements C103123l {
        /* renamed from: a */
        public float mo142862a() {
            return (float) 0;
        }

        /* renamed from: b */
        public void mo142863b(C108322d dVar, int i, int[] iArr, int[] iArr2) {
            C87412m.m108594g(dVar, "<this>");
            C87412m.m108594g(iArr, "sizes");
            C87412m.m108594g(iArr2, "outPositions");
            C103111a.f304234a.mo142856b(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* renamed from: a0.a$l */
    public interface C103123l {
        /* renamed from: a */
        float mo142862a();

        /* renamed from: b */
        void mo142863b(C108322d dVar, int i, int[] iArr, int[] iArr2);
    }

    /* renamed from: a0.a$m */
    public static final class C103124m extends C87413o implements C32227p<Integer, C33183o, Integer> {

        /* renamed from: d */
        public static final C103124m f304251d = new C103124m();

        public C103124m() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            C33183o oVar = (C33183o) obj2;
            C87412m.m108594g(oVar, "layoutDirection");
            int i = C111294a.f333218a;
            float f = ((float) (intValue + 0)) / 2.0f;
            float f2 = -1.0f;
            if (oVar != C33183o.Ltr) {
                f2 = -1.0f * ((float) -1);
            }
            return Integer.valueOf(C60641c.m70921b(f * (((float) 1) + f2)));
        }
    }

    /* renamed from: a */
    public final void mo142855a(int i, int[] iArr, int[] iArr2, boolean z) {
        C87412m.m108594g(iArr, "size");
        C87412m.m108594g(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = ((float) (i - i3)) / ((float) 2);
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = C60641c.m70921b(f);
                f += (float) i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i7 = iArr[length2];
                iArr2[length2] = C60641c.m70921b(f);
                f += (float) i7;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo142856b(int[] iArr, int[] iArr2, boolean z) {
        C87412m.m108594g(iArr, "size");
        C87412m.m108594g(iArr2, "outPosition");
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i5 = iArr[length2];
                iArr2[length2] = i;
                i += i5;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo142857c(int i, int[] iArr, int[] iArr2, boolean z) {
        C87412m.m108594g(iArr, "size");
        C87412m.m108594g(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i8 = iArr[length2];
                iArr2[length2] = i5;
                i5 += i8;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final void mo142858d(int i, int[] iArr, int[] iArr2, boolean z) {
        C87412m.m108594g(iArr, "size");
        C87412m.m108594g(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (iArr.length == 0) ^ true ? ((float) (i - i3)) / ((float) iArr.length) : 0.0f;
        float f = length / ((float) 2);
        if (!z) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = C60641c.m70921b(f);
                f += ((float) i6) + length;
                i2++;
                i5++;
            }
            return;
        }
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            iArr2[length3] = C60641c.m70921b(f);
            f += ((float) i7) + length;
        }
    }

    /* renamed from: e */
    public final void mo142859e(int i, int[] iArr, int[] iArr2, boolean z) {
        C87412m.m108594g(iArr, "size");
        C87412m.m108594g(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = 0.0f;
        float length = iArr.length > 1 ? ((float) (i - i3)) / ((float) (iArr.length - 1)) : 0.0f;
        if (!z) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = C60641c.m70921b(f);
                f += ((float) i6) + length;
                i2++;
                i5++;
            }
            return;
        }
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            iArr2[length3] = C60641c.m70921b(f);
            f += ((float) i7) + length;
        }
    }

    /* renamed from: f */
    public final void mo142860f(int i, int[] iArr, int[] iArr2, boolean z) {
        C87412m.m108594g(iArr, "size");
        C87412m.m108594g(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = ((float) (i - i3)) / ((float) (iArr.length + 1));
        if (!z) {
            int length2 = iArr.length;
            float f = length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = C60641c.m70921b(f);
                f += ((float) i6) + length;
                i2++;
                i5++;
            }
            return;
        }
        float f2 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            iArr2[length3] = C60641c.m70921b(f2);
            f2 += ((float) i7) + length;
        }
    }

    /* renamed from: g */
    public final C103116e mo142861g(float f) {
        return new C103120i(f, true, C103124m.f304251d, (C8480h) null);
    }
}
