package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import bl3.C39818r;
import br2.C54550e;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.SnsAdLivingStreamJumpEvent;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.model.C94851d1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsTimelineUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import de3.C75360c0;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import jp2.C98963o;
import lo2.C99542h0;
import p214om.C11502f;
import p773yy.C79168k;
import rq2.C101431r;
import tp2.C101911a;
import tp2.C101913c;
import tp2.C101914d;
import ut2.C102107v;
import vr2.C102236a0;
import vr2.C102243e;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.r */
public class C96174r implements C75360c0.C75361a {

    /* renamed from: a */
    public Activity f280963a;

    /* renamed from: b */
    public int f280964b;

    /* renamed from: c */
    public C94851d1 f280965c;

    public C96174r(Activity activity, int i, C94851d1 d1Var) {
        this.f280963a = activity;
        this.f280964b = i;
        this.f280965c = d1Var;
    }

    /* renamed from: a */
    public void mo67369a(View view, Object obj) {
        String str;
        String str2;
        int i;
        String str3;
        int i2;
        Object obj2 = obj;
        Class cls = C11502f.class;
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
        Intent intent = new Intent();
        if (this.f280963a == null) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
            return;
        }
        if (obj2 instanceof C102243e) {
            C102243e eVar = (C102243e) obj2;
            StringBuilder sb = new StringBuilder();
            sb.append("onClick : ");
            sb.append(eVar.f301104b);
            sb.append(" activity: ");
            sb.append(this.f280963a == null);
            sb.append(", source=");
            sb.append(this.f280964b);
            Log.m105918d("Micro.ClickableCallBack", sb.toString());
            SnsInfo DN = C94866e1.Yx0().mo139798DN(eVar.f301105c);
            if (DN == null) {
                Log.m105921e("Micro.ClickableCallBack", "onclick info is null. localId:%s", eVar.f301105c);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                return;
            } else if (eVar.f301103a) {
                try {
                    TimeLineObject timeLine = DN.getTimeLine();
                    if (C54550e.m61296a(DN) && ((i2 = timeLine.ContentObj.f298424e) == 15 || i2 == 5)) {
                        SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new SnsAdLivingStreamJumpEvent();
                        snsAdLivingStreamJumpEvent.f154872d.f154873a = C102236a0.m134728W(DN);
                        snsAdLivingStreamJumpEvent.publish();
                    }
                } catch (Throwable unused) {
                }
                ADXml adXml = DN.getAdXml();
                String str4 = mo133796b(DN).viewId;
                int i3 = eVar.f301106d;
                if (i3 <= 0) {
                    i3 = 2;
                }
                int i4 = this.f280964b;
                String str5 = "CONTACT_INFO_UI_SOURCE";
                String str6 = "Contact_Scene";
                SnsAdClick snsAdClick = new SnsAdClick(i4, i4 == 0 ? 1 : 2, DN.getAdSnsInfo().field_snsId, i3, 0);
                C98963o oVar = null;
                Activity activity = this.f280963a;
                if (activity instanceof SnsTimeLineUI) {
                    oVar = ((SnsTimeLineUI) activity).mo132956s8();
                } else if (activity instanceof SnsCommentDetailUI) {
                    SnsCommentDetailUI snsCommentDetailUI = (SnsCommentDetailUI) activity;
                    snsCommentDetailUI.getClass();
                    SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    C98963o oVar2 = snsCommentDetailUI.f277866X;
                    SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    oVar = oVar2;
                } else if (activity instanceof ImproveSnsTimelineUI) {
                    C102107v vVar = (C102107v) C39818r.f106831a.mo62443b(activity).mo75002a(C102107v.class);
                    vVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("getAdStatistic", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                    oVar = vVar.f300669d;
                    SnsMethodCalculate.markEndTimeMs("getAdStatistic", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                }
                C102260r.m134864d(snsAdClick, oVar, DN, i3);
                if (adXml != null) {
                    if (adXml.headClickType != 1 || Util.isNullOrNil(adXml.headClickParam)) {
                        if (adXml.headClickType == 0) {
                            if (C99542h0.m129904b(this.f280963a, adXml, mo133796b(DN), DN.field_snsId, 1)) {
                                C101431r.m133118a(snsAdClick, 41);
                                C102236a0.m134773u0(snsAdClick);
                                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                                return;
                            }
                        }
                        C101914d dVar = new C101914d();
                        dVar.mo141404b("ext_sns_ad_click", snsAdClick);
                        C101913c b = C101911a.m134113b(this.f280963a);
                        if (b != null) {
                            if (b.mo126055b(view, this.f280964b, DN, dVar)) {
                                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                                return;
                            }
                        }
                    } else {
                        String str7 = adXml.headClickParam;
                        ADInfo b2 = mo133796b(DN);
                        if (b2 != null) {
                            str7 = C102236a0.m134734b(str7, b2.uxInfo);
                        }
                        Log.m105924i("Micro.ClickableCallBack", "headClickParam url " + str7 + " " + adXml.headClickRightBarShow);
                        Intent intent2 = new Intent();
                        boolean z = adXml.headClickRightBarShow == 0;
                        intent2.putExtra("KsnsViewId", str4);
                        intent2.putExtra("KRightBtn", z);
                        intent2.putExtra("jsapiargs", new Bundle());
                        intent2.putExtra("rawUrl", str7);
                        intent2.putExtra("useJs", true);
                        if (this.f280964b == 0) {
                            C102236a0.m134732a(intent2, 81);
                        } else {
                            C102236a0.m134732a(intent2, 82);
                        }
                        ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93190w(intent2, this.f280963a);
                        C102236a0.m134773u0(snsAdClick);
                        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                        return;
                    }
                }
                this.f280965c.mo130970a().mo131334u(DN, false);
                if (eVar.f301104b.endsWith("@ad")) {
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                    return;
                }
                C101431r.m133118a(snsAdClick, 40);
                C102236a0.m134773u0(snsAdClick);
                intent.putExtra("Contact_User", eVar.f301104b);
                intent.putExtra("KSnsAdTag", snsAdClick);
                intent.putExtra(str6, 79);
                if (this.f280964b == 0) {
                    i = 6;
                    str3 = str5;
                } else {
                    str3 = str5;
                    i = 1;
                }
                intent.putExtra(str3, i);
                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent, this.f280963a);
                Log.m105924i("Micro.ClickableCallBack", "startContactInfo, addScene=79");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                return;
            } else {
                str = "CONTACT_INFO_UI_SOURCE";
                str2 = eVar.f301104b;
                if (this.f280964b == 0) {
                    C91998s.m115550d(719);
                } else {
                    C91998s.m115549c(719);
                }
                C102236a0.m134728W(DN);
                DN.isAd();
                DN.getUxinfo();
                C91998s d = this.f280964b == 0 ? C91998s.m115550d(746) : C91998s.m115549c(746);
                str2.endsWith(C75592q0.m90789s());
                d.mo125842g(intent);
                if (this.f280964b == 0) {
                    this.f280965c.mo130970a().mo131334u(DN, false);
                }
            }
        } else {
            String str8 = "Contact_Scene";
            str = "CONTACT_INFO_UI_SOURCE";
            str2 = (String) obj2;
            C86709a0.m107528h();
            C72996z1 N2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2(str2);
            if (N2 != null && N2.mo62916m3()) {
                intent.putExtra("Contact_User", str2);
                intent.putExtra(str8, 37);
                intent.putExtra(str, this.f280964b);
                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent, this.f280963a);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                return;
            } else if (this.f280964b == 0) {
                SnsInfo snsInfo = new SnsInfo();
                snsInfo.setUserName(str2);
                this.f280965c.mo130970a().mo131334u(snsInfo, false);
            }
        }
        intent.putExtra("Contact_User", str2);
        intent.putExtra(str, this.f280964b);
        ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent, this.f280963a);
        C79168k kVar = (C79168k) C86312j.m106911c(C79168k.class);
        int i5 = this.f280964b;
        kVar.mo74109HD(str2, i5 == 0 ? 6 : i5 == 13 ? 7 : 8);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
    }

    /* renamed from: b */
    public final ADInfo mo133796b(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
            return null;
        } else if (this.f280964b == 2) {
            ADInfo atAdInfo = snsInfo.getAtAdInfo();
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
            return atAdInfo;
        } else {
            ADInfo adInfo = snsInfo.getAdInfo();
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
            return adInfo;
        }
    }
}
