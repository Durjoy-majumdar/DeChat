package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.u */
public class C83483u implements AppLaunchPrepareProcess$$e {

    /* renamed from: d */
    public final /* synthetic */ C1256g f243928d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandPrepareTask.PrepareParams f243929e;

    /* renamed from: f */
    public final /* synthetic */ String f243930f;

    /* renamed from: g */
    public final /* synthetic */ AppBrandPrepareTask.C83252b f243931g;

    public C83483u(AppBrandPrepareTask.C83252b bVar, C1256g gVar, AppBrandPrepareTask.PrepareParams prepareParams, String str) {
        this.f243931g = bVar;
        this.f243928d = gVar;
        this.f243929e = prepareParams;
        this.f243930f = str;
    }

    /* renamed from: J */
    public void mo115778J() {
        Log.m105925i("MicroMsg.AppBrandPrepareTask", "notifyAppRestartOnLaunchRequestedLatestVersion, username[%s] appId[%s]", this.f243930f, this.f243929e.f243170i);
        AppBrandPrepareTask.C83252b bVar = this.f243931g;
        C1256g gVar = this.f243928d;
        AppBrandPrepareTask.C83254d dVar = AppBrandPrepareTask.C83254d.EVENT_NOTIFY_APP_RESTART_ON_LAUNCH_REQUESTED;
        bVar.getClass();
        AppBrandPrepareTask.PrepareResult prepareResult = new AppBrandPrepareTask.PrepareResult();
        prepareResult.f243185d = dVar;
        gVar.mo894a(prepareResult);
    }

    /* renamed from: K */
    public void mo113179K(int i) {
        AppBrandPrepareTask.PrepareResult prepareResult = new AppBrandPrepareTask.PrepareResult();
        prepareResult.f243185d = AppBrandPrepareTask.C83254d.EVENT_DATA_TRANSFER_STATS;
        prepareResult.f243191j = i;
        this.f243928d.mo894a(prepareResult);
    }

    /* renamed from: a */
    public void mo115779a(String str) {
        Log.m105925i("MicroMsg.AppBrandPrepareTask", "notifyStartOtherAppOnMigrateRequested, username[%s] appId[%s] targetAppId[%s]", this.f243930f, this.f243929e.f243170i, str);
        AppBrandPrepareTask.PrepareResult prepareResult = new AppBrandPrepareTask.PrepareResult();
        prepareResult.f243185d = AppBrandPrepareTask.C83254d.EVENT_NOTIFY_START_MIGRATE_TARGET_APP;
        prepareResult.f243192n = str;
        this.f243928d.mo894a(prepareResult);
    }

    /* renamed from: b */
    public void mo115780b() {
        Log.m105925i("MicroMsg.AppBrandPrepareTask", "onFallbackBackupWxaAttrsRequested, username[%s] appId[%s]", this.f243930f, this.f243929e.f243170i);
        AppBrandPrepareTask.PrepareResult prepareResult = new AppBrandPrepareTask.PrepareResult();
        prepareResult.f243185d = AppBrandPrepareTask.C83254d.EVENT_ON_LAUNCH_TIMEOUT_FALLBACK_BACKUP_WXAATTRS_RELOAD_REQUESTED;
        this.f243928d.mo894a(prepareResult);
    }
}
