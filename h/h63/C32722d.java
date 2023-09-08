package h63;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: h63.d */
public enum C32722d implements C38174i<C8492c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86790d;

    /* renamed from: h63.d$a */
    public static final class C32723a {

        /* renamed from: a */
        public static final List<Object> f86791a = null;

        static {
            f86791a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f86790d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86790d;
                if (obj == obj2) {
                    obj = new C8492c();
                    this.f86790d = obj;
                }
            }
        }
        return (C8492c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32723a.f86791a;
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
        return "provider " + C8492c.class.getName();
    }
}
