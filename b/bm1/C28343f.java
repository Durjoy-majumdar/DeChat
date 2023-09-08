package bm1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: bm1.f */
public enum C28343f implements C38174i<C28342e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77974d;

    /* renamed from: bm1.f$a */
    public static final class C28344a {

        /* renamed from: a */
        public static final List<Object> f77975a = null;

        static {
            f77975a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77974d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77974d;
                if (obj == obj2) {
                    obj = new C28342e();
                    this.f77974d = obj;
                }
            }
        }
        return (C28342e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28344a.f77975a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 5);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28342e.class.getName();
    }
}
