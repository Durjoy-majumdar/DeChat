package jq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import jq2.C98995n;
import vr2.C102235a;

/* renamed from: jq2.o */
public class C98998o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C102235a f290258d;

    /* renamed from: e */
    public final /* synthetic */ C98995n.C98997b f290259e;

    public C98998o(C98995n.C98997b bVar, C102235a aVar) {
        this.f290259e = bVar;
        this.f290258d = aVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$1");
        try {
            if (this.f290258d.f301035g != null) {
                C98995n.C98997b.m128909a(this.f290259e).adExtTailWording = this.f290258d.f301035g;
            }
            C98995n.C98997b.m128909a(this.f290259e).adExtTailWordingExchangeValue = this.f290258d.f301036h;
            Log.m105924i("DynamicDataReqHelper", "adExtTailWordingExchangeValue: " + C98995n.C98997b.m128909a(this.f290259e).adExtTailWordingExchangeValue + ", adExtTailWording: " + C98995n.C98997b.m128909a(this.f290259e).adExtTailWording + "，adInfo hashcode: " + C98995n.C98997b.m128909a(this.f290259e).hashCode());
            if (this.f290258d.f301031c != null) {
                C98995n.C98997b.m128909a(this.f290259e).adActionExtTailLink = this.f290258d.f301031c;
            }
            ADInfo a = C98995n.C98997b.m128909a(this.f290259e);
            C102235a aVar = this.f290258d;
            a.adActionExtTailType = aVar.f301029a;
            if (aVar.f301032d.size() > 0) {
                C98995n.C98997b.m128909a(this.f290259e).adActionExtUserList.clear();
                C98995n.C98997b.m128909a(this.f290259e).adActionExtUserList.addAll(this.f290258d.f301032d);
            }
            if (this.f290258d.f301030b != null) {
                C98995n.C98997b.m128909a(this.f290259e).adActionExtTailWording = this.f290258d.f301030b;
            }
            if (this.f290258d.f301033e != null) {
                C98995n.C98997b.m128909a(this.f290259e).adActionExtTailUserDisplayName = this.f290258d.f301033e;
            }
            if (this.f290258d.f301034f != null) {
                C98995n.C98997b.m128909a(this.f290259e).adActionExtTailFormattedWording = this.f290258d.f301034f;
            }
            Log.m105924i("DynamicDataReqHelper", "adActionExtTailWording: " + C98995n.C98997b.m128909a(this.f290259e).adActionExtTailWording + "，adInfo hashcode: " + C98995n.C98997b.m128909a(this.f290259e).hashCode());
        } catch (Throwable th) {
            Log.m105920e("DynamicDataReqHelper", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$1");
    }
}
