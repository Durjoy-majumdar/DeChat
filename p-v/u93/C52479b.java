package u93;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Map;
import u93.C52480c;

/* renamed from: u93.b */
public final class C52479b implements C52480c.C52484d {

    /* renamed from: a */
    public final /* synthetic */ C1256g<Map<String, Object>> f146627a;

    public C52479b(C1256g<Map<String, Object>> gVar) {
        this.f146627a = gVar;
    }

    /* renamed from: a */
    public void mo73421a(Map<String, Object> map) {
        C87412m.m108594g(map, "result");
        Log.m105925i("MicroMsg.WebSearch.WebSearchJSApi", "AsyncInvokeLocationTask, data = %s", map);
        this.f146627a.mo894a(map);
    }
}
