package rn3;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.transmit.C97264l;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: rn3.t0 */
public enum C36395t0 implements C38174i<C97264l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96853d;

    /* renamed from: rn3.t0$a */
    public static final class C36396a {

        /* renamed from: a */
        public static final List<Object> f96854a = null;

        static {
            f96854a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96853d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96853d;
                if (obj == obj2) {
                    obj = new C97264l();
                    this.f96853d = obj;
                }
            }
        }
        return (C97264l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36396a.f96854a;
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
        return "provider " + C97264l.class.getName();
    }
}
