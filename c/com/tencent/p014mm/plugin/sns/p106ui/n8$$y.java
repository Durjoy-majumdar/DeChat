package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import c00.C0405n;
import c00.C0406o;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import jp2.C98977w;
import ke3.C88144b;
import p167hz.C46138l;
import p167hz.C8835h;
import te3.C101804kv2;
import te3.sc4;
import te3.w25;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$y */
public class n8$$y implements View.OnClickListener {
    public void onClick(View view) {
        String str;
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
        long currentTimeMillis = System.currentTimeMillis();
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        long j = C96085n8.f280579A;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        if (currentTimeMillis - j < 500) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        C96085n8.f280579A = currentTimeMillis;
        SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        Context context = view.getContext();
        if (view.getTag() instanceof C95787g0) {
            C95787g0 g0Var = (C95787g0) view.getTag();
            TimeLineObject timeLineObject = g0Var.f279450a;
            if (timeLineObject.ContentObj.f298424e == 18) {
                SnsMethodCalculate.markStartTimeMs("adUrlClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                C96085n8.m123092K(g0Var);
                TimeLineObject timeLineObject2 = g0Var.f279450a;
                String str2 = g0Var.f279451b;
                SnsMethodCalculate.markStartTimeMs("goVideoPlayerForAdurl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                C98977w.m128885a(C98977w.C98979b.AdUrl, C98977w.C98978a.EnterCompleteVideo, C94866e1.Yx0().mo139798DN(str2), C96085n8.f280581y);
                Intent intent = new Intent();
                C101804kv2 kv22 = timeLineObject2.ContentObj.f298427h.size() > 0 ? timeLineObject2.ContentObj.f298427h.get(0) : null;
                intent.putExtra("KFromTimeLine", false);
                intent.putExtra("KStremVideoUrl", timeLineObject2.ContentObj.f298426g);
                intent.putExtra("KSta_SourceType", 2);
                intent.putExtra("KSta_Scene", 2);
                intent.putExtra("KSta_FromUserName", timeLineObject2.UserName);
                intent.putExtra("KSta_SnSId", timeLineObject2.f283893Id);
                if (kv22 == null) {
                    StringBuilder sb = new StringBuilder();
                    str = "(Landroid/view/View;)V";
                    sb.append("fakeid_");
                    sb.append(kv22 == null ? timeLineObject2.f283893Id : kv22.f298689d);
                    intent.putExtra("KMediaId", sb.toString());
                } else {
                    str = "(Landroid/view/View;)V";
                    intent.putExtra("KMediaId", kv22.f298689d);
                }
                sc4 sc4 = timeLineObject2.streamvideo;
                if (sc4 != null) {
                    intent.putExtra("KMediaVideoTime", sc4.f299426e);
                    intent.putExtra("StreamWording", sc4.f299427f);
                    intent.putExtra("StremWebUrl", sc4.f299428g);
                    intent.putExtra("KMediaTitle", sc4.f299429h);
                    intent.putExtra("KStremVideoUrl", sc4.f299425d);
                    intent.putExtra("KThumUrl", sc4.f299430i);
                    intent.putExtra("KSta_StremVideoAduxInfo", sc4.f299431j);
                    intent.putExtra("KSta_StremVideoPublishId", sc4.f299432n);
                }
                intent.putExtra("KSta_SnsStatExtStr", timeLineObject2.statExtStr);
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
                    C88144b.m109791i(context, "sns", ".ui.SnsAdStreamVideoPlayUI", intent, (Bundle) null);
                    Log.m105924i("MicroMsg.TimeLineClickEvent", "use new stream video play UI");
                } else {
                    C88144b.m109791i(context, "sns", ".ui.VideoAdPlayerUI", intent, (Bundle) null);
                }
                SnsMethodCalculate.markEndTimeMs("goVideoPlayerForAdurl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                SnsMethodCalculate.markEndTimeMs("adUrlClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", str);
                return;
            }
            w25 w25 = timeLineObject.webSearchInfo;
            if (w25 == null || Util.isNullOrNil(w25.f259899d)) {
                int i = timeLineObject.ContentObj.f298424e;
                if (i == 28) {
                    C96085n8.m123110r(context, g0Var);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (i == 36) {
                    C96085n8.m123109q(context, g0Var);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (i == 34 || i == 45 || i == 43) {
                    C96085n8.m123108p(context, g0Var, view2);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (i == 29) {
                    C96085n8.m123111s(context, g0Var);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (i == 37) {
                    C96085n8.m123107o(context, g0Var);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (i == 38) {
                    C96085n8.m123106n(context, g0Var);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (i == 39) {
                    C96085n8.m123105m(context, g0Var);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (i == 44) {
                    C96085n8.m123085D(context, g0Var);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (i == 46) {
                    C96085n8.m123083B(context, g0Var);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else {
                    C96085n8.m123091J(context, g0Var, view2, C96085n8.f280582z, C96085n8.m123093a());
                }
            } else {
                SnsMethodCalculate.markStartTimeMs("webSearchClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                TimeLineObject timeLineObject3 = g0Var.f279450a;
                C96085n8.m123092K(g0Var);
                SnsMethodCalculate.markStartTimeMs("goToWebSearchVideoListUI", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                w25 w252 = timeLineObject3.webSearchInfo;
                if (w252 != null && !Util.isNullOrNil(w252.f259899d)) {
                    ((C0405n) C86312j.m106911c(C0405n.class)).mo276Th(context, ((C8835h) C86312j.m106911c(C8835h.class)).mo9679Qr(w252, 31, ((C0406o) C86312j.m106911c(C0406o.class)).mo448p4("discoverRecommendEntry").optString("wording")));
                    ((C46138l) C86312j.m106911c(C46138l.class)).Os0(w252, timeLineObject3);
                }
                SnsMethodCalculate.markEndTimeMs("goToWebSearchVideoListUI", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                SnsMethodCalculate.markEndTimeMs("webSearchClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
