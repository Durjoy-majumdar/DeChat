package fb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: fb0.l */
public enum C32000l implements C38174i<C31999k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85201d;

    /* renamed from: fb0.l$a */
    public static final class C32001a {

        /* renamed from: a */
        public static final List<Object> f85202a = null;

        static {
            f85202a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85201d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85201d;
                if (obj == obj2) {
                    obj = new C31999k();
                    this.f85201d = obj;
                }
            }
        }
        return (C31999k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32001a.f85202a;
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
        return "provider " + C31999k.class.getName();
    }
}
