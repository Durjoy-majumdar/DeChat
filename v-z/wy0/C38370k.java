package wy0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wy0.k */
public enum C38370k implements C38174i<C78737j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101245d;

    /* renamed from: wy0.k$a */
    public static final class C38371a {

        /* renamed from: a */
        public static final List<Object> f101246a = null;

        static {
            f101246a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101245d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101245d;
                if (obj == obj2) {
                    obj = new C78737j();
                    this.f101245d = obj;
                }
            }
        }
        return (C78737j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38371a.f101246a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 221) || Objects.equals(obj, 109) || Objects.equals(obj, 150) || Objects.equals(obj, 128);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78737j.class.getName();
    }
}
