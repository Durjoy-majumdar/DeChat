package av1;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: av1.c */
public enum C28144c implements C38174i<C28143b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77609d;

    /* renamed from: av1.c$a */
    public static final class C28145a {

        /* renamed from: a */
        public static final List<Object> f77610a = null;

        static {
            f77610a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77609d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77609d;
                if (obj == obj2) {
                    obj = new C28143b();
                    this.f77609d = obj;
                }
            }
        }
        return (C28143b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28145a.f77610a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.f84459e);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28143b.class.getName();
    }
}
