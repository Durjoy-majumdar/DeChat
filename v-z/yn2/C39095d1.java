package yn2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: yn2.d1 */
public enum C39095d1 implements C38174i<C102876c1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105235d;

    /* renamed from: yn2.d1$a */
    public static final class C39096a {

        /* renamed from: a */
        public static final List<Object> f105236a = null;

        static {
            f105236a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        Object obj = this.f105235d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f105235d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
                        C102876c1 c1Var = new C102876c1();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
                        this.f105235d = c1Var;
                        obj = c1Var;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
                    throw th;
                }
            }
        }
        C102876c1 c1Var2 = (C102876c1) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        return c1Var2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
            return cls;
        } else if ("onProcess".equals(str)) {
            List<Object> list = C39096a.f105236a;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
            return list;
        } else if ("dependencies".equals(str)) {
            List list2 = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
            return list2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        String str = "provider " + C102876c1.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        return str;
    }
}
