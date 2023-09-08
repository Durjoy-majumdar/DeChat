package r62;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: r62.h */
public enum C36259h implements C38174i<C36258g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96567d;

    /* renamed from: r62.h$a */
    public static final class C36260a {

        /* renamed from: a */
        public static final List<Object> f96568a = null;

        static {
            f96568a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f96567d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96567d;
                if (obj == obj2) {
                    obj = new C36258g();
                    this.f96567d = obj;
                }
            }
        }
        return (C36258g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36260a.f96568a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36258g.class.getName();
    }
}
