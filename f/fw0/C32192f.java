package fw0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: fw0.f */
public enum C32192f implements C38174i<C75805e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85583d;

    /* renamed from: fw0.f$a */
    public static final class C32193a {

        /* renamed from: a */
        public static final List<Object> f85584a = null;

        static {
            f85584a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85583d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85583d;
                if (obj == obj2) {
                    obj = new C75805e();
                    this.f85583d = obj;
                }
            }
        }
        return (C75805e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32193a.f85584a;
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
        return "provider " + C75805e.class.getName();
    }
}
