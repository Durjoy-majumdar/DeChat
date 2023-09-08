package com.tencent.p014mm.plugin.scanner.model;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest;
import com.tencent.p014mm.plugin.scanner.model.C106076p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.scanner.model.s0 */
public final class C106082s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScanGoodsRequest f315839d;

    /* renamed from: e */
    public final /* synthetic */ long f315840e;

    public C106082s0(ScanGoodsRequest scanGoodsRequest, long j) {
        this.f315839d = scanGoodsRequest;
        this.f315840e = j;
    }

    public final void run() {
        String a = C106076p0.f315823a.mo151632a(this.f315839d);
        ConcurrentHashMap<String, Boolean> concurrentHashMap = C106076p0.f315827e;
        if (concurrentHashMap.containsKey(a)) {
            Log.m105924i("MicroMsg.ScanGoodsResourceManager", "alvinluo loadResource set can not release");
            concurrentHashMap.put(a, Boolean.FALSE);
        }
        long j = this.f315840e;
        ScanGoodsRequest scanGoodsRequest = this.f315839d;
        ArrayList arrayList = new ArrayList();
        String str = scanGoodsRequest.f248905p;
        C87412m.m108593f(str, "request.decorationImagePath");
        arrayList.add(new C106076p0.C106079c(str));
        String str2 = scanGoodsRequest.f248906q;
        C87412m.m108593f(str2, "request.successImagePath");
        arrayList.add(new C106076p0.C106079c(str2));
        String str3 = scanGoodsRequest.f248907r;
        C87412m.m108593f(str3, "request.scanTipsImagePath");
        arrayList.add(new C106076p0.C106079c(str3));
        C106076p0.C106077a aVar = new C106076p0.C106077a(j, arrayList);
        Log.m105924i("MicroMsg.ScanGoodsResourceManager", "batchDecodeImage start");
        boolean z = false;
        for (C106076p0.C106079c cVar : aVar.f315829b) {
            Bitmap bitmap = C106076p0.f315826d.get(cVar.f315834a);
            if (bitmap == null || bitmap.isRecycled()) {
                ((C119157j) C119157j.f356862d).mo183870a(new C106076p0.C106078b(cVar, new C106081r0(aVar)));
                z = true;
            } else {
                Log.m105927v("MicroMsg.ScanGoodsResourceManager", "alvinluo batchDecodeImage imagePath: %s, exist bitmap", cVar.f315834a);
                cVar.f315836c = 2;
                cVar.f315835b = 0;
            }
        }
        if (!z) {
            Log.m105924i("MicroMsg.ScanGoodsResourceManager", "alvinluo batchDecodeImage use cache no need to decode");
            long j2 = aVar.f315828a;
            HashMap<Long, C106075o0> hashMap = C106076p0.f315824b;
            C106075o0 o0Var = hashMap.get(Long.valueOf(j2));
            if (o0Var != null) {
                o0Var.mo151631a(0, "ok");
            }
            hashMap.remove(Long.valueOf(j2));
        }
    }
}
