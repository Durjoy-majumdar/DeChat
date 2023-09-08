package com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.model.C69273y;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69637m1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69727y2;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tenpay.android.wechat.TenpaySecureEditText;
import g32.C75846b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import k32.C76490i;

/* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView */
public class WxaLuckyMoneyMoneyInputView extends LinearLayout implements C69637m1 {

    /* renamed from: d */
    public TenpaySecureEditText f198778d;

    /* renamed from: e */
    public TextView f198779e;

    /* renamed from: f */
    public TextView f198780f;

    /* renamed from: g */
    public View f198781g;

    /* renamed from: h */
    public C69727y2 f198782h;

    /* renamed from: i */
    public C69273y f198783i = C75846b.zx0().vx0().mo95413a();

    /* renamed from: j */
    public double f198784j;

    /* renamed from: n */
    public double f198785n;

    /* renamed from: o */
    public C76490i f198786o;

    /* renamed from: p */
    public TextWatcher f198787p = new C69127a();

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView$a */
    public class C69127a implements TextWatcher {
        public C69127a() {
        }

        public void afterTextChanged(Editable editable) {
            WxaLuckyMoneyMoneyInputView wxaLuckyMoneyMoneyInputView = WxaLuckyMoneyMoneyInputView.this;
            C69727y2 y2Var = wxaLuckyMoneyMoneyInputView.f198782h;
            if (y2Var != null) {
                y2Var.mo95263Q(false, wxaLuckyMoneyMoneyInputView.getInputViewId());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public WxaLuckyMoneyMoneyInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f360075cj1, this, true);
        TenpaySecureEditText tenpaySecureEditText = (TenpaySecureEditText) inflate.findViewById(C0966R.C0970id.geq);
        this.f198778d = tenpaySecureEditText;
        tenpaySecureEditText.addTextChangedListener(this.f198787p);
        this.f198779e = (TextView) inflate.findViewById(C0966R.C0970id.gfx);
        this.f198781g = inflate.findViewById(C0966R.C0970id.gfv);
        this.f198780f = (TextView) inflate.findViewById(C0966R.C0970id.gbs);
    }

    /* renamed from: a */
    public void mo5751a() {
        this.f198779e.setTextColor(C69242l1.m81598d(getContext()));
        this.f198778d.setTextColor(C69242l1.m81598d(getContext()));
        this.f198780f.setTextColor(C69242l1.m81598d(getContext()));
    }

    /* renamed from: b */
    public void mo5752b() {
        this.f198779e.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
        this.f198778d.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
        this.f198780f.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
    }

    /* renamed from: c */
    public int mo5753c() {
        if (Util.isNullOrNil(this.f198778d.getText().toString())) {
            return 0;
        }
        double d = Util.getDouble(this.f198778d.getText().toString(), -1.0d);
        if (d < 0.0d) {
            return 3;
        }
        double d2 = this.f198784j;
        if (d <= d2 || d2 <= 0.0d) {
            return (d >= this.f198785n || d <= 0.0d) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: d */
    public int mo5754d() {
        return mo5753c();
    }

    /* renamed from: e */
    public String mo5755e(int i) {
        this.f198783i = C75846b.zx0().vx0().mo95413a();
        if (i == 1) {
            if (this.f198786o == C76490i.RANDOM_LUCK) {
                Context context = getContext();
                return context.getString(C0966R.string.gjo, new Object[]{Math.round(this.f198784j) + "", Util.nullAs(this.f198783i.f199381q, "")});
            }
            Context context2 = getContext();
            return context2.getString(C0966R.string.gen, new Object[]{Math.round(this.f198784j) + "", Util.nullAs(this.f198783i.f199381q, "")});
        } else if (i != 2) {
            return null;
        } else {
            Context context3 = getContext();
            return context3.getString(C0966R.string.gep, new Object[]{C75228t.m90260n(this.f198785n) + "", Util.nullAs(this.f198783i.f199381q, "")});
        }
    }

    public double getInput() {
        return Util.getDouble(this.f198778d.getText().toString(), 0.0d);
    }

    public int getInputViewId() {
        return getId();
    }

    public void setAmount(String str) {
        this.f198778d.setText(str);
    }

    public void setHint(String str) {
        this.f198778d.setHint(str);
    }

    public void setMaxAmount(double d) {
        this.f198784j = d;
    }

    public void setMaxLen(int i) {
        this.f198778d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public void setMinAmount(double d) {
        this.f198785n = d;
    }

    public void setOnInputValidChangerListener(C69727y2 y2Var) {
        this.f198782h = y2Var;
    }

    public void setShowGroupIcon(boolean z) {
        if (z) {
            View view = this.f198781g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyMoneyInputView", "setShowGroupIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyMoneyInputView", "setShowGroupIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f198781g;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyMoneyInputView", "setShowGroupIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyMoneyInputView", "setShowGroupIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void setTitle(String str) {
        this.f198779e.setText(str);
    }

    public void setType(C76490i iVar) {
        this.f198786o = iVar;
    }
}
