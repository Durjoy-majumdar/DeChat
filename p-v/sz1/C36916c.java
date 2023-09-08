package sz1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: sz1.c */
public enum C36916c implements C38174i<C77815b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97955d;

    /* renamed from: sz1.c$a */
    public static final class C36917a {

        /* renamed from: a */
        public static final List<Object> f97956a = null;

        static {
            f97956a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97955d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97955d;
                if (obj == obj2) {
                    obj = new C77815b();
                    this.f97955d = obj;
                }
            }
        }
        return (C77815b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36917a.f97956a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C77815b.class.getName();
    }
}
