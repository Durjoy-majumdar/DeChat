package a43;

import android.content.Context;
import android.media.ToneGenerator;
import android.provider.Settings;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WCWebUpdater;
import java.util.HashMap;

/* renamed from: a43.a */
public class C103303a {

    /* renamed from: c */
    public static final HashMap<String, Integer> f304583c;

    /* renamed from: d */
    public static Context f304584d;

    /* renamed from: a */
    public Object f304585a;

    /* renamed from: b */
    public ToneGenerator f304586b;

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        f304583c = hashMap;
        hashMap.put("1", 1);
        hashMap.put("2", 2);
        hashMap.put("3", 3);
        hashMap.put(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, 4);
        hashMap.put(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, 5);
        hashMap.put(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, 6);
        hashMap.put("7", 7);
        hashMap.put("8", 8);
        hashMap.put("9", 9);
        hashMap.put("0", 0);
        hashMap.put("#", 11);
        hashMap.put("*", 10);
    }

    public C103303a(Context context) {
        Object obj = new Object();
        this.f304585a = obj;
        f304584d = context;
        if (context != null) {
            try {
                synchronized (obj) {
                    boolean z = true;
                    if (Settings.System.getInt(f304584d.getContentResolver(), "dtmf_tone", 1) != 1) {
                        z = false;
                    }
                    if (z && this.f304586b == null) {
                        this.f304586b = new ToneGenerator(3, 66);
                    }
                }
            } catch (Exception e) {
                Log.m105918d("MicroMsg.DTMFToneGenerator", "获取音频发生器单例失败！！！");
                Log.m105918d("MicroMsg.DTMFToneGenerator", e.getMessage());
                this.f304586b = null;
            }
        }
    }
}
