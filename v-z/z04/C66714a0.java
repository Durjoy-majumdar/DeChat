package z04;

import fy3.C32227p;
import gy3.C87413o;
import java.util.List;
import rx3.C13604l;

/* renamed from: z04.a0 */
public final class C66714a0 extends C87413o implements C32227p<CharSequence, Integer, C13604l<? extends Integer, ? extends Integer>> {

    /* renamed from: d */
    public final /* synthetic */ List<String> f191749d;

    /* renamed from: e */
    public final /* synthetic */ boolean f191750e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66714a0(List<String> list, boolean z) {
        super(2);
        this.f191749d = list;
        this.f191750e = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r2 = r15.intValue()
            java.lang.String r15 = "$this$$receiver"
            gy3.C87412m.m108594g(r14, r15)
            java.util.List<java.lang.String> r15 = r13.f191749d
            boolean r9 = r13.f191750e
            r10 = 0
            if (r9 != 0) goto L_0x0039
            int r0 = r15.size()
            r1 = 1
            if (r0 != r1) goto L_0x0039
            java.lang.Object r15 = sx3.C110818d0.m150937i0(r15)
            java.lang.String r15 = (java.lang.String) r15
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r14
            r1 = r15
            int r14 = z04.C112550d0.m153769E(r0, r1, r2, r3, r4, r5)
            if (r14 >= 0) goto L_0x002e
            goto L_0x00ca
        L_0x002e:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            rx3.l r0 = new rx3.l
            r0.<init>(r14, r15)
            goto L_0x00cb
        L_0x0039:
            my3.j r0 = new my3.j
            if (r2 >= 0) goto L_0x003e
            r2 = 0
        L_0x003e:
            int r1 = r14.length()
            r0.<init>(r2, r1)
            boolean r1 = r14 instanceof java.lang.String
            if (r1 == 0) goto L_0x008a
            int r1 = r0.f175175e
            int r0 = r0.f175176f
            if (r0 <= 0) goto L_0x0051
            if (r2 <= r1) goto L_0x0055
        L_0x0051:
            if (r0 >= 0) goto L_0x00ca
            if (r1 > r2) goto L_0x00ca
        L_0x0055:
            java.util.Iterator r11 = r15.iterator()
        L_0x0059:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x0077
            java.lang.Object r12 = r11.next()
            r3 = r12
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r5 = r14
            java.lang.String r5 = (java.lang.String) r5
            int r7 = r3.length()
            r6 = r2
            r8 = r9
            boolean r3 = z04.C112551y.m153812l(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L_0x0059
            goto L_0x0078
        L_0x0077:
            r12 = r10
        L_0x0078:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x0086
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            rx3.l r0 = new rx3.l
            r0.<init>(r14, r12)
            goto L_0x00cb
        L_0x0086:
            if (r2 == r1) goto L_0x00ca
            int r2 = r2 + r0
            goto L_0x0055
        L_0x008a:
            int r6 = r0.f175175e
            int r7 = r0.f175176f
            if (r7 <= 0) goto L_0x0092
            if (r2 <= r6) goto L_0x0096
        L_0x0092:
            if (r7 >= 0) goto L_0x00ca
            if (r6 > r2) goto L_0x00ca
        L_0x0096:
            r8 = r2
        L_0x0097:
            java.util.Iterator r11 = r15.iterator()
        L_0x009b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r12 = r11.next()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            int r4 = r0.length()
            r2 = r14
            r3 = r8
            r5 = r9
            boolean r0 = z04.C112550d0.m153776L(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x009b
            goto L_0x00b8
        L_0x00b7:
            r12 = r10
        L_0x00b8:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00c6
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            rx3.l r0 = new rx3.l
            r0.<init>(r14, r12)
            goto L_0x00cb
        L_0x00c6:
            if (r8 == r6) goto L_0x00ca
            int r8 = r8 + r7
            goto L_0x0097
        L_0x00ca:
            r0 = r10
        L_0x00cb:
            if (r0 == 0) goto L_0x00e0
            A r14 = r0.f38555d
            B r15 = r0.f38556e
            java.lang.String r15 = (java.lang.String) r15
            int r15 = r15.length()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            rx3.l r10 = new rx3.l
            r10.<init>(r14, r15)
        L_0x00e0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z04.C66714a0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
