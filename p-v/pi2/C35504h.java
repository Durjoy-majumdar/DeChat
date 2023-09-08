package pi2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: pi2.h */
public enum C35504h implements C38174i<C35501g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94961d;

    /* renamed from: pi2.h$a */
    public static final class C35505a {

        /* renamed from: a */
        public static final List<Object> f94962a = null;

        static {
            f94962a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94961d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94961d;
                if (obj == obj2) {
                    obj = new C35501g();
                    this.f94961d = obj;
                }
            }
        }
        return (C35501g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35505a.f94962a;
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
        return "provider " + C35501g.class.getName();
    }
}
