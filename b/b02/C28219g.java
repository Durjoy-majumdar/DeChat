package b02;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: b02.g */
public enum C28219g implements C38174i<C28218f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77755d;

    /* renamed from: b02.g$a */
    public static final class C28220a {

        /* renamed from: a */
        public static final List<Object> f77756a = null;

        static {
            f77756a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77755d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77755d;
                if (obj == obj2) {
                    obj = new C28218f();
                    this.f77755d = obj;
                }
            }
        }
        return (C28218f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28220a.f77756a;
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
        return "provider " + C28218f.class.getName();
    }
}
