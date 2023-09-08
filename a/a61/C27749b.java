package a61;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: a61.b */
public enum C27749b implements C38174i<C27747a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76782d;

    /* renamed from: a61.b$a */
    public static final class C27750a {

        /* renamed from: a */
        public static final List<Object> f76783a = null;

        static {
            f76783a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76782d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76782d;
                if (obj == obj2) {
                    obj = new C27747a();
                    this.f76782d = obj;
                }
            }
        }
        return (C27747a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27750a.f76783a;
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
        return "provider " + C27747a.class.getName();
    }
}
