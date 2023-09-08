package aw1;

import android.content.Context;
import com.tencent.p014mm.plugin.fts.p059ui.C18842a;
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
import nv1.C100219b;
import ov1.C21891f;
import pv1.C22019b;
import xv1.C79000v;

/* renamed from: aw1.e */
public class C16721e extends C18842a {
    public C16721e(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 32;
    }

    /* renamed from: k */
    public C21461d mo17714k(int i, long j, C21891f.C21892a aVar) {
        if (i >= aVar.f61909f.size() || i < 0) {
            return null;
        }
        C99681n nVar = aVar.f61909f.get(i);
        C21461d dVar = new C21461d();
        dVar.f60765g = String.valueOf(nVar.hashCode());
        int i2 = nVar.f292148b;
        if (i2 != 131072 && i2 != 131081) {
            return null;
        }
        dVar.f60761c = 3;
        return dVar;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        int i2;
        C22019b bVar = null;
        if (aVar.f61905b) {
            i2 = (i - aVar.f61904a) - 1;
            if (i2 < aVar.f61909f.size() && i2 >= 0) {
                C99681n nVar = aVar.f61909f.get(i2);
                C22019b p = mo17715p(nVar.f292148b, i, nVar, aVar);
                if (p != null) {
                    p.mo35140k(nVar.f292148b, nVar.f292149c);
                }
                bVar = p;
            }
        } else {
            i2 = 0;
        }
        if (bVar != null) {
            bVar.f62332j = i2 + 1;
            if (i2 == aVar.f61909f.size() - 1) {
                bVar.f62326d = false;
            }
        }
        return bVar;
    }

    /* renamed from: p */
    public C22019b mo17715p(int i, int i2, C99681n nVar, C21891f.C21892a aVar) {
        int i3 = nVar.f292148b;
        if (i3 != 131072 && i3 != 131081) {
            return null;
        }
        C79000v vVar = new C79000v(i2);
        vVar.f231943p = nVar;
        vVar.f62327e = aVar.f61910g;
        vVar.mo35140k(nVar.f292148b, nVar.f292149c);
        return vVar;
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        C76728k kVar = new C76728k();
        kVar.f224467b = 64;
        kVar.f224468c = this.f52838h;
        kVar.f224472g = new int[]{131072, 131081};
        kVar.f224474i = 3;
        kVar.f224477l = C100219b.f293645d;
        kVar.f224475j = hashSet;
        kVar.f224478m = this;
        kVar.f224479n = mMHandler;
        this.f52841n = hashSet;
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, kVar);
    }

    /* renamed from: s */
    public void mo17713s(C10656l lVar, HashSet<String> hashSet) {
        C21891f.C21892a aVar = new C21891f.C21892a();
        aVar.f61908e = -4;
        List<C99681n> list = lVar.f32076e;
        aVar.f61909f = list;
        aVar.f61905b = mo34916j(list);
        aVar.f61910g = lVar.f32075d;
        if (aVar.f61909f.size() > 3) {
            aVar.f61907d = true;
            aVar.f61909f = new ArrayList(aVar.f61909f.subList(0, 3));
        }
        if (mo34916j(lVar.f32076e)) {
            this.f52840j.add(aVar);
        }
    }
}
