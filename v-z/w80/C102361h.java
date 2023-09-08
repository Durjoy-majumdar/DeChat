package w80;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import i72.C108388k;
import i72.C108392r;
import org.json.JSONObject;

/* renamed from: w80.h */
public final class C102361h {

    /* renamed from: a */
    public static final C102361h f301459a = new C102361h();

    /* renamed from: b */
    public static long f301460b = -1;

    /* renamed from: a */
    public final void mo141930a(String str, int i, int i2) {
        int i3;
        int i4;
        String str2 = str;
        int i5 = i2;
        C87412m.m108594g(str2, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        try {
            if (Util.isNullOrNil(str)) {
                return;
            }
            if (C86013q1.m106450k(str)) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(985, 69, 1, false);
                JSONObject jSONObject = new JSONObject(SightVideoJNI.getSimpleMp4InfoVFS(str));
                int i6 = (int) jSONObject.getDouble("videoFPS");
                Log.m105925i("MicroMsg.MediaEditorIDKeyStat", "markAfterCaptureFinish, videoFPS: %s, videoBitrate: %s, recorderType: %s, resolutionLimit: %s", Integer.valueOf(i6), Integer.valueOf(jSONObject.optInt("videoBitrate")), Integer.valueOf(i), Integer.valueOf(i2));
                int i7 = 57;
                int i8 = 86;
                int i9 = 89;
                if (i == 1) {
                    nVar.idkeyStat(985, 71, 1, false);
                    nVar.idkeyStat(985, 73, (long) i6, false);
                    i7 = 74;
                    i8 = 95;
                    i9 = 98;
                    i4 = 107;
                    i3 = 108;
                } else {
                    nVar.idkeyStat(985, 70, 1, false);
                    nVar.idkeyStat(985, 72, (long) i6, false);
                    i4 = 104;
                    i3 = 105;
                }
                if (i5 == 720) {
                    i7 += 4;
                    i8++;
                    i9++;
                } else {
                    C108392r rVar = C108388k.f324540d;
                    if ((rVar.f324552b.f267166d < rVar.f324557g) || i5 == 1080) {
                        i7 += 8;
                        i8 += 2;
                        i9 += 2;
                    }
                }
                int i15 = i7;
                int i16 = i4;
                nVar.idkeyStat(985, (long) i8, 1, false);
                long j = (long) i6;
                nVar.idkeyStat(985, (long) i9, j, false);
                nVar.idkeyStat(985, (long) i16, 1, false);
                nVar.idkeyStat(985, (long) i3, j, false);
                Log.m105925i("MicroMsg.MediaEditorIDKeyStat", "markAfterCaptureFinish, filePath: %s base %d", str2, Integer.valueOf(i15));
                if (i6 >= 0 && i6 <= 10) {
                    nVar.idkeyStat(985, (long) i15, 1, false);
                } else if (i6 > 10 && i6 <= 15) {
                    nVar.idkeyStat(985, (long) (i15 + 1), 1, false);
                } else if (i6 > 15 && i6 <= 20) {
                    nVar.idkeyStat(985, (long) (i15 + 2), 1, false);
                } else if (i6 > 20 && i6 <= 30) {
                    nVar.idkeyStat(985, (long) (i15 + 3), 1, false);
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MediaEditorIDKeyStat", "markAfterCaptureFinish error: %s", e.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0032 A[Catch:{ Exception -> 0x002a, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037 A[Catch:{ Exception -> 0x002a, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0040 A[Catch:{ Exception -> 0x002a, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041 A[Catch:{ Exception -> 0x002a, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0044 A[Catch:{ Exception -> 0x002a, all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141931b(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.MediaEditorIDKeyStat"
            java.lang.String r1 = "path"
            gy3.C87412m.m108594g(r12, r1)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            if (r1 != 0) goto L_0x000f
            return
        L_0x000f:
            r1 = 0
            r2 = 0
            o80.a r3 = new o80.a     // Catch:{ Exception -> 0x009f }
            r3.<init>(r12)     // Catch:{ Exception -> 0x009f }
            android.media.MediaFormat r12 = r3.f329159f     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            android.media.MediaFormat r1 = r3.f329158e     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r4 = 1
            java.lang.String r5 = "durationUs"
            if (r12 == 0) goto L_0x002d
            boolean r6 = r12.containsKey(r5)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            if (r6 != r4) goto L_0x002d
            r6 = 1
            goto L_0x002e
        L_0x0027:
            r12 = move-exception
            goto L_0x0099
        L_0x002a:
            r12 = move-exception
            goto L_0x009b
        L_0x002d:
            r6 = 0
        L_0x002e:
            r7 = -1
            if (r6 == 0) goto L_0x0037
            long r9 = r12.getLong(r5)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            goto L_0x0038
        L_0x0037:
            r9 = r7
        L_0x0038:
            if (r1 == 0) goto L_0x0041
            boolean r12 = r1.containsKey(r5)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            if (r12 != r4) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            if (r4 == 0) goto L_0x0048
            long r7 = r1.getLong(r5)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
        L_0x0048:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r12.<init>()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.lang.String r1 = "markCheckRemuxResult, videoDuration:"
            r12.append(r1)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r12.append(r7)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.lang.String r1 = ", audioDuration:"
            r12.append(r1)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r12.append(r9)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r4 = 0
            int r12 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0095
            int r12 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0095
            r12 = 1065353216(0x3f800000, float:1.0)
            long r4 = java.lang.Math.max(r9, r7)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            float r1 = (float) r4     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            float r1 = r1 * r12
            long r4 = java.lang.Math.min(r9, r7)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            float r12 = (float) r4     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            float r1 = r1 / r12
            double r4 = (double) r1     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r6 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 < 0) goto L_0x0095
            java.lang.String r12 = "duration not match, report error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r5 = 986(0x3da, double:4.87E-321)
            r7 = 146(0x92, double:7.2E-322)
            r9 = 1
            r4.mo175913w(r5, r7, r9)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
        L_0x0095:
            r3.mo161327e()
            goto L_0x00ac
        L_0x0099:
            r1 = r3
            goto L_0x00ad
        L_0x009b:
            r1 = r3
            goto L_0x00a0
        L_0x009d:
            r12 = move-exception
            goto L_0x00ad
        L_0x009f:
            r12 = move-exception
        L_0x00a0:
            java.lang.String r3 = ""
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x009d }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r12, r3, r2)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x00ac
            r1.mo161327e()
        L_0x00ac:
            return
        L_0x00ad:
            if (r1 == 0) goto L_0x00b2
            r1.mo161327e()
        L_0x00b2:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w80.C102361h.mo141931b(java.lang.String):void");
    }

