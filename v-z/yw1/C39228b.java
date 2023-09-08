package yw1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: yw1.b */
public enum C39228b implements C38174i<C53587a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105536d;

    /* renamed from: yw1.b$a */
    public static final class C39229a {

        /* renamed from: a */
        public static final List<Object> f105537a = null;

        static {
            f105537a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105536d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105536d;
                if (obj == obj2) {
                    obj = new C53587a();
                    this.f105536d = obj;
                }
            }
        }
        return (C53587a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C39229a.f105537a;
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
        return "provider " + C53587a.class.getName();
    }
}
