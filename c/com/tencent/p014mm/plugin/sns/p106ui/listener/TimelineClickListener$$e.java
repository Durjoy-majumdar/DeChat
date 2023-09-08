package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
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
import k20.C9556a;
import ke3.C88144b;
import os2.C100416r;
import p214om.C11502f;
import p749xh.C102646h;
import ps2.C100894u;
import sf0.C90188n0;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$$e */
public class TimelineClickListener$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280402d;

    public TimelineClickListener$$e(TimelineClickListener timelineClickListener) {
        this.f280402d = timelineClickListener;
    }

    public void onClick(View view) {
        SnsInfo snsInfo;
        MMImageView mMImageView;
        TagImageView tagImageView;
        ADInfo l;
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
        Object tag = view.getTag();
        if (tag instanceof BaseTimeLineItem.BaseViewHolder) {
            BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
            SnsInfo a = C100416r.m131408a(baseViewHolder.f279950d);
            tagImageView = baseViewHolder.f279982t;
            snsInfo = a;
            mMImageView = null;
        } else if (tag instanceof SnsInfo) {
            snsInfo = (SnsInfo) tag;
            mMImageView = (MMImageView) view2.getTag(C0966R.C0970id.foq);
            tagImageView = null;
        } else {
            tagImageView = null;
            mMImageView = null;
            snsInfo = null;
        }
        if (snsInfo != null) {
            AdSnsInfo adSnsInfo = snsInfo.getAdSnsInfo();
            boolean z = false;
            if (snsInfo.isAd()) {
                ADInfo l2 = TimelineClickListener.m122990l(this.f280402d, snsInfo);
                if (snsInfo.getAdXml().isLandingPagesAd() && C100894u.m132239s(snsInfo.getAdSnsInfo().field_adxml)) {
                    String a2 = C100894u.m132221a(snsInfo);
                    if (!Util.isNullOrNil(a2)) {
                        adSnsInfo.field_adxml = a2;
                    }
                    int[] iArr = new int[2];
                    view2.getLocationInWindow(iArr);
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (tagImageView != null) {
                        tagImageView.getLocationInWindow(iArr);
                        width = tagImageView.getWidth();
                        height = tagImageView.getHeight();
                    } else if (mMImageView != null) {
                        mMImageView.getLocationInWindow(iArr);
                        width = mMImageView.getWidth();
                        height = mMImageView.getHeight();
                    }
                    Intent intent = new Intent();
                    intent.putExtra("img_gallery_left", iArr[0]);
                    intent.putExtra("img_gallery_top", iArr[1]);
                    intent.putExtra("img_gallery_width", width);
                    intent.putExtra("img_gallery_height", height);
                    intent.putExtra("sns_landing_pages_share_sns_id", snsInfo.getSnsId());
                    intent.putExtra("sns_landing_pages_rawSnsId", snsInfo.getTimeLine().f283893Id);
                    intent.putExtra("sns_landing_pages_ux_info", snsInfo.getUxinfo());
                    TimeLineObject timeLine = snsInfo.getTimeLine();
                    if (timeLine != null) {
                        LinkedList<C101804kv2> linkedList = timeLine.ContentObj.f298427h;
                        if (linkedList.size() > 0) {
                            intent.putExtra("sns_landing_pages_share_thumb_url", linkedList.get(0).f298694i);
                        }
                    }
                    intent.setClass(TimelineClickListener.m122988j(this.f280402d), SnsAdNativeLandingPagesUI.class);
                    int i = 9;
                    if (TimelineClickListener.m122989k(this.f280402d) == 2) {
                        i = 16;
                    } else if (TimelineClickListener.m122989k(this.f280402d) == 1) {
                        i = 10;
                    }
                    intent.putExtra("sns_landig_pages_from_source", i);
                    intent.putExtra("sns_landing_pages_xml", snsInfo.getAdSnsInfo().field_adxml);
                    intent.putExtra("sns_landing_pages_rec_src", snsInfo.getAdRecSrc());
                    intent.putExtra("sns_landing_pages_xml_prefix", C102646h.COL_ADXML);
                    intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
                    intent.putExtra("sns_landing_is_native_sight_ad", true);
                    intent.putExtra("sns_landing_page_start_time", System.currentTimeMillis());
                    Activity j = TimelineClickListener.m122988j(this.f280402d);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Activity activity = j;
                    C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    j.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(activity, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    TimelineClickListener.m122988j(this.f280402d).overridePendingTransition(0, 0);
                    C102236a0.m134773u0(new SnsAdClick(TimelineClickListener.m122989k(this.f280402d), TimelineClickListener.m122989k(this.f280402d) == 0 ? 1 : 2, snsInfo.field_snsId, 23, 21));
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (l2 != null && l2.adActionType == 1) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_card_id", l2.adActionCardTpId);
                    intent2.putExtra("key_card_ext", l2.adActionCardExt);
                    intent2.putExtra("key_from_scene", 21);
                    intent2.putExtra("key_stastic_scene", 15);
                    C88144b.m109791i(TimelineClickListener.m122988j(this.f280402d), "card", ".ui.CardDetailUI", intent2, (Bundle) null);
                    C102236a0.m134773u0(new SnsAdClick(TimelineClickListener.m122989k(this.f280402d), TimelineClickListener.m122989k(this.f280402d) == 0 ? 1 : 2, snsInfo.field_snsId, 23, 11));
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (TimelineClickListener.m122982d(this.f280402d, l2, snsInfo, false)) {
                    C102236a0.m134773u0(new SnsAdClick(TimelineClickListener.m122989k(this.f280402d), TimelineClickListener.m122989k(this.f280402d) == 0 ? 1 : 2, snsInfo.field_snsId, 23, 31));
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            SnsAdClick snsAdClick = new SnsAdClick(TimelineClickListener.m122989k(this.f280402d), TimelineClickListener.m122989k(this.f280402d) == 0 ? 1 : 2, snsInfo.field_snsId, 23, 0);
            C102236a0.m134773u0(snsAdClick);
            String adInfoLink = snsInfo.getAdInfoLink();
            if (Util.isNullOrNil(adInfoLink)) {
                adInfoLink = snsInfo.getAdLink();
            }
            Log.m105924i("MicroMsg.TimelineClickListener", "linkAdClick, adlink url " + adInfoLink + " " + snsInfo.getAdXml().webrightBar);
            Intent intent3 = new Intent();
            boolean z2 = snsInfo.getAdXml().webrightBar == 0;
            if (!C90188n0.f258957y) {
                z = z2;
            }
            if (snsInfo.isAd() && (l = TimelineClickListener.m122990l(this.f280402d, snsInfo)) != null) {
                intent3.putExtra("KsnsViewId", l.viewId);
                adInfoLink = C102236a0.m134734b(adInfoLink, l.uxInfo);
                C102236a0.m134736c(intent3, l.uxInfo);
            }
            intent3.putExtra("KRightBtn", z);
            Bundle bundle = new Bundle();
            bundle.putParcelable("KSnsAdTag", snsAdClick);
            bundle.putString("key_snsad_statextstr", adSnsInfo.getTimeLine().statExtStr);
            intent3.putExtra("jsapiargs", bundle);
            intent3.putExtra("rawUrl", adInfoLink);
            intent3.putExtra("useJs", true);
            intent3.putExtra("srcUsername", snsInfo.field_userName);
            intent3.putExtra("stastic_scene", 15);
            intent3.putExtra("KPublisherId", "sns_" + C102236a0.m134765q0(snsInfo.field_snsId));
            intent3.putExtra("pre_username", snsInfo.field_userName);
            intent3.putExtra("prePublishId", "sns_" + C102236a0.m134765q0(snsInfo.field_snsId));
            intent3.putExtra("preUsername", snsInfo.field_userName);
            this.f280402d.mo133544m(intent3);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent3, TimelineClickListener.m122988j(this.f280402d));
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
