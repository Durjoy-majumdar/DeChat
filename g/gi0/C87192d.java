package gi0;

import com.tencent.p014mm.plugin.appbrand.appcache.C81273j1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81278k;
import com.tencent.p014mm.plugin.appbrand.appcache.C81293m3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81294n;
import com.tencent.p014mm.plugin.appbrand.appcache.C81297o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ei0.C86518b;
import hp3.C87581a;
import ii0.C87732a;
import ki0.C88153c;
import lp3.C46888b;
import lp3.C88643g;
import nr3.C89059e;
import ob0.C89132b;
import op3.C117877b;
import te3.C48686aa3;
import te3.C48698ad2;
import te3.C52246zc2;

/* renamed from: gi0.d */
public class C87192d implements C87581a<Boolean, C88153c> {

    /* renamed from: gi0.d$a */
    public static class C87193a implements C87581a<Boolean, C117877b<C52246zc2, C48698ad2>> {
        public Object call(Object obj) {
            C81273j1 j1Var;
            C117877b bVar = (C117877b) obj;
            C52246zc2 zc22 = (C52246zc2) bVar.mo182596a(0);
            C48698ad2 ad22 = (C48698ad2) bVar.mo182596a(1);
            int i = zc22.f145805d;
            if (i == 0) {
                j1Var = new C81273j1(zc22.f145806e);
            } else if (i == 4) {
                j1Var = new C81273j1(zc22.f145806e, zc22.f145811j);
            } else {
                throw new IllegalArgumentException(String.format("not support request.type %d", new Object[]{Integer.valueOf(zc22.f145805d)}));
            }
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            C87191c cVar = new C87191c(this, b);
            Log.m105925i("MicroMsg.AppBrand.Predownload.ActionGetEncryptPkg.PlainActionDownloadPkg", "%s downloadPkg, patch_url(%s), full_url(%s)", j1Var.toString(), ad22.f130447g, ad22.f130445e);
            C81297o oVar = new C81297o(j1Var.toString(), zc22.f145813o.f130408e, zc22.f145807f, ad22.f130445e);
            C81294n nVar = C81294n.INSTANCE;
            nVar.getClass();
            C86518b.C86519a aVar = C86518b.C86519a.ENV_ERR;
            C81293m3 d = C81293m3.m99678d();
            if (d == null) {
                Log.m105920e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "startDownload, null updater");
                cVar.mo113493a(oVar.f251357l, aVar, (Object) null);
            } else {
                int a = d.f238706b.mo113631a(oVar);
                Log.m105925i("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "startDownload, addRequest(%s) ret = %d", oVar.mo113570i(), Integer.valueOf(a));
                if (a != 4) {
                    nVar.f238713d.mo122464e(oVar.f249581a, cVar);
                } else {
                    cVar.mo113493a(oVar.f251357l, aVar, (Object) null);
                }
            }
            return Boolean.FALSE;
        }
    }

    public Object call(Object obj) {
        C88153c cVar = (C88153c) obj;
        String str = cVar.field_appId;
        int i = cVar.field_version;
        String str2 = cVar.field_pkgMd5;
        C81273j1.m99631a("");
        boolean z = cVar.field_retriedCount > 0;
        int i2 = cVar.field_reportId;
        C46888b b = C88643g.m110544b();
        b.mo72092b();
        C52246zc2 zc22 = new C52246zc2();
        zc22.f145806e = str;
        zc22.f145807f = i;
        zc22.f145809h = 0;
        zc22.f145808g = str2;
        if (!Util.isNullOrNil("")) {
            zc22.f145811j = "";
            zc22.f145809h = 4;
        } else {
            zc22.f145809h = 0;
        }
        C48686aa3 aa32 = new C48686aa3();
        zc22.f145813o = aa32;
        aa32.f130407d = 0;
        aa32.f130408e = 1;
        C87732a.INSTANCE.mo122144a(i2, z ? 51 : 46);
        C89059e<C89132b.C89134c<C48698ad2>> i3 = new C81278k(zc22).mo9225i();
        i3.mo123419C(new C87190b(this, b, z, i2));
        i3.mo123420E(new C87193a());
        i3.mo123420E(new C87189a(this, z, i2, b));
        return Boolean.TRUE;
    }
}
