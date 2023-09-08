package pc0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.zero.C72670r;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import f40.C86718e;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117746w;
import ob0.C117747y;
import ob0.C47355o;
import ob0.y$$d;
import p206nj.C76861g;
import qe3.C47817n0;
import qe3.C47818o0;
import qe3.C89631w;
import sf0.C48374j0;
import te3.C50490n33;
import te3.C50631o33;
import te3.C50886px;
import te3.C51018qv3;

/* renamed from: pc0.o */
public class C47457o extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f127285d;

    /* renamed from: e */
    public WeakReference<C47355o> f127286e = null;

    /* renamed from: f */
    public final C50490n33 f127287f = new C50490n33();

    /* renamed from: g */
    public C76861g.C47263a f127288g;

    /* renamed from: h */
    public StringBuilder f127289h = new StringBuilder();

    /* renamed from: i */
    public int f127290i = 0;

    /* renamed from: j */
    public boolean f127291j = false;

    /* renamed from: n */
    public int f127292n = 0;

    /* renamed from: o */
    public int f127293o = 0;

    /* renamed from: p */
    public int f127294p = 3;

    /* renamed from: q */
    public boolean f127295q = false;

    /* renamed from: r */
    public final Queue<C47460b> f127296r = new LinkedList();

    /* renamed from: s */
    public final MTimerHandler f127297s = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C47458a(), true);

    /* renamed from: pc0.o$a */
    public class C47458a implements MTimerHandler.CallBack {

        /* renamed from: pc0.o$a$a */
        public class C47459a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C47460b f127299d;

            public C47459a(C47460b bVar) {
                this.f127299d = bVar;
            }

            public void run() {
                C47457o oVar = C47457o.this;
                C11385n nVar = oVar.f127285d;
                C47460b bVar = this.f127299d;
                nVar.onSceneEnd(bVar.f127301a, bVar.f127302b, bVar.f127303c, oVar);
            }
        }

        public C47458a() {
        }

        public boolean onTimerExpired() {
            C47460b bVar;
            C47460b bVar2;
            int i;
            boolean z = false;
            if (!C86709a0.m107522a() || C86718e.m107551r()) {
                Log.m105920e("MicroMsg.NetSceneInit.dkInit", "acc is not ready stop handle resp");
                return false;
            } else if (C47457o.this.f127295q) {
                Log.m105929w("MicroMsg.NetSceneInit.dkInit", "Init CANCELED hash:%d", Integer.valueOf(C47457o.this.hashCode()));
                return false;
            } else if (C47457o.this.f127296r.isEmpty()) {
                Log.m105926v("MicroMsg.NetSceneInit.dkInit", "queue maybe this time is null , wait doscene!");
                return false;
            } else {
                int i2 = 6;
                Log.m105925i("MicroMsg.NetSceneInit.dkInit", "pusher hash:%d time:%d list:%d [%d/%b,%d/%d]", Integer.valueOf(C47457o.this.hashCode()), Long.valueOf(C47457o.this.f127288g.mo72288a()), Integer.valueOf(((LinkedList) C47457o.this.f127296r).size()), Integer.valueOf(C47457o.this.f127290i), Boolean.valueOf(C47457o.this.f127291j), Integer.valueOf(C47457o.this.f127293o), Integer.valueOf(C47457o.this.f127292n));
                C86709a0.m107528h();
                long beginTransaction = C86709a0.m107535s().mo121143j().beginTransaction(Thread.currentThread().getId());
                C72670r rVar = new C72670r();
                rVar.mo100128b("NetSceneInit");
                int i3 = C47457o.this.f127291j ? 40 : 10;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        break;
                    }
                    bVar = (C47460b) ((LinkedList) C47457o.this.f127296r).peek();
                    if (bVar.f127306f == Integer.MAX_VALUE) {
                        Assert.assertTrue("in Queue tail , resp should be null", bVar.f127304d == null);
                        C86709a0.m107528h();
                        C118000d0.f352701a.mo182758c(Util.decodeHexString((String) C86709a0.m107535s().mo121142i().mo119683d(8198)), false);
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119676J(8197, "");
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119676J(8198, "");
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119676J(15, 1);
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119681a(true);
                        Object[] objArr = new Object[i2];
                        objArr[0] = Integer.valueOf(C47457o.this.hashCode());
                        objArr[1] = Long.valueOf(C47457o.this.f127288g.mo72288a());
                        objArr[2] = Integer.valueOf(C47457o.this.f127290i);
                        objArr[3] = Integer.valueOf(C47457o.this.f127292n);
                        objArr[4] = Integer.valueOf(bVar.f127301a);
                        objArr[5] = Integer.valueOf(bVar.f127302b);
                        Log.m105925i("MicroMsg.NetSceneInit.dkInit", "INIT DONE: hash:%d time:%d netCnt:%d cmdCnt:%d err:[%d,%d] ", objArr);
                        C86709a0.m107525e().postToWorker(new C47459a(bVar));
                    } else {
                        LinkedList<C50886px> linkedList = bVar.f127304d.f138936i;
                        if (linkedList == null || linkedList.size() <= (i = bVar.f127305e)) {
                            bVar2 = bVar;
                        } else {
                            bVar2 = bVar;
                            int i5 = i4;
                            int i6 = i3;
                            if (!rVar.mo100129c("NetSceneInit", i, linkedList.size(), linkedList.get(bVar.f127305e), true)) {
                                break;
                            }
                            bVar2.f127305e++;
                            C47457o.m52800p1(C47457o.this);
                            i4 = i5 + 1;
                            i3 = i6;
                            i2 = 6;
                        }
                    }
                }
                bVar2 = bVar;
                ((LinkedList) C47457o.this.f127296r).poll();
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(8197, Util.encodeHexString(C48374j0.m53715d(bVar2.f127304d.f138931d)));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(8198, Util.encodeHexString(C48374j0.m53715d(bVar2.f127304d.f138932e)));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(16, 0);
                Log.m105925i("MicroMsg.NetSceneInit.dkInit", "ContinueFlag:%s, cur[%s], max[%s]", Long.valueOf((long) bVar2.f127304d.f138933f), Util.encodeHexString(C48374j0.m53715d(bVar2.f127304d.f138931d)), Util.encodeHexString(C48374j0.m53715d(bVar2.f127304d.f138932e)));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(8196, Long.valueOf((long) bVar2.f127304d.f138933f));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119681a(true);
                z = true;
                rVar.mo100127a("NetSceneInit");
                C86709a0.m107528h();
                C86709a0.m107535s().mo121143j().endTransaction(beginTransaction);
                C47457o.this.mo72477r1();
                return z;
            }
        }
    }

    /* renamed from: pc0.o$b */
    public class C47460b {

        /* renamed from: a */
        public int f127301a;

        /* renamed from: b */
        public int f127302b;

        /* renamed from: c */
        public String f127303c;

        /* renamed from: d */
        public C50631o33 f127304d;

        /* renamed from: e */
        public int f127305e = 0;

        /* renamed from: f */
        public int f127306f = 0;

        public C47460b(C47457o oVar) {
        }
    }

    /* renamed from: pc0.o$c */
    public static class C47461c extends C117746w {

        /* renamed from: a */
        public final C47817n0 f127307a = new C47817n0();

        /* renamed from: b */
        public final C47818o0 f127308b = new C47818o0();

        public C89631w.C89634d getReqObjImp() {
            return this.f127307a;
        }

        public C89631w.C89636e getRespObj() {
            return this.f127308b;
        }

        public int getType() {
            return 139;
        }

        public String getUri() {
            return "/cgi-bin/micromsg-bin/newinit";
        }
    }

    public C47457o(C47355o oVar) {
        Log.m105925i("MicroMsg.NetSceneInit.dkInit", "NetSceneInit hash:%d stack:%s", Integer.valueOf(hashCode()), Util.getStack());
        StringBuilder sb = this.f127289h;
        sb.append("stack:" + Util.getStack() + " time:" + Util.nowSecond());
        this.f127286e = new WeakReference<>(oVar);
    }

    /* renamed from: p1 */
    public static /* synthetic */ int m52800p1(C47457o oVar) {
        int i = oVar.f127293o;
        oVar.f127293o = i + 1;
        return i;
    }

    public void cancel() {
        Log.m105929w("MicroMsg.NetSceneInit.dkInit", "init cancel by :%s", Util.getStack());
        super.cancel();
        this.f127295q = true;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127288g = new C76861g.C47263a();
        this.f127285d = nVar;
        C50490n33 n332 = this.f127287f;
        C86709a0.m107528h();
        n332.f138367d = (String) C86709a0.m107535s().mo121142i().mo119683d(2);
        Assert.assertTrue("by DK: req.UserName is null", !Util.isNullOrNil(this.f127287f.f138367d));
        this.f127287f.f138370g = LocaleUtil.getApplicationLanguage();
        return mo72478s1(gVar, (C51018qv3) null, (C51018qv3) null);
    }

    public String getInfo() {
        return this.f127289h.toString();
    }

    public int getType() {
        return 139;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        this.f127289h.append(" endtime:" + Util.nowSecond());
        Log.m105925i("MicroMsg.NetSceneInit.dkInit", "summerinit onGYNetEnd [%d, %d, %s], tid:%d", Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i));
        if (i4 == 4 && (i5 == -100 || i5 == -2023)) {
            Log.m105921e("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd ERROR hash:%d [%d,%d] KICK OUT : %s", Integer.valueOf(hashCode()), Integer.valueOf(i2), Integer.valueOf(i3), str2);
            this.f127295q = true;
            this.f127285d.onSceneEnd(i4, i5, str2, this);
        } else if ((i4 == 0 && i5 == 0) || (i4 == 4 && i5 == -17)) {
            C50631o33 o332 = ((C47818o0) uVar.getRespObj()).f128382a;
            this.f127292n += o332.f138935h;
            Log.m105925i("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd hash:%d [%d,%d] time:%d cmdSum:%d doscenecount:%d conFlag:%d", Integer.valueOf(hashCode()), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(this.f127288g.mo72288a()), Integer.valueOf(this.f127292n), Integer.valueOf(this.f127290i), Integer.valueOf(o332.f138933f));
            mo72480t1(this.f127290i - 1, i2, i3, str, o332);
            if ((o332.f138933f & 7) == 0 || super.securityLimitCountReach()) {
                Log.m105925i("MicroMsg.NetSceneInit.dkInit", "NETWORK FINISH onGYNetEnd hash:%d time:%d netCnt:%d", Integer.valueOf(hashCode()), Long.valueOf(this.f127288g.mo72288a()), Integer.valueOf(this.f127290i));
                this.f127291j = true;
                mo72480t1(Integer.MAX_VALUE, 0, 0, "", (C50631o33) null);
            } else if (mo72478s1(dispatcher(), o332.f138931d, o332.f138932e) == -1) {
                Log.m105920e("MicroMsg.NetSceneInit.dkInit", "doScene Failed stop init");
                mo72480t1(Integer.MAX_VALUE, 3, -1, "", (C50631o33) null);
            }
        } else {
            Log.m105921e("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd ERROR retry:%d hash:%d [%d,%d] %s", Integer.valueOf(this.f127294p), Integer.valueOf(hashCode()), Integer.valueOf(i2), Integer.valueOf(i3), str2);
            int i6 = this.f127294p;
            if (i6 > 0) {
                this.f127294p = i6 - 1;
                if (mo72478s1(dispatcher(), (C51018qv3) null, (C51018qv3) null) == -1) {
                    this.f127295q = true;
                    this.f127285d.onSceneEnd(3, -1, "", this);
                    return;
                }
                return;
            }
            this.f127295q = true;
            this.f127285d.onSceneEnd(3, -1, "", this);
        }
    }

    /* renamed from: r1 */
    public void mo72477r1() {
        int i;
        WeakReference<C47355o> weakReference = this.f127286e;
        if (weakReference == null) {
            Log.m105928w("MicroMsg.NetSceneInit.dkInit", "dkinit doProgressCallBack progressRef is null");
            return;
        }
        C47355o oVar = weakReference.get();
        if (oVar == null) {
            Log.m105928w("MicroMsg.NetSceneInit.dkInit", "dkinit doProgressCallBack progress is null");
            return;
        }
        int i2 = this.f127290i;
        if (i2 > 50) {
            i2 = 50;
        }
        float f = 1.0f;
        if (!this.f127291j) {
            i = i2;
        } else {
            float f2 = ((float) this.f127293o) / ((float) this.f127292n);
            if (f2 <= 1.0f) {
                f = f2;
            }
            i = (int) ((((float) (100 - i2)) * f) + ((float) i2));
        }
        Log.m105919d("MicroMsg.NetSceneInit.dkInit", "doProgressCallBack index:%d sum:%d ratiocmd:%f ratioDoScene:%d", Integer.valueOf(this.f127293o), Integer.valueOf(this.f127292n), Float.valueOf(f), Integer.valueOf(i2));
        oVar.mo26221m(i, 100, this);
    }

    /* renamed from: s1 */
    public final int mo72478s1(C114770g gVar, C51018qv3 qv32, C51018qv3 qv33) {
        this.f127289h.append(" lastd:" + this.lastdispatch + " dotime:" + Util.nowSecond() + " net:" + NetStatusUtil.getNetType(MMApplicationContext.getContext()));
        C47461c cVar = new C47461c();
        if (qv32 == null) {
            C86709a0.m107528h();
            qv32 = C48374j0.m53712a(Util.decodeHexString(Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(8197, (Object) null))));
        }
        if (qv33 == null) {
            C86709a0.m107528h();
            qv33 = C48374j0.m53712a(Util.decodeHexString(Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(8198, (Object) null))));
        }
        C86709a0.m107528h();
        if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(16, (Object) null)) != 0 && (qv32 == null || qv32.f140572d <= 0)) {
            cVar.getReqObj().setSceneStatus(7);
        } else if (C118000d0.f352701a.mo182756a().length <= 0) {
            cVar.getReqObj().setSceneStatus(3);
        } else {
            cVar.getReqObj().setSceneStatus(4);
        }
        C50490n33 n332 = this.f127287f;
        n332.f138368e = qv32;
        n332.f138369f = qv33;
        ((C47817n0) cVar.getReqObj()).f128381a = this.f127287f;
        C50490n33 n333 = this.f127287f;
        Log.m105925i("MicroMsg.NetSceneInit.dkInit", "doScene hash:%d time:%d count:%d user%s lan:%s status:%d cur[%s] max[%s]", Integer.valueOf(hashCode()), Long.valueOf(this.f127288g.mo72288a()), Integer.valueOf(this.f127290i), n333.f138367d, n333.f138370g, Integer.valueOf(cVar.getReqObj().getSceneStatus()), Util.encodeHexString(C48374j0.m53715d(qv32)), Util.encodeHexString(C48374j0.m53715d(qv33)));
        this.f127290i++;
        return dispatch(gVar, cVar, this);
    }

    public int securityLimitCount() {
        return 2000;
    }

    public boolean securityLimitCountReach() {
        return super.securityLimitCountReach();
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    /* renamed from: t1 */
    public final void mo72480t1(int i, int i2, int i3, String str, C50631o33 o332) {
        C47460b bVar = new C47460b(this);
        bVar.f127306f = i;
        bVar.f127302b = i3;
        bVar.f127301a = i2;
        bVar.f127303c = str;
        bVar.f127304d = o332;
        ((LinkedList) this.f127296r).add(bVar);
        if (this.f127297s.stopped()) {
            this.f127297s.startTimer(50);
        }
    }

    public boolean uniqueInNetsceneQueue() {
        return true;
    }
}
