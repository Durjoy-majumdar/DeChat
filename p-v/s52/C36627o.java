package s52;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: s52.o */
public enum C36627o implements C38174i<C36626n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97372d;

    /* renamed from: s52.o$a */
    public static final class C36628a {

        /* renamed from: a */
        public static final List<Object> f97373a = null;

        static {
            f97373a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97372d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97372d;
                if (obj == obj2) {
                    obj = new C36626n();
                    this.f97372d = obj;
                }
            }
        }
        return (C36626n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36628a.f97373a;
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
        return "provider " + C36626n.class.getName();
    }
}
