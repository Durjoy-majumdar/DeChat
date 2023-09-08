package p004b0;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import p004b0.C103943h;
import p1140p1.C110098d;
import p1140p1.C110100f;
import p560i2.C33183o;
import p631o1.C109831c;
import p631o1.C109834d;
import p721v0.C65503j;

/* renamed from: b0.i */
public final class C103945i implements C110098d<C109831c>, C109831c {

    /* renamed from: d */
    public final C103953l0 f307373d;

    /* renamed from: e */
    public final C103943h f307374e;

    /* renamed from: f */
    public final boolean f307375f;

    /* renamed from: g */
    public final C33183o f307376g;

    /* renamed from: b0.i$a */
    public static final class C103946a implements C109831c.C109832a {

        /* renamed from: a */
        public final /* synthetic */ C103945i f307377a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<C103943h.C103944a> f307378b;

        /* renamed from: c */
        public final /* synthetic */ int f307379c;

        public C103946a(C103945i iVar, C8479f0<C103943h.C103944a> f0Var, int i) {
            this.f307377a = iVar;
            this.f307378b = f0Var;
            this.f307379c = i;
        }

        /* renamed from: a */
        public boolean mo145568a() {
            return this.f307377a.mo145567d((C103943h.C103944a) this.f307378b.f27484d, this.f307379c);
        }
    }

    public C103945i(C103953l0 l0Var, C103943h hVar, boolean z, C33183o oVar) {
        C87412m.m108594g(l0Var, "state");
        C87412m.m108594g(hVar, "beyondBoundsInfo");
        C87412m.m108594g(oVar, "layoutDirection");
        this.f307373d = l0Var;
        this.f307374e = hVar;
        this.f307375f = z;
        this.f307376g = oVar;
    }

