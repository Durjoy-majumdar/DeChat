package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import br2.C54550e;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.SnsAdLivingStreamJumpEvent;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import jp2.C98977w;
import k20.C9556a;
import ke3.C88144b;
import ko2.C46734a;
import lo2.C99542h0;
import p214om.C11502f;
import p749xh.C102646h;
import ps2.C100894u;
import sf0.C90188n0;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.k0 */
public class C96037k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280445d;

    public C96037k0(TimelineClickListener timelineClickListener) {
        this.f280445d = timelineClickListener;
    }

    public void onClick(View view) {
        String str;
        int i;
        String str2;
        boolean z;
        String str3;
        ADInfo l;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
        if (view.getTag() == null || !(view.getTag() instanceof Long)) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        AdSnsInfo jo = C94866e1.zx0().mo139864jo(((Long) view.getTag()).longValue());
        SnsInfo convertToSnsInfo = jo.convertToSnsInfo();
        C98977w.m128885a(C98977w.C98979b.Sight, C98977w.C98978a.DetailTimeline, jo.convertToSnsInfo(), TimelineClickListener.m122989k(this.f280445d));
        jo.getSource();
        String adInfoLink = convertToSnsInfo.getAdInfoLink();
        if (Util.isNullOrNil(adInfoLink)) {
            adInfoLink = convertToSnsInfo.getAdLink();
        }
        String str4 = adInfoLink;
        if (convertToSnsInfo.isAd()) {
            ADInfo l2 = TimelineClickListener.m122990l(this.f280445d, convertToSnsInfo);
            if (C54550e.m61296a(convertToSnsInfo)) {
                SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new SnsAdLivingStreamJumpEvent();
                snsAdLivingStreamJumpEvent.f154872d.f154873a = C102236a0.m134728W(convertToSnsInfo);
                snsAdLivingStreamJumpEvent.publish();
            }
            ADInfo aDInfo = l2;
            str = str4;
            String str5 = "MicroMsg.TimelineClickListener";
            z = true;
            if (C102260r.m134836E(TimelineClickListener.m122988j(this.f280445d), convertToSnsInfo, aDInfo, TimelineClickListener.m122989k(this.f280445d), this.f280445d.f280378h, 3, 0)) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ADInfo aDInfo2 = aDInfo;
            if (aDInfo2 == null || aDInfo2.adActionType != 1) {
                i = 3;
                int i2 = 10;
                if (aDInfo2 == null || aDInfo2.adActionType != 3) {
                    if (TimelineClickListener.m122982d(this.f280445d, aDInfo2, convertToSnsInfo, false)) {
                        SnsAdClick snsAdClick = new SnsAdClick(TimelineClickListener.m122989k(this.f280445d), TimelineClickListener.m122989k(this.f280445d) == 0 ? 1 : 2, convertToSnsInfo.field_snsId, 3, 31);
                        C102260r.m134864d(snsAdClick, this.f280445d.f280378h, convertToSnsInfo, 3);
                        C102236a0.m134773u0(snsAdClick);
                        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
                        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else if (C99542h0.m129904b(TimelineClickListener.m122988j(this.f280445d), convertToSnsInfo.getAdXml(), convertToSnsInfo.getAdInfo(), convertToSnsInfo.field_snsId, 2)) {
                        SnsAdClick snsAdClick2 = new SnsAdClick(TimelineClickListener.m122989k(this.f280445d), TimelineClickListener.m122989k(this.f280445d) == 0 ? 1 : 2, convertToSnsInfo.field_snsId, 3, 41);
                        C102260r.m134864d(snsAdClick2, this.f280445d.f280378h, convertToSnsInfo, 3);
                        C102236a0.m134773u0(snsAdClick2);
                        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
                        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else {
                        TimelineClickListener timelineClickListener = this.f280445d;
                        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                        timelineClickListener.getClass();
                        SnsMethodCalculate.markStartTimeMs("canTagSupportClickActionInfo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                        boolean z3 = convertToSnsInfo.getAdXml().adActionLinkClickInfo != null;
                        SnsMethodCalculate.markEndTimeMs("canTagSupportClickActionInfo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                        if (z3) {
                            TimelineClickListener timelineClickListener2 = this.f280445d;
                            SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                            timelineClickListener2.getClass();
                            SnsMethodCalculate.markStartTimeMs("adActionLinkJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                            if (timelineClickListener2.f280380j == null) {
                                Log.m105920e(str5, "adActionLinkJump, mAdClickActionHandler is null");
                                SnsMethodCalculate.markEndTimeMs("adActionLinkJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                            } else {
                                AdClickActionInfo adClickActionInfo = convertToSnsInfo.getAdXml().adActionLinkClickInfo;
                                if (adClickActionInfo != null) {
                                    adClickActionInfo.f273639a = 10;
                                    timelineClickListener2.f280380j.mo141559h(adClickActionInfo, convertToSnsInfo);
                                    timelineClickListener2.f280380j.mo141556e(view);
                                }
                                SnsMethodCalculate.markEndTimeMs("adActionLinkJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                            }
                            SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
                            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                    }
                } else if (convertToSnsInfo.getAdXml().isLandingPagesAd() && C100894u.m132239s(convertToSnsInfo.getAdSnsInfo().field_adxml)) {
                    String a = C100894u.m132221a(convertToSnsInfo);
                    if (!Util.isNullOrNil(a)) {
                        jo.field_adxml = a;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("sns_landing_pages_share_sns_id", convertToSnsInfo.getSnsId());
                    intent.putExtra("sns_landing_pages_rawSnsId", convertToSnsInfo.getTimeLine().f283893Id);
                    intent.putExtra("sns_landing_pages_ux_info", convertToSnsInfo.getUxinfo());
                    intent.putExtra("sns_landing_pages_aid", convertToSnsInfo.getAid());
                    intent.putExtra("sns_landing_pages_traceid", convertToSnsInfo.getTraceid());
                    TimeLineObject timeLine = convertToSnsInfo.getTimeLine();
                    if (timeLine != null) {
                        LinkedList<C101804kv2> linkedList = timeLine.ContentObj.f298427h;
                        if (linkedList.size() > 0) {
                            z2 = false;
                            intent.putExtra("sns_landing_pages_share_thumb_url", linkedList.get(0).f298694i);
                        } else {
                            z2 = false;
                        }
                        if (timeLine.ContentObj.f298424e == 15) {
                            intent.putExtra("sns_landing_is_native_sight_ad", true);
                        }
                    } else {
                        z2 = false;
                    }
                    TimelineClickListener.m122981c(this.f280445d, intent, convertToSnsInfo);
                    intent.setClass(TimelineClickListener.m122988j(this.f280445d), SnsAdNativeLandingPagesUI.class);
                    if (TimelineClickListener.m122989k(this.f280445d) == 2) {
                        i2 = 16;
                    } else if (TimelineClickListener.m122989k(this.f280445d) != 1) {
                        i2 = 9;
                    }
                    intent.putExtra("sns_landig_pages_from_source", i2);
                    intent.putExtra("sns_landing_pages_xml", convertToSnsInfo.getAdSnsInfo().field_adxml);
                    intent.putExtra("sns_landing_pages_rec_src", convertToSnsInfo.getAdRecSrc());
                    intent.putExtra("sns_landing_pages_xml_prefix", C102646h.COL_ADXML);
                    intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", z2);
                    intent.putExtra("sns_landing_page_start_time", System.currentTimeMillis());
                    Activity j = TimelineClickListener.m122988j(this.f280445d);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Activity activity = j;
                    C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    j.startActivity((Intent) aVar.mo10231a(z2 ? 1 : 0));
                    C117292a.m165359e(activity, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    SnsAdClick snsAdClick3 = new SnsAdClick(TimelineClickListener.m122989k(this.f280445d), TimelineClickListener.m122989k(this.f280445d) == 0 ? 1 : 2, convertToSnsInfo.field_snsId, 3, 21);
                    C102260r.m134864d(snsAdClick3, this.f280445d.f280378h, convertToSnsInfo, 3);
                    C102236a0.m134773u0(snsAdClick3);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                str2 = str5;
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("key_card_id", aDInfo2.adActionCardTpId);
                intent2.putExtra("key_card_ext", aDInfo2.adActionCardExt);
                intent2.putExtra("key_from_scene", 21);
                intent2.putExtra("key_stastic_scene", 15);
                C88144b.m109791i(TimelineClickListener.m122988j(this.f280445d), "card", ".ui.CardDetailUI", intent2, (Bundle) null);
                SnsAdClick snsAdClick4 = new SnsAdClick(TimelineClickListener.m122989k(this.f280445d), TimelineClickListener.m122989k(this.f280445d) == 0 ? 1 : 2, convertToSnsInfo.field_snsId, 3, 11);
                C102260r.m134864d(snsAdClick4, this.f280445d.f280378h, convertToSnsInfo, 3);
                C102236a0.m134773u0(snsAdClick4);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else {
            str2 = "MicroMsg.TimelineClickListener";
            str = str4;
            z = true;
            i = 3;
        }
        SnsAdClick snsAdClick5 = new SnsAdClick(TimelineClickListener.m122989k(this.f280445d), TimelineClickListener.m122989k(this.f280445d) == 0 ? 1 : 2, convertToSnsInfo.field_snsId, 3, 0);
        C102260r.m134864d(snsAdClick5, this.f280445d.f280378h, convertToSnsInfo, i);
        C102236a0.m134773u0(snsAdClick5);
        StringBuilder sb = new StringBuilder();
        sb.append("adTagClick, adlink url ");
        String str6 = str;
        sb.append(str6);
        sb.append(" ");
        sb.append(convertToSnsInfo.getAdXml().webrightBar);
        Log.m105924i(str2, sb.toString());
        Intent intent3 = new Intent();
        boolean z4 = convertToSnsInfo.getAdXml().webrightBar == 0;
        if (C90188n0.f258957y) {
            z4 = false;
        }
        if (!convertToSnsInfo.isAd() || (l = TimelineClickListener.m122990l(this.f280445d, convertToSnsInfo)) == null) {
            str3 = str6;
        } else {
            intent3.putExtra("KsnsViewId", l.viewId);
            str3 = C46734a.m52032e(C102236a0.m134734b(str6, l.uxInfo));
            C102236a0.m134736c(intent3, l.uxInfo);
        }
        intent3.putExtra("KRightBtn", z4);
        Bundle bundle = new Bundle();
        bundle.putParcelable("KSnsAdTag", snsAdClick5);
        bundle.putString("key_snsad_statextstr", jo.getTimeLine().statExtStr);
        intent3.putExtra("jsapiargs", bundle);
        intent3.putExtra("rawUrl", str3);
        intent3.putExtra("useJs", z);
        intent3.putExtra("srcUsername", convertToSnsInfo.field_userName);
        intent3.putExtra("sns_local_id", convertToSnsInfo.getLocalid());
        intent3.putExtra("stastic_scene", 15);
        intent3.putExtra("KPublisherId", "sns_" + C102236a0.m134765q0(convertToSnsInfo.field_snsId));
        intent3.putExtra("pre_username", convertToSnsInfo.field_userName);
        intent3.putExtra("prePublishId", "sns_" + C102236a0.m134765q0(convertToSnsInfo.field_snsId));
        intent3.putExtra("preUsername", convertToSnsInfo.field_userName);
        this.f280445d.mo133544m(intent3);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent3, TimelineClickListener.m122988j(this.f280445d));
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
