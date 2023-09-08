package wq0;

import android.util.SparseIntArray;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import js0.C88024r;

/* renamed from: wq0.q */
public class C91080q extends C91079p {
    public C91080q(AppBrandRuntime appBrandRuntime) {
        super(appBrandRuntime);
    }

    public void i60(String str) {
        AppBrandRuntime appBrandRuntime = this.f261262d;
        SparseIntArray sparseIntArray = C91059b.f261232a;
        if (appBrandRuntime != null && !Util.isNullOrNil(str)) {
            String string = MMApplicationContext.getResources().getString(C91059b.f261232a.get(str.hashCode()));
            C88024r.m109572b(new C91061c(appBrandRuntime, MMApplicationContext.getResources().getString(C0966R.string.f7731pm, new Object[]{string})));
        }
    }
}
