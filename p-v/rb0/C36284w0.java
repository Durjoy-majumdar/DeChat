package rb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: rb0.w0 */
public enum C36284w0 implements C38174i<C48009v0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96610d;

    /* renamed from: rb0.w0$a */
    public static final class C36285a {

        /* renamed from: a */
        public static final List<Object> f96611a = null;

        static {
            f96611a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96610d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96610d;
                if (obj == obj2) {
                    obj = new C48009v0();
                    this.f96610d = obj;
                }
            }
        }
        return (C48009v0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36285a.f96611a;
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
        return "provider " + C48009v0.class.getName();
    }
}
