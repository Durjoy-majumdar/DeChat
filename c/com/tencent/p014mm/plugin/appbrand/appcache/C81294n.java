package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.plugin.appbrand.appcache.C81282k1;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85639p;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86296l;
import di3.C86312j;
import ei0.C86518b;
import java.util.Set;
import js0.C88021l;
import qd3.C89599a;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.n */
public enum C81294n {
    INSTANCE;
    

    /* renamed from: d */
    public final C88021l<String, C86518b<C85639p, WxaPkgLoadProgress>> f238713d;

    /* renamed from: a */
    public final void mo113568a(C81297o oVar, C86518b.C86519a aVar, C85639p pVar) {
        Set<C86518b<C85639p, WxaPkgLoadProgress>> g = this.f238713d.mo122466g(oVar.f249581a);
        if (g != null) {
            for (C86518b<C85639p, WxaPkgLoadProgress> a : g) {
                a.mo113493a(oVar.f251357l, aVar, pVar);
            }
        }
    }

    /* renamed from: b */
    public void mo113569b(C81297o oVar, C85639p pVar, C81282k1.C81283a aVar) {
        C86518b.C86519a aVar2;
        if (pVar.f249598g == 2) {
            C86518b.C86519a aVar3 = C86518b.C86519a.ENV_ERR;
            C29301t1 Jo0 = ((C86296l) C86312j.m106911c(C86296l.class)).Jo0();
            if (Jo0 == null) {
                Log.m105920e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, null storage");
            } else {
                C29299s1 Lo = Jo0.mo56577Lo(oVar.f251357l, oVar.f238715q, oVar.f251358m);
                if (Lo == null) {
                    Log.m105921e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, null record with %s", oVar.mo113570i());
                } else {
                    Lo.field_pkgPath = oVar.f249583c;
                    boolean jo = C29301t1.m38619jo(Lo);
                    Log.m105925i("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, integrityOk %b, with %s", Boolean.valueOf(jo), oVar.mo113570i());
                    if (jo) {
                        Jo0.update(Lo, new String[0]);
                        aVar3 = C86518b.C86519a.OK;
                    } else {
                        aVar3 = C86518b.C86519a.PKG_INVALID;
                    }
                }
            }
            mo113568a(oVar, aVar3, pVar);
            return;
        }
        Log.m105921e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult %s", pVar);
        if (pVar.f249599h instanceof C89599a) {
            aVar2 = C86518b.C86519a.DISK_FULL;
        } else {
            int i = pVar.f249600i;
            aVar2 = (i == 403 || i == 404) ? C86518b.C86519a.SEVER_FILE_NOT_FOUND : C86518b.C86519a.FAILED;
        }
        mo113568a(oVar, aVar2, pVar);
    }
}
