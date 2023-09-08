package com.tencent.p014mm.sandbox.updater;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sandbox.monitor.C85702g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.service.MMService;
import di3.C86312j;
import h81.C32735h;
import java.util.HashMap;
import java.util.Map;
import p918s2.C90116e;
import rg3.C36325c;
import tg3.C90461a0;
import tg3.C90466b0;
import tg3.C90481o;

/* renamed from: com.tencent.mm.sandbox.updater.UpdaterService */
public class UpdaterService extends MMService {

    /* renamed from: p */
    public static UpdaterService f249763p = null;

    /* renamed from: q */
    public static long f249764q = 1800000;

    /* renamed from: i */
    public Map<Integer, C90481o> f249765i = new HashMap();

    /* renamed from: j */
    public boolean f249766j = false;

    /* renamed from: n */
    public MTimerHandler f249767n = new MTimerHandler(new C85718a(), true);

    /* renamed from: o */
    public C85720c f249768o = null;

    /* renamed from: com.tencent.mm.sandbox.updater.UpdaterService$a */
    public class C85718a implements MTimerHandler.CallBack {
        public C85718a() {
        }

        public boolean onTimerExpired() {
            return !UpdaterService.this.mo119329j();
        }
    }

    /* renamed from: com.tencent.mm.sandbox.updater.UpdaterService$b */
    public class C85719b implements Runnable {
        public C85719b() {
        }

        public void run() {
            boolean z;
            if (((HashMap) UpdaterService.this.f249765i).size() > 0) {
                for (C90481o isBusy : ((HashMap) UpdaterService.this.f249765i).values()) {
                    if (isBusy.isBusy()) {
                        Log.m105924i("MicroMsg.XWeb.MM.UpdaterService", "checkAndTryStopSelf2, dont stop, some download mgr still busy");
                        return;
                    }
                }
            }
            C85702g.C85704b bVar = C85702g.f249718a;
            Log.m105924i("MicroMsg.ExceptionMonitor", "isCrashWorking process:" + MMApplicationContext.getProcessName());
            if (MMApplicationContext.isSandBoxProcess()) {
                Log.m105924i("MicroMsg.ExceptionMonitor", "isCrashWorking :" + C85702g.f249721d);
                z = C85702g.f249721d;
            } else {
                z = false;
            }
            if (!z) {
                UpdaterService.this.stopSelf();
            } else {
                Log.m105924i("TBSDownloadMgr", "is still busy");
            }
        }
    }

    /* renamed from: com.tencent.mm.sandbox.updater.UpdaterService$c */
    public static final class C85720c extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            UpdaterService updaterService = UpdaterService.f249763p;
            if (updaterService != null) {
                boolean isWifi = NetStatusUtil.isWifi(context);
                if (((HashMap) updaterService.f249765i).size() > 0) {
                    for (C90481o h : ((HashMap) updaterService.f249765i).values()) {
                        h.mo124628h(isWifi);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public String mo63928b() {
        return "MicroMsg.XWeb.MM.UpdaterService";
    }

    /* renamed from: c */
    public IBinder mo93614c(Intent intent) {
        return null;
    }

    /* renamed from: d */
    public void mo112546d() {
        super.mo112546d();
        Log.m105924i("MicroMsg.XWeb.MM.UpdaterService", "onCreate");
        C36325c.m40947a(hashCode(), this);
        f249763p = this;
        ((HashMap) this.f249765i).put(0, C90461a0.C90464c.f260018a);
        Map<Integer, C90481o> map = this.f249765i;
        C90466b0 b0Var = C90466b0.C90468b.f260021a;
        ((HashMap) map).put(4, b0Var);
        ((HashMap) this.f249765i).put(5, b0Var);
        ((HashMap) this.f249765i).put(6, b0Var);
        MMActivity.initLanguage(MMApplicationContext.getContext());
        this.f249767n.startTimer(f249764q);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        C85720c cVar = new C85720c();
        this.f249768o = cVar;
        this.f249814f.registerReceiver(cVar, intentFilter);
    }

    /* renamed from: e */
    public void mo112547e() {
        Log.m105924i("MicroMsg.XWeb.MM.UpdaterService", "onDestroy");
        this.f249767n.stopTimer();
        C85720c cVar = this.f249768o;
        if (cVar != null) {
            try {
                this.f249814f.unregisterReceiver(cVar);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.XWeb.MM.UpdaterService", "unregisterReceiver(UpdaterService.ConnectivityReceiver) exception = %s", e.getMessage());
            }
        }
        if (this.f249766j) {
            this.f249814f.stopForeground(true);
        }
        for (C90481o onDestroy : ((HashMap) this.f249765i).values()) {
            onDestroy.onDestroy();
        }
        ((HashMap) this.f249765i).clear();
        f249763p = null;
        C36325c.m40948b(hashCode(), this);
        super.mo112547e();
    }

    /* renamed from: f */
    public void mo112549f(Intent intent, int i) {
        Log.m105925i("MicroMsg.XWeb.MM.UpdaterService", "onStart intent = %s", intent);
        mo119330k(intent);
    }

    /* renamed from: g */
    public int mo93615g(Intent intent, int i, int i2) {
        Log.m105925i("MicroMsg.XWeb.MM.UpdaterService", "onStartCommand intent = %s", intent);
        if (intent != null && intent.getBooleanExtra("intent_extra_run_in_foreground", false)) {
            Log.m105924i("MicroMsg.XWeb.MM.UpdaterService", "runServiceInForground");
            PendingIntent service = PendingIntent.getService(MMApplicationContext.getContext(), 0, new Intent(), 0);
            C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
            cVar.mo124390o("updater service running forground");
            cVar.f258814z.when = System.currentTimeMillis();
            cVar.mo124383h("Updater Service");
            cVar.mo124382g("updater service running forground");
            cVar.f258795g = service;
            this.f249814f.startForeground(0, cVar.mo124378b());
            this.f249766j = true;
        }
        mo119330k(intent);
        return 2;
    }

    /* renamed from: j */
    public final boolean mo119329j() {
        if (((HashMap) this.f249765i).size() > 0) {
            for (C90481o isBusy : ((HashMap) this.f249765i).values()) {
                if (isBusy.isBusy()) {
                    Log.m105924i("MicroMsg.XWeb.MM.UpdaterService", "checkAndTryStopSelf, dont stop, some download mgr still busy");
                    return false;
                }
            }
        }
        Log.m105924i("MicroMsg.XWeb.MM.UpdaterService", "checkAndTryStopSelf, UpdaterService killed self");
        MMHandlerThread.postToMainThreadDelayed(new C85719b(), 10000);
        return true;
    }

    /* renamed from: k */
    public final void mo119330k(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("intent_extra_download_type", 0);
            Log.m105925i("MicroMsg.XWeb.MM.UpdaterService", "handleCommand, downloadType = %d", Integer.valueOf(intExtra));
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sandbox_pss_opt, 0) == 1) {
                if (intExtra == 1 || intExtra == 4) {
                    f249764q = 300000;
                } else {
                    f249764q = 1800000;
                }
            }
            this.f249767n.stopTimer();
            this.f249767n.startTimer(f249764q);
            f249764q = 1800000;
            C90481o oVar = (C90481o) ((HashMap) this.f249765i).get(Integer.valueOf(intExtra));
            if (oVar != null) {
                boolean d = oVar.mo124627d(intent);
                Log.m105925i("MicroMsg.XWeb.MM.UpdaterService", "handleCommand ret = %b", Boolean.valueOf(d));
                if (!d) {
                    mo119329j();
                }
            }
        }
    }
}
