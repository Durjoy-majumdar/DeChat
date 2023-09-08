package p264ww;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetNewContactEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ww.f */
public enum C38301f implements C38174i<C78731e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101113d;

    /* renamed from: ww.f$a */
    public static final class C38302a {

        /* renamed from: a */
        public static final List<Object> f101114a = null;

        static {
            f101114a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101113d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101113d;
                if (obj == obj2) {
                    obj = new C78731e();
                    this.f101113d = obj;
                }
            }
        }
        return (C78731e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38302a.f101114a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetNewContactEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78731e.class.getName();
    }
}
