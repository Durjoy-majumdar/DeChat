package hn2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ConfigUpdatedEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hn2.g */
public enum C32970g implements C38174i<C8617f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89581d;

    /* renamed from: hn2.g$a */
    public static final class C32971a {

        /* renamed from: a */
        public static final List<Object> f89582a = null;

        static {
            f89582a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89581d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89581d;
                if (obj == obj2) {
                    obj = new C8617f();
                    this.f89581d = obj;
                }
            }
        }
        return (C8617f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32971a.f89582a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ConfigUpdatedEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C8617f.class.getName();
    }
}
