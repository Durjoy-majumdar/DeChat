package sw0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: sw0.i */
public enum C36870i implements C38174i<C36869h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97859d;

    /* renamed from: sw0.i$a */
    public static final class C36871a {

        /* renamed from: a */
        public static final List<Object> f97860a = null;

        static {
            f97860a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_PATCH});
        }
    }

    public Object get() {
        Object obj = this.f97859d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97859d;
                if (obj == obj2) {
                    obj = new C36869h();
                    this.f97859d = obj;
                }
            }
        }
        return (C36869h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C36871a.f97860a;
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
        return "provider " + C36869h.class.getName();
    }
}
