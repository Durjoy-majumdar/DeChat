package z52;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: z52.c */
public enum C39318c implements C38174i<C39317b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105712d;

    /* renamed from: z52.c$a */
    public static final class C39319a {

        /* renamed from: a */
        public static final List<Object> f105713a = null;

        static {
            f105713a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105712d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105712d;
                if (obj == obj2) {
                    obj = new C39317b();
                    this.f105712d = obj;
                }
            }
        }
        return (C39317b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C39319a.f105713a;
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
        return "provider " + C39317b.class.getName();
    }
}
