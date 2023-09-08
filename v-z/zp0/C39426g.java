package zp0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: zp0.g */
public enum C39426g implements C38174i<C91825c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105909d;

    /* renamed from: zp0.g$a */
    public static final class C39427a {

        /* renamed from: a */
        public static final List<Object> f105910a = null;

        static {
            f105910a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105909d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105909d;
                if (obj == obj2) {
                    obj = new C91825c();
                    this.f105909d = obj;
                }
            }
        }
        return (C91825c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C39427a.f105910a;
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
        return "provider " + C91825c.class.getName();
    }
}
