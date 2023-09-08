package qg2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: qg2.d0 */
public enum C35857d0 implements C38174i<C35855c0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95703d;

    /* renamed from: qg2.d0$a */
    public static final class C35858a {

        /* renamed from: a */
        public static final List<Object> f95704a = null;

        static {
            f95704a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95703d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95703d;
                if (obj == obj2) {
                    obj = new C35855c0();
                    this.f95703d = obj;
                }
            }
        }
        return (C35855c0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35858a.f95704a;
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
        return "provider " + C35855c0.class.getName();
    }
}
