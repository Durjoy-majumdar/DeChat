package n41;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import k31.C117373a;
import m31.C117520a;
import m41.C117534a;
import o31.C11345b;

/* renamed from: n41.a */
public class C117607a {
    /* renamed from: a */
    public static void m165876a(Object obj) {
        C117520a aVar;
        if (obj != null && C117534a.m165788k(obj)) {
            try {
                Class<?> cls = obj.getClass();
                if (cls.isAnnotationPresent(C117520a.class) && (aVar = (C117520a) cls.getAnnotation(C117520a.class)) != null) {
                    C117373a xx02 = C117373a.xx0();
                    C11345b pageId = aVar.pageId();
                    int policy = aVar.policy();
                    int routeRule = aVar.routeRule();
                    xx02.mo86178qr(obj, pageId);
                    xx02.mo86146Mp(obj, (Map<String, Object>) null);
                    xx02.Mn0(obj, policy, routeRule);
                    C117373a.xx0().mo86179qs(obj, aVar.bizGroupId());
                }
            } catch (Exception e) {
                Log.m105920e("Amoeba.AnnotationUtils", "[checkPage] throw Exception : " + e.getMessage());
            }
        }
    }
}
