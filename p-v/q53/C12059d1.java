package q53;

import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinEncashView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p53.C11844l;
import qo3.C101218e0;
import te3.i35;

/* renamed from: q53.d1 */
public final class C12059d1 implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C101218e0 f35133a;

    /* renamed from: b */
    public final /* synthetic */ WeCoinEncashView f35134b;

    /* renamed from: c */
    public final /* synthetic */ i35 f35135c;

    public C12059d1(C101218e0 e0Var, WeCoinEncashView weCoinEncashView, i35 i35) {
        this.f35133a = e0Var;
        this.f35134b = weCoinEncashView;
        this.f35135c = i35;
    }

    /* renamed from: a */
    public final void mo2001a() {
        Log.m105924i("MicroMsg.WeCoinEncashView", "click agree");
        this.f35133a.mo140680z();
        WeCoinEncashView weCoinEncashView = this.f35134b;
        String str = weCoinEncashView.f117278t;
        if (str != null) {
            i35 i35 = this.f35135c;
            C11844l lVar = weCoinEncashView.f117270i;
            if (lVar != null) {
                lVar.mo11727c3(str, i35.f135094g, 1, weCoinEncashView);
            } else {
                C87412m.m108603p("mViewModel");
                throw null;
            }
        }
    }
}
