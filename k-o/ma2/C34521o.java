package ma2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.VoipEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import ma2.C99808k;
import p261wl.C38174i;

/* renamed from: ma2.o */
public enum C34521o implements C38174i<C99808k.C34510d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92886d;

    /* renamed from: ma2.o$a */
    public static final class C34522a {

        /* renamed from: a */
        public static final List<Object> f92887a = null;

        static {
            f92887a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92886d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92886d;
                if (obj == obj2) {
                    obj = new C99808k.C34510d();
                    this.f92886d = obj;
                }
            }
        }
        return (C99808k.C34510d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34522a.f92887a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, VoipEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C99808k.C34510d.class.getName();
    }
}
