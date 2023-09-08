package o62;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: o62.d */
public enum C35109d implements C38174i<C11373b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94189d;

    /* renamed from: o62.d$a */
    public static final class C35110a {

        /* renamed from: a */
        public static final List<Object> f94190a = null;

        static {
            f94190a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94189d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94189d;
                if (obj == obj2) {
                    obj = new C11373b();
                    this.f94189d = obj;
                }
            }
        }
        return (C11373b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35110a.f94190a;
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
        return "provider " + C11373b.class.getName();
    }
}
