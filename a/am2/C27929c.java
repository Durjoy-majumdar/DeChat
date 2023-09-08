package am2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: am2.c */
public enum C27929c implements C38174i<C27925b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77142d;

    /* renamed from: am2.c$a */
    public static final class C27930a {

        /* renamed from: a */
        public static final List<Object> f77143a = null;

        static {
            f77143a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77142d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77142d;
                if (obj == obj2) {
                    obj = new C27925b();
                    this.f77142d = obj;
                }
            }
        }
        return (C27925b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C27930a.f77143a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.f84459e);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27925b.class.getName();
    }
}
