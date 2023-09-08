package v51;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: v51.c */
public enum C37665c implements C38174i<C102147b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99837d;

    /* renamed from: v51.c$a */
    public static final class C37666a {

        /* renamed from: a */
        public static final List<Object> f99838a = null;

        static {
            f99838a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f99837d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99837d;
                if (obj == obj2) {
                    obj = new C102147b();
                    this.f99837d = obj;
                }
            }
        }
        return (C102147b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37666a.f99838a;
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
        return "provider " + C102147b.class.getName();
    }
}