    /* renamed from: e */
    public static final boolean m138668e(C103943h.C103944a aVar, C103945i iVar) {
        return aVar.f307372b < iVar.f307373d.mo145573g().mo55834e() - 1;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (r7.f307375f != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        if (r7.f307375f != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        if (r7.f307375f != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r7.f307375f != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00aa, code lost:
        if (r7.f307375f != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00af, code lost:
        if (r7.f307375f != false) goto L_0x00b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e1 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo145566b(int r8, fy3.C32226l<? super p631o1.C109831c.C109832a, ? extends T> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "block"
            gy3.C87412m.m108594g(r9, r0)
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            b0.h r1 = r7.f307374e
            b0.l0 r2 = r7.f307373d
            int r2 = r2.mo145571e()
            b0.l0 r3 = r7.f307373d
            b0.x r3 = r3.mo145573g()
            java.util.List r3 = r3.mo55835f()
            java.lang.Object r3 = sx3.C110818d0.m150923U(r3)
            b0.k r3 = (p004b0.C54380k) r3
            int r3 = r3.getIndex()
            r1.getClass()
            b0.h$a r4 = new b0.h$a
            r4.<init>(r2, r3)
            k0.e<b0.h$a> r1 = r1.f307370a
            r1.mo159860b(r4)
            r0.f27484d = r4
            r1 = 0
        L_0x0036:
            java.lang.String r2 = "interval"
            if (r1 != 0) goto L_0x00f8
            T r3 = r0.f27484d
            b0.h$a r3 = (p004b0.C103943h.C103944a) r3
            boolean r3 = r7.mo145567d(r3, r8)
            if (r3 == 0) goto L_0x00f8
            T r1 = r0.f27484d
            b0.h$a r1 = (p004b0.C103943h.C103944a) r1
            int r3 = r1.f307371a
            int r1 = r1.f307372b
            r4 = 0
            r5 = 1
            if (r8 != r5) goto L_0x0052
            r6 = 1
            goto L_0x0053
        L_0x0052:
            r6 = 0
        L_0x0053:
            if (r6 == 0) goto L_0x0057
            goto L_0x00b1
        L_0x0057:
            r6 = 2
            if (r8 != r6) goto L_0x005c
            r6 = 1
            goto L_0x005d
        L_0x005c:
            r6 = 0
        L_0x005d:
            if (r6 == 0) goto L_0x0060
            goto L_0x00b4
        L_0x0060:
            r6 = 5
            if (r8 != r6) goto L_0x0065
            r6 = 1
            goto L_0x0066
        L_0x0065:
            r6 = 0
        L_0x0066:
            if (r6 == 0) goto L_0x006d
            boolean r4 = r7.f307375f
            if (r4 == 0) goto L_0x00b1
            goto L_0x00b4
        L_0x006d:
            r6 = 6
            if (r8 != r6) goto L_0x0072
            r6 = 1
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            if (r6 == 0) goto L_0x007a
            boolean r4 = r7.f307375f
            if (r4 == 0) goto L_0x00b4
            goto L_0x00b1
        L_0x007a:
            r6 = 3
            if (r8 != r6) goto L_0x007f
            r6 = 1
            goto L_0x0080
        L_0x007f:
            r6 = 0
        L_0x0080:
            if (r6 == 0) goto L_0x0097
            i2.o r4 = r7.f307376g
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x0092
            if (r4 == r5) goto L_0x008d
            goto L_0x00b6
        L_0x008d:
            boolean r4 = r7.f307375f
            if (r4 == 0) goto L_0x00b4
            goto L_0x00b1
        L_0x0092:
            boolean r4 = r7.f307375f
            if (r4 == 0) goto L_0x00b1
            goto L_0x00b4
        L_0x0097:
            r6 = 4
            if (r8 != r6) goto L_0x009b
            r4 = 1
        L_0x009b:
            if (r4 == 0) goto L_0x00ec
            i2.o r4 = r7.f307376g
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x00ad
            if (r4 == r5) goto L_0x00a8
            goto L_0x00b6
        L_0x00a8:
            boolean r4 = r7.f307375f
            if (r4 == 0) goto L_0x00b1
            goto L_0x00b4
        L_0x00ad:
            boolean r4 = r7.f307375f
            if (r4 == 0) goto L_0x00b4
        L_0x00b1:
            int r3 = r3 + -1
            goto L_0x00b6
        L_0x00b4:
            int r1 = r1 + 1
        L_0x00b6:
            b0.h r4 = r7.f307374e
            r4.getClass()
            b0.h$a r5 = new b0.h$a
            r5.<init>(r3, r1)
            k0.e<b0.h$a> r1 = r4.f307370a
            r1.mo159860b(r5)
            b0.h r1 = r7.f307374e
            T r3 = r0.f27484d
            b0.h$a r3 = (p004b0.C103943h.C103944a) r3
            r1.getClass()
            gy3.C87412m.m108594g(r3, r2)
            k0.e<b0.h$a> r1 = r1.f307370a
            r1.mo159869k(r3)
            r0.f27484d = r5
            b0.l0 r1 = r7.f307373d
            o1.p0 r1 = r1.f307426k
            if (r1 == 0) goto L_0x00e1
            r1.mo161184f()
        L_0x00e1:
            b0.i$a r1 = new b0.i$a
            r1.<init>(r7, r0, r8)
            java.lang.Object r1 = r9.invoke(r1)
            goto L_0x0036
        L_0x00ec:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x00f8:
            b0.h r8 = r7.f307374e
            T r9 = r0.f27484d
            b0.h$a r9 = (p004b0.C103943h.C103944a) r9
            r8.getClass()
            gy3.C87412m.m108594g(r9, r2)
            k0.e<b0.h$a> r8 = r8.f307370a
            r8.mo159869k(r9)
            b0.l0 r8 = r7.f307373d
            o1.p0 r8 = r8.f307426k
            if (r8 == 0) goto L_0x0112
            r8.mo161184f()
        L_0x0112:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p004b0.C103945i.mo145566b(int, fy3.l):java.lang.Object");
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x00af A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo145567d(p004b0.C103943h.C103944a r4, int r5) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r5 != r1) goto L_0x0006
            r2 = 1
            goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            if (r2 == 0) goto L_0x000f
            int r4 = r4.f307371a
            if (r4 <= 0) goto L_0x00b5
            goto L_0x00af
        L_0x000f:
            r2 = 2
            if (r5 != r2) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            if (r2 == 0) goto L_0x001d
            boolean r0 = m138668e(r4, r3)
            goto L_0x00b5
        L_0x001d:
            r2 = 5
            if (r5 != r2) goto L_0x0022
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r2 == 0) goto L_0x0035
            boolean r5 = r3.f307375f
            if (r5 == 0) goto L_0x002f
            boolean r0 = m138668e(r4, r3)
            goto L_0x00b5
        L_0x002f:
            int r4 = r4.f307371a
            if (r4 <= 0) goto L_0x00b5
            goto L_0x00af
        L_0x0035:
            r2 = 6
            if (r5 != r2) goto L_0x003a
            r2 = 1
            goto L_0x003b
        L_0x003a:
            r2 = 0
        L_0x003b:
            if (r2 == 0) goto L_0x004d
            boolean r5 = r3.f307375f
            if (r5 == 0) goto L_0x0047
            int r4 = r4.f307371a
            if (r4 <= 0) goto L_0x00b5
            goto L_0x00af
        L_0x0047:
            boolean r0 = m138668e(r4, r3)
            goto L_0x00b5
        L_0x004d:
            r2 = 3
            if (r5 != r2) goto L_0x0052
            r2 = 1
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            if (r2 == 0) goto L_0x0081
            i2.o r5 = r3.f307376g
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0073
            if (r5 != r1) goto L_0x006d
            boolean r5 = r3.f307375f
            if (r5 == 0) goto L_0x0068
            int r4 = r4.f307371a
            if (r4 <= 0) goto L_0x00b5
            goto L_0x00af
        L_0x0068:
            boolean r0 = m138668e(r4, r3)
            goto L_0x00b5
        L_0x006d:
            rx3.j r4 = new rx3.j
            r4.<init>()
            throw r4
        L_0x0073:
            boolean r5 = r3.f307375f
            if (r5 == 0) goto L_0x007c
            boolean r0 = m138668e(r4, r3)
            goto L_0x00b5
        L_0x007c:
            int r4 = r4.f307371a
            if (r4 <= 0) goto L_0x00b5
            goto L_0x00af
        L_0x0081:
            r2 = 4
            if (r5 != r2) goto L_0x0086
            r5 = 1
            goto L_0x0087
        L_0x0086:
            r5 = 0
        L_0x0087:
            if (r5 == 0) goto L_0x00b6
            i2.o r5 = r3.f307376g
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x00a7
            if (r5 != r1) goto L_0x00a1
            boolean r5 = r3.f307375f
            if (r5 == 0) goto L_0x009c
            boolean r0 = m138668e(r4, r3)
            goto L_0x00b5
        L_0x009c:
            int r4 = r4.f307371a
            if (r4 <= 0) goto L_0x00b5
            goto L_0x00af
        L_0x00a1:
            rx3.j r4 = new rx3.j
            r4.<init>()
            throw r4
        L_0x00a7:
            boolean r5 = r3.f307375f
            if (r5 == 0) goto L_0x00b1
            int r4 = r4.f307371a
            if (r4 <= 0) goto L_0x00b5
        L_0x00af:
            r0 = 1
            goto L_0x00b5
        L_0x00b1:
            boolean r0 = m138668e(r4, r3)
        L_0x00b5:
            return r0
        L_0x00b6:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p004b0.C103945i.mo145567d(b0.h$a, int):boolean");
    }

    public C110100f<C109831c> getKey() {
        return C109834d.f328759a;
    }

    public Object getValue() {
        return this;
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }
}
