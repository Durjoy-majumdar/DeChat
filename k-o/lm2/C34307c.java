package lm2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: lm2.c */
public enum C34307c implements C38174i<C76704b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92450d;

    /* renamed from: lm2.c$a */
    public static final class C34308a {

        /* renamed from: a */
        public static final List<Object> f92451a = null;

        static {
            f92451a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92450d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92450d;
                if (obj == obj2) {
                    obj = new C76704b();
                    this.f92450d = obj;
                }
            }
        }
        return (C76704b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34308a.f92451a;
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
        return "provider " + C76704b.class.getName();
    }
}
