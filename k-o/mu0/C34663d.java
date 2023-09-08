package mu0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: mu0.d */
public enum C34663d implements C38174i<C34662c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93204d;

    /* renamed from: mu0.d$a */
    public static final class C34664a {

        /* renamed from: a */
        public static final List<Object> f93205a = null;

        static {
            f93205a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93204d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93204d;
                if (obj == obj2) {
                    obj = new C34662c();
                    this.f93204d = obj;
                }
            }
        }
        return (C34662c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34664a.f93205a;
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
        return "provider " + C34662c.class.getName();
    }
}
