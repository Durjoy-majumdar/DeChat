package p160gy;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1574a3;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import do2.C97503a;
import ei3.C86522b;
import p166hy.C60229z;

@C86522b
/* renamed from: gy.g */
public class C98283g extends C86301e implements C60229z {
    public String O10() {
        SnsMethodCalculate.markStartTimeMs("getSysUserAgent", "com.tencent.mm.feature.sns.AdDeviceInfoService");
        String d = C97503a.m125623d();
        SnsMethodCalculate.markEndTimeMs("getSysUserAgent", "com.tencent.mm.feature.sns.AdDeviceInfoService");
        return d;
    }

    public String Uc0() {
        String nullAsNil;
        SnsMethodCalculate.markStartTimeMs("getAllDeviceInfoForJsapi", "com.tencent.mm.feature.sns.AdDeviceInfoService");
        synchronized (C97503a.class) {
            SnsMethodCalculate.markStartTimeMs("getAllDeviceInfoForJsapi", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            C97503a.C97504a aVar = new C97503a.C97504a();
            C97503a.C97504a.m125624a(aVar, true, false);
            nullAsNil = Util.nullAsNil(C97503a.C97504a.m125625b(aVar));
            SnsMethodCalculate.markEndTimeMs("getAllDeviceInfoForJsapi", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        }
        SnsMethodCalculate.markEndTimeMs("getAllDeviceInfoForJsapi", "com.tencent.mm.feature.sns.AdDeviceInfoService");
        return nullAsNil;
    }

    public String d00() {
        SnsMethodCalculate.markStartTimeMs("getImeiWx", "com.tencent.mm.feature.sns.AdDeviceInfoService");
        String b = C97503a.m125621b();
        SnsMethodCalculate.markEndTimeMs("getImeiWx", "com.tencent.mm.feature.sns.AdDeviceInfoService");
        return b;
    }

    /* renamed from: r4 */
    public String mo85224r4() {
        SnsMethodCalculate.markStartTimeMs(C1574a3.NAME, "com.tencent.mm.feature.sns.AdDeviceInfoService");
        String c = C97503a.m125622c();
        SnsMethodCalculate.markEndTimeMs(C1574a3.NAME, "com.tencent.mm.feature.sns.AdDeviceInfoService");
        return c;
    }

    /* renamed from: rD */
    public String mo85225rD() {
        SnsMethodCalculate.markStartTimeMs("getAllDeviceInfo", "com.tencent.mm.feature.sns.AdDeviceInfoService");
        String a = C97503a.m125620a();
        SnsMethodCalculate.markEndTimeMs("getAllDeviceInfo", "com.tencent.mm.feature.sns.AdDeviceInfoService");
        return a;
    }
}
