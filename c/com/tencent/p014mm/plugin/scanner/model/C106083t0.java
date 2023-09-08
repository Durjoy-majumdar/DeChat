package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.plugin.scanner.model.t0 */
public final class C106083t0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f315841d;

    /* renamed from: e */
    public final /* synthetic */ ScanGoodsRequest f315842e;

    public C106083t0(String str, ScanGoodsRequest scanGoodsRequest) {
        this.f315841d = str;
        this.f315842e = scanGoodsRequest;
    }

    public final void run() {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = C106076p0.f315827e;
        if (C87412m.m108589b(concurrentHashMap.get(this.f315841d), Boolean.TRUE)) {
            C106076p0 p0Var = C106076p0.f315823a;
            String str = this.f315841d;
            ScanGoodsRequest scanGoodsRequest = this.f315842e;
            Log.m105925i("MicroMsg.ScanGoodsResourceManager", "alvinluo releaseResource requestKey: %s", str);
            concurrentHashMap.remove(str);
            String str2 = scanGoodsRequest.f248905p;
            C87412m.m108593f(str2, "request.decorationImagePath");
            p0Var.mo151634c(str2);
            String str3 = scanGoodsRequest.f248906q;
            C87412m.m108593f(str3, "request.successImagePath");
            p0Var.mo151634c(str3);
            String str4 = scanGoodsRequest.f248907r;
            C87412m.m108593f(str4, "request.scanTipsImagePath");
            p0Var.mo151634c(str4);
            return;
        }
        Log.m105919d("MicroMsg.ScanGoodsResourceManager", "alvinluo releaseResource not need to release requestKey: %s", this.f315841d);
    }
}
