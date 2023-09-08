package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;

/* renamed from: com.tencent.mm.ui.conversation.y0 */
public class C74749y0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MainUI f219796d;

    public C74749y0(MainUI mainUI) {
        this.f219796d = mainUI;
    }

    public void run() {
        MainUI mainUI = this.f219796d;
        BannerHelper bannerHelper = mainUI.f219484w;
        Activity context = mainUI.getContext();
        MainUI mainUI2 = this.f219796d;
        bannerHelper.mo103665c(context, mainUI2.f219476o, mainUI2.f219481t);
    }
}
