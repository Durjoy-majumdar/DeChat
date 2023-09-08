package wy0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WxFileIndexDirtyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wy0.b0 */
public enum C38362b0 implements C38174i<C38361a0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101234d;

    /* renamed from: wy0.b0$a */
    public static final class C38363a {

        /* renamed from: a */
        public static final List<Object> f101235a = null;

        static {
            f101235a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101234d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101234d;
                if (obj == obj2) {
                    obj = new C38361a0();
                    this.f101234d = obj;
                }
            }
        }
        return (C38361a0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38363a.f101235a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WxFileIndexDirtyEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38361a0.class.getName();
    }
}
