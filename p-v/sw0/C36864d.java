package sw0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: sw0.d */
public enum C36864d implements C38174i<C36863c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97845d;

    /* renamed from: sw0.d$a */
    public static final class C36865a {

        /* renamed from: a */
        public static final List<Object> f97846a = null;

        static {
            f97846a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97845d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97845d;
                if (obj == obj2) {
                    obj = new C36863c();
                    this.f97845d = obj;
                }
            }
        }
        return (C36863c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C36865a.f97846a;
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
        return "provider " + C36863c.class.getName();
    }
}
