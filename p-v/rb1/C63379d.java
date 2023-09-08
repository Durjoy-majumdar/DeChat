package rb1;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import te3.C64853yd0;

/* renamed from: rb1.d */
public class C63379d {
    /* renamed from: a */
    public static void m74735a(Map<String, String> map, C64853yd0 yd02) {
        if (map == null || yd02 == null) {
            Log.m105928w("MicroMsg.FavTagParser", "maps is null or item is null");
            return;
        }
        yd02.f186495e.clear();
        int i = 0;
        while (i < 1024) {
            StringBuilder sb = new StringBuilder();
            sb.append(".favitem.taglist.tag");
            sb.append(i > 0 ? Integer.valueOf(i) : "");
            String str = map.get(sb.toString());
            if (str == null) {
                break;
            }
            yd02.f186495e.add(str);
            i++;
        }
        if (!yd02.f186495e.isEmpty()) {
            Log.m105919d("MicroMsg.FavTagParser", "user def tag not empty, res=%s", yd02.f186495e);
        }
        yd02.f186494d.clear();
        int i2 = 0;
        while (i2 < 1024) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(".favitem.recommendtaglist.tag");
            sb4.append(i2 > 0 ? Integer.valueOf(i2) : "");
            String str2 = map.get(sb4.toString());
            if (str2 == null) {
                break;
            }
            yd02.f186494d.add(str2);
            i2++;
        }
        if (!yd02.f186494d.isEmpty()) {
            Log.m105919d("MicroMsg.FavTagParser", "recommended tag not empty, res=%s", yd02.f186494d);
        }
    }
}
