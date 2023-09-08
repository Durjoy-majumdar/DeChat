package gd2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: gd2.e */
public enum C32397e implements C38174i<C32395d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85953d;

    /* renamed from: gd2.e$a */
    public static final class C32398a {

        /* renamed from: a */
        public static final List<Object> f85954a = null;

        static {
            f85954a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85953d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85953d;
                if (obj == obj2) {
                    obj = new C32395d();
                    this.f85953d = obj;
                }
            }
        }
        return (C32395d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32398a.f85954a;
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
        return "provider " + C32395d.class.getName();
    }
}
