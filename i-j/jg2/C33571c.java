package jg2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: jg2.c */
public enum C33571c implements C38174i<C76415b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90884d;

    /* renamed from: jg2.c$a */
    public static final class C33572a {

        /* renamed from: a */
        public static final List<Object> f90885a = null;

        static {
            f90885a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90884d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90884d;
                if (obj == obj2) {
                    obj = new C76415b();
                    this.f90884d = obj;
                }
            }
        }
        return (C76415b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33572a.f90885a;
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
        return "provider " + C76415b.class.getName();
    }
}
