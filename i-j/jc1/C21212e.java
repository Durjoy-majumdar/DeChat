package jc1;

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
import ov1.C21891f;
import pv1.C22019b;

/* renamed from: jc1.e */
public class C21212e extends C18842a {
    public C21212e(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 128;
    }

    /* renamed from: k */
    public C21461d mo17714k(int i, long j, C21891f.C21892a aVar) {
        if (i >= aVar.f61909f.size() || i < 0) {
            return null;
        }
        C21461d dVar = new C21461d();
        dVar.f60765g = String.valueOf(aVar.f61909f.get(i).hashCode());
        dVar.f60761c = 12;
        return dVar;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        C98932a aVar2;
        int i2 = (i - aVar.f61904a) - 1;
        if (i2 >= aVar.f61909f.size() || i2 < 0) {
            aVar2 = null;
        } else {
            C99681n nVar = aVar.f61909f.get(i2);
            aVar2 = new C98932a(i);
            aVar2.f290007p = nVar;
            aVar2.f62327e = aVar.f61910g;
            aVar2.mo35140k(nVar.f292148b, nVar.f292149c);
            aVar2.f290008q = false;
        }
        if (aVar2 != null) {
            aVar2.f62332j = i2 + 1;
        }
        return aVar2;
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        C76728k kVar = new C76728k();
        kVar.f224467b = 1;
        kVar.f224468c = this.f52838h;
        kVar.f224474i = 1;
        kVar.f224475j = hashSet;
        kVar.f224479n = mMHandler;
        kVar.f224478m = this;
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(6, kVar);
    }

    /* renamed from: s */
    public void mo17713s(C10656l lVar, HashSet<String> hashSet) {
        if (mo34916j(lVar.f32076e)) {
            C21891f.C21892a aVar = new C21891f.C21892a();
            aVar.f61908e = -1;
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
