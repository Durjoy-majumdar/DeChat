package kj3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: kj3.b */
public enum C33919b implements C38174i<C46727a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91615d;

    /* renamed from: kj3.b$a */
    public static final class C33920a {

        /* renamed from: a */
        public static final List<Object> f91616a = null;

        static {
            f91616a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91615d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91615d;
                if (obj == obj2) {
                    obj = new C46727a();
                    this.f91615d = obj;
                }
            }
        }
        return (C46727a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33920a.f91616a;
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
        return "provider " + C46727a.class.getName();
    }
}
