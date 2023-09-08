package p177ji;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ji.k */
public enum C33583k implements C38174i<C33582j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90909d;

    /* renamed from: ji.k$a */
    public static final class C33584a {

        /* renamed from: a */
        public static final List<Object> f90910a = null;

        static {
            f90910a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90909d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90909d;
                if (obj == obj2) {
                    obj = new C33582j();
                    this.f90909d = obj;
                }
            }
        }
        return (C33582j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33584a.f90910a;
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
        return "provider " + C33582j.class.getName();
    }
}
