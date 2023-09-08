package dv1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: dv1.q */
public enum C31306q implements C38174i<C58435m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83822d;

    /* renamed from: dv1.q$a */
    public static final class C31307a {

        /* renamed from: a */
        public static final List<Object> f83823a = null;

        static {
            f83823a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83822d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83822d;
                if (obj == obj2) {
                    obj = new C58435m();
                    this.f83822d = obj;
                }
            }
        }
        return (C58435m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31307a.f83823a;
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
        return "provider " + C58435m.class.getName();
    }
}
