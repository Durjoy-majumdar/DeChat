package fa3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: fa3.l */
public enum C31986l implements C38174i<C75739k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85174d;

    /* renamed from: fa3.l$a */
    public static final class C31987a {

        /* renamed from: a */
        public static final List<Object> f85175a = null;

        static {
            f85175a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85174d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85174d;
                if (obj == obj2) {
                    obj = new C75739k();
                    this.f85174d = obj;
                }
            }
        }
        return (C75739k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31987a.f85175a;
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
        return "provider " + C75739k.class.getName();
    }
}
