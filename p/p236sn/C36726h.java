package p236sn;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: sn.h */
public enum C36726h implements C38174i<C48423g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97566d;

    /* renamed from: sn.h$a */
    public static final class C36727a {

        /* renamed from: a */
        public static final List<Object> f97567a = null;

        static {
            f97567a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97566d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97566d;
                if (obj == obj2) {
                    obj = new C48423g();
                    this.f97566d = obj;
                }
            }
        }
        return (C48423g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36727a.f97567a;
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
        return "provider " + C48423g.class.getName();
    }
}
