package q53;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinEncashView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import r53.C12953c;
import te3.C48858bh3;
import te3.C49851ii2;

/* renamed from: q53.t0 */
public final class C12120t0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinEncashView f35218d;

    public C12120t0(WeCoinEncashView weCoinEncashView) {
        this.f35218d = weCoinEncashView;
    }

    public void onChanged(Object obj) {
        C49851ii2 ii22;
        C48858bh3 bh32 = (C48858bh3) obj;
        WeCoinEncashView weCoinEncashView = this.f35218d;
        WeakReference<C12075h1> weakReference = WeCoinEncashView.f117264v;
        weCoinEncashView.getClass();
        Log.m105918d("MicroMsg.WeCoinEncashView", "handleInterceptWinInfo: " + bh32);
        if (bh32 != null && (ii22 = bh32.f131124f) != null) {
            C12127v0 v0Var = new C12127v0(weCoinEncashView, bh32.f131123e);
            AppCompatActivity context = weCoinEncashView.getContext();
            C87412m.m108593f(context, "context");
            C12953c.m12396e(context, ii22, v0Var);
        }
    }
}
