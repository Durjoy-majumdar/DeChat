package mh0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: mh0.e */
public enum C34560e implements C38174i<C99864d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92961d;

    /* renamed from: mh0.e$a */
    public static final class C34561a {

        /* renamed from: a */
        public static final List<Object> f92962a = null;

        static {
            f92962a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92961d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92961d;
                if (obj == obj2) {
                    obj = new C99864d();
                    this.f92961d = obj;
                }
            }
        }
        return (C99864d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34561a.f92962a;
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
        return "provider " + C99864d.class.getName();
    }
}
