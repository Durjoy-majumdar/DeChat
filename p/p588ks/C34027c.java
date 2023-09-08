package p588ks;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ks.c */
public enum C34027c implements C38174i<C34026b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91839d;

    /* renamed from: ks.c$a */
    public static final class C34028a {

        /* renamed from: a */
        public static final List<Object> f91840a = null;

        static {
            f91840a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f91839d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91839d;
                if (obj == obj2) {
                    obj = new C34026b();
                    this.f91839d = obj;
                }
            }
        }
        return (C34026b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34028a.f91840a;
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
        return "provider " + C34026b.class.getName();
    }
}
