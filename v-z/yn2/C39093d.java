package yn2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: yn2.d */
public enum C39093d implements C38174i<C39091c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105231d;

    /* renamed from: yn2.d$a */
    public static final class C39094a {

        /* renamed from: a */
        public static final List<Object> f105232a = null;

        static {
            f105232a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
        Object obj = this.f105231d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f105231d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
                        C39091c cVar = new C39091c();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
                        this.f105231d = cVar;
                        obj = cVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
                    throw th;
                }
            }
        }
        C39091c cVar2 = (C39091c) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
        return cVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
            return cls;
        } else if ("onProcess".equals(str)) {
            List<Object> list = C39094a.f105232a;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
            return list;
        } else if ("dependencies".equals(str)) {
            List list2 = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
            return list2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
        String str = "provider " + C39091c.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.AdDataReportServiceProvider");
        return str;
    }
}
