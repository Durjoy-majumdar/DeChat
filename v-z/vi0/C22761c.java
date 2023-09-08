package vi0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;

/* renamed from: vi0.c */
public class C22761c {

    /* renamed from: a */
    public HashMap<String, C22757a> f65474a = new HashMap<>();

    /* renamed from: a */
    public void mo35859a(C22757a aVar) {
        if (aVar == null || Util.isNullOrNil(aVar.f65464a)) {
            Log.m105920e("MicroMsg.AppbrandMediaCdnItemManager", "item is null or local id is null, ignore this add");
            return;
        }
        Log.m105925i("MicroMsg.AppbrandMediaCdnItemManager", "add cdn item, local id : %s, file path : %s", aVar.f65464a, aVar.f65465b);
        this.f65474a.put(aVar.f65464a, aVar);
    }
}
