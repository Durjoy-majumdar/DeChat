package p459bu;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: bu.c */
public enum C28421c implements C38174i<C28420b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78156d;

    /* renamed from: bu.c$a */
    public static final class C28422a {

        /* renamed from: a */
        public static final List<Object> f78157a = null;

        static {
            f78157a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f78156d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78156d;
                if (obj == obj2) {
                    obj = new C28420b();
                    this.f78156d = obj;
                }
            }
        }
        return (C28420b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28422a.f78157a;
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
        return "provider " + C28420b.class.getName();
    }
}
