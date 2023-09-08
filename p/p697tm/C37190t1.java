package p697tm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.t1 */
public enum C37190t1 implements C38174i<C90526s1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98457d;

    /* renamed from: tm.t1$a */
    public static final class C37191a {

        /* renamed from: a */
        public static final List<Object> f98458a = null;

        static {
            f98458a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98457d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98457d;
                if (obj == obj2) {
                    obj = new C90526s1();
                    this.f98457d = obj;
                }
            }
        }
        return (C90526s1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37191a.f98458a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "wxareddot");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C90526s1.class.getName();
    }
}
