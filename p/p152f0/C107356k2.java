package p152f0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p1166z0.C112541g;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108507n2;
import p175j0.C60690y0;
import p683s0.C36597a;
import p683s0.C36601l;
import p683s0.C36606n;
import p735w1.C38006x;
import p759y.C112218f0;
import sx3.C64197v;

/* renamed from: f0.k2 */
public final class C107356k2 {

    /* renamed from: f */
    public static final C36601l<C107356k2, Object> f321197f = C36597a.m41001a(C107357a.f321203d, C107358b.f321204d);

    /* renamed from: a */
    public final C60690y0 f321198a;

    /* renamed from: b */
    public final C60690y0 f321199b;

    /* renamed from: c */
    public C112541g f321200c;

    /* renamed from: d */
    public long f321201d;

    /* renamed from: e */
    public final C60690y0 f321202e;

    /* renamed from: f0.k2$a */
    public static final class C107357a extends C87413o implements C32227p<C36606n, C107356k2, List<? extends Object>> {

        /* renamed from: d */
        public static final C107357a f321203d = new C107357a();

        public C107357a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C107356k2 k2Var = (C107356k2) obj2;
            C87412m.m108594g((C36606n) obj, "$this$listSaver");
            C87412m.m108594g(k2Var, LocaleUtil.ITALIAN);
            Object[] objArr = new Object[2];
            boolean z = false;
            objArr[0] = Float.valueOf(k2Var.mo157808a());
            if (((C112218f0) ((C108494d2) k2Var.f321202e).getValue()) == C112218f0.Vertical) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            return C64197v.m75537f(objArr);
        }
    }

    /* renamed from: f0.k2$b */
    public static final class C107358b extends C87413o implements C32226l<List<? extends Object>, C107356k2> {

        /* renamed from: d */
        public static final C107358b f321204d = new C107358b();

        public C107358b() {
            super(1);
        }

        public Object invoke(Object obj) {
            List list = (List) obj;
            C87412m.m108594g(list, "restored");
            return new C107356k2(((Boolean) list.get(1)).booleanValue() ? C112218f0.Vertical : C112218f0.Horizontal, ((Float) list.get(0)).floatValue());
        }
    }

    public C107356k2(C112218f0 f0Var, float f) {
        C87412m.m108594g(f0Var, "initialOrientation");
        this.f321198a = C108500f2.m146996c(Float.valueOf(f), (C108497e2) null, 2, (Object) null);
        this.f321199b = C108500f2.m146996c(Float.valueOf(0.0f), (C108497e2) null, 2, (Object) null);
        this.f321200c = C112541g.f336960e;
        int i = C38006x.f100499c;
        this.f321201d = C38006x.f100498b;
        this.f321202e = C108500f2.m146995b(f0Var, C108507n2.f324831a);
    }

    /* renamed from: a */
    public final float mo157808a() {
        return ((Number) this.f321198a.getValue()).floatValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if ((r7.f336962b == r1.f336962b) == false) goto L_0x0035;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo157809b(p759y.C112218f0 r6, p1166z0.C112541g r7, int r8, int r9) {
        /*
            r5 = this;
            java.lang.String r0 = "orientation"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "cursorRect"
            gy3.C87412m.m108594g(r7, r0)
            int r9 = r9 - r8
            float r9 = (float) r9
            j0.y0 r0 = r5.f321199b
            java.lang.Float r1 = java.lang.Float.valueOf(r9)
            j0.d2 r0 = (p175j0.C108494d2) r0
            r0.setValue(r1)
            float r0 = r7.f336961a
            z0.g r1 = r5.f321200c
            float r2 = r1.f336961a
            r3 = 0
            r4 = 1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            if (r2 == 0) goto L_0x0035
            float r2 = r7.f336962b
            float r1 = r1.f336962b
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0032
            r1 = 1
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            if (r1 != 0) goto L_0x0078
        L_0x0035:
            y.f0 r1 = p759y.C112218f0.Vertical
            if (r6 != r1) goto L_0x003a
            r3 = 1
        L_0x003a:
            if (r3 == 0) goto L_0x003e
            float r0 = r7.f336962b
        L_0x003e:
            if (r3 == 0) goto L_0x0043
            float r6 = r7.f336964d
            goto L_0x0045
        L_0x0043:
            float r6 = r7.f336963c
        L_0x0045:
            float r1 = r5.mo157808a()
            float r8 = (float) r8
            float r8 = r8 + r1
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0061
            float r6 = r5.mo157808a()
            float r1 = r1 - r0
            float r6 = r6 - r1
            j0.y0 r8 = r5.f321198a
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            j0.d2 r8 = (p175j0.C108494d2) r8
            r8.setValue(r6)
            goto L_0x0076
        L_0x0061:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0076
            float r0 = r5.mo157808a()
            float r6 = r6 - r8
            float r0 = r0 + r6
            j0.y0 r6 = r5.f321198a
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
            j0.d2 r6 = (p175j0.C108494d2) r6
            r6.setValue(r8)
        L_0x0076:
            r5.f321200c = r7
        L_0x0078:
            float r6 = r5.mo157808a()
            r7 = 0
            float r6 = my3.C61595o.m72296d(r6, r7, r9)
            j0.y0 r7 = r5.f321198a
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            j0.d2 r7 = (p175j0.C108494d2) r7
            r7.setValue(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p152f0.C107356k2.mo157809b(y.f0, z0.g, int, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C107356k2(C112218f0 f0Var, float f, int i, C8480h hVar) {
        this(f0Var, (i & 2) != 0 ? 0.0f : f);
    }

    public C107356k2() {
        this(C112218f0.Vertical, 0.0f);
    }
}
