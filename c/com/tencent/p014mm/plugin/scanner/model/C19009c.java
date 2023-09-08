package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.plugin.scanner.model.C19003b;
import com.tencent.p014mm.protocal.protobuf.GoodsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C64230ae;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.scanner.model.c */
public final class C19009c implements C19027m0 {

    /* renamed from: d */
    public final /* synthetic */ C64230ae f53405d;

    /* renamed from: e */
    public final /* synthetic */ int f53406e;

    /* renamed from: f */
    public final /* synthetic */ C19003b f53407f;

    /* renamed from: com.tencent.mm.plugin.scanner.model.c$a */
    public static final class C19010a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C19030n0 f53408d;

        /* renamed from: e */
        public final /* synthetic */ int f53409e;

        /* renamed from: f */
        public final /* synthetic */ C19003b f53410f;

        public C19010a(C19030n0 n0Var, int i, C19003b bVar) {
            this.f53408d = n0Var;
            this.f53409e = i;
            this.f53410f = bVar;
        }

        public final void run() {
            C19003b.C19004a aVar;
            C19030n0 n0Var = this.f53408d;
            int i = this.f53409e;
            n0Var.f53512i = i;
            Log.m105925i("MicroMsg.AiScanImageUploader", "alvinluo onScanSuccess source: %d, showResult: %b, isFinish: %b, isCancelled: %b", Integer.valueOf(i), Boolean.valueOf(this.f53408d.f53504a), Boolean.valueOf(this.f53410f.f53389c), Boolean.valueOf(this.f53410f.f53390d));
            C19003b bVar = this.f53410f;
            if (!bVar.f53389c && !bVar.f53390d && (aVar = bVar.f53391e) != null) {
                aVar.mo24251c(this.f53408d);
            }
        }
    }

    public C19009c(C64230ae aeVar, int i, C19003b bVar) {
        this.f53405d = aeVar;
        this.f53406e = i;
        this.f53407f = bVar;
    }

    public final void run() {
        ScanFrameProcessResult scanFrameProcessResult;
        C64230ae aeVar = this.f53405d;
        int i = this.f53406e;
        C19021i0 i0Var = C19021i0.f53455a;
        C87412m.m108594g(aeVar, "response");
        C19030n0 n0Var = new C19030n0();
        n0Var.f53508e = aeVar.f182070g;
        n0Var.f53507d = aeVar.f182067d;
        n0Var.f53509f = aeVar.f182074n;
        int i2 = aeVar.f182075o;
        n0Var.f53510g = i2;
        n0Var.f53511h = aeVar.f182077q;
        GoodsObject goodsObject = aeVar.f182072i;
        if (goodsObject != null) {
            if (i == 1) {
                float f = goodsObject.relative_minx;
                float f2 = goodsObject.relative_miny;
                float f3 = goodsObject.relative_maxx;
                float f4 = goodsObject.relative_maxy;
                boolean z = aeVar.f182076p;
                if (C19021i0.f53461g) {
                    Log.m105927v("MicroMsg.ScanFastFocusEngineManager", "alvinluo shouldJump minX: %f, minY: %f, maxX: %f, maxY: %f, frameId: %d, forceJump: %b", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i2), Boolean.valueOf(z));
                    scanFrameProcessResult = C19021i0.f53460f.shouldJump(f, f2, f3, f4, i2, z);
                } else {
                    scanFrameProcessResult = null;
                }
                if (scanFrameProcessResult != null) {
                    n0Var.f53504a = scanFrameProcessResult.shouldJump;
                    float f5 = (float) 2;
                    n0Var.f53505b = (scanFrameProcessResult.minX + scanFrameProcessResult.maxX) / f5;
                    n0Var.f53506c = (scanFrameProcessResult.minY + scanFrameProcessResult.maxY) / f5;
                }
            } else if (i == 2 || i == 4) {
                n0Var.f53504a = true;
                float f6 = (float) 2;
                n0Var.f53505b = (goodsObject.relative_minx + goodsObject.relative_maxx) / f6;
                n0Var.f53506c = (goodsObject.relative_miny + goodsObject.relative_maxy) / f6;
            }
            float max = Math.max(0.0f, n0Var.f53505b);
            n0Var.f53505b = max;
            n0Var.f53505b = Math.min(1.0f, max);
            float max2 = Math.max(0.0f, n0Var.f53506c);
            n0Var.f53506c = max2;
            n0Var.f53506c = Math.min(1.0f, max2);
            Log.m105927v("MicroMsg.ScanFastFocusEngineManager", "alvinluo parseRemoteResult centerX: %f, centerY: %f", Float.valueOf(n0Var.f53505b), Float.valueOf(n0Var.f53506c));
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C19010a(n0Var, this.f53406e, this.f53407f));
    }
}
