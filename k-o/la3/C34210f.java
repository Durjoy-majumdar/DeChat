package la3;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: la3.f */
public enum C34210f implements C38174i<C34209e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92254d;

    /* renamed from: la3.f$a */
    public static final class C34211a {

        /* renamed from: a */
        public static final List<Object> f92255a = null;

        static {
            f92255a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92254d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92254d;
                if (obj == obj2) {
                    obj = new C34209e();
                    this.f92254d = obj;
                }
            }
        }
        return (C34209e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C34211a.f92255a;
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
        return "provider " + C34209e.class.getName();
    }
}
