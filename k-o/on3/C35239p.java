package on3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: on3.p */
public enum C35239p implements C38174i<C77029o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94452d;

    /* renamed from: on3.p$a */
    public static final class C35240a {

        /* renamed from: a */
        public static final List<Object> f94453a = null;

        static {
            f94453a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94452d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94452d;
                if (obj == obj2) {
                    obj = new C77029o();
                    this.f94452d = obj;
                }
            }
        }
        return (C77029o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35240a.f94453a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C77029o.class.getName();
    }
}
