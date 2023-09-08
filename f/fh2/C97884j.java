package fh2;

import android.graphics.Point;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.sdk.platformtools.Log;
import f72.C97842b;
import gy3.C87412m;
import i72.C108388k;
import i72.C108392r;

/* renamed from: fh2.j */
public final class C97884j {

    /* renamed from: a */
    public static final C97884j f287164a = new C97884j();

    /* renamed from: b */
    public static VideoTransPara f287165b = null;

    /* renamed from: c */
    public static int f287166c = -1;

    /* renamed from: d */
    public static boolean f287167d = false;

    /* renamed from: e */
    public static boolean f287168e = false;

    /* renamed from: f */
    public static int f287169f = 0;

    /* renamed from: g */
    public static int f287170g = -1;

    /* renamed from: h */
    public static int f287171h = -1;

    /* renamed from: a */
    public static final void m126370a(Point point) {
        C87412m.m108594g(point, "cropPreviewSize");
        int i = point.x;
        int i2 = point.y;
        Log.m105924i("MicroMsg.SightRecordConfig", "afterCameraOpen, cropPreviewWidth:" + i + ", cropPreviewHeight:" + i2 + ", recorderType:" + C108388k.f324540d.f324551a + ", resolutionLimit:" + f287166c);
        VideoTransPara videoTransPara = f287165b;
        if (videoTransPara == null) {
            return;
        }
        if (C108388k.f324540d.f324551a == 1) {
            if (i2 > videoTransPara.f267166d) {
                int i3 = f287166c;
                if (i3 == 1080) {
                    videoTransPara.f267166d = i2 / 2;
                    Log.m105924i("MicroMsg.SightRecordConfig", "afterCameraOpen ffempg 1080p, videoWidth:" + videoTransPara.f267166d);
                } else if (i3 == 720) {
                    videoTransPara.f267166d = (int) (((double) i2) * 0.75d);
                    Log.m105924i("MicroMsg.SightRecordConfig", "afterCameraOpen ffempg 720p, videoWidth:" + videoTransPara.f267166d);
                }
                videoTransPara.f267167e = (int) ((((float) i) / ((float) i2)) * ((float) videoTransPara.f267166d));
            } else {
                Log.m105924i("MicroMsg.SightRecordConfig", "afterCameraOpen ffmpeg use crop preview size");
                videoTransPara.f267166d = i2;
                videoTransPara.f267167e = i;
            }
            int i4 = videoTransPara.f267166d;
            if (i4 % 2 != 0) {
                videoTransPara.f267166d = i4 - 1;
            }
            int i5 = videoTransPara.f267167e;
            if (i5 % 2 != 0) {
                videoTransPara.f267167e = i5 - 1;
            }
            Log.m105924i("MicroMsg.SightRecordConfig", "afterCameraOpen ffmpeg final videoSize:" + videoTransPara.f267166d + 'x' + videoTransPara.f267167e);
            return;
        }
        int i6 = f287166c;
        if ((i6 == 720 || i6 == 540) && i2 < videoTransPara.f267166d) {
            Log.m105924i("MicroMsg.SightRecordConfig", "afterCameraOpen mediacodec 720p or 540p:" + f287166c + ", adjust video size");
            int i7 = f287166c;
            if (i7 == 540) {
                videoTransPara.f267166d = i2;
                Log.m105924i("MicroMsg.SightRecordConfig", "afterCameraOpen mediacodec 540p, videoWidth:" + videoTransPara.f267166d);
            } else if (i7 == 720) {
                videoTransPara.f267166d = (int) (((double) i2) * 0.75d);
                Log.m105924i("MicroMsg.SightRecordConfig", "afterCameraOpen mediacodec 720p, videoWidth:" + videoTransPara.f267166d);
            }
            float f = ((float) i) / ((float) i2);
            int i8 = videoTransPara.f267166d;
            videoTransPara.f267167e = (int) (f * ((float) i8));
            videoTransPara.f267166d = C97842b.m126284a(i8);
            videoTransPara.f267167e = C97842b.m126284a(videoTransPara.f267167e);
            Log.m105924i("MicroMsg.SightRecordConfig", "afterCameraOpen final adjust video size:" + videoTransPara.f267166d + 'x' + videoTransPara.f267167e);
        }
    }

