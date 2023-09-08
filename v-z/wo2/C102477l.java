package wo2;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx3.C13604l;
import sx3.C64197v;
import vr2.C37817q;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: wo2.l */
public final class C102477l {

    /* renamed from: a */
    public static final C102477l f301757a = new C102477l();

    /* renamed from: b */
    public static final List<C13604l<Double, Double>> f301758b;

    /* renamed from: wo2.l$a */
    public static final class C102478a implements Runnable {

        /* renamed from: d */
        public static final C102478a f301759d = new C102478a();

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils$report$1");
            try {
                C102477l lVar = C102477l.f301757a;
                C102477l.m135265a(lVar, "video/avc");
                C102477l.m135265a(lVar, "video/hevc");
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils$report$1");
        }
    }

    static {
        Double valueOf = Double.valueOf(2880.0d);
        Double valueOf2 = Double.valueOf(1080.0d);
        f301758b = C64197v.m75537f(new C13604l(valueOf, valueOf2), new C13604l(Double.valueOf(2160.0d), valueOf2), new C13604l(Double.valueOf(1920.0d), valueOf2), new C13604l(Double.valueOf(1920.0d), Double.valueOf(720.0d)), new C13604l(Double.valueOf(1440.0d), Double.valueOf(720.0d)), new C13604l(Double.valueOf(1280.0d), Double.valueOf(720.0d)), new C13604l(Double.valueOf(1440.0d), Double.valueOf(2160.0d)), new C13604l(Double.valueOf(1440.0d), Double.valueOf(1620.0d)), new C13604l(Double.valueOf(1440.0d), Double.valueOf(1440.0d)), new C13604l(Double.valueOf(960.0d), Double.valueOf(1440.0d)), new C13604l(Double.valueOf(960.0d), valueOf2), new C13604l(Double.valueOf(960.0d), Double.valueOf(960.0d)));
    }

