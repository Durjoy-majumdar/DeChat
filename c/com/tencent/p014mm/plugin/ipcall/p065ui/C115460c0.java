package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.ViewTreeObserver;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.c0 */
public class C115460c0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallDynamicTextView f346176d;

    public C115460c0(IPCallDynamicTextView iPCallDynamicTextView) {
        this.f346176d = iPCallDynamicTextView;
    }

    public void onGlobalLayout() {
        IPCallDynamicTextView iPCallDynamicTextView = this.f346176d;
        if (iPCallDynamicTextView.f346167f != iPCallDynamicTextView.f346168g) {
            iPCallDynamicTextView.f346174p.sendEmptyMessage(1);
        }
    }
}
