package sz3;

import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import sx3.C110818d0;
import sx3.C110821n;
import sx3.C110823p;
import sx3.C64177c;
import sx3.C64186f0;

/* renamed from: sz3.a */
public abstract class C110828a {

    /* renamed from: a */
    public final int[] f331564a;

    /* renamed from: b */
    public final int f331565b;

    /* renamed from: c */
    public final int f331566c;

    /* renamed from: d */
    public final int f331567d;

    /* renamed from: e */
    public final List<Integer> f331568e;

    public C110828a(int... iArr) {
        List<Integer> list;
        C87412m.m108594g(iArr, "numbers");
        this.f331564a = iArr;
        Integer G = C110823p.m150981G(iArr, 0);
        int i = -1;
        this.f331565b = G != null ? G.intValue() : -1;
        Integer G2 = C110823p.m150981G(iArr, 1);
        this.f331566c = G2 != null ? G2.intValue() : -1;
        Integer G3 = C110823p.m150981G(iArr, 2);
        this.f331567d = G3 != null ? G3.intValue() : i;
        if (iArr.length <= 3) {
            list = C64186f0.f181907d;
        } else if (iArr.length <= 1024) {
            list = C110818d0.m150953y0(((C64177c) C110821n.m150957d(iArr)).subList(3, iArr.length));
        } else {
            throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
        }
        this.f331568e = list;
    }

    /* renamed from: a */
    public final boolean mo162403a(int i, int i2, int i3) {
        int i4 = this.f331565b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f331566c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.f331567d >= i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo162404b(sz3.C110828a r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ourVersion"
            gy3.C87412m.m108594g(r5, r0)
            int r0 = r4.f331565b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0016
            int r0 = r5.f331565b
            if (r0 != 0) goto L_0x0021
            int r0 = r4.f331566c
            int r5 = r5.f331566c
            if (r0 != r5) goto L_0x0021
            goto L_0x0022
        L_0x0016:
            int r3 = r5.f331565b
            if (r0 != r3) goto L_0x0021
            int r0 = r4.f331566c
            int r5 = r5.f331566c
            if (r0 > r5) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sz3.C110828a.mo162404b(sz3.a):boolean");
    }

    public boolean equals(Object obj) {
        if (obj != null && C87412m.m108589b(getClass(), obj.getClass())) {
            C110828a aVar = (C110828a) obj;
            return this.f331565b == aVar.f331565b && this.f331566c == aVar.f331566c && this.f331567d == aVar.f331567d && C87412m.m108589b(this.f331568e, aVar.f331568e);
        }
    }

    public int hashCode() {
        int i = this.f331565b;
        int i2 = i + (i * 31) + this.f331566c;
        int i3 = i2 + (i2 * 31) + this.f331567d;
        return i3 + (i3 * 31) + this.f331568e.hashCode();
    }

    public String toString() {
        int[] iArr = this.f331564a;
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (!(i2 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList.isEmpty() ? "unknown" : C110818d0.m150921S(arrayList, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
    }
}