    /* renamed from: a */
    public static final void m135265a(C102477l lVar, String str) {
        String str2;
        String str3;
        Iterator<T> it;
        String str4;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.CodecCapabilities capabilitiesForType2;
        C102477l lVar2 = lVar;
        String str5 = str;
        SnsMethodCalculate.markStartTimeMs("access$reportVideoCap", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        lVar.getClass();
        String str6 = "reportVideoCap";
        SnsMethodCalculate.markStartTimeMs(str6, "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        SnsMethodCalculate.markStartTimeMs("decoderCodecInfo$default", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        List<MediaCodecInfo> b = lVar2.mo142085b(str5, true);
        SnsMethodCalculate.markEndTimeMs("decoderCodecInfo$default", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        MediaCodecInfo.VideoCapabilities videoCapabilities = null;
        if (!(!((ArrayList) b).isEmpty())) {
            b = null;
        }
        MediaCodecInfo mediaCodecInfo = b != null ? b.get(0) : null;
        MediaCodecInfo.VideoCapabilities videoCapabilities2 = (mediaCodecInfo == null || (capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType(str5)) == null) ? null : capabilitiesForType2.getVideoCapabilities();
        if (videoCapabilities2 == null) {
            List<MediaCodecInfo> b2 = lVar2.mo142085b(str5, false);
            if (!(!((ArrayList) b2).isEmpty())) {
                b2 = null;
            }
            mediaCodecInfo = b2 != null ? b2.get(0) : null;
            if (!(mediaCodecInfo == null || (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str5)) == null)) {
                videoCapabilities = capabilitiesForType.getVideoCapabilities();
            }
            videoCapabilities2 = videoCapabilities;
        }
        if (videoCapabilities2 == null) {
            C37817q.m41545a("report_video_capability_in_landing_page", str5, 3, 0, "error in get codec!");
            str2 = str6;
        } else {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            if (mediaCodecInfo == null || (str3 = mediaCodecInfo.getName()) == null) {
                str3 = "null";
            }
            sb4.append(str3);
            sb4.append('|');
            sb.append(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            C102477l lVar3 = f301757a;
            Range<Integer> supportedWidths = videoCapabilities2.getSupportedWidths();
            C87412m.m108593f(supportedWidths, "videoCapabilities.supportedWidths");
            sb5.append(lVar3.mo142087e(supportedWidths));
            sb5.append('|');
            sb.append(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            Range<Integer> supportedHeights = videoCapabilities2.getSupportedHeights();
            C87412m.m108593f(supportedHeights, "videoCapabilities.supportedHeights");
            sb6.append(lVar3.mo142087e(supportedHeights));
            sb6.append('|');
            sb.append(sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            Range<Integer> supportedFrameRates = videoCapabilities2.getSupportedFrameRates();
            C87412m.m108593f(supportedFrameRates, "videoCapabilities.supportedFrameRates");
            sb7.append(lVar3.mo142087e(supportedFrameRates));
            sb7.append('|');
            sb.append(sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            Range<Integer> bitrateRange = videoCapabilities2.getBitrateRange();
            C87412m.m108593f(bitrateRange, "videoCapabilities.bitrateRange");
            sb8.append(lVar3.mo142087e(bitrateRange));
            sb8.append('|');
            sb.append(sb8.toString());
            C37817q.m41545a("report_video_capability_in_landing_page", str5, 2, 0, "" + sb);
            SnsMethodCalculate.markStartTimeMs("reportPairs", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
            StringBuilder sb9 = new StringBuilder();
            Iterator<T> it4 = f301758b.iterator();
            while (it4.hasNext()) {
                C13604l lVar4 = (C13604l) it4.next();
                double doubleValue = ((Number) lVar4.f38555d).doubleValue();
                double doubleValue2 = ((Number) lVar4.f38556e).doubleValue();
                int i = (int) doubleValue;
                int i2 = (int) doubleValue2;
                SnsMethodCalculate.markStartTimeMs("reportOnePair", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                boolean isSizeSupported = videoCapabilities2.isSizeSupported(i, i2);
                String str7 = "0";
                if (!isSizeSupported) {
                    str4 = str6;
                    it = it4;
                } else {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("");
                    it = it4;
                    SnsMethodCalculate.markStartTimeMs("getSupportedFrameRatesForNoError", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                    try {
                        Number upper = videoCapabilities2.getSupportedFrameRatesFor(i, i2).getUpper();
                        str4 = str6;
                        try {
                            String valueOf = String.valueOf((int) upper.doubleValue());
                            SnsMethodCalculate.markEndTimeMs("getSupportedFrameRatesForNoError", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                            str7 = valueOf;
                        } catch (Throwable unused) {
                            SnsMethodCalculate.markEndTimeMs("getSupportedFrameRatesForNoError", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                            sb10.append(str7);
                            str7 = sb10.toString();
                            Integer valueOf2 = Integer.valueOf(isSizeSupported ? 1 : 0);
                            SnsMethodCalculate.markEndTimeMs("reportOnePair", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                            sb9.append(valueOf2.intValue() + '|' + str7 + '|');
                            str6 = str4;
                            it4 = it;
                        }
                    } catch (Throwable unused2) {
                        str4 = str6;
                        SnsMethodCalculate.markEndTimeMs("getSupportedFrameRatesForNoError", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                        sb10.append(str7);
                        str7 = sb10.toString();
                        Integer valueOf22 = Integer.valueOf(isSizeSupported ? 1 : 0);
                        SnsMethodCalculate.markEndTimeMs("reportOnePair", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                        sb9.append(valueOf22.intValue() + '|' + str7 + '|');
                        str6 = str4;
                        it4 = it;
                    }
                    sb10.append(str7);
                    str7 = sb10.toString();
                }
                Integer valueOf222 = Integer.valueOf(isSizeSupported ? 1 : 0);
                SnsMethodCalculate.markEndTimeMs("reportOnePair", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                sb9.append(valueOf222.intValue() + '|' + str7 + '|');
                str6 = str4;
                it4 = it;
            }
            str2 = str6;
            String sb11 = sb9.toString();
            C87412m.m108593f(sb11, "result.toString()");
            SnsMethodCalculate.markEndTimeMs("reportPairs", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
            C37817q.m41545a("report_video_capability_in_landing_page", str5, 1, 0, "" + sb11);
        }
        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        SnsMethodCalculate.markEndTimeMs("access$reportVideoCap", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
    }

    /* renamed from: d */
    public static final void m135266d() {
        SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        ((C119157j) C119157j.f356862d).mo183875f(C102478a.f301759d);
        SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
    }

    /* renamed from: b */
    public final List<MediaCodecInfo> mo142085b(String str, boolean z) {
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("decoderCodecInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        int codecCount = MediaCodecList.getCodecCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                if (z) {
                    SnsMethodCalculate.markStartTimeMs("isSoftwareDecoder", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                    String name = codecInfoAt.getName();
                    if (name == null) {
                        name = "";
                    }
                    if (C112551y.m153819s(name, "OMX.google.", false) || C112551y.m153819s(name, "c2.android.", false)) {
                        SnsMethodCalculate.markEndTimeMs("isSoftwareDecoder", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                        z2 = true;
                    } else {
                        SnsMethodCalculate.markEndTimeMs("isSoftwareDecoder", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                        z2 = false;
                    }
                    if (z2) {
                    }
                }
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                C87412m.m108593f(supportedTypes, "types");
                int length = supportedTypes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C87412m.m108589b(supportedTypes[i2], str)) {
                        arrayList.add(codecInfoAt);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("decoderCodecInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        return arrayList;
    }

    /* renamed from: c */
    public final boolean mo142086c(int i, int i2) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.CodecCapabilities capabilitiesForType2;
        SnsMethodCalculate.markStartTimeMs("isSupportVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        try {
            SnsMethodCalculate.markStartTimeMs("decoderCodecInfo$default", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
            List<MediaCodecInfo> b = mo142085b("video/avc", true);
            SnsMethodCalculate.markEndTimeMs("decoderCodecInfo$default", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
            MediaCodecInfo.VideoCapabilities videoCapabilities = null;
            if (!(!((ArrayList) b).isEmpty())) {
                b = null;
            }
            MediaCodecInfo mediaCodecInfo = b != null ? b.get(0) : null;
            MediaCodecInfo.VideoCapabilities videoCapabilities2 = (mediaCodecInfo == null || (capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType("video/avc")) == null) ? null : capabilitiesForType2.getVideoCapabilities();
            if (videoCapabilities2 == null) {
                List<MediaCodecInfo> b2 = mo142085b("video/avc", false);
                if (!(true ^ ((ArrayList) b2).isEmpty())) {
                    b2 = null;
                }
                MediaCodecInfo mediaCodecInfo2 = b2 != null ? b2.get(0) : null;
                if (!(mediaCodecInfo2 == null || (capabilitiesForType = mediaCodecInfo2.getCapabilitiesForType("video/avc")) == null)) {
                    videoCapabilities = capabilitiesForType.getVideoCapabilities();
                }
                if (!(videoCapabilities == null || mediaCodecInfo2 == null)) {
                    mediaCodecInfo2.getName();
                }
                videoCapabilities2 = videoCapabilities;
            }
            if (videoCapabilities2 == null) {
                SnsMethodCalculate.markEndTimeMs("isSupportVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                return false;
            }
            boolean isSizeSupported = videoCapabilities2.isSizeSupported(i, i2);
            SnsMethodCalculate.markEndTimeMs("isSupportVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
            return isSizeSupported;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("isSupportVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
            return false;
        }
    }

    /* renamed from: e */
    public final String mo142087e(Range<Integer> range) {
        SnsMethodCalculate.markStartTimeMs("toReportString", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        String str = "" + range.getLower() + '_' + range.getUpper();
        SnsMethodCalculate.markEndTimeMs("toReportString", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        return str;
    }
}
