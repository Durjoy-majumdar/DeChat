package p697tm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: tm.f0 */
public enum C37141f0 implements C38174i<C118490e0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98355d;

    /* renamed from: tm.f0$a */
    public static final class C37142a {

        /* renamed from: a */
        public static final List<Object> f98356a = null;

        static {
            f98356a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98355d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98355d;
                if (obj == obj2) {
                    obj = new C118490e0();
                    this.f98355d = obj;
                }
            }
        }
        return (C118490e0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37142a.f98356a;
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
        return "provider " + C118490e0.class.getName();
    }
}
