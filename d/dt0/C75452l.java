package dt0;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.plugin.appbrand.appusage.C68587i1;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg3.C76577a;
import p235sm.C77729f;
import rx3.C13598b0;
import sx3.C110818d0;
import xt0.C78980e;
import xt0.C78983j;
import xt0.C78984k;
import zt3.C119157j;

/* renamed from: dt0.l */
public final class C75452l extends C75449i {

    /* renamed from: a */
    public long f221769a = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: b */
    public boolean f221770b = true;

    /* renamed from: c */
    public C68587i1 f221771c;

    /* renamed from: dt0.l$a */
    public static final class C75453a implements C77729f.C77730a {

        /* renamed from: a */
        public final /* synthetic */ C75452l f221772a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<List<? extends C68691e.C68692a>, C13598b0> f221773b;

        public C75453a(C75452l lVar, C32226l<? super List<? extends C68691e.C68692a>, C13598b0> lVar2) {
            this.f221772a = lVar;
            this.f221773b = lVar2;
        }

        /* renamed from: a */
        public final void mo105793a(boolean z, String str) {
            Log.m105924i("MicroMsg.AppBrandRecentDesktopViewModel", "fetchNextPageFromServer: " + z + ' ' + str);
            C75452l lVar = this.f221772a;
            C32226l<List<? extends C68691e.C68692a>, C13598b0> lVar2 = this.f221773b;
            lVar.getClass();
            ((C119157j) C119157j.f356862d).mo183884o(new C75451k(lVar, lVar2));
        }
    }

    /* renamed from: a */
    public synchronized List<C68691e.C68692a> mo105787a() {
        ArrayList arrayList;
        List<LocalUsageInfo> list;
        arrayList = new ArrayList();
        if (this.f221771c == null) {
            this.f221771c = C78980e.f231921a.mo108958b();
        }
        C68587i1 i1Var = this.f221771c;
        if (i1Var != null) {
            list = ((C78984k) i1Var).Oe0(C78983j.f231934b.f231940b);
        } else {
            list = null;
        }
        boolean z = true;
        if (list != null) {
            Iterator it = ((ArrayList) C110818d0.m150912J(list)).iterator();
            while (it.hasNext()) {
                LocalUsageInfo localUsageInfo = (LocalUsageInfo) it.next();
                C68691e.C68692a aVar = new C68691e.C68692a(1);
                aVar.f197340a = localUsageInfo;
                arrayList.add(aVar);
                C87412m.m108592e(localUsageInfo, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo");
                this.f221769a = ((AppBrandRecentTaskInfo) localUsageInfo).f239037z;
            }
        }
        if (arrayList.size() < C78983j.f231934b.f231940b) {
            z = false;
        }
        this.f221770b = z;
        return arrayList;
    }

    /* renamed from: b */
    public void mo105788b(C32226l<? super List<? extends C68691e.C68692a>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        C77729f fVar = (C77729f) C86312j.m106911c(C77729f.class);
        if (fVar.mo107871vF()) {
            fVar.Fe0(Util.nowMilliSecond(), false, (Bundle) null, 3, 2, 32, -1, new C75453a(this, lVar));
            return;
        }
        ((C119157j) C119157j.f356862d).mo183884o(new C75451k(this, lVar));
    }

    /* renamed from: c */
    public boolean mo105789c() {
        return this.f221770b;
    }

    /* renamed from: d */
    public String mo105790d() {
        String q = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.a55);
        C87412m.m108593f(q, "getString(MMApplicationC….appbrand_desktop_recent)");
        return q;
    }

    /* renamed from: e */
    public int mo105791e() {
        return 1;
    }
}
