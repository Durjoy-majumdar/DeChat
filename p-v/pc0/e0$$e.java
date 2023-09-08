package pc0;

import com.tencent.p014mm.plugin.zero.C72670r;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import eb0.C31543z5;
import f40.C86709a0;
import f40.C86718e;
import java.util.LinkedList;
import kj2.C117407d;
import p285zh.C119114c;
import sf0.C36667o0;
import te3.C101865x33;
import te3.C50886px;
import te3.C51024qx;

public class e0$$e {

    /* renamed from: a */
    public int f352723a = 0;

    /* renamed from: b */
    public boolean f352724b = false;

    /* renamed from: c */
    public C101865x33 f352725c = null;

    /* renamed from: d */
    public C118009h f352726d = null;

    /* renamed from: e */
    public C118010i f352727e;

    /* renamed from: f */
    public MTimerHandler f352728f = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new e0$$e$$a(this), true);

    /* renamed from: g */
    public final /* synthetic */ C118002e0 f352729g;

    public e0$$e(C118002e0 e0Var, C118010i iVar, boolean z, C101865x33 x332, C118009h hVar, e0$$c e0__c) {
        LinkedList<C50886px> linkedList;
        LinkedList<C50886px> linkedList2;
        C118002e0 e0Var2 = e0Var;
        C118010i iVar2 = iVar;
        boolean z2 = z;
        C101865x33 x333 = x332;
        C118009h hVar2 = hVar;
        this.f352729g = e0Var2;
        this.f352726d = hVar2;
        this.f352727e = iVar2;
        this.f352724b = z2;
        this.f352725c = x333;
        this.f352723a = 0;
        e0Var2.mo182760d("", (hVar2 == null || iVar2 == null) ? false : true);
        if (this.f352725c == null) {
            e0Var2.mo182760d("resp Not null", false);
            Log.m105929w("MicroMsg.SyncService", "CmdProcHandler %s NewSyncResponse is null", this.f352727e);
            this.f352726d.mo182771a(0);
            return;
        }
        if (C86709a0.m107522a() && !C86718e.m107551r()) {
            C86709a0.m107528h();
            if (C86709a0.m107535s() != null) {
                C86709a0.m107528h();
                if (C86709a0.m107535s().mo121142i() != null) {
                    C51024qx qxVar = x333.f299846e;
                    int size = (qxVar == null || (linkedList2 = qxVar.f140594e) == null || linkedList2.size() <= 0) ? 0 : x333.f299846e.f140594e.size();
                    int nullAsNil = Util.nullAsNil((Integer) C117407d.m165560t(size, new int[]{0, 1, 2, 3, 5, 10}, new Integer[]{249, Integer.valueOf(WXWebReporter.KEY_TRY_FIX_DEX_FAILED), 247, Integer.valueOf(WXWebReporter.KEY_NEW_FAILED_CANT_FIX), Integer.valueOf(WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES), 244, 243}));
                    C117407d dVar = C117407d.INSTANCE;
                    dVar.idkeyStat(99, (long) nullAsNil, 1, false);
                    if (!e0Var.mo182764h()) {
                        dVar.idkeyStat(99, size > 0 ? 221 : 218, 1, false);
                    } else if (!CrashReportFactory.foreground) {
                        dVar.idkeyStat(99, size > 0 ? 220 : 217, 1, false);
                    } else {
                        dVar.idkeyStat(99, size > 0 ? 219 : 216, 1, false);
                    }
                    long j = (long) x333.f299851j;
                    j = String.valueOf(j).length() == 10 ? j * 1000 : j;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j2 = currentTimeMillis - j;
                    Log.m105925i("MicroMsg.SyncService", "[oneliang] client time is:%s,server time is:%s,diff time is:%s, diff second time is:%s,just save millisecond diff time", Long.valueOf(currentTimeMillis), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j2 / 1000));
                    C31543z5.m39456f(j);
                    C86709a0.m107528h();
                    C86718e b = C86709a0.m107523b();
                    C101865x33 x334 = this.f352725c;
                    b.mo121105D(x334.f299849h, x334.f299850i);
                    C86709a0.m107528h();
                    C86709a0.m107523b();
                    C86718e.m107545A(this.f352725c.f299849h);
                    C51024qx qxVar2 = this.f352725c.f299846e;
                    if (qxVar2 == null || (linkedList = qxVar2.f140594e) == null || linkedList.size() <= 0) {
                        Log.m105929w("MicroMsg.SyncService", "CmdProcHandler %s cmdlist is null.  synckey may be changed, I have to merge it.", this.f352727e);
                        C118002e0.m166422a(e0Var2, z2, this.f352725c, this.f352727e);
                        this.f352726d.mo182771a(0);
                        return;
                    }
                    Log.m105925i("MicroMsg.SyncService", "CmdProcHandler %s Start docmd:%s respStatus:%s respOnlineVer:%s", this.f352727e, Integer.valueOf(this.f352725c.f299846e.f140594e.size()), Integer.valueOf(this.f352725c.f299849h), Integer.valueOf(this.f352725c.f299850i));
                    if (C36667o0.f97456b.mo60791a(e0Var2.f352705a.f97457a)) {
                        mo182776a(false);
                        return;
                    } else {
                        this.f352728f.startTimer(50);
                        return;
                    }
                }
            }
        }
        C86709a0.m107528h();
        Log.m105921e("MicroMsg.SyncService", "CmdProcHandler %s accready:%s hold:%s accstg:%s ", this.f352727e, Boolean.valueOf(C86709a0.m107522a()), Boolean.valueOf(C86718e.m107551r()), C86709a0.m107535s());
        this.f352726d.mo182771a(0);
    }

    /* renamed from: a */
    public boolean mo182776a(boolean z) {
        if (C86709a0.m107522a() && !C86718e.m107551r()) {
            C86709a0.m107528h();
            if (C86709a0.m107535s() != null) {
                C86709a0.m107528h();
                if (C86709a0.m107535s().mo121142i() != null) {
                    LinkedList<C50886px> linkedList = this.f352725c.f299846e.f140594e;
                    C72670r rVar = new C72670r();
                    rVar.mo100128b(this.f352727e);
                    long nowMilliSecond = Util.nowMilliSecond();
                    while (this.f352723a < linkedList.size()) {
                        Util.nowMilliSecond();
                        C50886px pxVar = linkedList.get(this.f352723a);
                        C119114c.m167924i("CmdProcHandler", pxVar);
                        if (!rVar.mo100129c(this.f352727e, this.f352723a, linkedList.size(), pxVar, false)) {
                            C117407d.INSTANCE.idkeyStat(99, 46, 1, false);
                        }
                        this.f352723a++;
                        long milliSecondsToNow = Util.milliSecondsToNow(nowMilliSecond);
                        Log.m105925i("MicroMsg.SyncService", "processResp %s time:%s size:%s index:%s", this.f352727e, Long.valueOf(milliSecondsToNow), Integer.valueOf(linkedList.size()), Integer.valueOf(this.f352723a - 1));
                        if (z && milliSecondsToNow >= 500) {
                            break;
                        }
                    }
                    rVar.mo100127a(this.f352727e);
                    if (this.f352723a < linkedList.size()) {
                        Log.m105925i("MicroMsg.SyncService", "processResp %s time:%s size:%s index:%s Shold Continue.", this.f352727e, Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), Integer.valueOf(linkedList.size()), Integer.valueOf(this.f352723a - 1));
                        return true;
                    }
                    C118002e0.m166422a(this.f352729g, this.f352724b, this.f352725c, this.f352727e);
                    this.f352726d.mo182771a(linkedList.size());
                    return false;
                }
            }
        }
        C86709a0.m107528h();
        Log.m105921e("MicroMsg.SyncService", "processResp %s accready:%s hold:%s accstg:%s ", this.f352727e, Boolean.valueOf(C86709a0.m107522a()), Boolean.valueOf(C86718e.m107551r()), C86709a0.m107535s());
        this.f352726d.mo182771a(0);
        return false;
    }
}
