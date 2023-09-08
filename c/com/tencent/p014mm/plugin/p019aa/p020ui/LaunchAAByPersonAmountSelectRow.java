package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectRow */
public class LaunchAAByPersonAmountSelectRow extends LinearLayout {

    /* renamed from: d */
    public WalletFormView f10474d;

    /* renamed from: e */
    public View f10475e;

    public LaunchAAByPersonAmountSelectRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1261a(context);
    }

    /* renamed from: a */
    public final void mo1261a(Context context) {
        C85868k2.m106137b(context).inflate(C0966R.C0971layout.b3r, this, true);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.a1p);
        TextView textView = (TextView) findViewById(C0966R.C0970id.l2o);
        this.f10474d = (WalletFormView) findViewById(C0966R.C0970id.gyk);
        this.f10475e = findViewById(C0966R.C0970id.c7p);
    }

    public double getAmount() {
        String str = this.f10474d.getText().toString();
        if (Util.isNullOrNil(str) || "".equals(str)) {
            return 0.0d;
        }
        return Util.getDouble(str, 0.0d);
    }

    public WalletFormView getMoneyEdit() {
        return this.f10474d;
    }

    public String getUsername() {
        return null;
    }

    public void setDividerVisible(boolean z) {
        View view = this.f10475e;
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectRow", "setDividerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectRow", "setDividerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void setTextWatcher(TextWatcher textWatcher) {
        this.f10474d.mo105069a(textWatcher);
    }

    public LaunchAAByPersonAmountSelectRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo1261a(context);
    }
}
