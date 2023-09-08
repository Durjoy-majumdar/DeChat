package com.tencent.p014mm.plugin.webview.p128ui.tools;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import qn3.C77382c;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.d */
public class C6154d implements C0120a0<String> {

    /* renamed from: d */
    public final /* synthetic */ CreateAvatarUI f22610d;

    public C6154d(CreateAvatarUI createAvatarUI) {
        this.f22610d = createAvatarUI;
    }

    public void onChanged(Object obj) {
        Log.m105925i("MicroMsg.CreateAvatarUI", "avatar file id get success = &s", this.f22610d.f22488p);
        CreateAvatarUI createAvatarUI = this.f22610d;
        createAvatarUI.f22488p = (String) obj;
        if (createAvatarUI.f22489q) {
            C77382c b = C77382c.m93286b(createAvatarUI.f22480e);
            b.f225611e = 1;
            b.f225610d = 32;
            b.mo107499d(this.f22610d);
        }
    }
}
