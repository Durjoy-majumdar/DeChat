package wy2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: wy2.g */
public enum C38396g implements C38174i<C78738f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101299d;

    /* renamed from: wy2.g$a */
    public static final class C38397a {

        /* renamed from: a */
        public static final List<Object> f101300a = null;

        static {
            f101300a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101299d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101299d;
                if (obj == obj2) {
                    obj = new C78738f();
                    this.f101299d = obj;
                }
            }
        }
        return (C78738f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38397a.f101300a;
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
        return "provider " + C78738f.class.getName();
    }
}
