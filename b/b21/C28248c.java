package b21;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: b21.c */
public enum C28248c implements C38174i<C113081b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77793d;

    /* renamed from: b21.c$a */
    public static final class C28249a {

        /* renamed from: a */
        public static final List<Object> f77794a = null;

        static {
            f77794a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77793d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77793d;
                if (obj == obj2) {
                    obj = new C113081b();
                    this.f77793d = obj;
                }
            }
        }
        return (C113081b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28249a.f77794a;
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
        return "provider " + C113081b.class.getName();
    }
}
