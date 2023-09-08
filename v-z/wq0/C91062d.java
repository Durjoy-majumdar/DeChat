package wq0;

import em0.C86534a;
import em0.C86536b;
import em0.C86537c;
import em0.C86546d;
import em0.C86547e;
import em0.C86548f;
import em0.C86567n;
import em0.C86569o;
import em0.C86570p;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ko0.C88249f;
import ml0.C88770j;
import ml0.C88773m;
import mo0.C88790e;

/* renamed from: wq0.d */
public final class C91062d {

    /* renamed from: a */
    public static volatile Set<String> f261236a = new HashSet();

    static {
        f261236a.add(C88770j.NAME);
        f261236a.add(C88773m.NAME);
        f261236a.add(C88249f.NAME);
        f261236a.add(C88790e.NAME);
        Collections.addAll(f261236a, new String[]{C86537c.NAME, C86534a.NAME, C86569o.NAME, C86570p.NAME, C86567n.NAME, C86548f.NAME, C86536b.NAME, C86547e.NAME, C86546d.NAME});
    }

    /* renamed from: a */
    public static void m114234a(String str) {
        ((HashSet) f261236a).add(str);
    }
}
