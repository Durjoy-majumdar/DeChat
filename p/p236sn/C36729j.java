package p236sn;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: sn.j */
public enum C36729j implements C38174i<C36728i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97570d;

    /* renamed from: sn.j$a */
    public static final class C36730a {

        /* renamed from: a */
        public static final List<Object> f97571a = null;

        static {
            f97571a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97570d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97570d;
                if (obj == obj2) {
                    obj = new C36728i();
                    this.f97570d = obj;
                }
            }
        }
        return (C36728i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36730a.f97571a;
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
        return "provider " + C36728i.class.getName();
    }
}
