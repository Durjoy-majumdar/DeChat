package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.decoder.C17313ab;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.q */
final /* synthetic */ class C17300q implements Runnable {

    /* renamed from: a */
    private final C17286j f46875a;

    /* renamed from: b */
    private final String f46876b;

    private C17300q(C17286j jVar, String str) {
        this.f46875a = jVar;
        this.f46876b = str;
    }

    /* renamed from: a */
    public static Runnable m17210a(C17286j jVar, String str) {
        return new C17300q(jVar, str);
    }

    public final void run() {
        C17286j jVar = this.f46875a;
        String str = this.f46876b;
        try {
            LiteavLog.m16901i(jVar.f46828a, "setHWDecoderDeviceRelatedParams: ".concat(String.valueOf(str)));
            JSONArray jSONArray = new JSONArray(str);
            VideoDecodeController videoDecodeController = jVar.f46833f;
            if (videoDecodeController != null) {
                videoDecodeController.mo20376a((Runnable) new C17313ab(videoDecodeController, jSONArray));
            }
        } catch (JSONException e) {
            LiteavLog.m16898e(jVar.f46828a, "setHWDecoderDeviceRelatedParams error ".concat(String.valueOf(e)));
        }
    }
}
