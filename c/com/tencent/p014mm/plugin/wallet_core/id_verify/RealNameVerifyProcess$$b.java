package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.autogen.events.WalletRealNameResultNotifyEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$$b */
public class RealNameVerifyProcess$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletGetUserInfoEvent f209028d;

    /* renamed from: e */
    public final /* synthetic */ Intent f209029e;

    /* renamed from: f */
    public final /* synthetic */ Activity f209030f;

    /* renamed from: g */
    public final /* synthetic */ Bundle f209031g;

    /* renamed from: h */
    public final /* synthetic */ RealNameVerifyProcess f209032h;

    public RealNameVerifyProcess$$b(RealNameVerifyProcess realNameVerifyProcess, WalletGetUserInfoEvent walletGetUserInfoEvent, Intent intent, Activity activity, Bundle bundle) {
        this.f209032h = realNameVerifyProcess;
        this.f209028d = walletGetUserInfoEvent;
        this.f209029e = intent;
        this.f209030f = activity;
        this.f209031g = bundle;
    }

    public void run() {
        Class<?> cls = null;
        this.f209028d.callback = null;
        this.f209032h.getClass();
        if (Util.isNullOrNil(this.f209032h.f209021f) || Util.isNullOrNil(this.f209032h.f209022g)) {
            RealNameVerifyProcess realNameVerifyProcess = this.f209032h;
            realNameVerifyProcess.mo109114l(this.f209030f, realNameVerifyProcess.f209023h, this.f209031g);
            int i = this.f209032h.f209023h;
            if (i == -1 || i == 0) {
                WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent = new WalletRealNameResultNotifyEvent();
                walletRealNameResultNotifyEvent.f9603d.f9604a = this.f209032h.f209023h;
                walletRealNameResultNotifyEvent.publish();
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.RealNameVerifyProcess", "real name verify process end,jump to " + this.f209032h.f209021f + this.f209032h.f209022g);
        boolean z = this.f209032h.f232423c.getBoolean("process_finish_stay_orgpage", true);
        this.f209029e.putExtra("key_process_is_end", true);
        this.f209029e.putExtra("key_process_is_stay", z);
        boolean z2 = this.f209029e.getExtras().getBoolean("is_from_new_cashier");
        try {
            cls = Class.forName(this.f209029e.getExtras().getString("start_activity_class", ""));
        } catch (ClassNotFoundException unused) {
        }
        Class<?> cls2 = cls;
        if (z2) {
            if (cls2 == null) {
                RealNameVerifyProcess realNameVerifyProcess2 = this.f209032h;
                realNameVerifyProcess2.mo109113k(this.f209030f, realNameVerifyProcess2.f209021f, realNameVerifyProcess2.f209022g, realNameVerifyProcess2.f209023h, this.f209029e, z);
            } else {
                RealNameVerifyProcess realNameVerifyProcess3 = this.f209032h;
                realNameVerifyProcess3.mo109110h(this.f209030f, cls2, realNameVerifyProcess3.f209023h, this.f209029e, z);
            }
            RealNameVerifyProcess$$g realNameVerifyProcess$$g = this.f209032h.f209025j;
            if (realNameVerifyProcess$$g != null) {
                realNameVerifyProcess$$g.run(this.f209030f);
                return;
            }
            return;
        }
        RealNameVerifyProcess realNameVerifyProcess4 = this.f209032h;
        realNameVerifyProcess4.mo109113k(this.f209030f, realNameVerifyProcess4.f209021f, realNameVerifyProcess4.f209022g, realNameVerifyProcess4.f209023h, this.f209029e, z);
        int i2 = this.f209032h.f209023h;
        if (i2 == -1 || i2 == 0) {
            WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent2 = new WalletRealNameResultNotifyEvent();
            walletRealNameResultNotifyEvent2.f9603d.f9604a = this.f209032h.f209023h;
            walletRealNameResultNotifyEvent2.publish();
        }
    }
}
