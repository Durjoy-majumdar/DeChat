package p670qx;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ReportCCDataByFinderEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qx.y */
public enum C36175y implements C38174i<C36174x> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96366d;

    /* renamed from: qx.y$a */
    public static final class C36176a {

        /* renamed from: a */
        public static final List<Object> f96367a = null;

        static {
            f96367a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96366d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96366d;
                if (obj == obj2) {
                    obj = new C36174x();
                    this.f96366d = obj;
                }
            }
        }
        return (C36174x) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36176a.f96367a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ReportCCDataByFinderEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36174x.class.getName();
    }
}
