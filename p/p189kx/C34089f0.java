package p189kx;

import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import ei3.C86522b;
import p200lx.C21473d0;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: kx.f0 */
public final class C34089f0 extends C86301e implements C21473d0 {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r2 != false) goto L_0x002a;
     */
    /* renamed from: Gw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.qbar.QbarNative.QbarAiModelParam mo33645Gw() {
        /*
            r4 = this;
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.qbar.QbarNative$QbarAiModelParam r0 = gt3.C20839a.m22865a(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = r0.detect_model_bin_path_
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0019
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r1 = 0
            goto L_0x001a
        L_0x0019:
            r1 = 1
        L_0x001a:
            if (r1 != 0) goto L_0x002a
            java.lang.String r0 = r0.superresolution_model_bin_path_
            if (r0 == 0) goto L_0x0028
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            if (r2 == 0) goto L_0x0037
        L_0x002a:
            int r0 = p213oh.C11412b.f33577a
            r0 = 0
            java.lang.String r1 = "MicroMsg.ScanQBarAiModelManager"
            java.lang.String r2 = "getScanQBarAiModel model path error, and try init again"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
            vl2.C37756o.m41532f()
        L_0x0037:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.qbar.QbarNative$QbarAiModelParam r0 = gt3.C20839a.m22865a(r0)
            java.lang.String r1 = "getAiModeParam(MMApplicationContext.getContext())"
            gy3.C87412m.m108593f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p189kx.C34089f0.mo33645Gw():com.tencent.qbar.QbarNative$QbarAiModelParam");
    }
}
