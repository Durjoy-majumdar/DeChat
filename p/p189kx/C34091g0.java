package p189kx;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: kx.g0 */
public enum C34091g0 implements C38174i<C34089f0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91979d;

    /* renamed from: kx.g0$a */
    public static final class C34092a {

        /* renamed from: a */
        public static final List<Object> f91980a = null;

        static {
            f91980a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f91979d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91979d;
                if (obj == obj2) {
                    obj = new C34089f0();
                    this.f91979d = obj;
                }
            }
        }
        return (C34089f0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34092a.f91980a;
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
        return "provider " + C34089f0.class.getName();
    }
}
