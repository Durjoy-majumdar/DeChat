package rl2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: rl2.f */
public enum C36345f implements C38174i<C101388e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96735d;

    /* renamed from: rl2.f$a */
    public static final class C36346a {

        /* renamed from: a */
        public static final List<Object> f96736a = null;

        static {
            f96736a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f96735d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96735d;
                if (obj == obj2) {
                    obj = new C101388e();
                    this.f96735d = obj;
                }
            }
        }
        return (C101388e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36346a.f96736a;
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
        return "provider " + C101388e.class.getName();
    }
}
