package hd0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import java.util.HashMap;
import p1081gi.C98121d;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: hd0.e0 */
public class C98394e0 extends C86301e {

    /* renamed from: d */
    public HashMap<String, C98396b> f288469d = new HashMap<>();

    /* renamed from: hd0.e0$a */
    public class C98395a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f288470d;

        /* renamed from: e */
        public final /* synthetic */ C98121d f288471e;

        /* renamed from: f */
        public final /* synthetic */ long f288472f;

        /* renamed from: g */
        public final /* synthetic */ String f288473g;

        public C98395a(String str, C98121d dVar, long j, String str2) {
            this.f288470d = str;
            this.f288471e = dVar;
            this.f288472f = j;
            this.f288473g = str2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0375, code lost:
            r3 = r3.f348991a.mo119945q(r3.f348992b);
         */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x022f  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0303  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0315  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x031f  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0340  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0387  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x03a6  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x03a9  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x03b7  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x03b9  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x03d3  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x03d6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r34 = this;
                r0 = r34
                hd0.e0 r1 = hd0.C98394e0.this
                java.util.HashMap<java.lang.String, hd0.e0$b> r1 = r1.f288469d
                java.lang.String r2 = r0.f288470d
                java.lang.Object r1 = r1.remove(r2)
                hd0.e0$b r1 = (hd0.C98394e0.C98396b) r1
                if (r1 != 0) goto L_0x0011
                return
            L_0x0011:
                java.lang.String r2 = r1.f288476b
                long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
                int r3 = (int) r2
                java.lang.String r2 = r1.f288476b
                r4 = 1
                com.tencent.mm.plugin.sight.base.a r2 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r2, r4)
                java.lang.String r5 = r1.f288475a
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 != 0) goto L_0x0036
                java.lang.String r5 = r1.f288475a
                com.tencent.mm.plugin.sight.base.a r5 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r5, r4)
                java.lang.String r6 = r1.f288475a
                long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
                int r7 = (int) r6
                long r6 = (long) r7
                goto L_0x0038
            L_0x0036:
                long r6 = (long) r3
                r5 = r2
            L_0x0038:
                java.lang.String r8 = "MicroMsg.SubCoreMediaRpt"
                if (r5 == 0) goto L_0x03fb
                if (r2 != 0) goto L_0x0040
                goto L_0x03fb
            L_0x0040:
                android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r10 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getIOSOldNetType(r10)
                gi.d r11 = r0.f288471e
                long r12 = r11.field_startTime
                r14 = 0
                int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r16 == 0) goto L_0x0053
                goto L_0x0055
            L_0x0053:
                long r12 = r1.f288483i
            L_0x0055:
                r17 = r5
                long r4 = r11.field_endTime
                int r11 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r11 == 0) goto L_0x005e
                goto L_0x0062
            L_0x005e:
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            L_0x0062:
                gi.d r11 = r0.f288471e
                java.lang.String[] r11 = r11.field_usedSvrIps
                if (r11 == 0) goto L_0x008c
                java.lang.StringBuffer r11 = new java.lang.StringBuffer
                r11.<init>()
                gi.d r9 = r0.f288471e
                java.lang.String[] r9 = r9.field_usedSvrIps
                int r14 = r9.length
                r15 = 0
            L_0x0073:
                if (r15 >= r14) goto L_0x0087
                r20 = r14
                r14 = r9[r15]
                r11.append(r14)
                java.lang.String r14 = "|"
                r11.append(r14)
                int r15 = r15 + 1
                r14 = r20
                goto L_0x0073
            L_0x0087:
                java.lang.String r9 = r11.toString()
                goto L_0x008d
            L_0x008c:
                r9 = 0
            L_0x008d:
                long r14 = r4 - r12
                r18 = 0
                int r11 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
                if (r11 <= 0) goto L_0x00a8
                gi.d r11 = r0.f288471e
                r20 = r8
                r21 = r9
                long r8 = r11.field_fileLength
                float r8 = (float) r8
                r9 = 1149239296(0x44800000, float:1024.0)
                float r8 = r8 / r9
                float r9 = (float) r14
                r11 = 1148846080(0x447a0000, float:1000.0)
                float r9 = r9 / r11
                float r8 = r8 / r9
                long r8 = (long) r8
                goto L_0x00ae
            L_0x00a8:
                r20 = r8
                r21 = r9
                r8 = r18
            L_0x00ae:
                java.lang.StringBuffer r11 = new java.lang.StringBuffer
                r11.<init>()
                r22 = r14
                java.lang.String r14 = r1.f288477c
                r11.append(r14)
                java.lang.String r14 = ","
                r11.append(r14)
                java.lang.String r15 = r1.f288478d
                r11.append(r15)
                r11.append(r14)
                r11.append(r10)
                r11.append(r14)
                gi.d r10 = r0.f288471e
                java.lang.String r10 = r10.field_fileId
                r11.append(r10)
                r11.append(r14)
                gi.d r10 = r0.f288471e
                java.lang.String r10 = r10.field_mp4identifymd5
                r11.append(r10)
                r11.append(r14)
                java.lang.String r10 = r1.f288479e
                java.lang.String r10 = u13.C101938c.m134167a(r10)
                r11.append(r10)
                r11.append(r14)
                r11.append(r12)
                r11.append(r14)
                r11.append(r4)
                r11.append(r14)
                r11.append(r6)
                r11.append(r14)
                r5 = r17
                int r4 = r5.f273443a
                r11.append(r4)
                r11.append(r14)
                int r4 = r5.f273444b
                int r4 = r4 / 1000
                r11.append(r4)
                r11.append(r14)
                int r4 = r5.f273449g
                int r4 = r4 / 1000
                r11.append(r4)
                r11.append(r14)
                int r4 = r5.f273447e
                r11.append(r4)
                r11.append(r14)
                int r4 = r5.f273445c
                r11.append(r4)
                r11.append(r14)
                int r4 = r5.f273446d
                r11.append(r4)
                r11.append(r14)
                int r4 = r1.f288481g
                r11.append(r4)
                r11.append(r14)
                r11.append(r3)
                r11.append(r14)
                int r3 = r2.f273443a
                r11.append(r3)
                r11.append(r14)
                int r3 = r2.f273444b
                int r3 = r3 / 1000
                r11.append(r3)
                r11.append(r14)
                int r3 = r2.f273449g
                int r3 = r3 / 1000
                r11.append(r3)
                r11.append(r14)
                int r3 = r2.f273447e
                r11.append(r3)
                r11.append(r14)
                int r3 = r2.f273445c
                r11.append(r3)
                r11.append(r14)
                int r3 = r2.f273446d
                r11.append(r3)
                r11.append(r14)
                int r3 = r1.f288482h
                r11.append(r3)
                r11.append(r14)
                r3 = r21
                r11.append(r3)
                r11.append(r14)
                int r3 = r5.f273448f
                r11.append(r3)
                r11.append(r14)
                gi.d r3 = r0.f288471e
                java.lang.String r3 = r3.field_fileUrl
                r11.append(r3)
                r11.append(r14)
                r11.append(r8)
                r11.append(r14)
                r4 = r22
                r11.append(r4)
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.String r3 = r11.toString()
                r5 = 0
                r4[r5] = r3
                java.lang.String r3 = "upload video rpt %s"
                r5 = r20
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r4)
                com.tencent.mm.autogen.mmdata.rpt.UploadVideoInfoStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.UploadVideoInfoStruct
                java.lang.String r4 = r11.toString()
                r3.<init>(r4)
                r3.mo86054n()
                hd0.e0 r3 = hd0.C98394e0.this
                int r4 = r2.f273444b
                int r6 = r1.f288482h
                r3.getClass()
                r3 = 5
                r7 = 4
                r8 = 3
                r9 = 2
                r10 = 1
                if (r6 == r10) goto L_0x01e9
                if (r6 == r9) goto L_0x01e4
                if (r6 == r7) goto L_0x01df
                if (r6 == r3) goto L_0x01da
                r10 = 1
                goto L_0x022b
            L_0x01da:
                r10 = 121(0x79, float:1.7E-43)
                r11 = 127(0x7f, float:1.78E-43)
                goto L_0x01ed
            L_0x01df:
                r10 = 131(0x83, float:1.84E-43)
                r11 = 137(0x89, float:1.92E-43)
                goto L_0x01ed
            L_0x01e4:
                r10 = 111(0x6f, float:1.56E-43)
                r11 = 117(0x75, float:1.64E-43)
                goto L_0x01ed
            L_0x01e9:
                r10 = 101(0x65, float:1.42E-43)
                r11 = 107(0x6b, float:1.5E-43)
            L_0x01ed:
                int r12 = r4 / 1000
                r13 = 6
                int[] r13 = new int[r13]
                r13 = {350, 544, 800, 1200, 1600, 2000} // fill-array
                com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object r10 = kj2.C117407d.m165559s(r12, r13, r10, r11)
                java.lang.Integer r10 = (java.lang.Integer) r10
                int r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r10)
                com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r21 = 422(0x1a6, double:2.085E-321)
                long r11 = (long) r10
                r25 = 1
                r27 = 0
                r23 = r11
                r20.idkeyStat(r21, r23, r25, r27)
                java.lang.Object[] r11 = new java.lang.Object[r8]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r12 = 0
                r11[r12] = r10
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r10 = 1
                r11[r10] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
                r11[r9] = r4
                java.lang.String r4 = "rptIdkey [%d] bitrate [%d] sendScene [%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r11)
            L_0x022b:
                int r4 = r2.f273452j
                if (r4 != r10) goto L_0x02f1
                java.lang.Object[] r4 = new java.lang.Object[r10]
                java.lang.String r6 = r1.f288476b
                r11 = 0
                r4[r11] = r6
                java.lang.String r6 = "ABA: New Path %s "
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
                hd0.e0 r4 = hd0.C98394e0.this
                int r6 = r1.f288482h
                r4.getClass()
                int r4 = r2.f273452j
                if (r4 != r10) goto L_0x02f1
                r4 = 48
                r10 = 58
                int r11 = r2.f273444b
                int r11 = r11 / 1000
                r12 = 10
                int[] r12 = new int[r12]
                r12 = {350, 544, 700, 900, 1100, 1300, 1500, 1700, 1900, 2100} // fill-array
                com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object r4 = kj2.C117407d.m165559s(r11, r12, r4, r10)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r4)
                com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r21 = 1052(0x41c, double:5.2E-321)
                long r11 = (long) r4
                r25 = 1
                r27 = 0
                r20 = r10
                r23 = r11
                r20.idkeyStat(r21, r23, r25, r27)
                java.lang.Object[] r11 = new java.lang.Object[r8]
                int r12 = r2.f273444b
                int r12 = r12 / 1000
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r13 = 0
                r11[r13] = r12
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r12 = 1
                r11[r12] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
                r11[r9] = r4
                java.lang.String r4 = "ABA: Using min and max qp limitation , video bitrate: [%d]  [%d] [%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r11)
                if (r6 == r12) goto L_0x02e1
                if (r6 == r9) goto L_0x02d0
                if (r6 == r7) goto L_0x02bf
                if (r6 == r3) goto L_0x02ae
                r4 = 8
                if (r6 == r4) goto L_0x029d
                goto L_0x02f1
            L_0x029d:
                r4 = 63
                r21 = 1052(0x41c, double:5.2E-321)
                long r4 = (long) r4
                r25 = 1
                r27 = 0
                r20 = r10
                r23 = r4
                r20.idkeyStat(r21, r23, r25, r27)
                goto L_0x02f1
            L_0x02ae:
                r4 = 62
                r21 = 1052(0x41c, double:5.2E-321)
                long r4 = (long) r4
                r25 = 1
                r27 = 0
                r20 = r10
                r23 = r4
                r20.idkeyStat(r21, r23, r25, r27)
                goto L_0x02f1
            L_0x02bf:
                r4 = 61
                r21 = 1052(0x41c, double:5.2E-321)
                long r4 = (long) r4
                r25 = 1
                r27 = 0
                r20 = r10
                r23 = r4
                r20.idkeyStat(r21, r23, r25, r27)
                goto L_0x02f1
            L_0x02d0:
                r4 = 60
                r21 = 1052(0x41c, double:5.2E-321)
                long r4 = (long) r4
                r25 = 1
                r27 = 0
                r20 = r10
                r23 = r4
                r20.idkeyStat(r21, r23, r25, r27)
                goto L_0x02f1
            L_0x02e1:
                r4 = 59
                r21 = 1052(0x41c, double:5.2E-321)
                long r4 = (long) r4
                r25 = 1
                r27 = 0
                r20 = r10
                r23 = r4
                r20.idkeyStat(r21, r23, r25, r27)
            L_0x02f1:
                z72.c r4 = new z72.c
                r4.<init>()
                long r5 = r0.f288472f
                r4.f303882d = r5
                r4.f303883e = r9
                r4.f303884f = r8
                int r5 = r1.f288482h
                r6 = 1
                if (r5 == r6) goto L_0x0315
                if (r5 == r9) goto L_0x0312
                if (r5 == r7) goto L_0x030f
                if (r5 == r3) goto L_0x030c
                r4.f303884f = r6
                goto L_0x0317
            L_0x030c:
                r4.f303884f = r9
                goto L_0x0317
            L_0x030f:
                r4.f303884f = r8
                goto L_0x0317
            L_0x0312:
                r4.f303884f = r8
                goto L_0x0317
            L_0x0315:
                r4.f303884f = r9
            L_0x0317:
                java.lang.String r3 = r1.f288478d
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x0322
                r3 = 1
                r4.f303884f = r3
            L_0x0322:
                java.lang.String r3 = r1.f288477c
                r4.f303886h = r3
                gi.d r3 = r0.f288471e
                java.lang.String r5 = r3.field_fileUrl
                r4.f303887i = r5
                java.lang.String r5 = r3.field_fileId
                r4.f303888j = r5
                java.lang.String r5 = r3.field_aesKey
                r4.f303889n = r5
                java.lang.String r3 = r3.field_filemd5
                r4.f303890o = r3
                java.lang.String r3 = r1.f288475a
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x0387
                java.lang.String r3 = r1.f288475a
                android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)
                java.lang.String r5 = r3.getPath()
                if (r5 == 0) goto L_0x0367
                r6 = 0
                java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r6, r6)
                java.lang.String r6 = r3.getPath()
                boolean r6 = r6.equals(r5)
                if (r6 != 0) goto L_0x0367
                android.net.Uri$Builder r3 = r3.buildUpon()
                android.net.Uri$Builder r3 = r3.path(r5)
                android.net.Uri r3 = r3.build()
            L_0x0367:
                com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                r6 = 0
                com.tencent.mm.vfs.f0$h r3 = r5.mo177799l(r3, r6)
                boolean r5 = r3.mo177810a()
                if (r5 != 0) goto L_0x0375
                goto L_0x037f
            L_0x0375:
                com.tencent.mm.vfs.FileSystem$c r5 = r3.f348991a
                java.lang.String r3 = r3.f348992b
                com.tencent.mm.vfs.b0 r3 = r5.mo119945q(r3)
                if (r3 != 0) goto L_0x0382
            L_0x037f:
                r14 = r18
                goto L_0x0384
            L_0x0382:
                long r14 = r3.f250475e
            L_0x0384:
                r4.f303891p = r14
                goto L_0x038c
            L_0x0387:
                r6 = 0
                long r10 = r1.f288483i
                r4.f303891p = r10
            L_0x038c:
                int r3 = r2.f273445c
                r4.f303892q = r3
                int r3 = r2.f273446d
                r4.f303893r = r3
                int r3 = r2.f273447e
                r4.f303896u = r3
                int r3 = r2.mo130041a()
                r4.f303895t = r3
                java.lang.String r3 = r1.f288476b
                boolean r3 = hd0.C98403m0.m127702b(r3)
                if (r3 == 0) goto L_0x03a9
                java.lang.String r3 = "h265"
                goto L_0x03ab
            L_0x03a9:
                java.lang.String r3 = "h264"
            L_0x03ab:
                r4.f303898w = r3
                gi.d r3 = r0.f288471e
                java.lang.String r3 = r3.field_thumbUrl
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 == 0) goto L_0x03b9
                r3 = r6
                goto L_0x03bd
            L_0x03b9:
                gi.d r3 = r0.f288471e
                java.lang.String r3 = r3.field_thumbUrl
            L_0x03bd:
                r4.f303894s = r3
                java.lang.String r3 = "aac"
                r4.f303899x = r3
                int r2 = r2.f273450h
                r4.f303897v = r2
                java.lang.String r2 = r0.f288473g
                r4.f303879A = r2
                java.lang.String r2 = r1.f288477c
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 == 0) goto L_0x03d6
                r30 = 3
                goto L_0x03e3
            L_0x03d6:
                java.lang.String r2 = r1.f288477c
                boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
                if (r2 == 0) goto L_0x03e1
                r30 = 2
                goto L_0x03e3
            L_0x03e1:
                r30 = 1
            L_0x03e3:
                java.lang.Class<zu.b> r2 = p782zu.C39454b.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                r28 = r2
                zu.b r28 = (p782zu.C39454b) r28
                long r2 = r1.f288483i
                java.lang.String r1 = r1.f288476b
                r29 = r4
                r31 = r2
                r33 = r1
                r28.mo61972Vk(r29, r30, r31, r33)
                return
            L_0x03fb:
                r5 = r8
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r1 = r1.f288476b
                r3 = 0
                r2[r3] = r1
                java.lang.String r1 = "upload video but media info is null. %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hd0.C98394e0.C98395a.run():void");
        }
    }

    /* renamed from: hd0.e0$b */
    public class C98396b {

        /* renamed from: a */
        public String f288475a;

        /* renamed from: b */
        public String f288476b;

        /* renamed from: c */
        public String f288477c;

        /* renamed from: d */
        public String f288478d;

        /* renamed from: e */
        public String f288479e;

        /* renamed from: f */
        public C98121d f288480f;

        /* renamed from: g */
        public int f288481g;

        /* renamed from: h */
        public int f288482h;

        /* renamed from: i */
        public long f288483i;

        public C98396b(C98394e0 e0Var) {
        }
    }

    public static C98394e0 vx0() {
        return (C98394e0) C86312j.m106911c(C98394e0.class);
    }

    public void wx0(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        C98396b bVar = this.f288469d.get(str2);
        if (bVar == null) {
            bVar = new C98396b(this);
        }
        bVar.f288475a = str;
        bVar.f288476b = str2;
        bVar.f288477c = str3;
        bVar.f288478d = str4;
        bVar.f288479e = str5;
        int i3 = bVar.f288482h;
        if (i3 == 0) {
            i3 = i;
        }
        bVar.f288482h = i3;
        bVar.f288481g = i2;
        bVar.f288483i = Util.nowMilliSecond();
        this.f288469d.put(str2, bVar);
        Log.m105925i("MicroMsg.SubCoreMediaRpt", "note video upload path[%s, %s] toUser %s msgSource %s snsInfoId %s sendScene %d cpStatus %d", str, str2, str3, str4, str5, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void xx0(int i, String str, String str2, long j) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            String str3 = i + "";
            Log.m105919d("MicroMsg.SubCoreMediaRpt", "rpt sns video upload info snsKey[%s] url[%s] snsId[%d] path[%s]", str3, str, Long.valueOf(j), str2);
            C98396b bVar = this.f288469d.get(str3);
            if (bVar != null) {
                bVar.f288479e = j + "";
                bVar.f288476b = str2;
                yx0(bVar.f288480f, str3, "", j);
            }
        }
    }

    public void yx0(C98121d dVar, String str, String str2, long j) {
        if (dVar != null && !Util.isNullOrNil(str)) {
            C86709a0.m107525e().postToWorker(new C98395a(str, dVar, j, str2));
        }
    }
}
