package w50;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: w50.g */
public final class C15044g {

    /* renamed from: a */
    public static final C15044g f41178a = new C15044g();

    /* renamed from: b */
    public static final HashMap<String, Long> f41179b = new HashMap<>();

    /* renamed from: a */
    public final void mo14069a(String str, int i, String str2, String str3) {
        C87412m.m108594g(str, "event");
        C87412m.m108594g(str2, "tag");
        C87412m.m108594g(str3, "msg");
        HashMap<String, Long> hashMap = f41179b;
        Long l = hashMap.get(str);
        if (l == null) {
            l = 0L;
        }
        long longValue = l.longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - longValue > ((long) (i * 1000)) || WeChatEnvironment.hasDebugger()) {
            Log.m105924i(str2, "LiveIntervalLogUtil: " + str3);
            hashMap.put(str, Long.valueOf(currentTimeMillis));
        }
    }
}
