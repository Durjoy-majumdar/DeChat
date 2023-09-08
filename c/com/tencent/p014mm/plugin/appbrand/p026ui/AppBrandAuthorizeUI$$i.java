package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import kg3.C76577a;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$i */
public class AppBrandAuthorizeUI$$i implements C88394b.C88408j {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeUI f246300d;

    public AppBrandAuthorizeUI$$i(AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f246300d = appBrandAuthorizeUI;
    }

    /* renamed from: c */
    public Bitmap mo5830c(Bitmap bitmap) {
        return BitmapUtil.getRoundedCornerBitmap(bitmap, false, (float) C76577a.m92151b(this.f246300d.getContext(), 4), false);
    }

    public String key() {
        return "setting_wxa_user_profile_icon";
    }
}
