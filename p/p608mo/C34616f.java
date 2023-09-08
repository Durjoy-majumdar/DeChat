package p608mo;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DestroyPreloadedWebViewEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: mo.f */
public enum C34616f implements C38174i<C34615e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93108d;

    /* renamed from: mo.f$a */
    public static final class C34617a {

        /* renamed from: a */
        public static final List<Object> f93109a = null;

        static {
            f93109a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f93108d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93108d;
                if (obj == obj2) {
                    obj = new C34615e();
                    this.f93108d = obj;
                }
            }
        }
        return (C34615e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34617a.f93109a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, DestroyPreloadedWebViewEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34615e.class.getName();
    }
}
