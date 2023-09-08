package com.tencent.p014mm.plugin.sns.p106ui.listener;

import ad0.C91998s;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ht1.C98522w3;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import p214om.C11502f;
import qe3.C89625d;
import te3.C101802kr2;
import te3.m74;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.l0 */
public class C96039l0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280447d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.listener.l0$a */
    public class C96040a implements C98522w3.C8812d {

        /* renamed from: a */
        public final /* synthetic */ C101802kr2 f280448a;

        /* renamed from: b */
        public final /* synthetic */ Intent f280449b;

        /* renamed from: c */
        public final /* synthetic */ TimeLineObject f280450c;

        public C96040a(C101802kr2 kr22, Intent intent, TimeLineObject timeLineObject) {
            this.f280448a = kr22;
            this.f280449b = intent;
            this.f280450c = timeLineObject;
        }

        /* renamed from: a */
        public void mo9639a(C98522w3.C8811b bVar) {
            SnsMethodCalculate.markStartTimeMs("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6$1");
            if (!(bVar == C98522w3.C8811b.FINDER_POI_REDIRECT_TYPE_DEFAULT ? !Util.isNullOrNil(this.f280448a.f298652i) : bVar != C98522w3.C8811b.FINDER_POI_REDIRECT_TYPE_MAP)) {
                this.f280449b.putExtra("map_view_type", 7);
                this.f280449b.putExtra("kwebmap_slat", (double) this.f280448a.f298648e);
                this.f280449b.putExtra("kwebmap_lng", (double) this.f280448a.f298647d);
                this.f280449b.putExtra("kPoiName", this.f280448a.f298650g);
                this.f280449b.putExtra("Kwebmap_locaion", this.f280448a.f298651h);
                C88144b.m109791i(TimelineClickListener.m122988j(C96039l0.this.f280447d), FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", this.f280449b, (Bundle) null);
            } else {
                TimelineClickListener timelineClickListener = C96039l0.this.f280447d;
                SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                int i = timelineClickListener.f280367W;
                SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                this.f280449b.putExtra("rawUrl", i == 0 ? String.format(C89625d.f257847m, new Object[]{this.f280448a.f298652i}) : String.format(C89625d.f257848n, new Object[]{this.f280448a.f298652i, this.f280450c.f283893Id}));
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(this.f280449b, TimelineClickListener.m122988j(C96039l0.this.f280447d));
            }
            SnsMethodCalculate.markEndTimeMs("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6$1");
        }
    }

    public C96039l0(TimelineClickListener timelineClickListener) {
        this.f280447d = timelineClickListener;
    }

    public void onClick(View view) {
        ADInfo l;
        Class cls = C98522w3.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
        if (!(view.getTag() instanceof String)) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        SnsInfo DN = C94866e1.Yx0().mo139798DN((String) view.getTag());
        if (DN == null) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        TimeLineObject timeLine = DN.getTimeLine();
        C101802kr2 kr22 = timeLine.Location;
        if (DN.isAd()) {
            Log.m105924i("MicroMsg.TimelineClickListener", "click the ad poi button");
            ADInfo l2 = TimelineClickListener.m122990l(this.f280447d, DN);
            if (l2 == null) {
                Log.m105920e("MicroMsg.TimelineClickListener", "the adInfo is null");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            SnsAdClick snsAdClick = new SnsAdClick(TimelineClickListener.m122989k(this.f280447d), TimelineClickListener.m122989k(this.f280447d) == 0 ? 1 : 2, DN.field_snsId, 19, 0);
            C102260r.m134864d(snsAdClick, this.f280447d.f280378h, DN, 19);
            C102236a0.m134773u0(snsAdClick);
            if (Util.isNullOrNil(l2.adActionPOILink)) {
                Log.m105920e("MicroMsg.TimelineClickListener", "the adActionPOILink is null");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (TimelineClickListener.m122989k(this.f280447d) == 0) {
                C91998s.m115550d(724);
            } else {
                C91998s.m115549c(724);
            }
            C102236a0.m134728W(DN);
            DN.isAd();
            DN.getUxinfo();
            Log.m105924i("MicroMsg.TimelineClickListener", "open webview url : " + l2.adActionPOILink);
            Intent intent = new Intent();
            if (DN.isAd() && (l = TimelineClickListener.m122990l(this.f280447d, DN)) != null) {
                intent.putExtra("KsnsViewId", l.viewId);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("KSnsAdTag", snsAdClick);
            intent.putExtra("jsapiargs", bundle);
            intent.putExtra("useJs", true);
            intent.putExtra("KPublisherId", "sns_" + C102236a0.m134765q0(DN.field_snsId));
            intent.putExtra("pre_username", DN.field_userName);
            intent.putExtra("prePublishId", "sns_" + C102236a0.m134765q0(DN.field_snsId));
            intent.putExtra("preUsername", DN.field_userName);
            intent.putExtra("rawUrl", C102236a0.m134734b(l2.adActionPOILink, l2.uxInfo));
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent, TimelineClickListener.m122988j(this.f280447d));
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (TimelineClickListener.m122989k(this.f280447d) == 0) {
            C91998s.m115550d(724);
        } else {
            C91998s.m115549c(724);
        }
        C102236a0.m134728W(DN);
        DN.isAd();
        DN.getUxinfo();
        String str = kr22.f298652i;
        Intent intent2 = new Intent();
        m74 m74 = new m74();
        m74.f184219d = kr22.f298647d;
        m74.f184220e = kr22.f298648e;
        m74.f184221f = kr22.f298649f;
        m74.f184222g = kr22.f298650g;
        m74.f184223h = kr22.f298651h;
        m74.f184224i = kr22.f298652i;
        m74.f184225j = kr22.f298653j;
        m74.f184226n = kr22.f298654n;
        m74.f184227o = kr22.f298655o;
        m74.f184228p = kr22.f298656p;
        m74.f184229q = kr22.f298657q;
        m74.f184234v = kr22.f298662v;
        C115669n.INSTANCE.mo175912v(((C98522w3) C86312j.m106911c(cls)).mo3991CD(), 0);
        ((C98522w3) C86312j.m106911c(cls)).mo3994aU(TimelineClickListener.m122988j(this.f280447d), m74, C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS, 7, timeLine.f283893Id, new C96040a(kr22, intent2, timeLine));
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
