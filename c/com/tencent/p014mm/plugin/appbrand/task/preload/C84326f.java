package com.tencent.p014mm.plugin.appbrand.task.preload;

import android.content.Intent;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandTaskPreloadReceiver;
import q20.C89449a;

@C89449a
/* renamed from: com.tencent.mm.plugin.appbrand.task.preload.f */
public class C84326f implements C1255d<Intent, IPCVoid> {
    public void invoke(Object obj, C1256g gVar) {
        AppBrandTaskPreloadReceiver.m103893a("PreloadIPCTaskImpl", (Intent) obj);
        gVar.mo894a(IPCVoid.f10316d);
    }
}
