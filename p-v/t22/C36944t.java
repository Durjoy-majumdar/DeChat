package t22;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: t22.t */
public enum C36944t implements C38174i<C77832s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98007d;

    /* renamed from: t22.t$a */
    public static final class C36945a {

        /* renamed from: a */
        public static final List<Object> f98008a = null;

        static {
            f98008a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98007d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98007d;
                if (obj == obj2) {
                    obj = new C77832s();
                    this.f98007d = obj;
                }
            }
        }
        return (C77832s) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36945a.f98008a;
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
        return "provider " + C77832s.class.getName();
    }
}
