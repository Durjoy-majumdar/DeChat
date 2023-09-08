package fz1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fz1.i */
public enum C32243i implements C38174i<C32242h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85661d;

    /* renamed from: fz1.i$a */
    public static final class C32244a {

        /* renamed from: a */
        public static final List<Object> f85662a = null;

        static {
            f85662a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85661d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85661d;
                if (obj == obj2) {
                    obj = new C32242h();
                    this.f85661d = obj;
                }
            }
        }
        return (C32242h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32244a.f85662a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 3);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32242h.class.getName();
    }
}
