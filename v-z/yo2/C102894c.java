package yo2;

import android.os.Bundle;
import android.os.Looper;
import cc0.C92411b;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.remoteservice.C96897a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import p702ts.C78085c;

/* renamed from: yo2.c */
public final class C102894c implements C92411b.C0447b {

    /* renamed from: d */
    public C96897a f303714d;

    /* renamed from: e */
    public String f303715e;

    /* renamed from: f */
    public long f303716f;

    /* renamed from: g */
    public C92411b f303717g = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();

    public C102894c(C96897a aVar, String str, long j) {
        this.f303716f = j;
        this.f303714d = aVar;
        this.f303715e = str;
    }

    public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
        SnsMethodCalculate.markStartTimeMs("onGetLocation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
        SnsMethodCalculate.markEndTimeMs("onGetLocation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
        return false;
    }

    /* renamed from: u7 */
    public boolean mo489u7(boolean z, float f, float f2, int i, double d, double d2, double d3, Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onGetLocation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
        Log.m105924i("GeoServerRequester", "the onGetLocation is called, the longitude is " + f);
        try {
            SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            if (Looper.myLooper() != null) {
                this.f303717g.mo126408b(this);
            } else {
                new MMHandler(Looper.getMainLooper()).post(new C102893b(this));
            }
            SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("result", z);
            bundle2.putDouble("latitude", (double) f2);
            bundle2.putDouble("longitude", (double) f);
            bundle2.putDouble(TPReportKeys.Common.COMMON_NETWORK_SPEED, d);
            bundle2.putDouble("accuracy", d2);
            C96897a aVar = this.f303714d;
            if (aVar != null) {
                aVar.CLIENT_CALL(this.f303715e, Long.valueOf(this.f303716f), bundle2);
            }
        } catch (Throwable unused) {
            Log.m105920e("GeoServerRequester", "there is something wrong in onGetLocation");
        }
        SnsMethodCalculate.markEndTimeMs("onGetLocation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
        return false;
    }
}
