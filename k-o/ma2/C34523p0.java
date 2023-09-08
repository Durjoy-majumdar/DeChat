package ma2;

import ca2.C92388b;
import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import f81.C7998c;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ma2.p0 */
public enum C34523p0 implements C38174i<C99814o0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92890d;

    /* renamed from: ma2.p0$a */
    public static final class C34524a {

        /* renamed from: a */
        public static final List<Object> f92891a = null;

        static {
            f92891a = Arrays.asList(new Object[]{C92388b.class, C7998c.class});
        }
    }

    /* renamed from: ma2.p0$b */
    public static final class C34525b {

        /* renamed from: a */
        public static final List<Object> f92892a = null;

        static {
            f92892a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92890d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92890d;
                if (obj == obj2) {
                    obj = new C99814o0();
                    this.f92890d = obj;
                }
            }
        }
        return (C99814o0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34525b.f92892a;
        }
        if ("dependencies".equals(str)) {
            return C34524a.f92891a;
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
        return "provider " + C99814o0.class.getName();
    }
}
