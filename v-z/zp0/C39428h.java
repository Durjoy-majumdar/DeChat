package zp0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: zp0.h */
public enum C39428h implements C38174i<C91826d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105913d;

    /* renamed from: zp0.h$a */
    public static final class C39429a {

        /* renamed from: a */
        public static final List<Object> f105914a = null;

        static {
            f105914a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105913d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105913d;
                if (obj == obj2) {
                    obj = new C91826d();
                    this.f105913d = obj;
                }
            }
        }
        return (C91826d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C39429a.f105914a;
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
        return "provider " + C91826d.class.getName();
    }
}
