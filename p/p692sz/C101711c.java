package p692sz;

import android.content.Intent;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.vlog.model.FinderVideoShell;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.io.File;
import org.json.JSONObject;
import p707tz.C64999e;
import z04.C119027c;

@C86522b
/* renamed from: sz.c */
public class C101711c extends C86301e implements C64999e {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: oj.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.media.MediaFormat} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x015a  */
    /* renamed from: AQ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo89156AQ(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            i33.a r1 = i33.C98594a.f289088a
            java.lang.String r6 = ""
            java.lang.String r7 = "AudioUtil"
            java.lang.String r2 = "filePath"
            gy3.C87412m.m108594g(r0, r2)
            r8 = 0
            r2 = 0
            oj.b r9 = new oj.b     // Catch:{ Exception -> 0x0157 }
            r9.<init>()     // Catch:{ Exception -> 0x0157 }
            r9.mo161392k(r0)     // Catch:{ Exception -> 0x0154 }
            int r3 = r9.mo161385d()     // Catch:{ Exception -> 0x0154 }
            r4 = 0
        L_0x001c:
            r5 = 1
            if (r4 >= r3) goto L_0x0062
            android.media.MediaFormat r10 = r9.mo161386e(r4)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r11 = "mediaExtractor.getTrackFormat(i)"
            gy3.C87412m.m108593f(r10, r11)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r11 = "mime"
            java.lang.String r11 = r10.getString(r11)     // Catch:{ Exception -> 0x0154 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154 }
            r12.<init>()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r13 = "track mime:"
            r12.append(r13)     // Catch:{ Exception -> 0x0154 }
            r12.append(r11)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0154 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r12)     // Catch:{ Exception -> 0x0154 }
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0154 }
            if (r12 != 0) goto L_0x005f
            if (r11 == 0) goto L_0x0057
            java.lang.String r12 = "audio/"
            boolean r11 = z04.C112551y.m153819s(r11, r12, r8)     // Catch:{ Exception -> 0x0154 }
            if (r11 != r5) goto L_0x0057
            r11 = 1
            goto L_0x0058
        L_0x0057:
            r11 = 0
        L_0x0058:
            if (r11 == 0) goto L_0x005f
            r9.mo161390i(r4)     // Catch:{ Exception -> 0x0154 }
            r2 = r10
            goto L_0x0062
        L_0x005f:
            int r4 = r4 + 1
            goto L_0x001c
        L_0x0062:
            r3 = 91
            if (r2 != 0) goto L_0x0087
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154 }
            r0.<init>()     // Catch:{ Exception -> 0x0154 }
            r0.append(r3)     // Catch:{ Exception -> 0x0154 }
            int r1 = r1.hashCode()     // Catch:{ Exception -> 0x0154 }
            r0.append(r1)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r1 = "no audio track]"
            r0.append(r1)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0154 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)     // Catch:{ Exception -> 0x0154 }
            r9.mo161388g()     // Catch:{ Exception -> 0x0154 }
            goto L_0x0162
        L_0x0087:
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r4 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a     // Catch:{ Exception -> 0x0154 }
            rw.m$a r0 = r4.mo129930b(r0)     // Catch:{ Exception -> 0x0154 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154 }
            r4.<init>()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r10 = "audio format:"
            r4.append(r10)     // Catch:{ Exception -> 0x0154 }
            r4.append(r2)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r10 = ", videoInfo:"
            r4.append(r10)     // Catch:{ Exception -> 0x0154 }
            r4.append(r0)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0154 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r4 = "durationUs"
            if (r0 == 0) goto L_0x00b0
            long r10 = r0.f180528d     // Catch:{ Exception -> 0x0154 }
            goto L_0x00b2
        L_0x00b0:
            r10 = 0
        L_0x00b2:
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            boolean r12 = r2.containsKey(r4)     // Catch:{ Exception -> 0x0154 }
            if (r12 == 0) goto L_0x00c0
            long r10 = r2.getLong(r4)     // Catch:{ Exception -> 0x0154 }
        L_0x00c0:
            java.lang.String r4 = "bitrate"
            if (r0 == 0) goto L_0x00c7
            int r0 = r0.f180532h     // Catch:{ Exception -> 0x0154 }
            goto L_0x00ca
        L_0x00c7:
            r0 = 128000(0x1f400, float:1.79366E-40)
        L_0x00ca:
            int r0 = com.tencent.p014mm.plugin.vlog.model.C96535e0.m123847a(r2, r4, r0)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r4 = "profile"
            r12 = 2
            int r4 = com.tencent.p014mm.plugin.vlog.model.C96535e0.m123847a(r2, r4, r12)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r13 = "sample-rate"
            r14 = 44100(0xac44, float:6.1797E-41)
            int r13 = com.tencent.p014mm.plugin.vlog.model.C96535e0.m123847a(r2, r13, r14)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r14 = "channel-count"
            int r5 = com.tencent.p014mm.plugin.vlog.model.C96535e0.m123847a(r2, r14, r5)     // Catch:{ Exception -> 0x0154 }
            float r2 = (float) r0     // Catch:{ Exception -> 0x0154 }
            float r14 = (float) r10     // Catch:{ Exception -> 0x0154 }
            r15 = 1148846080(0x447a0000, float:1000.0)
            float r14 = r14 / r15
            r15 = 1000(0x3e8, float:1.401E-42)
            float r15 = (float) r15     // Catch:{ Exception -> 0x0154 }
            float r15 = r14 / r15
            float r2 = r2 * r15
            r15 = 8
            float r15 = (float) r15     // Catch:{ Exception -> 0x0154 }
            float r2 = r2 / r15
            float r12 = (float) r12     // Catch:{ Exception -> 0x0154 }
            float r2 = r2 * r12
            r12 = 7
            float r12 = (float) r12     // Catch:{ Exception -> 0x0154 }
            r15 = 20
            float r15 = (float) r15     // Catch:{ Exception -> 0x0154 }
            float r14 = r14 / r15
            float r12 = r12 * r14
            float r14 = r2 + r12
            int r14 = (int) r14     // Catch:{ Exception -> 0x0154 }
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.allocateDirect(r14)     // Catch:{ Exception -> 0x0154 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154 }
            r15.<init>()     // Catch:{ Exception -> 0x0154 }
            r15.append(r3)     // Catch:{ Exception -> 0x0154 }
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x0154 }
            r15.append(r3)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = "]allocate buffer size:"
            r15.append(r3)     // Catch:{ Exception -> 0x0154 }
            int r3 = r14.capacity()     // Catch:{ Exception -> 0x0154 }
            r15.append(r3)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = ", voiceSize:"
            r15.append(r3)     // Catch:{ Exception -> 0x0154 }
            r15.append(r2)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = ", adtsSize:"
            r15.append(r2)     // Catch:{ Exception -> 0x0154 }
            r15.append(r12)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = ", duration:"
            r15.append(r2)     // Catch:{ Exception -> 0x0154 }
            r15.append(r10)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = ", bitrate:"
            r15.append(r2)     // Catch:{ Exception -> 0x0154 }
            r15.append(r0)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r0 = r15.toString()     // Catch:{ Exception -> 0x0154 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ Exception -> 0x0154 }
            r0 = r1
            r1 = r9
            r2 = r14
            r3 = r4
            r4 = r13
            java.lang.String r6 = r0.mo137982a(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x0154 }
            goto L_0x0162
        L_0x0154:
            r0 = move-exception
            r2 = r9
            goto L_0x0158
        L_0x0157:
            r0 = move-exception
        L_0x0158:
            if (r2 == 0) goto L_0x015d
            r2.mo161388g()
        L_0x015d:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r1)
        L_0x0162:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p692sz.C101711c.mo89156AQ(java.lang.String):java.lang.String");
    }

    /* renamed from: L0 */
    public void mo89157L0() {
        FinderVideoShell finderVideoShell = FinderVideoShell.f82198a;
        if (WeChatEnvironment.hasDebugger()) {
            Log.m105924i("MicroMsg.FinderVideoShell", "setup");
            FinderVideoShell.f82217t.alive();
        }
    }

    /* renamed from: Ny */
    public VideoTransPara mo89158Ny() {
        FinderVideoShell finderVideoShell = FinderVideoShell.f82198a;
        return FinderVideoShell.f82201d;
    }

    public void R60(String str, float f, boolean z) {
        FinderVideoShell finderVideoShell = FinderVideoShell.f82198a;
        C87412m.m108594g(str, "path");
        Log.m105924i("MicroMsg.FinderVideoShell", "markRemuxFinish, qualityScore:" + f + ", path:" + str + ", isLongVideo:" + z);
        if (z) {
            FinderVideoShell.f82210m = Util.currentTicks();
        } else {
            FinderVideoShell.f82209l = Util.currentTicks();
        }
        String str2 = FinderVideoShell.f82199b;
        if (z) {
            str2 = str2 + "_long";
        }
        C86013q1.m106442c(str, str2);
        FinderVideoShell.f82214q = f;
    }

    /* renamed from: bf */
    public void mo89160bf(long j) {
        FinderVideoShell finderVideoShell = FinderVideoShell.f82198a;
        Log.m105924i("MicroMsg.FinderVideoShell", "markCdnUploadCost");
        if (FinderVideoShell.f82213p <= 0) {
            FinderVideoShell.f82213p = j;
        }
    }

    public void destroy() {
        FinderVideoShell finderVideoShell = FinderVideoShell.f82198a;
        Log.m105924i("MicroMsg.FinderVideoShell", "destroy");
        FinderVideoShell.f82217t.dead();
    }

    /* renamed from: fm */
    public boolean mo89162fm() {
        return FinderVideoShell.f82198a.mo57453a();
    }

    /* renamed from: kC */
    public void mo89163kC() {
        FinderVideoShell finderVideoShell = FinderVideoShell.f82198a;
        if (!finderVideoShell.mo57453a()) {
            finderVideoShell.mo57454b();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        long j = FinderVideoShell.f82204g;
        long j2 = 0;
        jSONObject2.put("stage_1", j > 0 ? j - FinderVideoShell.f82203f : 0);
        jSONObject2.put("stage_2", FinderVideoShell.f82205h - FinderVideoShell.f82203f);
        long j3 = FinderVideoShell.f82207j;
        if (j3 > 0) {
            long j4 = FinderVideoShell.f82206i;
            if (j4 > 0) {
                j2 = j3 - j4;
            }
        }
        jSONObject2.put("stage_3", j2);
        jSONObject2.put("stage_4", FinderVideoShell.f82209l - FinderVideoShell.f82211n);
        jSONObject2.put("stage_5", FinderVideoShell.f82210m - FinderVideoShell.f82212o);
        jSONObject2.put("stage_6", FinderVideoShell.f82213p);
        jSONObject.put("time_cost", jSONObject2);
        jSONObject.put("quality_score", Float.valueOf(FinderVideoShell.f82214q));
        Log.m105924i("MicroMsg.FinderVideoShell", "reportVideoResult:" + jSONObject + ", path:" + FinderVideoShell.f82200c);
        boolean z = true;
        if (FinderVideoShell.f82200c.length() > 0) {
            C86013q1.m106461v(new File(FinderVideoShell.f82200c).getParentFile().getAbsolutePath());
            String str = FinderVideoShell.f82200c;
            String jSONObject3 = jSONObject.toString();
            C87412m.m108593f(jSONObject3, "json.toString()");
            byte[] bytes = jSONObject3.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            C86013q1.m106438T(str, bytes, 0, bytes.length);
        } else {
            z = false;
        }
        Intent intent = new Intent("wechat.shell.FINDER_VIDEO_TEST_FINISH");
        intent.putExtra("success", z);
        MMApplicationContext.getContext().sendBroadcast(intent);
    }

    /* renamed from: pj */
    public void mo89164pj(boolean z) {
        FinderVideoShell finderVideoShell = FinderVideoShell.f82198a;
        Log.m105924i("MicroMsg.FinderVideoShell", "markStartRemux, isLongVideo:" + z);
        if (z) {
            FinderVideoShell.f82212o = Util.currentTicks();
        } else {
            FinderVideoShell.f82211n = Util.currentTicks();
        }
    }

    public int qe0() {
        FinderVideoShell finderVideoShell = FinderVideoShell.f82198a;
        return FinderVideoShell.f82202e == 1 ? 0 : 1;
    }

    public void reset() {
        FinderVideoShell.f82198a.mo57454b();
    }

    public void tj0() {
        FinderVideoShell finderVideoShell = FinderVideoShell.f82198a;
        Log.m105924i("MicroMsg.FinderVideoShell", "markShowPostUI");
        if (FinderVideoShell.f82207j <= 0) {
            FinderVideoShell.f82207j = Util.currentTicks();
        }
    }

    /* renamed from: zU */
    public void mo89168zU() {
        FinderVideoShell finderVideoShell = FinderVideoShell.f82198a;
        Log.m105924i("MicroMsg.FinderVideoShell", "markStartPost");
        if (FinderVideoShell.f82208k <= 0) {
            FinderVideoShell.f82208k = Util.currentTicks();
        }
    }
}
