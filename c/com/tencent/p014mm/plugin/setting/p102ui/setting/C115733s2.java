package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import com.tencent.p014mm.modelstat.C114747n;
import com.tencent.p014mm.modelstat.C114748r;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p680ru.C36490j;
import p680ru.C36491k;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.s2 */
public class C115733s2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsNetStatUI f347178d;

    public C115733s2(SettingsNetStatUI settingsNetStatUI) {
        this.f347178d = settingsNetStatUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C36491k Ho0 = ((C36490j) C86312j.m106911c(C36490j.class)).Ho0();
        int currentDayInMills = (int) (Util.currentDayInMills() / 86400000);
        C114748r rVar = (C114748r) Ho0;
        rVar.f344054f.clear();
        rVar.f344052d.delete("netstat", (String) null, (String[]) null);
        C114747n nVar = new C114747n();
        nVar.f344026c = currentDayInMills;
        nVar.f344025b = -1;
        rVar.mo174391Yt(nVar);
        SettingsNetStatUI settingsNetStatUI = this.f347178d;
        int i2 = SettingsNetStatUI.f347173f;
        settingsNetStatUI.mo176031H7();
    }
}
