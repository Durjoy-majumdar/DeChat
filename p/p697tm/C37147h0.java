package p697tm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: tm.h0 */
public enum C37147h0 implements C38174i<C90519g0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98369d;

    /* renamed from: tm.h0$a */
    public static final class C37148a {

        /* renamed from: a */
        public static final List<Object> f98370a = null;

        static {
            f98370a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98369d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98369d;
                if (obj == obj2) {
                    obj = new C90519g0();
                    this.f98369d = obj;
                }
            }
        }
        return (C90519g0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37148a.f98370a;
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
        return "provider " + C90519g0.class.getName();
    }
}
