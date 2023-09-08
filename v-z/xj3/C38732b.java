package xj3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: xj3.b */
public enum C38732b implements C38174i<C102679a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104500d;

    /* renamed from: xj3.b$a */
    public static final class C38733a {

        /* renamed from: a */
        public static final List<Object> f104501a = null;

        static {
            f104501a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f104500d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104500d;
                if (obj == obj2) {
                    obj = new C102679a();
                    this.f104500d = obj;
                }
            }
        }
        return (C102679a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38733a.f104501a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C102679a.class.getName();
    }
}
