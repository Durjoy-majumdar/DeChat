package ap3;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ap3.b */
public class C27997b {

    /* renamed from: b */
    public static C27997b f77270b = new C27997b();

    /* renamed from: a */
    public Map<C27998a, C27996a> f77271a = new HashMap();

    /* renamed from: ap3.b$a */
    public enum C27998a {
        HEAVY_USER_CONTACT,
        HEAVY_USER_SESSION,
        HEAVY_USER_STORAGE,
        HEAVY_USER_GAME
    }

    /* renamed from: a */
    public void mo55747a(C27998a aVar, C27996a aVar2) {
        if (aVar2 != null) {
            aVar2.f77269a = aVar.name();
            ((HashMap) this.f77271a).put(aVar, aVar2);
            Log.m105925i("HeavyUserLabelerCenter", "register %s %d", aVar2.f77269a, Integer.valueOf(aVar2.hashCode()));
        }
    }
}
