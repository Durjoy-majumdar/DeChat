package fh2;

import bp3.C104160f;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import java.util.HashMap;
import java.util.Map;
import p156gj.C107822b0;
import p156gj.C107835h0;
import p156gj.C87203t;
import p663qo.C101211h;
import zt3.C119157j;

/* renamed from: fh2.e */
public final class C32051e {

    /* renamed from: a */
    public static final C32051e f85290a = new C32051e();

    /* renamed from: b */
    public static String f85291b = "";

    /* renamed from: fh2.e$a */
    public static final class C32052a implements Runnable {

        /* renamed from: d */
        public static final C32052a f85292d = new C32052a();

        public final void run() {
            Map<String, String> d = C87203t.m108268d();
            C32051e eVar = C32051e.f85290a;
            String str = (String) ((HashMap) d).get("hardware");
            if (str == null) {
                str = "";
            }
            C32051e.f85291b = str;
            StringBuilder sb = new StringBuilder();
            sb.append("get cpu name:");
            C32051e eVar2 = C32051e.f85290a;
            sb.append(C32051e.f85291b);
            Log.m105924i("MicroMsg.HevcEncodeChecker", sb.toString());
        }
    }

    static {
        ((C119157j) C119157j.f356862d).mo183875f(C32052a.f85292d);
    }

