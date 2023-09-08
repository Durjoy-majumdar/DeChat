package rc3;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rc3.f */
public enum C36301f implements C38174i<C36299e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96649d;

    /* renamed from: rc3.f$a */
    public static final class C36302a {

        /* renamed from: a */
        public static final List<Object> f96650a = null;

        static {
            f96650a = Arrays.asList(new Object[]{C80625v0.MATCH_SUPPORT});
        }
    }

    public Object get() {
        Object obj = this.f96649d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96649d;
                if (obj == obj2) {
                    obj = new C36299e();
                    this.f96649d = obj;
                }
            }
        }
        return (C36299e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C36302a.f96650a;
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
        return "provider " + C36299e.class.getName();
    }
}
