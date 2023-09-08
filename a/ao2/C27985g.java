package ao2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ao2.g */
public enum C27985g implements C38174i<C92047f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77247d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
        Object obj = this.f77247d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f77247d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
                        C92047f fVar = new C92047f();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
                        this.f77247d = fVar;
                        obj = fVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
                    throw th;
                }
            }
        }
        C92047f fVar2 = (C92047f) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
        return fVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
            return cls;
        } else if ("dependencies".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
            return list;
        } else if ("onProcess".equals(str)) {
            List list2 = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
            return list2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
        String str = "provider " + C92047f.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.SnsAdServiceProvider");
        return str;
    }
}
