package q53;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import p244tt.C14088e;
import rx3.C13598b0;

/* renamed from: q53.v2 */
public final class C12129v2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WeCoinRechargeView f35230d;

    /* renamed from: e */
    public final /* synthetic */ String f35231e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12129v2(WeCoinRechargeView weCoinRechargeView, String str) {
        super(0);
        this.f35230d = weCoinRechargeView;
        this.f35231e = str;
    }

    public Object invoke() {
        Class cls = C14088e.class;
        boolean uu = ((C14088e) C86312j.m106911c(cls)).mo13530uu("wxalite4868fef42257e6693a564693bd119376");
        if (uu) {
            if (((C14088e) C86312j.m106911c(cls)).mo13509NR("wxalite4868fef42257e6693a564693bd119376") == null) {
                if (((C14088e) C86312j.m106911c(cls)).mo13512Tg() == null) {
                    ((C14088e) C86312j.m106911c(cls)).Mk0();
                }
                ((C14088e) C86312j.m106911c(cls)).u50("wxalite4868fef42257e6693a564693bd119376", (C115477b) null);
                uu = false;
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("appId", "wxalite4868fef42257e6693a564693bd119376");
                Log.m105924i("MicroMsg.WeCoinRechargeView", "open liteapp:wxalite4868fef42257e6693a564693bd119376,page:");
                ((C14088e) C86312j.m106911c(cls)).mo13510OP(this.f35230d.getContext(), bundle, true, false, (C14088e.C14090b) null);
            }
        }
        if (!uu) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f35231e);
            intent.putExtra("showShare", false);
            intent.putExtra(C74928u.C45093i.f122326r, true);
            C75228t.m90217J(this.f35230d.getContext(), intent);
        }
        return C13598b0.f38549a;
    }
}
