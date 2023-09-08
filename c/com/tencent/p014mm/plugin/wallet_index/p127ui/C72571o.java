package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import rx3.C13598b0;
import s43.C13620a;
import s43.C13622c;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.o */
public final class C72571o extends C87413o implements C32226l<C13620a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WecoinIapUI f211126d;

    /* renamed from: e */
    public final /* synthetic */ WeakReference<WecoinIapUI> f211127e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72571o(WecoinIapUI wecoinIapUI, WeakReference<WecoinIapUI> weakReference) {
        super(1);
        this.f211126d = wecoinIapUI;
        this.f211127e = weakReference;
    }

    public Object invoke(Object obj) {
        C13620a aVar = (C13620a) obj;
        C87412m.m108594g(aVar, "<name for destructuring parameter 0>");
        C13622c cVar = aVar.f38588a;
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            Log.m105920e("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin failed, onError, type:" + cVar);
        } else if (ordinal == 1) {
            Log.m105920e("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin failed, insufficient, type:" + cVar);
        } else if (ordinal == 2) {
            Log.m105920e("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin failed, intercept, type:" + cVar);
        }
        int i = this.f211126d.f211066i;
        WecoinIapUI wecoinIapUI = this.f211127e.get();
        if (wecoinIapUI != null) {
            Intent intent = new Intent();
            intent.putExtra("key_err_code", cVar.ordinal());
            intent.putExtra("key_err_msg", cVar.name());
            wecoinIapUI.setResult(-1, intent);
            wecoinIapUI.finish();
        }
        return C13598b0.f38549a;
    }
}
