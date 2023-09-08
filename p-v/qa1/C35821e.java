package qa1;

import android.content.SharedPreferences;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.vendor.MIUI;
import di3.C86312j;
import f40.C86718e;
import h81.C32735h;
import java.util.Map;

/* renamed from: qa1.e */
public class C35821e implements C35819c {
    /* renamed from: a */
    public void mo60432a() {
        Map<String, String> parseXml;
        SharedPreferences u = C86718e.m107552u();
        boolean z = false;
        u.edit().putBoolean("keepaliveserviceswitch", false).commit();
        Class cls = C32735h.class;
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_specialscenesetingsswitch, -1);
        Log.m105925i("MicroMsg.NotificationSpecialSingleton", "iniNotificationSpecialSceneSwitchEnable() enable:%s", Integer.valueOf(Qe));
        if (Util.isEqual(Qe, 1)) {
            String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_specialscenesetingsswitchdetail, "");
            Log.m105925i("MicroMsg.NotificationSpecialSingleton", "specialSceneDetail %s", Y60);
            if (!Util.isNullOrNil(Y60) && (parseXml = XmlParser.parseXml(Y60, "manufacturerlist", (String) null)) != null) {
                int i = parseXml.containsKey(".manufacturerlist.size") ? Util.getInt(parseXml.get(".manufacturerlist.size"), 0) : 0;
                int i2 = Build.VERSION.SDK_INT;
                int i3 = 0;
                while (true) {
                    if (i3 >= i) {
                        break;
                    }
                    if (i3 == 0) {
                        String nullAsNil = Util.nullAsNil(parseXml.get(".manufacturerlist.manufacturer.name"));
                        if (("" + nullAsNil).equalsIgnoreCase(Build.MANUFACTURER)) {
                            z = MIUI.ifInMinAndMax(i2, Util.nullAsNil(parseXml.get(".manufacturerlist.manufacturer.sdkversionmin")), Util.nullAsNil(parseXml.get(".manufacturerlist.manufacturer.sdkversionmax")), Util.nullAsNil(parseXml.get(".manufacturerlist.manufacturer.versintime")));
                            break;
                        }
                    } else {
                        String nullAsNil2 = Util.nullAsNil(parseXml.get(".manufacturerlist.manufacturer" + i3 + ".name"));
                        if (("" + nullAsNil2).equalsIgnoreCase(Build.MANUFACTURER)) {
                            String nullAsNil3 = Util.nullAsNil(parseXml.get(".manufacturerlist.manufacturer" + i3 + ".sdkversionmin"));
                            String nullAsNil4 = Util.nullAsNil(parseXml.get(".manufacturerlist.manufacturer" + i3 + ".sdkversionmax"));
                            z = MIUI.ifInMinAndMax(i2, nullAsNil3, nullAsNil4, Util.nullAsNil(parseXml.get(".manufacturerlist.manufacturer" + i3 + ".versintime")));
                            break;
                        }
                    }
                    i3++;
                }
            }
            mo60433b(u, z);
        } else if (Util.isEqual(Qe, 0)) {
            mo60433b(u, false);
        } else if (Util.isEqual(Qe, 2)) {
            mo60433b(u, true);
        }
    }

    /* renamed from: b */
    public final void mo60433b(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putInt("special_scene_enable", z ? 1 : 0).commit();
        Log.m105925i("MicroMsg.NotificationSpecialSingleton", "setSpecialSceneEnable() enable: %s", Boolean.valueOf(z));
    }
}
