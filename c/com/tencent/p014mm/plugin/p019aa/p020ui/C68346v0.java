package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.aa.ui.v0 */
public class C68346v0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ ImageView f196369g;

    /* renamed from: h */
    public final /* synthetic */ C77407n f196370h;

    /* renamed from: i */
    public final /* synthetic */ LaunchAAUI f196371i;

    public C68346v0(LaunchAAUI launchAAUI, ImageView imageView, C77407n nVar) {
        this.f196371i = launchAAUI;
        this.f196369g = imageView;
        this.f196370h = nVar;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.Aa.LaunchAAUI", "choose aa mdoe");
        if (this.f196369g.getVisibility() == 8) {
            this.f196369g.setVisibility(0);
        }
        LaunchAAUI launchAAUI = this.f196371i;
        launchAAUI.f196137h = 2;
        launchAAUI.mo93813k8();
        this.f196370h.mo107572p();
    }
}
