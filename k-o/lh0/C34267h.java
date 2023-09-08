package lh0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: lh0.h */
public enum C34267h implements C38174i<C34262g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92376d;

    /* renamed from: lh0.h$a */
    public static final class C34268a {

        /* renamed from: a */
        public static final List<Object> f92377a = null;

        static {
            f92377a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92376d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92376d;
                if (obj == obj2) {
                    obj = new C34262g();
                    this.f92376d = obj;
                }
            }
        }
        return (C34262g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C34268a.f92377a;
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
        return "provider " + C34262g.class.getName();
    }
}
