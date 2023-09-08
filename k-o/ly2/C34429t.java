package ly2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ly2.t */
public enum C34429t implements C38174i<C10694s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92703d;

    /* renamed from: ly2.t$a */
    public static final class C34430a {

        /* renamed from: a */
        public static final List<Object> f92704a = null;

        static {
            f92704a = Arrays.asList(new Object[]{C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f92703d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92703d;
                if (obj == obj2) {
                    obj = new C10694s();
                    this.f92703d = obj;
                }
            }
        }
        return (C10694s) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34430a.f92704a;
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
        return "provider " + C10694s.class.getName();
    }
}
