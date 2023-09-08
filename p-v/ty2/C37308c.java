package ty2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ty2.c */
public enum C37308c implements C38174i<C101937b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98686d;

    /* renamed from: ty2.c$a */
    public static final class C37309a {

        /* renamed from: a */
        public static final List<Object> f98687a = null;

        static {
            f98687a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98686d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98686d;
                if (obj == obj2) {
                    obj = new C101937b();
                    this.f98686d = obj;
                }
            }
        }
        return (C101937b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37309a.f98687a;
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
        return "provider " + C101937b.class.getName();
    }
}
