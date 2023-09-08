package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import as2.C28125b;
import as2.C92086h;
import bs2.C92301a;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94891k2;
import com.tencent.p014mm.plugin.sns.model.C94921o2;
import com.tencent.p014mm.plugin.sns.p106ui.C96085n8;
import com.tencent.p014mm.plugin.sns.p106ui.C96235u4;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e30.C75539a;
import eb0.C75592q0;
import ft2.C97979c;
import ft2.C97981f;
import ft2.c$$b;
import ft2.c$$e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import k20.C9556a;
import lo2.C34318c;
import lo2.C99542h0;
import nt2.C100165c;
import os2.C100416r;
import p214om.C11502f;
import p749xh.C102646h;
import ps2.C100894u;
import te3.C101804kv2;
import te3.C101833r5;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.l */
public class C96038l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280446d;

    public C96038l(TimelineClickListener timelineClickListener) {
        this.f280446d = timelineClickListener;
    }

    public void onClick(View view) {
        int i;
        String str;
        int i2;
        String str2;
        String str3;
        String str4;
        int i3;
        String str5;
        String str6;
        char c;
        SnsInfo snsInfo;
        String str7;
        View view2 = view;
        Class cls = C11502f.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$18");
        if (view.getTag() instanceof C96235u4) {
            str = ((C96235u4) view.getTag()).f281206a;
            i = ((C96235u4) view.getTag()).f281207b;
        } else {
            str = view.getTag() instanceof BaseTimeLineItem.BaseViewHolder ? ((BaseTimeLineItem.BaseViewHolder) view.getTag()).f279956g : view.getTag() instanceof C100165c ? ((C100165c) view.getTag()).f293412e.getLocalid() : null;
            i = -1;
        }
        SnsInfo b = C100416r.m131409b(str);
        if (b == null) {
            Log.m105920e("MicroMsg.TimelineClickListener", "photo click without snsinfo ,localId " + str);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$18");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Log.m105925i("MicroMsg.TimelineClickListener", "photo click snsinfo ,localId %s is ad:%b", str, Boolean.valueOf(b.isAd()));
        if (!b.isAd() || b.getAdXml() == null || (!b.getAdXml().isCardAd() && !b.getAdXml().isFullCardAd())) {
            if (b.getTimeLine() != null && b.getTimeLine().isExcerpt) {
                long j = b.field_snsId;
                HashMap<Long, c$$e> hashMap = C97979c.f287345j;
                SnsMethodCalculate.markStartTimeMs("recordClickExceprtBigImg", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
                C94866e1.my0().post(new c$$b(j));
                SnsMethodCalculate.markEndTimeMs("recordClickExceprtBigImg", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            }
            if (b.getTimeLine().ContentObj.f298424e == 21) {
                if (C75592q0.m90789s().equals(b.getUserName())) {
                    SnsMethodCalculate.markStartTimeMs("reportHBPhoto", "com.tencent.mm.plugin.sns.lucky.report.ReportHbReceivePoZhu");
                    String str8 = b.getTimeLine().f283893Id;
                    ThreadLocal<HashMap<String, Long>> threadLocal = C92086h.f263636a;
                    SnsMethodCalculate.markStartTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                    C92086h.m115758e(b, (SnsObject) null);
                    SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                    C92086h.m115757d(b);
                    System.currentTimeMillis();
                    SnsMethodCalculate.markEndTimeMs("reportHBPhoto", "com.tencent.mm.plugin.sns.lucky.report.ReportHbReceivePoZhu");
                    C28125b.m38099a(25);
                }
                if (!C75592q0.m90789s().equals(b.getUserName())) {
                    i2 = 2;
                    C92301a.m116078a(2, b);
                    C28125b.m38099a(30);
                } else {
                    i2 = 2;
                }
            } else {
                i2 = 2;
            }
            if (b.isAd()) {
                ADXml adXml = b.getAdXml();
                if (adXml != null) {
                    C34318c.m40322a(TimelineClickListener.m122988j(this.f280446d), adXml.appGiftPackCode, adXml.appGiftPackCodeTips);
                }
                ADInfo l = TimelineClickListener.m122990l(this.f280446d, b);
                str6 = "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter";
                str4 = "onClick";
                c = 0;
                ADInfo aDInfo = l;
                if (C102260r.m134836E(TimelineClickListener.m122988j(this.f280446d), b, l, TimelineClickListener.m122989k(this.f280446d), this.f280446d.f280378h, 21, i)) {
                    str5 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$18";
                    str3 = "android/view/View$OnClickListener";
                    str2 = "(Landroid/view/View;)V";
                    snsInfo = b;
                    i3 = 1;
                } else if (!b.getAdXml().isLandingPagesAd() || !C100894u.m132239s(b.getAdSnsInfo().field_adxml)) {
                    i3 = 1;
                    ADInfo aDInfo2 = aDInfo;
                    if (aDInfo2 == null || !aDInfo2.checkCurIndexCanJump(i)) {
                        str5 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$18";
                        str3 = "android/view/View$OnClickListener";
                        str2 = "(Landroid/view/View;)V";
                        snsInfo = b;
                        if (TimelineClickListener.m122982d(this.f280446d, aDInfo2, snsInfo, false)) {
                            SnsAdClick snsAdClick = new SnsAdClick(TimelineClickListener.m122989k(this.f280446d), TimelineClickListener.m122989k(this.f280446d) == 0 ? 1 : 2, snsInfo.field_snsId, 21, 31);
                            C102260r.m134865e(snsAdClick, this.f280446d.f280378h, snsInfo, 21, i);
                            C102236a0.m134773u0(snsAdClick);
                        } else if (SnsTimeLineBaseAdapter.m122254p(snsInfo) != 2) {
                            this.f280446d.mo132101v(view2);
                        } else if (C99542h0.m129903a(TimelineClickListener.m122988j(this.f280446d), snsInfo.getAdXml(), aDInfo2, snsInfo.field_snsId, 3)) {
                            SnsAdClick snsAdClick2 = new SnsAdClick(TimelineClickListener.m122989k(this.f280446d), TimelineClickListener.m122989k(this.f280446d) == 0 ? 1 : 2, snsInfo.field_snsId, 21, 37);
                            C102260r.m134865e(snsAdClick2, this.f280446d.f280378h, snsInfo, 21, i);
                            C102236a0.m134773u0(snsAdClick2);
                        } else {
                            this.f280446d.mo132101v(view2);
                        }
                    } else {
                        str5 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$18";
                        str3 = "android/view/View$OnClickListener";
                        str2 = "(Landroid/view/View;)V";
                        TimelineClickListener.m122984f(this.f280446d, view, b, aDInfo2, i, 7);
                        snsInfo = b;
                    }
                } else {
                    String a = C100894u.m132221a(b);
                    if (!Util.isNullOrNil(a)) {
                        b.getAdSnsInfo().field_adxml = a;
                    }
                    SnsAdClick snsAdClick3 = new SnsAdClick(TimelineClickListener.m122989k(this.f280446d), TimelineClickListener.m122989k(this.f280446d) == 0 ? 1 : 2, b.field_snsId, 21, 21);
                    C102260r.m134865e(snsAdClick3, this.f280446d.f280378h, b, 21, i);
                    C102236a0.m134773u0(snsAdClick3);
                    int[] iArr = new int[i2];
                    view2.getLocationInWindow(iArr);
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Intent intent = new Intent();
                    intent.putExtra("img_gallery_left", iArr[0]);
                    i3 = 1;
                    intent.putExtra("img_gallery_top", iArr[1]);
                    intent.putExtra("img_gallery_width", width);
                    intent.putExtra("img_gallery_height", height);
                    intent.putExtra("sns_landing_pages_share_sns_id", b.getSnsId());
                    intent.putExtra("sns_landing_pages_rawSnsId", b.getTimeLine().f283893Id);
                    intent.putExtra("sns_landing_pages_ux_info", b.getUxinfo());
                    intent.putExtra("sns_landing_pages_aid", b.getAid());
                    intent.putExtra("sns_landing_pages_traceid", b.getTraceid());
                    TimeLineObject timeLine = b.getTimeLine();
                    if (timeLine != null) {
                        LinkedList<C101804kv2> linkedList = timeLine.ContentObj.f298427h;
                        if (linkedList.size() > 0) {
                            intent.putExtra("sns_landing_pages_share_thumb_url", linkedList.get(0).f298694i);
                            intent.putExtra("sns_landing_pages_from_outer_index", ((C96235u4) view.getTag()).f281207b);
                        }
                    }
                    intent.setClass(TimelineClickListener.m122988j(this.f280446d), SnsAdNativeLandingPagesUI.class);
                    intent.putExtra("sns_landig_pages_from_source", TimelineClickListener.m122989k(this.f280446d) == 2 ? 16 : TimelineClickListener.m122989k(this.f280446d) == 1 ? 2 : 1);
                    intent.putExtra("sns_landing_pages_xml", b.getAdSnsInfo().field_adxml);
                    intent.putExtra("sns_landing_pages_rec_src", b.getAdRecSrc());
                    intent.putExtra("sns_landing_pages_xml_prefix", C102646h.COL_ADXML);
                    intent.putExtra("sns_landing_page_start_time", System.currentTimeMillis());
                    if (!b.getAdXml().forbiddenCustomAnimation) {
                        intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
                        intent.putExtra("sns_landing_pages_is_normal_ad_animation", true);
                    }
                    Activity j2 = TimelineClickListener.m122988j(this.f280446d);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Activity activity = j2;
                    C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$18", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    j2.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(activity, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$18", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    if (!b.getAdXml().forbiddenCustomAnimation) {
                        TimelineClickListener.m122988j(this.f280446d).overridePendingTransition(0, 0);
                    }
                    if (C96085n8.m123089H(TimelineClickListener.m122983e(this.f280446d))) {
                        TimelineClickListener.m122983e(this.f280446d).mo130970a().mo131335v(b);
                    }
                    str5 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$18";
                    str3 = "android/view/View$OnClickListener";
                    str2 = "(Landroid/view/View;)V";
                    snsInfo = b;
                }
            } else {
                str5 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$18";
                str3 = "android/view/View$OnClickListener";
                str2 = "(Landroid/view/View;)V";
                snsInfo = b;
                str4 = "onClick";
                str6 = "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter";
                c = 0;
                i3 = 1;
                this.f280446d.mo132101v(view2);
            }
            C96235u4 u4Var = (C96235u4) view.getTag();
            if (u4Var.f281210e) {
                int i4 = u4Var.f281207b;
                HashMap<Long, c$$e> hashMap2 = C97979c.f287345j;
                SnsMethodCalculate.markStartTimeMs("recordClick", str6);
                C94866e1.my0().post(new C97981f(snsInfo, i4));
                SnsMethodCalculate.markEndTimeMs("recordClick", str6);
                C97979c.m126546k(snsInfo, u4Var.f281207b);
                String localid = snsInfo.getLocalid();
                ConcurrentHashMap<String, C94921o2.C94923b> concurrentHashMap = C94921o2.f275081a;
                SnsMethodCalculate.markStartTimeMs("recordClickBigPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                Object[] objArr = new Object[i3];
                objArr[c] = localid;
                Log.m105919d("MicroMsg.TimelineSmallPicStat", "recordClickBigpic, localId:%s", objArr);
                if (C94921o2.f275081a.containsKey(localid)) {
                    Object[] objArr2 = new Object[i3];
                    objArr2[c] = localid;
                    Log.m105919d("MicroMsg.TimelineSmallPicStat", "recordClickBigPic, localId:%s, update map", objArr2);
                    C94921o2.C94923b bVar = C94921o2.f275081a.get(localid);
                    if (!(bVar == null || bVar.f275088b != -1 || bVar.f275087a == -1)) {
                        bVar.f275088b = 1;
                        bVar.f275091e = bVar.f275090d;
                        str7 = "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$18";
                        bVar.f275089c = System.currentTimeMillis() - bVar.f275087a;
                        for (C94921o2.C94922a aVar2 : bVar.f275096j.values()) {
                            aVar2.f275083a = 1;
                        }
                        SnsMethodCalculate.markEndTimeMs("recordClickBigPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                    }
                }
                str7 = "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$18";
                SnsMethodCalculate.markEndTimeMs("recordClickBigPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
            } else {
                str7 = "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$18";
            }
            TimeLineObject timeLine2 = snsInfo.getTimeLine();
            if (timeLine2 != null) {
                C101833r5 r5Var = timeLine2.AppInfo;
                String str9 = r5Var == null ? null : r5Var.f299236d;
                if (!Util.isNullOrNil(str9)) {
                    ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93162s5((Context) null, str9, ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93137CP(str9, false), timeLine2.UserName, 2, 4, 4, timeLine2.statisticsData, 0, timeLine2.f283893Id);
                }
            }
            C94891k2.f274975a.mo131068a(snsInfo, i3);
            TimelineClickListener timelineClickListener = this.f280446d;
            String userName = snsInfo.getUserName();
            String snsId = snsInfo.getSnsId();
            int typeFlag = snsInfo.getTypeFlag();
            SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            timelineClickListener.getClass();
            SnsMethodCalculate.markStartTimeMs("publicClickEvent", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            C75539a.m90584d(userName, snsId, typeFlag);
            SnsMethodCalculate.markEndTimeMs("publicClickEvent", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            String str10 = str4;
            SnsMethodCalculate.markEndTimeMs(str10, str7);
            C117292a.m165361g(this, str5, str3, str10, str2);
            return;
        }
        Log.m105924i("MicroMsg.TimelineClickListener", "ad handle click");
        this.f280446d.f280365U.onClick(view2);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$18");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
