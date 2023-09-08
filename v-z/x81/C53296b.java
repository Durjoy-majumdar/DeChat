package x81;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import j81.C87906e;
import java.io.IOException;
import te3.C51789w60;
import u24.C90599h;

/* renamed from: x81.b */
public class C53296b {
    /* renamed from: a */
    public boolean mo73929a(String str, int i, String str2) {
        MultiProcessMMKV g;
        String str3;
        if (C90599h.m113511d(str) || i <= 0 || C90599h.m113511d(str2) || (g = C87906e.m109413g()) == null) {
            return false;
        }
        String valueOf = String.valueOf(i);
        if (C90599h.m113511d(str) || C90599h.m113511d(valueOf)) {
            str3 = null;
        } else {
            str3 = "mmkv_key_realtime_report_cache" + "_" + str + "_" + valueOf;
        }
        if (C90599h.m113511d(str3)) {
            return false;
        }
        C51789w60 w602 = new C51789w60();
        byte[] decodeBytes = g.decodeBytes(str3);
        if (decodeBytes == null || decodeBytes.length <= 0) {
            w602.f143875d = str;
            w602.f143876e = i;
        } else {
            try {
                w602.parseFrom(decodeBytes);
            } catch (Exception e) {
                Log.m105920e("EdgeComputingRtReportCache", "[EdgeComputingRtReportCache] save parse rtReportItem throw Exception : " + e.getMessage());
                return false;
            }
        }
        w602.f143877f.add(str2);
        try {
            Log.m105924i("EdgeComputingRtReportCache", "[EdgeComputingConfigService] rtReportItem encode mmkvEncode : " + g.encode(str3, w602.toByteArray()));
            return true;
        } catch (IOException e2) {
            Log.m105920e("EdgeComputingRtReportCache", "[EdgeComputingRtReportCache] rtReportItem encode throw IOException : " + e2.getMessage());
            return false;
        }
    }
}
