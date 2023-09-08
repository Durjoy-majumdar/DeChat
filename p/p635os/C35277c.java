package p635os;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: os.c */
public enum C35277c implements C38174i<GameLiveCommonService> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94527d;

    /* renamed from: os.c$a */
    public static final class C35278a {

        /* renamed from: a */
        public static final List<Object> f94528a = null;

        static {
            f94528a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f94527d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94527d;
                if (obj == obj2) {
                    obj = new GameLiveCommonService();
                    this.f94527d = obj;
                }
            }
        }
        return (GameLiveCommonService) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35278a.f94528a;
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
        return "provider " + GameLiveCommonService.class.getName();
    }
}
