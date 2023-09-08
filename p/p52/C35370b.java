package p52;

import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.magicbrush.C30180c0;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C31068j;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: p52.b */
public final class C35370b {

    /* renamed from: a */
    public static final C35370b f94703a = new C35370b();

    /* renamed from: b */
    public static final int f94704b = ((C30180c0) C86312j.m106911c(C30180c0.class)).getUin();

    /* renamed from: c */
    public static final HashMap<String, List<String>> f94705c = new HashMap<>();

    static {
        Log.m105924i("MicroMsg.MagicBrushStorageFactory", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    /* renamed from: a */
    public final C31068j mo60233a(String str, int i) {
        Map<String, C35372d> map = C35372d.f94707c;
        C87412m.m108594g(str, "bizName");
        String str2 = i + '-' + str;
        Map<String, C35372d> map2 = C35372d.f94707c;
        synchronized (map2) {
            if (!((LinkedHashMap) map2).keySet().contains(str2)) {
                map2.put(str2, new C35372d(i, str, "MagicBrushMMKVStorage#" + str + '#'));
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        Object obj = ((LinkedHashMap) map2).get(str2);
        C87412m.m108591d(obj);
        return (C35372d) obj;
    }
}
