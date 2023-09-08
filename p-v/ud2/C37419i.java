package ud2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ud2.i */
public enum C37419i implements C38174i<C78150h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98917d;

    /* renamed from: ud2.i$a */
    public static final class C37420a {

        /* renamed from: a */
        public static final List<Object> f98918a = null;

        static {
            f98918a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98917d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98917d;
                if (obj == obj2) {
                    obj = new C78150h();
                    this.f98917d = obj;
                }
            }
        }
        return (C78150h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37420a.f98918a;
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
        return "provider " + C78150h.class.getName();
    }
}
