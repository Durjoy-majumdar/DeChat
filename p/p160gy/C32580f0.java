package p160gy;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: gy.f0 */
public enum C32580f0 implements C38174i<C32578e0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86490d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        Object obj = this.f86490d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f86490d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
                        C32578e0 e0Var = new C32578e0();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
                        this.f86490d = e0Var;
                        obj = e0Var;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
                    throw th;
                }
            }
        }
        C32578e0 e0Var2 = (C32578e0) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        return e0Var2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
            return cls;
        } else if ("dependencies".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
            return list;
        } else if ("onProcess".equals(str)) {
            List list2 = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
            return list2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        String str = "provider " + C32578e0.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        return str;
    }
}
