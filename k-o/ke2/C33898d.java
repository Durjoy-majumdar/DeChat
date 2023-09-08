package ke2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ke2.d */
public enum C33898d implements C38174i<C99129c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91581d;

    /* renamed from: ke2.d$a */
    public static final class C33899a {

        /* renamed from: a */
        public static final List<Object> f91582a = null;

        static {
            f91582a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91581d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91581d;
                if (obj == obj2) {
                    obj = new C99129c();
                    this.f91581d = obj;
                }
            }
        }
        return (C99129c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33899a.f91582a;
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
        return "provider " + C99129c.class.getName();
    }
}
