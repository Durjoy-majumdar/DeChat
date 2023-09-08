package com.tencent.p014mm.matrix;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.matrix.strategy.MatrixStrategyNotifyBroadcast;
import com.tencent.p014mm.matrix.trigger.RemoteTrigger;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.plugin.report.service.C71001c;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import h81.C32735h;
import java.util.Iterator;
import java.util.Queue;
import lu3.C34379c;
import p1013nf.C88933a;
import p1029rf.C89940c;
import p1034se.C90173a;
import p1060we.C90970b;
import p156gj.C87203t;
import p723vf.C118672d;
import p761yd.C91441c;
import p933be.C113173i;
import p995kf.C88146a;
import qe3.C89625d;
import r70.C89888c;
import t70.C36960a;
import t70.C36963e;
import t70.C36964f;
import t70.C90378b;
import t70.C90379d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.matrix.c */
public enum C80981c implements b$$c {
    INSTANCE;
    

    /* renamed from: p */
    public static boolean f237849p;

    /* renamed from: q */
    public static boolean f237850q;

    /* renamed from: d */
    public C89888c f237852d;

    /* renamed from: e */
    public volatile boolean f237853e;

    /* renamed from: f */
    public volatile boolean f237854f;

    /* renamed from: g */
    public final MultiProcessMMKV f237855g;

    /* renamed from: h */
    public C34379c<?> f237856h;

    /* renamed from: i */
    public Runnable f237857i;

    /* renamed from: j */
    public Handler f237858j;

    /* renamed from: n */
    public C90173a f237859n;

    /* access modifiers changed from: public */
    static {
        f237849p = false;
        f237850q = false;
    }

    /* renamed from: a */
    public static void m98871a(C80981c cVar, String str, boolean z) {
        cVar.getClass();
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra(str, z);
        C80992k.m98890b(MMApplicationContext.getContext(), intent);
        MMApplicationContext.getContext().sendBroadcast(intent, MatrixStrategyNotifyBroadcast.f237879a);
    }

