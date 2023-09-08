package rd0;

import gy3.C8479f0;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38172g;

/* renamed from: rd0.e */
public final class C48018e {

    /* renamed from: a */
    public static final C48018e f128802a = new C48018e();

    /* renamed from: b */
    public static final Map<String, C22222c> f128803b = new LinkedHashMap();

    /* renamed from: rd0.e$a */
    public static final class C48019a<T extends C15510f> implements C38172g {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<C22222c> f128804a;

        public C48019a(C8479f0<C22222c> f0Var) {
            this.f128804a = f0Var;
        }

        public boolean invoke(C15510f fVar) {
            this.f128804a.f27484d = ((C12971b) fVar).get();
            return true;
        }
    }

    /* renamed from: a */
    public final C22222c mo72802a(String str) {
        C87412m.m108594g(str, "name");
        C8479f0 f0Var = new C8479f0();
        T t = ((LinkedHashMap) f128803b).get(str);
        f0Var.f27484d = t;
        if (t == null) {
            C38166b.m41756c(C12971b.class, str, new C48019a(f0Var));
        }
        return (C22222c) f0Var.f27484d;
    }
}
