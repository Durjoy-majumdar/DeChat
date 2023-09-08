package gd2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: gd2.g */
public enum C32400g implements C38174i<C32399f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85957d;

    /* renamed from: gd2.g$a */
    public static final class C32401a {

        /* renamed from: a */
        public static final List<Object> f85958a = null;

        static {
            f85958a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85957d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85957d;
                if (obj == obj2) {
                    obj = new C32399f();
                    this.f85957d = obj;
                }
            }
        }
        return (C32399f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32401a.f85958a;
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
        return "provider " + C32399f.class.getName();
    }
}
