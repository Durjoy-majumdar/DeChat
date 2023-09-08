package jq2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import br2.C54550e;
import co2.C92445n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94762a;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94764b;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.LivingDescBarLayout;
import com.tencent.p014mm.plugin.sns.p106ui.C96177r2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import cq2.C97354d;
import gy3.C87412m;
import rq2.C101432s;

/* renamed from: jq2.r */
public final class C99000r {

    /* renamed from: a */
    public ViewGroup f290263a;

    /* renamed from: b */
    public C94764b f290264b;

    /* renamed from: a */
    public final void mo138356a(Context context, SnsInfo snsInfo, View view, int i) {
        ViewStub viewStub;
        SnsMethodCalculate.markStartTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
        } else if (view == null) {
            SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
        } else if (context == null) {
            SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
        } else {
            if (mo138357b(snsInfo)) {
                TimeLineObject timeLine = snsInfo.getTimeLine();
                C87412m.m108593f(timeLine, "snsInfo.timeLine");
                if (this.f290263a == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.f5555i9)) != null) {
                    View g = C101432s.m133125g(viewStub);
                    this.f290263a = g instanceof ViewGroup ? (ViewGroup) g : null;
                }
                ViewGroup viewGroup = this.f290263a;
                if (viewGroup == null) {
                    Log.m105920e("SnsAdLivingStatusHelper", "livingStatusLayout is null, maybe inflateViewStub error");
                    SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
                    return;
                }
                if (this.f290264b == null) {
                    this.f290264b = new C94764b(viewGroup, (LivingDescBarLayout) null, (C96177r2) null);
                }
                if (this.f290264b != null) {
                    C92445n nVar = snsInfo.getAdXml().adLiveInfo;
                    int c = C94762a.m120036c(timeLine.f283893Id, nVar.f264555a);
                    C94764b bVar = this.f290264b;
                    if (bVar != null) {
                        bVar.mo130559g(timeLine.f283893Id, nVar);
                    }
                    C94764b bVar2 = this.f290264b;
                    if (bVar2 != null) {
                        bVar2.mo130560h(c);
                    }
                    Log.m105924i("SnsAdLivingStatusHelper", "snsId is " + timeLine.f283893Id + ", current living status is " + c + ", liveInfo finderUsername is " + nVar.f264557c + ", liveInfo id is " + nVar.f264558d);
                    C94762a.m120034a(timeLine.f283893Id, this.f290264b);
                    if (!C54550e.f152917e.mo75435a(snsInfo)) {
                        C97354d.m125367c(context).mo136623b(i, snsInfo);
                    }
                }
            } else {
                ViewGroup viewGroup2 = this.f290263a;
                if (viewGroup2 != null) {
                    C101432s.m133132n(viewGroup2, false);
                }
            }
            SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r3.getAdXml();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo138357b(com.tencent.p014mm.plugin.sns.storage.SnsInfo r3) {
        /*
            r2 = this;
            java.lang.String r0 = "shouldShowLivingView"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r3 == 0) goto L_0x0013
            com.tencent.mm.plugin.sns.storage.ADXml r3 = r3.getAdXml()
            if (r3 == 0) goto L_0x0013
            co2.n r3 = r3.adLiveInfo
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            if (r3 != 0) goto L_0x001b
            r3 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x001b:
            r3 = 1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jq2.C99000r.mo138357b(com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }
}
