package l33;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: l33.g */
public enum C34175g implements C38174i<C109247e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92184d;

    /* renamed from: l33.g$a */
    public static final class C34176a {

        /* renamed from: a */
        public static final List<Object> f92185a = null;

        static {
            f92185a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92184d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92184d;
                if (obj == obj2) {
                    obj = new C109247e();
                    this.f92184d = obj;
                }
            }
        }
        return (C109247e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34176a.f92185a;
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
        return "provider " + C109247e.class.getName();
    }
}
