package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import kg3.C76577a;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$g */
public class AppBrandAuthorizeUI$$g implements C88394b.C88408j {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeUI f246299d;

    public AppBrandAuthorizeUI$$g(AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f246299d = appBrandAuthorizeUI;
    }

    /* renamed from: c */
    public Bitmap mo5830c(Bitmap bitmap) {
        return BitmapUtil.getRoundedCornerBitmap(bitmap, false, (float) C76577a.m92151b(this.f246299d.getContext(), 4), false);
    }

    public String key() {
        return "setting_wxa_user_info_icon";
    }
}
