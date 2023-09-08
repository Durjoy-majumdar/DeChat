package q53;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinEncashView;
import gy3.C87412m;
import te3.h35;

/* renamed from: q53.p0 */
public final class C47762p0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinEncashView f128281d;

    public C47762p0(WeCoinEncashView weCoinEncashView) {
        this.f128281d = weCoinEncashView;
    }

    public void onChanged(Object obj) {
        h35 h35 = (h35) obj;
        WeCoinEncashView weCoinEncashView = this.f128281d;
        if (h35 != null) {
            ViewGroup viewGroup = weCoinEncashView.f117275q;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                TextView textView = weCoinEncashView.f117276r;
                if (textView != null) {
                    textView.setText(h35.f134434d);
                    TextView textView2 = weCoinEncashView.f117277s;
                    if (textView2 != null) {
                        textView2.setText(h35.f134435e);
                    } else {
                        C87412m.m108603p("cutTaxDesc");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("cutTaxTitle");
                    throw null;
                }
            } else {
                C87412m.m108603p("cutTaxEntrace");
                throw null;
            }
        } else {
            ViewGroup viewGroup2 = weCoinEncashView.f117275q;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            } else {
                C87412m.m108603p("cutTaxEntrace");
                throw null;
            }
        }
    }
}
