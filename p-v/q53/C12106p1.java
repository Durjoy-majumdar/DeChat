package q53;

import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import gy3.C87412m;

/* renamed from: q53.p1 */
public final class C12106p1<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinIncomeDetailView f35197d;

    public C12106p1(WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f35197d = weCoinIncomeDetailView;
    }

    public void onChanged(Object obj) {
        String str = (String) obj;
        WeCoinIncomeDetailView weCoinIncomeDetailView = this.f35197d;
        TextView textView = weCoinIncomeDetailView.f21852r;
        if (textView != null) {
            textView.setVisibility(4);
            if (str != null) {
                TextView textView2 = weCoinIncomeDetailView.f21852r;
                if (textView2 != null) {
                    textView2.setOnClickListener(new C12138z1(weCoinIncomeDetailView, str));
                    TextView textView3 = weCoinIncomeDetailView.f21852r;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    } else {
                        C87412m.m108603p("mFaqTv");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mFaqTv");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("mFaqTv");
            throw null;
        }
    }
}
