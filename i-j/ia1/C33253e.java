package ia1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ia1.e */
public enum C33253e implements C38174i<C33252d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90215d;

    /* renamed from: ia1.e$a */
    public static final class C33254a {

        /* renamed from: a */
        public static final List<Object> f90216a = null;

        static {
            f90216a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90215d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90215d;
                if (obj == obj2) {
                    obj = new C33252d();
                    this.f90215d = obj;
                }
            }
        }
        return (C33252d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C33254a.f90216a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 211);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33252d.class.getName();
    }
}
