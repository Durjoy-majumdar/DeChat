package wb1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: wb1.w */
public enum C38047w implements C38174i<C38045v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100584d;

    /* renamed from: wb1.w$a */
    public static final class C38048a {

        /* renamed from: a */
        public static final List<Object> f100585a = null;

        static {
            f100585a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100584d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100584d;
                if (obj == obj2) {
                    obj = new C38045v();
                    this.f100584d = obj;
                }
            }
        }
        return (C38045v) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38048a.f100585a;
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
        return "provider " + C38045v.class.getName();
    }
}
