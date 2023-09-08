package fb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fb0.f */
public enum C31994f implements C38174i<C31993e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85187d;

    /* renamed from: fb0.f$a */
    public static final class C31995a {

        /* renamed from: a */
        public static final List<Object> f85188a = null;

        static {
            f85188a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85187d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85187d;
                if (obj == obj2) {
                    obj = new C31993e();
                    this.f85187d = obj;
                }
            }
        }
        return (C31993e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31995a.f85188a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, -1879048184);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31993e.class.getName();
    }
}
