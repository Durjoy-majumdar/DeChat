package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.scanner.EventScanCodeSheetPreloadWxaAttrs;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.z0 */
public enum C37208z0 implements C38174i<C37205y0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98495d;

    /* renamed from: tm.z0$a */
    public static final class C37209a {

        /* renamed from: a */
        public static final List<Object> f98496a = null;

        static {
            f98496a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98495d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98495d;
                if (obj == obj2) {
                    obj = new C37205y0();
                    this.f98495d = obj;
                }
            }
        }
        return (C37205y0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37209a.f98496a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, EventScanCodeSheetPreloadWxaAttrs.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37205y0.class.getName();
    }
}
