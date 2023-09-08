package q53;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinEncashView;
import java.lang.ref.WeakReference;

/* renamed from: q53.u0 */
public final class C47765u0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinEncashView f128284d;

    public C47765u0(WeCoinEncashView weCoinEncashView) {
        this.f128284d = weCoinEncashView;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        WeCoinEncashView weCoinEncashView = this.f128284d;
        WeakReference<C12075h1> weakReference = WeCoinEncashView.f117264v;
        weCoinEncashView.getClass();
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            weCoinEncashView.showLoading(true);
        } else {
            weCoinEncashView.hideLoading();
        }
    }
}
