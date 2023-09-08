package gf1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gf1.h */
public enum C32442h implements C38174i<C32440g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86030d;

    /* renamed from: gf1.h$a */
    public static final class C32443a {

        /* renamed from: a */
        public static final List<Object> f86031a = null;

        static {
            f86031a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f86030d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86030d;
                if (obj == obj2) {
                    obj = new C32440g();
                    this.f86030d = obj;
                }
            }
        }
        return (C32440g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32443a.f86031a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 1075839025);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32440g.class.getName();
    }
}
