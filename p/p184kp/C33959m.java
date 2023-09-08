package p184kp;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: kp.m */
public enum C33959m implements C38174i<C10375l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91700d;

    /* renamed from: kp.m$a */
    public static final class C33960a {

        /* renamed from: a */
        public static final List<Object> f91701a = null;

        static {
            f91701a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f91700d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91700d;
                if (obj == obj2) {
                    obj = new C10375l();
                    this.f91700d = obj;
                }
            }
        }
        return (C10375l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33960a.f91701a;
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
        return "provider " + C10375l.class.getName();
    }
}
