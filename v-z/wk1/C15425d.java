package wk1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import rx3.C36570n;
import zp3.C79406f;

/* renamed from: wk1.d */
public final class C15425d implements C15482w<Integer> {

    /* renamed from: a */
    public final C15483x f41830a;

    /* renamed from: b */
    public final C15484y f41831b;

    public C15425d(C15483x xVar, C15484y yVar) {
        C87412m.m108594g(xVar, "spanMode");
        C87412m.m108594g(yVar, "sizeMode");
        this.f41830a = xVar;
        this.f41831b = yVar;
    }

    /* renamed from: a */
    public int mo14216a(Object obj) {
        ((Number) obj).intValue();
        return MMApplicationContext.getContext().getResources().getColor(C0966R.color.al_);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ int mo14217b(Object obj) {
        return mo14229l(((Number) obj).intValue());
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ int mo14218c(Object obj) {
        ((Number) obj).intValue();
        return 0;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ int[] mo14219d(Object obj) {
        return mo14231n(((Number) obj).intValue());
    }

    /* renamed from: e */
    public C15478t mo14220e(int i) {
        return null;
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ int mo14221f(Object obj) {
        return mo14232o(((Number) obj).intValue());
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ int mo14222g(Object obj) {
        return mo14228k(((Number) obj).intValue());
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ int mo14223h(Object obj) {
        return mo14230m(((Number) obj).intValue());
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ int mo14224i(Object obj) {
        ((Number) obj).intValue();
        return 0;
    }

    /* renamed from: j */
    public C15477s mo14225j(int i) {
        return null;
    }

    /* renamed from: k */
    public int mo14228k(int i) {
        C15483x xVar = this.f41830a;
        return xVar == C15483x.MODE_AUTO ? C85875k4.m106211z() ? MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3) : MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_0_5) : (xVar == C15483x.MODE_DARK || xVar == C15483x.MODE_LIGHT_BG) ? MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3) : MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_0_5);
    }

    /* renamed from: l */
    public int mo14229l(int i) {
        int ordinal = this.f41831b.ordinal();
        return ordinal != 1 ? ordinal != 2 ? C15440n.f41895a.mo14257f() : C15440n.f41895a.mo14256e() : C79406f.m96347a(MMApplicationContext.getContext(), 24.0f);
    }

    /* renamed from: m */
    public int mo14230m(int i) {
        boolean z = true;
        if (1 <= i && i < 7) {
            return C0966R.C0969drawable.c2k;
        }
        if (7 <= i && i < 13) {
            return C0966R.C0969drawable.c2l;
        }
        if (!(13 <= i && i < 18)) {
            if (18 > i || i > Integer.MAX_VALUE) {
                z = false;
            }
            if (z) {
                return C0966R.C0969drawable.c2m;
            }
            return 0;
        }
        return C0966R.C0969drawable.c2m;
    }

    /* renamed from: n */
    public int[] mo14231n(int i) {
        int g = C15440n.f41895a.mo14258g();
        int intValue = ((Number) ((C36570n) C15440n.f41911q).getValue()).intValue();
        int intValue2 = ((Number) ((C36570n) C15440n.f41907m).getValue()).intValue();
        int ordinal = this.f41831b.ordinal();
        if (ordinal != 0) {
            int[] iArr = new int[2];
            if (ordinal != 2) {
                iArr[0] = intValue;
                iArr[1] = intValue;
                return iArr;
            }
            iArr[0] = intValue2;
            iArr[1] = intValue2;
            return iArr;
        }
        return new int[]{g, g};
    }

    /* renamed from: o */
    public int mo14232o(int i) {
        int ordinal = this.f41831b.ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? C15440n.f41895a.mo14255d() : C15440n.f41895a.mo14260i();
        }
        C15440n nVar = C15440n.f41895a;
        return ((Number) ((C36570n) C15440n.f41907m).getValue()).intValue();
    }
}
