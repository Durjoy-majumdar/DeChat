package com.tencent.p014mm.accessibility.core;

import gy3.C87412m;
import kotlin.Metadata;
import qe3.C118191s;
import qe3.C118193t;
import qe3.C118195u0;
import su0.C118308d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J8\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\rH\u0016¨\u0006\u0013"}, mo182094d2 = {"com/tencent/mm/accessibility/core/AccReporter$initListener$1", "Lsu0/d;", "Lqe3/s;", "req", "Lqe3/t;", "resp", "", "autoAuth", "Lrx3/b0;", "onAuthResponse", "Lqe3/u0;", "", "alias", "", "bindUin", "nick", "mobile", "pluginFlag", "onRegResponse", "feature-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.AccReporter$initListener$1 */
public final class AccReporter$initListener$1 implements C118308d {
    public void onAuthResponse(C118191s sVar, C118193t tVar, boolean z) {
        C87412m.m108594g(sVar, "req");
        C87412m.m108594g(tVar, "resp");
        AccReporter.INSTANCE.reportAppTypeIfNeed();
    }

    public void onRegResponse(C118195u0 u0Var, String str, int i, String str2, String str3, int i2) {
        C87412m.m108594g(u0Var, "resp");
        C87412m.m108594g(str, "alias");
        C87412m.m108594g(str2, "nick");
        C87412m.m108594g(str3, "mobile");
    }
}
