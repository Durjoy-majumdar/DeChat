package p670qx;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: qx.m */
public enum C36157m implements C38174i<C36156l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96342d;

    /* renamed from: qx.m$a */
    public static final class C36158a {

        /* renamed from: a */
        public static final List<Object> f96343a = null;

        static {
            f96343a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96342d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96342d;
                if (obj == obj2) {
                    obj = new C36156l();
                    this.f96342d = obj;
                }
            }
        }
        return (C36156l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36158a.f96343a;
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
        return "provider " + C36156l.class.getName();
    }
}
