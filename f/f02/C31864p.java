package f02;

import c02.C28462d;
import com.tencent.p014mm.app.C80625v0;
import f02.C31862o;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: f02.p */
public enum C31864p implements C38174i<C31822n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84912d;

    /* renamed from: f02.p$a */
    public static final class C31865a {

        /* renamed from: a */
        public static final List<Object> f84913a = null;

        static {
            f84913a = Arrays.asList(new Object[]{C28462d.class});
        }
    }

    /* renamed from: f02.p$b */
    public static final class C31866b {

        /* renamed from: a */
        public static final List<Object> f84914a = null;

        static {
            f84914a = Arrays.asList(new Object[]{C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI});
        }
    }

    public Object get() {
        Object obj = this.f84912d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84912d;
                if (obj == obj2) {
                    C31862o.f84909a.getClass();
                    obj = C31822n.f84892d;
                    this.f84912d = obj;
                }
            }
        }
        return (C31822n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C31862o.C31863a.class;
        }
        if ("onProcess".equals(str)) {
            return C31866b.f84914a;
        }
        if ("dependencies".equals(str)) {
            return C31865a.f84913a;
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
        return "provider " + C31822n.class.getName();
    }
}
