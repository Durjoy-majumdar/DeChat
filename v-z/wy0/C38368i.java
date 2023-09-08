package wy0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CleanWxFileIndexEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wy0.i */
public enum C38368i implements C38174i<C38367h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101241d;

    /* renamed from: wy0.i$a */
    public static final class C38369a {

        /* renamed from: a */
        public static final List<Object> f101242a = null;

        static {
            f101242a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101241d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101241d;
                if (obj == obj2) {
                    obj = new C38367h();
                    this.f101241d = obj;
                }
            }
        }
        return (C38367h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38369a.f101242a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CleanWxFileIndexEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38367h.class.getName();
    }
}
