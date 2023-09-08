package gd3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: gd3.d */
public enum C32408d implements C38174i<C75905c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85973d;

    /* renamed from: gd3.d$a */
    public static final class C32409a {

        /* renamed from: a */
        public static final List<Object> f85974a = null;

        static {
            f85974a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85973d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85973d;
                if (obj == obj2) {
                    obj = new C75905c();
                    this.f85973d = obj;
                }
            }
        }
        return (C75905c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32409a.f85974a;
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
        return "provider " + C75905c.class.getName();
    }
}
