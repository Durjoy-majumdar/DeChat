package fb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fb0.b */
public enum C31990b implements C38174i<C31989a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85181d;

    /* renamed from: fb0.b$a */
    public static final class C31991a {

        /* renamed from: a */
        public static final List<Object> f85182a = null;

        static {
            f85182a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85181d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85181d;
                if (obj == obj2) {
                    obj = new C31989a();
                    this.f85181d = obj;
                }
            }
        }
        return (C31989a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31991a.f85182a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "abtest");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31989a.class.getName();
    }
}
