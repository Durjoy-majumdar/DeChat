package g00;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.JsapiResultEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: g00.v */
public enum C32283v implements C38174i<C75822u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85748d;

    /* renamed from: g00.v$a */
    public static final class C32284a {

        /* renamed from: a */
        public static final List<Object> f85749a = null;

        static {
            f85749a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85748d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85748d;
                if (obj == obj2) {
                    obj = new C75822u();
                    this.f85748d = obj;
                }
            }
        }
        return (C75822u) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32284a.f85749a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, JsapiResultEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C75822u.class.getName();
    }
}
