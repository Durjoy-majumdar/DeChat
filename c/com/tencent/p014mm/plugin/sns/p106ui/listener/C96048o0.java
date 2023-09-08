package com.tencent.p014mm.plugin.sns.p106ui.listener;

import ad0.C91998s;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import br2.C54550e;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.SnsAdLivingStreamJumpEvent;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.tools.MaskImageButton;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C96085n8;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import lo2.C99542h0;
import p214om.C11502f;
import p773yy.C79168k;
import rq2.C101431r;
import tp2.C101911a;
import tp2.C101913c;
import tp2.C101914d;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.o0 */
public class C96048o0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280459d;

    public C96048o0(TimelineClickListener timelineClickListener) {
        this.f280459d = timelineClickListener;
    }

    public void onClick(View view) {
        Intent intent;
        boolean z;
        String str;
        int i;
        String str2;
        Object obj;
        int i2;
        int i3;
        View view2 = view;
        Class cls = C11502f.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$9");
        String str3 = (String) view.getTag();
        Log.m105918d("MicroMsg.TimelineClickListener", "onCommentClick:" + str3);
        Intent intent2 = new Intent();
        SnsInfo snsInfo = null;
        int i4 = 1;
        if (!(view2 instanceof MaskImageButton) || (obj = ((MaskImageButton) view2).f285320i) == null || (snsInfo = C94866e1.Yx0().mo139798DN((String) obj)) == null || !snsInfo.isAd()) {
            str = str3;
            intent = intent2;
            z = false;
        } else {
            try {
                TimeLineObject timeLine = snsInfo.getTimeLine();
                if (C54550e.m61296a(snsInfo) && ((i3 = timeLine.ContentObj.f298424e) == 15 || i3 == 5)) {
                    SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new SnsAdLivingStreamJumpEvent();
                    snsAdLivingStreamJumpEvent.f154872d.f154873a = C102236a0.m134728W(snsInfo);
                    snsAdLivingStreamJumpEvent.publish();
                }
            } catch (Throwable unused) {
            }
            ADXml adXml = snsInfo.getAdXml();
            int k = TimelineClickListener.m122989k(this.f280459d);
            if (TimelineClickListener.m122989k(this.f280459d) == 0) {
                str = str3;
                intent = intent2;
                i2 = 1;
            } else {
                str = str3;
                intent = intent2;
                i2 = 2;
            }
            SnsAdClick snsAdClick = new SnsAdClick(k, i2, snsInfo.field_snsId, 1, 0);
            C102260r.m134864d(snsAdClick, this.f280459d.f280378h, snsInfo, 1);
            if (adXml != null) {
                if (adXml.headClickType != 1 || Util.isNullOrNil(adXml.headClickParam)) {
                    if (adXml.headClickType == 0) {
                        if (C99542h0.m129904b(TimelineClickListener.m122988j(this.f280459d), adXml, TimelineClickListener.m122990l(this.f280459d, snsInfo), snsInfo.field_snsId, 1)) {
                            C101431r.m133118a(snsAdClick, 41);
                            C102236a0.m134773u0(snsAdClick);
                            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$9");
                            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                    }
                    C101914d dVar = new C101914d();
                    dVar.mo141404b("ext_sns_ad_click", snsAdClick);
                    C101913c b = C101911a.m134113b(TimelineClickListener.m122988j(this.f280459d));
                    if (b != null && b.mo126055b(view2, TimelineClickListener.m122989k(this.f280459d), snsInfo, dVar)) {
                        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$9");
                        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                } else {
                    String str4 = adXml.headClickParam;
                    ADInfo l = TimelineClickListener.m122990l(this.f280459d, snsInfo);
                    if (l != null) {
                        str4 = C102236a0.m134734b(str4, l.uxInfo);
                    }
                    Log.m105924i("MicroMsg.TimelineClickListener", "headClickParam url " + str4 + " " + adXml.headClickRightBarShow);
                    Intent intent3 = new Intent();
                    boolean z2 = adXml.headClickRightBarShow == 0;
                    intent3.putExtra("KsnsViewId", TimelineClickListener.m122990l(this.f280459d, snsInfo).viewId);
                    intent3.putExtra("KRightBtn", z2);
                    intent3.putExtra("jsapiargs", new Bundle());
                    intent3.putExtra("rawUrl", str4);
                    intent3.putExtra("useJs", true);
                    this.f280459d.mo133544m(intent3);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93190w(intent3, TimelineClickListener.m122988j(this.f280459d));
                    C102236a0.m134773u0(snsAdClick);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$9");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            z = true;
        }
        if (str.endsWith("@ad")) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$9");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (snsInfo != null) {
            int i5 = 722;
            if (TimelineClickListener.m122989k(this.f280459d) == 0) {
                if (!snsInfo.isAd()) {
                    i5 = 721;
                }
                C91998s.m115550d(i5);
            } else {
                if (!snsInfo.isAd()) {
                    i5 = 721;
                }
                C91998s.m115549c(i5);
            }
            C102236a0.m134728W(snsInfo);
            snsInfo.isAd();
            snsInfo.getUxinfo();
        }
        if (z) {
            int k2 = TimelineClickListener.m122989k(this.f280459d);
            if (TimelineClickListener.m122989k(this.f280459d) == 0) {
                str2 = "CONTACT_INFO_UI_SOURCE";
                i = 1;
            } else {
                str2 = "CONTACT_INFO_UI_SOURCE";
                i = 2;
            }
            SnsAdClick snsAdClick2 = new SnsAdClick(k2, i, snsInfo.field_snsId, 1, 40);
            C102260r.m134864d(snsAdClick2, this.f280459d.f280378h, snsInfo, 1);
            Intent intent4 = intent;
            intent4.putExtra("Contact_User", str);
            intent4.putExtra("KSnsAdTag", snsAdClick2);
            intent4.putExtra("Contact_Scene", 78);
            if (TimelineClickListener.m122989k(this.f280459d) == 0) {
                i4 = 6;
            }
            intent4.putExtra(str2, i4);
            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent4, TimelineClickListener.m122988j(this.f280459d));
            Log.m105924i("MicroMsg.TimelineClickListener", "startContactInfo, addScene=78");
            C102236a0.m134773u0(snsAdClick2);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$9");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        String str5 = "CONTACT_INFO_UI_SOURCE";
        Intent intent5 = intent;
        if (C96085n8.m123089H(TimelineClickListener.m122983e(this.f280459d))) {
            TimelineClickListener.m122983e(this.f280459d).mo130970a().mo131334u(snsInfo, true);
        }
        C91998s d = TimelineClickListener.m122989k(this.f280459d) == 0 ? C91998s.m115550d(746) : C91998s.m115549c(746);
        str.endsWith(C75592q0.m90789s());
        d.mo125842g(intent5);
        if (TimelineClickListener.m122989k(this.f280459d) == 0) {
            i4 = 6;
        }
        intent5.putExtra(str5, i4);
        intent5.putExtra("Contact_User", str);
        ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent5, TimelineClickListener.m122988j(this.f280459d));
        ((C79168k) C86312j.m106911c(C79168k.class)).mo74109HD(str, 6);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$9");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
