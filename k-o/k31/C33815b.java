package k31;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: k31.b */
public enum C33815b implements C38174i<C117373a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91420d;

    /* renamed from: k31.b$a */
    public static final class C33816a {

        /* renamed from: a */
        public static final List<Object> f91421a = null;

        static {
            f91421a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f91420d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91420d;
                if (obj == obj2) {
                    obj = new C117373a();
                    this.f91420d = obj;
                }
            }
        }
        return (C117373a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33816a.f91421a;
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
        return "provider " + C117373a.class.getName();
    }
}
