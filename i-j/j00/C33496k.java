package j00;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: j00.k */
public enum C33496k implements C38174i<C9271j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90703d;

    /* renamed from: j00.k$a */
    public static final class C33497a {

        /* renamed from: a */
        public static final List<Object> f90704a = null;

        static {
            f90704a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90703d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90703d;
                if (obj == obj2) {
                    obj = new C9271j();
                    this.f90703d = obj;
                }
            }
        }
        return (C9271j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33497a.f90704a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C9271j.class.getName();
    }
}
