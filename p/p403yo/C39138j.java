package p403yo;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yo.j */
public enum C39138j implements C38174i<C39137i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105342d;

    /* renamed from: yo.j$a */
    public static final class C39139a {

        /* renamed from: a */
        public static final List<Object> f105343a = null;

        static {
            f105343a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105342d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105342d;
                if (obj == obj2) {
                    obj = new C39137i();
                    this.f105342d = obj;
                }
            }
        }
        return (C39137i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C39139a.f105343a;
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
        return "provider " + C39137i.class.getName();
    }
}
