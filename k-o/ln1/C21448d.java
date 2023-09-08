package ln1;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.mmdata.rpt.BroadcastNearbyTabStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import h81.C59774i;
import z04.C112550d0;

/* renamed from: ln1.d */
public final class C21448d {

    /* renamed from: a */
    public static final C21448d f60723a = new C21448d();

    /* renamed from: b */
    public static String f60724b = "";

    /* renamed from: c */
    public static void m24264c(C21448d dVar, String str, String str2, String str3, String str4, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i, Object obj) {
        String str5;
        long j15;
        int i2 = i;
        String str6 = (i2 & 1) != 0 ? "" : str;
        String str7 = (i2 & 2) != 0 ? "" : str2;
        String str8 = (i2 & 4) != 0 ? "" : str3;
        String str9 = (i2 & 8) != 0 ? "" : str4;
        long j16 = (i2 & 16) != 0 ? 0 : j;
        long j17 = (i2 & 64) != 0 ? 0 : j3;
        long j18 = (i2 & 128) != 0 ? 0 : j4;
        long j19 = (i2 & 256) != 0 ? 0 : j5;
        long j25 = (i2 & 512) != 0 ? 0 : j6;
        long j26 = (i2 & 1024) != 0 ? 0 : j7;
        long j27 = (i2 & 2048) != 0 ? 0 : j8;
        long j28 = (i2 & 4096) != 0 ? 0 : j9;
        dVar.getClass();
        C87412m.m108594g(str6, "userName");
        C87412m.m108594g(str7, "country");
        C87412m.m108594g(str8, "city");
        C87412m.m108594g(str9, "district");
        String str10 = "";
        BroadcastNearbyTabStruct broadcastNearbyTabStruct = new BroadcastNearbyTabStruct();
        if (TextUtils.isEmpty(f60724b)) {
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = str10;
            }
            f60724b = Wb;
        }
        long j29 = j19;
        long j35 = j18;
        broadcastNearbyTabStruct.f48210d = broadcastNearbyTabStruct.mo86045b("sessionid", f60724b, true);
        broadcastNearbyTabStruct.f48211e = broadcastNearbyTabStruct.mo86045b("contextid", C10585g.f31934b, true);
        broadcastNearbyTabStruct.f48212f = broadcastNearbyTabStruct.mo86045b("clickTabContextid", C10585g.f31937e, true);
        broadcastNearbyTabStruct.f48213g = 0;
        broadcastNearbyTabStruct.f48220n = broadcastNearbyTabStruct.mo86045b("nearby_username", str6, true);
        broadcastNearbyTabStruct.f48222p = broadcastNearbyTabStruct.mo86045b("country", str7, true);
        broadcastNearbyTabStruct.f48221o = broadcastNearbyTabStruct.mo86045b("city", str8, true);
        try {
            str5 = C112550d0.m153801u(str9, " - ", false) ? str9.subSequence(C112550d0.m153769E(str9, " - ", 0, false, 6, (Object) null) + 3, str9.length()).toString() : str10;
            try {
                if (C112550d0.m153801u(str9, "公里", false)) {
                    j15 = Long.parseLong(str9.subSequence(0, C112550d0.m153769E(str9, "公里", 0, false, 6, (Object) null)).toString()) * ((long) 1000);
                } else {
                    if (C112550d0.m153801u(str9, "米", false)) {
                        j15 = Long.parseLong(str9.subSequence(0, C112550d0.m153769E(str9, "米", 0, false, 6, (Object) null)).toString());
                    }
                    j15 = 0;
                }
            } catch (Throwable th) {
                th = th;
                Log.m105920e("NearbyPersonReporter", th.toString());
                j15 = 0;
                broadcastNearbyTabStruct.f48214h = j15;
                broadcastNearbyTabStruct.f48215i = broadcastNearbyTabStruct.mo86045b("district", str5, true);
                broadcastNearbyTabStruct.f48216j = j16;
                broadcastNearbyTabStruct.f48217k = j2;
                broadcastNearbyTabStruct.f48218l = C31543z5.m39453c();
                broadcastNearbyTabStruct.f48219m = j17;
                broadcastNearbyTabStruct.f48223q = j35;
                broadcastNearbyTabStruct.f48224r = j29;
                broadcastNearbyTabStruct.f48225s = j25;
                broadcastNearbyTabStruct.f48226t = j26;
                broadcastNearbyTabStruct.f48227u = j27;
                broadcastNearbyTabStruct.f48228v = j28;
                broadcastNearbyTabStruct.mo86054n();
                Log.m105918d("NearbyPersonReporter", "report " + broadcastNearbyTabStruct.mo1006q());
            }
        } catch (Throwable th4) {
            th = th4;
            str5 = str10;
            Log.m105920e("NearbyPersonReporter", th.toString());
            j15 = 0;
            broadcastNearbyTabStruct.f48214h = j15;
            broadcastNearbyTabStruct.f48215i = broadcastNearbyTabStruct.mo86045b("district", str5, true);
            broadcastNearbyTabStruct.f48216j = j16;
            broadcastNearbyTabStruct.f48217k = j2;
            broadcastNearbyTabStruct.f48218l = C31543z5.m39453c();
            broadcastNearbyTabStruct.f48219m = j17;
            broadcastNearbyTabStruct.f48223q = j35;
            broadcastNearbyTabStruct.f48224r = j29;
            broadcastNearbyTabStruct.f48225s = j25;
            broadcastNearbyTabStruct.f48226t = j26;
            broadcastNearbyTabStruct.f48227u = j27;
            broadcastNearbyTabStruct.f48228v = j28;
            broadcastNearbyTabStruct.mo86054n();
            Log.m105918d("NearbyPersonReporter", "report " + broadcastNearbyTabStruct.mo1006q());
        }
        broadcastNearbyTabStruct.f48214h = j15;
        broadcastNearbyTabStruct.f48215i = broadcastNearbyTabStruct.mo86045b("district", str5, true);
        broadcastNearbyTabStruct.f48216j = j16;
        broadcastNearbyTabStruct.f48217k = j2;
        broadcastNearbyTabStruct.f48218l = C31543z5.m39453c();
        broadcastNearbyTabStruct.f48219m = j17;
        broadcastNearbyTabStruct.f48223q = j35;
        broadcastNearbyTabStruct.f48224r = j29;
        broadcastNearbyTabStruct.f48225s = j25;
        broadcastNearbyTabStruct.f48226t = j26;
        broadcastNearbyTabStruct.f48227u = j27;
        broadcastNearbyTabStruct.f48228v = j28;
        broadcastNearbyTabStruct.mo86054n();
        Log.m105918d("NearbyPersonReporter", "report " + broadcastNearbyTabStruct.mo1006q());
    }

    /* renamed from: a */
    public final void mo33623a(int i) {
        long j = 3;
        switch (i) {
            case 1:
                j = 1;
                break;
            case 2:
                j = 2;
                break;
            case 4:
                j = 4;
                break;
            case 5:
                j = 5;
                break;
            case 6:
                j = 6;
                break;
        }
        m24264c(this, (String) null, (String) null, (String) null, (String) null, 0, 3, j, 0, 0, 0, 0, 0, 0, 8095, (Object) null);
    }

    /* renamed from: b */
    public final void mo33624b(long j) {
        m24264c(this, "", (String) null, (String) null, (String) null, 0, j, 0, 0, 0, 0, 0, 0, 0, 8158, (Object) null);
    }
}
