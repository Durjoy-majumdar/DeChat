package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.util.LiteavLog;
import org.json.JSONArray;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.ab */
public final /* synthetic */ class C17313ab implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f46933a;

    /* renamed from: b */
    private final JSONArray f46934b;

    public C17313ab(VideoDecodeController videoDecodeController, JSONArray jSONArray) {
        this.f46933a = videoDecodeController;
        this.f46934b = jSONArray;
    }

    public final void run() {
        VideoDecodeController videoDecodeController = this.f46933a;
        JSONArray jSONArray = this.f46934b;
        videoDecodeController.f46905m = jSONArray;
        LiteavLog.m16902i(videoDecodeController.f46893a, "set MediaCodec device related params to %s", jSONArray);
    }
}
