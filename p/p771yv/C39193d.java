package p771yv;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: yv.d */
public enum C39193d implements C38174i<C91585c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105442d;

    /* renamed from: yv.d$a */
    public static final class C39194a {

        /* renamed from: a */
        public static final List<Object> f105443a = null;

        static {
            f105443a = Arrays.asList(new Object[]{C80625v0.MATCH_NOT_PLAIN_NOT_ISOLATED_PROCESSES});
        }
    }

    public Object get() {
        Object obj = this.f105442d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105442d;
                if (obj == obj2) {
                    obj = new C91585c();
                    this.f105442d = obj;
                }
            }
        }
        return (C91585c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C39194a.f105443a;
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
        return "provider " + C91585c.class.getName();
    }
}
