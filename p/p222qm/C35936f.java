package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ChooseCardFromWXEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.f */
public enum C35936f implements C38174i<C89707e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95854d;

    /* renamed from: qm.f$a */
    public static final class C35937a {

        /* renamed from: a */
        public static final List<Object> f95855a = null;

        static {
            f95855a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95854d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95854d;
                if (obj == obj2) {
                    obj = new C89707e();
                    this.f95854d = obj;
                }
            }
        }
        return (C89707e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35937a.f95855a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ChooseCardFromWXEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C89707e.class.getName();
    }
}
