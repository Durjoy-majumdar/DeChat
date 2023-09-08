package pl1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: pl1.i */
public enum C35522i implements C38174i<C77108h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94994d;

    /* renamed from: pl1.i$a */
    public static final class C35523a {

        /* renamed from: a */
        public static final List<Object> f94995a = null;

        static {
            f94995a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94994d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94994d;
                if (obj == obj2) {
                    obj = new C77108h();
                    this.f94994d = obj;
                }
            }
        }
        return (C77108h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35523a.f94995a;
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
        return "provider " + C77108h.class.getName();
    }
}
