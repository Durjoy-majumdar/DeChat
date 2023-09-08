package com.tencent.p014mm.plugin.appbrand.task;

import android.os.MessageQueue;
import bt0.C79808b;
import bt0.C79811f;
import bu0.C79819c;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84690v2;
import com.tencent.p014mm.plugin.appbrand.page.C83818i;
import com.tencent.p014mm.plugin.appbrand.page.C83834k;
import com.tencent.p014mm.plugin.appbrand.widget.tabbar.AppBrandTabBarItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.plugin.appbrand.task.q$$e */
public class q$$e implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ C84343y f246241d;

    public q$$e(C84343y yVar) {
        this.f246241d = yVar;
    }

    public boolean queueIdle() {
        ConcurrentHashMap<C84343y, C83818i> concurrentHashMap = C83834k.f244700a;
        C84343y yVar = this.f246241d;
        C87412m.m108594g(yVar, "type");
        Log.m105924i("MicroMsg.AppBrandDecorWidgetPreLoader", "warmUpAndTryPreload type=" + yVar);
        if (C83834k.f244700a.get(yVar) == null) {
            C83818i iVar = new C83818i();
            iVar.mo116281d(C79808b.class);
            iVar.mo116281d(C79811f.class);
            if (yVar.ordinal() == 0) {
                iVar.mo116281d(C79819c.class);
                iVar.mo116281d(C84690v2.class);
                for (int i = 0; i < 5; i++) {
                    iVar.mo116281d(AppBrandTabBarItem.class);
                }
            }
            C83834k.f244700a.put(yVar, iVar);
        }
        return false;
    }
}
