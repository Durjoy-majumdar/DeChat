package p683s0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108507n2;
import p175j0.C108511s1;
import p175j0.C108516z0;
import p175j0.C60647d0;
import p175j0.C60651e0;
import p175j0.C60690y0;
import p241t0.C110871u;

/* renamed from: s0.d */
public final class C110676d {

    /* renamed from: s0.d$a */
    public static final class C110677a extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C110688i f331087d;

        /* renamed from: e */
        public final /* synthetic */ String f331088e;

        /* renamed from: f */
        public final /* synthetic */ C60690y0<C36601l<T, Object>> f331089f;

        /* renamed from: g */
        public final /* synthetic */ T f331090g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110677a(C110688i iVar, String str, C60690y0<C36601l<T, Object>> y0Var, T t) {
            super(1);
            this.f331087d = iVar;
            this.f331088e = str;
            this.f331089f = y0Var;
            this.f331090g = t;
        }

        public Object invoke(Object obj) {
            String str;
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            C110674c cVar = new C110674c(this.f331089f, this.f331090g, this.f331087d);
            C110688i iVar = this.f331087d;
            Object invoke = cVar.invoke();
            if (invoke == null || iVar.mo60744a(invoke)) {
                return new C110673b(this.f331087d.mo60745b(this.f331088e, cVar));
            }
            if (invoke instanceof C110871u) {
                C110871u uVar = (C110871u) invoke;
                if (uVar.mo159364d() == C108516z0.f324839a || uVar.mo159364d() == C108507n2.f324831a || uVar.mo159364d() == C108511s1.f324833a) {
                    str = "MutableState containing " + uVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                str = invoke + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [fy3.a, java.lang.Object, fy3.a<? extends T>] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r4 == p175j0.C108504h.C60656a.f172772a) goto L_0x0076;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m150647a(java.lang.Object[] r4, p683s0.C36601l<T, ? extends java.lang.Object> r5, java.lang.String r6, fy3.C32224a<? extends T> r7, p175j0.C108504h r8, int r9, int r10) {
        /*
            java.lang.String r9 = "inputs"
            gy3.C87412m.m108594g(r4, r9)
            java.lang.String r9 = "init"
            gy3.C87412m.m108594g(r7, r9)
            r9 = 1059366159(0x3f24a50f, float:0.6431436)
            r8.mo51557H(r9)
            r9 = r10 & 2
            if (r9 == 0) goto L_0x0016
            s0.l<java.lang.Object, java.lang.Object> r5 = p683s0.C36602m.f97323a
        L_0x0016:
            r9 = r10 & 4
            r10 = 0
            if (r9 == 0) goto L_0x001c
            r6 = r10
        L_0x001c:
            r9 = 1059366416(0x3f24a610, float:0.6431589)
            r8.mo51557H(r9)
            r9 = 0
            if (r6 == 0) goto L_0x002e
            int r0 = r6.length()
            if (r0 != 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r0 = 0
            goto L_0x002f
        L_0x002e:
            r0 = 1
        L_0x002f:
            if (r0 != 0) goto L_0x0032
            goto L_0x0044
        L_0x0032:
            int r6 = r8.mo51563N()
            r0 = 36
            z04.C66713a.m78712a(r0)
            java.lang.String r6 = java.lang.Integer.toString(r6, r0)
            java.lang.String r0 = "toString(this, checkRadix(radix))"
            gy3.C87412m.m108593f(r6, r0)
        L_0x0044:
            r8.mo51565P()
            if (r5 == 0) goto L_0x00ee
            j0.f1<s0.i> r0 = p683s0.C110690k.f331112a
            java.lang.Object r0 = r8.mo51598m(r0)
            s0.i r0 = (p683s0.C110688i) r0
            int r1 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            r1 = -3685570(0xffffffffffc7c33e, float:NaN)
            r8.mo51557H(r1)
            int r1 = r4.length
            r2 = 0
        L_0x005e:
            if (r9 >= r1) goto L_0x006a
            r3 = r4[r9]
            int r9 = r9 + 1
            boolean r3 = r8.mo51619x(r3)
            r2 = r2 | r3
            goto L_0x005e
        L_0x006a:
            java.lang.Object r4 = r8.mo51606q()
            if (r2 != 0) goto L_0x0076
            int r9 = p175j0.C108504h.f324828a
            java.lang.Object r9 = p175j0.C108504h.C60656a.f172772a
            if (r4 != r9) goto L_0x008e
        L_0x0076:
            if (r0 != 0) goto L_0x007a
        L_0x0078:
            r4 = r10
            goto L_0x0085
        L_0x007a:
            java.lang.Object r4 = r0.mo60747d(r6)
            if (r4 != 0) goto L_0x0081
            goto L_0x0078
        L_0x0081:
            java.lang.Object r4 = r5.mo60750b(r4)
        L_0x0085:
            if (r4 != 0) goto L_0x008b
            java.lang.Object r4 = r7.invoke()
        L_0x008b:
            r8.mo51553F(r4)
        L_0x008e:
            r8.mo51565P()
            r7 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r8.mo51557H(r7)
            java.lang.Object r7 = r8.mo51606q()
            int r9 = p175j0.C108504h.f324828a
            java.lang.Object r9 = p175j0.C108504h.C60656a.f172772a
            if (r7 != r9) goto L_0x00a9
            r7 = 2
            j0.y0 r7 = p175j0.C108500f2.m146996c(r5, r10, r7, r10)
            r8.mo51553F(r7)
        L_0x00a9:
            r8.mo51565P()
            j0.y0 r7 = (p175j0.C60690y0) r7
            r7.setValue(r5)
            if (r0 == 0) goto L_0x00ea
            s0.d$a r5 = new s0.d$a
            r5.<init>(r0, r6, r7, r4)
            j0.e0 r7 = p175j0.C60655g0.f172771a
            r7 = -1239538271(0xffffffffb61e25a1, float:-2.3565738E-6)
            r8.mo51557H(r7)
            r7 = 1618982084(0x607fb4c4, float:7.370227E19)
            r8.mo51557H(r7)
            boolean r7 = r8.mo51619x(r0)
            boolean r6 = r8.mo51619x(r6)
            r6 = r6 | r7
            boolean r7 = r8.mo51619x(r4)
            r6 = r6 | r7
            java.lang.Object r7 = r8.mo51606q()
            if (r6 != 0) goto L_0x00dc
            if (r7 != r9) goto L_0x00e4
        L_0x00dc:
            j0.c0 r6 = new j0.c0
            r6.<init>(r5)
            r8.mo51553F(r6)
        L_0x00e4:
            r8.mo51565P()
            r8.mo51565P()
        L_0x00ea:
            r8.mo51565P()
            return r4
        L_0x00ee:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p683s0.C110676d.m150647a(java.lang.Object[], s0.l, java.lang.String, fy3.a, j0.h, int, int):java.lang.Object");
    }
}
