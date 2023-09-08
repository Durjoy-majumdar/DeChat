package yf1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C18842a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import h81.C32735h;
import ht1.C60208v1;
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
import pv1.C22019b;

/* renamed from: yf1.h */
public class C23307h extends C18842a {

    /* renamed from: o */
    public ArrayList<String> f66990o = new ArrayList<>();

    public C23307h(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 133;
    }

    /* renamed from: k */
    public C21461d mo17714k(int i, long j, C21891f.C21892a aVar) {
        if (i >= aVar.f61909f.size() || i < 0) {
            return null;
        }
        C99681n nVar = aVar.f61909f.get(i);
        C21461d dVar = new C21461d();
        dVar.f60765g = String.valueOf(nVar.hashCode());
        dVar.f60761c = 31;
        dVar.f60768j = nVar.f292151e;
        return dVar;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        int i2 = (i - aVar.f61904a) - 1;
        C22019b p = (i2 >= aVar.f61909f.size() || i2 < 0) ? null : mo17715p(589824, i, aVar.f61909f.get(i2), aVar);
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
        C102852e eVar = new C102852e(i2);
        eVar.f303600r = nVar;
        eVar.f62327e = aVar.f61910g;
        if (nVar.f292169w) {
            eVar.f303604v = this.f61902e.getResources().getString(C0966R.string.iuw);
        }
        eVar.mo35140k(nVar.f292148b, nVar.f292149c);
        return eVar;
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        C76728k kVar = new C76728k();
        kVar.f224468c = this.f52838h;
        kVar.f224477l = C21694d.f61404d;
        kVar.f224478m = this;
        kVar.f224479n = mMHandler;
        kVar.f224475j = hashSet;
        Log.m105924i("MicroMsg.FTSFinderFollowerUIUnit", "doSearch, request.query = " + kVar.f224468c);
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(13, kVar);
    }

    /* renamed from: s */
    public void mo17713s(C10656l lVar, HashSet<String> hashSet) {
        Log.m105924i("MicroMsg.FTSFinderFollowerUIUnit", "setResult, ftsResult.");
        this.f66990o.clear();
        if (mo34916j(lVar.f32076e)) {
            lVar.f32076e.size();
            C21891f.C21892a aVar = new C21891f.C21892a();
            aVar.f61908e = -23;
            List<C99681n> list = lVar.f32076e;
            aVar.f61909f = list;
            aVar.f61910g = lVar.f32075d;
            if (list.size() > 1) {
                aVar.f61907d = true;
                aVar.f61909f = new ArrayList(aVar.f61909f.subList(0, 1));
            }
            this.f52840j.add(aVar);
            for (C99681n nVar : aVar.f61909f) {
                this.f66990o.add(nVar.f292151e);
            }
            Log.m105924i("MicroMsg.FTSFinderFollowerUIUnit", "setResult, userNames = " + this.f66990o);
        }
        ArrayList<String> arrayList = this.f66990o;
        if (arrayList != null && arrayList.size() > 0) {
            ((C60208v1) C86312j.m106911c(C60208v1.class)).z00(this.f66990o, ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_search_finder_follow_expired_time_threshold, 300000), (C60208v1.C60210b) null);
        }
    }
}
