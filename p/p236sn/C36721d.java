package p236sn;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: sn.d */
public enum C36721d implements C38174i<C48421c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97559d;

    /* renamed from: sn.d$a */
    public static final class C36722a {

        /* renamed from: a */
        public static final List<Object> f97560a = null;

        static {
            f97560a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97559d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97559d;
                if (obj == obj2) {
                    obj = new C48421c();
                    this.f97559d = obj;
                }
            }
        }
        return (C48421c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36722a.f97560a;
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
        return "provider " + C48421c.class.getName();
    }
}
