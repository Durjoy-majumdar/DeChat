package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.g */
public class C70561g implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ View.OnClickListener f204021d;

    /* renamed from: e */
    public final /* synthetic */ MobileRemittanceUI f204022e;

    public C70561g(MobileRemittanceUI mobileRemittanceUI, View.OnClickListener onClickListener) {
        this.f204022e = mobileRemittanceUI;
        this.f204021d = onClickListener;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66 && this.f204022e.f203983w.isShown()) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "click enter");
            this.f204021d.onClick((View) null);
        }
        return true;
    }
}
