package th2;

import c30.C104289g;
import com.tencent.p014mm.autogen.mmdata.rpt.SightVideoLogStruct;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import java.util.ArrayList;
import z04.C112551y;

/* renamed from: th2.f */
public final class C101891f {

    /* renamed from: a */
    public static final C101891f f300035a = new C101891f();

    /* renamed from: b */
    public static SightVideoLogStruct f300036b = new SightVideoLogStruct();

    /* renamed from: c */
    public static long f300037c;

    /* renamed from: d */
    public static final ArrayList<String> f300038d = new ArrayList<>();

    /* renamed from: a */
    public final void mo141367a() {
        SightVideoLogStruct sightVideoLogStruct = f300036b;
        sightVideoLogStruct.f265899m = sightVideoLogStruct.mo86045b("RouterLog", mo141368b(), true);
        Log.m105924i("MicroMsg.VideoWidgetReporter", "videoWidgetReporter doReport >> " + f300037c + ", " + f300036b.mo1006q());
        SightVideoLogStruct sightVideoLogStruct2 = f300036b;
        if (!(sightVideoLogStruct2.f265874H == 0 || f300037c == 0)) {
            sightVideoLogStruct2.mo86054n();
        }
        f300037c = 0;
    }

    /* renamed from: b */
    public final String mo141368b() {
        StringBuilder sb = new StringBuilder();
        for (String append : f300038d) {
            sb.append(append);
            sb.append("#");
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "routeLog.toString()");
        return C112551y.m153814n(sb4, ",", ";", false);
    }

    /* renamed from: c */
    public final void mo141369c(int i) {
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setABAPramsUseDaemon >> " + i);
        f300036b.f265902p = i;
    }

    /* renamed from: d */
    public final void mo141370d(String str) {
        C87412m.m108594g(str, "workTagId");
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setBackgroundWorkTagId >> workTagId: " + str);
        SightVideoLogStruct sightVideoLogStruct = f300036b;
        sightVideoLogStruct.f265887U = sightVideoLogStruct.mo86045b("BackgroundWorkId", str, true);
    }

    /* renamed from: e */
    public final void mo141371e(C104289g gVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("setCameraDataJSON >> ");
        sb.append(gVar != null);
        Log.m105924i("MicroMsg.VideoWidgetReporter", sb.toString());
        if (gVar != null) {
            f300036b.f265895i = gVar.optBoolean("isUseCamera2") ? 2 : 1;
            f300036b.f265909w = gVar.optInt("CameraOpenCost");
            f300036b.f265910x = gVar.optInt("CameraFirstFrameCost");
            f300036b.f265911y = gVar.optInt("HighRecordStopWaitTime");
            f300036b.f265912z = gVar.optInt("LowRecordStopWaitTime");
            SightVideoLogStruct sightVideoLogStruct = f300036b;
            sightVideoLogStruct.f265867A = sightVideoLogStruct.mo86045b("RecordMuxerType", gVar.optBoolean("RecordMuxerType") ? "ffmpeg" : "mp4v2", true);
            SightVideoLogStruct sightVideoLogStruct2 = f300036b;
            long j = sightVideoLogStruct2.f265875I;
            if (j == 0) {
                j = gVar.optLong("OpenCameraTimeStamp");
            }
            sightVideoLogStruct2.f265875I = j;
            SightVideoLogStruct sightVideoLogStruct3 = f300036b;
            long j2 = sightVideoLogStruct3.f265876J;
            if (j2 == 0) {
                j2 = gVar.optLong("StartPreviewTimeStamp");
            }
            sightVideoLogStruct3.f265876J = j2;
            SightVideoLogStruct sightVideoLogStruct4 = f300036b;
            long j3 = sightVideoLogStruct4.f265877K;
            if (j3 == 0) {
                j3 = gVar.optLong("PreviewSuccessTImeStamp");
            }
            sightVideoLogStruct4.f265877K = j3;
        }
    }

    /* renamed from: f */
    public final void mo141372f(int i) {
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setCaptureHevcEncode:" + i);
        f300036b.f265884R = (long) i;
    }

    /* renamed from: g */
    public final void mo141373g(RecordConfigProvider recordConfigProvider) {
        String str;
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setConfigProvider");
        SightVideoLogStruct sightVideoLogStruct = f300036b;
        if (recordConfigProvider == null || (str = recordConfigProvider.f272900A) == null) {
            str = "";
        }
        sightVideoLogStruct.f265900n = sightVideoLogStruct.mo86045b("EditPathList", str, true);
        f300036b.f265904r = (recordConfigProvider != null ? C87412m.m108589b(recordConfigProvider.f272933u, Boolean.TRUE) : false) ^ true ? 1 : 0;
        SightVideoLogStruct sightVideoLogStruct2 = f300036b;
        sightVideoLogStruct2.f265871E = sightVideoLogStruct2.mo86045b("ConfigParam", String.valueOf(recordConfigProvider != null ? recordConfigProvider.f272926n : null), true);
    }

