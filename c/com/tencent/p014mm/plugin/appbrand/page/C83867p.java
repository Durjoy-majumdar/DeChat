package com.tencent.p014mm.plugin.appbrand.page;

import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.appbrand.page.p */
public class C83867p implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ AppBrandMenuHeader f244856d;

    public C83867p(AppBrandMenuHeader appBrandMenuHeader) {
        this.f244856d = appBrandMenuHeader;
    }

    /* renamed from: b */
    public void mo1907b() {
        AppBrandMenuHeader appBrandMenuHeader = this.f244856d;
        int i = AppBrandMenuHeader.f244378q;
        appBrandMenuHeader.mo116015b(true);
        this.f244856d.f244382g.setText(MMApplicationContext.getContext().getString(C0966R.string.hzz));
    }

    /* renamed from: d */
    public void mo1908d() {
    }

    public String key() {
        return null;
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        AppBrandMenuHeader appBrandMenuHeader = this.f244856d;
        int i = AppBrandMenuHeader.f244378q;
        appBrandMenuHeader.mo116015b(false);
        this.f244856d.f244383h.setImageBitmap(bitmap);
    }
}
