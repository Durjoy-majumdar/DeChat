package ue1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ue1.o */
public enum C37434o implements C38174i<C52546n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98943d;

    /* renamed from: ue1.o$a */
    public static final class C37435a {

        /* renamed from: a */
        public static final List<Object> f98944a = null;

        static {
            f98944a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98943d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98943d;
                if (obj == obj2) {
                    obj = new C52546n();
                    this.f98943d = obj;
                }
            }
        }
        return (C52546n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37435a.f98944a;
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
        return "provider " + C52546n.class.getName();
    }
}
