package lg0;

import a70.C112760b;
import android.content.SharedPreferences;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f62.C31924c1;
import java.util.Map;
import ob0.C35136m;
import p523fp.C32147e;

/* renamed from: lg0.a */
public class C10501a implements C31924c1 {
    /* renamed from: d */
    public static void m10436d(String str) {
        Log.m105925i("MicroMsg.ChangeLaunchImageNewXmlListener", "filePath: %s", str);
        if (!Util.isNullOrNil(str) && C86013q1.m106450k(str)) {
            String str2 = C112760b.m154225d() + "splashWelcomeImg";
            if (C86013q1.m106447h(str2)) {
                C86013q1.m106442c(str, str2);
            }
        }
    }

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        if (Util.nullAsNil(str).equals("ChangeLaunchImage") && map != null) {
            String str2 = map.get(".sysmsg.ChangeLaunchImage.BeginTime");
            String str3 = map.get(".sysmsg.ChangeLaunchImage.EndTime");
            String str4 = map.get(".sysmsg.ChangeLaunchImage.ResId.SubType");
            Log.m105925i("MicroMsg.ChangeLaunchImageNewXmlListener", "beginTime:%s,endTime:%s,subtype:%s", str2, str3, str4);
            if (!Util.isNullOrNil(str2, str3, str4)) {
                C115669n.INSTANCE.idkeyStat(723, 5, 1, false);
                int safeParseInt = Util.safeParseInt(str4);
                if (safeParseInt > 0) {
                    SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0);
                    sharedPreferences.edit().putLong("new_launch_image_begin_time", Util.safeParseLong(str2)).apply();
                    sharedPreferences.edit().putInt("new_launch_image_sub_type", safeParseInt).apply();
                    sharedPreferences.edit().putLong("new_launch_image_end_time", Util.safeParseLong(str3)).commit();
                    m10436d(((C32147e) C86312j.m106911c(C32147e.class)).mo58507AD(43, safeParseInt));
                }
            }
        }
    }
}
