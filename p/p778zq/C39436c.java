package p778zq;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: zq.c */
public enum C39436c implements C38174i<C39435b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105933d;

    /* renamed from: zq.c$a */
    public static final class C39437a {

        /* renamed from: a */
        public static final List<Object> f105934a = null;

        static {
            f105934a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105933d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105933d;
                if (obj == obj2) {
                    obj = new C39435b();
                    this.f105933d = obj;
                }
            }
        }
        return (C39435b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C39437a.f105934a;
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
        return "provider " + C39435b.class.getName();
    }
}
