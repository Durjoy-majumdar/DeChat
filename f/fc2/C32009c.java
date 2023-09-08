package fc2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: fc2.c */
public enum C32009c implements C38174i<C116856b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85222d;

    /* renamed from: fc2.c$a */
    public static final class C32010a {

        /* renamed from: a */
        public static final List<Object> f85223a = null;

        static {
            f85223a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85222d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85222d;
                if (obj == obj2) {
                    obj = new C116856b();
                    this.f85222d = obj;
                }
            }
        }
        return (C116856b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32010a.f85223a;
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
        return "provider " + C116856b.class.getName();
    }
}
