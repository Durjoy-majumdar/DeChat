package com.tencent.p014mm.plugin.wallet_index.p127ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import n63.C76835c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.p */
public final class C72572p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WeakReference<WecoinIapUI> f211128d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72572p(WeakReference<WecoinIapUI> weakReference) {
        super(0);
        this.f211128d = weakReference;
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin user cancel");
        WecoinIapUI wecoinIapUI = this.f211128d.get();
        if (wecoinIapUI != null) {
            C76835c a = C76835c.m92624a(1);
            int i = WecoinIapUI.f211060p;
            wecoinIapUI.mo99960I7(a, -1);
        }
        return C13598b0.f38549a;
    }
}
