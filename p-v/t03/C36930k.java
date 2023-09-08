package t03;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: t03.k */
public enum C36930k implements C38174i<C77817j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97982d;

    /* renamed from: t03.k$a */
    public static final class C36931a {

        /* renamed from: a */
        public static final List<Object> f97983a = null;

        static {
            f97983a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97982d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97982d;
                if (obj == obj2) {
                    obj = new C77817j();
                    this.f97982d = obj;
                }
            }
        }
        return (C77817j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36931a.f97983a;
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
        return "provider " + C77817j.class.getName();
    }
}
