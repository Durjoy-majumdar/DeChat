package com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69637m1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69727y2;
import p32.C77055a;
import qn3.C77382c;

/* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.view.WxaLuckyMoneyTextInputView */
public class WxaLuckyMoneyTextInputView extends LinearLayout implements C69637m1 {

    /* renamed from: d */
    public MMEditText f198868d;

    /* renamed from: e */
    public TextView f198869e;

    /* renamed from: f */
    public C69727y2 f198870f;

    public WxaLuckyMoneyTextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cj4, this, true);
        this.f198868d = (MMEditText) inflate.findViewById(C0966R.C0970id.gj6);
        this.f198869e = (TextView) inflate.findViewById(C0966R.C0970id.gj8);
        this.f198868d.setOnFocusChangeListener(new C77055a(this));
        C77382c b = C77382c.m93286b(this.f198868d);
        b.f225611e = 0;
        b.f225610d = 24;
        b.f225607a = false;
        b.mo107499d((C77382c.C77383a) null);
    }

    /* renamed from: a */
    public void mo5751a() {
    }

    /* renamed from: b */
    public void mo5752b() {
    }

    /* renamed from: c */
    public int mo5753c() {
        return 0;
    }

    /* renamed from: d */
    public int mo5754d() {
        return 0;
    }

    /* renamed from: e */
    public String mo5755e(int i) {
        return null;
    }

    public String getInput() {
        return this.f198868d.getText().toString();
    }

    public int getInputViewId() {
        return getId();
    }

    public void setHintText(String str) {
        this.f198868d.setHint(str);
    }

    public void setOnInputValidChangerListener(C69727y2 y2Var) {
        this.f198870f = y2Var;
    }

    public void setTitle(String str) {
        this.f198869e.setText(str);
    }
}
