package p164hp;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: hp.c */
public enum C32974c implements C38174i<C32973b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89589d;

    /* renamed from: hp.c$a */
    public static final class C32975a {

        /* renamed from: a */
        public static final List<Object> f89590a = null;

        static {
            f89590a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89589d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89589d;
                if (obj == obj2) {
                    obj = new C32973b();
                    this.f89589d = obj;
                }
            }
        }
        return (C32973b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32975a.f89590a;
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
        return "provider " + C32973b.class.getName();
    }
}
