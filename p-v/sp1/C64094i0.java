package sp1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kg3.C76577a;
import sk1.C63965x;
import te3.C64370fp1;

/* renamed from: sp1.i0 */
public final class C64094i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C64075c0 f181729d;

    /* renamed from: e */
    public final /* synthetic */ C63965x f181730e;

    /* renamed from: f */
    public final /* synthetic */ C64370fp1 f181731f;

    public C64094i0(C64075c0 c0Var, C63965x xVar, C64370fp1 fp12) {
        this.f181729d = c0Var;
        this.f181730e = xVar;
        this.f181731f = fp12;
    }

    public final void run() {
        int f = C76577a.m92155f(this.f181729d.getContext(), C0966R.dimen.f3703bv);
        int f2 = C76577a.m92155f(this.f181729d.getContext(), C0966R.dimen.f3766df);
        C64075c0 c0Var = this.f181729d;
        FinderLiveShoppingPriceView finderLiveShoppingPriceView = c0Var.f181675v;
        Context context = c0Var.getContext();
        C87412m.m108593f(context, "context");
        FinderLiveShoppingPriceView.C56321b a = finderLiveShoppingPriceView.mo78823a(context, this.f181730e, (float) (((this.f181729d.f181671r.getWidth() - this.f181729d.getActionBtn().getWidth()) - f) - f2), true, true, false, this.f181731f.f183173S != 0, (float) C76577a.m92150a(MMApplicationContext.getContext(), 17.0f));
        FinderLiveShoppingPriceView finderLiveShoppingPriceView2 = this.f181729d.f181675v;
        FinderLiveShoppingPriceView.C3617a aVar = FinderLiveShoppingPriceView.f160994j;
        finderLiveShoppingPriceView2.mo78824b(1, this.f181730e, a);
    }
}
