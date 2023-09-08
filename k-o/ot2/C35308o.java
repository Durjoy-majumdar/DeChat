package ot2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ot2.o */
public enum C35308o implements C38174i<C100454n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94586d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
        Object obj = this.f94586d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f94586d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
                        C100454n nVar = new C100454n();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
                        this.f94586d = nVar;
                        obj = nVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
                    throw th;
                }
            }
        }
        C100454n nVar2 = (C100454n) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
        return nVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
            return cls;
        } else if ("dependencies".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
            return list;
        } else if ("onProcess".equals(str)) {
            List list2 = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
            return list2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
        String str = "provider " + C100454n.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApiProvider");
        return str;
    }
}
