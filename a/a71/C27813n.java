package a71;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a71.n */
public enum C27813n implements C38174i<C91978m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76905d;

    /* renamed from: a71.n$a */
    public static final class C27814a {

        /* renamed from: a */
        public static final List<Object> f76906a = null;

        static {
            f76906a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f76905d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76905d;
                if (obj == obj2) {
                    obj = new C91978m();
                    this.f76905d = obj;
                }
            }
        }
        return (C91978m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C27814a.f76906a;
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
        return "provider " + C91978m.class.getName();
    }
}
