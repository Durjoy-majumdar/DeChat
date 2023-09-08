package p670qx;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ReportCCDataByPayEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qx.a0 */
public enum C36135a0 implements C38174i<C36177z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96296d;

    /* renamed from: qx.a0$a */
    public static final class C36136a {

        /* renamed from: a */
        public static final List<Object> f96297a = null;

        static {
            f96297a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96296d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96296d;
                if (obj == obj2) {
                    obj = new C36177z();
                    this.f96296d = obj;
                }
            }
        }
        return (C36177z) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36136a.f96297a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ReportCCDataByPayEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36177z.class.getName();
    }
}
