package q53;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import de3.C75355a0;
import gy3.C87412m;
import r53.C12953c;

/* renamed from: q53.d */
public final class C12056d<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C12041a f35129d;

    public C12056d(C12041a aVar) {
        this.f35129d = aVar;
    }

    public void onChanged(Object obj) {
        String str = (String) obj;
        C12041a aVar = this.f35129d;
        aVar.getClass();
        Log.m105918d("MicroMsg.BuyGoodsBottomDialog", "updateAgreementLinkText: " + str);
        if (!(str == null || str.length() == 0)) {
            View view = aVar.f35069i;
            if (view != null) {
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.ifs);
                C87412m.m108593f(textView, "linkText");
                C12953c.m12404m(textView, 14);
                if (aVar.f35066f) {
                    textView.setTextColor(aVar.f35061a.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
                }
                String string = aVar.f35061a.getString(C0966R.string.ky8);
                C87412m.m108593f(string, "context.getString(R.stri…lan_protocal_prefix_text)");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                String string2 = aVar.f35061a.getString(C0966R.string.lju);
                C87412m.m108593f(string2, "context.getString(R.stri…arge_agreement_link_text)");
                spannableStringBuilder.append(string2);
                spannableStringBuilder.setSpan(new C7092q((C7092q.C7093a) new C12101o(aVar, str), true), string.length(), spannableStringBuilder.length(), 18);
                textView.setText(spannableStringBuilder);
                textView.setClickable(true);
                textView.setOnTouchListener(new C75355a0(aVar.f35061a));
                textView.setVisibility(0);
                return;
            }
            C87412m.m108603p("mCustomView");
            throw null;
        }
    }
}
