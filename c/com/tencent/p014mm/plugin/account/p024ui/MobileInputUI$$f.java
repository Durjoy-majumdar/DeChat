package com.tencent.p014mm.plugin.account.p024ui;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileInputUI$$f */
public class MobileInputUI$$f implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ MobileInputUI f10737d;

    public MobileInputUI$$f(MobileInputUI mobileInputUI) {
        this.f10737d = mobileInputUI;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6 || i == 5) {
            return this.f10737d.mo174700I7();
        }
        return false;
    }
}
