package p690sw;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: sw.f */
public enum C36857f implements C38174i<C90360e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97837d;

    /* renamed from: sw.f$a */
    public static final class C36858a {

        /* renamed from: a */
        public static final List<Object> f97838a = null;

        static {
            f97838a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97837d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97837d;
                if (obj == obj2) {
                    obj = new C90360e();
                    this.f97837d = obj;
                }
            }
        }
        return (C90360e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C36858a.f97838a;
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
        return "provider " + C90360e.class.getName();
    }
}
