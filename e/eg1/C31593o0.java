package eg1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: eg1.o0 */
public enum C31593o0 implements C38174i<C58588n0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84428d;

    /* renamed from: eg1.o0$a */
    public static final class C31594a {

        /* renamed from: a */
        public static final List<Object> f84429a = null;

        static {
            f84429a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84428d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84428d;
                if (obj == obj2) {
                    obj = new C58588n0();
                    this.f84428d = obj;
                }
            }
        }
        return (C58588n0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31594a.f84429a;
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
        return "provider " + C58588n0.class.getName();
    }
}
