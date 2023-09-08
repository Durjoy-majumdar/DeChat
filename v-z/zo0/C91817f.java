package zo0;

import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrand404PageUI;
import zo0.C91813c;

/* renamed from: zo0.f */
public final class C91817f extends C91813c {
    /* renamed from: c */
    public void mo62044c(String str, Uri uri, int i, Bundle bundle, C91813c.C91814a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return;
        }
        if (ordinal == 1) {
            AppBrand404PageUI.m1962H7(C0966R.string.f7633m3);
        } else if (ordinal == 2) {
            AppBrand404PageUI.m1962H7(C0966R.string.f7837t4);
        } else if (ordinal != 3) {
            AppBrand404PageUI.m1962H7(C0966R.string.f7675nl);
        } else {
            AppBrand404PageUI.m1962H7(C0966R.string.f7634m4);
        }
    }
}
