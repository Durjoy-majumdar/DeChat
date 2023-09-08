package eb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: eb0.o */
public enum C31495o implements C38174i<C45614n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84226d;

    /* renamed from: eb0.o$a */
    public static final class C31496a {

        /* renamed from: a */
        public static final List<Object> f84227a = null;

        static {
            f84227a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84226d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84226d;
                if (obj == obj2) {
                    obj = new C45614n();
                    this.f84226d = obj;
                }
            }
        }
        return (C45614n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31496a.f84227a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C45614n.class.getName();
    }
}
