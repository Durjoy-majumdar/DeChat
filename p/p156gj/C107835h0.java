package p156gj;

import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.autogen.events.DeviceInfoUpdateEvent;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;

/* renamed from: gj.h0 */
public final class C107835h0 {

    /* renamed from: a */
    public static C107843r f322844a = new C107843r();

    /* renamed from: b */
    public static C107825d f322845b = new C107825d();

    /* renamed from: c */
    public static C107823c f322846c = new C107823c();

    /* renamed from: d */
    public static C107827d0 f322847d = new C107827d0();

    /* renamed from: e */
    public static C107838j0 f322848e = new C107838j0();

    /* renamed from: f */
    public static C107847w f322849f = new C107847w();

    /* renamed from: g */
    public static C107824c0 f322850g = new C107824c0();

    /* renamed from: h */
    public static C107833g0 f322851h = new C107833g0();

    /* renamed from: i */
    public static C107822b0 f322852i = new C107822b0();

    /* renamed from: j */
    public static C107822b0 f322853j = new C107822b0();

    /* renamed from: k */
    public static C87197b f322854k = new C87197b();

    /* renamed from: l */
    public static int f322855l = -1;

    /* renamed from: m */
    public static C107841m f322856m = new C107841m();

    /* renamed from: n */
    public static C107844s f322857n = new C107844s();

    /* renamed from: a */
    public static String m146104a(Context context) {
        Map<String, String> map;
        try {
            Log.m105925i("MicroMsg.SrvDeviceInfo", "lm: getManufacturer CurrentLanguage is %s", LocaleUtil.getCurrentLanguage(context));
            C107824c0 c0Var = f322850g;
            if (!(c0Var == null || (map = c0Var.f322784a) == null)) {
                if (map.size() != 0) {
                    Map<String, String> map2 = f322850g.f322784a;
                    String str = map2.get(".manufacturerName." + LocaleUtil.getCurrentLanguage(context));
                    Log.m105925i("MicroMsg.SrvDeviceInfo", "lm: getManufacturer is %s", str);
                    if (!Util.isNullOrNil(str)) {
                        return str;
                    }
                    String str2 = f322850g.f322784a.get(".manufacturerName.en");
                    Log.m105925i("MicroMsg.SrvDeviceInfo", "lm: getManufacturer is %s", str2);
                    return !Util.isNullOrNil(str2) ? str2 : Build.MANUFACTURER;
                }
            }
            String str3 = Build.MANUFACTURER;
            Log.m105925i("MicroMsg.SrvDeviceInfo", "lm: getManufacturer return is %s", str3);
            return str3;
        } catch (Exception unused) {
            return Build.MANUFACTURER;
        }
    }

    /* renamed from: b */
    public static void m146105b(String str) {
        Log.m105925i("MicroMsg.SrvDeviceInfo", "update deviceInfo %s", str);
        if (str != null && str.length() > 0 && str.hashCode() != f322855l) {
            f322855l = str.hashCode();
            C107843r rVar = f322844a;
            rVar.f322920a = false;
            rVar.f322921b = 0;
            rVar.f322922c = 0;
            f322845b.mo158239a();
            f322846c.mo158236j();
            f322856m.mo158248b();
            f322847d.f322835a = 0;
            f322848e.f322859a = false;
            C107847w wVar = f322849f;
            wVar.f322932a = 0;
            wVar.f322933b = 0;
            f322850g.f322784a = null;
            C107833g0 g0Var = f322851h;
            g0Var.f322842a = false;
            g0Var.f322843b = 0;
            f322852i.mo158225a();
            f322853j.mo158225a();
            C87197b bVar = f322854k;
            bVar.f252862a = false;
            bVar.f252863b = "";
            if (new C107846v().mo158254a(str, f322844a, f322845b, f322846c, f322856m, f322847d, f322848e, f322849f, f322850g, f322851h, f322852i, bVar, f322853j)) {
                Log.m105924i("MicroMsg.SrvDeviceInfo", "steve: mCameraInfo.mSupportVoipBeauty = " + f322845b.f322794I + ", mVoipBeautyWhiteCfg=" + f322845b.f322795J);
                new DeviceInfoUpdateEvent().publish();
            }
        }
    }
}
