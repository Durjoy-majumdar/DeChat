package kj3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: kj3.e */
public enum C33922e implements C38174i<C33921d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91619d;

    /* renamed from: kj3.e$a */
    public static final class C33923a {

        /* renamed from: a */
        public static final List<Object> f91620a = null;

        static {
            f91620a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91619d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91619d;
                if (obj == obj2) {
                    obj = new C33921d();
                    this.f91619d = obj;
                }
            }
        }
        return (C33921d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33923a.f91620a;
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
        return "provider " + C33921d.class.getName();
    }
}
