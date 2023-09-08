package xp2;

import android.view.View;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import rq2.C101431r;
import tp2.C101914d;
import vr2.C102236a0;
import wp2.C102481b;

/* renamed from: xp2.e */
public class C102709e implements C102481b {
    /* renamed from: a */
    public void mo142089a(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsAdClick snsAdClick;
        SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
        if (!(dVar == null || (snsAdClick = (SnsAdClick) dVar.mo141403a("ext_sns_ad_click", null)) == null)) {
            C101431r.m133118a(snsAdClick, 31);
            C102236a0.m134773u0(snsAdClick);
        }
        SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
    }

    /* renamed from: b */
    public boolean mo126055b(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
        if (view == null || snsInfo == null || snsInfo.getAdXml() == null) {
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
            return false;
        }
        ADXml.C95029q qVar = snsInfo.getAdXml().weAppInfo;
        if (qVar == null) {
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
            return false;
        }
        boolean o = TimelineClickListener.m122991o(qVar.f275751a, qVar.f275752b, qVar.f275753c, snsInfo, i);
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
        return o;
    }
}
