package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.Launch3RdAppEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.q0 */
public enum C35971q0 implements C38174i<C12877p0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95931d;

    /* renamed from: qm.q0$a */
    public static final class C35972a {

        /* renamed from: a */
        public static final List<Object> f95932a = null;

        static {
            f95932a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95931d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95931d;
                if (obj == obj2) {
                    obj = new C12877p0();
                    this.f95931d = obj;
                }
            }
        }
        return (C12877p0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35972a.f95932a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, Launch3RdAppEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C12877p0.class.getName();
    }
}
