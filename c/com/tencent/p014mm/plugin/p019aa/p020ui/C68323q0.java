package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.view.ViewAnimHelper;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.aa.ui.q0 */
public class C68323q0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ LaunchAAUI f196348g;

    public C68323q0(LaunchAAUI launchAAUI) {
        this.f196348g = launchAAUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Intent intent = new Intent();
        intent.putExtra("use_scene", 1);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f196348g.f196158y0);
        intent.putExtra("path", this.f196348g.f196112R0);
        intent.putExtra("url", this.f196348g.f196110Q0);
        LaunchAAUI launchAAUI = this.f196348g;
        intent.putExtra("view_info", ViewAnimHelper.m90033b(launchAAUI.f196159z, launchAAUI.getContext().getWindow().getDecorView()));
        C88144b.m109795m(this.f196348g, "aa", ".ui.AAImagPreviewUI", intent, 310);
    }
}
