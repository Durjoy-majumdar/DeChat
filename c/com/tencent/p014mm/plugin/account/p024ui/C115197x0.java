package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.account.ui.x0 */
public class C115197x0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMFBLoginUI f345241d;

    public C115197x0(MMFBLoginUI mMFBLoginUI) {
        this.f345241d = mMFBLoginUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        MMFBLoginUI mMFBLoginUI = this.f345241d;
        String[] strArr = MMFBLoginUI.f344655p;
        mMFBLoginUI.getClass();
        C86709a0.m107525e().postAtFrontOfWorker(new C115194w0(mMFBLoginUI));
    }
}
