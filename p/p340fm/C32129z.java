package p340fm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GpsInfoEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fm.z */
public enum C32129z implements C38174i<C116888y> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85426d;

    /* renamed from: fm.z$a */
    public static final class C32130a {

        /* renamed from: a */
        public static final List<Object> f85427a = null;

        static {
            f85427a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85426d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85426d;
                if (obj == obj2) {
                    obj = new C116888y();
                    this.f85426d = obj;
                }
            }
        }
        return (C116888y) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C32130a.f85427a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GpsInfoEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C116888y.class.getName();
    }
}
