package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$h */
public class AppBrandAuthorizeUI$$h implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ IconPreference f49787d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$h$a */
    public class C18024a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f49788d;

        public C18024a(Bitmap bitmap) {
            this.f49788d = bitmap;
        }

        public void run() {
            AppBrandAuthorizeUI$$h.this.f49787d.mo101930L(this.f49788d);
            AppBrandAuthorizeUI$$h.this.f49787d.mo101932N(0);
            AppBrandAuthorizeUI$$h.this.f49787d.mo101934R(0);
        }
    }

    public AppBrandAuthorizeUI$$h(AppBrandAuthorizeUI appBrandAuthorizeUI, IconPreference iconPreference) {
        this.f49787d = iconPreference;
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
        MMHandlerThread.postToMainThread(new C18024a(bitmap));
    }
}
