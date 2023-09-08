package p639ow;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ow.i */
public enum C35330i implements C38174i<C35329h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94630d;

    /* renamed from: ow.i$a */
    public static final class C35331a {

        /* renamed from: a */
        public static final List<Object> f94631a = null;

        static {
            f94631a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94630d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94630d;
                if (obj == obj2) {
                    obj = new C35329h();
                    this.f94630d = obj;
                }
            }
        }
        return (C35329h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35331a.f94631a;
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
        return "provider " + C35329h.class.getName();
    }
}
