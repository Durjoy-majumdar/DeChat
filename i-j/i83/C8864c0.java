package i83;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import e93.C7605i;
import ei3.C86522b;
import f81.C7998c;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import rx3.C13601g;
import rx3.C36570n;
import t83.C13846d;
import z93.C16128a;

@C86522b(dependencies = {C7998c.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: i83.c0 */
public class C8864c0 extends C86301e {
    public void onCreate(Context context) {
        C13846d.f38986a.mo13176a();
        C13601g gVar = C16128a.f43314a;
        C7605i iVar = C7605i.f25872b;
        Map map = (Map) ((C36570n) C16128a.f43314a).getValue();
        C87412m.m108594g(map, "jsApiList");
        ((HashMap) C7605i.f25873c).clear();
        ((HashMap) C7605i.f25873c).putAll(map);
        Log.m105924i("MicroMsg.XWeb.PluginWebView", "init DefaultJsApiPool");
    }
}
