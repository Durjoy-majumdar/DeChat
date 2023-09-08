package op0;

import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.sdk.platformtools.Log;
import gt0.C87327c0;
import gt0.C87370k0;
import js0.C9514m;
import op0.C89251a;

/* renamed from: op0.k */
public class C89268k implements C89251a.C89252a {

    /* renamed from: a */
    public final /* synthetic */ C9514m f257175a;

    /* renamed from: b */
    public final /* synthetic */ C89251a.C89252a f257176b;

    /* renamed from: c */
    public final /* synthetic */ C9514m f257177c;

    /* renamed from: d */
    public final /* synthetic */ C89269l f257178d;

    public C89268k(C89269l lVar, C9514m mVar, C89251a.C89252a aVar, C9514m mVar2) {
        this.f257178d = lVar;
        this.f257175a = mVar;
        this.f257176b = aVar;
        this.f257177c = mVar2;
    }

    /* renamed from: a */
    public void mo123572a(WxaPkgLoadProgress wxaPkgLoadProgress) {
        if (Log.getLogLevel() <= 1) {
            Log.m105919d("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "onLoadProgress, appId:%s, module:%s, progress:%s", this.f257178d.f257182c.f238147j, ((ModulePkgInfo) this.f257175a.f29691a).name, wxaPkgLoadProgress);
        }
        C89251a.C89252a aVar = this.f257176b;
        if (aVar != null) {
            aVar.mo123572a(wxaPkgLoadProgress);
        }
        C89256c cVar = (C89256c) this.f257177c.f29691a;
        if (cVar != null) {
            int i = wxaPkgLoadProgress.f238582d;
            cVar.getClass();
            int max = Math.max(Math.min(i, 100), 0);
            cVar.f257154h = max;
            C87370k0.C87371a aVar2 = cVar.f257152f;
            if (aVar2 instanceof C87327c0) {
                ((C87327c0) aVar2).setProgress(max);
            }
        }
    }
}
