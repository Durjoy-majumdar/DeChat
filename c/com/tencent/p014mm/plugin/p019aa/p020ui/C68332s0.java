package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import hp3.C87581a;
import te3.C77933g43;
import yf0.C79098e;

/* renamed from: com.tencent.mm.plugin.aa.ui.s0 */
public class C68332s0 implements C87581a<Void, C79098e> {

    /* renamed from: a */
    public final /* synthetic */ LaunchAAUI f196355a;

    public C68332s0(LaunchAAUI launchAAUI) {
        this.f196355a = launchAAUI;
    }

    public Object call(Object obj) {
        C79098e eVar = (C79098e) obj;
        Log.m105924i("MicroMsg.Aa.LaunchAAUI", "fetch operation data finish");
        if (eVar == null) {
            return null;
        }
        LaunchAAUI launchAAUI = this.f196355a;
        launchAAUI.f196119V = eVar;
        if (!launchAAUI.mo93791M7()) {
            this.f196355a.mo93808e8();
            this.f196355a.mo93813k8();
            this.f196355a.mo93798U7();
            this.f196355a.mo93806c8();
            LaunchAAUI launchAAUI2 = this.f196355a;
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "initGroupSolitatireEntrance，is show :%s", Boolean.valueOf(launchAAUI2.f196119V.f232250e));
            C79098e eVar2 = launchAAUI2.f196119V;
            if (eVar2 != null && eVar2.f232250e && !launchAAUI2.mo93791M7() && C72996z1.m85820U5(launchAAUI2.f196141j)) {
                launchAAUI2.addTextOptionMenu(1, launchAAUI2.getString(C0966R.string.mxh), new C68275c1(launchAAUI2), (View.OnLongClickListener) null, MMActivityController.C73075r.NORMAL);
            }
        }
        LaunchAAUI launchAAUI3 = this.f196355a;
        C77933g43 g432 = launchAAUI3.f196119V.f232249d;
        launchAAUI3.f196143k1.mo105020a();
        launchAAUI3.f196143k1.setBannerData(g432);
        return null;
    }
}
