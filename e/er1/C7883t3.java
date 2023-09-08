package er1;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import gy3.C87412m;

/* renamed from: er1.t3 */
public final class C7883t3 implements CheckBoxPreference.C6759b {

    /* renamed from: a */
    public final /* synthetic */ CheckBoxPreference f26504a;

    /* renamed from: b */
    public final /* synthetic */ SpannableStringBuilder f26505b;

    public C7883t3(CheckBoxPreference checkBoxPreference, SpannableStringBuilder spannableStringBuilder) {
        this.f26504a = checkBoxPreference;
        this.f26505b = spannableStringBuilder;
    }

    /* renamed from: a */
    public final void mo7738a(View view) {
        C58784w3 w3Var = C58784w3.f168295a;
        TextView textView = this.f26504a.f24222W;
        C87412m.m108593f(textView, "pref.summaryTextView");
        w3Var.mo83876I1(textView, this.f26505b);
    }
}
