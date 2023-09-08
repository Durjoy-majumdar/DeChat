package o81;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: o81.k */
public enum C35116k implements C38174i<C117715c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94201d;

    /* renamed from: o81.k$a */
    public static final class C35117a {

        /* renamed from: a */
        public static final List<Object> f94202a = null;

        static {
            f94202a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f94201d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94201d;
                if (obj == obj2) {
                    obj = new C117715c();
                    this.f94201d = obj;
                }
            }
        }
        return (C117715c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35117a.f94202a;
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
        return "provider " + C117715c.class.getName();
    }
}
