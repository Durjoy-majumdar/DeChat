package p598lq;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: lq.b */
public enum C34328b implements C38174i<C34327a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92490d;

    /* renamed from: lq.b$a */
    public static final class C34329a {

        /* renamed from: a */
        public static final List<Object> f92491a = null;

        static {
            f92491a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92490d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92490d;
                if (obj == obj2) {
                    obj = new C34327a();
                    this.f92490d = obj;
                }
            }
        }
        return (C34327a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34329a.f92491a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 2738);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34327a.class.getName();
    }
}
