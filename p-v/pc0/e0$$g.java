package pc0;

import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import com.tencent.p014mm.autogen.events.BypNewSyncEvent;
import com.tencent.p014mm.autogen.events.FinderSyncEvent;
import com.tencent.p014mm.autogen.events.OpenIMSyncEvent;
import com.tencent.p014mm.autogen.events.SnsSyncEvent;
import com.tencent.p014mm.autogen.events.StorySyncEvent;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.zero.C72670r;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver;
import f40.C86709a0;
import f40.C86718e;
import java.util.Queue;
import jc3.C76400h;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117747y;
import p156gj.C87200o;
import p285zh.C119114c;
import p285zh.c$$e;
import pc0.C118018u;
import qe3.C101126c1;
import qe3.C101130q0;
import qe3.C62605p0;
import qe3.C89625d;
import sf0.C48374j0;
import te3.C101865x33;
import te3.C51024qx;
import te3.C64794w33;
import te3.ie4;

public class e0$$g extends C117747y implements C1311n, C118010i {

    /* renamed from: d */
    public C11385n f352733d;

    /* renamed from: e */
    public C114799u f352734e;

    /* renamed from: f */
    public int f352735f;

    /* renamed from: g */
    public int f352736g;

    /* renamed from: h */
    public boolean f352737h;

    /* renamed from: i */
    public boolean f352738i = false;

    /* renamed from: j */
    public final /* synthetic */ C118002e0 f352739j;

    /* renamed from: pc0.e0$$g$a */
    public class C118004a implements C118009h {

        /* renamed from: a */
        public final /* synthetic */ C101865x33 f352740a;

        /* renamed from: b */
        public final /* synthetic */ int f352741b;

        public C118004a(C101865x33 x332, int i) {
            this.f352740a = x332;
            this.f352741b = i;
        }

