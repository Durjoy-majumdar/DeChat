package xp2;

import android.view.View;
import co2.C55052b;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import io2.C60570c;
import rq2.C101431r;
import tp2.C101914d;
import vr2.C102236a0;
import wp2.C102481b;

/* renamed from: xp2.c */
public class C102707c implements C102481b {
    /* renamed from: a */
    public void mo142089a(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsAdClick snsAdClick;
        SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderTopicAvatarAction");
        if (!(dVar == null || (snsAdClick = (SnsAdClick) dVar.mo141403a("ext_sns_ad_click", null)) == null)) {
            C101431r.m133118a(snsAdClick, 46);
            C102236a0.m134773u0(snsAdClick);
        }
        SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderTopicAvatarAction");
    }

    /* renamed from: b */
    public boolean mo126055b(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderTopicAvatarAction");
        if (view == null || snsInfo == null || snsInfo.getAdXml() == null) {
            Log.m105928w("SnsAd.FinderTopicAvatarAction", "the input param is invalid!!!!");
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderTopicAvatarAction");
            return false;
        }
        C55052b bVar = snsInfo.getAdXml().adAvatarFinderTopicInfo;
        if (bVar == null) {
            Log.m105928w("SnsAd.FinderTopicAvatarAction", "the avatarFinderTopicInfo is null return false!!!!");
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderTopicAvatarAction");
            return false;
        }
        boolean a = C60570c.m70755a(view.getContext(), bVar.f154579a, bVar.f154580b, snsInfo, 6);
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderTopicAvatarAction");
        return a;
    }
}
