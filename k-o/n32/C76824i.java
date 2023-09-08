package n32;

import android.text.SpannableString;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.WxaLuckyMoneyMoneyInputView;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.prepare.WxaLuckyMoneyPrepareUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import k32.C76490i;
import k32.C9559h;

/* renamed from: n32.i */
public class C76824i implements C72478z.C72479a {

    /* renamed from: a */
    public final /* synthetic */ SpannableString f224639a;

    /* renamed from: b */
    public final /* synthetic */ WxaLuckyMoneyPrepareUI f224640b;

    public C76824i(WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI, SpannableString spannableString) {
        this.f224640b = wxaLuckyMoneyPrepareUI;
        this.f224639a = spannableString;
    }

    public void onClick(View view) {
        int input = this.f224640b.f198814j.getInput();
        double input2 = this.f224640b.f198815n.getInput();
        WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = this.f224640b;
        C76490i iVar = C76490i.RANDOM_LUCK;
        wxaLuckyMoneyPrepareUI.f198813i = iVar;
        wxaLuckyMoneyPrepareUI.f198815n.setType(iVar);
        WxaLuckyMoneyMoneyInputView wxaLuckyMoneyMoneyInputView = this.f224640b.f198815n;
        C9559h.GLOBAL.getClass();
        wxaLuckyMoneyMoneyInputView.setMaxAmount(2000.0d);
        WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI2 = this.f224640b;
        wxaLuckyMoneyPrepareUI2.f198815n.setTitle(wxaLuckyMoneyPrepareUI2.getString(C0966R.string.gjp));
        this.f224640b.f198815n.setShowGroupIcon(true);
        if (input2 > 0.0d && input > 0) {
            this.f224640b.f198815n.setAmount(C75228t.m90260n(input2 * ((double) input)));
        }
        this.f224640b.f198822u.setText(this.f224639a);
    }
}
