package gq0;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11184p0;
import nj3.C76875f0;

/* renamed from: gq0.u */
public final class C8374u implements C11184p0 {

    /* renamed from: d */
    public static final C8374u f27364d = new C8374u();

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Log.m105918d("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onMMMenuItemSelected, menuItem: " + menuItem + ", i: " + i);
        if (menuItem instanceof C76875f0) {
            ((C76875f0) menuItem).mo107177c();
        } else {
            Log.m105928w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onMMMenuItemSelected, menuItem is not MMMenuItem");
        }
    }
}
