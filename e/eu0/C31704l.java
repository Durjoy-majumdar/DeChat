package eu0;

import com.tencent.p014mm.app.C80625v0;
import eu0.C31702k;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: eu0.l */
public enum C31704l implements C38174i<C86697j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84663d;

    /* renamed from: eu0.l$a */
    public static final class C31705a {

        /* renamed from: a */
        public static final List<Object> f84664a = null;

        static {
            f84664a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84663d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84663d;
                if (obj == obj2) {
                    C31702k.f84660a.getClass();
                    obj = C86697j.f251707d;
                    this.f84663d = obj;
                }
            }
        }
        return (C86697j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C31702k.C31703a.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31705a.f84664a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "WxaNativeVoipNotify");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C86697j.class.getName();
    }
}
