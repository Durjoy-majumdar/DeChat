package ly1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ly1.k */
public enum C34415k implements C38174i<C99745j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92672d;

    /* renamed from: ly1.k$a */
    public static final class C34416a {

        /* renamed from: a */
        public static final List<Object> f92673a = null;

        static {
            f92673a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92672d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92672d;
                if (obj == obj2) {
                    obj = new C99745j();
                    this.f92672d = obj;
                }
            }
        }
        return (C99745j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34416a.f92673a;
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
        return "provider " + C99745j.class.getName();
    }
}
