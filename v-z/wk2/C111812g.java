package wk2;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Result;
import nd3.C88930e;
import p447aw.C103918d;
import sx3.C110823p;
import wx3.C15601d;

/* renamed from: wk2.g */
public final class C111812g implements C88930e {

    /* renamed from: a */
    public final /* synthetic */ C15601d<Integer> f334798a;

    public C111812g(C15601d<? super Integer> dVar) {
        this.f334798a = dVar;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Integer G;
        if (i == 76) {
            C87412m.m108593f(iArr, "grantResults");
            int i2 = 1;
            if ((!(iArr.length == 0)) && (G = C110823p.m150981G(iArr, 0)) != null && G.intValue() == -1) {
                if (System.currentTimeMillis() - ((C103918d) C86312j.m106911c(C103918d.class)).mo125770Iw("android.permission.ACCESS_FINE_LOCATION", i) > 300) {
                    i2 = 2;
                }
                this.f334798a.resumeWith(Result.m168114constructorimpl(Integer.valueOf(i2)));
                return;
            }
        }
        Log.m105924i("MicroMsg.JsApiGeoLocation", "geoLocation checkBusinessPermission after system permission granted");
        C118764f.f355315f.mo183495f(this.f334798a);
    }
}
