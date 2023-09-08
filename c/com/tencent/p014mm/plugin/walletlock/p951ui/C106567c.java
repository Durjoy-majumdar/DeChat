package com.tencent.p014mm.plugin.walletlock.p951ui;

import android.content.DialogInterface;
import b73.C28273c;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.walletlock.model.C106559h;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;

/* renamed from: com.tencent.mm.plugin.walletlock.ui.c */
public class C106567c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Preference f318408d;

    /* renamed from: e */
    public final /* synthetic */ WalletLockSettingUI f318409e;

    public C106567c(WalletLockSettingUI walletLockSettingUI, Preference preference) {
        this.f318409e = walletLockSettingUI;
        this.f318408d = preference;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        WalletLockSettingUI walletLockSettingUI = this.f318409e;
        int i2 = WalletLockSettingUI.f318391t;
        walletLockSettingUI.mo153266I7();
        this.f318409e.mo153267J7(this.f318408d, true, true);
        WalletLockSettingUI walletLockSettingUI2 = this.f318409e;
        walletLockSettingUI2.getClass();
        if (C106559h.instance.mo153253a() != 0) {
            Log.m105924i("MicroMsg.WalletLockSettingUI", "alvinluo request close wallet lock");
            ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91353g(walletLockSettingUI2, 3);
            WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new WCPaySaftyClickReportStruct();
            wCPaySaftyClickReportStruct.f194681d = 14;
            wCPaySaftyClickReportStruct.f194682e = 1;
            wCPaySaftyClickReportStruct.mo86054n();
        }
    }
}
