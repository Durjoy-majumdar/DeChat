package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.app.Dialog;
import android.os.Looper;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43290f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import te3.C78023zk3;
import y43.C79029b0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.i0 */
public class C69607i0 implements C87581a<Void, C78023zk3> {

    /* renamed from: a */
    public final /* synthetic */ C43290f0 f200962a;

    /* renamed from: b */
    public final /* synthetic */ Dialog f200963b;

    /* renamed from: c */
    public final /* synthetic */ String f200964c;

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyDetailUI f200965d;

    public C69607i0(LuckyMoneyDetailUI luckyMoneyDetailUI, C43290f0 f0Var, Dialog dialog, String str) {
        this.f200965d = luckyMoneyDetailUI;
        this.f200962a = f0Var;
        this.f200963b = dialog;
        this.f200964c = str;
    }

    public Object call(Object obj) {
        C78023zk3 zk32 = (C78023zk3) obj;
        if (zk32 != null) {
            Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "fetch detail success, account_type: %s, is_hide_close_account_btn: %s", Integer.valueOf(zk32.f228693C), Boolean.valueOf(zk32.f228692B));
            this.f200962a.f117129e.mo67529b(zk32.f228693C, 6);
            if (C79029b0.vx0().wx0().f192955h == null) {
                Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "publish WalletGetUserInfoEvent");
                WalletGetUserInfoEvent walletGetUserInfoEvent = new WalletGetUserInfoEvent();
                WalletGetUserInfoEvent.C67824a aVar = walletGetUserInfoEvent.f194038d;
                aVar.f194040a = 1;
                aVar.f194041b = true;
                aVar.f194042c = true;
                walletGetUserInfoEvent.f194039e.f194055a = new C69601h0(this, zk32);
                walletGetUserInfoEvent.asyncPublish(Looper.myLooper());
                return null;
            }
            LuckyMoneyDetailUI.m81735M7(this.f200965d, zk32, this.f200963b, this.f200964c);
            return null;
        }
        Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "fetch detail failed");
        return null;
    }
}
