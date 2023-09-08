package hb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: hb0.y */
public enum C32795y implements C38174i<C32794x> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89222d;

    /* renamed from: hb0.y$a */
    public static final class C32796a {

        /* renamed from: a */
        public static final List<Object> f89223a = null;

        static {
            f89223a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89222d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89222d;
                if (obj == obj2) {
                    obj = new C32794x();
                    this.f89222d = obj;
                }
            }
        }
        return (C32794x) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32796a.f89223a;
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
        return "provider " + C32794x.class.getName();
    }
}
