package hb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: hb0.w */
public enum C32792w implements C38174i<C46018v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89218d;

    /* renamed from: hb0.w$a */
    public static final class C32793a {

        /* renamed from: a */
        public static final List<Object> f89219a = null;

        static {
            f89219a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89218d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89218d;
                if (obj == obj2) {
                    obj = new C46018v();
                    this.f89218d = obj;
                }
            }
        }
        return (C46018v) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32793a.f89219a;
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
        return "provider " + C46018v.class.getName();
    }
}
