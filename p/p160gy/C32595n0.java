package p160gy;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: gy.n0 */
public enum C32595n0 implements C38174i<C32593m0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86526d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
        Object obj = this.f86526d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f86526d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
                        C32593m0 m0Var = new C32593m0();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
                        this.f86526d = m0Var;
                        obj = m0Var;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
                    throw th;
                }
            }
        }
        C32593m0 m0Var2 = (C32593m0) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
        return m0Var2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
            return cls;
        } else if ("dependencies".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
            return list;
        } else if ("onProcess".equals(str)) {
            List list2 = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
            return list2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
        String str = "provider " + C32593m0.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureServiceProvider");
        return str;
    }
}
