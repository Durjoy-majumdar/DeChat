package p441aq;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: aq.k2 */
public enum C28057k2 implements C38174i<C92056j2> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77392d;

    /* renamed from: aq.k2$a */
    public static final class C28058a {

        /* renamed from: a */
        public static final List<Object> f77393a = null;

        static {
            f77393a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f77392d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77392d;
                if (obj == obj2) {
                    obj = new C92056j2();
                    this.f77392d = obj;
                }
            }
        }
        return (C92056j2) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28058a.f77393a;
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
        return "provider " + C92056j2.class.getName();
    }
}
