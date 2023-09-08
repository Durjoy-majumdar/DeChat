package n32;

import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.prepare.WxaLuckyMoneyPrepareUI;

/* renamed from: n32.g */
public class C76822g implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ EditText f224634d;

    /* renamed from: e */
    public final /* synthetic */ EditText f224635e;

    /* renamed from: f */
    public final /* synthetic */ WxaLuckyMoneyPrepareUI f224636f;

    public C76822g(WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI, EditText editText, EditText editText2) {
        this.f224636f = wxaLuckyMoneyPrepareUI;
        this.f224634d = editText;
        this.f224635e = editText2;
    }

    public void onFocusChange(View view, boolean z) {
        this.f224634d.setOnClickListener((View.OnClickListener) null);
        this.f224635e.setOnClickListener((View.OnClickListener) null);
        WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = this.f224636f;
        wxaLuckyMoneyPrepareUI.setEditFocusListener(wxaLuckyMoneyPrepareUI.f198815n, 2, false);
        WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI2 = this.f224636f;
        wxaLuckyMoneyPrepareUI2.setEditFocusListener(wxaLuckyMoneyPrepareUI2.f198814j, 0, false);
    }
}
