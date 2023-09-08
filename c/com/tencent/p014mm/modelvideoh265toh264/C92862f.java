package com.tencent.p014mm.modelvideoh265toh264;

import android.media.MediaFormat;
import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82855e;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C85457c;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import hd0.C98403m0;
import java.util.ArrayList;
import lc3.C10485b;
import p914oj.C110052b;
import p914oj.C89231c;
import r80.C89903h;
import xb0.C102609h;

/* renamed from: com.tencent.mm.modelvideoh265toh264.f */
public class C92862f {

    /* renamed from: a */
    public static final Object f267510a = new Object();

    /* renamed from: b */
    public static volatile boolean f267511b;

    /* renamed from: com.tencent.mm.modelvideoh265toh264.f$b */
    public static class C1309b implements C80916r<IPCVoid, IPCBoolean> {
        private C1309b() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            boolean z = true;
            if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("HEVCTranscodeMediaCodec", 1) != 1) {
                z = false;
            }
            return new IPCBoolean(z);
        }
    }

    /* renamed from: com.tencent.mm.modelvideoh265toh264.f$a */
    public class C92863a implements C89903h.C89905b {

        /* renamed from: a */
        public final /* synthetic */ String f267512a;

        /* renamed from: b */
        public final /* synthetic */ String f267513b;

        /* renamed from: c */
        public final /* synthetic */ VideoTransPara f267514c;

        /* renamed from: d */
        public final /* synthetic */ long f267515d;

        public C92863a(String str, String str2, VideoTransPara videoTransPara, long j) {
            this.f267512a = str;
            this.f267513b = str2;
            this.f267514c = videoTransPara;
            this.f267515d = j;
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo114978a(java.lang.String r12) {
            /*
                r11 = this;
                java.lang.String r0 = "MicroMsg.TransferUtil"
                java.lang.String r1 = "mediaCodecRemuxer remux onFinish"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                r0 = 1
                r1 = 0
                if (r12 == 0) goto L_0x0056
                java.lang.String r12 = "MicroMsg.TransferUtil"
                java.lang.String r2 = "MediaCodecRemuxer remux failed, ret path is null, retry x264"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r2)
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r4 = 354(0x162, double:1.75E-321)
                r6 = 244(0xf4, double:1.206E-321)
                r8 = 1
                r10 = 0
                r3.idkeyStat(r4, r6, r8, r10)
                java.lang.String r12 = r11.f267512a     // Catch:{ Exception -> 0x002f }
                java.lang.String r2 = r11.f267513b     // Catch:{ Exception -> 0x002f }
                com.tencent.mm.modelcontrol.VideoTransPara r3 = r11.f267514c     // Catch:{ Exception -> 0x002f }
                long r4 = r11.f267515d     // Catch:{ Exception -> 0x002f }
                com.tencent.p014mm.modelvideoh265toh264.C92862f.m117170c(r12, r2, r3, r4)     // Catch:{ Exception -> 0x002f }
                goto L_0x003c
            L_0x002f:
                java.lang.String r12 = "MicroMsg.TransferUtil"
                java.lang.String r2 = "fallbackTransferWithVideoTransfer error!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
                r12 = -1
                long r2 = r11.f267515d
                com.tencent.p014mm.modelvideoh265toh264.C92862f.m117172e(r12, r2)
            L_0x003c:
                java.lang.Object r12 = com.tencent.p014mm.modelvideoh265toh264.C92862f.f267510a
                monitor-enter(r12)
                r12.notifyAll()     // Catch:{ Exception -> 0x0047 }
                com.tencent.p014mm.modelvideoh265toh264.C92862f.f267511b = r0     // Catch:{ Exception -> 0x0047 }
                goto L_0x0052
            L_0x0045:
                r0 = move-exception
                goto L_0x0054
            L_0x0047:
                r0 = move-exception
                java.lang.String r2 = "MicroMsg.TransferUtil"
                java.lang.String r3 = "wait mediaCodecRemuxer error"
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0045 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)     // Catch:{ all -> 0x0045 }
            L_0x0052:
                monitor-exit(r12)     // Catch:{ all -> 0x0045 }
                goto L_0x0072
            L_0x0054:
                monitor-exit(r12)     // Catch:{ all -> 0x0045 }
                throw r0
            L_0x0056:
                long r2 = r11.f267515d
                com.tencent.p014mm.modelvideoh265toh264.C92862f.m117172e(r1, r2)
                java.lang.Object r12 = com.tencent.p014mm.modelvideoh265toh264.C92862f.f267510a
                monitor-enter(r12)
                r12.notifyAll()     // Catch:{ Exception -> 0x0066 }
                com.tencent.p014mm.modelvideoh265toh264.C92862f.f267511b = r0     // Catch:{ Exception -> 0x0066 }
                goto L_0x0071
            L_0x0064:
                r0 = move-exception
                goto L_0x0073
            L_0x0066:
                r0 = move-exception
                java.lang.String r2 = "MicroMsg.TransferUtil"
                java.lang.String r3 = "wait mediaCodecRemuxer error"
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0064 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)     // Catch:{ all -> 0x0064 }
            L_0x0071:
                monitor-exit(r12)     // Catch:{ all -> 0x0064 }
            L_0x0072:
                return
            L_0x0073:
                monitor-exit(r12)     // Catch:{ all -> 0x0064 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelvideoh265toh264.C92862f.C92863a.mo114978a(java.lang.String):void");
        }
    }

    /* renamed from: a */
    public static VideoTransPara m117168a(String str) {
        Log.m105925i("MicroMsg.TransferUtil", "buildPara：srcPath %s ", str);
        VideoTransPara videoTransPara = new VideoTransPara();
        Boolean valueOf = Boolean.valueOf(m117175h(str));
        Log.m105925i("MicroMsg.TransferUtil", "Video format is h265 : %s", valueOf);
        if (valueOf.booleanValue()) {
            try {
                C89231c cVar = new C89231c();
                cVar.setDataSource(str);
                int i = Util.getInt(cVar.extractMetadata(9), 0);
                videoTransPara.f267170h = i;
                videoTransPara.f267170h = Util.videoMsToSec((long) i);
                videoTransPara.f267166d = Util.getInt(cVar.extractMetadata(18), 0);
                videoTransPara.f267167e = Util.getInt(cVar.extractMetadata(19), 0);
                videoTransPara.f267169g = Util.getInt(cVar.extractMetadata(20), 0);
                m117171d(str, videoTransPara);
                cVar.release();
            } catch (IllegalArgumentException e) {
                Log.printErrStackTrace("MicroMsg.TransferUtil", e, "fetch mediaInfo from MediaMetadataRetriever failed", new Object[0]);
                C94554a c = C94555d.m119567c(str, true);
                if (c != null) {
                    videoTransPara.f267170h = Util.videoMsToSec((long) c.f273443a);
                    videoTransPara.f267166d = c.f273445c;
                    videoTransPara.f267167e = c.f273446d;
                    videoTransPara.f267169g = c.f273444b;
                    videoTransPara.f267168f = c.f273447e;
                }
            }
            if (videoTransPara.f267169g <= 0 || videoTransPara.f267167e <= 0 || videoTransPara.f267166d <= 0) {
                Log.m105920e("MicroMsg.TransferUtil", "error get video info, retry");
                C110052b bVar = new C110052b();
                try {
                    bVar.mo161392k(str);
                    MediaFormat mediaFormat = null;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= bVar.mo161385d()) {
                            break;
                        }
                        MediaFormat e2 = bVar.mo161386e(i2);
                        if (e2.containsKey("mime")) {
                            if (e2.getString("mime").contains("video")) {
                                mediaFormat = e2;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (mediaFormat != null) {
                        if (mediaFormat.containsKey("durationUs")) {
                            int integer = mediaFormat.getInteger("durationUs");
                            videoTransPara.f267170h = integer;
                            videoTransPara.f267170h = Math.round(((float) integer) / 1000000.0f);
                        }
                        if (mediaFormat.containsKey("width") && mediaFormat.containsKey("height")) {
                            videoTransPara.f267166d = mediaFormat.getInteger("width");
                            videoTransPara.f267167e = mediaFormat.getInteger("height");
                        }
                        if (mediaFormat.containsKey(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)) {
                            videoTransPara.f267169g = mediaFormat.getInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE);
                        }
                    }
                } catch (Exception e3) {
                    Log.printErrStackTrace("MicroMsg.TransferUtil", e3, "retry get video info error", new Object[0]);
                } catch (Throwable th) {
                    bVar.mo161388g();
                    throw th;
                }
                bVar.mo161388g();
            }
        } else {
            PInt pInt = new PInt();
            PInt pInt2 = new PInt();
            PInt pInt3 = new PInt();
            PInt pInt4 = new PInt();
            PInt pInt5 = new PInt();
            C94555d.m119569e(str, pInt, pInt2, pInt3, pInt4, pInt5);
            videoTransPara.f267170h = Util.videoMsToSec((long) pInt.value);
            videoTransPara.f267166d = pInt2.value;
            videoTransPara.f267167e = pInt3.value;
            videoTransPara.f267168f = pInt4.value;
            videoTransPara.f267169g = pInt5.value;
        }
        Log.m105919d("MicroMsg.TransferUtil", "VideoPara is : %s", videoTransPara);
        return videoTransPara;
    }

    /* renamed from: b */
    public static VideoTransPara m117169b(VideoTransPara videoTransPara, String str) {
        VideoTransPara Ex0 = C102609h.Fx0().Ex0(videoTransPara, (String) null);
        if (Ex0 == null) {
            Log.m105925i("MicroMsg.TransferUtil", "get C2C album video para is null. old para %s", videoTransPara);
            try {
                VideoTransPara videoTransPara2 = new VideoTransPara();
                int[] iArr = new int[2];
                m117174g(str, iArr);
                videoTransPara2.f267166d = iArr[0];
                videoTransPara2.f267167e = iArr[1];
                videoTransPara2.f267169g = C85457c.f249058c;
                videoTransPara2.f267177r = C85457c.f249057b;
                videoTransPara2.f267176q = 2;
                videoTransPara2.f267168f = (int) C85457c.f249059d;
                videoTransPara2.f267170h = m117173f(str);
                return videoTransPara2;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TransferUtil", e, "compressBitrateDefault failed: %s", e.getMessage());
                return null;
            }
        } else {
            Log.m105925i("MicroMsg.TransferUtil", "compress new para is %s  old para is:%s", Ex0, videoTransPara);
            int i = videoTransPara.f267169g;
            if (i <= 640000 || Ex0.f267169g > i) {
                Log.m105925i("MicroMsg.TransferUtil", "new bitrate is bigger than old bitrate %s %s", Ex0, videoTransPara);
                Ex0.f267169g = Math.max(Math.min(Ex0.f267169g, videoTransPara.f267169g), 640000);
            }
            int i2 = videoTransPara.f267166d;
            int i3 = videoTransPara.f267167e;
            if (((double) (i3 * i2)) < ((double) (Ex0.f267166d * Ex0.f267167e)) * 0.85d) {
                int i4 = i2 % 16;
                if (i4 != 0) {
                    int i5 = (16 - i4) + i2;
                    i2 = i5 < Integer.MAX_VALUE ? i5 : i2 - i4;
                }
                Ex0.f267166d = i2;
                int i6 = i3 % 16;
                if (i6 != 0) {
                    int i7 = (16 - i6) + i3;
                    i3 = i7 < Integer.MAX_VALUE ? i7 : i3 - i6;
                }
                Ex0.f267167e = i3;
                Log.m105925i("MicroMsg.TransferUtil", "new resolution is bigger than old, value[%d %d]", Integer.valueOf(i2), Integer.valueOf(Ex0.f267167e));
            }
            if (videoTransPara.f267168f >= 45 && videoTransPara.f267170h * 1000 >= 180000) {
                Log.m105924i("MicroMsg.TransferUtil", "make fps lower");
                Ex0.f267168f = (int) C85457c.f249059d;
            }
            Log.m105925i("MicroMsg.TransferUtil", "final para is %s", videoTransPara);
            return Ex0;
        }
    }

    /* renamed from: c */
    public static void m117170c(String str, String str2, VideoTransPara videoTransPara, long j) {
        Log.printInfoStack("MicroMsg.TransferUtil", "fallbackTransferWithVideoTransfer, srcPath:%s, dstPath:%s, newPara:%s", str, str2, videoTransPara);
        C104692h hVar = new C104692h();
        hVar.mo148344b(str, str2, videoTransPara);
        hVar.f310902p = true;
        hVar.f310903q = true;
        int d = hVar.mo148346d(0, (long) m117173f(str));
        Log.m105925i("MicroMsg.TransferUtil", "fallbackTransferWithVideoTransfer, finish, segRet:%s", Integer.valueOf(d));
        m117172e(d, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076 A[Catch:{ all -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m117171d(java.lang.String r11, com.tencent.p014mm.modelcontrol.VideoTransPara r12) {
        /*
            java.lang.String r0 = "mime"
            java.lang.String r1 = "MicroMsg.TransferUtil"
            r2 = 1
            r3 = 0
            r4 = 0
            oj.b r5 = new oj.b     // Catch:{ Exception -> 0x0068 }
            r5.<init>()     // Catch:{ Exception -> 0x0068 }
            r5.mo161392k(r11)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            int r4 = r5.mo161385d()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r6 = 0
        L_0x0015:
            if (r6 >= r4) goto L_0x005c
            android.media.MediaFormat r7 = r5.mo161386e(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            boolean r8 = r7.containsKey(r0)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r8 == 0) goto L_0x0059
            java.lang.String r8 = r7.getString(r0)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r8 == 0) goto L_0x002c
            goto L_0x0059
        L_0x002c:
            java.lang.String r8 = r7.getString(r0)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r9 = "mime: %s"
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r10[r3] = r8     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r10)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r9 = "video/"
            boolean r8 = r8.startsWith(r9)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r8 == 0) goto L_0x0059
            java.lang.String r0 = "frame-rate"
            int r0 = r7.getInteger(r0)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r12.f267168f = r0     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r4 = "fps: %s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r6[r3] = r0     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            goto L_0x005c
        L_0x0059:
            int r6 = r6 + 1
            goto L_0x0015
        L_0x005c:
            r5.mo161388g()
            goto L_0x008d
        L_0x0060:
            r11 = move-exception
            r4 = r5
            goto L_0x008e
        L_0x0063:
            r0 = move-exception
            r4 = r5
            goto L_0x0069
        L_0x0066:
            r11 = move-exception
            goto L_0x008e
        L_0x0068:
            r0 = move-exception
        L_0x0069:
            java.lang.String r5 = "find fps error"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r5, r6)     // Catch:{ all -> 0x0066 }
            com.tencent.mm.plugin.sight.base.a r11 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r11, r2)     // Catch:{ all -> 0x0066 }
            if (r11 == 0) goto L_0x0088
            int r11 = r11.f273447e     // Catch:{ all -> 0x0066 }
            r12.f267168f = r11     // Catch:{ all -> 0x0066 }
            java.lang.String r12 = "set fps from getMedia: %s"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0066 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0066 }
            r0[r3] = r11     // Catch:{ all -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r12, r0)     // Catch:{ all -> 0x0066 }
        L_0x0088:
            if (r4 == 0) goto L_0x008d
            r4.mo161388g()
        L_0x008d:
            return
        L_0x008e:
            if (r4 == 0) goto L_0x0093
            r4.mo161388g()
        L_0x0093:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelvideoh265toh264.C92862f.m117171d(java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara):void");
    }

    /* renamed from: e */
    public static void m117172e(int i, long j) {
        if (i < 0) {
            Log.m105925i("MicroMsg.TransferUtil", "Local tranfer to H264 failed：%s", Integer.valueOf(i));
        }
        Log.m105924i("MicroMsg.TransferUtil", "Transfer Finish");
        long currentTicks = Util.currentTicks() - j;
        Log.m105925i("MicroMsg.TransferUtil", "totalTime：%d", Long.valueOf(currentTicks));
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey();
        iDKey.SetID(C82855e.CTRL_INDEX);
        iDKey.SetKey(253);
        iDKey.SetValue(currentTicks);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(C82855e.CTRL_INDEX);
        iDKey2.SetKey(254);
        iDKey2.SetValue(1);
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        C115669n.INSTANCE.mo160124a(arrayList, false);
    }

    /* renamed from: f */
    public static int m117173f(String str) {
        C89231c cVar = new C89231c();
        cVar.setDataSource(str);
        String extractMetadata = cVar.extractMetadata(9);
        cVar.release();
        if (extractMetadata == null) {
            return 0;
        }
        try {
            return Integer.valueOf(extractMetadata).intValue();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.TransferUtil", "getDuration error %s", e.getMessage());
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r0.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m117174g(java.lang.String r7, int[] r8) {
        /*
            oj.c r0 = new oj.c     // Catch:{ all -> 0x0055 }
            r0.<init>()     // Catch:{ all -> 0x0055 }
            r0.setDataSource(r7)     // Catch:{ all -> 0x0053 }
            r7 = 18
            java.lang.String r7 = r0.extractMetadata(r7)     // Catch:{ all -> 0x0053 }
            r1 = 0
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r1)     // Catch:{ all -> 0x0053 }
            r2 = 19
            java.lang.String r2 = r0.extractMetadata(r2)     // Catch:{ all -> 0x0053 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r1)     // Catch:{ all -> 0x0053 }
            r8[r1] = r7     // Catch:{ all -> 0x0053 }
            r3 = 1
            r8[r3] = r2     // Catch:{ all -> 0x0053 }
            r4 = 0
        L_0x0023:
            r5 = 3
            if (r4 >= r5) goto L_0x004b
            int r5 = r7 % 2
            if (r5 != 0) goto L_0x0047
            int r5 = r2 % 2
            if (r5 == 0) goto L_0x002f
            goto L_0x0047
        L_0x002f:
            r5 = 480(0x1e0, float:6.73E-43)
            r6 = 640(0x280, float:8.97E-43)
            if (r7 < r2) goto L_0x0039
            if (r7 <= r6) goto L_0x004b
            if (r2 <= r5) goto L_0x004b
        L_0x0039:
            if (r7 > r2) goto L_0x0040
            if (r7 <= r5) goto L_0x004b
            if (r2 > r6) goto L_0x0040
            goto L_0x004b
        L_0x0040:
            int r7 = r7 / 2
            int r2 = r2 / 2
            int r4 = r4 + 1
            goto L_0x0023
        L_0x0047:
            r0.release()
            return
        L_0x004b:
            r8[r1] = r7     // Catch:{ all -> 0x0053 }
            r8[r3] = r2     // Catch:{ all -> 0x0053 }
            r0.release()
            return
        L_0x0053:
            r7 = move-exception
            goto L_0x0057
        L_0x0055:
            r7 = move-exception
            r0 = 0
        L_0x0057:
            if (r0 == 0) goto L_0x005c
            r0.release()
        L_0x005c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelvideoh265toh264.C92862f.m117174g(java.lang.String, int[]):void");
    }

    /* renamed from: h */
    public static boolean m117175h(String str) {
        Log.m105924i("MicroMsg.TransferUtil", "Check video format：h265 or h264？");
        return C98403m0.m127702b(str);
    }

    /* renamed from: i */
    public static void m117176i(String str, VideoTransPara videoTransPara) {
        String str2 = str;
        VideoTransPara videoTransPara2 = videoTransPara;
        if (videoTransPara2 == null) {
            Log.m105920e("MicroMsg.TransferUtil", "checkRemuxResult newPara == null");
        } else if (TextUtils.isEmpty(str)) {
            Log.m105921e("MicroMsg.TransferUtil", "checkRemuxResult path is empty, destPath:[%s]", str2);
        } else {
            PInt pInt = new PInt();
            PInt pInt2 = new PInt();
            PInt pInt3 = new PInt();
            PInt pInt4 = new PInt();
            PInt pInt5 = new PInt();
            C94555d.m119569e(str, pInt, pInt2, pInt3, pInt4, pInt5);
            float f = Util.getFloat(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("MMSightCheckSendVideoBitrateLimit"), 1.3f);
            int i = pInt5.value;
            int i2 = videoTransPara2.f267169g;
            if (((float) i) < f * ((float) i2)) {
                Log.m105925i("MicroMsg.TransferUtil", "checkRemuxResult success currentBitrate:[%d], maxBitrate:[%d]", Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105929w("MicroMsg.TransferUtil", "checkRemuxResult fail currentBitrate:[%d], maxBitrate:[%d]", Integer.valueOf(i), Integer.valueOf(i2));
            String str3 = str2 + ".check_temp";
            C86013q1.m106442c(str2, str3);
            C86013q1.m106447h(str);
            int remuxingVFS = SightVideoJNI.remuxingVFS(str3, str, videoTransPara2.f267166d, videoTransPara2.f267167e, videoTransPara2.f267169g, videoTransPara2.f267177r, 8, videoTransPara2.f267176q, 25.0f, (float) videoTransPara2.f267168f, (byte[]) null, 0, false, 0, 51);
            C115669n.INSTANCE.mo175913w(986, 119, 1);
            Log.m105925i("MicroMsg.TransferUtil", "checkRemuxResult speedTime:[%s], remuxingVFS ret:[%d]", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(remuxingVFS));
        }
    }

    /* JADX WARNING: type inference failed for: r0v46, types: [r80.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0263 A[Catch:{ Exception -> 0x02ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0276 A[Catch:{ Exception -> 0x02ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065 A[Catch:{ Exception -> 0x02ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b A[Catch:{ Exception -> 0x02ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093 A[Catch:{ Exception -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9 A[Catch:{ Exception -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7 A[Catch:{ Exception -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ea A[Catch:{ Exception -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f5 A[Catch:{ Exception -> 0x02cb }, LOOP:0: B:42:0x00f5->B:44:0x00f9, LOOP_START, PHI: r1 
      PHI: (r1v21 int) = (r1v20 int), (r1v22 int) binds: [B:40:0x00f0, B:44:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0102 A[Catch:{ Exception -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0103 A[Catch:{ Exception -> 0x02cb }, LOOP:1: B:48:0x0103->B:50:0x0107, LOOP_START, PHI: r1 
      PHI: (r1v31 int) = (r1v24 int), (r1v32 int) binds: [B:46:0x0100, B:50:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010e A[Catch:{ Exception -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0114 A[Catch:{ Exception -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014c A[Catch:{ Exception -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d7  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m117177j(java.lang.String r51, java.lang.String r52, com.tencent.p014mm.modelcontrol.VideoTransPara r53, boolean r54) {
        /*
            r11 = r51
            r12 = r52
            r13 = r53
            java.lang.Class<eu.e> r0 = p509eu.C86680e.class
            java.lang.String r1 = "MicroMsg.TransferUtil"
            java.lang.String r2 = "Begin to local transfer, hardEncode:%s"
            r14 = 1
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r54)
            r15 = 0
            r3[r15] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            f267511b = r15
            com.tencent.mm.modelvideoh265toh264.f$a r8 = new com.tencent.mm.modelvideoh265toh264.f$a
            r1 = r8
            r2 = r51
            r3 = r52
            r4 = r53
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            r7 = -1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()     // Catch:{ Exception -> 0x02ce }
            if (r1 == 0) goto L_0x004a
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            k40.a r1 = f40.C86709a0.m107533q(r1)     // Catch:{ Exception -> 0x02ce }
            lc3.b r1 = (lc3.C10485b) r1     // Catch:{ Exception -> 0x02ce }
            pj.f r1 = r1.vh0()     // Catch:{ Exception -> 0x02ce }
            java.lang.String r2 = "HEVCTranscodeMediaCodec"
            int r1 = r1.mo107404b(r2, r14)     // Catch:{ Exception -> 0x02ce }
            if (r1 != r14) goto L_0x0048
            goto L_0x005e
        L_0x0048:
            r1 = 0
            goto L_0x005f
        L_0x004a:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN     // Catch:{ Exception -> 0x02ce }
            com.tencent.mm.ipcinvoker.type.IPCVoid r2 = new com.tencent.mm.ipcinvoker.type.IPCVoid     // Catch:{ Exception -> 0x02ce }
            r2.<init>()     // Catch:{ Exception -> 0x02ce }
            java.lang.Class<com.tencent.mm.modelvideoh265toh264.f$b> r3 = com.tencent.p014mm.modelvideoh265toh264.C92862f.C1309b.class
            android.os.Parcelable r1 = com.tencent.p014mm.ipcinvoker.C80907o.m98783f(r1, r2, r3)     // Catch:{ Exception -> 0x02ce }
            com.tencent.mm.ipcinvoker.type.IPCBoolean r1 = (com.tencent.p014mm.ipcinvoker.type.IPCBoolean) r1     // Catch:{ Exception -> 0x02ce }
            if (r1 == 0) goto L_0x005e
            boolean r1 = r1.f10312d     // Catch:{ Exception -> 0x02ce }
            goto L_0x005f
        L_0x005e:
            r1 = 1
        L_0x005f:
            gj.m r2 = p156gj.C107835h0.f322856m     // Catch:{ Exception -> 0x02ce }
            int r2 = r2.f322898f0     // Catch:{ Exception -> 0x02ce }
            if (r2 == r7) goto L_0x006b
            if (r2 != r14) goto L_0x0069
            r6 = 1
            goto L_0x0071
        L_0x0069:
            r6 = 0
            goto L_0x0071
        L_0x006b:
            if (r1 != 0) goto L_0x006f
            r3 = 1
            goto L_0x0070
        L_0x006f:
            r3 = 0
        L_0x0070:
            r6 = r3
        L_0x0071:
            java.lang.String r3 = "MicroMsg.TransferUtil"
            java.lang.String r4 = "serverConfigMediaCodec: %s, dynamicConfigX264: %s, useX264: %s"
            r5 = 3
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x02cb }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x02cb }
            r7[r15] = r1     // Catch:{ Exception -> 0x02cb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x02cb }
            r7[r14] = r1     // Catch:{ Exception -> 0x02cb }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x02cb }
            r2 = 2
            r7[r2] = r1     // Catch:{ Exception -> 0x02cb }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r7)     // Catch:{ Exception -> 0x02cb }
            r16 = 0
            if (r6 == 0) goto L_0x00a9
            com.tencent.mm.modelvideoh265toh264.h r0 = new com.tencent.mm.modelvideoh265toh264.h     // Catch:{ Exception -> 0x02cb }
            r0.<init>()     // Catch:{ Exception -> 0x02cb }
            r0.mo148344b(r11, r12, r13)     // Catch:{ Exception -> 0x02cb }
            r0.f310902p = r14     // Catch:{ Exception -> 0x02cb }
            r0.f310903q = r6     // Catch:{ Exception -> 0x02cb }
            r49 = r6
            r14 = r9
            r3 = 300000(0x493e0, double:1.482197E-318)
            r48 = 3
            goto L_0x01bc
        L_0x00a9:
            com.tencent.mm.plugin.sight.base.a r1 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r11, r14)     // Catch:{ Exception -> 0x02cb }
            if (r1 == 0) goto L_0x00e0
            int r7 = r1.f273447e     // Catch:{ Exception -> 0x02cb }
            if (r7 <= 0) goto L_0x00e0
            r3 = 1106247680(0x41f00000, float:30.0)
            float r4 = (float) r7     // Catch:{ Exception -> 0x02cb }
            float r3 = java.lang.Math.min(r3, r4)     // Catch:{ Exception -> 0x02cb }
            int r3 = (int) r3     // Catch:{ Exception -> 0x02cb }
            r13.f267168f = r3     // Catch:{ Exception -> 0x02cb }
            java.lang.String r4 = "MicroMsg.TransferUtil"
            java.lang.String r7 = "transfer h265 use 30fps, newPara.fps:%s, mediaInfo.frameRate:%s"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02cb }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x02cb }
            r5[r15] = r3     // Catch:{ Exception -> 0x02cb }
            int r3 = r1.f273447e     // Catch:{ Exception -> 0x02cb }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x02cb }
            r5[r14] = r3     // Catch:{ Exception -> 0x02cb }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r5)     // Catch:{ Exception -> 0x02cb }
            int r1 = r1.f273443a     // Catch:{ Exception -> 0x02cb }
            r5 = 3
            if (r1 <= 0) goto L_0x00e0
            int r1 = r1 * 3
            long r3 = (long) r1     // Catch:{ Exception -> 0x02cb }
            r17 = r3
            goto L_0x00e3
        L_0x00e0:
            r17 = 300000(0x493e0, double:1.482197E-318)
        L_0x00e3:
            int r1 = r13.f267154A     // Catch:{ Exception -> 0x02cb }
            if (r1 != r14) goto L_0x00ea
            r39 = 1
            goto L_0x00ec
        L_0x00ea:
            r39 = 0
        L_0x00ec:
            int r1 = r13.f267166d     // Catch:{ Exception -> 0x02cb }
            int r3 = r1 % 4
            if (r3 != 0) goto L_0x00f5
        L_0x00f2:
            r27 = r1
            goto L_0x00fc
        L_0x00f5:
            int r3 = r1 % 4
            if (r3 == 0) goto L_0x00f2
            int r1 = r1 + 1
            goto L_0x00f5
        L_0x00fc:
            int r1 = r13.f267167e     // Catch:{ Exception -> 0x02cb }
            int r3 = r1 % 3
            if (r3 != 0) goto L_0x0103
            goto L_0x010a
        L_0x0103:
            int r3 = r1 % 3
            if (r3 == 0) goto L_0x010a
            int r1 = r1 + 1
            goto L_0x0103
        L_0x010a:
            int r3 = r1 % 2
            if (r3 == 0) goto L_0x0110
            int r1 = r1 + 1
        L_0x0110:
            r28 = r1
            if (r54 == 0) goto L_0x014c
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x02cb }
            eu.e r0 = (p509eu.C86680e) r0     // Catch:{ Exception -> 0x02cb }
            r80.h$a r0 = r0.mo120820U8()     // Catch:{ Exception -> 0x02cb }
            int r7 = r13.f267169g     // Catch:{ Exception -> 0x02cb }
            int r4 = r13.f267168f     // Catch:{ Exception -> 0x02cb }
            int r3 = r13.f267157D     // Catch:{ Exception -> 0x02cb }
            int r1 = r13.f267158E     // Catch:{ Exception -> 0x02cb }
            r80.j0 r0 = (r80.C101359j0) r0     // Catch:{ Exception -> 0x02cb }
            r19 = r1
            r1 = r0
            r14 = 2
            r2 = r51
            r0 = r3
            r3 = r52
            r20 = r4
            r4 = r27
            r48 = 3
            r5 = r28
            r49 = r6
            r6 = r7
            r7 = r20
            r54 = r8
            r8 = r0
            r14 = r9
            r9 = r19
            r10 = r54
            r80.h r0 = r1.mo140842a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x02cb }
            goto L_0x01b4
        L_0x014c:
            r49 = r6
            r54 = r8
            r14 = r9
            r48 = 3
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x02cb }
            eu.e r0 = (p509eu.C86680e) r0     // Catch:{ Exception -> 0x02cb }
            r80.h$a r0 = r0.mo120820U8()     // Catch:{ Exception -> 0x02cb }
            int r1 = r13.f267169g     // Catch:{ Exception -> 0x02cb }
            int r2 = r13.f267168f     // Catch:{ Exception -> 0x02cb }
            int r3 = r13.f267157D     // Catch:{ Exception -> 0x02cb }
            int r4 = r13.f267158E     // Catch:{ Exception -> 0x02cb }
            r80.j0 r0 = (r80.C101359j0) r0     // Catch:{ Exception -> 0x02cb }
            r0.getClass()     // Catch:{ Exception -> 0x02cb }
            r80.r r0 = new r80.r     // Catch:{ Exception -> 0x02cb }
            java.lang.String r5 = ""
            if (r11 != 0) goto L_0x0173
            r21 = r5
            goto L_0x0175
        L_0x0173:
            r21 = r11
        L_0x0175:
            r22 = 1
            if (r12 != 0) goto L_0x017c
            r23 = r5
            goto L_0x017e
        L_0x017c:
            r23 = r12
        L_0x017e:
            r24 = 0
            r25 = 0
            r26 = 0
            r30 = 48000(0xbb80, float:6.7262E-41)
            r31 = 44100(0xac44, float:6.1797E-41)
            r32 = 1
            r34 = 0
            r36 = 0
            r38 = 1
            r42 = 0
            r43 = 0
            r44 = 0
            r80.l0 r5 = new r80.l0     // Catch:{ Exception -> 0x02cb }
            r6 = r54
            r5.<init>(r6)     // Catch:{ Exception -> 0x02cb }
            r46 = 7340032(0x700000, float:1.0285576E-38)
            r47 = 0
            r20 = 0
            r19 = r0
            r29 = r1
            r33 = r2
            r40 = r3
            r41 = r4
            r45 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)     // Catch:{ Exception -> 0x02cb }
        L_0x01b4:
            r3 = r17
            r50 = r16
            r16 = r0
            r0 = r50
        L_0x01bc:
            r1 = 0
            if (r0 == 0) goto L_0x01d5
            if (r49 == 0) goto L_0x01d5
            int r3 = m117173f(r51)     // Catch:{ Exception -> 0x01d1 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x01d1 }
            int r0 = r0.mo148346d(r1, r3)     // Catch:{ Exception -> 0x01d1 }
            m117172e(r0, r14)     // Catch:{ Exception -> 0x01d1 }
            r7 = -1
            goto L_0x0265
        L_0x01d1:
            r0 = move-exception
            r7 = -1
            goto L_0x02ae
        L_0x01d5:
            if (r16 == 0) goto L_0x0263
            java.lang.String r0 = "MicroMsg.TransferUtil"
            java.lang.String r5 = "start mediaCodecRemuxer remux callbackHasTriggered:%s waitDuration:%s"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x024c }
            boolean r6 = f267511b     // Catch:{ Exception -> 0x024c }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x024c }
            r8 = 0
            r7[r8] = r6     // Catch:{ Exception -> 0x024c }
            java.lang.Long r6 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x024c }
            r8 = 1
            r7[r8] = r6     // Catch:{ Exception -> 0x024c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r7)     // Catch:{ Exception -> 0x024c }
            r16.mo124208b()     // Catch:{ Exception -> 0x024c }
            boolean r0 = f267511b     // Catch:{ Exception -> 0x024c }
            if (r0 != 0) goto L_0x023d
            java.lang.Object r5 = f267510a     // Catch:{ Exception -> 0x024c }
            monitor-enter(r5)     // Catch:{ Exception -> 0x024c }
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x022b, all -> 0x0228 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x022b, all -> 0x0228 }
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_c2c_video_transfer_wait_timeout     // Catch:{ Exception -> 0x022b, all -> 0x0228 }
            r7 = -1
            int r0 = r0.mo58779Qe(r6, r7)     // Catch:{ Exception -> 0x0226 }
            long r8 = (long) r0     // Catch:{ Exception -> 0x0226 }
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0222
            java.lang.String r0 = "MicroMsg.TransferUtil"
            java.lang.String r1 = "force set wait timeout %s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0226 }
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0226 }
            r4 = 0
            r3[r4] = r2     // Catch:{ Exception -> 0x0226 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)     // Catch:{ Exception -> 0x0226 }
            r3 = r8
        L_0x0222:
            r5.wait(r3)     // Catch:{ Exception -> 0x0226 }
            goto L_0x0238
        L_0x0226:
            r0 = move-exception
            goto L_0x022d
        L_0x0228:
            r0 = move-exception
            r7 = -1
            goto L_0x023b
        L_0x022b:
            r0 = move-exception
            r7 = -1
        L_0x022d:
            java.lang.String r1 = "MicroMsg.TransferUtil"
            java.lang.String r2 = "wait mediaCodecRemux error"
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x023a }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r4)     // Catch:{ all -> 0x023a }
        L_0x0238:
            monitor-exit(r5)     // Catch:{ all -> 0x023a }
            goto L_0x023e
        L_0x023a:
            r0 = move-exception
        L_0x023b:
            monitor-exit(r5)     // Catch:{ all -> 0x023a }
            throw r0     // Catch:{ Exception -> 0x0247 }
        L_0x023d:
            r7 = -1
        L_0x023e:
            java.lang.String r0 = "MicroMsg.TransferUtil"
            java.lang.String r1 = "mediaCodecRemuxLock wait finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x0247 }
            goto L_0x0264
        L_0x0247:
            r0 = move-exception
            goto L_0x024e
        L_0x0249:
            r0 = move-exception
            goto L_0x02c5
        L_0x024c:
            r0 = move-exception
            r7 = -1
        L_0x024e:
            java.lang.String r1 = "MicroMsg.TransferUtil"
            java.lang.String r2 = "MediaCodecRemuxer remux, retry x264, error:%s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x02ad }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x02ad }
            r3 = 0
            r4[r3] = r0     // Catch:{ Exception -> 0x02ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)     // Catch:{ Exception -> 0x02ad }
            m117170c(r11, r12, r13, r14)     // Catch:{ Exception -> 0x02ad }
            goto L_0x0264
        L_0x0263:
            r7 = -1
        L_0x0264:
            r0 = 0
        L_0x0265:
            m117176i(r52, r53)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r1 = com.tencent.p014mm.plugin.sight.base.C94555d.m119568d(r51)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r2 = com.tencent.p014mm.plugin.sight.base.C94555d.m119568d(r52)     // Catch:{ Exception -> 0x02ad }
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r52)     // Catch:{ Exception -> 0x02ad }
            if (r3 != 0) goto L_0x0290
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x02ad }
            r17 = 354(0x162, double:1.75E-321)
            r19 = 243(0xf3, double:1.2E-321)
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r3 = "MicroMsg.TransferUtil"
            java.lang.String r4 = "dst path(%s) does not exist file"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x02ad }
            r5 = 0
            r6[r5] = r12     // Catch:{ Exception -> 0x02ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r6)     // Catch:{ Exception -> 0x02ad }
        L_0x0290:
            java.lang.String r3 = "MicroMsg.TransferUtil"
            java.lang.String r4 = "tranferToH264 result \nsrcPath:[%s], srcPathVal:[%s], \ndstPath:[%s], dstPathVal:[%s]"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x02ad }
            r6 = 0
            r5[r6] = r11     // Catch:{ Exception -> 0x02ad }
            r6 = 1
            r5[r6] = r1     // Catch:{ Exception -> 0x02ad }
            r1 = 2
            r5[r1] = r12     // Catch:{ Exception -> 0x02ad }
            r5[r48] = r2     // Catch:{ Exception -> 0x02ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)     // Catch:{ Exception -> 0x02ad }
            com.tencent.mm.modelvideoh265toh264.b r1 = com.tencent.p014mm.modelvideoh265toh264.C92861b.f267508d
            r1.mo126892c()
            r7 = r0
            goto L_0x02c4
        L_0x02ad:
            r0 = move-exception
        L_0x02ae:
            java.lang.String r1 = "MicroMsg.TransferUtil"
            java.lang.String r2 = "Local tranfer to H264 error: %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0249 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0249 }
            r4 = 0
            r3[r4] = r0     // Catch:{ all -> 0x0249 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r3)     // Catch:{ all -> 0x0249 }
            com.tencent.mm.modelvideoh265toh264.b r0 = com.tencent.p014mm.modelvideoh265toh264.C92861b.f267508d
            r0.mo126892c()
        L_0x02c4:
            return r7
        L_0x02c5:
            com.tencent.mm.modelvideoh265toh264.b r1 = com.tencent.p014mm.modelvideoh265toh264.C92861b.f267508d
            r1.mo126892c()
            throw r0
        L_0x02cb:
            r0 = move-exception
            r7 = -1
            goto L_0x02cf
        L_0x02ce:
            r0 = move-exception
        L_0x02cf:
            java.lang.String r1 = "MicroMsg.TransferUtil"
            java.lang.String r2 = "Local tranfer init failed: %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r4 = 0
            r3[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelvideoh265toh264.C92862f.m117177j(java.lang.String, java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara, boolean):int");
    }
}
