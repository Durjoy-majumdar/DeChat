package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.ViewAnimHelper;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import ke3.C88144b;
import nj3.C76879j;
import p158gt.C76057w;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.aa.ui.n0 */
public class C68308n0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ LaunchAAUI f196331g;

    /* renamed from: com.tencent.mm.plugin.aa.ui.n0$a */
    public class C68309a implements DialogInterface.OnCancelListener {
        public C68309a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            Dialog dialog = C68308n0.this.f196331g.f196122W0;
            if (dialog != null && dialog.isShowing()) {
                C68308n0.this.f196331g.f196122W0.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.n0$b */
    public class C68310b implements C76057w.C76058a {
        public C68310b() {
        }

        /* renamed from: a */
        public void mo25933a(String str, Bitmap bitmap, String str2) {
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "onLoadImageEnd() url:%s path:%s", str, str2);
            Dialog dialog = C68308n0.this.f196331g.f196122W0;
            if (dialog != null && dialog.isShowing()) {
                C68308n0.this.f196331g.f196122W0.dismiss();
            }
            if (bitmap != null) {
                Intent intent = new Intent();
                intent.putExtra("use_scene", 1);
                intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, C68308n0.this.f196331g.f196158y0);
                intent.putExtra("path", C68308n0.this.f196331g.f196112R0);
                intent.putExtra("url", C68308n0.this.f196331g.f196110Q0);
                LaunchAAUI launchAAUI = C68308n0.this.f196331g;
                intent.putExtra("view_info", ViewAnimHelper.m90033b(launchAAUI.f196159z, launchAAUI.getContext().getWindow().getDecorView()));
                C88144b.m109795m(C68308n0.this.f196331g, "aa", ".ui.AAImagPreviewUI", intent, 310);
                C68308n0.this.f196331g.mo93790I7(14);
                return;
            }
            C76701a.makeText((Context) C68308n0.this.f196331g, (int) C0966R.string.f7287bn, 1).show();
        }
    }

    public C68308n0(LaunchAAUI launchAAUI) {
        this.f196331g = launchAAUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        LaunchAAUI launchAAUI = this.f196331g;
        if (launchAAUI.f196122W0 == null) {
            launchAAUI.f196122W0 = C76879j.m92721O(launchAAUI, (String) null, 3, C0966R.style.f8510l3, launchAAUI.getString(C0966R.string.gas), true, true, new C68309a());
        }
        if (!Util.isNullOrNil(this.f196331g.f196110Q0)) {
            ((C76057w) C86312j.m106911c(C76057w.class)).h60(this.f196331g.f196110Q0, new C68310b());
            return;
        }
        Log.m105924i("MicroMsg.Aa.LaunchAAUI", "imageUrl == null");
        Dialog dialog = this.f196331g.f196122W0;
        if (dialog != null && dialog.isShowing()) {
            this.f196331g.f196122W0.dismiss();
        }
        Intent intent = new Intent();
        intent.putExtra("use_scene", 1);
        this.f196331g.f196158y0 = 2;
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        intent.putExtra("path", this.f196331g.f196112R0);
        LaunchAAUI launchAAUI2 = this.f196331g;
        intent.putExtra("view_info", ViewAnimHelper.m90033b(launchAAUI2.f196159z, launchAAUI2.getContext().getWindow().getDecorView()));
        C88144b.m109795m(this.f196331g, "aa", ".ui.AAImagPreviewUI", intent, 310);
        this.f196331g.mo93790I7(14);
    }
}
