package com.tencent.p014mm.plugin.appbrand.video.player.thumb;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.internal.ConstValue;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import rx3.C13604l;
import sx3.C90364q0;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.d */
public final class C104818d {

    /* renamed from: a */
    public static final Map<String, String> f311303a = C90364q0.m113147f(new C13604l("User-Agent", "user_agent"), new C13604l("Cookie", "cookies"), new C13604l("Referer", "referer"));

    /* renamed from: a */
    public static final String m140485a() {
        String str;
        int i;
        String processName = MMApplicationContext.getProcessName();
        if (!(processName == null || processName.length() == 0)) {
            C87412m.m108593f(processName, ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
            int D = C112550d0.m153768D(processName, XVFSFile.PATH_SEPARATOR_CHAR, 0, false, 6, (Object) null);
            if (D >= 0 && (i = D + 1) <= processName.length()) {
                str = processName.substring(i);
                C87412m.m108593f(str, "this as java.lang.String).substring(startIndex)");
                Log.m105918d("MicroMsg.AppBrand.ThumbPlayerExt", "getSimpleProcessName, simpleProcessName: " + str);
                return str;
            }
        }
        str = FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
        Log.m105918d("MicroMsg.AppBrand.ThumbPlayerExt", "getSimpleProcessName, simpleProcessName: " + str);
        return str;
    }

    /* renamed from: b */
    public static final int m140486b(ITPPlayer iTPPlayer) {
        C87412m.m108594g(iTPPlayer, "<this>");
        long durationMs = iTPPlayer.getDurationMs();
        if (0 < durationMs) {
            return (int) ((iTPPlayer.getPlayableDurationMs() * ((long) 100)) / durationMs);
        }
        return 0;
    }

    /* renamed from: c */
    public static final void m140487c(ITPPlayer iTPPlayer, String str, Map<String, String> map) {
        T t;
        C87412m.m108594g(iTPPlayer, "<this>");
        C87412m.m108594g(str, "url");
        C87412m.m108594g(map, "headers");
        Log.m105918d("MicroMsg.AppBrand.ThumbPlayerExt", "setDataSourceWorkaround, url: " + str + ", headers: " + map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str2 = (String) next.getKey();
            Iterator<T> it = f311303a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C112551y.m153809i(str2, (String) ((Map.Entry) t).getKey(), true)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) t;
            if (entry != null) {
                Log.m105918d("MicroMsg.AppBrand.ThumbPlayerExt", "setDataSourceWorkaround, " + ((String) entry.getValue()) + ": " + ((String) next.getValue()));
                if (((String) linkedHashMap.put(entry.getValue(), next.getValue())) != null) {
                }
            }
            Log.m105918d("MicroMsg.AppBrand.ThumbPlayerExt", "setDataSourceWorkaround, " + ((String) next.getKey()) + ": " + ((String) next.getValue()));
            String str3 = (String) linkedHashMap.put(next.getKey(), next.getValue());
        }
        Log.m105918d("MicroMsg.AppBrand.ThumbPlayerExt", "setDataSourceWorkaround, headersSet: " + linkedHashMap);
        iTPPlayer.setDataSource(str, linkedHashMap);
    }
}
