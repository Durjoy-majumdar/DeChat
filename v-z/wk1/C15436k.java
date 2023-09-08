package wk1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C13603j;

/* renamed from: wk1.k */
public final class C15436k implements C15482w<Integer> {

    /* renamed from: a */
    public final C15483x f41879a;

    public C15436k(C15483x xVar, C15484y yVar, int i, C8480h hVar) {
        xVar = (i & 1) != 0 ? C15483x.MODE_DARK : xVar;
        yVar = (i & 2) != 0 ? C15484y.SIZE_NORMAL : yVar;
        C87412m.m108594g(xVar, "spanMode");
        C87412m.m108594g(yVar, "sizeMode");
        this.f41879a = xVar;
    }

    /* renamed from: a */
    public int mo14216a(Object obj) {
        ((Number) obj).intValue();
        int ordinal = this.f41879a.ordinal();
        return ordinal != 1 ? ordinal != 2 ? MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8) : MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_0) : MMApplicationContext.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9);
    }

    /* renamed from: b */
    public int mo14217b(Object obj) {
        ((Number) obj).intValue();
        return C15440n.f41895a.mo14257f();
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ int mo14218c(Object obj) {
        ((Number) obj).intValue();
        return 0;
    }

    /* renamed from: d */
    public int[] mo14219d(Object obj) {
        ((Number) obj).intValue();
        return new int[2];
    }

    /* renamed from: e */
    public C15478t mo14220e(int i) {
        return null;
    }

    /* renamed from: f */
    public int mo14221f(Object obj) {
        ((Number) obj).intValue();
        return C15440n.f41895a.mo14256e();
    }

    /* renamed from: g */
    public int mo14222g(Object obj) {
        ((Number) obj).intValue();
        int ordinal = this.f41879a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return MMApplicationContext.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_0_5);
            }
            if (ordinal == 2) {
                return C85875k4.m106211z() ? MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3) : MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_0_5);
            }
            if (ordinal != 3) {
                throw new C13603j();
            }
        }
        return MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3);
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ int mo14223h(Object obj) {
        ((Number) obj).intValue();
        return 0;
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
}
