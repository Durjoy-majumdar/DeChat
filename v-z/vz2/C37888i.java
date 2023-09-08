package vz2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: vz2.i */
public enum C37888i implements C38174i<C78504h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100291d;

    /* renamed from: vz2.i$a */
    public static final class C37889a {

        /* renamed from: a */
        public static final List<Object> f100292a = null;

        static {
            f100292a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100291d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100291d;
                if (obj == obj2) {
                    obj = new C78504h();
                    this.f100291d = obj;
                }
            }
        }
        return (C78504h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37889a.f100292a;
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
        return "provider " + C78504h.class.getName();
    }
}
