package q53;

import android.view.View;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinEncashView;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import te3.i35;

/* renamed from: q53.f1 */
public final class C12068f1 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ i35 f35151a;

    /* renamed from: b */
    public final /* synthetic */ WeCoinEncashView f35152b;

    public C12068f1(i35 i35, WeCoinEncashView weCoinEncashView) {
        this.f35151a = i35;
        this.f35152b = weCoinEncashView;
    }

    public final void onClick(View view) {
        String str = this.f35151a.f135093f;
        if (str != null) {
            C75228t.m90219L(this.f35152b, str, false);
        }
    }
}
