package q53;

import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinEncashView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: q53.x0 */
public final class C47767x0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WeCoinEncashView f128286d;

    public C47767x0(WeCoinEncashView weCoinEncashView) {
        this.f128286d = weCoinEncashView;
    }

    public final void run() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        TextView textView = this.f128286d.f117265d;
        if (textView != null) {
            textView.getLocationInWindow(iArr);
            ScrollView scrollView = this.f128286d.f117269h;
            if (scrollView != null) {
                scrollView.getLocationInWindow(iArr2);
                Log.m105919d("MicroMsg.WeCoinEncashView", "scroll y: %s", Integer.valueOf(iArr[1] - iArr2[1]));
                ScrollView scrollView2 = this.f128286d.f117269h;
                if (scrollView2 != null) {
                    scrollView2.scrollBy(0, iArr[1] - iArr2[1]);
                } else {
                    C87412m.m108603p("rootView");
                    throw null;
                }
            } else {
                C87412m.m108603p("rootView");
                throw null;
            }
        } else {
            C87412m.m108603p("mEncashTitleTV");
            throw null;
        }
    }
}
