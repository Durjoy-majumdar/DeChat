package p697tm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: tm.z1 */
public enum C37210z1 implements C38174i<C37206y1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98499d;

    /* renamed from: tm.z1$a */
    public static final class C37211a {

        /* renamed from: a */
        public static final List<Object> f98500a = null;

        static {
            f98500a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98499d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98499d;
                if (obj == obj2) {
                    obj = new C37206y1();
                    this.f98499d = obj;
                }
            }
        }
        return (C37206y1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37211a.f98500a;
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
        return "provider " + C37206y1.class.getName();
    }
}
