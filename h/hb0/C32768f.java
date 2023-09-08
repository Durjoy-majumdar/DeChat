package hb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: hb0.f */
public enum C32768f implements C38174i<C32767e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89175d;

    /* renamed from: hb0.f$a */
    public static final class C32769a {

        /* renamed from: a */
        public static final List<Object> f89176a = null;

        static {
            f89176a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89175d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89175d;
                if (obj == obj2) {
                    obj = new C32767e();
                    this.f89175d = obj;
                }
            }
        }
        return (C32767e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32769a.f89176a;
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
        return "provider " + C32767e.class.getName();
    }
}
