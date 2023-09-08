package g70;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: g70.e */
public enum C32336e implements C38174i<C32333d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85828d;

    /* renamed from: g70.e$a */
    public static final class C32337a {

        /* renamed from: a */
        public static final List<Object> f85829a = null;

        static {
            f85829a = Arrays.asList(new Object[]{C30211n0.class});
        }
    }

    /* renamed from: g70.e$b */
    public static final class C32338b {

        /* renamed from: a */
        public static final List<Object> f85830a = null;

        static {
            f85830a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND1});
        }
    }

    public Object get() {
        Object obj = this.f85828d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85828d;
                if (obj == obj2) {
                    obj = new C32333d();
                    this.f85828d = obj;
                }
            }
        }
        return (C32333d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C32337a.f85829a;
        }
        if ("onProcess".equals(str)) {
            return C32338b.f85830a;
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
        return "provider " + C32333d.class.getName();
    }
}
