package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.b */
public final class C84832b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AndroidWxaCommLibV8SnapshotService f247293d;

    public C84832b(AndroidWxaCommLibV8SnapshotService androidWxaCommLibV8SnapshotService) {
        this.f247293d = androidWxaCommLibV8SnapshotService;
    }

    public final void run() {
        AndroidWxaCommLibV8SnapshotService androidWxaCommLibV8SnapshotService = this.f247293d;
        int i = AndroidWxaCommLibV8SnapshotService.f247245e;
        androidWxaCommLibV8SnapshotService.getClass();
        Log.m105924i("MicroMsg.AndroidWxaCommLibV8SnapshotService", "exitIfCan");
        if (androidWxaCommLibV8SnapshotService.f247246d.isEmpty()) {
            Log.m105924i("MicroMsg.AndroidWxaCommLibV8SnapshotService", "exitIfCan, do exit");
            androidWxaCommLibV8SnapshotService.stopSelf();
        }
    }
}
