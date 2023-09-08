package up2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import tp2.C101913c;
import tp2.C101914d;

/* renamed from: up2.a */
public abstract class C102060a implements C101913c {

    /* renamed from: a */
    public AdClickActionInfo f300548a;

    /* renamed from: b */
    public boolean mo126055b(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AbsAdActionButtonClick");
        if (snsInfo == null || snsInfo.getAdXml() == null) {
            Log.m105928w("SnsAd.AdActionButtonClick", "the sns info or adxml is null!!!");
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AbsAdActionButtonClick");
            return false;
        }
        AdClickActionInfo adClickActionInfo = this.f300548a;
        if (adClickActionInfo != null) {
            try {
                boolean c = mo73731c(view, i, snsInfo, adClickActionInfo, dVar);
                SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AbsAdActionButtonClick");
                return c;
            } catch (Throwable unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AbsAdActionButtonClick");
        return false;
    }

    /* renamed from: c */
    public abstract boolean mo73731c(View view, int i, SnsInfo snsInfo, AdClickActionInfo adClickActionInfo, C101914d dVar);
}
