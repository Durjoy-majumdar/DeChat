package fh1;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import cj1.C54741c;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.view.C3206b2;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gy3.C8479f0;
import java.util.HashMap;
import je1.C46544w0;
import nj3.C11184p0;
import o40.C61926c;
import ok1.C62042e;
import pe3.C89349b;
import qo3.C77407n;
import te3.C64331dw0;
import zc1.C66785b;

/* renamed from: fh1.h2 */
public final class C59029h2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C54741c f168913d;

    /* renamed from: e */
    public final /* synthetic */ C59018f2 f168914e;

    /* renamed from: f */
    public final /* synthetic */ boolean f168915f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<C77407n> f168916g;

    public C59029h2(C54741c cVar, C59018f2 f2Var, boolean z, C8479f0<C77407n> f0Var) {
        this.f168913d = cVar;
        this.f168914e = f2Var;
        this.f168915f = z;
        this.f168916g = f0Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str;
        int itemId = menuItem.getItemId();
        HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
        if (itemId == 0) {
            Log.m105924i("Finder.LivePromoteBannerController", "click dislike banner menu");
            C54741c cVar = this.f168913d;
            C64331dw0 dw02 = cVar.f153444h;
            if (dw02 == null || (str = dw02.f182876d) == null) {
                str = "";
            }
            C59018f2 f2Var = this.f168914e;
            f2Var.getClass();
            Class cls = C55001u.class;
            if (TextUtils.isEmpty(str)) {
                Log.m105920e("Finder.LivePromoteBannerController", "dislikeId is empty");
            } else {
                String str2 = ((C54991o) f2Var.business(C54991o.class)).f154345o;
                if (C62042e.f176370a.mo87027N0()) {
                    str2 = C66785b.f191882e.mo90662O5();
                }
                new C46544w0(((C55001u) f2Var.business(cls)).f154416j, ((C55001u) f2Var.business(cls)).f154420q.f182392d, C89349b.m111674a(((C55001u) f2Var.business(cls)).f154417n), str2, ((C55001u) f2Var.business(cls)).f154423t, str).mo9225i().mo123420E(C8077p1.f26858a);
                C61926c.m72668M(new C59078s1(f2Var, str, cVar));
            }
            C59018f2 f2Var2 = this.f168914e;
            f2Var2.mo84248P3(f2Var2.mo84242J3(str, 3));
            if (this.f168915f) {
                C59018f2 f2Var3 = this.f168914e;
                f2Var3.mo84248P3(f2Var3.mo84242J3(str, 5));
            } else {
                C59018f2 f2Var4 = this.f168914e;
                f2Var4.mo84248P3(f2Var4.mo84242J3(str, 4));
            }
            C3206b2 b2Var = this.f168914e.f27261e;
            C56032b bVar = b2Var instanceof C56032b ? (C56032b) b2Var : null;
            if (bVar != null) {
                C58124b.C7172a.m7372a(bVar, C58124b.C58125b.FINDER_LIVE_CLOSE_PROMOTE_BANNER, (Bundle) null, 2, (Object) null);
            }
            ((C77407n) this.f168916g.f27484d).mo107572p();
        }
    }
}
