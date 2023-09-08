package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.ipcinvoker.C80916r;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaPkgV8SnapshotInfo;", "kotlin.jvm.PlatformType", "snapshotInfo", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaPkgV8SnapshotInfo;)Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.d0 */
final class C84837d0<InputType, ResultType> implements C80916r {
    static {
        new C84837d0();
    }

    public Object invoke(Object obj) {
        WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = (WxaPkgV8SnapshotInfo) obj;
        C84871v vVar = (C84871v) C86312j.m106911c(C84871v.class);
        if (vVar == null) {
            return null;
        }
        C87412m.m108593f(wxaPkgV8SnapshotInfo, "snapshotInfo");
        vVar.lv0(wxaPkgV8SnapshotInfo);
        return C13598b0.f38549a;
    }
}
