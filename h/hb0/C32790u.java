package hb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: hb0.u */
public enum C32790u implements C38174i<C46017t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89214d;

    /* renamed from: hb0.u$a */
    public static final class C32791a {

        /* renamed from: a */
        public static final List<Object> f89215a = null;

        static {
            f89215a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89214d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89214d;
                if (obj == obj2) {
                    obj = new C46017t();
                    this.f89214d = obj;
                }
            }
        }
        return (C46017t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32791a.f89215a;
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
        return "provider " + C46017t.class.getName();
    }
}
