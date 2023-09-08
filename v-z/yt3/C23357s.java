package yt3;

import lt3.C21460a;
import ot3.C117897l;
import ot3.C21881e;
import ot3.C21884f;
import tt3.C22551c;
import ut3.C22662b;
import wt3.C22925a;
import wt3.C22926b;
import wt3.C22927c;
import xt3.C53448e;

/* renamed from: yt3.s */
public class C23357s extends C23316c {

    /* renamed from: c */
    public C53448e f67117c;

    /* renamed from: d */
    public boolean f67118d;

    /* renamed from: yt3.s$a */
    public class C23358a implements C22925a {
        public C23358a() {
        }

        /* renamed from: a */
        public void mo36099a(int i, String str) {
            C21881e.m25087f("Soter.TaskPrepareAppSecureKey", "soter: app secure key generate failed. errcode: %d, errmsg: %s", Integer.valueOf(i), str);
            C23357s.this.mo36803h(C21884f.m25094a().f61885a, 0);
            C23357s.this.mo36804b(new C22551c(i, str));
        }

        public void onSuccess() {
            C21881e.m25084c("Soter.TaskPrepareAppSecureKey", "soter: app secure key generate successfully. start upload ask", new Object[0]);
            C23357s sVar = C23357s.this;
            if (sVar.f67117c != null) {
                sVar.mo36803h(C21884f.m25094a().f61885a, 2);
            } else {
                sVar.mo36803h(C21884f.m25094a().f61885a, 0);
            }
            C23357s sVar2 = C23357s.this;
            sVar2.getClass();
            C117897l c = C21460a.m24269c();
            if (c == null) {
                C21881e.m25083b("Soter.TaskPrepareAppSecureKey", "soter: ask model is null even after generation. fatal error", new Object[0]);
                C21460a.m24283q();
                sVar2.mo36804b(new C22551c(3, "ask model is null even after generation."));
                return;
            }
            C53448e eVar = sVar2.f67117c;
            if (eVar != null) {
                eVar.mo36517x0(new C53448e.C53449a(c.f352430g, c.f352428e));
                sVar2.f67117c.mo36516o(new C23359t(sVar2, c));
                sVar2.f67117c.mo36515D();
                return;
            }
            C21881e.m25082a("Soter.TaskPrepareAppSecureKey", "soter: not provide network wrapper instance. please check if it is what you want. we treat it as normal", new Object[0]);
            sVar2.mo36804b(new C22551c(0, "treat as normal because you do not provide the net wrapper", c));
        }
    }

    public C23357s(C53448e eVar, boolean z) {
        this.f67117c = eVar;
        this.f67118d = z;
    }

    /* renamed from: c */
    public void mo36805c() {
        mo36803h(C21884f.m25094a().f61885a, 1);
        C23324g.m27822a().mo36819c(new C22926b(new C22927c(1, "", this.f67118d, false, new C23358a(), (C22926b) null)));
    }

    /* renamed from: d */
    public boolean mo36806d() {
        return true;
    }

    /* renamed from: f */
    public void mo36807f() {
        C21881e.m25087f("Soter.TaskPrepareAppSecureKey", "soter: cancelled prepare ask", new Object[0]);
        C21460a.m24283q();
    }

    /* renamed from: g */
    public boolean mo36808g() {
        if (!C22662b.m26538b().mo35776d()) {
            C21881e.m25087f("Soter.TaskPrepareAppSecureKey", "soter: not initialized yet", new Object[0]);
            mo36804b(new C22551c(1008));
            return true;
        } else if (!C22662b.m26538b().mo35777e()) {
            C21881e.m25087f("Soter.TaskPrepareAppSecureKey", "soter: not support soter", new Object[0]);
            mo36804b(new C22551c(2));
            return true;
        } else if (!C21460a.m24276j() || this.f67118d) {
            if (this.f67117c == null) {
                C21881e.m25087f("Soter.TaskPrepareAppSecureKey", "soter: it is strongly recommended that you provide a net wrapper to check and upload ASK validation from server! Please make sure you upload it later", new Object[0]);
            }
            return false;
        } else {
            C21881e.m25084c("Soter.TaskPrepareAppSecureKey", "soter: already has ask. do not need generate again", new Object[0]);
            mo36804b(new C22551c(0, C21460a.m24269c()));
            return true;
        }
    }
}
