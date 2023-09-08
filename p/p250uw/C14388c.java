package p250uw;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import li2.C10531a;
import mi2.C10892a;
import mi2.C10897e;
import p256vw.C15014e;
import p256vw.C15015f;
import p256vw.C15016h;
import rx3.C13601g;
import rx3.C36570n;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: uw.c */
public class C14388c extends C86301e implements C15015f {
    /* renamed from: bo */
    public void mo13690bo(Context context, String str, int i, int i2, C15014e eVar) {
        C10531a.m10449a(context, new C15016h(str, i, i2, eVar));
    }

    /* renamed from: lt */
    public void mo13691lt(Context context, C15016h hVar) {
        C10531a.m10449a(context, hVar);
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        if (MMApplicationContext.isMainProcess()) {
            C13601g gVar = C10892a.f32514a;
            C10897e eVar = C10897e.f32521b;
            Map map = (Map) ((C36570n) C10892a.f32514a).getValue();
            C87412m.m108594g(map, "jsApiList");
            ((HashMap) C10897e.f32522c).clear();
            ((HashMap) C10897e.f32522c).putAll(map);
        }
    }
}
