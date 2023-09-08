package lj0;

import ad0.C0033t;
import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.plugin.fts.p059ui.C18842a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C21461d;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import nv1.C21694d;
import ov1.C21891f;
import p235sm.C101649q0;
import pv1.C22019b;

/* renamed from: lj0.h */
public class C21438h extends C18842a {
    public C21438h(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 144;
    }

    /* renamed from: k */
    public C21461d mo17714k(int i, long j, C21891f.C21892a aVar) {
        if (i >= aVar.f61909f.size() || i < 0) {
            return null;
        }
        C99681n nVar = aVar.f61909f.get(i);
        C21461d dVar = new C21461d();
        dVar.f60765g = String.valueOf(nVar.hashCode());
        dVar.f60761c = 19;
        AppBrandRecentTaskInfo x5 = ((C101649q0) C86312j.m106911c(C101649q0.class)).mo60645x5(nVar.f292151e);
        if (x5 == null) {
            return dVar;
        }
        dVar.f60768j = x5.f239031t;
        return dVar;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        int i2 = (i - aVar.f61904a) - 1;
        C22019b p = (i2 >= aVar.f61909f.size() || i2 < 0) ? null : mo17715p(393216, i, aVar.f61909f.get(i2), aVar);
        if (p != null) {
            p.f62332j = i2 + 1;
            if (i2 == aVar.f61909f.size() - 1) {
                p.f62326d = false;
            }
        }
        return p;
    }

    /* renamed from: p */
    public C22019b mo17715p(int i, int i2, C99681n nVar, C21891f.C21892a aVar) {
        C99490d dVar = new C99490d(i2);
        dVar.f291688q = nVar;
        dVar.f62327e = aVar.f61910g;
        dVar.mo35140k(nVar.f292148b, nVar.f292149c);
        return dVar;
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        C76728k kVar = new C76728k();
        kVar.f224468c = this.f52838h;
        kVar.f224477l = C21694d.f61404d;
        kVar.f224478m = this;
        kVar.f224479n = mMHandler;
        kVar.f224475j = hashSet;
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(7, kVar);
    }

    /* renamed from: s */
    public void mo17713s(C10656l lVar, HashSet<String> hashSet) {
        List<C99681n> list = lVar.f32076e;
        if (list != null && !list.isEmpty()) {
            C0033t tVar = new C0033t();
            String str = this.f52838h;
            if (str != null) {
                str = str.replaceAll(",", " ");
            }
            tVar.mo32a("20KeyWordId", str + ",");
            tVar.mo32a("21ViewType", "1,");
            tVar.mo32a("22OpType", "1,");
            tVar.mo32a("23ResultCount", list.size() + ",");
            tVar.mo32a("24ClickPos", ",");
            tVar.mo32a("25ClickAppUserName", ",");
            Log.m105925i("MicroMsg.FTSWeAppUIUnit", "report oreh LocalSearchWeApp(13963), %s", tVar.mo34c());
            C115669n.INSTANCE.mo160131h(13963, tVar);
        }
        if (mo34916j(lVar.f32076e)) {
            C21891f.C21892a aVar = new C21891f.C21892a();
            aVar.f61908e = -13;
            List<C99681n> list2 = lVar.f32076e;
            aVar.f61909f = list2;
            aVar.f61910g = lVar.f32075d;
            if (list2.size() > 1) {
                aVar.f61907d = true;
                aVar.f61909f = new ArrayList(aVar.f61909f.subList(0, 1));
            }
            this.f52840j.add(aVar);
        }
    }
}
