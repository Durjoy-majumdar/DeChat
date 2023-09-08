package lj0;

import ad0.C0033t;
import android.content.Context;
import com.tencent.p014mm.plugin.fts.p059ui.C18842a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
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

/* renamed from: lj0.f */
public class C21437f extends C18842a {
    public C21437f(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 4224;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        C99490d dVar;
        int i2 = (i - aVar.f61904a) - 1;
        if (i2 >= aVar.f61909f.size() || i2 < 0) {
            dVar = null;
        } else {
            C99681n nVar = aVar.f61909f.get(i2);
            dVar = new C99490d(i);
            dVar.f291688q = nVar;
            dVar.f62327e = aVar.f61910g;
            dVar.mo35140k(nVar.f292148b, nVar.f292149c);
        }
        if (dVar != null) {
            dVar.f62332j = i2 + 1;
        }
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
            tVar.mo32a("21ViewType", "2,");
            tVar.mo32a("22OpType", "1,");
            tVar.mo32a("23ResultCount", list.size() + ",");
            tVar.mo32a("24ClickPos", ",");
            tVar.mo32a("25ClickAppUserName", ",");
            Log.m105925i("MicroMsg.FTSWeAppDetailUIUnit", "report oreh LocalSearchWeApp(13963), %s", tVar.mo34c());
            C115669n.INSTANCE.mo160131h(13963, tVar);
        }
        if (mo34916j(lVar.f32076e)) {
            C21891f.C21892a aVar = new C21891f.C21892a();
            aVar.f61908e = -13;
            aVar.f61910g = lVar.f32075d;
            aVar.f61909f = lVar.f32076e;
            this.f52840j.add(aVar);
        }
    }
}
