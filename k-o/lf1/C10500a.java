package lf1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: lf1.a */
public final class C10500a {

    /* renamed from: a */
    public static final C10500a f31736a = new C10500a();

    /* renamed from: a */
    public static void m10435a(C10500a aVar, int i, long j, int i2, long j2, boolean z, String str, int i3, int i4, boolean z2, String str2, int i5, Object obj) {
        if ((i5 & 64) != 0) {
            i3 = 0;
        }
        if ((i5 & 128) != 0) {
            i4 = 0;
        }
        if ((i5 & 256) != 0) {
            z2 = false;
        }
        if ((i5 & 512) != 0) {
            str2 = "";
        }
        aVar.getClass();
        C87412m.m108594g(str, "data");
        C87412m.m108594g(str2, "extraReportInfo");
        Log.m105924i("Finder.AdvertisementReporter", "doReport innerVersion=2 feedId=" + j + " commentScene=" + i2 + ", aid=" + j2 + ", isViewable=" + z + ", isVideoExpose=" + z2 + ", actionType=" + i + ", triggerSource=" + i3 + ", outerDuration=" + i4 + ", extraReportInfo=" + str2);
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[11];
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = Integer.valueOf(z ? 1 : z2 ? 2 : 0);
        objArr[2] = Long.valueOf(j2);
        objArr[3] = Integer.valueOf(i);
        objArr[4] = Integer.valueOf(i4);
        objArr[5] = C112551y.m153814n(str, ",", ";", false);
        objArr[6] = 0;
        objArr[7] = Integer.valueOf(i3);
        objArr[8] = Long.valueOf(j);
        objArr[9] = C112551y.m153814n(str2, ",", ";", false);
        objArr[10] = 2;
        nVar.mo160131h(27032, objArr);
    }
}
