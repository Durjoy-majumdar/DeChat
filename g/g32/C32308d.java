package g32;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: g32.d */
public enum C32308d implements C38174i<C75846b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85785d;

    /* renamed from: g32.d$a */
    public static final class C32309a {

        /* renamed from: a */
        public static final List<Object> f85786a = null;

        static {
            f85786a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85785d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85785d;
                if (obj == obj2) {
                    obj = new C75846b();
                    this.f85785d = obj;
                }
            }
        }
        return (C75846b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32309a.f85786a;
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
        return "provider " + C75846b.class.getName();
    }
}
