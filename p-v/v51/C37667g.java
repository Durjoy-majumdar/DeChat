package v51;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: v51.g */
public enum C37667g implements C38174i<C102149f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99841d;

    /* renamed from: v51.g$a */
    public static final class C37668a {

        /* renamed from: a */
        public static final List<Object> f99842a = null;

        static {
            f99842a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f99841d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99841d;
                if (obj == obj2) {
                    obj = new C102149f();
                    this.f99841d = obj;
                }
            }
        }
        return (C102149f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37668a.f99842a;
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
        return "provider " + C102149f.class.getName();
    }
}
