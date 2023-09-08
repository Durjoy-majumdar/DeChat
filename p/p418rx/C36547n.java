package p418rx;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rx.n */
public enum C36547n implements C38174i<C77583m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97213d;

    /* renamed from: rx.n$a */
    public static final class C36548a {

        /* renamed from: a */
        public static final List<Object> f97214a = null;

        static {
            f97214a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f97213d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97213d;
                if (obj == obj2) {
                    obj = new C77583m();
                    this.f97213d = obj;
                }
            }
        }
        return (C77583m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36548a.f97214a;
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
        return "provider " + C77583m.class.getName();
    }
}
