package fx1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: fx1.f */
public enum C32218f implements C38174i<C32217e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85634d;

    /* renamed from: fx1.f$a */
    public static final class C32219a {

        /* renamed from: a */
        public static final List<Object> f85635a = null;

        static {
            f85635a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85634d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85634d;
                if (obj == obj2) {
                    obj = new C32217e();
                    this.f85634d = obj;
                }
            }
        }
        return (C32217e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32219a.f85635a;
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
        return "provider " + C32217e.class.getName();
    }
}