    /* renamed from: h */
    public final void mo141374h(int... iArr) {
        C87412m.m108594g(iArr, "editMaterials");
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setEditElementList");
        C104289g gVar = new C104289g();
        gVar.mo145953n("emoji", iArr[0]);
        gVar.mo145953n(MimeTypes.BASE_TYPE_TEXT, iArr[1]);
        gVar.mo145953n("music", iArr[2]);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "jsonObject.toString()");
        SightVideoLogStruct sightVideoLogStruct = f300036b;
        sightVideoLogStruct.f265901o = sightVideoLogStruct.mo86045b("EditElementList", C112551y.m153814n(gVar2, ",", ";", false), true);
    }

    /* renamed from: i */
    public final void mo141375i(int i, long j) {
        Log.m105924i("MicroMsg.VideoWidgetReporter", "exitType: " + i + ", sendType: " + j);
        SightVideoLogStruct sightVideoLogStruct = f300036b;
        sightVideoLogStruct.f265908v = i;
        sightVideoLogStruct.f265870D = j;
    }

    /* renamed from: j */
    public final void mo141376j(long j) {
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setFinishRecordTimeStamp >> " + j);
        f300036b.f265879M = j;
    }

    /* renamed from: k */
    public final void mo141377k(long j) {
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setInitRouterTimeStamp >> timeStamp: " + j);
        if (f300037c != 0) {
            Log.m105924i("MicroMsg.VideoWidgetReporter", "videoWidgetReporter doReport In setInitRouterTImeStamp");
            SightVideoLogStruct sightVideoLogStruct = f300036b;
            sightVideoLogStruct.f265899m = sightVideoLogStruct.mo86045b("RouterLog", mo141368b(), true);
            f300036b.mo86054n();
        }
        Log.m105924i("MicroMsg.VideoWidgetReporter", "videoWidgetReporter doReset");
        f300036b = new SightVideoLogStruct();
        f300038d.clear();
        f300037c = j;
        f300036b.f265874H = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0048, code lost:
        r1 = r2.toString();
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141378l(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "videoPath"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setMixVideoInfo >> "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.VideoWidgetReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 1
            com.tencent.mm.plugin.sight.base.a r2 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r8, r0)
            long r3 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
            r8 = 1024(0x400, float:1.435E-42)
            long r5 = (long) r8
            long r3 = r3 / r5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r5 = "setMixVideoInfo >> fileSize: "
            r8.append(r5)
            r8.append(r3)
            java.lang.String r5 = " KB"
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct r8 = f300036b
            if (r2 == 0) goto L_0x0058
            java.lang.String r1 = r2.toString()
            if (r1 == 0) goto L_0x0058
            r2 = 0
            java.lang.String r5 = ","
            java.lang.String r6 = ";"
            java.lang.String r1 = z04.C112551y.m153814n(r1, r5, r6, r2)
            goto L_0x005a
        L_0x0058:
            java.lang.String r1 = ""
        L_0x005a:
            java.lang.String r2 = "MixVideoInfo"
            java.lang.String r0 = r8.mo86045b(r2, r1, r0)
            r8.f265873G = r0
            com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct r8 = f300036b
            r8.f265888V = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th2.C101891f.mo141378l(java.lang.String):void");
    }

    /* renamed from: m */
    public final void mo141379m(int i) {
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setMuxResult >> " + i);
        f300036b.f265905s = i;
        mo141375i(1, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
        r6 = r6.toString();
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141380n(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "videoPath"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setPhotoAlbumVideoInfo >> "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.VideoWidgetReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 1
            com.tencent.mm.plugin.sight.base.a r6 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r6, r0)
            com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct r1 = f300036b
            if (r6 == 0) goto L_0x0036
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto L_0x0036
            r2 = 0
            java.lang.String r3 = ","
            java.lang.String r4 = ";"
            java.lang.String r6 = z04.C112551y.m153814n(r6, r3, r4, r2)
            goto L_0x0038
        L_0x0036:
            java.lang.String r6 = ""
        L_0x0038:
            java.lang.String r2 = "PhotoAlbumVideoInfo"
            java.lang.String r6 = r1.mo86045b(r2, r6, r0)
            r1.f265872F = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th2.C101891f.mo141380n(java.lang.String):void");
    }

    /* renamed from: o */
    public final void mo141381o(boolean z) {
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setRecordCameraRet >> type: " + z);
        f300036b.f265896j = z ^ true ? 1 : 0;
    }

    /* renamed from: p */
    public final void mo141382p(boolean z) {
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setRecordCpuCrop >> type: " + z);
        f300036b.f265893g = z ^ true ? 1 : 0;
    }

    /* renamed from: q */
    public final void mo141383q(boolean z) {
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setRecordDaemon >> type: " + z);
        f300036b.f265894h = z ^ true ? 1 : 0;
    }

    /* renamed from: r */
    public final void mo141384r(String str) {
        String str2;
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setRecordHighBitrateVideo >> filePath: " + str);
        C94554a c = C94555d.m119567c(str, true);
        SightVideoLogStruct sightVideoLogStruct = f300036b;
        if (c == null || (str2 = c.toString()) == null) {
            str2 = "";
        }
        sightVideoLogStruct.f265897k = sightVideoLogStruct.mo86045b("RecordHighBitrateVideo", str2, true);
    }

    /* renamed from: s */
    public final void mo141385s(String str) {
        String str2;
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setRecordLowBitrateVideo >> filePath: " + str);
        C94554a c = C94555d.m119567c(str, true);
        SightVideoLogStruct sightVideoLogStruct = f300036b;
        if (c == null || (str2 = c.toString()) == null) {
            str2 = "";
        }
        sightVideoLogStruct.f265898l = sightVideoLogStruct.mo86045b("RecordLowBitrateVideo", str2, true);
    }

    /* renamed from: t */
    public final void mo141386t(int i) {
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setSNSDoubleCheck >> " + i);
        f300036b.f265906t = i;
    }

    /* renamed from: u */
    public final void mo141387u(long j) {
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setStartRecordTimeStamp >> " + j);
        f300036b.f265878L = j;
    }

    /* renamed from: v */
    public final void mo141388v(int i) {
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setUseDaemon >> " + i);
        f300036b.f265903q = i;
    }
}
