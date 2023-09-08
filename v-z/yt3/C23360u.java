package yt3;

import lt3.C21460a;
import ot3.C117896h;
import ot3.C117897l;
import ot3.C21881e;
import pt3.C22005b;
import rt3.C22252b;
import tt3.C22551c;
import tt3.C22553e;
import tt3.C64998b;
import ut3.C22662b;
import wt3.C22925a;
import wt3.C22926b;
import wt3.C22927c;
import xt3.C53448e;

/* renamed from: yt3.u */
public class C23360u extends C23316c {

    /* renamed from: c */
    public String f67122c = null;

    /* renamed from: d */
    public int f67123d;

    /* renamed from: e */
    public C53448e f67124e;

    /* renamed from: f */
    public C53448e f67125f;

    /* renamed from: g */
    public boolean f67126g;

    /* renamed from: h */
    public boolean f67127h;

    /* renamed from: yt3.u$a */
    public class C23361a implements C64998b<C22551c> {
        public C23361a() {
        }

        /* renamed from: a */
        public void mo24821a(C22553e eVar) {
            C22551c cVar = (C22551c) eVar;
            C21881e.m25082a("Soter.TaskPrepareAuthKey", "soter: prepare ask end: %s", cVar.toString());
            if (cVar.f61886a == 0) {
                C23360u.this.mo36849i();
            } else {
                C23360u.this.mo36804b(cVar);
            }
        }
    }

    /* renamed from: yt3.u$b */
    public class C23362b implements C22925a {
        public C23362b() {
        }

        /* renamed from: a */
        public void mo36099a(int i, String str) {
            C21881e.m25087f("Soter.TaskPrepareAuthKey", "soter: auth key %s generate failed. errcode: %d, errmsg: %s", C23360u.this.f67122c, Integer.valueOf(i), str);
            C23360u uVar = C23360u.this;
            uVar.mo36803h(uVar.f67122c, 0);
            C23360u.this.mo36804b(new C22551c(i, str));
        }

        public void onSuccess() {
            C21881e.m25084c("Soter.TaskPrepareAuthKey", "soter: auth key generate successfully. start upload", new Object[0]);
            C23360u uVar = C23360u.this;
            if (uVar.f67124e != null) {
                uVar.mo36803h(uVar.f67122c, 2);
            } else {
                uVar.mo36803h(uVar.f67122c, 0);
            }
            C23360u uVar2 = C23360u.this;
            C117897l e = C21460a.m24271e(uVar2.f67122c);
            if (e == null) {
                C21881e.m25083b("Soter.TaskPrepareAuthKey", "soter: auth key model is null even after generation. fatal error", new Object[0]);
                C21460a.m24284r(uVar2.f67122c, false);
                uVar2.mo36804b(new C22551c(1006, "auth key model is null even after generation."));
                return;
            }
            C53448e eVar = uVar2.f67124e;
            if (eVar != null) {
                eVar.mo36517x0(new C53448e.C53449a(e.f352430g, e.f352428e));
                uVar2.f67124e.mo36516o(new C23363v(uVar2, e));
                uVar2.f67124e.mo36515D();
                return;
            }
            C21881e.m25082a("Soter.TaskPrepareAuthKey", "soter: not provide network wrapper instance. please check if it is what you want. we treat it as normal", new Object[0]);
            uVar2.mo36804b(new C22551c(0, "treat as normal because you do not provide the net wrapper", e));
        }
    }

    public C23360u(int i, C53448e eVar, C53448e eVar2, boolean z, boolean z2) {
        this.f67123d = i;
        this.f67124e = eVar;
        this.f67126g = z;
        this.f67127h = z2;
        this.f67125f = eVar2;
    }

    /* renamed from: c */
    public void mo36805c() {
        if (C21460a.m24276j() || !this.f67127h) {
            mo36849i();
            return;
        }
        C21881e.m25082a("Soter.TaskPrepareAuthKey", "soter: ask not found, but required to generate it. start generate", new Object[0]);
        C22252b.m25807d(new C23361a(), false, this.f67125f);
    }

    /* renamed from: d */
    public boolean mo36806d() {
        return true;
    }

    /* renamed from: f */
    public void mo36807f() {
        C21881e.m25087f("Soter.TaskPrepareAuthKey", "soter: cancelled prepare authkey: %s", this.f67122c);
        C21460a.m24284r(this.f67122c, false);
    }

    /* renamed from: g */
    public boolean mo36808g() {
        boolean z;
        if (!C22662b.m26538b().mo35776d()) {
            C21881e.m25087f("Soter.TaskPrepareAuthKey", "soter: not initialized yet", new Object[0]);
            mo36804b(new C22551c(1008));
            return true;
        } else if (!C22662b.m26538b().mo35777e()) {
            C21881e.m25087f("Soter.TaskPrepareAuthKey", "soter: not support soter", new Object[0]);
            mo36804b(new C22551c(2));
            return true;
        } else {
            String str = C22662b.m26538b().mo35774a().get(this.f67123d, "");
            this.f67122c = str;
            if (C117896h.m166297b(str)) {
                C21881e.m25087f("Soter.TaskPrepareAuthKey", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new Object[0]);
                mo36804b(new C22551c(1009, String.format("auth scene %d not initialized in map", new Object[]{Integer.valueOf(this.f67123d)})));
                return true;
            }
            boolean j = C21460a.m24276j();
            if (!j && C21460a.m24275i(this.f67122c)) {
                C21881e.m25087f("Soter.TaskPrepareAuthKey", "soter: no ask but has auth key. delete the auth key as well", new Object[0]);
                C21460a.m24284r(this.f67122c, false);
            }
            if (j || this.f67127h) {
                if (C21460a.m24275i(this.f67122c)) {
                    String str2 = this.f67122c;
                    C22005b bVar = C21460a.f60758c;
                    if (bVar == null) {
                        C21881e.m25083b("Soter.SoterCore", "soter: isAuthKeyValid IMPL is null, not support soter", new Object[0]);
                        z = false;
                    } else {
                        z = bVar.mo35109l(str2, true);
                    }
                    if (!z) {
                        C21881e.m25087f("Soter.TaskPrepareAuthKey", "soter: already has auth key but not valid. delete it already and re-generate", new Object[0]);
                        return false;
                    }
                }
                if (!C21460a.m24275i(this.f67122c) || this.f67126g) {
                    if (this.f67124e == null) {
                        C21881e.m25087f("Soter.TaskPrepareAuthKey", "soter: it is strongly recommended that you provide a net wrapper to check and upload AuthKey validation from server! Please make sure you upload it later", new Object[0]);
                    }
                    return false;
                }
                C21881e.m25084c("Soter.TaskPrepareAuthKey", "soter: already has key. do not need generate again", new Object[0]);
                mo36804b(new C22551c(0, C21460a.m24271e(this.f67122c)));
                return true;
            }
            C21881e.m25087f("Soter.TaskPrepareAuthKey", "soter: has not generate app secure key yet and not require to generate it", new Object[0]);
            mo36804b(new C22551c(3));
            return true;
        }
    }

    /* renamed from: i */
    public final void mo36849i() {
        mo36803h(this.f67122c, 1);
        C23324g.m27822a().mo36819c(new C22926b(new C22927c(2, this.f67122c, false, this.f67126g, new C23362b(), (C22926b) null)));
    }
}
