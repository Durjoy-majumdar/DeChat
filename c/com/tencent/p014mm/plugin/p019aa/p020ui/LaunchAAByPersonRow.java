package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;

/* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonRow */
public class LaunchAAByPersonRow extends LinearLayout {

    /* renamed from: d */
    public WalletFormView f10479d;

    public LaunchAAByPersonRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1270a();
    }

    /* renamed from: a */
    public final void mo1270a() {
        View.inflate(getContext(), C0966R.C0971layout.b3u, this);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f5261a_);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f5288b0);
        this.f10479d = (WalletFormView) findViewById(C0966R.C0970id.f358503fi3);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.fi4);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.h9z);
    }

    public WalletFormView getAmountEditView() {
        return this.f10479d;
    }

    public double getMoneyAmount() {
        String str = this.f10479d.getText().toString();
        if (Util.isNullOrNil(str) || "".equals(str)) {
            return 0.0d;
        }
        return Util.getDouble(str, 0.0d);
    }

    public String getUsername() {
        return null;
    }

    public void setAmountTextChangeWatcher(TextWatcher textWatcher) {
        if (textWatcher != null) {
            this.f10479d.mo105069a(textWatcher);
        }
    }

    public LaunchAAByPersonRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo1270a();
    }
}
