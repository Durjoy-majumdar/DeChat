package gq2;

import android.content.Intent;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.p106ui.C96071m8;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import gq2.C98171c;
import hq2.C98497c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ps2.C100894u;
import rq2.C101425k;
import vr2.C102236a0;
import vr2.C102244f;
import vr2.C102260r;

/* renamed from: gq2.a */
public class C98169a implements C98171c.C98174c {

    /* renamed from: a */
    public C102244f f287800a;

    /* renamed from: b */
    public SnsInfo f287801b;

    /* renamed from: c */
    public int f287802c = 0;

    /* renamed from: d */
    public String f287803d = "zh_CN";

    /* renamed from: a */
    public final int mo137448a() {
        C96071m8 m8Var;
        ADInfo aDInfo;
        SnsMethodCalculate.markStartTimeMs("getAdDelayDay", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        C102244f fVar = this.f287800a;
        if (fVar == null || (m8Var = fVar.f301107a) == null || (aDInfo = m8Var.f280527k) == null) {
            Log.m105920e("FeedbackDataSupplier", "the data tag is null!");
        } else {
            ADInfo.C95010c cVar = aDInfo.adUnlikeInfo;
            if (cVar != null) {
                int i = cVar.f275649a;
                SnsMethodCalculate.markEndTimeMs("getAdDelayDay", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                return i;
            }
            Log.m105920e("FeedbackDataSupplier", "the adUnlikeInfo is null in data tag!");
        }
        SnsMethodCalculate.markEndTimeMs("getAdDelayDay", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return 7;
    }

    /* renamed from: b */
    public final ADInfo mo137449b() {
        SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        C102244f fVar = this.f287800a;
        SnsInfo snsInfo = this.f287801b;
        ADInfo aDInfo = null;
        if (fVar == null) {
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
        C96071m8 m8Var = fVar.f301107a;
        if (m8Var != null) {
            aDInfo = m8Var.f280527k;
        }
        if (snsInfo != null) {
            aDInfo = snsInfo.getAdInfo(this.f287802c);
        }
        SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return aDInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r2 = r2.f301107a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.sns.storage.ADXml mo137450c() {
        /*
            r4 = this;
            java.lang.String r0 = "getAdXml"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            vr2.f r2 = r4.f287800a
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r4.f287801b
            if (r2 == 0) goto L_0x0014
            com.tencent.mm.plugin.sns.ui.m8 r2 = r2.f301107a
            if (r2 == 0) goto L_0x0014
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r2.f280526j
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            if (r2 != 0) goto L_0x001d
            if (r3 == 0) goto L_0x001d
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r3.getAdXml()
        L_0x001d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gq2.C98169a.mo137450c():com.tencent.mm.plugin.sns.storage.ADXml");
    }

    /* renamed from: d */
    public final Intent mo137451d() {
        ADXml.C95016e eVar;
        SnsMethodCalculate.markStartTimeMs("getComplaintNormalIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        SnsMethodCalculate.markStartTimeMs("getComplaintUrl", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        ADXml c = mo137450c();
        String str = "";
        if (c == null || (eVar = c.adFeedbackInfo) == null) {
            Log.m105920e("FeedbackDataSupplier", "there is no feedback info!!!");
        } else if (C101425k.m133097a(eVar.f275680a)) {
            Log.m105920e("FeedbackDataSupplier", "there is no feedback item!");
            SnsMethodCalculate.markEndTimeMs("getComplaintUrl", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            SnsInfo snsInfo = this.f287801b;
            if (!TextUtils.isEmpty(str) || snsInfo == null) {
                SnsMethodCalculate.markEndTimeMs("getComplaintNormalIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                return null;
            }
            try {
                str = C100894u.m132224d(str, String.format("snsid=%s", new Object[]{snsInfo.getTimeLine().f283893Id}), String.format("aid=%s", new Object[]{snsInfo.getAid()}), String.format("traceid=%s", new Object[]{snsInfo.getTraceid()}), String.format("uin=%s", new Object[]{C86709a0.m107523b().mo121111i()}));
            } catch (Exception unused) {
            }
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("useJs", true);
            intent.putExtra("KPublisherId", "sns_" + C102236a0.m134765q0(snsInfo.field_snsId));
            intent.putExtra("pre_username", snsInfo.field_userName);
            intent.putExtra("prePublishId", "sns_" + C102236a0.m134765q0(snsInfo.field_snsId));
            intent.putExtra("preUsername", snsInfo.field_userName);
            SnsMethodCalculate.markEndTimeMs("getComplaintNormalIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return intent;
        } else {
            Iterator<ADXml.C95017f> it = eVar.f275680a.iterator();
            while (true) {
                if (it.hasNext()) {
                    ADXml.C95017f next = it.next();
                    if (next != null && !TextUtils.isEmpty(next.f275684d)) {
                        str = next.f275684d;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (TextUtils.isEmpty(str)) {
                Log.m105920e("FeedbackDataSupplier", "there is feedback item, but no url!!!");
            }
        }
        SnsMethodCalculate.markEndTimeMs("getComplaintUrl", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        SnsInfo snsInfo2 = this.f287801b;
        if (!TextUtils.isEmpty(str)) {
        }
        SnsMethodCalculate.markEndTimeMs("getComplaintNormalIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return null;
    }

    /* renamed from: e */
    public final Intent mo137452e() {
        SnsMethodCalculate.markStartTimeMs("getComplaintWeAppIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        ADXml c = mo137450c();
        ADInfo b = mo137449b();
        SnsInfo snsInfo = this.f287801b;
        if (c == null || TextUtils.isEmpty(c.feedbackWeAppUsername) || TextUtils.isEmpty(c.feedbackWeAppPath) || snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("getComplaintWeAppIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
        String W = C102236a0.m134728W(snsInfo);
        String nullAsNil = Util.nullAsNil(snsInfo.getAid());
        String nullAsNil2 = Util.nullAsNil(snsInfo.getTraceid());
        String nullAsNil3 = Util.nullAsNil(C86709a0.m107523b().mo121111i());
        Intent intent = new Intent();
        String str = c.feedbackWeAppPath;
        String str2 = b != null ? b.uxInfo : "";
        intent.putExtra("appUserName", c.feedbackWeAppUsername);
        C100894u.m132223c(str, "snsid=" + W, "aid=" + nullAsNil, "traceid=" + nullAsNil2, "uin=" + nullAsNil3);
        if (b != null) {
            str = C102260r.m134860b(str, b.addClickTimeToWeAppPath);
        }
        intent.putExtra("appPagePath", str);
        intent.putExtra("aId", nullAsNil);
        intent.putExtra("sceneNote", W + XVFSFile.PATH_SEPARATOR + str2 + XVFSFile.PATH_SEPARATOR + C94866e1.Mx0() + XVFSFile.PATH_SEPARATOR + System.currentTimeMillis());
        intent.putExtra("uxInfo", str2);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f287802c == 0 ? 1045 : 1046);
        SnsMethodCalculate.markEndTimeMs("getComplaintWeAppIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return intent;
    }

    /* renamed from: f */
    public Map<String, Object> mo137453f(String str) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("getData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        ArrayMap arrayMap = new ArrayMap();
        try {
            if ("ad_delay_interval_day".equals(str)) {
                arrayMap.put(str, Integer.valueOf(mo137448a()));
            } else if ("reason_list".equals(str)) {
                arrayMap.put(str, mo137456i());
            } else if ("expand_title".equals(str)) {
                arrayMap.put(str, mo137454g());
            } else if ("special_prompt".equals(str)) {
                arrayMap.put(str, mo137457j());
            } else if ("is_special".equals(str)) {
                SnsMethodCalculate.markStartTimeMs("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                ADInfo b = mo137449b();
                if (b != null) {
                    z = b.forbidClick;
                    SnsMethodCalculate.markEndTimeMs("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                } else {
                    z = false;
                    SnsMethodCalculate.markEndTimeMs("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                }
                arrayMap.put(str, Boolean.valueOf(z));
            } else if ("unlike_tag".equals(str)) {
                C102244f fVar = this.f287800a;
                if (fVar != null) {
                    arrayMap.put(str, fVar);
                }
            } else if ("complaint_content".equals(str)) {
                SnsMethodCalculate.markStartTimeMs("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                ADXml c = mo137450c();
                String str2 = "";
                if (c == null) {
                    SnsMethodCalculate.markEndTimeMs("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                } else if (!TextUtils.isEmpty(c.feedbackWording)) {
                    str2 = c.feedbackWording;
                    SnsMethodCalculate.markEndTimeMs("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                } else {
                    SnsMethodCalculate.markEndTimeMs("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                }
                arrayMap.put(str, str2);
            }
        } catch (Throwable unused) {
            Log.m105928w("FeedbackDataSupplier", "there is something wrong in getData. the key is " + str);
        }
        SnsMethodCalculate.markEndTimeMs("getData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return arrayMap;
    }

    /* renamed from: g */
    public final String mo137454g() {
        SnsMethodCalculate.markStartTimeMs("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        ADXml c = mo137450c();
        if (c == null) {
            Log.m105928w("FeedbackDataSupplier", "the ad xml is null in data");
            SnsMethodCalculate.markEndTimeMs("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return "";
        } else if ("zh_CN".equals(this.f287803d)) {
            String str = c.expandInsideTitle_cn;
            SnsMethodCalculate.markEndTimeMs("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return str;
        } else if ("zh_TW".equals(this.f287803d) || "zh_HK".equals(this.f287803d)) {
            String str2 = c.expandInsideTitle_tw;
            SnsMethodCalculate.markEndTimeMs("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return str2;
        } else {
            String str3 = c.expandInsideTitle_en;
            SnsMethodCalculate.markEndTimeMs("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return str3;
        }
    }

    /* renamed from: h */
    public C94877g0 mo137455h(int i) {
        SnsMethodCalculate.markStartTimeMs("getNetSceneSnsObjectOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        SnsInfo snsInfo = this.f287801b;
        C102244f fVar = this.f287800a;
        if (snsInfo == null || fVar == null) {
            SnsMethodCalculate.markEndTimeMs("getNetSceneSnsObjectOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
        ADInfo.C95010c.C95011a aVar = new ADInfo.C95010c.C95011a();
        aVar.f275659e = 1;
        if (i == 0) {
            aVar.f275660f.add(101);
        } else {
            aVar.f275660f.add(0);
        }
        aVar.f275661g = fVar.f301111e;
        if (i == 0) {
            aVar.f275662h = 0;
        } else {
            aVar.f275662h = System.currentTimeMillis();
        }
        C94877g0 g0Var = new C94877g0(snsInfo.field_snsId, 8, (Object) aVar);
        SnsMethodCalculate.markEndTimeMs("getNetSceneSnsObjectOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return g0Var;
    }

    /* renamed from: i */
    public final List<C98497c> mo137456i() {
        ADInfo.C95010c cVar;
        String str;
        SnsMethodCalculate.markStartTimeMs("getReasons", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        ArrayList arrayList = new ArrayList();
        ADInfo b = mo137449b();
        if (!(b == null || (cVar = b.adUnlikeInfo) == null)) {
            List<ADInfo.C95010c.C95011a> a = cVar.mo131416a();
            if (C101425k.m133100d(a)) {
                for (ADInfo.C95010c.C95011a next : a) {
                    int i = next.f275658d;
                    if (i != 10006) {
                        SnsMethodCalculate.markStartTimeMs("getLocalReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                        if ("zh_CN".equals(this.f287803d)) {
                            str = next.f275655a;
                            SnsMethodCalculate.markEndTimeMs("getLocalReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                        } else if ("zh_HK".equals(this.f287803d) || "zh_TW".equals(this.f287803d)) {
                            str = next.f275656b;
                            SnsMethodCalculate.markEndTimeMs("getLocalReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                        } else {
                            str = next.f275657c;
                            SnsMethodCalculate.markEndTimeMs("getLocalReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                        }
                        arrayList.add(new C98497c(i, str));
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("getReasons", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return arrayList;
    }

    /* renamed from: j */
    public final String mo137457j() {
        SnsMethodCalculate.markStartTimeMs("getSpecialData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        ADInfo b = mo137449b();
        String str = (b == null || b.adUnlikeInfo == null) ? "" : "zh_CN".equals(this.f287803d) ? b.adUnlikeInfo.f275652d : ("zh_HK".equals(this.f287803d) || "zh_TW".equals(this.f287803d)) ? b.adUnlikeInfo.f275653e : b.adUnlikeInfo.f275654f;
        if (TextUtils.isEmpty(str)) {
            str = mo137454g();
        }
        SnsMethodCalculate.markEndTimeMs("getSpecialData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0142, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r3.f287833b) == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008d, code lost:
        if (z04.C112550d0.m153801u(r11, r12, false) != false) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013c  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gq2.C98171c.C98173b mo137458k() {
        /*
            r15 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            java.lang.String r1 = "getUIModel"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            gq2.c$b r3 = new gq2.c$b
            r3.<init>()
            com.tencent.mm.plugin.sns.storage.ADInfo r4 = r15.mo137449b()
            java.lang.String r5 = "getOpenPersonalizedUrl"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r7 = 0
            r8 = 1
            r9 = 0
            if (r4 != 0) goto L_0x0023
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            goto L_0x00d7
        L_0x0023:
            f40.e r10 = f40.C86709a0.m107523b()
            f40.e$c r10 = r10.mo121109d()
            f40.e$c r11 = f40.C86718e.C7980c.WeiXin
            if (r10 != r11) goto L_0x003e
            di3.d r10 = di3.C86312j.m106911c(r0)
            h81.h r10 = (h81.C32735h) r10
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_cn_admanage_url_android
            java.lang.String r12 = "https://ads.privacy.qq.com/ads/wxoptout.html?media_source=101001"
            java.lang.String r10 = r10.Y60(r11, r12)
            goto L_0x0090
        L_0x003e:
            di3.d r10 = di3.C86312j.m106911c(r0)
            h81.h r10 = (h81.C32735h) r10
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_oversea_admanage_url_android
            java.lang.String r12 = ""
            java.lang.String r10 = r10.Y60(r11, r12)
            di3.d r11 = di3.C86312j.m106911c(r0)
            h81.h r11 = (h81.C32735h) r11
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_oversea_admanage_close_country_android
            java.lang.String r11 = r11.Y60(r13, r12)
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            r14 = 274436(0x43004, float:3.84567E-40)
            java.lang.String r12 = r13.mo119674H(r14, r12)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r13 != 0) goto L_0x008f
            java.lang.String r13 = "adMgrCloseCountry"
            gy3.C87412m.m108593f(r11, r13)
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r13 = "this as java.lang.String).toLowerCase()"
            gy3.C87412m.m108593f(r11, r13)
            java.lang.String r14 = "regCountry"
            gy3.C87412m.m108593f(r12, r14)
            java.lang.String r12 = r12.toLowerCase()
            gy3.C87412m.m108593f(r12, r13)
            boolean r11 = z04.C112550d0.m153801u(r11, r12, r9)
            if (r11 == 0) goto L_0x0090
        L_0x008f:
            r10 = r7
        L_0x0090:
            if (r10 == 0) goto L_0x009b
            int r11 = r10.length()
            if (r11 != 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r11 = 0
            goto L_0x009c
        L_0x009b:
            r11 = 1
        L_0x009c:
            if (r11 != 0) goto L_0x00a9
            r11 = 2
            java.lang.String r12 = "http"
            boolean r11 = z04.C112551y.m153820t(r10, r12, r9, r11, r7)
            if (r11 != 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r7 = r10
        L_0x00a9:
            if (r7 == 0) goto L_0x00b8
            int r10 = r7.length()
            if (r10 <= 0) goto L_0x00b3
            r10 = 1
            goto L_0x00b4
        L_0x00b3:
            r10 = 0
        L_0x00b4:
            if (r10 != r8) goto L_0x00b8
            r10 = 1
            goto L_0x00b9
        L_0x00b8:
            r10 = 0
        L_0x00b9:
            if (r10 == 0) goto L_0x00d4
            java.lang.String r4 = r4.uxInfo
            java.lang.String r10 = "UTF-8"
            java.lang.String r4 = java.net.URLEncoder.encode(r4, r10)
            java.lang.String r10 = "from"
            java.lang.String r11 = "sns"
            java.lang.String r7 = vr2.C102236a0.m134738d(r7, r10, r11)
            java.lang.String r10 = "uxinfo"
            java.lang.String r4 = vr2.C102236a0.m134738d(r7, r10, r4)
            r7 = r4
        L_0x00d4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
        L_0x00d7:
            r3.f287833b = r7
            java.lang.String r4 = "isPersonalizedAdClose"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            com.tencent.mm.plugin.sns.storage.ADInfo r5 = r15.mo137449b()     // Catch:{ all -> 0x00eb }
            if (r5 == 0) goto L_0x00eb
            boolean r5 = r5.isPersonalizedAdClose     // Catch:{ all -> 0x00eb }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            goto L_0x00ef
        L_0x00eb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            r5 = 0
        L_0x00ef:
            if (r5 == 0) goto L_0x0145
            java.lang.String r4 = "FeedbackDataSupplier"
            java.lang.String r5 = "enableOpenPersonalizedAd"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r2)
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x011b }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ all -> 0x011b }
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_sns_ad_enable_open_personalize_in_feedback_android     // Catch:{ all -> 0x011b }
            int r0 = r0.mo58779Qe(r6, r9)     // Catch:{ all -> 0x011b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r6.<init>()     // Catch:{ all -> 0x0119 }
            java.lang.String r7 = "enableOpenPersonalizedAd called"
            r6.append(r7)     // Catch:{ all -> 0x0119 }
            r6.append(r0)     // Catch:{ all -> 0x0119 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0119 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)     // Catch:{ all -> 0x0119 }
            goto L_0x0132
        L_0x0119:
            r6 = move-exception
            goto L_0x011e
        L_0x011b:
            r0 = move-exception
            r6 = r0
            r0 = 0
        L_0x011e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "enableOpenPersonalizedAd, exp="
            r7.append(r10)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r6)
        L_0x0132:
            if (r0 <= 0) goto L_0x0136
            r0 = 1
            goto L_0x0137
        L_0x0136:
            r0 = 0
        L_0x0137:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = r3.f287833b
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r8 = 0
        L_0x0146:
            r3.f287832a = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gq2.C98169a.mo137458k():gq2.c$b");
    }

    /* renamed from: l */
    public void mo137459l(C102244f fVar, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("updateData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        try {
            this.f287800a = fVar;
            if (snsInfo != null) {
                this.f287801b = snsInfo;
            } else if (fVar != null) {
                this.f287801b = C94866e1.Yx0().mo139798DN(fVar.f301109c);
            }
            this.f287803d = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        } catch (Throwable unused) {
            Log.m105928w("FeedbackDataSupplier", "there is something wrong in updateData");
        }
        SnsMethodCalculate.markEndTimeMs("updateData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
    }
}
