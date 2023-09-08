package mh0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: mh0.h */
public enum C34565h implements C38174i<C99878g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92968d;

    /* renamed from: mh0.h$a */
    public static final class C34566a {

        /* renamed from: a */
        public static final List<Object> f92969a = null;

        static {
            f92969a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92968d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92968d;
                if (obj == obj2) {
                    obj = new C99878g();
                    this.f92968d = obj;
                }
            }
        }
        return (C99878g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34566a.f92969a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 98);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C99878g.class.getName();
    }
}
