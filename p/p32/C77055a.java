package p32;

import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.view.WxaLuckyMoneyTextInputView;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69727y2;

/* renamed from: p32.a */
public class C77055a implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ WxaLuckyMoneyTextInputView f225099d;

    public C77055a(WxaLuckyMoneyTextInputView wxaLuckyMoneyTextInputView) {
        this.f225099d = wxaLuckyMoneyTextInputView;
    }

    public void onFocusChange(View view, boolean z) {
        WxaLuckyMoneyTextInputView wxaLuckyMoneyTextInputView = this.f225099d;
        C69727y2 y2Var = wxaLuckyMoneyTextInputView.f198870f;
        if (y2Var != null) {
            y2Var.mo95263Q(true, wxaLuckyMoneyTextInputView.getInputViewId());
        }
    }
}
