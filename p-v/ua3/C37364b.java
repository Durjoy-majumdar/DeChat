package ua3;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.BannerOnInitEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ua3.b */
public enum C37364b implements C38174i<C78141a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98788d;

    /* renamed from: ua3.b$a */
    public static final class C37365a {

        /* renamed from: a */
        public static final List<Object> f98789a = null;

        static {
            f98789a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98788d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98788d;
                if (obj == obj2) {
                    obj = new C78141a();
                    this.f98788d = obj;
                }
            }
        }
        return (C78141a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37365a.f98789a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, BannerOnInitEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78141a.class.getName();
    }
}
