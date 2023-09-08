package zo0;

import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrand404PageUI;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import zo0.C91813c;

/* renamed from: zo0.i */
public final class C91818i extends C91813c {
    /* renamed from: c */
    public void mo62044c(String str, Uri uri, int i, Bundle bundle, C91813c.C91814a aVar) {
        String queryParameter = uri == null ? "" : uri.getQueryParameter("appid");
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return;
        }
        if (ordinal == 1) {
            int i2 = 0;
            if (uri != null && uri.getBooleanQueryParameter("debug", false)) {
                i2 = 1;
            }
            AppBrand404PageUI.m1962H7(C0966R.string.f7858u5);
            C84240s.m103846l(queryParameter, 2, i2 + 1);
        } else if (ordinal == 2) {
            AppBrand404PageUI.m1962H7(C0966R.string.f7837t4);
            C84240s.m103846l("", 4, 2);
        } else if (ordinal != 3) {
            AppBrand404PageUI.m1962H7(C0966R.string.f7675nl);
        } else {
            AppBrand404PageUI.m1962H7(C0966R.string.f7836t3);
            C84240s.m103846l("", 3, 2);
        }
    }
}
