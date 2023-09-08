package mz1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;
import p635os.C89291d;

/* renamed from: mz1.e */
public enum C34699e implements C38174i<GameLiveAppbrandRenderMgrService> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93313d;

    /* renamed from: mz1.e$a */
    public static final class C34700a {

        /* renamed from: a */
        public static final List<Object> f93314a = null;

        static {
            f93314a = Arrays.asList(new Object[]{C89291d.class});
        }
    }

    /* renamed from: mz1.e$b */
    public static final class C34701b {

        /* renamed from: a */
        public static final List<Object> f93315a = null;

        static {
            f93315a = Arrays.asList(new Object[]{C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f93313d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93313d;
                if (obj == obj2) {
                    obj = new GameLiveAppbrandRenderMgrService();
                    this.f93313d = obj;
                }
            }
        }
        return (GameLiveAppbrandRenderMgrService) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34701b.f93315a;
        }
        if ("dependencies".equals(str)) {
            return C34700a.f93314a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + GameLiveAppbrandRenderMgrService.class.getName();
    }
}
