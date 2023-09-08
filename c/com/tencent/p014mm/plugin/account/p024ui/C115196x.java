package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.account.ui.x */
public class C115196x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginByMobileSendSmsUI f345240d;

    public C115196x(LoginByMobileSendSmsUI loginByMobileSendSmsUI) {
        this.f345240d = loginByMobileSendSmsUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LoginByMobileSendSmsUI loginByMobileSendSmsUI = this.f345240d;
        loginByMobileSendSmsUI.f344490v.setEnabled(false);
        MTimerHandler mTimerHandler = loginByMobileSendSmsUI.f344493y;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            loginByMobileSendSmsUI.f344494z = 15;
            loginByMobileSendSmsUI.f344488t = 0;
            loginByMobileSendSmsUI.f344493y.startTimer(0, 1000);
        } else {
            MTimerHandler mTimerHandler2 = new MTimerHandler(new C115190v(loginByMobileSendSmsUI), true);
            loginByMobileSendSmsUI.f344493y = mTimerHandler2;
            mTimerHandler2.startTimer(0, 1000);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
