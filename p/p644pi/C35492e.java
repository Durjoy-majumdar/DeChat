package p644pi;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: pi.e */
public enum C35492e implements C38174i<C77089d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94940d;

    /* renamed from: pi.e$a */
    public static final class C35493a {

        /* renamed from: a */
        public static final List<Object> f94941a = null;

        static {
            f94941a = Arrays.asList(new Object[]{C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94940d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94940d;
                if (obj == obj2) {
                    obj = new C77089d();
                    this.f94940d = obj;
                }
            }
        }
        return (C77089d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35493a.f94941a;
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
        return "provider " + C77089d.class.getName();
    }
}
