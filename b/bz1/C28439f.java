package bz1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: bz1.f */
public enum C28439f implements C38174i<C0395e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78192d;

    /* renamed from: bz1.f$a */
    public static final class C28440a {

        /* renamed from: a */
        public static final List<Object> f78193a = null;

        static {
            f78193a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f78192d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78192d;
                if (obj == obj2) {
                    obj = new C0395e();
                    this.f78192d = obj;
                }
            }
        }
        return (C0395e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28440a.f78193a;
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
        return "provider " + C0395e.class.getName();
    }
}
