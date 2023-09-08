package pc0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pc0.c0 */
public enum C35444c0 implements C38174i<C77064b0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94848d;

    /* renamed from: pc0.c0$a */
    public static final class C35445a {

        /* renamed from: a */
        public static final List<Object> f94849a = null;

        static {
            f94849a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94848d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94848d;
                if (obj == obj2) {
                    obj = new C77064b0();
                    this.f94848d = obj;
                }
            }
        }
        return (C77064b0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35445a.f94849a;
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
        return "provider " + C77064b0.class.getName();
    }
}
