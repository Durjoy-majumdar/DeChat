package p178ju;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ju.m */
public enum C33679m implements C38174i<C9521l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91122d;

    /* renamed from: ju.m$a */
    public static final class C33680a {

        /* renamed from: a */
        public static final List<Object> f91123a = null;

        static {
            f91123a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91122d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91122d;
                if (obj == obj2) {
                    obj = new C9521l();
                    this.f91122d = obj;
                }
            }
        }
        return (C9521l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33680a.f91123a;
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
        return "provider " + C9521l.class.getName();
    }
}
