package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.HandleScanResultEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.m0 */
public enum C35958m0 implements C38174i<C89712l0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95903d;

    /* renamed from: qm.m0$a */
    public static final class C35959a {

        /* renamed from: a */
        public static final List<Object> f95904a = null;

        static {
            f95904a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95903d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95903d;
                if (obj == obj2) {
                    obj = new C89712l0();
                    this.f95903d = obj;
                }
            }
        }
        return (C89712l0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35959a.f95904a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, HandleScanResultEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C89712l0.class.getName();
    }
}
