package hg2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hg2.n */
public enum C32905n implements C38174i<C76193l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89455d;

    /* renamed from: hg2.n$a */
    public static final class C32906a {

        /* renamed from: a */
        public static final List<Object> f89456a = null;

        static {
            f89456a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89455d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89455d;
                if (obj == obj2) {
                    obj = new C76193l();
                    this.f89455d = obj;
                }
            }
        }
        return (C76193l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C32906a.f89456a;
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
        return "provider " + C76193l.class.getName();
    }
}
