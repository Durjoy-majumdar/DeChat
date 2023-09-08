package ib0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ib0.r */
public enum C33276r implements C38174i<C33275q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90256d;

    /* renamed from: ib0.r$a */
    public static final class C33277a {

        /* renamed from: a */
        public static final List<Object> f90257a = null;

        static {
            f90257a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90256d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90256d;
                if (obj == obj2) {
                    obj = new C33275q();
                    this.f90256d = obj;
                }
            }
        }
        return (C33275q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33277a.f90257a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "newabtest") || Objects.equals(obj, "newabtestinfo");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33275q.class.getName();
    }
}
