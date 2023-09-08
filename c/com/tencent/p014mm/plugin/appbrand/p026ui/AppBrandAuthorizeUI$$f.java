package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$f */
public class AppBrandAuthorizeUI$$f implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ IconPreference f49784d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$f$a */
    public class C18023a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f49785d;

        public C18023a(Bitmap bitmap) {
            this.f49785d = bitmap;
        }

        public void run() {
            AppBrandAuthorizeUI$$f.this.f49784d.mo101930L(this.f49785d);
            AppBrandAuthorizeUI$$f.this.f49784d.mo101932N(0);
            AppBrandAuthorizeUI$$f.this.f49784d.mo101934R(0);
        }
    }

    public AppBrandAuthorizeUI$$f(AppBrandAuthorizeUI appBrandAuthorizeUI, IconPreference iconPreference) {
        this.f49784d = iconPreference;
    }

    /* renamed from: b */
    public void mo1907b() {
    }

    /* renamed from: d */
    public void mo1908d() {
    }

    public String key() {
        return null;
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        MMHandlerThread.postToMainThread(new C18023a(bitmap));
    }
}
