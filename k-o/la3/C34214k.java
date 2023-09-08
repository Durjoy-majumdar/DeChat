package la3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: la3.k */
public enum C34214k implements C38174i<C117469j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92262d;

    /* renamed from: la3.k$a */
    public static final class C34215a {

        /* renamed from: a */
        public static final List<Object> f92263a = null;

        static {
            f92263a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92262d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92262d;
                if (obj == obj2) {
                    obj = new C117469j();
                    this.f92262d = obj;
                }
            }
        }
        return (C117469j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C34215a.f92263a;
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
        return "provider " + C117469j.class.getName();
    }
}
