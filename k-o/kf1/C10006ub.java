package kf1;

import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C86312j;
import gy3.C87412m;
import p629ny.C76979h;
import rx3.C36570n;
import z04.C112551y;
import zp3.C23555k;

/* renamed from: kf1.ub */
public final class C10006ub extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C9965rb f30696a;

    public C10006ub(C9965rb rbVar) {
        this.f30696a = rbVar;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        SpannableString spannableString;
        Class cls = C76979h.class;
        C87412m.m108594g(view, "view");
        C9965rb rbVar = this.f30696a;
        if (rbVar.f30225r != null) {
            if (z) {
                Object value = ((C36570n) rbVar.f30644z).getValue();
                C87412m.m108593f(value, "<get-actionBarTitle>(...)");
                ((TextView) value).setVisibility(8);
                return;
            }
            Object value2 = ((C36570n) rbVar.f30644z).getValue();
            C87412m.m108593f(value2, "<get-actionBarTitle>(...)");
            ((TextView) value2).setVisibility(0);
            Object value3 = ((C36570n) this.f30696a.f30644z).getValue();
            C87412m.m108593f(value3, "<get-actionBarTitle>(...)");
            TextView textView = (TextView) value3;
            if (!C112551y.m153820t(this.f30696a.f30629E, "#", false, 2, (Object) null)) {
                MMActivity mMActivity = this.f30696a.f30214d;
                spannableString = ((C76979h) C86312j.m106911c(cls)).mo107057T1(mMActivity, '#' + this.f30696a.f30629E);
            } else {
                C9965rb rbVar2 = this.f30696a;
                spannableString = ((C76979h) C86312j.m106911c(cls)).mo107057T1(rbVar2.f30214d, rbVar2.f30629E);
            }
            textView.setText(spannableString);
        }
    }
}
