package ze2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ze2.c */
public enum C39346c implements C38174i<C79322b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105761d;

    /* renamed from: ze2.c$a */
    public static final class C39347a {

        /* renamed from: a */
        public static final List<Object> f105762a = null;

        static {
            f105762a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105761d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105761d;
                if (obj == obj2) {
                    obj = new C79322b();
                    this.f105761d = obj;
                }
            }
        }
        return (C79322b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C39347a.f105762a;
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
        return "provider " + C79322b.class.getName();
    }
}
