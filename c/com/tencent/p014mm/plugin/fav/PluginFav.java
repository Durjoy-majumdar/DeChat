package com.tencent.p014mm.plugin.fav;

import android.content.Context;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.StartFavServiceEvent;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86718e;
import gy3.C87412m;
import i40.C98597b;
import i40.C98598e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kv1.C99260q;
import lc3.C10485b;
import lv1.C99664b;
import p645pj.C77092c;
import p749xh.C102666r2;
import p749xh.C102670ua;
import pb1.C100701c1;
import pb1.C100704e1;
import pb1.C100706g0;
import pb1.C100718j1;
import pb1.C100721l0;
import pb1.C100724n0;
import pb1.C100725n1;
import pb1.C100726o0;
import pb1.C100730p0;
import pb1.C100734q;
import pb1.C100736q0;
import pb1.C100738r0;
import pb1.C100751w0;
import pb1.C100755z;
import qb1.C101089b;
import sb1.C101571a;
import sb1.C101572b;
import sx3.C64197v;
import te3.C50524nd0;
import te3.C51953xc0;
import vb1.C52808a;
import wb1.C102386c;
import wb1.C102394g;
import wb1.C102396i;
import wb1.C102402n;
import wb1.C102407p;
import wb1.C102413r;
import wb1.C102415t;
import wb1.C102417u;
import wb1.C102421x;
import xb1.C102612a;
import xb1.C102613c;
import xb1.C102614d;
import xb1.C102615e;
import xb1.C38479b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.fav.PluginFav */
public class PluginFav extends C98598e implements C100718j1 {

    /* renamed from: i */
    public final C100751w0[] f269586i = {null};

    /* renamed from: j */
    public final C100724n0[] f269587j = {null};

    /* renamed from: n */
    public final C100701c1[] f269588n = {null};

    /* renamed from: o */
    public final C100738r0[] f269589o = {null};

    /* renamed from: p */
    public final C100730p0[] f269590p = {null};

    /* renamed from: q */
    public final C100706g0[] f269591q = {null};

    /* renamed from: r */
    public final C102421x[] f269592r = {null};

    /* renamed from: s */
    public final C102417u[] f269593s = {null};

    /* renamed from: t */
    public final C102415t[] f269594t = {null};

    /* renamed from: u */
    public IListener f269595u = new IListener<StartFavServiceEvent>(C40008f.f107254d) {
        {
            this.__eventId = 290524430;
        }

        public boolean callback(IEvent iEvent) {
            StartFavServiceEvent startFavServiceEvent = (StartFavServiceEvent) iEvent;
            Log.m105924i("MicroMsg.Fav.PluginFav", "runService");
            PluginFav.this.C30();
            PluginFav.this.C30().run();
            ((C102394g) C98597b.m128130c3(PluginFav.this, C102394g.class)).run();
            if (PluginFav.this.th0() != null) {
                ((C102421x) PluginFav.this.th0()).mo142000c();
            }
            if (PluginFav.this.mo128203Ly() != null) {
                PluginFav.this.mo128203Ly().mo141993c();
            }
            if (PluginFav.this.mo128213ik() == null) {
                return false;
            }
            C102415t Ax0 = PluginFav.this.mo128213ik();
            Ax0.getClass();
            C86709a0.m107525e().postToWorker(new C102413r(Ax0));
            return false;
        }
    };

    /* renamed from: v */
    public C114668z.C104589a f269596v = new C68890d(this);

    /* renamed from: com.tencent.mm.plugin.fav.PluginFav$d */
    public class C68890d extends C114668z.C104589a {
        public C68890d(PluginFav pluginFav) {
        }

