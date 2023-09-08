package p160gy;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: gy.f */
public enum C32579f implements C38174i<C32577e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86487d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
        Object obj = this.f86487d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f86487d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
                        C32577e eVar = new C32577e();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
                        this.f86487d = eVar;
                        obj = eVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
                    throw th;
                }
            }
        }
        C32577e eVar2 = (C32577e) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
        return eVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
            return cls;
        } else if ("dependencies".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
            return list;
        } else if ("onProcess".equals(str)) {
            List list2 = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
            return list2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
        String str = "provider " + C32577e.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperServiceProvider");
        return str;
    }
}
