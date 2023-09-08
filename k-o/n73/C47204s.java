package n73;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

/* renamed from: n73.s */
public class C47204s {

    /* renamed from: a */
    public HashMap<Integer, C47188b> f126760a = new HashMap<>();

    /* renamed from: a */
    public void mo72268a(C47188b bVar) {
        for (Integer intValue : bVar.mo11243a()) {
            int intValue2 = intValue.intValue();
            Log.m105919d("MicroMsg.Wear.WearHttpServerLogic", "add funId %d %s", Integer.valueOf(intValue2), bVar);
            this.f126760a.put(Integer.valueOf(intValue2), bVar);
        }
    }
}
