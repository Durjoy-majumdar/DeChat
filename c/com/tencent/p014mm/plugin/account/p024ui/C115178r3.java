package com.tencent.p014mm.plugin.account.p024ui;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116099e;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116105j;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.account.ui.r3 */
public class C115178r3 implements C116102h.C116103a {

    /* renamed from: a */
    public final /* synthetic */ WelcomeActivity f345225a;

    public C115178r3(WelcomeActivity welcomeActivity) {
        this.f345225a = welcomeActivity;
    }

    /* renamed from: b */
    public void mo1391b(Bundle bundle) {
        Log.m105924i("MicroMsg.WelcomeActivity", "facebook login success");
        WelcomeActivity welcomeActivity = this.f345225a;
        String[] strArr = WelcomeActivity.f345072h;
        welcomeActivity.getClass();
        C86709a0.m107525e().postAtFrontOfWorker(new C115174q3(welcomeActivity));
    }

    /* renamed from: c */
    public void mo1392c(C116105j jVar) {
        Log.m105925i("MicroMsg.WelcomeActivity", "facebook-android login error! %s", jVar.getMessage());
        WelcomeActivity welcomeActivity = this.f345225a;
        C76879j.m92748s(welcomeActivity, welcomeActivity.getString(C0966R.string.cl4), "");
    }

    /* renamed from: d */
    public void mo1393d(C116099e eVar) {
        Log.m105925i("MicroMsg.WelcomeActivity", "facebook-android login error! %s", eVar.getMessage());
        WelcomeActivity welcomeActivity = this.f345225a;
        C76879j.m92748s(welcomeActivity, welcomeActivity.getString(C0966R.string.cl4), "");
    }

    public void onCancel() {
        Log.m105924i("MicroMsg.WelcomeActivity", "facebook login cancel");
    }
}
