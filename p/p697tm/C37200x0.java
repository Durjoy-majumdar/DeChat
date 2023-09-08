package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CollectAppBrandDesktopShortcutInfoEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.x0 */
public enum C37200x0 implements C38174i<C90528w0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98481d;

    /* renamed from: tm.x0$a */
    public static final class C37201a {

        /* renamed from: a */
        public static final List<Object> f98482a = null;

        static {
            f98482a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98481d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98481d;
                if (obj == obj2) {
                    obj = new C90528w0();
                    this.f98481d = obj;
                }
            }
        }
        return (C90528w0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37201a.f98482a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CollectAppBrandDesktopShortcutInfoEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C90528w0.class.getName();
    }
}
