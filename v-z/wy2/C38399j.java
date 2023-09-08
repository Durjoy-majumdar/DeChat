package wy2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: wy2.j */
public enum C38399j implements C38174i<C53245i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101304d;

    /* renamed from: wy2.j$a */
    public static final class C38400a {

        /* renamed from: a */
        public static final List<Object> f101305a = null;

        static {
            f101305a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101304d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101304d;
                if (obj == obj2) {
                    obj = new C53245i();
                    this.f101304d = obj;
                }
            }
        }
        return (C53245i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38400a.f101305a;
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
        return "provider " + C53245i.class.getName();
    }
}
