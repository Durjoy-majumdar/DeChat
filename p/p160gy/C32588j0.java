package p160gy;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: gy.j0 */
public enum C32588j0 implements C38174i<C98286i0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86508d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
        Object obj = this.f86508d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f86508d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
                        C98286i0 i0Var = new C98286i0();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
                        this.f86508d = i0Var;
                        obj = i0Var;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
                    throw th;
                }
            }
        }
        C98286i0 i0Var2 = (C98286i0) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
        return i0Var2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
            return cls;
        } else if ("dependencies".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
            return list;
        } else if ("onProcess".equals(str)) {
            List list2 = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
            return list2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
        String str = "provider " + C98286i0.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.GestureHelperServiceProvider");
        return str;
    }
}
