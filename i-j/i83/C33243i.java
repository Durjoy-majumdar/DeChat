package i83;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: i83.i */
public enum C33243i implements C38174i<C46180g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90186d;

    /* renamed from: i83.i$a */
    public static final class C33244a {

        /* renamed from: a */
        public static final List<Object> f90187a = null;

        static {
            f90187a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f90186d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90186d;
                if (obj == obj2) {
                    obj = new C46180g();
                    this.f90186d = obj;
                }
            }
        }
        return (C46180g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33244a.f90187a;
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
        return "provider " + C46180g.class.getName();
    }
}
