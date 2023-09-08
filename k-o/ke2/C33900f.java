package ke2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ke2.f */
public enum C33900f implements C38174i<C99135e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91585d;

    /* renamed from: ke2.f$a */
    public static final class C33901a {

        /* renamed from: a */
        public static final List<Object> f91586a = null;

        static {
            f91586a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91585d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91585d;
                if (obj == obj2) {
                    obj = new C99135e();
                    this.f91585d = obj;
                }
            }
        }
        return (C99135e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33901a.f91586a;
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
        return "provider " + C99135e.class.getName();
    }
}
