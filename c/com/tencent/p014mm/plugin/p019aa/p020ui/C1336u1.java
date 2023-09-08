package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.widget.RelativeLayout;
import android.widget.TextView;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.aa.ui.u1 */
public class C1336u1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextView f10480d;

    /* renamed from: e */
    public final /* synthetic */ TextView f10481e;

    /* renamed from: f */
    public final /* synthetic */ PaylistAAUI f10482f;

    public C1336u1(PaylistAAUI paylistAAUI, TextView textView, TextView textView2) {
        this.f10482f = paylistAAUI;
        this.f10480d = textView;
        this.f10481e = textView2;
    }

    public void run() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10480d.getLayoutParams();
        layoutParams.topMargin = this.f10481e.getHeight() + C76577a.m92151b(this.f10482f.getContext(), 10);
        this.f10480d.setLayoutParams(layoutParams);
    }
}