    /* renamed from: a */
    public final boolean mo58470a(boolean z, int i) {
        if (!((C101211h) C86312j.m106911c(C101211h.class)).mo140276It()) {
            Log.m105924i("MicroMsg.HevcEncodeChecker", "captureEnableHevc: hevc not support");
            return false;
        }
        C104160f fVar = C104160f.RepairerConfig_Media_CaptureHevc_Int;
        C107822b0 b0Var = C107835h0.f322852i;
        boolean z2 = z;
        boolean b = mo58471b(z2, fVar, b0Var.f322648D, b0Var.f322649E, C32735h.C32737c.clicfg_capture_enable_hevc_hard, C32735h.C32737c.clicfg_capture_enable_hevc_hard_gpu_rating_limit, C32735h.C32737c.clicfg_capture_enable_hevc_soft, C32735h.C32737c.clicfg_capture_enable_hevc_soft_gpu_rating_limit, i);
        Log.m105924i("MicroMsg.HevcEncodeChecker", "captureEnableHevc result:" + b + ", isSoft:" + z);
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0097, code lost:
        if (r5 >= r1) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        if (r0 == 1) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo58471b(boolean r24, bp3.C104160f r25, int r26, int r27, h81.C32735h.C32737c r28, h81.C32735h.C32737c r29, h81.C32735h.C32737c r30, h81.C32735h.C32737c r31, int r32) {
        /*
            r23 = this;
            r0 = r26
            r1 = r27
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            r4 = 0
            if (r3 != 0) goto L_0x000c
            return r4
        L_0x000c:
            bp3.p r3 = bp3.C79758p.f233760a
            r5 = r25
            int r3 = r3.mo109882e(r5, r4)
            w80.e$a r5 = w80.C111744e.f334654d
            int r5 = r5.mo163483f()
            java.lang.String r6 = ", repairerConfig:"
            java.lang.String r7 = ", deviceSwEnableHevc:"
            java.lang.String r8 = ","
            java.lang.String r9 = "config"
            java.lang.String r10 = ""
            java.lang.String r11 = ", gpuRating:"
            r12 = -1
            java.lang.String r13 = "MicroMsg.HevcEncodeChecker"
            r14 = 1
            if (r24 != 0) goto L_0x00c2
            if (r0 == r12) goto L_0x0032
            if (r0 != r14) goto L_0x009b
        L_0x0030:
            r4 = 1
            goto L_0x009b
        L_0x0032:
            di3.d r1 = di3.C86312j.m106911c(r2)
            h81.h r1 = (h81.C32735h) r1
            r15 = r28
            java.lang.String r15 = r1.Y60(r15, r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = "checkHevcEnableImpl hardHevcExptKey config:"
            r1.append(r10)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            gy3.C87412m.m108593f(r15, r9)
            java.lang.String[] r16 = new java.lang.String[]{r8}
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            java.util.List r1 = z04.C112550d0.m153785U(r15, r16, r17, r18, r19, r20)
            java.lang.String r8 = java.lang.String.valueOf(r32)
            boolean r1 = r1.contains(r8)
            if (r1 == 0) goto L_0x009a
            di3.d r1 = di3.C86312j.m106911c(r2)
            h81.h r1 = (h81.C32735h) r1
            r2 = r29
            int r1 = r1.mo58779Qe(r2, r12)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "checkHevcEnableImpl hardware encode gpu rating limit:"
            r2.append(r8)
            r2.append(r1)
            r2.append(r11)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            if (r1 <= 0) goto L_0x009b
            if (r5 < r1) goto L_0x009b
            goto L_0x0030
        L_0x009a:
            r4 = r1
        L_0x009b:
            r1 = 2
            if (r3 != r1) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r14 = r4
        L_0x00a0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkHevcEnableImpl hardware encode enable:"
            r1.append(r2)
            r1.append(r14)
            r1.append(r7)
            r1.append(r0)
            r1.append(r6)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            goto L_0x0171
        L_0x00c2:
            java.lang.String r0 = "checkHevcEnableImpl software encode enable:"
            if (r1 == r12) goto L_0x00cb
            if (r1 != r14) goto L_0x014f
            r4 = 1
            goto L_0x014f
        L_0x00cb:
            di3.d r15 = di3.C86312j.m106911c(r2)
            h81.h r15 = (h81.C32735h) r15
            r4 = r30
            java.lang.String r4 = r15.Y60(r4, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = "checkHevcEnableImpl softHevcExptKey config:"
            r10.append(r15)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r10)
            gy3.C87412m.m108593f(r4, r9)
            java.lang.String[] r18 = new java.lang.String[]{r8}
            r19 = 0
            r20 = 0
            r21 = 6
            r22 = 0
            r17 = r4
            java.util.List r4 = z04.C112550d0.m153785U(r17, r18, r19, r20, r21, r22)
            java.lang.String r8 = java.lang.String.valueOf(r32)
            boolean r4 = r4.contains(r8)
            if (r4 == 0) goto L_0x0137
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            r4 = r31
            int r2 = r2.mo58779Qe(r4, r12)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "checkHevcEnableImpl software encode gpu rating limit:"
            r4.append(r8)
            r4.append(r2)
            r4.append(r11)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r4)
            if (r2 <= 0) goto L_0x0136
            if (r5 < r2) goto L_0x0136
            r4 = 1
            goto L_0x0137
        L_0x0136:
            r4 = 0
        L_0x0137:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            r2.append(r11)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
        L_0x014f:
            if (r3 != r14) goto L_0x0152
            goto L_0x0153
        L_0x0152:
            r14 = r4
        L_0x0153:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r14)
            r2.append(r7)
            r2.append(r1)
            r2.append(r6)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
        L_0x0171:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: fh2.C32051e.mo58471b(boolean, bp3.f, int, int, h81.h$c, h81.h$c, h81.h$c, h81.h$c, int):boolean");
    }

    /* renamed from: c */
    public final boolean mo58472c(boolean z, int i) {
        if (!((C101211h) C86312j.m106911c(C101211h.class)).mo140276It()) {
            Log.m105924i("MicroMsg.HevcEncodeChecker", "remuxEnableHevc: hevc not support");
            return false;
        }
        C104160f fVar = C104160f.RepairerConfig_Media_RemuxHevc_Int;
        C107822b0 b0Var = C107835h0.f322852i;
        boolean z2 = z;
        boolean b = mo58471b(z2, fVar, b0Var.f322650F, b0Var.f322651G, C32735h.C32737c.clicfg_remux_enable_hevc_hard, C32735h.C32737c.clicfg_remux_enable_hevc_hard_gpu_rating_limit, C32735h.C32737c.clicfg_remux_enable_hevc_soft, C32735h.C32737c.clicfg_remux_enable_hevc_soft_gpu_rating_limit, i);
        Log.m105924i("MicroMsg.HevcEncodeChecker", "remuxEnableHevc result:" + b + ", isSoft:" + z);
        return b;
    }
}
