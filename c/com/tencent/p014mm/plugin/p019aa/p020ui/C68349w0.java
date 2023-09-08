package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.aa.ui.w0 */
public class C68349w0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ ImageView f196377g;

    /* renamed from: h */
    public final /* synthetic */ C77407n f196378h;

    /* renamed from: i */
    public final /* synthetic */ LaunchAAUI f196379i;

    public C68349w0(LaunchAAUI launchAAUI, ImageView imageView, C77407n nVar) {
        this.f196379i = launchAAUI;
        this.f196377g = imageView;
        this.f196378h = nVar;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.Aa.LaunchAAUI", "choose aaByPerson mdoe");
        if (this.f196377g.getVisibility() == 8) {
            this.f196377g.setVisibility(0);
        }
        LaunchAAUI launchAAUI = this.f196379i;
        launchAAUI.f196137h = 3;
        launchAAUI.f196139i = 5;
        launchAAUI.mo93813k8();
        this.f196378h.mo107572p();
    }
}
