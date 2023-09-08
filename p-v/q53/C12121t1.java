package q53;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import gy3.C87412m;
import p53.C11851r;
import te3.C51310sx;

/* renamed from: q53.t1 */
public final class C12121t1<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WeCoinIncomeDetailView f35219d;

    public C12121t1(WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f35219d = weCoinIncomeDetailView;
    }

    public void onChanged(Object obj) {
        C51310sx sxVar = (C51310sx) obj;
        WeCoinIncomeDetailView weCoinIncomeDetailView = this.f35219d;
        LinearLayout linearLayout = weCoinIncomeDetailView.f21848n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            if (sxVar != null) {
                String str = sxVar.f141810d;
                boolean z = true;
                if (!(str == null || str.length() == 0)) {
                    C11851r rVar = weCoinIncomeDetailView.f21851q;
                    if (rVar != null) {
                        rVar.mo11732e3(8);
                        LinearLayout linearLayout2 = weCoinIncomeDetailView.f21848n;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(0);
                            LinearLayout linearLayout3 = weCoinIncomeDetailView.f21848n;
                            if (linearLayout3 != null) {
                                ((TextView) linearLayout3.findViewById(C0966R.C0970id.loe)).setText(sxVar.f141810d);
                                LinearLayout linearLayout4 = weCoinIncomeDetailView.f21848n;
                                if (linearLayout4 != null) {
                                    WeImageView weImageView = (WeImageView) linearLayout4.findViewById(C0966R.C0970id.lod);
                                    String str2 = sxVar.f141811e;
                                    if (!(str2 == null || str2.length() == 0)) {
                                        z = false;
                                    }
                                    if (z) {
                                        weImageView.setVisibility(8);
                                        return;
                                    }
                                    weImageView.setVisibility(0);
                                    LinearLayout linearLayout5 = weCoinIncomeDetailView.f21848n;
                                    if (linearLayout5 != null) {
                                        linearLayout5.setOnClickListener(new C12051b2(weCoinIncomeDetailView, sxVar));
                                    } else {
                                        C87412m.m108603p("mIncomeBalanceLL");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mIncomeBalanceLL");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mIncomeBalanceLL");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mIncomeBalanceLL");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mViewModel");
                        throw null;
                    }
                }
            }
        } else {
            C87412m.m108603p("mIncomeBalanceLL");
            throw null;
        }
    }
}
