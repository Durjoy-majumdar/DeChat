package fc0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: fc0.c */
public enum C32006c implements C38174i<C32005b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85215d;

    /* renamed from: fc0.c$a */
    public static final class C32007a {

        /* renamed from: a */
        public static final List<Object> f85216a = null;

        static {
            f85216a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85215d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85215d;
                if (obj == obj2) {
                    obj = new C32005b();
                    this.f85215d = obj;
                }
            }
        }
        return (C32005b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32007a.f85216a;
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
        return "provider " + C32005b.class.getName();
    }
}
