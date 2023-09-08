package p238st;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import f81.C7998c;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: st.f */
public enum C36797f implements C38174i<C118302c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97720d;

    /* renamed from: st.f$a */
    public static final class C36798a {

        /* renamed from: a */
        public static final List<Object> f97721a = null;

        static {
            f97721a = Arrays.asList(new Object[]{C7998c.class});
        }
    }

    /* renamed from: st.f$b */
    public static final class C36799b {

        /* renamed from: a */
        public static final List<Object> f97722a = null;

        static {
            f97722a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f97720d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97720d;
                if (obj == obj2) {
                    obj = new C118302c();
                    this.f97720d = obj;
                }
            }
        }
        return (C118302c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36799b.f97722a;
        }
        if ("dependencies".equals(str)) {
            return C36798a.f97721a;
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
        return "provider " + C118302c.class.getName();
    }
}
