package ml0;

import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePremier;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import java.util.List;

/* renamed from: ml0.w */
public class C61498w {

    /* renamed from: a */
    public static boolean f174835a;

    /* renamed from: b */
    public static List<Runnable> f174836b = null;

    static {
        boolean z = BuildInfo.DEBUG;
    }

    /* renamed from: a */
    public static void m72203a() {
        if (!f174835a) {
            V2TXLiveDef.V2TXLiveLogConfig v2TXLiveLogConfig = new V2TXLiveDef.V2TXLiveLogConfig();
            v2TXLiveLogConfig.enableObserver = true;
            v2TXLiveLogConfig.logLevel = 1;
            v2TXLiveLogConfig.enableConsole = false;
            v2TXLiveLogConfig.enableLogFile = false;
            V2TXLivePremier.setLogConfig(v2TXLiveLogConfig);
            V2TXLivePremier.setObserver(new C34588v());
            List<Runnable> list = f174836b;
            if (list == null || list.isEmpty()) {
                f174836b = null;
            } else {
                for (Runnable run : f174836b) {
                    run.run();
                }
                f174836b.clear();
                f174836b = null;
            }
            f174835a = true;
        }
    }
}
