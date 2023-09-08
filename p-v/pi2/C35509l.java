package pi2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: pi2.l */
public enum C35509l implements C38174i<C35508k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94969d;

    /* renamed from: pi2.l$a */
    public static final class C35510a {

        /* renamed from: a */
        public static final List<Object> f94970a = null;

        static {
            f94970a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94969d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94969d;
                if (obj == obj2) {
                    obj = new C35508k();
                    this.f94969d = obj;
                }
            }
        }
        return (C35508k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35510a.f94970a;
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
        return "provider " + C35508k.class.getName();
    }
}
