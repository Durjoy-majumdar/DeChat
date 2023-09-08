package com.tencent.p014mm.plugin.collect.reward.p037ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.collect.reward.ui.c */
public class C68828c implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ QrRewardMainUI f197747d;

    public C68828c(QrRewardMainUI qrRewardMainUI) {
        this.f197747d = qrRewardMainUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            QrRewardMainUI qrRewardMainUI = this.f197747d;
            qrRewardMainUI.f197726z = "";
            qrRewardMainUI.mo94659K7();
            this.f197747d.mo94662N7(true);
            C115669n.INSTANCE.mo160131h(14721, 1, 3);
        } else if (itemId != 2) {
            Log.m105925i("MicroMsg.QrRewardMainUI", "unknown menu: %s", Integer.valueOf(menuItem.getItemId()));
            QrRewardMainUI qrRewardMainUI2 = this.f197747d;
            int i2 = QrRewardMainUI.f197698I;
            qrRewardMainUI2.mo94662N7(true);
        } else {
            QrRewardMainUI qrRewardMainUI3 = this.f197747d;
            int i3 = QrRewardMainUI.f197698I;
            qrRewardMainUI3.mo94662N7(false);
            QrRewardMainUI qrRewardMainUI4 = this.f197747d;
            qrRewardMainUI4.f197716p.setCursorVisible(true);
            qrRewardMainUI4.f197716p.requestFocus();
            qrRewardMainUI4.f197716p.requestFocusFromTouch();
            qrRewardMainUI4.showVKB();
            C115669n.INSTANCE.mo160131h(14721, 1, 4);
        }
    }
}
