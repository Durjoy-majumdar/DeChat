package yu1;

import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import eb0.C86487f6;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p172io.flutter.embedding.engine.FlutterEngine;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: yu1.n */
public final class C39189n extends C87413o implements C32227p<FlutterEngine, Map<String, Object>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f105431d;

    /* renamed from: e */
    public final /* synthetic */ boolean f105432e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39189n(String str, boolean z) {
        super(2);
        this.f105431d = str;
        this.f105432e = z;
    }

    public Object invoke(Object obj, Object obj2) {
        Map map = (Map) obj2;
        C87412m.m108594g((FlutterEngine) obj, "<anonymous parameter 0>");
        C87412m.m108594g(map, "paramsBuilder");
        map.put("TalkerUsername", this.f105431d);
        String s = C75592q0.m90789s();
        C87412m.m108593f(s, "getUsernameFromUserInfo()");
        map.put("MyUserName", s);
        map.put("IsVideoMode", Boolean.valueOf(this.f105432e));
        String a = C86487f6.m107217a(4);
        if (a != null) {
            for (String str : C112550d0.m153785U(a, new String[]{";"}, false, 0, 6, (Object) null)) {
                long j = Util.getLong(str, 0);
                if (Util.getLong("28002100", 0) < j && j <= Util.getLong("28002135", 0)) {
                    map.put("HadShowAudioMenu", Boolean.TRUE);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
