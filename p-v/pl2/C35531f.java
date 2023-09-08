package pl2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;
import pl2.C35529e;

/* renamed from: pl2.f */
public enum C35531f implements C38174i<C35526c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95013d;

    /* renamed from: pl2.f$a */
    public static final class C35532a {

        /* renamed from: a */
        public static final List<Object> f95014a = null;

        static {
            f95014a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95013d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95013d;
                if (obj == obj2) {
                    C35529e.f95010a.getClass();
                    obj = new C35526c();
                    this.f95013d = obj;
                }
            }
        }
        return (C35526c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C35529e.C35530a.class;
        }
        if ("onProcess".equals(str)) {
            return C35532a.f95014a;
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
        return "provider " + C35526c.class.getName();
    }
}
