package eb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: eb0.k */
public enum C31483k implements C38174i<C45611j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84209d;

    /* renamed from: eb0.k$a */
    public static final class C31484a {

        /* renamed from: a */
        public static final List<Object> f84210a = null;

        static {
            f84210a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84209d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84209d;
                if (obj == obj2) {
                    obj = new C45611j();
                    this.f84209d = obj;
                }
            }
        }
        return (C45611j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31484a.f84210a;
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
        return "provider " + C45611j.class.getName();
    }
}
