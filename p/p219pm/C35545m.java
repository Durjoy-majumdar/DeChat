package p219pm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: pm.m */
public enum C35545m implements C38174i<C89368l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95046d;

    /* renamed from: pm.m$a */
    public static final class C35546a {

        /* renamed from: a */
        public static final List<Object> f95047a = null;

        static {
            f95047a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f95046d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95046d;
                if (obj == obj2) {
                    obj = new C89368l();
                    this.f95046d = obj;
                }
            }
        }
        return (C89368l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35546a.f95047a;
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
        return "provider " + C89368l.class.getName();
    }
}
