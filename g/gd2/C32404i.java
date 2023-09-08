package gd2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gd2.i */
public enum C32404i implements C38174i<C32402h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85963d;

    /* renamed from: gd2.i$a */
    public static final class C32405a {

        /* renamed from: a */
        public static final List<Object> f85964a = null;

        static {
            f85964a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85963d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85963d;
                if (obj == obj2) {
                    obj = new C32402h();
                    this.f85963d = obj;
                }
            }
        }
        return (C32402h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32405a.f85964a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "paymsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32402h.class.getName();
    }
}
