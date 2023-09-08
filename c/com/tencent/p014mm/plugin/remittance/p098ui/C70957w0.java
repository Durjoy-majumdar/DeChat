package com.tencent.p014mm.plugin.remittance.p098ui;

import android.app.Dialog;
import android.os.Looper;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43290f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import te3.C78023zk3;
import y43.C79029b0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.w0 */
public class C70957w0 implements C87581a<Void, C78023zk3> {

    /* renamed from: a */
    public final /* synthetic */ C43290f0 f205409a;

    /* renamed from: b */
    public final /* synthetic */ Dialog f205410b;

    /* renamed from: c */
    public final /* synthetic */ String f205411c;

    /* renamed from: d */
    public final /* synthetic */ RemittanceDetailUI f205412d;

    public C70957w0(RemittanceDetailUI remittanceDetailUI, C43290f0 f0Var, Dialog dialog, String str) {
        this.f205412d = remittanceDetailUI;
        this.f205409a = f0Var;
        this.f205410b = dialog;
        this.f205411c = str;
    }

    public Object call(Object obj) {
        C78023zk3 zk32 = (C78023zk3) obj;
        if (zk32 != null) {
            Log.m105925i("MicroMsg.RemittanceDetailUI", "fetch detail success, account_type: %s, is_hide_close_account_btn: %s", Integer.valueOf(zk32.f228693C), Boolean.valueOf(zk32.f228692B));
            this.f205409a.f117129e.mo67529b(zk32.f228693C, 2);
            if (C79029b0.vx0().wx0().f192955h == null) {
                Log.m105924i("MicroMsg.RemittanceDetailUI", "publish WalletGetUserInfoEvent");
                WalletGetUserInfoEvent walletGetUserInfoEvent = new WalletGetUserInfoEvent();
                WalletGetUserInfoEvent.C67824a aVar = walletGetUserInfoEvent.f194038d;
                aVar.f194040a = 1;
                aVar.f194041b = true;
                aVar.f194042c = true;
                walletGetUserInfoEvent.f194039e.f194055a = new C70954v0(this, zk32);
                walletGetUserInfoEvent.asyncPublish(Looper.myLooper());
                return null;
            }
            RemittanceDetailUI.m83237I7(this.f205412d, zk32, this.f205410b, this.f205411c);
            return null;
        }
        Log.m105924i("MicroMsg.RemittanceDetailUI", "fetch detail failed");
        return null;
    }
}
