package w52;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: w52.m */
public enum C38024m implements C38174i<C38023l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100533d;

    /* renamed from: w52.m$a */
    public static final class C38025a {

        /* renamed from: a */
        public static final List<Object> f100534a = null;

        static {
            f100534a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100533d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100533d;
                if (obj == obj2) {
                    obj = new C38023l();
                    this.f100533d = obj;
                }
            }
        }
        return (C38023l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38025a.f100534a;
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
        return "provider " + C38023l.class.getName();
    }
}
