package n01;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: n01.d */
public enum C34713d implements C38174i<C117591c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93341d;

    /* renamed from: n01.d$a */
    public static final class C34714a {

        /* renamed from: a */
        public static final List<Object> f93342a = null;

        static {
            f93342a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93341d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93341d;
                if (obj == obj2) {
                    obj = new C117591c();
                    this.f93341d = obj;
                }
            }
        }
        return (C117591c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34714a.f93342a;
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
        return "provider " + C117591c.class.getName();
    }
}
