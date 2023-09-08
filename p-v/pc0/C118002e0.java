package pc0;

import android.os.PowerManager;
import com.tencent.mars.comm.WakerLock;
import com.tencent.p014mm.autogen.events.BroadcastEvent;
import com.tencent.p014mm.autogen.events.BypNewSyncEvent;
import com.tencent.p014mm.autogen.events.FinderSyncEvent;
import com.tencent.p014mm.autogen.events.OpenIMSyncEvent;
import com.tencent.p014mm.autogen.events.SnsSyncEvent;
import com.tencent.p014mm.autogen.events.StorySyncEvent;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import f40.C86718e;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import junit.framework.Assert;
import kj2.C117407d;
import oa1.C117731d;
import ob0.C89137b0;
import pc0.C118000d0;
import qe3.C101126c1;
import qe3.C101130q0;
import sf0.C36667o0;
import sf0.C48374j0;
import te3.C101865x33;
import te3.C51018qv3;
import vf3.C37733a;

/* renamed from: pc0.e0 */
public class C118002e0 {

    /* renamed from: i */
    public static Boolean f352704i;

    /* renamed from: a */
    public final C36667o0 f352705a = new C36667o0("clicfg_sync_service_threadpool_enable");

    /* renamed from: b */
    public Queue<C118010i> f352706b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public Queue<C118010i> f352707c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public HashMap<Integer, Long> f352708d = new HashMap<>();

    /* renamed from: e */
    public C118010i f352709e = null;

    /* renamed from: f */
    public long f352710f = 0;

    /* renamed from: g */
    public WakerLock f352711g = null;

    /* renamed from: h */
    public final C118005f0 f352712h = new C118005f0(new e0$$d(this));

    /* renamed from: a */
    public static void m166422a(C118002e0 e0Var, boolean z, C101865x33 x332, C118010i iVar) {
        C101865x33 x333 = x332;
        e0Var.getClass();
        C118000d0.C118001a aVar = C118000d0.f352701a;
        byte[] a = aVar.mo182756a();
        byte[] d = C48374j0.m53715d(x333.f299848g);
        Log.m105925i("MicroMsg.SyncService", "processResp %s synckey req:%s  shouldMerge:%s", iVar, C101126c1.m132547d(a), Boolean.valueOf(z));
        Log.m105925i("MicroMsg.SyncService", "processResp %s synckey resp:%s", iVar, C101126c1.m132547d(d));
        C51018qv3 qv32 = x333.f299848g;
        if (qv32 == null || qv32.f140572d <= 0) {
            C117407d.INSTANCE.idkeyStat(99, 47, 1, false);
            return;
        }
        if (z) {
            byte[] c = C101126c1.m132546c(a, d);
            Log.m105925i("MicroMsg.SyncService", "processResp %s synckey merge:%s", iVar, C101126c1.m132547d(c));
            if (c != null && c.length > 0) {
                d = c;
            }
            x333.f299848g = C48374j0.m53712a(d);
        }
        if (!Arrays.equals(a, C48374j0.m53715d(x333.f299848g))) {
            aVar.mo182758c(C48374j0.m53715d(x333.f299848g), true);
            return;
        }
        Log.m105925i("MicroMsg.SyncService", "processResp %s  Sync Key Not change, not save", iVar);
    }

