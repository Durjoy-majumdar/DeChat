package l03;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: l03.e */
public final class C34152e {

    /* renamed from: a */
    public static final C34152e f92126a = new C34152e();

    /* renamed from: b */
    public static HashMap<String, Integer> f92127b = new HashMap<>();

    /* renamed from: a */
    public final void mo59467a(String str, int i) {
        C87412m.m108594g(str, "mediaId");
        Log.m105924i("MicroMsg.SnsPredictDataReport", "setPredictStatsToReport >> " + str + ", " + i);
        f92127b.put(str, Integer.valueOf(i));
    }
}
