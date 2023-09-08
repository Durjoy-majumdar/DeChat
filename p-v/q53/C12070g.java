package q53;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import r53.C12953c;

/* renamed from: q53.g */
public final class C12070g<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C12041a f35154d;

    public C12070g(C12041a aVar) {
        this.f35154d = aVar;
    }

    public void onChanged(Object obj) {
        Long l = (Long) obj;
        C12041a aVar = this.f35154d;
        aVar.getClass();
        Log.m105918d("MicroMsg.BuyGoodsBottomDialog", "updateTitleBalance: " + l);
        if (l != null) {
            long longValue = l.longValue();
            View view = aVar.f35069i;
            if (view != null) {
                View findViewById = view.findViewById(C0966R.C0970id.it_);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog", "updateTitleBalance", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog", "updateTitleBalance", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = aVar.f35069i;
                if (view3 != null) {
                    View findViewById2 = view3.findViewById(C0966R.C0970id.igj);
                    C87412m.m108593f(findViewById2, "mCustomView.findViewById…product_total_balance_tv)");
                    TextView textView = (TextView) findViewById2;
                    C12953c.m12404m(textView, 15);
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    if (aVar.f35066f) {
                        textView.setTextColor(aVar.f35061a.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                    }
                    textView.setText("" + longValue);
                    findViewById.setContentDescription(aVar.f35061a.getString(C0966R.string.lj4, new Object[]{String.valueOf(longValue)}));
                    return;
                }
                C87412m.m108603p("mCustomView");
                throw null;
            }
            C87412m.m108603p("mCustomView");
            throw null;
        }
    }
}