    /* renamed from: b */
    public static boolean m166423b(C118002e0 e0Var) {
        e0Var.getClass();
        boolean z = C117731d.m166007c().mo182440a(new C37733a()) == 1;
        Log.m105925i("MicroMsg.SyncService", "isOpenMMkvFlag %s", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: c */
    public final void mo182759c(C118010i iVar) {
        if (C100769w.m131943b()) {
            Log.m105921e("MicroMsg.SyncService", "tryStart dkinit never do sync before init done :%s ", iVar);
            return;
        }
        C36667o0 o0Var = this.f352705a;
        e0$$a e0__a = new e0$$a(this, iVar);
        o0Var.getClass();
        o0Var.mo60790a(e0__a, 0, true);
    }

    /* renamed from: d */
    public final void mo182760d(String str, boolean z) {
        if (!z) {
            Log.m105921e("MicroMsg.SyncService", "ASSERT now msg:%s", str);
            Assert.assertTrue(str, z);
        }
    }

    /* renamed from: e */
    public final boolean mo182761e() {
        if (C86718e.m107551r() || !C86709a0.m107522a()) {
            return false;
        }
        Boolean bool = f352704i;
        if (bool != null) {
            return bool.booleanValue();
        }
        f352704i = Boolean.TRUE;
        return true;
    }

    /* renamed from: f */
    public int mo182762f(long j, int i, String str) {
        boolean e = mo182761e();
        int i2 = 0;
        Log.m105925i("MicroMsg.SyncService", "dealWithSelectoru checkUse:%s selector:%d aiScene:%d xml:%s ", Boolean.valueOf(e), Long.valueOf(j), Integer.valueOf(i), str);
        if ((256 & j) != 0) {
            new SnsSyncEvent().publish();
        }
        if ((2097152 & j) != 0) {
            new OpenIMSyncEvent().publish();
        }
        if ((128 & j) != 0) {
            new StorySyncEvent().publish();
        }
        if ((16777216 & j) != 0) {
            new FinderSyncEvent().publish();
        }
        if ((32 & j) != 0) {
            new BypNewSyncEvent().publish();
        }
        long j2 = j & -16777217 & -33 & -257 & -2097153 & 95;
        if (j2 != 0 && C86709a0.m107522a()) {
            C86709a0.m107528h();
            if (C86709a0.m107535s().mo121142i() != null) {
                Log.m105925i("MicroMsg.SyncService", "ContinueFlag:%s", Long.valueOf(j2));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(8196, Long.valueOf(j2));
                if (!e) {
                    C118018u uVar = new C118018u(i);
                    int hashCode = uVar.hashCode();
                    Log.m105925i("MicroMsg.SyncService", "dealWithSelector syncHash: %d", Integer.valueOf(hashCode));
                    C86709a0.m107528h();
                    if (!C86709a0.m107529k().f251779b.mo123461g(uVar, 0)) {
                        Log.m105929w("MicroMsg.SyncService", "dealWithSelector doScene failed, hash: %d, zero hash will be return.", Integer.valueOf(hashCode));
                    } else {
                        i2 = hashCode;
                    }
                } else {
                    i2 = mo182767k(i, 7, false);
                }
            }
        }
        if (!Util.isNullOrNil(str)) {
            BroadcastEvent broadcastEvent = new BroadcastEvent();
            BroadcastEvent.C80706a aVar = broadcastEvent.f343529d;
            aVar.f236156a = 3;
            aVar.f236157b = str;
            broadcastEvent.publish();
        }
        return i2;
    }

    /* renamed from: g */
    public final void mo182763g(C118010i iVar) {
        Object[] objArr = new Object[1];
        objArr[0] = iVar != null ? iVar : "null";
        Log.m105925i("MicroMsg.SyncService", "doLoop %s", objArr);
        C36667o0 o0Var = this.f352705a;
        e0$$b e0__b = new e0$$b(this, iVar);
        o0Var.getClass();
        o0Var.mo60790a(e0__b, 0, true);
    }

    /* renamed from: h */
    public final boolean mo182764h() {
        try {
            return ((Boolean) PowerManager.class.getMethod("isScreenOn", new Class[0]).invoke((PowerManager) MMApplicationContext.getContext().getSystemService("power"), new Object[0])).booleanValue();
        } catch (Exception e) {
            C117407d.INSTANCE.idkeyStat(99, 45, 1, false);
            Log.m105921e("MicroMsg.SyncService", "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s", Boolean.TRUE, Util.stackTraceToString(e));
            return true;
        }
    }

    /* renamed from: i */
    public void mo182765i(C101130q0 q0Var, int i, long j) {
        boolean e = mo182761e();
        Log.m105925i("MicroMsg.SyncService", "triggerNotifyDataSync checkUse:%s resp:%s syncflag:%s recvtime:%s", Boolean.valueOf(e), q0Var, Integer.valueOf(i), Long.valueOf(j));
        if (!e) {
            C86709a0.m107528h();
            C89137b0 b0Var = C86709a0.m107529k().f251779b;
            C118018u uVar = new C118018u(8);
            uVar.f352794w = MMStack.getCaller();
            Log.m105925i(uVar.f352778d, "dkpush NOTIFYDATA resp size:%d pushSyncFlag:%d  recvTime:%d", Long.valueOf(q0Var.getBufferSize()), Integer.valueOf(i), Long.valueOf(j));
            uVar.f352785n = i;
            uVar.f352790s = j;
            uVar.f352786o = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C118017t(uVar, q0Var), false);
            if (C118018u.f352776B == 0) {
                uVar.mo182789j1();
            }
            b0Var.mo123460f(uVar);
            return;
        }
        mo182759c(new e0$$h(this, q0Var, i, j));
    }

    /* renamed from: j */
    public int mo182766j(int i) {
        boolean e = mo182761e();
        Log.m105925i("MicroMsg.SyncService", "triggerSync checkUse:%s scene:%s [%s]", Boolean.valueOf(e), Integer.valueOf(i), Util.getStack());
        if (e) {
            return mo182767k(i, 7, false);
        }
        C118018u uVar = new C118018u(i);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(uVar);
        return uVar.hashCode();
    }

    /* renamed from: k */
    public final int mo182767k(int i, int i2, boolean z) {
        e0$$g e0__g = new e0$$g(this, i, i2, z);
        mo182759c(e0__g);
        return e0__g.hashCode();
    }

    /* renamed from: l */
    public final synchronized void mo182768l() {
        WakerLock wakerLock = this.f352711g;
        if (wakerLock != null) {
            if (wakerLock.isLocking()) {
                this.f352711g.unLock();
                return;
            }
        }
        Object[] objArr = new Object[2];
        WakerLock wakerLock2 = this.f352711g;
        objArr[0] = wakerLock2 == null ? "null" : Boolean.valueOf(wakerLock2.isLocking());
        objArr[1] = Boolean.valueOf(CrashReportFactory.foreground);
        Log.m105929w("MicroMsg.SyncService", "wakeUnlock syncWakerLock locking?:%s foreground:%s", objArr);
    }

    /* renamed from: m */
    public final synchronized void mo182769m(String str) {
        boolean z = false;
        Log.m105925i("MicroMsg.SyncService", "wakelock tag:%s syncWakerLock:%s", str, this.f352711g);
        if (this.f352711g == null) {
            this.f352711g = new WakerLock(MMApplicationContext.getContext(), "MicroMsg.SyncService", (WakerLock.IAutoUnlockCallback) new e0$$c(this));
        }
        if (!this.f352711g.isLocking()) {
            z = true;
        }
        mo182760d("lock", z);
        if (!CrashReportFactory.foreground) {
            this.f352711g.lock(30000, str);
        }
    }
}
