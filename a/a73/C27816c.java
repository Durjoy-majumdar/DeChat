package a73;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a73.c */
public enum C27816c implements C38174i<C79472b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76912d;

    /* renamed from: a73.c$a */
    public static final class C27817a {

        /* renamed from: a */
        public static final List<Object> f76913a = null;

        static {
            f76913a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76912d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76912d;
                if (obj == obj2) {
                    obj = new C79472b();
                    this.f76912d = obj;
                }
            }
        }
        return (C79472b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C27817a.f76913a;
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
        return "provider " + C79472b.class.getName();
    }
}
