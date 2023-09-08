package mc3;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: mc3.c */
public enum C34545c implements C38174i<C34544b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92931d;

    /* renamed from: mc3.c$a */
    public static final class C34546a {

        /* renamed from: a */
        public static final List<Object> f92932a = null;

        static {
            f92932a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_SUPPORT});
        }
    }

    public Object get() {
        Object obj = this.f92931d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92931d;
                if (obj == obj2) {
                    obj = new C34544b();
                    this.f92931d = obj;
                }
            }
        }
        return (C34544b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34546a.f92932a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34544b.class.getName();
    }
}
