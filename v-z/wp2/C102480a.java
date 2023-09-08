package wp2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import tp2.C101912b;
import tp2.C101913c;
import tp2.C101914d;
import xp2.C102705a;
import xp2.C102706b;
import xp2.C102707c;
import xp2.C102708d;
import xp2.C102709e;

/* renamed from: wp2.a */
public class C102480a extends C101912b<C102481b> {
    public C102480a(Context context) {
        super(context);
    }

    /* renamed from: c */
    public void mo141402c(C101913c cVar, View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        C102481b bVar = (C102481b) cVar;
        SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        if (bVar != null) {
            bVar.mo142089a(view, i, snsInfo, dVar);
        }
        SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
    }

    /* renamed from: d */
    public C101913c mo126056d(SnsInfo snsInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        SnsMethodCalculate.markStartTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        C101913c cVar = null;
        if (snsInfo == null || snsInfo.getAdXml() == null) {
            Log.m105928w("SnsAd.AdAvatarClicker", "the sns info or adxml is null!!!");
            SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        } else {
            int i = snsInfo.getAdXml().headClickType;
            if (i == 2) {
                cVar = new C102705a();
                SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else if (i == 3) {
                cVar = new C102709e();
                SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else if (i == 4) {
                cVar = new C102706b();
                SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else if (i == 5) {
                cVar = new C102707c();
                SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else if (i == 6) {
                cVar = new C102708d();
                SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else {
                SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            }
        }
        SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        return cVar;
    }
}
