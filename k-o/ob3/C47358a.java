package ob3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import u10.C52415a;

/* renamed from: ob3.a */
public class C47358a {

    /* renamed from: a */
    public Map<String, C47361c> f127092a = new ConcurrentHashMap();

    /* renamed from: ob3.a$b */
    public static class C47360b {

        /* renamed from: a */
        public static C47358a f127093a = new C47358a((C47359a) null);
    }

    /* renamed from: ob3.a$c */
    public class C47361c {

        /* renamed from: a */
        public int f127094a;

        /* renamed from: b */
        public long f127095b;

        public C47361c(C47358a aVar) {
        }
    }

    public C47358a(C47359a aVar) {
    }

    /* renamed from: a */
    public void mo72410a(String str, String str2, long j) {
        C47361c cVar = (C47361c) ((ConcurrentHashMap) this.f127092a).remove(MD5Util.getMD5String(str + str2));
        if (cVar != null) {
            int i = cVar.f127094a - 1;
            cVar.f127094a = i;
            long j2 = cVar.f127095b + j;
            cVar.f127095b = j2;
            if (i == 0) {
                Log.m105925i("MicroMsg.Wepkg.BatchUpdateReporter", "batch update size: %s", Long.valueOf(j2));
                C52415a.m58668a().mo62980b(1, "", String.valueOf(cVar.f127095b), 0);
            }
        }
    }
}
