package rw0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: rw0.n */
public enum C36528n implements C38174i<C36527m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97169d;

    /* renamed from: rw0.n$a */
    public static final class C36529a {

        /* renamed from: a */
        public static final List<Object> f97170a = null;

        static {
            f97170a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97169d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97169d;
                if (obj == obj2) {
                    obj = new C36527m();
                    this.f97169d = obj;
                }
            }
        }
        return (C36527m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36529a.f97170a;
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
        return "provider " + C36527m.class.getName();
    }
}
