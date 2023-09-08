package t72;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: t72.e */
public enum C36968e implements C38174i<C13835d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98050d;

    /* renamed from: t72.e$a */
    public static final class C36969a {

        /* renamed from: a */
        public static final List<Object> f98051a = null;

        static {
            f98051a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f98050d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98050d;
                if (obj == obj2) {
                    obj = new C13835d();
                    this.f98050d = obj;
                }
            }
        }
        return (C13835d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C36969a.f98051a;
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
        return "provider " + C13835d.class.getName();
    }
}
