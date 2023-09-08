package p160gy;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: gy.f1 */
public enum C32581f1 implements C38174i<C98282e1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86493d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
        Object obj = this.f86493d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f86493d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
                        C98282e1 e1Var = new C98282e1();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
                        this.f86493d = e1Var;
                        obj = e1Var;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
                    throw th;
                }
            }
        }
        C98282e1 e1Var2 = (C98282e1) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
        return e1Var2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
            return cls;
        } else if ("dependencies".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
            return list;
        } else if ("onProcess".equals(str)) {
            List list2 = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
            return list2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
        String str = "provider " + C98282e1.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.SnsUtilServiceProvider");
        return str;
    }
}
