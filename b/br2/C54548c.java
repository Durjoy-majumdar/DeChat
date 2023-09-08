package br2;

import com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import ls3.C61398h;
import te3.C48742ao0;

/* renamed from: br2.c */
public final class C54548c implements C61398h.C61400b {

    /* renamed from: a */
    public final WeakReference<AdLivingStreamContainer> f152915a;

    public C54548c(WeakReference<AdLivingStreamContainer> weakReference) {
        C87412m.m108594g(weakReference, "containerRef");
        this.f152915a = weakReference;
    }

    /* renamed from: a */
    public void mo75426a(int i, int i2, String str, C48742ao0 ao02, int i3, String str2) {
        SnsMethodCalculate.markStartTimeMs("onCgiBack", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderGetMsgCallback");
        C87412m.m108594g(ao02, "resp");
        try {
            AdLivingStreamContainer adLivingStreamContainer = this.f152915a.get();
            if (adLivingStreamContainer == null) {
                SnsMethodCalculate.markEndTimeMs("onCgiBack", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderGetMsgCallback");
                return;
            }
            String a = AdLivingStreamContainer.m66069a(adLivingStreamContainer);
            Log.m105924i(a, "do getLiveMsg callback, result errType is " + i + ", errCode is " + i2 + ", errMsg is " + str + ", reqVisitorRoleType is " + i3 + ", uniqueId is " + str2);
            SnsMethodCalculate.markEndTimeMs("onCgiBack", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderGetMsgCallback");
        } catch (Throwable unused) {
        }
    }
}
