package fh1;

import android.graphics.Bitmap;
import android.view.MenuItem;
import cj1.C54741c;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import nj3.C11184p0;

/* renamed from: fh1.l1 */
public final class C59045l1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C59018f2 f168947d;

    /* renamed from: e */
    public final /* synthetic */ C54741c f168948e;

    public C59045l1(C59018f2 f2Var, C54741c cVar) {
        this.f168947d = f2Var;
        this.f168948e = cVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
        if (valueOf != null && valueOf.intValue() == 0) {
            Log.m105924i("Finder.LivePromoteBannerController", "click dislike banner menu from share menu");
            C59018f2.m68934F3(this.f168947d, this.f168948e, false);
        }
    }
}
