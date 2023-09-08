package p600lu;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: lu.g */
public enum C34367g implements C38174i<C34366f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92573d;

    /* renamed from: lu.g$a */
    public static final class C34368a {

        /* renamed from: a */
        public static final List<Object> f92574a = null;

        static {
            f92574a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92573d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92573d;
                if (obj == obj2) {
                    obj = new C34366f();
                    this.f92573d = obj;
                }
            }
        }
        return (C34366f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34368a.f92574a;
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
        return "provider " + C34366f.class.getName();
    }
}
