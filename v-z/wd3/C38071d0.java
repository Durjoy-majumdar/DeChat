package wd3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: wd3.d0 */
public enum C38071d0 implements C38174i<C78552c0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100638d;

    /* renamed from: wd3.d0$a */
    public static final class C38072a {

        /* renamed from: a */
        public static final List<Object> f100639a = null;

        static {
            f100639a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100638d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100638d;
                if (obj == obj2) {
                    obj = new C78552c0();
                    this.f100638d = obj;
                }
            }
        }
        return (C78552c0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38072a.f100639a;
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
        return "provider " + C78552c0.class.getName();
    }
}
