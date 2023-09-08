package il1;

import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86300q;
import qj1.C62660c;

/* renamed from: il1.j7 */
public final class C60442j7 implements C86300q {

    /* renamed from: a */
    public final /* synthetic */ C60362c7 f172330a;

    public C60442j7(C60362c7 c7Var) {
        this.f172330a = c7Var;
    }

    /* renamed from: a */
    public void mo63853a() {
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "onAppBrandProcessDied");
        C62660c cVar = this.f172330a.f172118c;
        C54991o oVar = cVar != null ? (C54991o) cVar.mo87696x0(C54991o.class) : null;
        if (oVar != null) {
            oVar.f154375v1 = false;
        }
    }

    /* renamed from: b */
    public void mo63854b(String str) {
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "onTriggerHalfScreenShare");
    }

    /* renamed from: c */
    public void mo63855c() {
        Class cls = C54991o.class;
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "onAppBrandUIEnter");
        C62660c cVar = this.f172330a.f172118c;
        C54991o oVar = cVar != null ? (C54991o) cVar.mo87696x0(cls) : null;
        if (oVar != null) {
            oVar.f154375v1 = true;
        }
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls);
        if (oVar2 != null) {
            oVar2.f154350p0 = true;
        }
        C54991o oVar3 = (C54991o) finderLiveService.mo77630e(cls);
        if (oVar3 != null) {
            oVar3.mo76021s4(false);
        }
    }

    /* renamed from: d */
    public /* synthetic */ void mo63856d() {
    }

    /* renamed from: e */
    public void mo63857e() {
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "onAppBrandPreconditionErrors");
        C62660c cVar = this.f172330a.f172118c;
        C54991o oVar = cVar != null ? (C54991o) cVar.mo87696x0(C54991o.class) : null;
        if (oVar != null) {
            oVar.f154375v1 = false;
        }
    }

    /* renamed from: f */
    public void mo63858f(boolean z) {
        Log.m105925i("Finder.FinderLiveVisitorGameTeamWidget", "onAppBrandUIExit:%b", Boolean.valueOf(z));
        C62660c cVar = this.f172330a.f172118c;
        C54991o oVar = cVar != null ? (C54991o) cVar.mo87696x0(C54991o.class) : null;
        if (oVar != null) {
            oVar.f154375v1 = false;
        }
        this.f172330a.f172112N = null;
    }
}
