package yj3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: yj3.f */
public enum C39026f implements C38174i<C39025e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105091d;

    /* renamed from: yj3.f$a */
    public static final class C39027a {

        /* renamed from: a */
        public static final List<Object> f105092a = null;

        static {
            f105092a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105091d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105091d;
                if (obj == obj2) {
                    obj = new C39025e();
                    this.f105091d = obj;
                }
            }
        }
        return (C39025e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C39027a.f105092a;
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
        return "provider " + C39025e.class.getName();
    }
}
