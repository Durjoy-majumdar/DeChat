package dx0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.brandservice.PluginBrandService;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dx0.g */
public enum C31336g implements C38174i<PluginBrandService> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83881d;

    /* renamed from: dx0.g$a */
    public static final class C31337a {

        /* renamed from: a */
        public static final List<Object> f83882a = null;

        static {
            f83882a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f83881d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83881d;
                if (obj == obj2) {
                    obj = new PluginBrandService();
                    this.f83881d = obj;
                }
            }
        }
        return (PluginBrandService) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31337a.f83882a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + PluginBrandService.class.getName();
    }
}