        public void onAppBackground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                C86718e.m107551r();
            }
        }

        public void onAppForeground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                if (!C86718e.m107551r()) {
                    new StartFavServiceEvent().publish();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.PluginFav$a */
    public class C93393a extends C99664b {
        public C93393a(PluginFav pluginFav) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Class cls = C99260q.class;
            C101571a aVar = new C101571a();
            ((C99260q) C86312j.m106911c(cls)).mo128754df(aVar);
            aVar.create();
            C101572b bVar = new C101572b();
            ((C99260q) C86312j.m106911c(cls)).zk0(6, bVar);
            bVar.create();
            return true;
        }

        public String getName() {
            return "InitFTSFavPluginTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.PluginFav$b */
    public class C93394b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C52808a f269598d;

        public C93394b(PluginFav pluginFav, C52808a aVar) {
            this.f269598d = aVar;
        }

        public void run() {
            C86709a0.m107524d().mo123460f(this.f269598d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.PluginFav$c */
    public class C93395c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C52808a f269599d;

        public C93395c(PluginFav pluginFav, C52808a aVar) {
            this.f269599d = aVar;
        }

        public void run() {
            C86709a0.m107524d().mo123460f(this.f269599d);
        }
    }

    /* renamed from: Ax0 */
    public C102415t mo128213ik() {
        C102415t[] tVarArr = this.f269594t;
        if (tVarArr[0] == null) {
            synchronized (tVarArr) {
                C102415t[] tVarArr2 = this.f269594t;
                if (tVarArr2[0] == null) {
                    tVarArr2[0] = new C102415t();
                }
            }
        }
        return this.f269594t[0];
    }

    public long Bx0(boolean z) {
        if (z) {
            try {
                String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitFavImageSize");
                if (Util.isNullOrNil(c)) {
                    Log.m105924i("MicroMsg.Fav.PluginFav", "getImageSizeLimit nullOrNil");
                } else {
                    Log.m105924i("MicroMsg.Fav.PluginFav", "getImageSizeLimit " + c);
                }
                return Util.getLong(c, 26214400);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.Fav.PluginFav", th, "getImageSizeLimit", new Object[0]);
            }
        }
        return 26214400;
    }

    public C100726o0 C30() {
        return (C100726o0) C98597b.f289091e.mo85231a(this, C102407p.class);
    }

    /* renamed from: CX */
    public List<C100755z> mo128196CX() {
        boolean z = false;
        SelectSql build = C102666r2.f302877B.selectAll().where(C102666r2.f302878C.inNumber(C64197v.m75537f(3, 6, 11, 14, 16, 18))).build();
        if (C102670ua.f303014i == null) {
            C102670ua.f303014i = new C102670ua();
        }
        C102670ua uaVar = C102670ua.f303014i;
        if (uaVar != null && uaVar.mo125628r()) {
            z = true;
        }
        if (!z) {
            uaVar = null;
        }
        return build.multiQuery(uaVar, C100755z.class);
    }

    /* renamed from: Cx0 */
    public C102417u mo128203Ly() {
        C102417u[] uVarArr = this.f269593s;
        if (uVarArr[0] == null) {
            synchronized (uVarArr) {
                C102417u[] uVarArr2 = this.f269593s;
                if (uVarArr2[0] == null) {
                    uVarArr2[0] = new C102417u();
                }
            }
        }
        return this.f269593s[0];
    }

    /* renamed from: DE */
    public C100724n0 mo128198DE() {
        C100724n0[] n0VarArr = this.f269587j;
        if (n0VarArr[0] == null) {
            synchronized (n0VarArr) {
                C100724n0[] n0VarArr2 = this.f269587j;
                if (n0VarArr2[0] == null) {
                    if (C102670ua.f303014i == null) {
                        C102670ua.f303014i = new C102670ua();
                    }
                    C102670ua uaVar = C102670ua.f303014i;
                    boolean z = true;
                    if (uaVar == null || !uaVar.mo125628r()) {
                        z = false;
                    }
                    if (!z) {
                        uaVar = null;
                    }
                    n0VarArr2[0] = new C102612a(uaVar);
                }
            }
        }
        return this.f269587j[0];
    }

    /* renamed from: Jq */
    public C100751w0 mo128199Jq() {
        C100751w0[] w0VarArr = this.f269586i;
        if (w0VarArr[0] == null) {
            synchronized (w0VarArr) {
                C100751w0[] w0VarArr2 = this.f269586i;
                if (w0VarArr2[0] == null) {
                    if (C102670ua.f303014i == null) {
                        C102670ua.f303014i = new C102670ua();
                    }
                    C102670ua uaVar = C102670ua.f303014i;
                    boolean z = true;
                    if (uaVar == null || !uaVar.mo125628r()) {
                        z = false;
                    }
                    if (!z) {
                        uaVar = null;
                    }
                    w0VarArr2[0] = new C102614d(uaVar);
                }
            }
        }
        return this.f269586i[0];
    }

    /* renamed from: Jt */
    public int mo128200Jt(boolean z, int i) {
        return i == 2 ? mo128201KU(z) : i == 4 ? mo128205RR(z) : mo128211cX(z);
    }

    /* renamed from: KU */
    public int mo128201KU(boolean z) {
        return (int) ((Bx0(z) / 1024) / 1024);
    }

    public void Lt0(List<C51953xc0> list) {
        MMHandlerThread.postToMainThread(new C93394b(this, new C52808a(list)));
    }

    /* renamed from: NU */
    public C100706g0 mo128204NU() {
        C100706g0[] g0VarArr = this.f269591q;
        if (g0VarArr[0] == null) {
            synchronized (g0VarArr) {
                C100706g0[] g0VarArr2 = this.f269591q;
                if (g0VarArr2[0] == null) {
                    g0VarArr2[0] = new C100706g0();
                }
            }
        }
        return this.f269591q[0];
    }

    /* renamed from: RR */
    public int mo128205RR(boolean z) {
        return (int) ((mo128216vR(z) / 1024) / 1024);
    }

    /* renamed from: Ve */
    public C100736q0 mo128206Ve() {
        return C101089b.f295920a;
    }

    public C100730p0 W80() {
        C100730p0[] p0VarArr = this.f269590p;
        if (p0VarArr[0] == null) {
            synchronized (p0VarArr) {
                C100730p0[] p0VarArr2 = this.f269590p;
                if (p0VarArr2[0] == null) {
                    if (C102670ua.f303014i == null) {
                        C102670ua.f303014i = new C102670ua();
                    }
                    C102670ua uaVar = C102670ua.f303014i;
                    boolean z = true;
                    if (uaVar == null || !uaVar.mo125628r()) {
                        z = false;
                    }
                    if (!z) {
                        uaVar = null;
                    }
                    p0VarArr2[0] = new C38479b(uaVar);
                }
            }
        }
        return this.f269590p[0];
    }

    /* renamed from: Y3 */
    public C100701c1 mo128208Y3() {
        C100701c1[] c1VarArr = this.f269588n;
        if (c1VarArr[0] == null) {
            synchronized (c1VarArr) {
                C100701c1[] c1VarArr2 = this.f269588n;
                if (c1VarArr2[0] == null) {
                    if (C102670ua.f303014i == null) {
                        C102670ua.f303014i = new C102670ua();
                    }
                    C102670ua uaVar = C102670ua.f303014i;
                    boolean z = true;
                    if (uaVar == null || !uaVar.mo125628r()) {
                        z = false;
                    }
                    if (!z) {
                        uaVar = null;
                    }
                    c1VarArr2[0] = new C102615e(uaVar);
                }
            }
        }
        return this.f269588n[0];
    }

    public C100738r0 a10() {
        C100738r0[] r0VarArr = this.f269589o;
        if (r0VarArr[0] == null) {
            synchronized (r0VarArr) {
                C100738r0[] r0VarArr2 = this.f269589o;
                if (r0VarArr2[0] == null) {
                    if (C102670ua.f303014i == null) {
                        C102670ua.f303014i = new C102670ua();
                    }
                    C102670ua uaVar = C102670ua.f303014i;
                    boolean z = true;
                    if (uaVar == null || !uaVar.mo125628r()) {
                        z = false;
                    }
                    if (!z) {
                        uaVar = null;
                    }
                    r0VarArr2[0] = new C102613c(uaVar);
                }
            }
        }
        return this.f269589o[0];
    }

    /* renamed from: aN */
    public long mo128210aN(boolean z) {
        return C77092c.m93044f();
    }

    /* renamed from: cX */
    public int mo128211cX(boolean z) {
        return (int) ((C77092c.m93044f() / 1024) / 1024);
    }

    /* renamed from: cl */
    public C100721l0 mo128212cl() {
        return (C100721l0) C98597b.f289091e.mo85231a(this, C102394g.class);
    }

    /* renamed from: o9 */
    public void mo128214o9(C50524nd0 nd02) {
        MMHandlerThread.postToMainThread(new C93395c(this, new C52808a(nd02)));
    }

    public C100704e1 th0() {
        C102421x[] xVarArr = this.f269592r;
        if (xVarArr[0] == null) {
            synchronized (xVarArr) {
                C102421x[] xVarArr2 = this.f269592r;
                if (xVarArr2[0] == null) {
                    xVarArr2[0] = new C102421x();
                }
            }
        }
        return this.f269592r[0];
    }

    /* renamed from: vR */
    public long mo128216vR(boolean z) {
        if (z) {
            try {
                String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitFavVideoSize");
                if (Util.isNullOrNil(c)) {
                    Log.m105924i("MicroMsg.Fav.PluginFav", "getVideoSizeLimit nullOrNil");
                } else {
                    Log.m105924i("MicroMsg.Fav.PluginFav", "getVideoSizeLimit " + c);
                }
                return Util.getLong(c, 26214400);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.Fav.PluginFav", th, "getVideoSizeLimit", new Object[0]);
            }
        }
        return 26214400;
    }

    public void wx0(HashSet<Class<? extends C98597b>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        hashSet.add(C102394g.class);
        hashSet.add(C102386c.class);
        hashSet.add(C102396i.class);
        hashSet.add(C102407p.class);
        hashSet.add(C102402n.class);
    }

    public void xx0(Context context) {
        Log.m105924i("MicroMsg.Fav.PluginFav", "init fav storage");
        ((C93836i) ((C99260q) C86312j.m106911c(C99260q.class)).mo128743Jd()).mo128803c(-86016, new C93393a(this));
        this.f269595u.alive();
        this.f269596v.alive();
        HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
        C86009m1 m1Var = new C86009m1(C86709a0.m107535s().f251806d + "favorite" + "/");
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            Log.m105924i("MicroMsg.Fav.PluginFav", "fav root dir not exists, try to make it");
            m1Var.mo119987x();
        }
        C86009m1 m1Var2 = new C86009m1(C100734q.m131812C());
        if (!m1Var2.mo119967g() || !m1Var2.mo119977o()) {
            Log.m105924i("MicroMsg.Fav.PluginFav", "fav web dir not exists, try to make it");
            m1Var2.mo119987x();
        }
        C86009m1 m1Var3 = new C86009m1(C100734q.m131809A());
        if (!m1Var3.mo119967g() || !m1Var3.mo119977o()) {
            Log.m105924i("MicroMsg.Fav.PluginFav", "fav attach dir not exists, try to make it");
            m1Var3.mo119987x();
        }
        C86009m1 m1Var4 = new C86009m1(C100734q.m131811B());
        if (!m1Var4.mo119967g() || !m1Var4.mo119977o()) {
            Log.m105924i("MicroMsg.Fav.PluginFav", "fav voice dir not exists, try to make it");
            m1Var4.mo119987x();
        }
    }

    /* renamed from: zv */
    public long mo128217zv(boolean z, int i) {
        return i == 2 ? Bx0(z) : i == 4 ? mo128216vR(z) : C77092c.m93044f();
    }

    public void zx0() {
        Class cls = C99260q.class;
        this.f269595u.dead();
        this.f269596v.dead();
        C100725n1.f295091o.set(0);
        if (Log.isDebug()) {
            Log.m105919d("MicroMsg.NetSceneBatchgetFav", "clearSceneCount: %s", C100725n1.f295091o);
        }
        ((C99260q) C86312j.m106911c(cls)).Bj0(256);
        ((C99260q) C86312j.m106911c(cls)).mo128747VM(6);
        synchronized (this.f269592r) {
            C102421x xVar = this.f269592r[0];
            if (xVar != null) {
                xVar.getClass();
                Log.m105924i("MicroMsg.Fav.FavSendService", "stop");
                xVar.mo141999b();
                xVar.f301672i.stopTimer();
                xVar.f301668e = 0;
                C86709a0.m107524d().mo123470p(401, xVar);
                this.f269592r[0] = null;
            }
        }
        synchronized (this.f269593s) {
            C102417u uVar = this.f269593s[0];
            if (uVar != null) {
                uVar.getClass();
                Log.m105924i("MicroMsg.Fav.FavModService", "stop");
                uVar.mo141992b();
                uVar.f301657i.stopTimer();
                uVar.f301653e = 0;
                C86709a0.m107524d().mo123470p(v2helper.EMethodSetAgcRxOn, uVar);
                this.f269593s[0] = null;
            }
        }
        synchronized (this.f269594t) {
            C102415t tVar = this.f269594t[0];
            if (tVar != null) {
                tVar.getClass();
                Log.m105924i("MicroMsg.Fav.FavEditService", "stop");
                C86709a0.m107524d().mo123470p(v2helper.EMethodSetAgcRxOn, tVar);
                C86709a0.m107524d().mo123470p(401, tVar);
                ((HashMap) tVar.f301645d).clear();
                this.f269594t[0] = null;
            }
        }
        synchronized (this.f269586i) {
            C100751w0[] w0VarArr = this.f269586i;
            if (w0VarArr[0] != null) {
                w0VarArr[0] = null;
            }
        }
        synchronized (this.f269587j) {
            C100724n0[] n0VarArr = this.f269587j;
            if (n0VarArr[0] != null) {
                n0VarArr[0] = null;
            }
        }
        synchronized (this.f269588n) {
            C100701c1[] c1VarArr = this.f269588n;
            if (c1VarArr[0] != null) {
                c1VarArr[0] = null;
            }
        }
        synchronized (this.f269589o) {
            C100738r0[] r0VarArr = this.f269589o;
            if (r0VarArr[0] != null) {
                r0VarArr[0] = null;
            }
        }
        synchronized (this.f269590p) {
            C100730p0[] p0VarArr = this.f269590p;
            if (p0VarArr[0] != null) {
                p0VarArr[0] = null;
            }
        }
        synchronized (this.f269591q) {
            C100706g0[] g0VarArr = this.f269591q;
            if (g0VarArr[0] != null) {
                g0VarArr[0] = null;
            }
        }
        Log.m105924i("MicroMsg.Fav.PluginFav", "release fav storage");
    }
}
