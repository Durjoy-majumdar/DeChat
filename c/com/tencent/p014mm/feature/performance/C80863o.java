package com.tencent.p014mm.feature.performance;

import android.content.Intent;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.p014mm.matrix.test.PushKillerTest;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.plugin.performance.watchdogs.C85325b;
import com.tencent.p014mm.plugin.performance.watchdogs.C85331g;
import com.tencent.p014mm.plugin.performance.watchdogs.C85335i;
import com.tencent.p014mm.plugin.performance.watchdogs.C85341m;
import com.tencent.p014mm.plugin.performance.watchdogs.C85342n;
import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.xweb.file.XVFSFile;
import di3.C86301e;
import ei3.C86522b;
import hm3.C32955c;
import hm3.C32961g;
import hm3.C32963h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p1046ue.C90650d;
import p1046ue.C90652e;
import p1053ve.C90767a;
import p1053ve.C90771e;
import p661qj.C35907f;
import p757xv.C38850q;
import p933be.C79691a;
import q70.C89489b0;
import q70.C89496f;
import q70.C89508g0;
import q70.C89524p0;
import zt3.C119157j;
import zt3.C119179t;

@C86522b
/* renamed from: com.tencent.mm.feature.performance.o */
public class C80863o extends C86301e implements C38850q {
    /* renamed from: BV */
    public void mo61792BV(Intent intent) {
        List<C85342n.C85345c> d = C85342n.m105366d();
        int i = 0;
        for (C85342n.C85345c a : C85342n.m105364b()) {
            i += a.mo118631a();
        }
        Log.m105921e("MicroMsg.ThreadWatchDog", "threads:[%s:%s][%s]", Integer.valueOf(i), Integer.valueOf(C85342n.m105365c()), d.toString());
    }

    /* renamed from: Ge */
    public void mo61793Ge(Intent intent) {
        C85325b.f248606p.run();
    }

