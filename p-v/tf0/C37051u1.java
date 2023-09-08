package tf0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: tf0.u1 */
public enum C37051u1 implements C38174i<C64920t1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98214d;

    /* renamed from: tf0.u1$a */
    public static final class C37052a {

        /* renamed from: a */
        public static final List<Object> f98215a = null;

        static {
            f98215a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98214d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98214d;
                if (obj == obj2) {
                    obj = new C64920t1();
                    this.f98214d = obj;
                }
            }
        }
        return (C64920t1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37052a.f98215a;
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
        return "provider " + C64920t1.class.getName();
    }
}
