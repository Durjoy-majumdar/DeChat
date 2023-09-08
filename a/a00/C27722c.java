package a00;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a00.c */
public enum C27722c implements C38174i<C66987b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76739d;

    /* renamed from: a00.c$a */
    public static final class C27723a {

        /* renamed from: a */
        public static final List<Object> f76740a = null;

        static {
            f76740a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76739d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76739d;
                if (obj == obj2) {
                    obj = new C66987b();
                    this.f76739d = obj;
                }
            }
        }
        return (C66987b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C27723a.f76740a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "paymsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C66987b.class.getName();
    }
}
