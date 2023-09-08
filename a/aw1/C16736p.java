package aw1;

import android.content.Context;
import com.tencent.p014mm.plugin.fts.p059ui.C18842a;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ht1.C8808v4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kv1.C99251g;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C21461d;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import ov1.C21891f;
import p754xr.C38815c;
import pv1.C22019b;

/* renamed from: aw1.p */
public class C16736p extends C18842a {
    public C16736p(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 16;
    }

    /* renamed from: k */
    public C21461d mo17714k(int i, long j, C21891f.C21892a aVar) {
        if (i >= aVar.f61909f.size() || i < 0) {
            return null;
        }
        C99681n nVar = aVar.f61909f.get(i);
        C21461d dVar = new C21461d();
        dVar.f60761c = 2;
        dVar.f60765g = String.valueOf(nVar.hashCode());
        int i2 = nVar.f292148b;
        if (i2 == 131075) {
            dVar.f60766h = 4;
        } else if (i2 == 131072) {
            dVar.f60766h = 3;
        } else if (i2 == 262144) {
            dVar.f60766h = 10;
        } else if (i2 == 131076) {
            dVar.f60766h = 5;
            dVar.f60768j = nVar.f292151e;
        } else if (i2 == 393216) {
            dVar.f60766h = 19;
            String x5 = ((C38815c) C86312j.m106911c(C38815c.class)).mo61785x5(nVar.f292151e);
            if (!Util.isNullOrNil(x5)) {
                dVar.f60768j = x5;
            }
        } else if (i2 != 589824) {
            return null;
        } else {
            dVar.f60766h = 31;
            dVar.f60768j = nVar.f292151e;
        }
        return dVar;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        C18842a aVar2;
        Class cls = C99260q.class;
        int i2 = (i - aVar.f61904a) - 1;
        C22019b bVar = null;
        if (i2 < aVar.f61909f.size() && i2 >= 0) {
            C99681n nVar = aVar.f61909f.get(i2);
            int i3 = nVar.f292148b;
            if (i3 == 131075) {
                aVar2 = (C18842a) ((C99260q) C86312j.m106911c(cls)).Ji0(48, this.f61902e, this.f61901d, this.f61903f);
            } else if (i3 == 131072) {
                aVar2 = (C18842a) ((C99260q) C86312j.m106911c(cls)).Ji0(32, this.f61902e, this.f61901d, this.f61903f);
            } else if (i3 == 262144) {
                aVar2 = (C18842a) ((C99260q) C86312j.m106911c(cls)).Ji0(64, this.f61902e, this.f61901d, this.f61903f);
            } else if (i3 == 131076) {
                aVar2 = (C18842a) ((C99260q) C86312j.m106911c(cls)).Ji0(96, this.f61902e, this.f61901d, this.f61903f);
            } else if (i3 == 393216) {
                aVar2 = (C18842a) ((C99260q) C86312j.m106911c(cls)).Ji0(144, this.f61902e, this.f61901d, this.f61903f);
            } else if (i3 == 589824) {
                aVar2 = (C18842a) ((C99260q) C86312j.m106911c(cls)).Ji0(133, this.f61902e, this.f61901d, this.f61903f);
                nVar.f292169w = true;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                bVar = aVar2.mo17715p(nVar.f292148b, i, nVar, aVar);
            }
        }
        if (bVar != null) {
            bVar.f62332j = i2 + 1;
            if (i2 == aVar.f61909f.size() - 1) {
                bVar.f62326d = false;
            }
        }
        return bVar;
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        Class cls = C99260q.class;
        C76728k kVar = new C76728k();
        ArrayList arrayList = new ArrayList();
        arrayList.add(131072);
        arrayList.add(131075);
        arrayList.add(262144);
        arrayList.add(Integer.valueOf(StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON));
        arrayList.add(393216);
        if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            arrayList.add(589824);
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        kVar.f224472g = iArr;
        kVar.f224474i = 3;
        kVar.f224478m = this;
        kVar.f224479n = mMHandler;
        kVar.f224480o = 0;
        kVar.f224475j = hashSet;
        if (this.f52838h.startsWith("@@")) {
            kVar.f224468c = this.f52838h.substring(2);
            return ((C99260q) C86312j.m106911c(cls)).Xn0(10000, kVar);
        }
        kVar.f224468c = this.f52838h;
        return ((C99260q) C86312j.m106911c(cls)).Xn0(1, kVar);
    }

    /* renamed from: s */
    public void mo17713s(C10656l lVar, HashSet<String> hashSet) {
        for (C99681n nVar : lVar.f32076e) {
            hashSet.add(nVar.f292151e);
        }
        if (mo34916j(lVar.f32076e)) {
            C21891f.C21892a aVar = new C21891f.C21892a();
            aVar.f61908e = -8;
            List<C99681n> list = lVar.f32076e;
            if (mo34916j(list) && list.size() > 3) {
                list = list.subList(0, 3);
            }
            aVar.f61909f = list;
            aVar.f61907d = false;
            aVar.f61910g = lVar.f32075d;
            this.f52840j.add(aVar);
        }
        List<C99681n> list2 = lVar.f32076e;
        C99251g.f291026a.clear();
        for (C99681n next : list2) {
            Object obj = next.f292161o;
            if (obj instanceof String) {
                C99251g.f291026a.put(next.f292151e, (String) obj);
            } else {
                C99251g.f291026a.put(next.f292151e, "");
            }
        }
    }
}
