package hd2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetDisasterInfoEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hd2.k */
public enum C32844k implements C38174i<C32843j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89323d;

    /* renamed from: hd2.k$a */
    public static final class C32845a {

        /* renamed from: a */
        public static final List<Object> f89324a = null;

        static {
            f89324a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89323d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89323d;
                if (obj == obj2) {
                    obj = new C32843j();
                    this.f89323d = obj;
                }
            }
        }
        return (C32843j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32845a.f89324a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetDisasterInfoEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32843j.class.getName();
    }
}