    /* renamed from: c */
    public final void mo141932c(int i) {
        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecCaptureResult, mixType:" + i);
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(986, 0, 1);
        if (i == 0) {
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxSlient");
            nVar.mo175913w(986, 4, 1);
        } else if (i == 1) {
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxNoMusic");
            nVar.mo175913w(986, 1, 1);
        } else if (i == 2) {
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxMusicOnly");
            nVar.mo175913w(986, 3, 1);
        } else if (i == 3) {
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxMusicBackground");
            nVar.mo175913w(986, 2, 1);
        }
    }

    /* renamed from: d */
    public final void mo141933d(int i, long j) {
        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxSuccess, mixType:" + i + ", time:" + j);
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(986, 34, 1);
        if (i == 0) {
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxTimeSlient, time:" + j);
            nVar.mo175913w(986, 39, j);
        } else if (i == 1) {
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxTimeNoMusic, time:" + j);
            nVar.mo175913w(986, 35, j);
        } else if (i == 2) {
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxTimeMusicOnly, time:" + j);
            nVar.mo175913w(986, 37, j);
        } else if (i == 3) {
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxTimeAll, time:" + j);
            nVar.mo175913w(986, 41, j);
        }
    }

    /* renamed from: e */
    public final void mo141934e(long j, long j2, long j3) {
        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxSuccessResult, bitrate:" + j + ", fps:" + j2 + ", originVideoFps:" + j3);
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(986, 43, j3);
        nVar.mo175913w(986, 45, j2);
        nVar.mo175913w(986, 48, j);
    }
}
