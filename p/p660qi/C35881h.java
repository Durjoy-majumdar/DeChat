package p660qi;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: qi.h */
public enum C35881h implements C38174i<C35880g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95747d;

    /* renamed from: qi.h$a */
    public static final class C35882a {

        /* renamed from: a */
        public static final List<Object> f95748a = null;

        static {
            f95748a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95747d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95747d;
                if (obj == obj2) {
                    obj = new C35880g();
                    this.f95747d = obj;
                }
            }
        }
        return (C35880g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35882a.f95748a;
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
        return "provider " + C35880g.class.getName();
    }
}
