package i63;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ECardJsApiCheckEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: i63.d */
public enum C33220d implements C38174i<C8862c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90134d;

    /* renamed from: i63.d$a */
    public static final class C33221a {

        /* renamed from: a */
        public static final List<Object> f90135a = null;

        static {
            f90135a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90134d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90134d;
                if (obj == obj2) {
                    obj = new C8862c();
                    this.f90134d = obj;
                }
            }
        }
        return (C8862c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C33221a.f90135a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ECardJsApiCheckEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C8862c.class.getName();
    }
}
