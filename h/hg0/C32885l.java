package hg0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.FMessageMobileFilterEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hg0.l */
public enum C32885l implements C38174i<C76171k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89417d;

    /* renamed from: hg0.l$a */
    public static final class C32886a {

        /* renamed from: a */
        public static final List<Object> f89418a = null;

        static {
            f89418a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89417d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89417d;
                if (obj == obj2) {
                    obj = new C76171k();
                    this.f89417d = obj;
                }
            }
        }
        return (C76171k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32886a.f89418a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, FMessageMobileFilterEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76171k.class.getName();
    }
}
