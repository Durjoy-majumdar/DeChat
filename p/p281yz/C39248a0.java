package p281yz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: yz.a0 */
public enum C39248a0 implements C38174i<C79182z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105588d;

    /* renamed from: yz.a0$a */
    public static final class C39249a {

        /* renamed from: a */
        public static final List<Object> f105589a = null;

        static {
            f105589a = Arrays.asList(new Object[]{C79171t.class});
        }
    }

    public Object get() {
        Object obj = this.f105588d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105588d;
                if (obj == obj2) {
                    obj = new C79182z();
                    this.f105588d = obj;
                }
            }
        }
        return (C79182z) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C39249a.f105589a;
        }
        if ("onProcess".equals(str)) {
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
        return "provider " + C79182z.class.getName();
    }
}
