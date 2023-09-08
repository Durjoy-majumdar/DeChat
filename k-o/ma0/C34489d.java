package ma0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ma0.d */
public enum C34489d implements C38174i<C61445c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92825d;

    /* renamed from: ma0.d$a */
    public static final class C34490a {

        /* renamed from: a */
        public static final List<Object> f92826a = null;

        static {
            f92826a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92825d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92825d;
                if (obj == obj2) {
                    obj = new C61445c();
                    this.f92825d = obj;
                }
            }
        }
        return (C61445c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34490a.f92826a;
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
        return "provider " + C61445c.class.getName();
    }
}
