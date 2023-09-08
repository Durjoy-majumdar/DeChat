package ue1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ue1.q */
public enum C37436q implements C38174i<C102002p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98947d;

    /* renamed from: ue1.q$a */
    public static final class C37437a {

        /* renamed from: a */
        public static final List<Object> f98948a = null;

        static {
            f98948a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98947d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98947d;
                if (obj == obj2) {
                    obj = new C102002p();
                    this.f98947d = obj;
                }
            }
        }
        return (C102002p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37437a.f98948a;
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
        return "provider " + C102002p.class.getName();
    }
}
