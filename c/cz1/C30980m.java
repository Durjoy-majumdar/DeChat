package cz1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: cz1.m */
public enum C30980m implements C38174i<C45232k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83136d;

    /* renamed from: cz1.m$a */
    public static final class C30981a {

        /* renamed from: a */
        public static final List<Object> f83137a = null;

        static {
            f83137a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83136d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83136d;
                if (obj == obj2) {
                    obj = new C45232k();
                    this.f83136d = obj;
                }
            }
        }
        return (C45232k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30981a.f83137a;
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
        return "provider " + C45232k.class.getName();
    }
}
