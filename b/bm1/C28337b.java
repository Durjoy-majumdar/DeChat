package bm1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: bm1.b */
public enum C28337b implements C38174i<C28336a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77966d;

    /* renamed from: bm1.b$a */
    public static final class C28338a {

        /* renamed from: a */
        public static final List<Object> f77967a = null;

        static {
            f77967a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77966d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77966d;
                if (obj == obj2) {
                    obj = new C28336a();
                    this.f77966d = obj;
                }
            }
        }
        return (C28336a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28338a.f77967a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 7);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28336a.class.getName();
    }
}
