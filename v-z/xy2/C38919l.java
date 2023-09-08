package xy2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: xy2.l */
public enum C38919l implements C38174i<C53481k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104888d;

    /* renamed from: xy2.l$a */
    public static final class C38920a {

        /* renamed from: a */
        public static final List<Object> f104889a = null;

        static {
            f104889a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f104888d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104888d;
                if (obj == obj2) {
                    obj = new C53481k();
                    this.f104888d = obj;
                }
            }
        }
        return (C53481k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38920a.f104889a;
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
        return "provider " + C53481k.class.getName();
    }
}
