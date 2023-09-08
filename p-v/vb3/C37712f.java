package vb3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: vb3.f */
public enum C37712f implements C38174i<C37711e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99909d;

    /* renamed from: vb3.f$a */
    public static final class C37713a {

        /* renamed from: a */
        public static final List<Object> f99910a = null;

        static {
            f99910a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f99909d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99909d;
                if (obj == obj2) {
                    obj = new C37711e();
                    this.f99909d = obj;
                }
            }
        }
        return (C37711e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37713a.f99910a;
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
        return "provider " + C37711e.class.getName();
    }
}
