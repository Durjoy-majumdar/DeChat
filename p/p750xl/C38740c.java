package p750xl;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xl.c */
public enum C38740c implements C38174i<C38738b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104512d;

    /* renamed from: xl.c$a */
    public static final class C38741a {

        /* renamed from: a */
        public static final List<Object> f104513a = null;

        static {
            f104513a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f104512d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104512d;
                if (obj == obj2) {
                    obj = new C38738b();
                    this.f104512d = obj;
                }
            }
        }
        return (C38738b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38741a.f104513a;
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
        return "provider " + C38738b.class.getName();
    }
}
