package aw1;

import android.content.Context;
import com.tencent.p014mm.plugin.fts.p059ui.C18842a;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import java.util.HashSet;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import nv1.C100219b;
import ov1.C21891f;
import pv1.C22019b;
import xv1.C79000v;

/* renamed from: aw1.d */
public class C16720d extends C18842a {
    public C16720d(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 4112;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        C79000v vVar;
        int i2 = (i - aVar.f61904a) - 1;
        if (i2 >= aVar.f61909f.size() || i2 < 0) {
            vVar = null;
        } else {
            C99681n nVar = aVar.f61909f.get(i2);
            vVar = new C79000v(i);
            vVar.f231943p = nVar;
            vVar.f62327e = aVar.f61910g;
            vVar.mo35140k(nVar.f292148b, nVar.f292149c);
        }
        if (vVar != null) {
            vVar.f62332j = i2 + 1;
        }
        return vVar;
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        C76728k kVar = new C76728k();
        kVar.f224468c = this.f52838h;
        kVar.f224472g = new int[]{131072, 131081};
        kVar.f224477l = C100219b.f293645d;
        kVar.f224475j = hashSet;
        kVar.f224478m = this;
        kVar.f224479n = mMHandler;
        kVar.f224467b = 16;
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, kVar);
    }

    /* renamed from: s */
    public void mo17713s(C10656l lVar, HashSet<String> hashSet) {
        if (mo34916j(lVar.f32076e)) {
            C21891f.C21892a aVar = new C21891f.C21892a();
            aVar.f61908e = -4;
            aVar.f61909f = lVar.f32076e;
            aVar.f61910g = lVar.f32075d;
            aVar.f61907d = false;
            this.f52840j.add(aVar);
        }
    }
}
