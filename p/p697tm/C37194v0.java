package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.v0 */
public enum C37194v0 implements C38174i<C90527u0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98467d;

    /* renamed from: tm.v0$a */
    public static final class C37195a {

        /* renamed from: a */
        public static final List<Object> f98468a = null;

        static {
            f98468a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98467d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98467d;
                if (obj == obj2) {
                    obj = new C90527u0();
                    this.f98467d = obj;
                }
            }
        }
        return (C90527u0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37195a.f98468a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, AppBrandVoipCheckIsDeviceUsingEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C90527u0.class.getName();
    }
}
