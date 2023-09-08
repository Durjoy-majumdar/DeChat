package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C102659o8;
import te3.C50660oc0;
import te3.C51865wq1;
import te3.a94;
import te3.z84;

/* renamed from: os2.c0 */
public class C100398c0 extends C102659o8 {

    /* renamed from: R0 */
    public static IAutoDBItem.MAutoDBInfo f294082R0 = C102659o8.initAutoDBInfo(C100398c0.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f294082R0;
        SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        return mAutoDBInfo;
    }

    /* renamed from: l2 */
    public C50660oc0 mo139769l2() {
        SnsMethodCalculate.markStartTimeMs("getFault", "com.tencent.mm.plugin.sns.storage.SnsExt");
        new C51865wq1();
        C50660oc0 oc02 = new C50660oc0();
        if (!Util.isNullOrNil(this.field_faultS)) {
            try {
                C51865wq1 wq12 = (C51865wq1) new C51865wq1().parseFrom(this.field_faultS);
                if (wq12.f144227d.size() > 0) {
                    oc02 = wq12.f144227d.getFirst();
                }
            } catch (Exception unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("getFault", "com.tencent.mm.plugin.sns.storage.SnsExt");
        return oc02;
    }

    /* renamed from: m2 */
    public a94 mo139770m2() {
        SnsMethodCalculate.markStartTimeMs("getSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
        try {
            a94 a94 = (a94) new a94().parseFrom(this.field_snsuser);
            SnsMethodCalculate.markEndTimeMs("getSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
            return a94;
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("getSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
            return null;
        }
    }

    /* renamed from: n2 */
    public z84 mo139771n2() {
        SnsMethodCalculate.markStartTimeMs("getSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        z84 z84 = new z84();
        if (!Util.isNullOrNil(this.field_snsYearMonthInfo)) {
            try {
                z84.parseFrom(this.field_snsYearMonthInfo);
            } catch (Exception unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("getSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        return z84;
    }

    /* renamed from: o2 */
    public void mo139772o2() {
        SnsMethodCalculate.markStartTimeMs("unLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsExt");
        this.field_local_flag &= -3;
        SnsMethodCalculate.markEndTimeMs("unLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsExt");
    }
}