    /* renamed from: b */
    public static void m98872b() {
        Class cls = C32735h.class;
        MultiProcessMMKV.getDefault().encode("clicfg_normal_report", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_normal_report, false));
        MultiProcessMMKV.getDefault().encode("clicfg_report_dropframe", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_report_dropframe, true));
        MultiProcessMMKV.getDefault().encode("clicfg_report_frame", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_report_frame, false));
        MultiProcessMMKV.getDefault().encode("clicfg_detect_syncbarrier_leak", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_detect_syncbarrier_leak, false));
        MultiProcessMMKV.getDefault().encode("clicfg_matrix_base_swtich", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_matrix_base_swtich, false));
        MultiProcessMMKV.getDefault().encode("clicfg_matrix_traceplugin_switch", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_matrix_traceplugin_switch, true));
        MultiProcessMMKV.getDefault().encode("clicfg_matrix_trace_evil_method_switch", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_matrix_trace_evil_method_switch, false));
        MultiProcessMMKV.getDefault().encode("clicfg_matrix_io_switch", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_matrix_io_switch, false));
        MultiProcessMMKV.getDefault().encode("clicfg_matrix_new_frame_tracer_switch", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_matrix_new_frame_tracer_switch, false));
        MultiProcessMMKV.getDefault().encode("clicfg_matrix_startup_tracer_switch", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_matrix_startup_tracer_switch, false));
        MultiProcessMMKV.getDefault().encode("clicfg_matrix_trace_looper_printer_switch", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_matrix_trace_looper_printer_switch, true));
        String str = Build.BRAND;
        boolean z = (!str.toLowerCase().contains("lenovo") || !C87203t.m108275k().toLowerCase().contains("tb")) && !str.toLowerCase().contains("royole");
        Log.m105924i("MatrixDelegate", "cameraCacheDevice = " + z);
        MultiProcessMMKV.getDefault().encode("clicfg_camera_util_use_cache_new", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_camera_util_use_cache_new, true) && z);
        MultiProcessMMKV.getDefault().encode("clicfg_voip_camera_info_use_cache_new", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_voip_camera_info_use_cache_new, true) && z);
        MultiProcessMMKV.getDefault().encode("clicfg_network_cache_wifi", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_network_cache_wifi, true));
        MultiProcessMMKV.getDefault().encode("clicfg_network_cache_wap", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_network_cache_wap, true));
        MultiProcessMMKV.getDefault().encode("clicfg_get_active_network_cache", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_get_active_network_cache, true));
        MultiProcessMMKV.getDefault().encode("clicfg_record_history_msg", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_record_history_msg, false));
        MultiProcessMMKV.getDefault().encode("clicfg_touch_event_tracer", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_touch_event_tracer, false));
        MultiProcessMMKV.getDefault().encode("clicfg_idle_handler_tracer", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_idle_handler_tracer, false));
        MultiProcessMMKV.getDefault().encode("clicfg_pthread_key_seq", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_pthread_key_seq, false));
        MultiProcessMMKV.getDefault().encode("clicfg_matrix_settings_entrance", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_matrix_settings_entrance, false));
        MultiProcessMMKV.getDefault().encode("clicfg_log_monitor_short_time_count", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_log_monitor_short_time_count, false));
        MultiProcessMMKV.getDefault().encode("clicfg_log_monitor_long_time_count", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_log_monitor_long_time_count, false));
        MultiProcessMMKV.getDefault().encode("clicfg_log_monitor_long_long_time_count", ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_log_monitor_long_long_time_count, false));
    }

    /* renamed from: c */
    public static boolean m98873c() {
        boolean z = BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED;
        Log.m105925i("MatrixDelegate", "[debugEnableEvilMethod] ret=%s", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: e */
    public void mo112799e(Queue<C88933a.C88937d> queue) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (C88933a.C88937d append : queue) {
            i++;
            sb.append(append);
            sb.append("\n");
            if (i % 10 == 0) {
                Log.m105924i("MatrixDelegate", "DumpDenseMsg, info = \n" + sb.toString());
                sb = new StringBuilder();
            }
        }
        Log.m105924i("MatrixDelegate", "DumpDenseMsg, info.end = " + sb.toString());
    }

    /* renamed from: f */
    public final void mo112800f(boolean z) {
        if (!this.f237853e) {
            Log.m105928w("MatrixDelegate", "[onAppForeground] but matrix is never initialized, delay to notify!");
            this.f237854f = true;
            return;
        }
        Iterator<C90970b> it = C91441c.m114730d().f262167a.iterator();
        while (it.hasNext()) {
            C90970b next = it.next();
            if (!(next instanceof C88146a) && !(next instanceof C113173i)) {
                next.mo112097a(z);
            }
        }
        if (!z || !f237850q) {
            C34379c<?> cVar = this.f237856h;
            if (cVar != null && !cVar.isCancelled()) {
                this.f237856h.cancel(true);
                this.f237856h = null;
            }
        } else if (this.f237856h == null) {
            this.f237856h = ((C119157j) C119157j.f356862d).mo183872c(new C80986f(this), 100, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }

    /* renamed from: g */
    public void mo112801g(C91441c cVar) {
        C89940c cVar2;
        C89940c cVar3;
        Log.m105924i("MatrixDelegate", "onFinalJob");
        int i = mo112802h() ? this.f237855g.getInt("ENABLE_FPS_FLOAT", 0) : 0;
        Object[] objArr = new Object[2];
        boolean z = true;
        objArr[0] = Boolean.valueOf(i == 1);
        objArr[1] = Integer.valueOf(i);
        Log.m105925i("MatrixDelegate", "[isEnableFpsFloat] enable=%s, value=%s", objArr);
        if ((i == 1) && C80992k.m98889a()) {
            MMHandlerThread.postToMainThread(new c$$b(this));
        }
        ((C119157j) C119157j.f356862d).mo183876g(new c$$c(this), "Matrix-Save-AccInfo");
        this.f237853e = true;
        if (this.f237854f) {
            mo112800f(AppForegroundDelegate.INSTANCE.f343454n);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            C71001c.C71003b bVar = C71001c.C71003b.f205479b;
            if (((BuildInfo.DEBUG || C89625d.f257845k) || MultiProcessMMKV.getDefault().decodeBool("clicfg_report_frame", false)) && (cVar3 = C71001c.f205476a) != null) {
                cVar3.mo124268n(C71001c.C71003b.f205479b);
                C71001c.C71003b.f205480c = true;
            }
            C71001c.C71002a aVar = C71001c.C71002a.f205477b;
            if (!(BuildInfo.DEBUG || C89625d.f257845k) && !MultiProcessMMKV.getDefault().decodeBool("clicfg_report_dropframe", false)) {
                z = false;
            }
            if (z && (cVar2 = C71001c.f205476a) != null) {
                cVar2.f258453i = C71001c.C71002a.f205477b;
                cVar2.f258454j = 9;
            }
        } else {
            Log.m105925i("MatrixDelegate", "FrameTracer require SDK_INT>=24, current is %d", Integer.valueOf(i2));
        }
        C36963e.f98036a = C90378b.f259390d;
        C36963e.f98038c = C90379d.f259391d;
        C36963e.f98039d = C36960a.f98035d;
        C36963e.f98040e = C36964f.f98041d;
        try {
            if (!ProcessSupervisor.f235421k.mo111977d()) {
                RemoteTrigger remoteTrigger = RemoteTrigger.f79440d;
                remoteTrigger.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.tencent.mm.RemoteTrigger");
                MMApplicationContext.getContext().registerReceiver(remoteTrigger, intentFilter, ConstantsAPI.WXApp.WXAPP_BROADCAST_PERMISSION, (Handler) null);
            }
        } catch (Throwable th) {
            C118672d.m167354d("MatrixDelegate", th, "", new Object[0]);
        }
    }

    /* renamed from: h */
    public boolean mo112802h() {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isCoolassistEnv()) {
            return true;
        }
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
            return true;
        }
        return MultiProcessMMKV.getDefault().decodeBool("clicfg_matrix_settings_entrance", false);
    }

    /* renamed from: i */
    public String mo112803i(C88933a.C88937d dVar) {
        String str;
        String dVar2 = dVar.toString();
        String str2 = "";
        if (dVar2.contains("(")) {
            str2 = dVar2.substring(dVar2.indexOf("(") + 1, dVar2.indexOf(")"));
            String substring = dVar2.substring(dVar2.indexOf("}") + 2);
            str = (substring.equals("null") || !dVar2.contains("@")) ? substring : dVar2.substring(dVar2.indexOf("}") + 2, dVar2.lastIndexOf("@"));
        } else {
            str = str2;
        }
        return str2 + " : " + str;
    }
}
