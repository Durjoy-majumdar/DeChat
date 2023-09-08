package p340fm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SessionChangeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fm.d */
public enum C32082d implements C38174i<C32080c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85333d;

    /* renamed from: fm.d$a */
    public static final class C32083a {

        /* renamed from: a */
        public static final List<Object> f85334a = null;

        static {
            f85334a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85333d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85333d;
                if (obj == obj2) {
                    obj = new C32080c();
                    this.f85333d = obj;
                }
            }
        }
        return (C32080c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C32083a.f85334a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SessionChangeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32080c.class.getName();
    }
}
