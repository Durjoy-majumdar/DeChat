package p184kp;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: kp.d */
public enum C33950d implements C38174i<C33949c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91677d;

    /* renamed from: kp.d$a */
    public static final class C33951a {

        /* renamed from: a */
        public static final List<Object> f91678a = null;

        static {
            f91678a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f91677d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91677d;
                if (obj == obj2) {
                    obj = new C33949c();
                    this.f91677d = obj;
                }
            }
        }
        return (C33949c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33951a.f91678a;
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
        return "provider " + C33949c.class.getName();
    }
}