    /* renamed from: KC */
    public void mo61794KC(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            long currentTimeMillis = System.currentTimeMillis();
            Runtime.getRuntime().gc();
            String stringExtra = intent.getStringExtra("process_suffix");
            if (Util.isNullOrNil(stringExtra)) {
                if (!MMApplicationContext.isMMProcess()) {
                    return;
                }
            } else if (!stringExtra.startsWith(XVFSFile.PATH_SEPARATOR)) {
                Log.m105921e("MicroMsg.MatrixShellService", "bad process suffix: %s", stringExtra);
                return;
            } else if (!MMApplicationContext.getProcessName().endsWith(stringExtra)) {
                return;
            }
            ((C119157j) C119157j.f356862d).mo183870a(new o$$c(currentTimeMillis));
            return;
        }
        Log.m105920e("MicroMsg.MatrixShellService", "not coolassist or monkey env, disable hprof dump cmd.");
    }

    /* renamed from: KP */
    public void mo61795KP(Intent intent) {
        ArrayList arrayList = new ArrayList();
        C90650d.C90651a aVar = C90650d.C90651a.BUFFER;
        C90650d dVar = r1;
        C90650d dVar2 = new C90650d(aVar, 0, "1234", 12356890, 1234, 1234, C90771e.m113833a(0), 0, C90767a.m113829b("activityInfo"), new AtomicInteger(1));
        arrayList.add(dVar);
        C90650d.C90651a aVar2 = aVar;
        arrayList.add(new C90650d(aVar2, 1, "1234", 12356890, 1234, 1234, C90771e.m113833a(0), 0, C90767a.m113829b("activityInfo"), new AtomicInteger(1)));
        arrayList.add(new C90650d(aVar2, 2, "1234", 12356890, 1234, 1234, C90771e.m113833a(0), 0, C90767a.m113829b("activityInfo"), new AtomicInteger(1)));
        arrayList.add(new C90650d(aVar2, 3, "1234", 12356890, 1234, 1234, C90771e.m113833a(0), 0, C90767a.m113829b("activityInfo"), new AtomicInteger(1)));
        arrayList.add(new C90650d(aVar2, 4, "1234", 12356890, 1234, 1234, C90771e.m113833a(0), 0, C90767a.m113829b("activityInfo"), new AtomicInteger(1)));
        arrayList.add(new C90650d(aVar2, 5, "1234", 12356890, 1234, 1234, C90771e.m113833a(0), 0, C90767a.m113829b("activityInfo"), new AtomicInteger(1)));
        arrayList.add(new C90650d(aVar2, 6, "1234", 12356890, 1234, 1234, C90771e.m113833a(0), 0, C90767a.m113829b("activityInfo"), new AtomicInteger(1)));
        arrayList.add(new C90650d(aVar2, 7, "1234", 12356890, 1234, 1234, C90771e.m113833a(0), 0, C90767a.m113829b("activityInfo"), new AtomicInteger(1)));
        new C32961g().mo58891e(arrayList);
        C90650d dVar3 = new C90650d(aVar2, 8, "1234", 12356890, 1234, 1234, C90771e.m113833a(0), 0, C90767a.m113829b("activityInfo"), new AtomicInteger(1));
        C90652e.f260459f.mo124796d(dVar3);
        arrayList.add(dVar3);
        new C32961g().mo58891e(arrayList);
        C119179t tVar = C119157j.f356862d;
        C32955c cVar = C32955c.f89546d;
        Objects.requireNonNull(cVar);
        ((C119157j) tVar).mo183884o(new o$$a(cVar));
    }

    /* renamed from: LD */
    public void mo61796LD(Intent intent) {
        PushKillerTest.f237880a.getClass();
        MMApplicationContext.getContext().sendBroadcast(new Intent("com.tencent.matrix.kill.lru"), ConstantsAPI.WXApp.WXAPP_BROADCAST_PERMISSION);
    }

    public void Pm0(Intent intent) {
        C89508g0 g0Var = C89508g0.f257593a;
        Log.m105918d("MicroMsg.monitor.ProcBackgroundMemory", "test report");
        ((C119157j) C119157j.f356862d).mo183884o(C89524p0.f257622d);
        C89496f fVar = C89496f.f257573a;
        Log.m105918d("MicroMsg.monitor.AppBackgroundMemory", "test report");
        ((C119157j) C119157j.f356862d).mo183884o(C89489b0.f257562d);
    }

    /* renamed from: RY */
    public void mo61798RY() {
        int i = C35907f.f95798a;
    }

    /* renamed from: WO */
    public void mo61799WO(Intent intent) {
        MultiProcessMMKV.getMMKV("diagnostic_storage").encode("KEY_ENABLE_HOOK_TOAST", false);
    }

    public void Y70(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            String stringExtra = intent.getStringExtra("process_suffix");
            if (Util.isNullOrNil(stringExtra)) {
                if (!MMApplicationContext.isMainProcess()) {
                    return;
                }
            } else if (!stringExtra.startsWith(XVFSFile.PATH_SEPARATOR)) {
                Log.m105921e("MicroMsg.MatrixShellService", "bad process suffix: %s", stringExtra);
                return;
            } else if (!MMApplicationContext.getProcessName().endsWith(stringExtra)) {
                return;
            }
            ((C119157j) C119157j.f356862d).mo183884o(new o$$d());
            return;
        }
        Log.m105920e("MicroMsg.MatrixShellService", "not coolassist or monkey env");
    }

    public void a70(Intent intent) {
        Log.m105924i("MicroMsg.MemoryLimitPublisher", "set mute");
        C85331g gVar = C85331g.f248653a;
        C85331g.f248654b = true;
    }

    public void kn0(Intent intent) {
        Log.m105919d("MicroMsg.ProcessWatchDog", "DumpProcesses: %s", Arrays.toString(((ArrayList) C85341m.f248689g.mo118627a()).toArray()));
    }

    public void mi0(Intent intent) {
        C32963h.f89563d.f89542a = true;
        C32961g.f89559h = true;
        C32955c.f89546d.f89542a = true;
    }

    /* renamed from: rW */
    public void mo61804rW(Intent intent) {
        MemoryWatchDog.f248575A.mo118578d(true);
    }

    public void uu0(Intent intent) {
        C79691a.m96805b(JiffiesMonitorFeature.class, new o$$b(intent));
    }

    /* renamed from: w9 */
    public void mo61806w9(Intent intent) {
        long longExtra = intent.getLongExtra("memory", 419430400);
        C85331g gVar = C85331g.f248653a;
        ((C119157j) C119157j.f356862d).mo183875f(new C85335i(longExtra));
    }
}
