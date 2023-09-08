package nk2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: nk2.e */
public enum C34864e implements C38174i<C21635b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93657d;

    /* renamed from: nk2.e$a */
    public static final class C34865a {

        /* renamed from: a */
        public static final List<Object> f93658a = null;

        static {
            f93658a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93657d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93657d;
                if (obj == obj2) {
                    obj = new C21635b();
                    this.f93657d = obj;
                }
            }
        }
        return (C21635b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34865a.f93658a;
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
        return "provider " + C21635b.class.getName();
    }
}
