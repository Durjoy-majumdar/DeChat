package rg2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: rg2.c */
public enum C36323c implements C38174i<C48027b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96690d;

    /* renamed from: rg2.c$a */
    public static final class C36324a {

        /* renamed from: a */
        public static final List<Object> f96691a = null;

        static {
            f96691a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96690d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96690d;
                if (obj == obj2) {
                    obj = new C48027b();
                    this.f96690d = obj;
                }
            }
        }
        return (C48027b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36324a.f96691a;
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
        return "provider " + C48027b.class.getName();
    }
}
