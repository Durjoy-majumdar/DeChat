package p546ha;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ha.d */
public enum C32743d implements C38174i<C76147c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89125d;

    /* renamed from: ha.d$a */
    public static final class C32744a {

        /* renamed from: a */
        public static final List<Object> f89126a = null;

        static {
            f89126a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f89125d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89125d;
                if (obj == obj2) {
                    obj = new C76147c();
                    this.f89125d = obj;
                }
            }
        }
        return (C76147c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32744a.f89126a;
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
        return "provider " + C76147c.class.getName();
    }
}
