package p420ur;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ur.m */
public enum C37571m implements C38174i<C65465l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99651d;

    /* renamed from: ur.m$a */
    public static final class C37572a {

        /* renamed from: a */
        public static final List<Object> f99652a = null;

        static {
            f99652a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f99651d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99651d;
                if (obj == obj2) {
                    obj = new C65465l();
                    this.f99651d = obj;
                }
            }
        }
        return (C65465l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37572a.f99652a;
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
        return "provider " + C65465l.class.getName();
    }
}
