package wy2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: wy2.n */
public enum C38406n implements C38174i<C38403m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101314d;

    /* renamed from: wy2.n$a */
    public static final class C38407a {

        /* renamed from: a */
        public static final List<Object> f101315a = null;

        static {
            f101315a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101314d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101314d;
                if (obj == obj2) {
                    obj = new C38403m();
                    this.f101314d = obj;
                }
            }
        }
        return (C38403m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38407a.f101315a;
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
        return "provider " + C38403m.class.getName();
    }
}
