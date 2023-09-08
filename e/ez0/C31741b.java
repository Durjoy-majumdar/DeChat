package ez0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ez0.b */
public enum C31741b implements C38174i<C75667a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84751d;

    /* renamed from: ez0.b$a */
    public static final class C31742a {

        /* renamed from: a */
        public static final List<Object> f84752a = null;

        static {
            f84752a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84751d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84751d;
                if (obj == obj2) {
                    obj = new C75667a();
                    this.f84751d = obj;
                }
            }
        }
        return (C75667a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31742a.f84752a;
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
        return "provider " + C75667a.class.getName();
    }
}
