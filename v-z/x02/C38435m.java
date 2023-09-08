package x02;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: x02.m */
public enum C38435m implements C38174i<C38434l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101391d;

    /* renamed from: x02.m$a */
    public static final class C38436a {

        /* renamed from: a */
        public static final List<Object> f101392a = null;

        static {
            f101392a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101391d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101391d;
                if (obj == obj2) {
                    obj = new C38434l();
                    this.f101391d = obj;
                }
            }
        }
        return (C38434l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C38436a.f101392a;
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
        return "provider " + C38434l.class.getName();
    }
}
