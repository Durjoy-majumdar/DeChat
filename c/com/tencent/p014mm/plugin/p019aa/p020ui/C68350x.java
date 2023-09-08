package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.aa.ui.x */
public class C68350x implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ View.OnClickListener f196380d;

    /* renamed from: e */
    public final /* synthetic */ AARemittanceUI f196381e;

    public C68350x(AARemittanceUI aARemittanceUI, View.OnClickListener onClickListener) {
        this.f196381e = aARemittanceUI;
        this.f196380d = onClickListener;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66 && this.f196381e.f195968i.isShown()) {
            Log.m105924i("MicroMsg.AARemittanceUI", "click pay");
            this.f196380d.onClick((View) null);
        }
        return true;
    }
}
