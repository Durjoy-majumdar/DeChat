package hx2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hx2.c */
public enum C33117c implements C38174i<C33115b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89913d;

    /* renamed from: hx2.c$a */
    public static final class C33118a {

        /* renamed from: a */
        public static final List<Object> f89914a = null;

        static {
            f89914a = Arrays.asList(new Object[]{C30211n0.class});
        }
    }

    /* renamed from: hx2.c$b */
    public static final class C33119b {

        /* renamed from: a */
        public static final List<Object> f89915a = null;

        static {
            f89915a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND1});
        }
    }

    public Object get() {
        Object obj = this.f89913d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89913d;
                if (obj == obj2) {
                    obj = new C33115b();
                    this.f89913d = obj;
                }
            }
        }
        return (C33115b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C33118a.f89914a;
        }
        if ("onProcess".equals(str)) {
            return C33119b.f89915a;
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
        return "provider " + C33115b.class.getName();
    }
}
