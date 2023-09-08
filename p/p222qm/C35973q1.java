package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ShowPhoneMenuEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.q1 */
public enum C35973q1 implements C38174i<C12878p1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95935d;

    /* renamed from: qm.q1$a */
    public static final class C35974a {

        /* renamed from: a */
        public static final List<Object> f95936a = null;

        static {
            f95936a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95935d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95935d;
                if (obj == obj2) {
                    obj = new C12878p1();
                    this.f95935d = obj;
                }
            }
        }
        return (C12878p1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35974a.f95936a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ShowPhoneMenuEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C12878p1.class.getName();
    }
}
