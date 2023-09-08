package xv1;

import android.content.Context;
import com.tencent.p014mm.plugin.fts.p059ui.C56782d;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import kv1.C99251g;
import p196ln.C76705f;
import p629ny.C76979h;
import pv1.C22019b;
import xv1.C102758m;

/* renamed from: xv1.d */
public class C102744d extends C102758m {

    /* renamed from: x */
    public C44661m1 f303378x;

    /* renamed from: y */
    public CharSequence f303379y;

    /* renamed from: z */
    public C102745a f303380z = new C102745a();

    /* renamed from: xv1.d$a */
    public class C102745a extends C102758m.C102760b {
        public C102745a() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            Class cls = C76705f.class;
            C102744d dVar = (C102744d) bVar;
            C102758m.C102759a aVar2 = (C102758m.C102759a) aVar;
            C93938f0.m118699g(aVar2.f303434a, C102744d.this.f62326d);
            if (Util.isNullOrNil(dVar.f303426p.f292153g)) {
                ((C76705f) C86312j.m106911c(cls)).mo106849z(aVar2.f303435b, dVar.f303426p.f292151e);
            } else {
                ((C76705f) C86312j.m106911c(cls)).mo106849z(aVar2.f303435b, dVar.f303426p.f292153g);
            }
            C93938f0.m118693a(dVar.f303379y, aVar2.f303436c);
            C93938f0.m118693a(dVar.f303430t, aVar2.f303437d);
            C93938f0.m118693a(dVar.f303431u, aVar2.f303438e);
        }
    }

    public C102744d(int i) {
        super(i);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        String str;
        super.mo35129a(context, aVar, objArr);
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f303426p.f292153g);
        if (z1Var == null) {
            str = C99251g.m129283d(this.f303426p.f292151e);
        } else if (Util.isNullOrNil(z1Var.mo73969n2())) {
            C44661m1 m1Var = this.f303378x;
            if (m1Var != null) {
                String q2 = m1Var.mo69789q2(this.f303426p.f292153g);
                str = !Util.isNullOrNil(q2) ? q2 : z1Var.getNickname();
            } else {
                str = z1Var.getNickname();
            }
        } else {
            str = z1Var.mo73969n2();
        }
        if (!Util.isNullOrNil(str)) {
            this.f303379y = ((C76979h) C86312j.m106911c(C76979h.class)).Te0(context, str, (float) C56782d.f162740d);
        }
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f303380z;
    }
}
