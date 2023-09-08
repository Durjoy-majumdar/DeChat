package vq1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: vq1.k */
public final class C14964k extends C87413o implements C32226l<C0740i2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C14962j f41029d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14964k(C14962j jVar) {
        super(1);
        this.f41029d = jVar;
    }

    public Object invoke(Object obj) {
        boolean z;
        C58969q l;
        C0740i2 i2Var = (C0740i2) obj;
        C87412m.m108594g(i2Var, LocaleUtil.ITALIAN);
        BaseFinderFeed baseFinderFeed = i2Var instanceof BaseFinderFeed ? (BaseFinderFeed) i2Var : null;
        String username = (baseFinderFeed == null || (l = baseFinderFeed.mo3507l()) == null) ? "" : l.getUsername();
        Log.m105924i("Finder.FeedCleaner", "cleanFeed username:" + username);
        C14966n nVar = this.f41029d.f41020e;
        if (nVar != null) {
            if (!nVar.f41031a.contains(username)) {
                C14966n nVar2 = this.f41029d.f41021f;
                if (nVar2 == null) {
                    C87412m.m108603p("noSeeAuthorRecorder");
                    throw null;
                } else if (!nVar2.f41031a.contains(username)) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
        C87412m.m108603p("followRecorder");
        throw null;
    }
}
