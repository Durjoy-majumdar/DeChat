package p577jr;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: jr.g */
public enum C33639g implements C38174i<C33638f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91038d;

    /* renamed from: jr.g$a */
    public static final class C33640a {

        /* renamed from: a */
        public static final List<Object> f91039a = null;

        static {
            f91039a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91038d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91038d;
                if (obj == obj2) {
                    obj = new C33638f();
                    this.f91038d = obj;
                }
            }
        }
        return (C33638f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C33640a.f91039a;
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
        return "provider " + C33638f.class.getName();
    }
}
