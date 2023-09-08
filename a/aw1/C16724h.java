package aw1;

import android.content.Context;
import com.tencent.p014mm.plugin.fts.p059ui.C18842a;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import f62.C75700k0;
import he0.C46021h;
import java.util.HashSet;
import kr0.C21378k0;
import kr0.C33993f0;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import nc0.C76850a;
import nv1.C100220c;
import ov1.C21891f;
import pv1.C22019b;
import xv1.C102755j;

/* renamed from: aw1.h */
public class C16724h extends C18842a {
    public C16724h(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 64;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        int i2 = (i - aVar.f61904a) - 1;
        C22019b p = (i2 >= aVar.f61909f.size() || i2 < 0) ? null : mo17715p(262144, i, aVar.f61909f.get(i2), aVar);
        if (p != null) {
            p.f62332j = i2 + 1;
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
        Class cls = C75700k0.class;
        hashSet.add("62");
        if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            hashSet.add("65");
        }
        if (((C45696d) C86709a0.m107533q(C45696d.class)).k20()) {
            hashSet.add("63");
        } else {
            hashSet.add("67");
        }
        if (!((C33993f0) C86312j.m106911c(C33993f0.class)).mo59397s()) {
            hashSet.add(String.valueOf(69));
        }
        if (!((C21378k0) C86312j.m106911c(C21378k0.class)).mo33475s()) {
            hashSet.add(String.valueOf(71));
        }
        if (!((C46021h) C86312j.m106911c(C46021h.class)).mo71463s()) {
            hashSet.add(String.valueOf(74));
        }
        if (!((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("gh_b4af18eac3d5").mo62927s3()) {
            hashSet.add(String.valueOf(73));
        }
        if (!((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("gh_e087bb5b95e6").mo62927s3()) {
            hashSet.add(String.valueOf(76));
        }
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
            aVar.f61909f = lVar.f32076e;
            aVar.f61907d = false;
            this.f52840j.add(aVar);
        }
    }
}
