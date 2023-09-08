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
import nv1.C100220c;
import ov1.C21891f;
import pv1.C22019b;
import xv1.C102755j;

/* renamed from: aw1.i */
public class C16725i extends C18842a {
    public C16725i(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 64;
    }

    /* renamed from: k */
    public C21461d mo17714k(int i, long j, C21891f.C21892a aVar) {
        if (i >= aVar.f61909f.size() || i < 0) {
            return null;
        }
        C21461d dVar = new C21461d();
        dVar.f60765g = String.valueOf(aVar.f61909f.get(i).hashCode());
        dVar.f60761c = 10;
        return dVar;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        int i2 = (i - aVar.f61904a) - 1;
        C22019b p = (i2 >= aVar.f61909f.size() || i2 < 0) ? null : mo17715p(262144, i, aVar.f61909f.get(i2), aVar);
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
        C102755j jVar = new C102755j(i2);
        jVar.f303414p = nVar;
        jVar.f62327e = aVar.f61910g;
        jVar.mo35140k(nVar.f292148b, nVar.f292149c);
        return jVar;
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        C76728k kVar = new C76728k();
        kVar.f224468c = this.f52838h;
        kVar.f224479n = mMHandler;
        kVar.f224475j = hashSet;
        kVar.f224478m = this;
        kVar.f224477l = C100220c.f293646d;
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(4, kVar);
    }

    /* renamed from: s */
    public void mo17713s(C10656l lVar, HashSet<String> hashSet) {
        if (mo34916j(lVar.f32076e)) {
            C21891f.C21892a aVar = new C21891f.C21892a();
            aVar.f61908e = -6;
            aVar.f61910g = lVar.f32075d;
            List<C99681n> list = lVar.f32076e;
            aVar.f61909f = list;
            if (list.size() > 1) {
                aVar.f61907d = true;
                aVar.f61909f = new ArrayList(aVar.f61909f.subList(0, 1));
            }
            this.f52840j.add(aVar);
        }
    }
}
