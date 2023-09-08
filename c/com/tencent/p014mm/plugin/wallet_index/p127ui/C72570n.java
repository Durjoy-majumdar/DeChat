package com.tencent.p014mm.plugin.wallet_index.p127ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C57931j0;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import ob0.C89137b0;
import qo3.C89779i0;
import rx3.C13598b0;
import s43.C13621b;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.n */
public final class C72570n extends C87413o implements C32226l<C13621b, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WecoinIapUI f211124d;

    /* renamed from: e */
    public final /* synthetic */ WeakReference<WecoinIapUI> f211125e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72570n(WecoinIapUI wecoinIapUI, WeakReference<WecoinIapUI> weakReference) {
        super(1);
        this.f211124d = wecoinIapUI;
        this.f211125e = weakReference;
    }

    public Object invoke(Object obj) {
        C13621b bVar = (C13621b) obj;
        C87412m.m108594g(bVar, "<name for destructuring parameter 0>");
        long j = bVar.f38589a;
        C89137b0 b0Var = C86709a0.m107529k().f251779b;
        C72568l lVar = this.f211124d.f211061d;
        C87412m.m108592e(lVar, "null cannot be cast to non-null type com.tencent.mm.plugin.wallet_index.ui.WecoinIapData");
        b0Var.mo123460f(new C57931j0(lVar.f211117i, lVar.f211109a, lVar.f211110b, lVar.f211112d, 1, (String) null));
        WecoinIapUI wecoinIapUI = this.f211124d;
        wecoinIapUI.f211065h = wecoinIapUI.f211064g;
        WecoinIapUI wecoinIapUI2 = this.f211125e.get();
        if (wecoinIapUI2 != null) {
            Log.m105924i("MicroMsg.WecoinIapUI", "showLoadingDialog!");
            wecoinIapUI2.f211068n = C89779i0.m112248e(wecoinIapUI2, wecoinIapUI2.getString(C0966R.string.a4d), true, 0, new C72569m(wecoinIapUI2));
        }
        Log.m105925i("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin onSuccess, data:%s", Long.valueOf(j));
        return C13598b0.f38549a;
    }
}
