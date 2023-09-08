package f00;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: f00.q */
public enum C31775q implements C38174i<C31774p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84828d;

    /* renamed from: f00.q$a */
    public static final class C31776a {

        /* renamed from: a */
        public static final List<Object> f84829a = null;

        static {
            f84829a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84828d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84828d;
                if (obj == obj2) {
                    obj = new C31774p();
                    this.f84828d = obj;
                }
            }
        }
        return (C31774p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31776a.f84829a;
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
        return "provider " + C31774p.class.getName();
    }
}
