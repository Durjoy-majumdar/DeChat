package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.r */
public class C18040r implements AppBrandAuthorizeUI$$p {

    /* renamed from: a */
    public final /* synthetic */ int f49850a;

    /* renamed from: b */
    public final /* synthetic */ int f49851b;

    /* renamed from: c */
    public final /* synthetic */ AppBrandAuthorizeUI f49852c;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.r$a */
    public class C18041a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f49853d;

        public C18041a(boolean z) {
            this.f49853d = z;
        }

        public void run() {
            if (this.f49853d) {
                C18040r rVar = C18040r.this;
                AppBrandAuthorizeUI appBrandAuthorizeUI = rVar.f49852c;
                int i = rVar.f49850a;
                String[] strArr = AppBrandAuthorizeUI.f49731X;
                appBrandAuthorizeUI.mo22480b8(i);
            } else {
                C18040r rVar2 = C18040r.this;
                AppBrandAuthorizeUI appBrandAuthorizeUI2 = rVar2.f49852c;
                int i2 = rVar2.f49851b;
                String[] strArr2 = AppBrandAuthorizeUI.f49731X;
                appBrandAuthorizeUI2.mo22480b8(i2);
            }
            C18040r.this.f49852c.mo22479a8();
            C18040r.this.f49852c.f49761j.notifyDataSetChanged();
        }
    }

    public C18040r(AppBrandAuthorizeUI appBrandAuthorizeUI, int i, int i2) {
        this.f49852c = appBrandAuthorizeUI;
        this.f49850a = i;
        this.f49851b = i2;
    }

    /* renamed from: a */
    public void mo22488a(boolean z) {
        MMHandlerThread.postToMainThread(new C18041a(z));
    }
}
