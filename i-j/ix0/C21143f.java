package ix0;

import android.content.Context;
import com.tencent.p014mm.plugin.fts.p059ui.C18842a;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import h81.C32735h;
import java.util.HashSet;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import nv1.C100219b;
import ov1.C21891f;
import pv1.C22019b;

/* renamed from: ix0.f */
public class C21143f extends C18842a {
    public C21143f(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 4208;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        C22019b bVar;
        int i2 = (i - aVar.f61904a) - 1;
        if (i2 >= aVar.f61909f.size() || i2 < 0) {
            bVar = null;
        } else {
            C99681n nVar = aVar.f61909f.get(i2);
            bVar = mo17715p(StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON, i, nVar, aVar);
            bVar.mo35140k(nVar.f292148b, nVar.f292149c);
        }
        if (bVar != null) {
            bVar.f62332j = i2 + 1;
        }
        return bVar;
    }

    /* renamed from: p */
    public C22019b mo17715p(int i, int i2, C99681n nVar, C21891f.C21892a aVar) {
        C98885c cVar = new C98885c(i2);
        cVar.f289876p = nVar;
        cVar.f62327e = aVar.f61910g;
        cVar.mo35140k(nVar.f292148b, nVar.f292149c);
        return cVar;
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        hashSet.add("gh_43f2581f6fd6");
        hashSet.addAll(C72996z1.m85797E4());
        if (1 == ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_minishop_plugin_enabled, 1)) {
            hashSet.add("gh_579db1f2cf89");
        }
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, C76728k.m92447a(this.f52838h, new int[]{131076}, (int[]) null, -1, hashSet, C100219b.f293645d, this, mMHandler));
    }

    /* renamed from: s */
    public void mo17713s(C10656l lVar, HashSet<String> hashSet) {
        if (mo34916j(lVar.f32076e)) {
            C21891f.C21892a aVar = new C21891f.C21892a();
            aVar.f61908e = -7;
            aVar.f61910g = lVar.f32075d;
            aVar.f61909f = lVar.f32076e;
            this.f52840j.add(aVar);
        }
    }
}
