package vt2;

import ac2.C39534d;
import ac2.C91988j;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: vt2.h */
public final class C102290h<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C102279c f301268d;

    public C102290h(C102279c cVar) {
        this.f301268d = cVar;
    }

    public void onChanged(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$setupLiveList$1");
        C91988j jVar = (C91988j) obj;
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$setupLiveList$1");
        int ordinal = jVar.f263327a.ordinal();
        if (ordinal == 0 || ordinal == 2) {
            C39534d<T> dVar = jVar.f263328b;
            if (dVar == null) {
                SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$setupLiveList$1");
                SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$setupLiveList$1");
            }
            C102279c cVar = this.f301268d;
            boolean z = dVar.f106150a;
            SnsMethodCalculate.markStartTimeMs("access$setHasMoreData$p", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            cVar.f301248g = z;
            SnsMethodCalculate.markEndTimeMs("access$setHasMoreData$p", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            StringBuilder sb = new StringBuilder();
            sb.append("callback hasMoreData:");
            C102279c cVar2 = this.f301268d;
            SnsMethodCalculate.markStartTimeMs("access$getHasMoreData$p", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            boolean z2 = cVar2.f301248g;
            SnsMethodCalculate.markEndTimeMs("access$getHasMoreData$p", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            sb.append(z2);
            sb.append(" seq:");
            sb.append((String) dVar.f106152c);
            Log.m105924i("MicroMsg.Improve.DataFlow", sb.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$setupLiveList$1");
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$setupLiveList$1");
    }
}
