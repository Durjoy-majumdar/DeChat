package xy2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: xy2.f */
public enum C38915f implements C38174i<C38914e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104880d;

    /* renamed from: xy2.f$a */
    public static final class C38916a {

        /* renamed from: a */
        public static final List<Object> f104881a = null;

        static {
            f104881a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f104880d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104880d;
                if (obj == obj2) {
                    obj = new C38914e();
                    this.f104880d = obj;
                }
            }
        }
        return (C38914e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38916a.f104881a;
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
        return "provider " + C38914e.class.getName();
    }
}
