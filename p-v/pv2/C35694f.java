package pv2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetIsEnrolledEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pv2.f */
public enum C35694f implements C38174i<C22022e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95382d;

    /* renamed from: pv2.f$a */
    public static final class C35695a {

        /* renamed from: a */
        public static final List<Object> f95383a = null;

        static {
            f95383a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95382d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95382d;
                if (obj == obj2) {
                    obj = new C22022e();
                    this.f95382d = obj;
                }
            }
        }
        return (C22022e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35695a.f95383a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetIsEnrolledEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C22022e.class.getName();
    }
}
