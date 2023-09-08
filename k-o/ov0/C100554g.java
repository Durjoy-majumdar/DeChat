package ov0;

import a11.C39479c;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.pluginsdk.model.app.C44579p;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.pluginsdk.model.app.C96776s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72954a0;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72993x2;
import com.tencent.p014mm.storage.C85796t4;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C45613m2;
import eb0.C86484b;
import f40.C86709a0;
import f62.C97829l0;
import g62.C75875l;
import g62.C8235p;
import hd0.C98410o0;
import java.util.HashMap;
import junit.framework.Assert;
import p156gj.C87203t;
import wh3.C102451g;
import zh3.C91753f;

/* renamed from: ov0.g */
public class C100554g {

    /* renamed from: a */
    public C85801v1 f294611a;

    /* renamed from: b */
    public C44668u3 f294612b;

    /* renamed from: c */
    public C75875l f294613c;

    /* renamed from: d */
    public C30783v3 f294614d;

    /* renamed from: e */
    public C92839m f294615e;

    /* renamed from: f */
    public C102451g f294616f;

    /* renamed from: g */
    public C8235p f294617g;

    /* renamed from: h */
    public C98410o0 f294618h;

    /* renamed from: i */
    public C45613m2 f294619i;

    /* renamed from: j */
    public C96776s f294620j;

    /* renamed from: k */
    public C44579p f294621k;

    /* renamed from: l */
    public C72684e f294622l;

    /* renamed from: m */
    public C85796t4 f294623m;

    /* renamed from: n */
    public C91753f f294624n = null;

    /* renamed from: o */
    public int f294625o = 0;

    /* renamed from: p */
    public String f294626p;

    /* renamed from: q */
    public Boolean f294627q = null;

    /* renamed from: ov0.g$a */
    public class C100555a implements C91753f.C91754a {
        public C100555a() {
        }

        /* renamed from: d */
        public void mo56419d() {
            C100554g.this.getClass();
        }

        /* renamed from: f */
        public void mo56420f() {
            C100554g.this.getClass();
        }

        /* renamed from: m */
        public void mo56421m() {
            C100554g.this.getClass();
        }
    }

    /* renamed from: a */
    public void mo140001a() {
        Log.m105925i("MicroMsg.BakOldTempStorage", "closeDB isTempDb:%s datadb:%s memdb:%s %s", this.f294627q, this.f294624n, null, Util.getStack());
        Boolean bool = this.f294627q;
        if (bool == null || bool.booleanValue()) {
            C91753f fVar = this.f294624n;
            if (fVar != null) {
                Log.m105925i("MicroMsg.BakOldTempStorage", "closeDB true DB[%s]!!! ", fVar);
                this.f294624n.mo124433c((String) null);
                this.f294624n = null;
            }
            this.f294627q = null;
            return;
        }
        this.f294627q = null;
    }

    /* renamed from: b */
    public void mo140002b(String str, int i, String str2, int i2) {
        boolean z = false;
        Log.m105925i("MicroMsg.BakOldTempStorage", "bakoldInitDB isTempDB:%s  cache:%s uin:%s db:%s %s", this.f294627q, str, Integer.valueOf(i), str2, Util.getStack());
        if (this.f294624n != null) {
            Log.m105920e("MicroMsg.BakOldTempStorage", "bakoldInitDB dataDB is already init!!!");
        }
        if (i2 > 0) {
            Boolean bool = this.f294627q;
            if (bool != null && !bool.booleanValue()) {
                Log.m105920e("MicroMsg.BakOldTempStorage", "bakoldInitDB isTempDB is false!!!");
                mo140001a();
            }
            String str3 = "bakoldInitDB here  isTempDb should null :" + this.f294627q;
            if (this.f294627q == null) {
                z = true;
            }
            Assert.assertTrue(str3, z);
        }
        this.f294627q = Boolean.TRUE;
        C91753f fVar = new C91753f(new C100555a());
        this.f294624n = fVar;
        if (fVar.mo125624n(str, str2, "", (long) i, C87203t.m108270f(true), new HashMap(), false)) {
            this.f294611a = new C85801v1(this.f294624n);
            C97829l0 l0Var = (C97829l0) C86312j.m106911c(C97829l0.class);
            this.f294612b = l0Var.mo96088Ns(this.f294624n);
            C30783v3 yt = l0Var.mo96091yt(this.f294624n);
            this.f294614d = yt;
            C75875l QD = l0Var.mo96089QD(this.f294624n, this.f294612b, yt);
            this.f294613c = QD;
            ((C72972g4) QD).mo101074Lo(new C72993x2(QD));
            C75875l lVar = this.f294613c;
            ((C72972g4) lVar).mo101074Lo(new C72954a0(lVar));
            this.f294617g = l0Var.mo96090hV(this.f294624n);
            this.f294615e = new C92839m(this.f294624n);
            this.f294616f = new C102451g(this.f294624n);
            this.f294619i = ((C39479c) C86709a0.m107533q(C39479c.class)).Df0(this.f294624n);
            this.f294618h = new C98410o0(this.f294624n);
            this.f294620j = new C96776s(this.f294624n);
            this.f294621k = new C44579p(this.f294624n);
            this.f294622l = new C72684e(this.f294624n);
            C85796t4 t4Var = new C85796t4(this.f294611a);
            this.f294623m = t4Var;
            t4Var.add(new C100553f(this));
            this.f294623m.mo119658Yt();
            return;
        }
        throw new C86484b(1);
    }

    /* renamed from: c */
    public String mo140003c() {
        if (this.f294625o != 0) {
            return this.f294626p + "emoji/";
        }
        throw new C86484b();
    }

    /* renamed from: d */
    public C72684e mo140004d() {
        if (this.f294625o != 0) {
            return this.f294622l;
        }
        throw new C86484b();
    }

    /* renamed from: e */
    public C30783v3 mo140005e() {
        if (this.f294625o != 0) {
            return this.f294614d;
        }
        throw new C86484b();
    }

    /* renamed from: f */
    public C102451g mo140006f() {
        if (this.f294625o != 0) {
            return this.f294616f;
        }
        throw new C86484b();
    }

    /* renamed from: g */
    public C92839m mo140007g() {
        if (this.f294625o != 0) {
            return this.f294615e;
        }
        throw new C86484b();
    }

    /* renamed from: h */
    public C75875l mo140008h() {
        if (this.f294625o != 0) {
            return this.f294613c;
        }
        throw new C86484b();
    }

    /* renamed from: i */
    public C98410o0 mo140009i() {
        if (this.f294625o != 0) {
            return this.f294618h;
        }
        throw new C86484b();
    }
}
