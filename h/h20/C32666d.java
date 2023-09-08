package h20;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: h20.d */
public enum C32666d implements C38174i<C32665c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86687d;

    /* renamed from: h20.d$a */
    public static final class C32667a {

        /* renamed from: a */
        public static final List<Object> f86688a = null;

        static {
            f86688a = Arrays.asList(new Object[]{C80625v0.MATCH_NOT_PLAIN_PROCESSES});
        }
    }

    public Object get() {
        Object obj = this.f86687d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86687d;
                if (obj == obj2) {
                    obj = new C32665c();
                    this.f86687d = obj;
                }
            }
        }
        return (C32665c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32667a.f86688a;
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
        return "provider " + C32665c.class.getName();
    }
}
