package np0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: np0.c0 */
public enum C34964c0 implements C38174i<C34962b0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93860d;

    /* renamed from: np0.c0$a */
    public static final class C34965a {

        /* renamed from: a */
        public static final List<Object> f93861a = null;

        static {
            f93861a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93860d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93860d;
                if (obj == obj2) {
                    obj = C34962b0.INSTANCE;
                    this.f93860d = obj;
                }
            }
        }
        return (C34962b0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C34962b0.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34965a.f93861a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "WeAppPushCommand");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34962b0.class.getName();
    }
}
