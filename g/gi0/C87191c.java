package gi0;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85639p;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei0.C86518b;
import gi0.C87192d;
import lp3.C46888b;

/* renamed from: gi0.c */
public class C87191c implements C86518b<C85639p, WxaPkgLoadProgress> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f252855a;

    public C87191c(C87192d.C87193a aVar, C46888b bVar) {
        this.f252855a = bVar;
    }

    /* renamed from: a */
    public void mo113493a(String str, C86518b.C86519a aVar, Object obj) {
        C85639p pVar = (C85639p) obj;
        C46888b bVar = this.f252855a;
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(aVar == C86518b.C86519a.OK);
        bVar.mo72093c(objArr);
        Log.m105925i("MicroMsg.AppBrand.Predownload.ActionGetEncryptPkg.PlainActionDownloadPkg", "%s onPkgUpdateResult, ret %s", str, aVar.name());
    }
}
