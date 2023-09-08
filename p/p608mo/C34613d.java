package p608mo;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.BizPreSearchEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: mo.d */
public enum C34613d implements C38174i<C47082c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93104d;

    /* renamed from: mo.d$a */
    public static final class C34614a {

        /* renamed from: a */
        public static final List<Object> f93105a = null;

        static {
            f93105a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f93104d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93104d;
                if (obj == obj2) {
                    obj = new C47082c();
                    this.f93104d = obj;
                }
            }
        }
        return (C47082c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34614a.f93105a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, BizPreSearchEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C47082c.class.getName();
    }
}
