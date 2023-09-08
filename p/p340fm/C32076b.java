package p340fm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.KvReportEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fm.b */
public enum C32076b implements C38174i<C32074a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85325d;

    /* renamed from: fm.b$a */
    public static final class C32077a {

        /* renamed from: a */
        public static final List<Object> f85326a = null;

        static {
            f85326a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85325d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85325d;
                if (obj == obj2) {
                    obj = new C32074a();
                    this.f85325d = obj;
                }
            }
        }
        return (C32074a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C32077a.f85326a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, KvReportEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32074a.class.getName();
    }
}
