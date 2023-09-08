package p435a0;

import com.google.android.gms.common.internal.Constants;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p435a0.C103111a;
import p435a0.C103167m;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109895y;
import p721v0.C111294a;
import rx3.C13598b0;

/* renamed from: a0.s0 */
public final class C103199s0 {

    /* renamed from: a */
    public static final C109895y f304389a;

    /* renamed from: a0.s0$a */
    public static final class C103200a extends C87413o implements C32230s<Integer, int[], C33183o, C108322d, int[], C13598b0> {

        /* renamed from: d */
        public static final C103200a f304390d = new C103200a();

        public C103200a() {
            super(5);
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            int intValue = ((Number) obj).intValue();
            int[] iArr = (int[]) obj2;
            C33183o oVar = (C33183o) obj3;
            C108322d dVar = (C108322d) obj4;
            int[] iArr2 = (int[]) obj5;
            C87412m.m108594g(iArr, "size");
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
            C87412m.m108594g(iArr2, "outPosition");
            ((C103111a.C103121j) C103111a.f304235b).mo142865c(dVar, intValue, iArr, oVar, iArr2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a0.s0$b */
    public static final class C103201b extends C87413o implements C32230s<Integer, int[], C33183o, C108322d, int[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C103111a.C103115d f304391d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103201b(C103111a.C103115d dVar) {
            super(5);
            this.f304391d = dVar;
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            int intValue = ((Number) obj).intValue();
            int[] iArr = (int[]) obj2;
            C33183o oVar = (C33183o) obj3;
            C108322d dVar = (C108322d) obj4;
            int[] iArr2 = (int[]) obj5;
            C87412m.m108594g(iArr, "size");
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
            C87412m.m108594g(iArr2, "outPosition");
            this.f304391d.mo142865c(dVar, intValue, iArr, oVar, iArr2);
            return C13598b0.f38549a;
        }
    }

    static {
        C103154h0 h0Var = C103154h0.Horizontal;
        C103111a aVar = C103111a.f304234a;
        int i = C103167m.f304322a;
        C103167m.C103173f fVar = new C103167m.C103173f(C111294a.C111295a.f333226h);
        C27720z0 z0Var = C27720z0.Wrap;
        f304389a = C103185q0.m136573d(h0Var, C103200a.f304390d, (float) 0, z0Var, fVar);
    }

    /* renamed from: a */
    public static final C109895y m136579a(C103111a.C103115d dVar, C111294a.C37634c cVar, C108504h hVar, int i) {
        C109895y yVar;
        C87412m.m108594g(dVar, "horizontalArrangement");
        C87412m.m108594g(cVar, "verticalAlignment");
        hVar.mo51557H(-837807694);
        hVar.mo51557H(511388516);
        boolean x = hVar.mo51619x(dVar) | hVar.mo51619x(cVar);
        Object q = hVar.mo51606q();
        if (x || q == C108504h.C60656a.f172772a) {
            if (!C87412m.m108589b(dVar, C103111a.f304235b) || !C87412m.m108589b(cVar, C111294a.C111295a.f333226h)) {
                C103154h0 h0Var = C103154h0.Horizontal;
                float a = dVar.mo142862a();
                int i2 = C103167m.f304322a;
                C103167m.C103173f fVar = new C103167m.C103173f(cVar);
                yVar = C103185q0.m136573d(h0Var, new C103201b(dVar), a, C27720z0.Wrap, fVar);
            } else {
                yVar = f304389a;
            }
            q = yVar;
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C109895y yVar2 = (C109895y) q;
        hVar.mo51565P();
        return yVar2;
    }
}
