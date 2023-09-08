package p177ji;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ji.i */
public enum C33580i implements C38174i<C76416h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90905d;

    /* renamed from: ji.i$a */
    public static final class C33581a {

        /* renamed from: a */
        public static final List<Object> f90906a = null;

        static {
            f90906a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90905d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90905d;
                if (obj == obj2) {
                    obj = new C76416h();
                    this.f90905d = obj;
                }
            }
        }
        return (C76416h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33581a.f90906a;
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
        return "provider " + C76416h.class.getName();
    }
}
