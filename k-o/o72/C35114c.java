package o72;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: o72.c */
public enum C35114c implements C38174i<C35113b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94197d;

    /* renamed from: o72.c$a */
    public static final class C35115a {

        /* renamed from: a */
        public static final List<Object> f94198a = null;

        static {
            f94198a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94197d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94197d;
                if (obj == obj2) {
                    obj = new C35113b();
                    this.f94197d = obj;
                }
            }
        }
        return (C35113b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C35115a.f94198a;
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
        return "provider " + C35113b.class.getName();
    }
}
