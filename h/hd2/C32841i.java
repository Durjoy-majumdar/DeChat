package hd2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.BroadcastEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hd2.i */
public enum C32841i implements C38174i<C32840h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89319d;

    /* renamed from: hd2.i$a */
    public static final class C32842a {

        /* renamed from: a */
        public static final List<Object> f89320a = null;

        static {
            f89320a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89319d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89319d;
                if (obj == obj2) {
                    obj = new C32840h();
                    this.f89319d = obj;
                }
            }
        }
        return (C32840h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32842a.f89320a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, BroadcastEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32840h.class.getName();
    }
}
