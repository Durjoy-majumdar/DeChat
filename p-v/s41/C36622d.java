package s41;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: s41.d */
public enum C36622d implements C38174i<C36620c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97360d;

    /* renamed from: s41.d$a */
    public static final class C36623a {

        /* renamed from: a */
        public static final List<Object> f97361a = null;

        static {
            f97361a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97360d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97360d;
                if (obj == obj2) {
                    obj = new C36620c();
                    this.f97360d = obj;
                }
            }
        }
        return (C36620c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36623a.f97361a;
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
        return "provider " + C36620c.class.getName();
    }
}
