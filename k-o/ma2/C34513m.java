package ma2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import ma2.C99808k;
import p261wl.C38174i;

/* renamed from: ma2.m */
public enum C34513m implements C38174i<C99808k.C34508b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92873d;

    /* renamed from: ma2.m$a */
    public static final class C34514a {

        /* renamed from: a */
        public static final List<Object> f92874a = null;

        static {
            f92874a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92873d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92873d;
                if (obj == obj2) {
                    obj = new C99808k.C34508b();
                    this.f92873d = obj;
                }
            }
        }
        return (C99808k.C34508b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34514a.f92874a;
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
        return "provider " + C99808k.C34508b.class.getName();
    }
}
