package p177ji;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ji.d */
public enum C33575d implements C38174i<C9438a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90892d;

    /* renamed from: ji.d$a */
    public static final class C33576a {

        /* renamed from: a */
        public static final List<Object> f90893a = null;

        static {
            f90893a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f90892d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90892d;
                if (obj == obj2) {
                    obj = new C9438a();
                    this.f90892d = obj;
                }
            }
        }
        return (C9438a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33576a.f90893a;
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
        return "provider " + C9438a.class.getName();
    }
}
