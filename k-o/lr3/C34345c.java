package lr3;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C85597u;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: lr3.c */
public enum C34345c implements C38174i<C88646b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92524d;

    /* renamed from: lr3.c$a */
    public static final class C34346a {

        /* renamed from: a */
        public static final List<Object> f92525a = null;

        static {
            f92525a = Arrays.asList(new Object[]{C85597u.class});
        }
    }

    /* renamed from: lr3.c$b */
    public static final class C34347b {

        /* renamed from: a */
        public static final List<Object> f92526a = null;

        static {
            f92526a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI});
        }
    }

    public Object get() {
        Object obj = this.f92524d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92524d;
                if (obj == obj2) {
                    obj = new C88646b();
                    this.f92524d = obj;
                }
            }
        }
        return (C88646b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C34346a.f92525a;
        }
        if ("onProcess".equals(str)) {
            return C34347b.f92526a;
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
        return "provider " + C88646b.class.getName();
    }
}
