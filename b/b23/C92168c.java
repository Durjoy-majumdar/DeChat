package b23;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C64899zy;

/* renamed from: b23.c */
public final class C92168c {

    /* renamed from: a */
    public static final C92168c f263796a = new C92168c();

    /* renamed from: b */
    public static final MultiProcessMMKV f263797b = MultiProcessMMKV.getMMKV("MicroMsg.VideoCompositionExportConfig");

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0193, code lost:
        if (r10.optInt("key", -1) >= r1) goto L_0x01af;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<java.lang.Boolean, java.lang.Integer> mo126129a(te3.C64899zy r14) {
        /*
            r13 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            java.lang.String r1 = "compositionInfo"
            gy3.C87412m.m108594g(r14, r1)
            di3.d r1 = di3.C86312j.m106911c(r0)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_vc_video_parallel_mux_enable_bframe
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r1 = r1.mo58784wf(r2, r3)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMultiDefault()
            java.lang.String r5 = "device_make_b_frame"
            r6 = 0
            boolean r2 = r2.decodeBool(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "bConfig:"
            r5.append(r7)
            r5.append(r1)
            java.lang.String r7 = " hasBFrame:"
            r5.append(r7)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "MicroMsg.VideoCompositionExportConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            if (r1 != 0) goto L_0x0053
            if (r2 == 0) goto L_0x0053
            java.lang.String r14 = "refuse by b-frame check"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r14)
            rx3.l r14 = new rx3.l
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r14.<init>(r0, r4)
            return r14
        L_0x0053:
            bp3.p r1 = bp3.C79758p.f233760a
            bp3.f r2 = bp3.C104160f.RepairerConfig_MediaParallel_NotSupport_Int
            r5 = -1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Object r1 = r1.mo109878a(r2, r8)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            gy3.C87412m.m108592e(r1, r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            di3.d r2 = di3.C86312j.m106911c(r0)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_vc_video_parallel_mux_enable_finder
            boolean r2 = r2.mo58784wf(r8, r3)
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_vc_video_parallel_mux_cpu_black
            java.lang.String r9 = "[Kirin]"
            java.lang.String r0 = r0.Y60(r8, r9)
            java.util.Map r8 = p156gj.C87201q.m108259c()     // Catch:{ Exception -> 0x00db }
            java.lang.String r9 = "Hardware"
            java.lang.Object r8 = r8.get(r9)     // Catch:{ Exception -> 0x00db }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x00db }
            if (r8 != 0) goto L_0x0096
            java.lang.String r8 = ""
        L_0x0096:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00db }
            r9.<init>()     // Catch:{ Exception -> 0x00db }
            java.lang.String r10 = "get cpu info:"
            r9.append(r10)     // Catch:{ Exception -> 0x00db }
            r9.append(r8)     // Catch:{ Exception -> 0x00db }
            java.lang.String r10 = "   black:"
            r9.append(r10)     // Catch:{ Exception -> 0x00db }
            r9.append(r0)     // Catch:{ Exception -> 0x00db }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00db }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)     // Catch:{ Exception -> 0x00db }
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ Exception -> 0x00db }
            r9.<init>(r0)     // Catch:{ Exception -> 0x00db }
            int r0 = r9.length()     // Catch:{ Exception -> 0x00db }
            r10 = 0
        L_0x00bc:
            if (r10 >= r0) goto L_0x00e4
            java.lang.Object r11 = r9.get(r10)     // Catch:{ Exception -> 0x00db }
            java.lang.String r12 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r11, r12)     // Catch:{ Exception -> 0x00db }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x00db }
            boolean r11 = z04.C112550d0.m153801u(r8, r11, r3)     // Catch:{ Exception -> 0x00db }
            if (r11 == 0) goto L_0x00d8
            rx3.l r0 = new rx3.l     // Catch:{ Exception -> 0x00db }
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00db }
            r0.<init>(r8, r4)     // Catch:{ Exception -> 0x00db }
            return r0
        L_0x00d8:
            int r10 = r10 + 1
            goto L_0x00bc
        L_0x00db:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.String r9 = "parse json error:"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r9, r8)
        L_0x00e4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "localConfig:"
            r0.append(r8)
            r0.append(r1)
            java.lang.String r8 = " xConfig:"
            r0.append(r8)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r0 = 10
            if (r1 != r5) goto L_0x010f
            if (r2 != 0) goto L_0x0132
            rx3.l r14 = new rx3.l
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r14.<init>(r0, r4)
            return r14
        L_0x010f:
            if (r1 == r3) goto L_0x0128
            if (r1 != 0) goto L_0x0114
            goto L_0x0128
        L_0x0114:
            if (r1 >= r0) goto L_0x0132
            boolean r2 = r13.mo126131c(r14)
            if (r2 != 0) goto L_0x0132
            rx3.l r14 = new rx3.l
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.<init>(r0, r1)
            return r14
        L_0x0128:
            if (r2 != 0) goto L_0x0132
            rx3.l r14 = new rx3.l
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r14.<init>(r0, r4)
            return r14
        L_0x0132:
            boolean r1 = r13.mo126131c(r14)
            if (r1 == 0) goto L_0x0145
            java.lang.String r14 = "checkEnableParallelExportDebug false for compositionInfo not support"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r14)
            rx3.l r14 = new rx3.l
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r14.<init>(r0, r4)
            return r14
        L_0x0145:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            if (r1 != 0) goto L_0x0156
            java.lang.String r14 = "checkEnableParallelExportDebug false for arm32 not support"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r14)
            rx3.l r14 = new rx3.l
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r14.<init>(r0, r4)
            return r14
        L_0x0156:
            java.util.LinkedList<te3.hi4> r14 = r14.f186899d
            java.lang.Object r14 = r14.get(r6)
            te3.hi4 r14 = (te3.hi4) r14
            java.lang.String r14 = r14.f183504d
            java.lang.String r14 = com.tencent.p014mm.vfs.C86013q1.m106448i(r14, r6)
            qw1.k r1 = qw1.C63342k.f179710a
            com.tencent.mm.plugin.sight.base.a r14 = r1.mo88239a(r14)
            int r1 = r14.f273445c
            int r14 = r14.f273446d
            org.json.JSONArray r2 = r13.mo126130b()
            int r1 = r1 / 100
            int r14 = r14 / 100
            int r1 = r1 * r14
            int r1 = r1 / r0
            int r14 = r2.length()
            r4 = 0
            r8 = 0
        L_0x017f:
            java.lang.String r9 = "key"
            if (r8 >= r14) goto L_0x01b3
            org.json.JSONObject r10 = r2.optJSONObject(r8)
            java.lang.String r11 = "data"
            if (r4 != 0) goto L_0x0196
            gy3.C87412m.m108593f(r10, r11)
            int r12 = r10.optInt(r9, r5)
            if (r12 < r1) goto L_0x0196
            goto L_0x01af
        L_0x0196:
            if (r4 == 0) goto L_0x01b0
            int r12 = r4.optInt(r9, r5)
            int r12 = r12 - r1
            int r12 = java.lang.Math.abs(r12)
            gy3.C87412m.m108593f(r10, r11)
            int r9 = r10.optInt(r9, r5)
            int r9 = r9 - r1
            int r9 = java.lang.Math.abs(r9)
            if (r12 <= r9) goto L_0x01b0
        L_0x01af:
            r4 = r10
        L_0x01b0:
            int r8 = r8 + 1
            goto L_0x017f
        L_0x01b3:
            if (r4 == 0) goto L_0x01db
            int r14 = r4.optInt(r9, r5)
            int r14 = r14 - r1
            int r14 = java.lang.Math.abs(r14)
            if (r14 > r0) goto L_0x01db
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "getKVSuggestSize from kv:"
            r14.append(r0)
            r14.append(r4)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r14)
            java.lang.String r14 = "count"
            int r14 = r4.optInt(r14, r5)
            goto L_0x01e1
        L_0x01db:
            java.lang.String r14 = "getKVSuggestSize from default 3"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r14)
            r14 = 3
        L_0x01e1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "checkEnableParallelExportDebug getKVSuggestSize size:"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            rx3.l r0 = new rx3.l
            if (r14 <= r3) goto L_0x01fa
            goto L_0x01fb
        L_0x01fa:
            r3 = 0
        L_0x01fb:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r2 = 4
            if (r14 <= r2) goto L_0x0203
            r14 = 4
        L_0x0203:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0.<init>(r1, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b23.C92168c.mo126129a(te3.zy):rx3.l");
    }

    /* renamed from: b */
    public final JSONArray mo126130b() {
        String decodeString = f263797b.decodeString("PARALLEL_COUNT_HISTORY_DATA_V2", "");
        if (TextUtils.isEmpty(decodeString)) {
            return new JSONArray();
        }
        try {
            return new JSONArray(decodeString);
        } catch (Exception unused) {
            return new JSONArray();
        }
    }

    /* renamed from: c */
    public final boolean mo126131c(C64899zy zyVar) {
        C87412m.m108594g(zyVar, "compositionInfo");
        return (zyVar.f186899d.size() == 1 && zyVar.f186899d.get(0).f183507g - zyVar.f186899d.get(0).f183506f >= 30000 && zyVar.f186906n.f186611e.size() == 0) ? false : true;
    }

    /* renamed from: d */
    public final boolean mo126132d(C64899zy zyVar) {
        C87412m.m108594g(zyVar, "compositionInfo");
        return (zyVar.f186899d.size() == 1 && zyVar.f186906n.f186611e.size() == 0) ? false : true;
    }

    /* renamed from: e */
    public final JSONObject mo126133e(JSONObject jSONObject, int i) {
        JSONObject put = jSONObject.put("hit", i);
        C87412m.m108593f(put, "this.put(\"hit\", hit)");
        return put;
    }
}
