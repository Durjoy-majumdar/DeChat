package w10;

import android.content.Context;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.HashMap;
import java.util.Map;
import y10.C15928a;

/* renamed from: w10.a */
public class C15032a {
    /* renamed from: a */
    public static String m14200a(int i, Map map) {
        if (map == null) {
            map = new HashMap();
        }
        switch (i) {
            case 2:
                map.put(TPDownloadProxyEnum.USER_SSID, 10);
                break;
            case 3:
                map.put(TPDownloadProxyEnum.USER_SSID, 9);
                break;
            case 4:
                map.put(TPDownloadProxyEnum.USER_SSID, 11);
                break;
            case 5:
                map.put(TPDownloadProxyEnum.USER_SSID, 8);
                break;
            case 6:
                map.put(TPDownloadProxyEnum.USER_SSID, 12);
                break;
            case 7:
                map.put(TPDownloadProxyEnum.USER_SSID, 13);
                break;
        }
        return C15928a.m14856c(map);
    }

    /* renamed from: b */
    public static void m14201b(Context context, int i, int i2, int i3, int i4, int i5, String str) {
        C40314g.m43484c(context, i, i2, i3, i4, i5, str);
    }
}
