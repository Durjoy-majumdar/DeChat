package np0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: np0.n */
public enum C34975n implements C38174i<C89048m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93888d;

    /* renamed from: np0.n$a */
    public static final class C34976a {

        /* renamed from: a */
        public static final List<Object> f93889a = null;

        static {
            f93889a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93888d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93888d;
                if (obj == obj2) {
                    obj = C89048m.INSTANCE;
                    this.f93888d = obj;
                }
            }
        }
        return (C89048m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C89048m.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34976a.f93889a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "wxaapp_msgchannel");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C89048m.class.getName();
    }
}
