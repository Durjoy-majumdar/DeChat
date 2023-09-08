package h52;

import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: h52.l */
public final class C87451l {

    /* renamed from: a */
    public static final AtomicInteger f253412a = new AtomicInteger(1);

    /* renamed from: b */
    public static final AtomicInteger f253413b = new AtomicInteger(1);

    /* renamed from: c */
    public static final HashMap<String, C87449k> f253414c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<String, C87446i> f253415d = new HashMap<>();

    static {
        Log.m105924i("MicroMsg.MagicBrushNetworkFactory", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }
}
