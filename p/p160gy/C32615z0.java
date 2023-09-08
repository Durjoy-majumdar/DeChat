package p160gy;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: gy.z0 */
public enum C32615z0 implements C38174i<C59739y0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86580d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
        Object obj = this.f86580d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f86580d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
                        C59739y0 y0Var = new C59739y0();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
                        this.f86580d = y0Var;
                        obj = y0Var;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
                    throw th;
                }
            }
        }
        C59739y0 y0Var2 = (C59739y0) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
        return y0Var2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
            return cls;
        } else if ("dependencies".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
            return list;
        } else if ("onProcess".equals(str)) {
            List list2 = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
            return list2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
        String str = "provider " + C59739y0.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.SnsFinderServiceProvider");
        return str;
    }
}
