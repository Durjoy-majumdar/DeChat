package kc3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: kc3.d */
public enum C33878d implements C38174i<C33877c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91541d;

    /* renamed from: kc3.d$a */
    public static final class C33879a {

        /* renamed from: a */
        public static final List<Object> f91542a = null;

        static {
            f91542a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91541d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91541d;
                if (obj == obj2) {
                    obj = new C33877c();
                    this.f91541d = obj;
                }
            }
        }
        return (C33877c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33879a.f91542a;
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
        return "provider " + C33877c.class.getName();
    }
}