        /* renamed from: a */
        public boolean mo182771a(int i) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(8196, Long.valueOf((long) this.f352740a.f299847f));
            int i2 = this.f352740a.f299847f;
            e0$$g e0__g = e0$$g.this;
            boolean z = (e0__g.f352736g & i2) != 0;
            Log.m105925i("MicroMsg.SyncService", "%s onFinishCmd ContinueFlag:%s canCont:%s SNSSYNCKEY:%s StorySyncKey:%s  NetSceneMinSync.this.selecto:%s", e0__g, Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(this.f352740a.f299847f & 256), Integer.valueOf(this.f352740a.f299847f & 128), Integer.valueOf(e0$$g.this.f352736g));
            if (!z) {
                C76400h hVar = C72670r.f211432d != null ? C72670r.f211432d.get() : null;
                e0$$g e0__g2 = e0$$g.this;
                if (hVar != null) {
                    hVar.mo96080a(e0__g2);
                }
            }
            if (!z && (this.f352740a.f299847f & 256) != 0) {
                SnsSyncEvent snsSyncEvent = new SnsSyncEvent();
                snsSyncEvent.f79001d.f79002a = 3;
                snsSyncEvent.publish();
            }
            if (!z && (this.f352740a.f299847f & 2097152) != 0) {
                new OpenIMSyncEvent().publish();
            }
            if (!z && (this.f352740a.f299847f & 128) != 0) {
                new StorySyncEvent().publish();
            }
            if (!z && (this.f352740a.f299847f & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0) {
                new FinderSyncEvent().publish();
            }
            if (!z && (this.f352740a.f299847f & 32) != 0) {
                new BypNewSyncEvent().publish();
            }
            if (z) {
                if (i == 0) {
                    e0$$g e0__g3 = e0$$g.this;
                    if (e0__g3.f352737h) {
                        Log.m105929w("MicroMsg.SyncService", "%s onFinishCmd is continue Sync , but no Cmd , I will not continue again.", e0__g3);
                    }
                }
                e0$$g e0__g4 = e0$$g.this;
                e0__g4.f352739j.mo182767k(e0__g4.f352735f, e0__g4.f352736g, true);
            }
            e0$$g e0__g5 = e0$$g.this;
            e0__g5.f352733d.onSceneEnd(0, 0, "", e0__g5);
            e0$$g e0__g6 = e0$$g.this;
            e0__g6.f352739j.mo182763g(e0__g6);
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcReceiveMsgEnable(), this.f352741b);
            return true;
        }
    }

    public e0$$g(C118002e0 e0Var, int i, int i2, boolean z) {
        this.f352739j = e0Var;
        this.f352735f = i;
        this.f352736g = i2;
        this.f352737h = z;
    }

    /* renamed from: G0 */
    public boolean mo72839G0(Queue<C118010i> queue) {
        Object[] objArr = new Object[5];
        objArr[0] = this;
        objArr[1] = Integer.valueOf(this.f352735f);
        objArr[2] = Integer.valueOf(this.f352736g);
        objArr[3] = Boolean.valueOf(this.f352737h);
        objArr[4] = queue == null ? "null" : Integer.valueOf(queue.size());
        Log.m105925i("MicroMsg.SyncService", "%s begin run scene:%s selector:%s isContinue:%s List:%s", objArr);
        if (queue != null) {
            C118002e0 e0Var = this.f352739j;
            e0Var.getClass();
            if (!queue.isEmpty()) {
                if (queue.size() >= 5) {
                    C117407d.INSTANCE.mo160131h(11098, 3590, "" + queue.size() + ";" + CrashReportFactory.foreground + ";" + e0Var.mo182764h());
                }
                C117407d.INSTANCE.idkeyStat(99, (long) Util.nullAsNil((Integer) C117407d.m165560t(queue.size(), new int[]{1, 2, 3, 4, 5, 10}, new Integer[]{60, 61, 62, 63, 64, 65, 66})), 1, false);
            }
            boolean z = false;
            boolean z2 = false;
            while (!queue.isEmpty()) {
                e0$$g e0__g = (e0$$g) queue.poll();
                if (e0__g == null) {
                    Log.m105921e("MicroMsg.SyncService", "NetSceneMinSync list poll value is null list.size:%d", Integer.valueOf(queue.size()));
                } else {
                    this.f352736g |= e0__g.f352736g;
                    if (e0__g.f352735f == 3) {
                        z = true;
                    } else if (e0__g.f352737h) {
                        z2 = true;
                    }
                    Log.m105925i("MicroMsg.SyncService", "%s pop:%s[%s] scene:%s selector:%s iscontinue:%s hashcont:%s hasBgfg:%s", this, Integer.valueOf(queue.size()), e0__g, Integer.valueOf(e0__g.f352735f), Integer.valueOf(e0__g.f352736g), Boolean.valueOf(e0__g.f352737h), Boolean.valueOf(z2), Boolean.valueOf(z));
                }
            }
            if (z) {
                this.f352735f = 3;
            } else if (z2) {
                this.f352735f = 6;
            }
        }
        if (C86709a0.m107522a() && !C86718e.m107551r()) {
            C86709a0.m107528h();
            if (C86709a0.m107535s() != null) {
                C86709a0.m107528h();
                if (C86709a0.m107535s().mo121142i() != null) {
                    C86709a0.m107528h();
                    long nullAs = Util.nullAs((Long) C86709a0.m107535s().mo121142i().mo119684e(8196, (Object) null), 0);
                    if (nullAs != 0) {
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119676J(8196, 0L);
                        this.f352736g = ((int) (((long) this.f352736g) | nullAs)) & 95;
                    }
                    int i = this.f352735f;
                    int i2 = i == 3 ? 1 : 0;
                    if (i == 1010) {
                        this.f352736g |= 16;
                        this.f352735f = 7;
                    } else if (i == 1011) {
                        this.f352736g |= 64;
                        this.f352735f = 7;
                    } else if (i == 3) {
                        this.f352736g |= 262144;
                        this.f352735f = 3;
                    }
                    if (this.f352737h) {
                        this.f352735f = 6;
                    }
                    C118018u.C118020b bVar = new C118018u.C118020b(false);
                    this.f352734e = bVar;
                    C64794w33 w332 = ((C62605p0) bVar.getReqObj()).f177798a;
                    w332.f186057i = i2;
                    w332.f186053e = this.f352736g;
                    w332.f186055g = this.f352735f;
                    byte[] a = C118000d0.f352701a.mo182756a();
                    w332.f186054f = C48374j0.m53712a(a);
                    w332.f186052d = new C51024qx();
                    int i3 = C89625d.f257835a;
                    w332.f186056h = C87200o.f252868a;
                    if (NetStatusUtil.isWifiFromCache(MMApplicationContext.getContext())) {
                        w332.f186058j = 1;
                    }
                    Log.m105925i("MicroMsg.SyncService", "%s continueFlag:%s SyncMsgDigest:%s Selector:%d Scene:%d device:%s", this, Long.valueOf(nullAs), Integer.valueOf(w332.f186057i), Integer.valueOf(w332.f186053e), Integer.valueOf(this.f352735f), w332.f186056h);
                    Log.m105925i("MicroMsg.SyncService", "%s Req synckey %s", this, C101126c1.m132547d(a));
                    this.f352739j.getClass();
                    C117407d dVar = C117407d.INSTANCE;
                    C117407d dVar2 = dVar;
                    dVar2.idkeyStat(99, (long) this.f352735f, 1, false);
                    dVar2.idkeyStat(99, 0, 1, false);
                    dVar.idkeyStat(99, CrashReportFactory.foreground ? 241 : 242, 1, false);
                    C86709a0.m107528h();
                    if (C86709a0.m107529k().f251779b.mo123461g(this, 0)) {
                        return true;
                    }
                    dVar.mo160131h(11098, Integer.valueOf(NetworkMonitorReceiver.MSG_DELAY_TIME), "" + this.f352735f + ";" + CrashReportFactory.foreground + ";" + this.f352739j.mo182764h());
                    Log.m105921e("MicroMsg.SyncService", "%s NetSceneQueue doScene failed. ", this);
                    dVar.idkeyStat(99, 41, 1, false);
                    return false;
                }
            }
        }
        C86709a0.m107528h();
        Log.m105921e("MicroMsg.SyncService", "%s accready:%s hold:%s accstg:%s ", this, Boolean.valueOf(C86709a0.m107522a()), Boolean.valueOf(C86718e.m107551r()), C86709a0.m107535s());
        return false;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105925i("MicroMsg.SyncService", "%s doScene", this);
        this.f352733d = nVar;
        Util.nowMilliSecond();
        int i = this.f352735f;
        int i2 = this.f352736g;
        boolean z = C119114c.f356684a;
        C119114c.m167920e("MicroMsg.NotifyPowerInspector", "netSyncMin: scene=" + i + ", selector=0x" + Integer.toBinaryString(i));
        if (MMApplicationContext.isMainProcess() && AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            String str = i + "-" + Integer.toBinaryString(i2);
            c$$e c__e = C119114c.f356691h;
            if (c__e.mo183788b() || !C119114c.f356685b) {
                c__e.mo183789c(str);
            }
        }
        return dispatch(gVar, this.f352734e, this);
    }

    public int getType() {
        return 138;
    }

    public boolean needCheckCallback() {
        return false;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        C114799u uVar2 = uVar;
        boolean z = true;
        Log.m105925i("MicroMsg.SyncService", "onGYNetEnd %s %s %s %s %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, this);
        if (uVar2 == null || uVar.getType() != 138) {
            C117407d.INSTANCE.idkeyStat(99, 44, 1, false);
            Object[] objArr = new Object[2];
            objArr[0] = this;
            objArr[1] = Integer.valueOf(uVar2 == null ? -2 : uVar.getType());
            Log.m105921e("MicroMsg.SyncService", "%s onGYNetEnd error type:%d", objArr);
        } else if (this.f352738i) {
            Log.m105921e("MicroMsg.SyncService", "%s onGYNetEnd has been callback  , give up  ", this);
        } else {
            this.f352738i = true;
            this.f352739j.mo182760d("Check rr failed.", uVar2 == this.f352734e);
            if (!(i4 == 0 && i5 == 0)) {
                Log.m105921e("MicroMsg.SyncService", "%s onGYNetEnd scene error Callback [%s,%s,%s ] rr:%s", this, Integer.valueOf(i2), Integer.valueOf(i3), str2, uVar2);
                if (i4 == 4 && i5 == -2006) {
                    Log.m105929w("MicroMsg.SyncService", "%s onGYNetEnd MM_ERR_KEYBUF_INVALID , not merge key buf", this);
                    C117407d.INSTANCE.idkeyStat(99, 42, 1, false);
                    z = false;
                } else {
                    C117407d dVar = C117407d.INSTANCE;
                    dVar.mo160131h(11098, 3501, "" + this.f352735f + ";" + i4 + ";" + i5 + ";" + CrashReportFactory.foreground + ";" + this.f352739j.mo182764h());
                    dVar.idkeyStat(99, 43, 1, false);
                    this.f352733d.onSceneEnd(i4, i5, str2, this);
                    this.f352739j.mo182763g(this);
                    return;
                }
            }
            C101865x33 x332 = ((C101130q0) uVar.getRespObj()).f296025a;
            if (C118002e0.m166423b(this.f352739j)) {
                ie4 ie4 = new ie4();
                ie4.f354052n = 0;
                ie4.f354047f = this.f352735f;
                ie4.f354046e = z;
                ie4.f354045d = x332;
                ie4.f354049h = this.f352737h;
                ie4.f354048g = this.f352736g;
                this.f352739j.f352712h.mo182781b(ie4, this);
                return;
            }
            new e0$$e(this.f352739j, this, z, x332, new C118004a(x332, C40318k.m43492a().startPerformance(C40318k.m43492a().getHcReceiveMsgEnable(), C40318k.m43492a().getHcReceiveMsgDelay(), C40318k.m43492a().getHcReceiveMsgCPU(), C40318k.m43492a().getHcReceiveMsgIO(), C40318k.m43492a().getHcReceiveMsgThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcReceiveMsgTimeout(), 201, C40318k.m43492a().getHcReceiveMsgAction(), "MicroMsg.SyncService")), (e0$$c) null);
        }
    }

    public String toString() {
        return "NetSync[" + hashCode() + "]";
    }
}
