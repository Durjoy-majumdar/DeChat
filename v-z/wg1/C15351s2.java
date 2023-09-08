package wg1;

import ak1.C54067f0;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ht1.C8777j5;
import nj3.C11184p0;
import p140cw.C7138g;
import qo3.C77407n;
import te3.C49098d51;

/* renamed from: wg1.s2 */
public final class C15351s2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C15370z1 f41699d;

    /* renamed from: e */
    public final /* synthetic */ C77407n f41700e;

    public C15351s2(C15370z1 z1Var, C77407n nVar) {
        this.f41699d = z1Var;
        this.f41700e = nVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            Log.m105924i("FinderLiveNoticeQRCodeUIC", "CHOICE_ALBUM_SET pick");
            ((C7138g) C86312j.m106911c(C7138g.class)).mo8317di(this.f41699d.getContext(), 1000, 9, 0, (Intent) null, false);
        } else if (itemId == 2) {
            Log.m105924i("FinderLiveNoticeQRCodeUIC", "CHOICE_ALBUM_DEL_IMG pick");
            this.f41699d.mo14197l3("");
            C8777j5 j5Var = (C8777j5) C86312j.m106911c(C8777j5.class);
            C54067f0.C0050b0 b0Var = C54067f0.C0050b0.LIVE_IMG_DELETE;
            C49098d51 d512 = this.f41699d.f41739N.f41643b;
            if (d512 == null || (str = d512.f132121g) == null) {
                str = "";
            }
            j5Var.mo9608aH(b0Var, "", str);
        }
        this.f41700e.mo107572p();
    }
}
