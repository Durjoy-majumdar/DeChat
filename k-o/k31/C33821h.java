package k31;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: k31.h */
public enum C33821h implements C38174i<C117374g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91433d;

    /* renamed from: k31.h$a */
    public static final class C33822a {

        /* renamed from: a */
        public static final List<Object> f91434a = null;

        static {
            f91434a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f91433d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91433d;
                if (obj == obj2) {
                    obj = new C117374g();
                    this.f91433d = obj;
                }
            }
        }
        return (C117374g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33822a.f91434a;
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
        return "provider " + C117374g.class.getName();
    }
}
