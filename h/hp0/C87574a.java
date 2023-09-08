package hp0;

import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82075b;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: hp0.a */
public class C87574a {

    /* renamed from: a */
    public static Map<String, C87575b> f253658a = new ConcurrentHashMap();

    /* renamed from: b */
    public static Map<String, IListener> f253659b = new HashMap();

    /* renamed from: c */
    public static ArrayList<String> f253660c = new ArrayList<>();

    /* renamed from: d */
    public static Map<String, Boolean> f253661d = new ConcurrentHashMap();

    /* renamed from: a */
    public static void m108908a(String str) {
        Log.m105924i("MicroMsg.Audio.AppBrandAudioClientService", "onCreate");
        ((ConcurrentHashMap) f253658a).clear();
        MMHandler mMHandler = C82075b.f240684a;
        Log.m105925i("MicroMsg.Audio.AudioApiTaskExecutor", "onCreate %s", str);
        if (C82075b.f240687d.incrementAndGet() == 1) {
            synchronized (C82075b.f240686c) {
                C82075b.m100789a();
            }
        }
        ((ConcurrentHashMap) f253661d).put(str, Boolean.TRUE);
    }

    /* renamed from: b */
    public static void m108909b(String str) {
        if (!((HashMap) f253659b).containsKey(str)) {
            Log.m105921e("MicroMsg.Audio.AppBrandAudioClientService", "appId:%s not exist the appId for listener", str);
            return;
        }
        Log.m105919d("MicroMsg.Audio.AppBrandAudioClientService", "removeAudioPlayerListener,appId:%s", str);
        f253660c.remove(str);
        IListener iListener = (IListener) ((HashMap) f253659b).remove(str);
        if (iListener != null) {
            iListener.dead();
        }
    }
}
