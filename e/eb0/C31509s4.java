package eb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: eb0.s4 */
public enum C31509s4 implements C38174i<C31506r4> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84252d;

    /* renamed from: eb0.s4$a */
    public static final class C31510a {

        /* renamed from: a */
        public static final List<Object> f84253a = null;

        static {
            f84253a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84252d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84252d;
                if (obj == obj2) {
                    obj = new C31506r4();
                    this.f84252d = obj;
                }
            }
        }
        return (C31506r4) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31510a.f84253a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 41);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31506r4.class.getName();
    }
}
