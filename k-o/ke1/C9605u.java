package ke1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import je1.C9342n1;
import je1.C9360p1;
import o40.C61926c;
import o40.C61937h;
import pe3.C89349b;
import te3.C48736am1;
import te3.C48960c53;
import te3.C49022cm1;
import te3.C49335eu3;
import te3.C51395th0;
import te3.C51990xl1;
import z04.C119027c;

/* renamed from: ke1.u */
public final class C9605u implements C9342n1.C9347e {

    /* renamed from: a */
    public final /* synthetic */ C9610x f29881a;

    /* renamed from: b */
    public final /* synthetic */ C9360p1.C9362b f29882b;

    /* renamed from: c */
    public final /* synthetic */ int f29883c;

    /* renamed from: d */
    public final /* synthetic */ C9342n1 f29884d;

    public C9605u(C9610x xVar, C9360p1.C9362b bVar, int i, C9342n1 n1Var) {
        this.f29881a = xVar;
        this.f29882b = bVar;
        this.f29883c = i;
        this.f29884d = n1Var;
    }

    /* renamed from: a */
    public void mo3671a() {
        this.f29881a.f29921s = false;
    }

    /* renamed from: b */
    public boolean mo3672b(int i, int i2, C49335eu3 eu32) {
        C87412m.m108594g(eu32, "resp");
        C9360p1.C9362b bVar = this.f29882b;
        if (bVar != null) {
            return bVar.mo2804a(i, i2, (String) null, eu32);
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo3673c() {
        return this.f29881a.f29918p;
    }

    /* renamed from: d */
    public void mo3674d(C9342n1.C9345c cVar) {
        String str;
        String str2;
        C89349b bVar;
        Long l;
        C89349b bVar2;
        C87412m.m108594g(cVar, "request");
        C9603s sVar = this.f29881a.f29914i;
        if (!(sVar == null || (bVar2 = sVar.f29869b) == null)) {
            cVar.f145385w = bVar2;
        }
        if (!(sVar == null || (l = sVar.f29868a) == null)) {
            cVar.f145359E = l.longValue();
        }
        C9610x xVar = this.f29881a;
        C9603s sVar2 = xVar.f29914i;
        if (!(sVar2 == null || (bVar = sVar2.f29870c) == null)) {
            cVar.f145388z = bVar;
        }
        Integer num = sVar2 != null ? sVar2.f29871d : null;
        C89349b bVar3 = sVar2 != null ? sVar2.f29870c : null;
        if (!(num == null || bVar3 == null)) {
            int intValue = num.intValue();
            C51395th0 th02 = new C51395th0();
            th02.f142216d = intValue;
            th02.f142217e = bVar3;
            cVar.f145363I = th02;
            String str3 = xVar.f29923u;
            Log.m105924i(str3, "byPassInfoType=" + intValue + " byPassInfo=" + new String(bVar3.mo123703f(), C119027c.f356488a));
        }
        String str4 = "";
        long j = 0;
        boolean z = true;
        int i = 0;
        if (this.f29881a.f29917o == 1) {
            C51990xl1 xl12 = new C51990xl1();
            C9610x xVar2 = this.f29881a;
            C9603s sVar3 = xVar2.f29914i;
            xl12.f144734d = sVar3 != null ? sVar3.f29872e : 0;
            if (sVar3 == null || (str2 = sVar3.f29873f) == null) {
                str2 = str4;
            }
            xl12.f144735e = str2;
            xl12.f144736f = sVar3 != null ? sVar3.f29877j : 0;
            String str5 = xVar2.f29923u;
            Log.m105924i(str5, "related_info=" + C61926c.m72691p(xl12.f144734d));
            cVar.f145366L = xl12;
        }
        C9603s sVar4 = this.f29881a.f29914i;
        if ((sVar4 != null ? sVar4.f29874g : 0) > 0) {
            LinkedList<C49022cm1> linkedList = cVar.f145360F;
            C49022cm1 cm12 = new C49022cm1();
            C9610x xVar3 = this.f29881a;
            LinkedList<C48960c53> linkedList2 = cm12.f131823d;
            C48960c53 c532 = new C48960c53();
            C9603s sVar5 = xVar3.f29914i;
            if (sVar5 != null) {
                j = sVar5.f29872e;
            }
            c532.f131529d = j;
            if (!(sVar5 == null || (str = sVar5.f29873f) == null)) {
                str4 = str;
            }
            c532.f131530e = str4;
            String str6 = xVar3.f29923u;
            Log.m105924i(str6, "top_objects=" + C61926c.m72691p(c532.f131529d));
            linkedList2.add(c532);
            C9603s sVar6 = xVar3.f29914i;
            cm12.f131824e = sVar6 != null ? sVar6.f29874g : 0;
            linkedList.add(cm12);
        }
        int i2 = this.f29883c;
        if (i2 == 0 || i2 == 1) {
            C48736am1 am12 = new C48736am1();
            C9610x xVar4 = this.f29881a;
            C9342n1 n1Var = this.f29884d;
            C48736am1 am13 = xVar4.f29919q.f34361h;
            am12.f130634i = am13.f130634i;
            am12.f130633h = am13.f130633h;
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
            am12.f130632g = Nx0.mo77227G5("TLRecommendTab") != null;
            am12.f130631f = Nx0.mo77227G5("TLFollow") != null;
            am12.f130630e = Nx0.mo77227G5("finder_tl_hot_tab") != null;
            C9603s sVar7 = xVar4.f29914i;
            if (sVar7 == null || !sVar7.f29875h) {
                z = false;
            }
            if (!z) {
                i = n1Var.f29180d;
            }
            am12.f130635j = i;
            String str7 = xVar4.f29923u;
            StringBuilder sb = new StringBuilder();
            sb.append("[onBuildRequest] FinderStream, from_tab_type = ");
            sb.append(am12.f130635j);
            sb.append(", requestArgs?.isFirstEnterFetch = ");
            C9603s sVar8 = xVar4.f29914i;
            sb.append(sVar8 != null ? Boolean.valueOf(sVar8.f29875h) : null);
            Log.m105924i(str7, sb.toString());
            cVar.f145364J = am12;
            String str8 = this.f29881a.f29923u;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[onBuildRequest] FinderStream scene_status=");
            C48736am1 am14 = cVar.f145364J;
            sb4.append(am14 != null ? C61937h.m72703b(am14) : null);
            Log.m105924i(str8, sb4.toString());
        }
        this.f29881a.f29914i = null;
    }
}
