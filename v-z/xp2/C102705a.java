package xp2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import j20.C117292a;
import k20.C9556a;
import p749xh.C102646h;
import ps2.C100894u;
import rq2.C101431r;
import tp2.C101914d;
import vr2.C102236a0;
import wp2.C102481b;

/* renamed from: xp2.a */
public class C102705a implements C102481b {
    /* renamed from: a */
    public void mo142089a(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsAdClick snsAdClick;
        SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        if (!(dVar == null || (snsAdClick = (SnsAdClick) dVar.mo141403a("ext_sns_ad_click", null)) == null)) {
            C101431r.m133118a(snsAdClick, 21);
            C102236a0.m134773u0(snsAdClick);
        }
        SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
    }

    /* renamed from: b */
    public boolean mo126055b(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        boolean z;
        int i2;
        Intent intent;
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        boolean z2 = false;
        if (view == null || snsInfo == null || snsInfo.getAdXml() == null) {
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            return false;
        }
        ADXml adXml = snsInfo.getAdXml();
        String str = adXml.xml;
        SnsMethodCalculate.markStartTimeMs("hasAvatarCanvasNode", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        try {
            z = C100894u.m132240t(str, "headCanvasInfo");
            SnsMethodCalculate.markEndTimeMs("hasAvatarCanvasNode", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("hasAvatarCanvasNode", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            z = false;
        }
        if (!z) {
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            return false;
        }
        String str2 = "";
        String replaceAll = adXml.xml.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", str2).replaceAll("headCanvasInfo", "adCanvasInfo");
        SnsMethodCalculate.markStartTimeMs("getFromScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        if (i == 0) {
            i2 = 22;
            SnsMethodCalculate.markEndTimeMs("getFromScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        } else {
            i2 = 23;
            SnsMethodCalculate.markEndTimeMs("getFromScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        }
        SnsMethodCalculate.markStartTimeMs("toIntent", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
        if (view.getContext() == null || TextUtils.isEmpty(replaceAll)) {
            intent = null;
            SnsMethodCalculate.markEndTimeMs("toIntent", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
        } else {
            intent = new Intent();
            intent.putExtra("sns_landing_pages_share_sns_id", snsInfo.getSnsId());
            SnsMethodCalculate.markStartTimeMs("getSnsRawId", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
            if (snsInfo.getTimeLine() != null) {
                str2 = snsInfo.getTimeLine().f283893Id;
                SnsMethodCalculate.markEndTimeMs("getSnsRawId", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
            } else {
                SnsMethodCalculate.markEndTimeMs("getSnsRawId", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
            }
            intent.putExtra("sns_landing_pages_rawSnsId", str2);
            intent.putExtra("sns_landing_pages_ux_info", snsInfo.getUxinfo());
            intent.putExtra("sns_landing_pages_xml", replaceAll);
            intent.setClass(view.getContext(), SnsAdNativeLandingPagesUI.class);
            intent.putExtra("sns_landig_pages_from_source", i2);
            intent.putExtra("sns_landing_pages_xml_prefix", C102646h.COL_ADXML);
            intent.putExtra("sns_landing_is_native_sight_ad", true);
            intent.putExtra("sns_landing_page_start_time", System.currentTimeMillis());
            SnsMethodCalculate.markEndTimeMs("toIntent", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
        }
        Context context = view.getContext();
        SnsMethodCalculate.markStartTimeMs("startActivity", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        if (intent == null || context == null) {
            SnsMethodCalculate.markEndTimeMs("startActivity", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        } else {
            try {
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/clicker/avatar/impl/AdCanvasAvatarAction", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(activity, "com/tencent/mm/plugin/sns/ad/timeline/clicker/avatar/impl/AdCanvasAvatarAction", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    ((Activity) context).overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2333y);
                } else {
                    intent.addFlags(268435456);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/clicker/avatar/impl/AdCanvasAvatarAction", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/sns/ad/timeline/clicker/avatar/impl/AdCanvasAvatarAction", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                SnsMethodCalculate.markEndTimeMs("startActivity", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
                z2 = true;
            } catch (Throwable unused2) {
                SnsMethodCalculate.markEndTimeMs("startActivity", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            }
        }
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        return z2;
    }
}
