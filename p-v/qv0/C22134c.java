package qv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import sf0.C77702q0;

/* renamed from: qv0.c */
public final class C22134c {

    /* renamed from: qv0.c$a */
    public static final class C22135a {
        public C22135a(C8480h hVar) {
        }
    }

    static {
        new C22135a((C8480h) null);
    }

    /* renamed from: a */
    public static final void m25609a(String str, Object obj) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(obj, "value");
        StringBuilder sb = new StringBuilder();
        sb.append("update() called with: key = ");
        sb.append(str);
        sb.append(", value = ");
        sb.append(obj);
        sb.append(" stack:");
        int i = C77702q0.f226484a;
        sb.append(new C77702q0.C77703a());
        Log.m105918d("BackupReport", sb.toString());
    }
}