    /* renamed from: b */
    public final boolean mo137209b() {
        C108392r rVar = C108388k.f324540d;
        if (rVar == null || !f287168e) {
            return false;
        }
        boolean z = rVar.f324551a == 1;
        Object a = C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Media_CaptureCpuCrop_Int, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("cpuCrop: recorderTypeCpuCrop:");
        sb.append(z);
        sb.append(", serverConfigUseCpuCrop:");
        sb.append(f287167d);
        sb.append(", swEnableHevc:");
        VideoTransPara videoTransPara = f287165b;
        Integer num = null;
        sb.append(videoTransPara != null ? Integer.valueOf(videoTransPara.f267164K) : null);
        sb.append(", hwEnableHevc:");
        VideoTransPara videoTransPara2 = f287165b;
        if (videoTransPara2 != null) {
            num = Integer.valueOf(videoTransPara2.f267163J);
        }
        sb.append(num);
        sb.append(", repairerConfig:");
        sb.append(a);
        Log.m105924i("MicroMsg.SightRecordConfig", sb.toString());
        if (!C87412m.m108589b(a, 0)) {
            return C87412m.m108589b(a, 1);
        }
        if (!z && !f287167d) {
            VideoTransPara videoTransPara3 = f287165b;
            return videoTransPara3 != null && videoTransPara3.f267164K == 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a6, code lost:
        if (com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getInt(r0, -1) != -1) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b8, code lost:
        if (f40.C86709a0.m107535s().mo121142i().mo119689j(r0, -1) != -1) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bc, code lost:
        r0 = false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137210c(com.tencent.p014mm.modelcontrol.VideoTransPara r17, int r18, boolean r19) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "videoTransPara"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "init videoTransPara:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.SightRecordConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            f287165b = r0
            f287169f = r18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ABA: snstimeline Use ABA methods to improve the capturing bitrate, abaSwitch:"
            r0.append(r1)
            com.tencent.mm.modelcontrol.VideoTransPara r1 = f287165b
            if (r1 == 0) goto L_0x0037
            int r1 = r1.f267180u
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            r0.append(r1)
            java.lang.String r1 = " videoBitrate: "
            r0.append(r1)
            com.tencent.mm.modelcontrol.VideoTransPara r1 = f287165b
            if (r1 == 0) goto L_0x004b
            int r1 = r1.f267169g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.modelcontrol.VideoTransPara r0 = f287165b
            i72.C108388k.m146838d(r0)
            gj.b0 r0 = p156gj.C107835h0.f322852i
            int r0 = r0.f322658g
            r1 = 1080(0x438, float:1.513E-42)
            r4 = 540(0x21c, float:7.57E-43)
            r5 = 720(0x2d0, float:1.009E-42)
            r6 = -1
            r7 = 2
            r8 = 0
            r9 = 1
            if (r0 == r6) goto L_0x0078
            r10 = r0 & 1
            if (r10 == 0) goto L_0x0078
            f287166c = r1
            java.lang.String r0 = "config set setResolutionLimit use strategyMask 1080p"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0162
        L_0x0078:
            if (r0 == r6) goto L_0x0086
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0086
            f287166c = r5
            java.lang.String r0 = "config set setResolutionLimit use strategyMask 720p"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0162
        L_0x0086:
            boolean r0 = i72.C108388k.f324539c
            if (r0 != 0) goto L_0x013a
            i72.r r0 = i72.C108388k.f324540d
            int r0 = r0.f324553c
            if (r0 > r9) goto L_0x013a
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LOCAL_SIGHT_SETTING_PRESET_INT_SYNC
            com.tencent.mm.plugin.mmsight.model.CaptureMMProxy r10 = com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy.getInstance()
            if (r10 == 0) goto L_0x00a9
            boolean r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
            if (r10 != 0) goto L_0x00a9
            com.tencent.mm.plugin.mmsight.model.CaptureMMProxy r10 = com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy.getInstance()
            int r0 = r10.getInt(r0, r6)
            if (r0 == r6) goto L_0x00bc
            goto L_0x00ba
        L_0x00a9:
            f40.C86709a0.m107528h()
            f40.o r10 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r10 = r10.mo121142i()
            int r0 = r10.mo119689j(r0, r6)
            if (r0 == r6) goto L_0x00bc
        L_0x00ba:
            r0 = 1
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            if (r0 == 0) goto L_0x00c1
            goto L_0x013a
        L_0x00c1:
            f287166c = r1
            java.lang.String r0 = "config set setResolutionLimit default 1080p"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            i72.r r0 = i72.C108388k.f324540d
            int r0 = r0.f324551a
            if (r0 != r9) goto L_0x0162
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r10 = "activity"
            java.lang.Object r0 = r0.getSystemService(r10)
            java.lang.String r10 = "null cannot be cast to non-null type android.app.ActivityManager"
            gy3.C87412m.m108592e(r0, r10)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            int r0 = r0.getLargeMemoryClass()
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r10 = f72.C97842b.m126299p(r10)
            android.graphics.Point r11 = f72.C97842b.m126294k()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "config set setResolutionLimit ffmpeg memoryClass:"
            r12.append(r13)
            r12.append(r0)
            java.lang.String r13 = ", totalMemory:"
            r12.append(r13)
            r12.append(r10)
            java.lang.String r13 = ", screenSize:"
            r12.append(r13)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
            r12 = 512(0x200, float:7.175E-43)
            if (r0 < r12) goto L_0x0132
            float r0 = (float) r10
            r10 = 1154981888(0x44d7a000, float:1725.0)
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0132
            int r0 = r11.x
            int r10 = r11.y
            int r0 = java.lang.Math.min(r0, r10)
            if (r0 < r1) goto L_0x0132
            f287166c = r1
            java.lang.String r0 = "config set setResolutionLimit ffmpeg memory fit use 1080p"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0162
        L_0x0132:
            f287166c = r4
            java.lang.String r0 = "config set setResolutionLimit ffmpeg memory not fit use 540p"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0162
        L_0x013a:
            i72.r r0 = i72.C108388k.f324540d
            int r0 = r0.f324557g
            f287166c = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "config set setResolutionLimit use recorderOption:"
            r0.append(r1)
            i72.r r1 = i72.C108388k.f324540d
            int r1 = r1.f324553c
            r0.append(r1)
            java.lang.String r1 = " resolutionLimit:"
            r0.append(r1)
            int r1 = f287166c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x0162:
            if (r19 == 0) goto L_0x033a
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            com.tencent.mm.modelcontrol.VideoTransPara r1 = f287165b
            if (r1 == 0) goto L_0x033a
            i72.r r10 = i72.C108388k.f324540d
            int r10 = r10.f324551a
            if (r10 != r7) goto L_0x033a
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r10 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r10)
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r11 = com.tencent.p014mm.p136ui.C85875k4.m106181f0(r11)
            if (r11 == 0) goto L_0x018a
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r10 = com.tencent.p014mm.p136ui.C85875k4.m106186i(r10)
        L_0x018a:
            com.tencent.mm.modelcontrol.VideoTransPara r11 = f287165b
            if (r11 == 0) goto L_0x01f0
            di3.d r11 = di3.C86312j.m106911c(r0)
            h81.h r11 = (h81.C32735h) r11
            h81.h$c r12 = h81.C32735h.C32737c.clicfg_video_align_long_side
            boolean r11 = r11.mo58784wf(r12, r9)
            if (r11 == 0) goto L_0x01b2
            int r11 = r10.x
            float r11 = (float) r11
            int r12 = r10.y
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r1.f267167e
            float r12 = (float) r12
            float r11 = r11 * r12
            int r11 = (int) r11
            r1.f267166d = r11
            int r11 = f72.C97842b.m126284a(r11)
            r1.f267166d = r11
            goto L_0x01c7
        L_0x01b2:
            int r11 = r10.y
            float r11 = (float) r11
            int r12 = r10.x
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r1.f267166d
            float r12 = (float) r12
            float r11 = r11 * r12
            int r11 = (int) r11
            r1.f267167e = r11
            int r11 = f72.C97842b.m126284a(r11)
            r1.f267167e = r11
        L_0x01c7:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "setVideoSize, MediaCodec encode, video size: "
            r11.append(r12)
            int r12 = r1.f267166d
            r11.append(r12)
            r12 = 120(0x78, float:1.68E-43)
            r11.append(r12)
            int r1 = r1.f267167e
            r11.append(r1)
            java.lang.String r1 = " screenSize:"
            r11.append(r1)
            r11.append(r10)
            java.lang.String r1 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x01f0:
            com.tencent.mm.modelcontrol.VideoTransPara r1 = f287165b
            if (r1 != 0) goto L_0x01f6
            goto L_0x033a
        L_0x01f6:
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_video_size_check
            boolean r0 = r0.mo58784wf(r10, r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "enable check:"
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            if (r0 != 0) goto L_0x021a
            goto L_0x033a
        L_0x021a:
            int r0 = f287170g
            if (r0 <= 0) goto L_0x0222
            int r0 = f287171h
            if (r0 > 0) goto L_0x0291
        L_0x0222:
            java.lang.String r0 = "video/avc"
            int r10 = android.media.MediaCodecList.getCodecCount()
            r11 = 0
            r12 = 0
        L_0x022b:
            if (r11 >= r10) goto L_0x0253
            android.media.MediaCodecInfo r13 = android.media.MediaCodecList.getCodecInfoAt(r11)
            boolean r14 = r13.isEncoder()
            if (r14 != 0) goto L_0x023a
            int r11 = r11 + 1
            goto L_0x022b
        L_0x023a:
            java.lang.String[] r14 = r13.getSupportedTypes()
            r15 = 0
        L_0x023f:
            int r3 = r14.length
            if (r15 >= r3) goto L_0x024f
            r3 = r14[r15]
            boolean r3 = gy3.C87412m.m108589b(r3, r0)
            if (r3 == 0) goto L_0x024c
            r12 = r13
            goto L_0x024f
        L_0x024c:
            int r15 = r15 + 1
            goto L_0x023f
        L_0x024f:
            int r11 = r11 + 1
            if (r12 == 0) goto L_0x022b
        L_0x0253:
            if (r12 != 0) goto L_0x0257
            goto L_0x033a
        L_0x0257:
            android.media.MediaCodecInfo$CodecCapabilities r3 = r12.getCapabilitiesForType(r0)
            android.media.MediaCodecInfo$VideoCapabilities r3 = r3.getVideoCapabilities()
            android.util.Range r3 = r3.getSupportedWidths()
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.String r10 = "codecInfo.getCapabilitie…ies.supportedWidths.upper"
            gy3.C87412m.m108593f(r3, r10)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            f287170g = r3
            android.media.MediaCodecInfo$CodecCapabilities r0 = r12.getCapabilitiesForType(r0)
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            android.util.Range r0 = r0.getSupportedHeights()
            java.lang.Comparable r0 = r0.getUpper()
            java.lang.String r3 = "codecInfo.getCapabilitie…es.supportedHeights.upper"
            gy3.C87412m.m108593f(r0, r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            f287171h = r0
        L_0x0291:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "deviceCapacityCheck widthLimit:"
            r0.append(r3)
            int r3 = f287170g
            r0.append(r3)
            java.lang.String r3 = " heightLimit:"
            r0.append(r3)
            int r3 = f287171h
            r0.append(r3)
            java.lang.String r3 = " target width:"
            r0.append(r3)
            int r3 = r1.f267166d
            r0.append(r3)
            java.lang.String r3 = " height:"
            r0.append(r3)
            int r3 = r1.f267167e
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            int r0 = f287170g
            if (r0 < r5) goto L_0x033a
            int r3 = f287171h
            if (r3 >= r5) goto L_0x02ce
            goto L_0x033a
        L_0x02ce:
            int r3 = r1.f267167e
            float r3 = (float) r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r5
            int r5 = r1.f267166d
            float r10 = (float) r5
            float r3 = r3 / r10
            r10 = 32
            if (r5 <= r0) goto L_0x0309
            int r0 = r0 + -50
            int r0 = f72.C97842b.m126284a(r0)
            r1.f267166d = r0
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            r1.f267167e = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "deviceCapacityCheck width limit size:"
            r0.append(r5)
            int r5 = r1.f267166d
            r0.append(r5)
            r0.append(r10)
            int r5 = r1.f267167e
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x0309:
            int r0 = r1.f267167e
            int r5 = f287171h
            if (r0 <= r5) goto L_0x033a
            int r5 = r5 + -50
            int r0 = f72.C97842b.m126284a(r5)
            r1.f267167e = r0
            float r0 = (float) r0
            float r0 = r0 / r3
            int r0 = (int) r0
            r1.f267166d = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "deviceCapacityCheck height limit size:"
            r0.append(r3)
            int r3 = r1.f267166d
            r0.append(r3)
            r0.append(r10)
            int r1 = r1.f267167e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x033a:
            com.tencent.mm.modelcontrol.VideoTransPara r0 = f287165b
            if (r0 != 0) goto L_0x0346
            java.lang.String r0 = "init error, videoParams is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            f287168e = r8
            return
        L_0x0346:
            if (r0 == 0) goto L_0x036c
            int r1 = f287166c
            if (r1 < r4) goto L_0x0365
            int r1 = r0.f267166d
            if (r1 <= 0) goto L_0x0365
            int r1 = r0.f267167e
            if (r1 <= 0) goto L_0x0365
            int r1 = r0.f267169g
            if (r1 <= 0) goto L_0x0365
            int r0 = r0.f267168f
            if (r0 > 0) goto L_0x035d
            goto L_0x0365
        L_0x035d:
            f287168e = r9
            java.lang.String r0 = "init config succ"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x036c
        L_0x0365:
            f287168e = r8
            java.lang.String r0 = "init error, param error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x036c:
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r1 = "VideoRecordUseCpuCrop"
            java.lang.String r0 = r0.mo107405c(r1)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r8)
            if (r0 != r9) goto L_0x0386
            r0 = 1
            goto L_0x0387
        L_0x0386:
            r0 = 0
        L_0x0387:
            gj.b0 r1 = p156gj.C107835h0.f322853j
            int r1 = r1.f322663l
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "serverConfigUseCpuCrop, serverConfigUseCpuCrop:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ", deviceConfigUseCpuCrop:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            if (r1 == r6) goto L_0x03af
            if (r1 != r9) goto L_0x03ae
            r0 = 1
            goto L_0x03af
        L_0x03ae:
            r0 = 0
        L_0x03af:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "final set useCpuCrop:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            f287167d = r0
            int r0 = f287169f
            if (r0 == r9) goto L_0x03cd
            if (r0 == r7) goto L_0x03cd
            goto L_0x044b
        L_0x03cd:
            fh2.e r0 = fh2.C32051e.f85290a
            int r1 = f287169f
            boolean r1 = r0.mo58470a(r8, r1)
            int r3 = f287169f
            boolean r0 = r0.mo58470a(r9, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkEnableHevc, hardwareEnableHevc:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ", softEnableHevc:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.modelcontrol.VideoTransPara r3 = f287165b
            if (r3 != 0) goto L_0x03fc
            goto L_0x03fe
        L_0x03fc:
            r3.f267164K = r0
        L_0x03fe:
            if (r3 != 0) goto L_0x0401
            goto L_0x040a
        L_0x0401:
            if (r0 != 0) goto L_0x0407
            if (r1 == 0) goto L_0x0407
            r0 = 1
            goto L_0x0408
        L_0x0407:
            r0 = 0
        L_0x0408:
            r3.f267163J = r0
        L_0x040a:
            if (r3 == 0) goto L_0x0411
            int r0 = r3.f267164K
            if (r0 != r9) goto L_0x0411
            r8 = 1
        L_0x0411:
            if (r8 == 0) goto L_0x0417
            i72.r r0 = i72.C108388k.f324540d
            r0.f324551a = r9
        L_0x0417:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "checkEnableHevc, hwEnableHevc:"
            r0.append(r1)
            com.tencent.mm.modelcontrol.VideoTransPara r1 = f287165b
            if (r1 == 0) goto L_0x042c
            int r1 = r1.f267163J
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x042d
        L_0x042c:
            r1 = 0
        L_0x042d:
            r0.append(r1)
            java.lang.String r1 = ", swEnableHevc:"
            r0.append(r1)
            com.tencent.mm.modelcontrol.VideoTransPara r1 = f287165b
            if (r1 == 0) goto L_0x0440
            int r1 = r1.f267164K
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            goto L_0x0441
        L_0x0440:
            r3 = 0
        L_0x0441:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x044b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh2.C97884j.mo137210c(com.tencent.mm.modelcontrol.VideoTransPara, int, boolean):void");
    }

    /* renamed from: d */
    public final String mo137211d() {
        return "cpuCrop:" + mo137209b() + ", recorderType:" + mo137212e() + ", resolutionLimit:" + f287166c + ", videoParams:" + f287165b;
    }

    /* renamed from: e */
    public final int mo137212e() {
        Object a = C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Media_CaptureSoft_Int, 0);
        if (!C87412m.m108589b(a, 0)) {
            return C87412m.m108589b(a, 1) ? 1 : 2;
        }
        C108392r rVar = C108388k.f324540d;
        if (rVar == null || !f287168e) {
            return 2;
        }
        return rVar.f324551a;
    }
}
