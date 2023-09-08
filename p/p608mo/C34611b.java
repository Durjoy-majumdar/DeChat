package p608mo;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.BizPlaceTopChangeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: mo.b */
public enum C34611b implements C38174i<C47081a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93100d;

    /* renamed from: mo.b$a */
    public static final class C34612a {

        /* renamed from: a */
        public static final List<Object> f93101a = null;

        static {
            f93101a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f93100d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93100d;
                if (obj == obj2) {
                    obj = new C47081a();
                    this.f93100d = obj;
                }
            }
        }
        return (C47081a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34612a.f93101a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, BizPlaceTopChangeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C47081a.class.getName();
    }
}
