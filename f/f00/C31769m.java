package f00;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: f00.m */
public enum C31769m implements C38174i<C7962l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84820d;

    /* renamed from: f00.m$a */
    public static final class C31770a {

        /* renamed from: a */
        public static final List<Object> f84821a = null;

        static {
            f84821a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84820d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84820d;
                if (obj == obj2) {
                    obj = new C7962l();
                    this.f84820d = obj;
                }
            }
        }
        return (C7962l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31770a.f84821a;
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
        return "provider " + C7962l.class.getName();
    }
}
