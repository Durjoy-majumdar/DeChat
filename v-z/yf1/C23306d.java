package yf1;

import android.content.Context;
import com.tencent.p014mm.plugin.fts.p059ui.C18842a;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import h81.C32735h;
import ht1.C60208v1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import nv1.C21694d;
import ov1.C21891f;
import pv1.C22019b;

/* renamed from: yf1.d */
public class C23306d extends C18842a {

    /* renamed from: o */
    public ArrayList<String> f66989o = new ArrayList<>();

    public C23306d(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 8224;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        C102852e eVar;
        int i2 = (i - aVar.f61904a) - 1;
        if (i2 >= aVar.f61909f.size() || i2 < 0) {
            eVar = null;
        } else {
            C99681n nVar = aVar.f61909f.get(i2);
            eVar = new C102852e(i);
            eVar.f303600r = nVar;
            eVar.f62327e = aVar.f61910g;
            eVar.mo35140k(nVar.f292148b, nVar.f292149c);
        }
        if (eVar != null) {
            eVar.f62332j = i2 + 1;
        }
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
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(13, kVar);
    }

    /* renamed from: s */
    public void mo17713s(C10656l lVar, HashSet<String> hashSet) {
        List<C99681n> list = lVar.f32076e;
        this.f66989o.clear();
        if (mo34916j(lVar.f32076e)) {
            C21891f.C21892a aVar = new C21891f.C21892a();
            aVar.f61908e = -23;
            aVar.f61910g = lVar.f32075d;
            aVar.f61909f = lVar.f32076e;
            this.f52840j.add(aVar);
            for (C99681n nVar : aVar.f61909f) {
                String str = nVar.f292151e;
                if (str != null) {
                    this.f66989o.add(str);
                }
            }
        }
        ArrayList<String> arrayList = this.f66989o;
        if (arrayList != null && arrayList.size() > 0) {
            ((C60208v1) C86312j.m106911c(C60208v1.class)).z00(this.f66989o, ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_search_finder_follow_expired_time_threshold, 300000), (C60208v1.C60210b) null);
        }
    }
}
