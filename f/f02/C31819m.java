package f02;

import c02.C28462d;
import com.tencent.p014mm.app.C80625v0;
import f02.C31817l;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: f02.m */
public enum C31819m implements C38174i<C31790e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84889d;

    /* renamed from: f02.m$a */
    public static final class C31820a {

        /* renamed from: a */
        public static final List<Object> f84890a = null;

        static {
            f84890a = Arrays.asList(new Object[]{C28462d.class});
        }
    }

    /* renamed from: f02.m$b */
    public static final class C31821b {

        /* renamed from: a */
        public static final List<Object> f84891a = null;

        static {
            f84891a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84889d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84889d;
                if (obj == obj2) {
                    C31817l.f84886a.getClass();
                    obj = C31790e.f84852d;
                    this.f84889d = obj;
                }
            }
        }
        return (C31790e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C31817l.C31818a.class;
        }
        if ("onProcess".equals(str)) {
            return C31821b.f84891a;
        }
        if ("dependencies".equals(str)) {
            return C31820a.f84890a;
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
        return "provider " + C31790e.class.getName();
    }
}
