package pu2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gu2.C98214b;
import gy3.C87412m;
import iu2.C98799a;
import rx3.C36570n;
import vr2.C102236a0;
import z04.C91602g0;

/* renamed from: pu2.u0 */
public final class C100960u0 {

    /* renamed from: a */
    public static final C100960u0 f295631a = new C100960u0();

    /* renamed from: a */
    public final String mo140476a(C96275w6 w6Var) {
        SnsMethodCalculate.markStartTimeMs("debugInfo", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
        C87412m.m108594g(w6Var, "struct");
        String c = mo140478c(w6Var.f281399z);
        String c2 = mo140478c(w6Var.f281384k);
        String str = C102236a0.m134765q0(w6Var.f281367a.field_snsId) + '-' + c + '-' + c2;
        SnsMethodCalculate.markEndTimeMs("debugInfo", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
        return str;
    }

    /* renamed from: b */
    public final String mo140477b(C98799a aVar) {
        SnsMethodCalculate.markStartTimeMs("debugInfo", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("debugInfo", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
            return "null";
        }
        String c = mo140478c(aVar.mo138170b().mo137524x2());
        C98214b b = aVar.mo138170b();
        b.getClass();
        SnsMethodCalculate.markStartTimeMs("getMainContent", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        SnsMethodCalculate.markEndTimeMs("getMainContent", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        String c2 = mo140478c((String) ((C36570n) b.f287960Q0).getValue());
        String str = C102236a0.m134765q0(aVar.mo138170b().mo142401p2()) + '-' + c + '-' + c2;
        SnsMethodCalculate.markEndTimeMs("debugInfo", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
        return str;
    }

    /* renamed from: c */
    public final String mo140478c(String str) {
        SnsMethodCalculate.markStartTimeMs("encryptContent", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
        if (str == null || TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("encryptContent", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
            return "";
        } else if (str.length() <= 2) {
            SnsMethodCalculate.markEndTimeMs("encryptContent", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
            return str;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(C91602g0.m114943k0(str));
            sb.append('*');
            sb.append(str.length());
            sb.append('*');
            sb.append(C91602g0.m114945m0(str));
            String sb4 = sb.toString();
            SnsMethodCalculate.markEndTimeMs("encryptContent", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
            return sb4;
        }
    }
}
