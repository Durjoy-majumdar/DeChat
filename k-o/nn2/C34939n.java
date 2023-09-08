package nn2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nn2.n */
public enum C34939n implements C38174i<C76942m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93796d;

    /* renamed from: nn2.n$a */
    public static final class C34940a {

        /* renamed from: a */
        public static final List<Object> f93797a = null;

        static {
            f93797a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93796d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93796d;
                if (obj == obj2) {
                    obj = new C76942m();
                    this.f93796d = obj;
                }
            }
        }
        return (C76942m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34940a.f93797a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76942m.class.getName();
    }
}
