package sx2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: sx2.e */
public enum C36898e implements C38174i<C118318d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97926d;

    /* renamed from: sx2.e$a */
    public static final class C36899a {

        /* renamed from: a */
        public static final List<Object> f97927a = null;

        static {
            f97927a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97926d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97926d;
                if (obj == obj2) {
                    obj = new C118318d();
                    this.f97926d = obj;
                }
            }
        }
        return (C118318d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36899a.f97927a;
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
        return "provider " + C118318d.class.getName();
    }
}
