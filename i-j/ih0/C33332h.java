package ih0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ih0.h */
public enum C33332h implements C38174i<C21093g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90362d;

    /* renamed from: ih0.h$a */
    public static final class C33333a {

        /* renamed from: a */
        public static final List<Object> f90363a = null;

        static {
            f90363a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f90362d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90362d;
                if (obj == obj2) {
                    obj = new C21093g();
                    this.f90362d = obj;
                }
            }
        }
        return (C21093g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C33333a.f90363a;
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
        return "provider " + C21093g.class.getName();
    }
}
