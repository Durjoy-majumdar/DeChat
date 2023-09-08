package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.AddCardToWXEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.d */
public enum C35930d implements C38174i<C89705c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95840d;

    /* renamed from: qm.d$a */
    public static final class C35931a {

        /* renamed from: a */
        public static final List<Object> f95841a = null;

        static {
            f95841a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95840d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95840d;
                if (obj == obj2) {
                    obj = new C89705c();
                    this.f95840d = obj;
                }
            }
        }
        return (C89705c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35931a.f95841a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, AddCardToWXEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C89705c.class.getName();
    }
}
