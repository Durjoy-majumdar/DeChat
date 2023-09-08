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

/* renamed from: a0.j */
public final class C103157j {

    /* renamed from: a */
    public static final C109895y f304312a;

    /* renamed from: a0.j$a */
    public static final class C103158a extends C87413o implements C32230s<Integer, int[], C33183o, C108322d, int[], C13598b0> {

        /* renamed from: d */
        public static final C103158a f304313d = new C103158a();

        public C103158a() {
            super(5);
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            int intValue = ((Number) obj).intValue();
            int[] iArr = (int[]) obj2;
            C108322d dVar = (C108322d) obj4;
            int[] iArr2 = (int[]) obj5;
            C87412m.m108594g(iArr, "size");
            C87412m.m108594g((C33183o) obj3, "<anonymous parameter 2>");
            C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
            C87412m.m108594g(iArr2, "outPosition");
            ((C103111a.C103122k) C103111a.f304237d).mo142863b(dVar, intValue, iArr, iArr2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a0.j$b */
    public static final class C103159b extends C87413o implements C32230s<Integer, int[], C33183o, C108322d, int[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C103111a.C103123l f304314d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103159b(C103111a.C103123l lVar) {
            super(5);
            this.f304314d = lVar;
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            int intValue = ((Number) obj).intValue();
            int[] iArr = (int[]) obj2;
            C108322d dVar = (C108322d) obj4;
            int[] iArr2 = (int[]) obj5;
            C87412m.m108594g(iArr, "size");
            C87412m.m108594g((C33183o) obj3, "<anonymous parameter 2>");
            C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
            C87412m.m108594g(iArr2, "outPosition");
            this.f304314d.mo142863b(dVar, intValue, iArr, iArr2);
            return C13598b0.f38549a;
        }
    }

    static {
        C103154h0 h0Var = C103154h0.Vertical;
        C103111a aVar = C103111a.f304234a;
        int i = C103167m.f304322a;
        C103167m.C103171d dVar = new C103167m.C103171d(C111294a.C111295a.f333228j);
        C27720z0 z0Var = C27720z0.Wrap;
        f304312a = C103185q0.m136573d(h0Var, C103158a.f304313d, (float) 0, z0Var, dVar);
    }

    /* renamed from: a */
    public static final C109895y m136499a(C103111a.C103123l lVar, C111294a.C37633b bVar, C108504h hVar, int i) {
        C109895y yVar;
        C87412m.m108594g(lVar, "verticalArrangement");
        C87412m.m108594g(bVar, "horizontalAlignment");
        hVar.mo51557H(1089876336);
        hVar.mo51557H(511388516);
        boolean x = hVar.mo51619x(lVar) | hVar.mo51619x(bVar);
        Object q = hVar.mo51606q();
        if (x || q == C108504h.C60656a.f172772a) {
            if (!C87412m.m108589b(lVar, C103111a.f304237d) || !C87412m.m108589b(bVar, C111294a.C111295a.f333228j)) {
                C103154h0 h0Var = C103154h0.Vertical;
                float a = lVar.mo142862a();
                int i2 = C103167m.f304322a;
                C103167m.C103171d dVar = new C103167m.C103171d(bVar);
                yVar = C103185q0.m136573d(h0Var, new C103159b(lVar), a, C27720z0.Wrap, dVar);
            } else {
                yVar = f304312a;
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
