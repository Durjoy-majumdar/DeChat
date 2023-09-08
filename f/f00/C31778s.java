package f00;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: f00.s */
public enum C31778s implements C38174i<C31777r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84832d;

    /* renamed from: f00.s$a */
    public static final class C31779a {

        /* renamed from: a */
        public static final List<Object> f84833a = null;

        static {
            f84833a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84832d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84832d;
                if (obj == obj2) {
                    obj = new C31777r();
                    this.f84832d = obj;
                }
            }
        }
        return (C31777r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31779a.f84833a;
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
        return "provider " + C31777r.class.getName();
    }
}
