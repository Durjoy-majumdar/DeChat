package pc0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: pc0.z */
public enum C35449z implements C38174i<C77070y> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94859d;

    /* renamed from: pc0.z$a */
    public static final class C35450a {

        /* renamed from: a */
        public static final List<Object> f94860a = null;

        static {
            f94860a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f94859d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94859d;
                if (obj == obj2) {
                    obj = new C77070y();
                    this.f94859d = obj;
                }
            }
        }
        return (C77070y) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35450a.f94860a;
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
        return "provider " + C77070y.class.getName();
    }
}
