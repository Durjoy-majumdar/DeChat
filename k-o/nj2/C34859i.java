package nj2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nj2.i */
public enum C34859i implements C38174i<C61759g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93645d;

    /* renamed from: nj2.i$a */
    public static final class C34860a {

        /* renamed from: a */
        public static final List<Object> f93646a = null;

        static {
            f93646a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93645d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93645d;
                if (obj == obj2) {
                    obj = new C61759g();
                    this.f93645d = obj;
                }
            }
        }
        return (C61759g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34860a.f93646a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C61759g.class.getName();
    }
}
