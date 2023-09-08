package p483cv;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: cv.f */
public enum C30922f implements C38174i<C30921e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83000d;

    /* renamed from: cv.f$a */
    public static final class C30923a {

        /* renamed from: a */
        public static final List<Object> f83001a = null;

        static {
            f83001a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83000d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83000d;
                if (obj == obj2) {
                    obj = new C30921e();
                    this.f83000d = obj;
                }
            }
        }
        return (C30921e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30923a.f83001a;
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
        return "provider " + C30921e.class.getName();
    }
}
