package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import c30.C104289g;
import c30.C26827e;
import c30.C79923f;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.autogen.events.MusicActionEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCardActionReportStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94851d1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di0.C86299o;
import di3.C86312j;
import eb0.C75592q0;
import ee1.C31570b;
import gy3.C87412m;
import ht1.C60166f;
import ht1.C60188n4;
import ht1.C60192p2;
import ht1.C60200t1;
import ht1.C98522w3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.UUID;
import ke3.C88144b;
import kr0.C76630x0;
import ks3.C10412u;
import ks3.C61160f;
import ks3.C61164r;
import l31.C61212e;
import ls3.C10649f;
import ls3.C61397g;
import lt1.C61401a;
import lt1.C61402b;
import nj3.C76879j;
import o40.C61926c;
import org.json.JSONArray;
import oz1.C77050b;
import p1081gi.C98121d;
import p182kk.C61104a;
import p185kq.C61130g;
import p204mr.C34648o;
import p214om.C11502f;
import p217oq.C62120e;
import p244tt.C14088e;
import p565ir.C60606n;
import p640ox.C77049b;
import p652pu.C100910b;
import qc0.C101093a;
import qc0.C101104g;
import qc0.C101106m;
import qc0.C62602o;
import qo3.C89779i0;
import t91.C64208c;
import te3.C101789j00;
import te3.C101796jo2;
import te3.C101804kv2;
import te3.C101815ms1;
import te3.C101833r5;
import te3.C64238ap2;
import te3.C64258bf0;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64311db1;
import te3.C64378fw2;
import te3.C64581nk1;
import te3.C64609ok1;
import te3.C64623p81;
import te3.C64682rk1;
import te3.C64700s53;
import te3.C64711sk1;
import te3.C64719t23;
import te3.C64793w23;
import te3.C64855yf1;
import te3.d05;
import te3.m74;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8 */
public class C96085n8 {

    /* renamed from: A */
    public static long f280579A;

    /* renamed from: B */
    public static View.OnClickListener f280580B = new n8$$y();

    /* renamed from: y */
    public static int f280581y;

    /* renamed from: z */
    public static C94851d1 f280582z;

    /* renamed from: a */
    public n8$$g0 f280583a;

    /* renamed from: b */
    public Context f280584b;

    /* renamed from: c */
    public C89779i0 f280585c;

    /* renamed from: d */
    public View.OnClickListener f280586d = new n8$$z(this);

    /* renamed from: e */
    public View.OnClickListener f280587e = new n8$$a0(this);

    /* renamed from: f */
    public View.OnClickListener f280588f = new n8$$b0(this);

    /* renamed from: g */
    public View.OnClickListener f280589g = new n8$$c0(this);

    /* renamed from: h */
    public View.OnClickListener f280590h = new n8$$d0(this);

    /* renamed from: i */
    public View.OnClickListener f280591i = new n8$$e0(this);

    /* renamed from: j */
    public View.OnClickListener f280592j = new n8$$f0(this);

    /* renamed from: k */
    public View.OnClickListener f280593k;

    /* renamed from: l */
    public View.OnClickListener f280594l;

    /* renamed from: m */
    public View.OnClickListener f280595m;

    /* renamed from: n */
    public View.OnClickListener f280596n;

    /* renamed from: o */
    public View.OnClickListener f280597o;

    /* renamed from: p */
    public View.OnClickListener f280598p;

    /* renamed from: q */
    public View.OnClickListener f280599q;

    /* renamed from: r */
    public View.OnClickListener f280600r;

    /* renamed from: s */
    public View.OnClickListener f280601s;

    /* renamed from: t */
    public View.OnClickListener f280602t;

    /* renamed from: u */
    public View.OnClickListener f280603u;

    /* renamed from: v */
    public View.OnClickListener f280604v;

    /* renamed from: w */
    public View.OnClickListener f280605w;

    /* renamed from: x */
    public View.OnClickListener f280606x;

    public C96085n8(Context context, n8$$g0 n8__g0, int i, C94851d1 d1Var) {
        new n8$$e(this);
        this.f280593k = new n8$$f(this);
        this.f280594l = new n8$$g(this);
        this.f280595m = new n8$$c();
        this.f280596n = new n8$$h(this);
        this.f280597o = new n8$$i(this);
        this.f280598p = new n8$$j(this);
        this.f280599q = new n8$$k(this);
        this.f280600r = new n8$$l(this);
        this.f280601s = new n8$$m(this);
        new n8$$o(this);
        this.f280602t = new n8$$p(this);
        this.f280603u = new n8$$q(this);
        this.f280604v = new n8$$r(this);
        this.f280605w = new n8$$s(this);
        this.f280606x = new n8$$v(this);
        this.f280584b = context;
        this.f280583a = n8__g0;
        f280581y = i;
        f280582z = d1Var;
    }

    /* renamed from: A */
    public static void m123082A(Context context, C95787g0 g0Var, C94851d1 d1Var) {
        SnsMethodCalculate.markStartTimeMs("mallClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        if (timeLineObject.ContentObj.f298427h.size() > 0) {
            SnsInfo DN = C94866e1.Yx0().mo139798DN(g0Var.f279451b);
            if (m123089H(d1Var)) {
                d1Var.mo130970a().mo131335v(DN);
            }
            String str = timeLineObject.ContentObj.f298427h.get(0).f298703u;
            Intent intent = new Intent();
            intent.putExtra("key_product_scene", 2);
            intent.putExtra("key_product_info", str);
            C88144b.m109791i(context, "product", ".ui.MallProductUI", intent, (Bundle) null);
        }
        m123087F(g0Var);
        SnsMethodCalculate.markEndTimeMs("mallClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: B */
    public static void m123083B(Context context, C95787g0 g0Var) {
        Class cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("musicTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        m123092K(g0Var);
        if (timeLineObject.ContentObj.f298442z == null) {
            SnsMethodCalculate.markEndTimeMs("musicTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("key_topic_title", timeLineObject.ContentObj.f298442z.f185603d);
        intent.putExtra("key_topic_type", timeLineObject.ContentObj.f298442z.f185604e);
        C64311db1 db12 = new C64311db1();
        C64609ok1 ok12 = timeLineObject.ContentObj.f298442z.f185607h;
        if (ok12 != null) {
            db12.f182666i = ok12.f184668d;
            db12.f182661d = ok12.f184669e;
            db12.f182662e = ok12.f184670f;
        }
        try {
            intent.putExtra("key_topic_poi_location", db12.toByteArray());
        } catch (IOException unused) {
            Log.m105920e("MicroMsg.TimeLineClickEvent", "location toByteArray exception");
        }
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_from_user", timeLineObject.UserName);
        intent.putExtra("key_report_scene", 3);
        intent.putExtra("KEY_TAB_TYPE", 5);
        C64258bf0 bf02 = timeLineObject.ContentObj.f298442z.f185609j;
        if (bf02 != null) {
            intent.putExtra("key_activity_id", C61926c.m72671P(bf02.f182280d));
        }
        intent.putExtra("key_activity_name", timeLineObject.ContentObj.f298442z.f185603d);
        intent.putExtra("key_cover_url", timeLineObject.ContentObj.f298442z.f185605f);
        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 2, 138, intent);
        intent.putExtra("key_entrance_type", 0);
        ((C60200t1) C86312j.m106911c(cls)).mo76832aO(context, intent);
        SnsMethodCalculate.markEndTimeMs("musicTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: C */
    public static void m123084C(Context context, C95787g0 g0Var) {
        SnsMethodCalculate.markStartTimeMs("noteLinkClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        C101789j00 j002 = timeLineObject.ContentObj;
        if (j002.f298424e == 26) {
            if (Util.isNullOrNil(j002.f298429j)) {
                SnsMethodCalculate.markEndTimeMs("noteLinkClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            }
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
            aVar.f264835a = 37;
            C101789j00 j003 = g0Var.f279450a.ContentObj;
            aVar.f264837c = j003.f298429j;
            LinkedList<C101804kv2> linkedList = j003.f298427h;
            String str = "";
            if (linkedList != null && linkedList.size() >= 1) {
                String e = C94938q1.m120518e(C94866e1.m120262YO(), g0Var.f279450a.ContentObj.f298427h.get(0).f298689d);
                String X = C102236a0.m134729X(g0Var.f279450a.ContentObj.f298427h.get(0));
                if (C86013q1.m106450k(e + X)) {
                    str = e + X;
                }
            }
            FavoriteOperationEvent.C92515a aVar2 = favoriteOperationEvent.f264833d;
            aVar2.f264849o = str;
            aVar2.f264836b = g0Var.f279451b;
            aVar2.f264842h = context;
            favoriteOperationEvent.publish();
        }
        m123088G(timeLineObject.UserName, g0Var.f279451b, g0Var.f279453d);
        SnsMethodCalculate.markEndTimeMs("noteLinkClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: D */
    public static void m123085D(Context context, C95787g0 g0Var) {
        Class cls = C98522w3.class;
        SnsMethodCalculate.markStartTimeMs("poiPageClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        m123092K(g0Var);
        if (timeLineObject.ContentObj.f298440x != null) {
            Intent intent = new Intent();
            m74 m74 = new m74();
            C64711sk1 sk12 = timeLineObject.ContentObj.f298440x;
            m74.f184224i = sk12.f185428j;
            m74.f184219d = Util.safeParseFloat(sk12.f185423e);
            m74.f184220e = Util.safeParseFloat(timeLineObject.ContentObj.f298440x.f185422d);
            C64711sk1 sk13 = timeLineObject.ContentObj.f298440x;
            m74.f184222g = sk13.f185424f;
            m74.f184226n = sk13.f185427i;
            m74.f184223h = sk13.f185426h;
            m74.f184227o = Util.safeParseInt(sk13.f185425g);
            m74.f184225j = Util.safeParseInt(timeLineObject.ContentObj.f298440x.f185429n);
            C115669n.INSTANCE.mo175912v(((C98522w3) C86312j.m106911c(cls)).mo3991CD(), 1);
            ((C98522w3) C86312j.m106911c(cls)).mo3994aU(context, m74, C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS, 7, timeLineObject.f283893Id, new n8$$n(m74, intent, context, timeLineObject));
            SnsMethodCalculate.markEndTimeMs("poiPageClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("poiPageClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: E */
    public static void m123086E(C95787g0 g0Var, Context context, C94851d1 d1Var) {
        SnsMethodCalculate.markStartTimeMs("productClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        if (timeLineObject.ContentObj.f298427h.size() > 0) {
            SnsInfo DN = C94866e1.Yx0().mo139798DN(g0Var.f279451b);
            if (m123089H(d1Var)) {
                d1Var.mo130970a().mo131335v(DN);
            }
            String str = timeLineObject.ContentObj.f298427h.get(0).f298703u;
            Intent intent = new Intent();
            intent.putExtra("key_Product_xml", str);
            intent.putExtra("key_ProductUI_getProductInfoScene", 2);
            C88144b.m109791i(context, "scanner", ".ui.ProductUI", intent, (Bundle) null);
        }
        int i = g0Var.f279453d;
        m123088G(timeLineObject.UserName, g0Var.f279451b, i);
        SnsMethodCalculate.markEndTimeMs("productClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: F */
    public static void m123087F(C95787g0 g0Var) {
        SnsMethodCalculate.markStartTimeMs("publicClickEvent", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        m123088G(timeLineObject.UserName, g0Var.f279451b, g0Var.f279453d);
        SnsMethodCalculate.markEndTimeMs("publicClickEvent", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: G */
    public static void m123088G(String str, String str2, int i) {
        SnsMethodCalculate.markStartTimeMs("publicClickEvent", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        C94866e1.my0().post(new n8$$b(i, str2, str));
        SnsMethodCalculate.markEndTimeMs("publicClickEvent", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: H */
    public static boolean m123089H(C94851d1 d1Var) {
        SnsMethodCalculate.markStartTimeMs("reportCheck", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        boolean z = (d1Var == null || d1Var.mo130970a() == null) ? false : true;
        SnsMethodCalculate.markEndTimeMs("reportCheck", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        return z;
    }

    /* renamed from: I */
    public static void m123090I(Context context, C95787g0 g0Var, C94851d1 d1Var) {
        SnsMethodCalculate.markStartTimeMs("singlePageClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        SnsInfo DN = C94866e1.Yx0().mo139798DN(g0Var.f279451b);
        if (m123089H(d1Var)) {
            d1Var.mo130970a().mo131335v(DN);
        }
        if (timeLineObject.weappInfo == null) {
            Log.m105920e("MicroMsg.TimeLineClickEvent", "appbrandSingePageListener weappInfo is null");
            SnsMethodCalculate.markEndTimeMs("singlePageClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f239396d = 6;
        appBrandLaunchReferrer.f239400h = timeLineObject.weappInfo.f298076j;
        Log.m105919d("MicroMsg.TimeLineClickEvent", "launch weapp, extraData: %s", appBrandLaunchReferrer.f239399g);
        C86299o oVar = new C86299o();
        d05 d05 = timeLineObject.weappInfo;
        oVar.f250929a = d05.f298070d;
        oVar.f250934f = d05.f298071e;
        oVar.f250931c = d05.f298073g;
        oVar.f250932d = d05.f298072f;
        String str = timeLineObject.ContentObj.f298425f;
        oVar.f250949u = 1;
        oVar.f250939k = 1154;
        oVar.f250940l = timeLineObject.weappInfo.f298074h + XVFSFile.PATH_SEPARATOR + timeLineObject.UserName;
        oVar.f250947s = appBrandLaunchReferrer;
        if (timeLineObject.weappInfo.f298078o != null) {
            try {
                C26827e eVar = new C26827e(timeLineObject.weappInfo.f298078o);
                oVar.f250954z = new ArrayList();
                for (int i = 0; i < eVar.length(); i++) {
                    oVar.f250954z.add(eVar.getString(i));
                }
            } catch (C79923f unused) {
            }
        }
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
        m123087F(g0Var);
        SnsMethodCalculate.markEndTimeMs("singlePageClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0671  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x067c  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x06c2  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0711  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0713  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0723  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x073a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ba  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m123091J(android.content.Context r42, com.tencent.p014mm.plugin.sns.p106ui.C95787g0 r43, android.view.View r44, com.tencent.p014mm.plugin.sns.model.C94851d1 r45, int r46) {
        /*
            r9 = r42
            r1 = r43
            r2 = r44
            r3 = r46
            java.lang.Class<om.f> r10 = p214om.C11502f.class
            java.lang.Class<com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI> r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.class
            java.lang.Class<ex0.d> r5 = ex0.C45696d.class
            java.lang.String r13 = "urlCommonClick"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            com.tencent.mm.protocal.protobuf.TimeLineObject r15 = r1.f279450a
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r6 = r1.f279451b
            com.tencent.mm.plugin.sns.storage.SnsInfo r12 = r0.mo139798DN(r6)
            java.lang.String r0 = r15.canvasInfo
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r6 = "adxml"
            java.lang.String r8 = "MicroMsg.TimeLineClickEvent"
            java.lang.String r7 = ""
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = r15.canvasInfo
            boolean r0 = ps2.C100894u.m132239s(r0)
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = r15.canvasInfo
            java.lang.String r11 = ".adxml.adActionLink"
            r17 = r10
            java.lang.String r10 = "getXmlValueByTag"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r14)
            boolean r18 = android.text.TextUtils.isEmpty(r0)
            if (r18 != 0) goto L_0x0084
            boolean r18 = android.text.TextUtils.isEmpty(r6)
            if (r18 != 0) goto L_0x0084
            boolean r18 = android.text.TextUtils.isEmpty(r11)
            if (r18 == 0) goto L_0x0056
            goto L_0x0084
        L_0x0056:
            r18 = r13
            r13 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r6, r13)     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0067 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r14)
            goto L_0x008a
        L_0x0067:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "getXmlValueByTag exp="
            r11.append(r13)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r14)
            goto L_0x0089
        L_0x0084:
            r18 = r13
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r14)
        L_0x0089:
            r0 = r7
        L_0x008a:
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 != 0) goto L_0x009d
            te3.r5 r10 = r15.AppInfo
            java.lang.String r10 = r10.f299236d
            java.lang.String r0 = m123114v(r9, r0, r10)
            goto L_0x009e
        L_0x0099:
            r17 = r10
            r18 = r13
        L_0x009d:
            r0 = 0
        L_0x009e:
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 == 0) goto L_0x00b0
            te3.j00 r0 = r15.ContentObj
            java.lang.String r0 = r0.f298426g
            te3.r5 r10 = r15.AppInfo
            java.lang.String r10 = r10.f299236d
            java.lang.String r0 = m123114v(r9, r0, r10)
        L_0x00b0:
            if (r0 == 0) goto L_0x073a
            int r10 = r0.length()
            if (r10 != 0) goto L_0x00ba
            goto L_0x073a
        L_0x00ba:
            int r10 = r45.getScene()
            k40.a r11 = f40.C86709a0.m107533q(r5)
            ex0.d r11 = (ex0.C45696d) r11
            boolean r11 = r11.mo70989eQ(r0)
            if (r11 == 0) goto L_0x00e1
            long r19 = java.lang.System.currentTimeMillis()
            r21 = 1000(0x3e8, double:4.94E-321)
            r23 = r14
            long r13 = r19 / r21
            int r11 = (int) r13
            k40.a r13 = f40.C86709a0.m107533q(r5)
            ex0.d r13 = (ex0.C45696d) r13
            r14 = 2
            java.lang.String r0 = r13.mo70959F2(r0, r14, r10, r11)
            goto L_0x00e3
        L_0x00e1:
            r23 = r14
        L_0x00e3:
            r11 = r0
            android.content.Intent r13 = new android.content.Intent
            r13.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r14 = r15.f283893Id
            r19 = r10
            java.lang.String r10 = "KSnsStrId"
            r0.putString(r10, r14)
            java.lang.String r10 = r1.f279451b
            java.lang.String r14 = "KSnsLocalId"
            r0.putString(r14, r10)
            java.lang.String r10 = "KFromTimeline"
            r14 = 1
            r0.putBoolean(r10, r14)
            te3.j00 r10 = r15.ContentObj
            r14 = 0
            if (r10 == 0) goto L_0x014d
            java.util.LinkedList<te3.kv2> r10 = r10.f298427h
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x014d
            te3.j00 r10 = r15.ContentObj
            java.util.LinkedList<te3.kv2> r10 = r10.f298427h
            java.lang.Object r10 = r10.get(r14)
            te3.kv2 r10 = (te3.C101804kv2) r10
            java.lang.String r10 = r10.f298694i
            java.lang.String r14 = "K_sns_thumb_url"
            r0.putString(r14, r10)
            te3.j00 r10 = r15.ContentObj
            java.lang.String r10 = r10.f298426g
            java.lang.String r14 = "K_sns_raw_url"
            r0.putString(r14, r10)
            r10 = 2
            java.lang.Object[] r14 = new java.lang.Object[r10]
            te3.j00 r10 = r15.ContentObj
            java.util.LinkedList<te3.kv2> r10 = r10.f298427h
            r22 = r5
            r5 = 0
            java.lang.Object r10 = r10.get(r5)
            te3.kv2 r10 = (te3.C101804kv2) r10
            java.lang.String r10 = r10.f298694i
            r14[r5] = r10
            te3.j00 r5 = r15.ContentObj
            java.lang.String r5 = r5.f298426g
            r10 = 1
            r14[r10] = r5
            java.lang.String r5 = "put the thumb url %s redirectUrl %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r14)
            goto L_0x014f
        L_0x014d:
            r22 = r5
        L_0x014f:
            java.lang.String r5 = r15.statExtStr
            java.lang.String r10 = "key_snsad_statextstr"
            r0.putString(r10, r5)
            java.lang.String r5 = "rawUrl"
            r13.putExtra(r5, r11)
            java.lang.String r5 = "shortUrl"
            r13.putExtra(r5, r11)
            java.lang.String r5 = "useJs"
            r10 = 1
            r13.putExtra(r5, r10)
            r5 = -255(0xffffffffffffff01, float:NaN)
            java.lang.String r10 = "type"
            r13.putExtra(r10, r5)
            java.lang.String r5 = r15.publicUserName
            if (r5 == 0) goto L_0x01a5
            java.lang.String r10 = "srcUsername"
            r13.putExtra(r10, r5)
            java.lang.String r5 = r15.sourceNickName
            java.lang.String r10 = "srcDisplayname"
            r13.putExtra(r10, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "urlRedirectListener tlObj.sourceNickName: "
            r5.append(r10)
            java.lang.String r10 = r15.sourceNickName
            r5.append(r10)
            java.lang.String r10 = " tlObj.publicUserName: "
            r5.append(r10)
            java.lang.String r10 = r15.publicUserName
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
        L_0x01a5:
            java.lang.String r1 = r1.f279451b
            java.lang.String r5 = "sns_local_id"
            r13.putExtra(r5, r1)
            if (r12 == 0) goto L_0x0247
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "sns_"
            r1.append(r5)
            r10 = r8
            long r8 = r12.field_snsId
            java.lang.String r8 = vr2.C102236a0.m134765q0(r8)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            java.lang.String r8 = "KPublisherId"
            r13.putExtra(r8, r1)
            java.lang.String r1 = r12.field_userName
            java.lang.String r8 = "pre_username"
            r13.putExtra(r8, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            long r8 = r12.field_snsId
            java.lang.String r5 = vr2.C102236a0.m134765q0(r8)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "prePublishId"
            r13.putExtra(r5, r1)
            java.lang.String r1 = r12.field_userName
            java.lang.String r5 = "preUsername"
            r13.putExtra(r5, r1)
            java.lang.String r1 = "share_report_pre_msg_url"
            r13.putExtra(r1, r11)
            te3.j00 r1 = r15.ContentObj
            java.lang.String r1 = r1.f298425f
            java.lang.String r5 = "share_report_pre_msg_title"
            r13.putExtra(r5, r1)
            te3.j00 r1 = r15.ContentObj
            java.lang.String r1 = r1.f298423d
            java.lang.String r5 = "share_report_pre_msg_desc"
            r13.putExtra(r5, r1)
            te3.j00 r1 = r15.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            if (r1 == 0) goto L_0x0239
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0239
            te3.j00 r1 = r15.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            r5 = 0
            java.lang.Object r1 = r1.get(r5)
            te3.kv2 r1 = (te3.C101804kv2) r1
            java.lang.String r5 = r1.f298694i
            java.lang.String r8 = "share_report_pre_msg_icon_url"
            r13.putExtra(r8, r5)
            java.lang.String r1 = r1.f298694i
            java.lang.String r5 = "thumbUrl"
            r13.putExtra(r5, r1)
        L_0x0239:
            java.lang.String r1 = "share_report_pre_msg_appid"
            r13.putExtra(r1, r7)
            java.lang.String r1 = "share_report_from_scene"
            r5 = 1
            r13.putExtra(r1, r5)
            goto L_0x0248
        L_0x0247:
            r10 = r8
        L_0x0248:
            te3.r5 r1 = r15.AppInfo
            if (r1 == 0) goto L_0x0253
            java.lang.String r1 = r1.f299236d
            java.lang.String r5 = "KAppId"
            r13.putExtra(r5, r1)
        L_0x0253:
            if (r12 == 0) goto L_0x0270
            boolean r1 = r12.isAd()
            if (r1 == 0) goto L_0x0270
            r1 = 2
            if (r3 != r1) goto L_0x0263
            com.tencent.mm.plugin.sns.storage.ADInfo r1 = r12.getAtAdInfo()
            goto L_0x0267
        L_0x0263:
            com.tencent.mm.plugin.sns.storage.ADInfo r1 = r12.getAdInfo()
        L_0x0267:
            if (r1 == 0) goto L_0x0270
            java.lang.String r1 = r1.viewId
            java.lang.String r5 = "KsnsViewId"
            r13.putExtra(r5, r1)
        L_0x0270:
            if (r12 == 0) goto L_0x02b0
            r1 = 718(0x2ce, float:1.006E-42)
            if (r3 != 0) goto L_0x027a
            ad0.C91998s.m115550d(r1)
            goto L_0x027d
        L_0x027a:
            ad0.C91998s.m115549c(r1)
        L_0x027d:
            vr2.C102236a0.m134728W(r12)
            r12.isAd()
            r12.getUxinfo()
            te3.j00 r1 = r15.ContentObj
            java.lang.String r1 = r1.f298426g
            r1 = 743(0x2e7, float:1.041E-42)
            if (r3 != 0) goto L_0x0293
            ad0.s r1 = ad0.C91998s.m115550d(r1)
            goto L_0x0297
        L_0x0293:
            ad0.s r1 = ad0.C91998s.m115549c(r1)
        L_0x0297:
            vr2.C102236a0.m134728W(r12)
            r12.isAd()
            r12.getUxinfo()
            te3.j00 r5 = r15.ContentObj
            java.lang.String r5 = r5.f298426g
            byte[] r1 = r1.mo125841e()
            if (r1 != 0) goto L_0x02ab
            goto L_0x02b0
        L_0x02ab:
            java.lang.String r5 = "intent_key_StatisticsOplog"
            r0.putByteArray(r5, r1)
        L_0x02b0:
            java.lang.String r1 = "jsapiargs"
            r13.putExtra(r1, r0)
            java.lang.String r0 = "getA8KeyScene"
            r14 = r23
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r14)
            if (r3 != 0) goto L_0x02c4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r14)
            r1 = 2
            goto L_0x02c9
        L_0x02c4:
            r1 = 45
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r14)
        L_0x02c9:
            java.lang.String r0 = "geta8key_scene"
            r13.putExtra(r0, r1)
            java.lang.String r0 = r15.UserName
            java.lang.String r1 = "geta8key_username"
            r13.putExtra(r1, r0)
            java.lang.String r0 = "KMsgType"
            r1 = 2
            r13.putExtra(r0, r1)
            java.lang.String r0 = "from_scence"
            r9 = 3
            r13.putExtra(r0, r9)
            te3.j00 r0 = r15.ContentObj
            te3.st2 r0 = r0.f298430n
            r1 = -1
            if (r0 == 0) goto L_0x02f1
            int r0 = r0.f299443d
            if (r0 == r1) goto L_0x02f1
            java.lang.String r5 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122318j
            r13.putExtra(r5, r0)
        L_0x02f1:
            r5 = 1
            if (r3 == r5) goto L_0x02fa
            r5 = 2
            if (r3 != r5) goto L_0x02f8
            goto L_0x02fa
        L_0x02f8:
            r5 = 0
            goto L_0x02fb
        L_0x02fa:
            r5 = 1
        L_0x02fb:
            java.lang.String r0 = r15.canvasInfo
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0394
            if (r5 != 0) goto L_0x0394
            if (r12 == 0) goto L_0x0394
            java.lang.String r1 = "MicroMsg.SnsStatExtUtil"
            java.lang.String r8 = "reportAdShareClickForTimeLine"
            java.lang.String r9 = "com.tencent.mm.modelstat.SnsStatExtUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r12.getTimeLine()     // Catch:{ all -> 0x0369 }
            java.lang.String r0 = r0.statExtStr     // Catch:{ all -> 0x0369 }
            te3.bb4 r0 = com.tencent.p014mm.modelstat.C92859v.m117130h(r0)     // Catch:{ all -> 0x0369 }
            if (r0 == 0) goto L_0x0357
            r24 = r11
            te3.cb4 r11 = r0.f226992d     // Catch:{ all -> 0x0355 }
            if (r11 != 0) goto L_0x0324
            goto L_0x0359
        L_0x0324:
            com.tencent.mm.protocal.protobuf.TimeLineObject r11 = r12.getTimeLine()     // Catch:{ all -> 0x0331 }
            java.lang.String r11 = r11.canvasInfo     // Catch:{ all -> 0x0331 }
            int r11 = com.tencent.p014mm.modelstat.C92859v.m117126d(r11)     // Catch:{ all -> 0x0331 }
            r25 = r13
            goto L_0x0334
        L_0x0331:
            r25 = r13
            r11 = 0
        L_0x0334:
            po2.f r13 = new po2.f     // Catch:{ all -> 0x0351 }
            r13.<init>()     // Catch:{ all -> 0x0351 }
            te3.cb4 r0 = r0.f226992d     // Catch:{ all -> 0x0351 }
            r26 = r14
            java.lang.String r14 = r0.f298023e     // Catch:{ all -> 0x0367 }
            r13.f295341a = r14     // Catch:{ all -> 0x0367 }
            java.lang.String r0 = r0.f298024f     // Catch:{ all -> 0x0367 }
            r13.f295342b = r0     // Catch:{ all -> 0x0367 }
            r14 = 2
            r13.f295343c = r14     // Catch:{ all -> 0x0367 }
            r14 = 3
            r13.f295344d = r14     // Catch:{ all -> 0x0367 }
            r13.f295345e = r11     // Catch:{ all -> 0x0367 }
            rq2.C63505q.m74843b(r13)     // Catch:{ all -> 0x0367 }
            goto L_0x0388
        L_0x0351:
            r0 = move-exception
        L_0x0352:
            r26 = r14
            goto L_0x036f
        L_0x0355:
            r0 = move-exception
            goto L_0x036c
        L_0x0357:
            r24 = r11
        L_0x0359:
            r25 = r13
            r26 = r14
            java.lang.String r0 = "reportAdShareClickForTimeLine, extInfo or extInfo.StatSnsAdInfo==null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)     // Catch:{ all -> 0x0367 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            goto L_0x038b
        L_0x0367:
            r0 = move-exception
            goto L_0x036f
        L_0x0369:
            r0 = move-exception
            r24 = r11
        L_0x036c:
            r25 = r13
            goto L_0x0352
        L_0x036f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "reportAdShareClickForTimeLine, exp="
            r11.append(r13)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x0388:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
        L_0x038b:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1898(0x76a, float:2.66E-42)
            r14 = 3
            r0.mo175911u(r1, r14)
            goto L_0x039b
        L_0x0394:
            r24 = r11
            r25 = r13
            r26 = r14
            r14 = 3
        L_0x039b:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "sns_landing_page_start_time"
            java.lang.String r8 = "sns_landig_pages_from_source"
            java.lang.String r9 = "sns_landing_pages_xml"
            if (r12 == 0) goto L_0x0457
            java.lang.String r11 = r15.canvasInfo
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x0457
            r11 = 2
            int[] r14 = new int[r11]
            if (r2 == 0) goto L_0x03bb
            r2.getLocationInWindow(r14)
        L_0x03bb:
            int r11 = r44.getWidth()
            int r2 = r44.getHeight()
            r21 = 0
            r13 = r14[r21]
            r27 = r5
            java.lang.String r5 = "img_gallery_left"
            r0.putExtra(r5, r13)
            r5 = 1
            r13 = r14[r5]
            java.lang.String r5 = "img_gallery_top"
            r0.putExtra(r5, r13)
            java.lang.String r5 = "img_gallery_width"
            r0.putExtra(r5, r11)
            java.lang.String r5 = "img_gallery_height"
            r0.putExtra(r5, r2)
            te3.j00 r2 = r15.ContentObj
            java.util.LinkedList<te3.kv2> r2 = r2.f298427h
            int r5 = r2.size()
            if (r5 <= 0) goto L_0x03f9
            r5 = 0
            java.lang.Object r2 = r2.get(r5)
            te3.kv2 r2 = (te3.C101804kv2) r2
            java.lang.String r2 = r2.f298694i
            java.lang.String r5 = "sns_landing_pages_share_thumb_url"
            r0.putExtra(r5, r2)
        L_0x03f9:
            java.lang.String r2 = r12.getSnsId()
            java.lang.String r5 = "sns_landing_pages_share_sns_id"
            r0.putExtra(r5, r2)
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r12.getTimeLine()
            java.lang.String r2 = r2.f283893Id
            java.lang.String r5 = "sns_landing_pages_rawSnsId"
            r0.putExtra(r5, r2)
            java.lang.String r2 = r12.getAid()
            java.lang.String r5 = "sns_landing_pages_aid"
            r0.putExtra(r5, r2)
            java.lang.String r2 = r12.getTraceid()
            java.lang.String r5 = "sns_landing_pages_traceid"
            r0.putExtra(r5, r2)
            java.lang.String r2 = r12.getUxinfo()
            java.lang.String r5 = "sns_landing_pages_ux_info"
            r0.putExtra(r5, r2)
            if (r3 != 0) goto L_0x0431
            r14 = 3
            goto L_0x0432
        L_0x0431:
            r14 = 4
        L_0x0432:
            r0.putExtra(r8, r14)
            r11 = r42
            r0.setClass(r11, r4)
            java.lang.String r2 = r15.canvasInfo
            r0.putExtra(r9, r2)
            int r2 = r12.getAdRecSrc()
            java.lang.String r3 = "sns_landing_pages_rec_src"
            r0.putExtra(r3, r2)
            java.lang.String r2 = "sns_landing_pages_xml_prefix"
            r0.putExtra(r2, r6)
            long r2 = java.lang.System.currentTimeMillis()
            r0.putExtra(r1, r2)
            goto L_0x045b
        L_0x0457:
            r11 = r42
            r27 = r5
        L_0x045b:
            java.lang.String r13 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper"
            java.lang.String r2 = "sns_landing_pages_expid"
            if (r12 == 0) goto L_0x04e3
            java.lang.String r3 = r15.canvasInfo
            java.lang.String r5 = "jumpByDynamicInfos"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r13)
            boolean r14 = rq2.C101429o.m133111d()
            r37 = r9
            r38 = r12
            r9 = 0
            int r12 = r0.getIntExtra(r8, r9)
            java.lang.String r9 = ".adxml.canvasShareInfo.canvasId"
            java.lang.String r9 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesPreviewUI.m121792H7(r3, r6, r9)
            r39 = r8
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r0)
            r8.setClass(r11, r4)
            r8.putExtra(r2, r7)
            r40 = r4
            r44 = r5
            long r4 = java.lang.System.currentTimeMillis()
            r8.putExtra(r1, r4)
            if (r14 == 0) goto L_0x04d9
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r4 != 0) goto L_0x04d9
            boolean r4 = r11 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r4 == 0) goto L_0x04d9
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r9)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = ".adxml.canvasShareInfo.uxInfo"
            java.lang.String r31 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesPreviewUI.m121792H7(r3, r6, r5)
            java.lang.String r5 = ".adxml.canvasShareInfo.canvasDynamicInfo"
            java.lang.String r32 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesPreviewUI.m121792H7(r3, r6, r5)
            long r28 = r4.longValue()
            r33 = r11
            com.tencent.mm.ui.MMActivity r33 = (com.tencent.p014mm.p136ui.MMActivity) r33
            ps2.s r4 = new ps2.s
            r4.<init>(r8, r11)
            ps2.t r5 = new ps2.t
            r5.<init>(r3, r11, r12)
            r30 = r12
            r34 = r3
            r35 = r4
            r36 = r5
            rq2.C101429o.m133109b(r28, r30, r31, r32, r33, r34, r35, r36)
            r3 = r44
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r13)
            r3 = 1
            goto L_0x04df
        L_0x04d9:
            r3 = r44
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r13)
            r3 = 0
        L_0x04df:
            if (r3 == 0) goto L_0x04eb
            r3 = 1
            goto L_0x04ec
        L_0x04e3:
            r40 = r4
            r39 = r8
            r37 = r9
            r38 = r12
        L_0x04eb:
            r3 = 0
        L_0x04ec:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "jumpByDynamicInfos = "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            if (r3 == 0) goto L_0x0515
            if (r27 != 0) goto L_0x050d
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1898(0x76a, float:2.66E-42)
            r2 = 4
            r0.mo175911u(r1, r2)
        L_0x050d:
            r12 = r18
            r14 = r26
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r14)
            return
        L_0x0515:
            r12 = r18
            r14 = r26
            java.lang.String r3 = r15.canvasInfo
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x05fe
            java.lang.String r3 = r15.canvasInfo
            boolean r3 = ps2.C100894u.m132239s(r3)
            if (r3 == 0) goto L_0x05fe
            if (r38 == 0) goto L_0x05fe
            if (r27 != 0) goto L_0x0535
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 1898(0x76a, float:2.66E-42)
            r5 = 4
            r3.mo175911u(r4, r5)
        L_0x0535:
            java.lang.String r9 = "openCanvas"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r13)
            r3 = r37
            java.lang.String r10 = r0.getStringExtra(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            if (r3 != 0) goto L_0x05f7
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r4 = "AdLandingPagesParseHelper"
            if (r3 != 0) goto L_0x05ec
            boolean r3 = ps2.C100894u.m132239s(r10)
            if (r3 == 0) goto L_0x05ec
            boolean r3 = ps2.C100894u.m132238r(r10, r6)
            if (r3 == 0) goto L_0x0569
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L_0x0569
            java.lang.String r5 = "abtestvalue = 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r20 = 0
            goto L_0x056b
        L_0x0569:
            r20 = 1
        L_0x056b:
            if (r20 == 0) goto L_0x05de
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            r4 = r40
            r3.setClass(r11, r4)
            r3.putExtra(r2, r7)
            long r4 = java.lang.System.currentTimeMillis()
            r3.putExtra(r1, r4)
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r3)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPagesParseHelper"
            java.lang.String r4 = "openCanvas"
            java.lang.String r5 = "(Landroid/content/Intent;Landroid/content/Context;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r42
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            r11.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPagesParseHelper"
            java.lang.String r3 = "openCanvas"
            java.lang.String r4 = "(Landroid/content/Intent;Landroid/content/Context;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r42
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r11 instanceof android.app.Activity
            if (r0 == 0) goto L_0x05da
            boolean r0 = com.tencent.p014mm.plugin.sns.storage.ADXml.isTwistAdCanvas(r10)
            if (r0 != 0) goto L_0x05d3
            boolean r0 = com.tencent.p014mm.plugin.sns.storage.ADXml.isShakeAdCanvas(r10)
            if (r0 != 0) goto L_0x05d3
            boolean r0 = com.tencent.p014mm.plugin.sns.storage.ADXml.isSimpleSharedShakeAd(r10)
            if (r0 == 0) goto L_0x05da
        L_0x05d3:
            r0 = r11
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 0
            r0.overridePendingTransition(r1, r1)
        L_0x05da:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r13)
            goto L_0x05fa
        L_0x05de:
            r1 = r39
            r2 = -1
            int r0 = r0.getIntExtra(r1, r2)
            ps2.C100894u.m132243w(r10, r6, r11, r3, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r13)
            goto L_0x05fa
        L_0x05ec:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 0
            r0[r1] = r10
            java.lang.String r1 = "invalid canvas xml %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
        L_0x05f7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r13)
        L_0x05fa:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r14)
            return
        L_0x05fe:
            r2 = -1
            te3.j00 r0 = r15.ContentObj
            java.lang.String r0 = r0.f298425f
            java.lang.String r1 = "webpageTitle"
            r9 = r25
            r9.putExtra(r1, r0)
            java.lang.String r0 = "key_enable_teen_mode_check"
            r1 = 1
            r9.putExtra(r0, r1)
            java.lang.String r0 = r15.UserName
            java.lang.String r1 = "msgUsername"
            r9.putExtra(r1, r0)
            java.lang.String r0 = r15.f283893Id
            java.lang.String r1 = "serverMsgID"
            r9.putExtra(r1, r0)
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r9.addFlags(r0)
            te3.j00 r0 = r15.ContentObj
            te3.st2 r0 = r0.f298430n
            if (r0 == 0) goto L_0x0631
            int r0 = r0.f299443d
            r4 = r0
            goto L_0x0632
        L_0x0631:
            r4 = -1
        L_0x0632:
            k40.a r0 = f40.C86709a0.m107533q(r22)
            ex0.d r0 = (ex0.C45696d) r0
            r1 = 4
            boolean r0 = r0.mo70957E5(r1)
            if (r0 == 0) goto L_0x065d
            k40.a r0 = f40.C86709a0.m107533q(r22)
            r1 = r0
            ex0.d r1 = (ex0.C45696d) r1
            r5 = 0
            r6 = 2
            r2 = r42
            r3 = r24
            r13 = r7
            r7 = r19
            r8 = r9
            boolean r0 = r1.Ms0(r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x065e
            java.lang.String r0 = "jump to TmplWebview"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x066d
        L_0x065d:
            r13 = r7
        L_0x065e:
            di3.d r0 = di3.C86312j.m106911c(r17)
            om.f r0 = (p214om.C11502f) r0
            wc3.z r0 = r0.mo11462yM()
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            r0.mo93190w(r9, r11)
        L_0x066d:
            te3.r5 r0 = r15.AppInfo
            if (r0 == 0) goto L_0x067c
            java.lang.String r1 = r0.f299236d
            java.lang.String r0 = r0.f299237e
            r2 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
            r3 = r1
            goto L_0x067e
        L_0x067c:
            r0 = 0
            r3 = 0
        L_0x067e:
            di3.d r1 = di3.C86312j.m106911c(r17)
            om.f r1 = (p214om.C11502f) r1
            wc3.y r1 = r1.mo11461Sr()
            java.lang.String r4 = r1.mo93161nP(r3, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 != 0) goto L_0x06c2
            te3.k1 r0 = r15.actionInfo
            if (r0 == 0) goto L_0x069e
            te3.g1 r0 = r0.f298580j
            if (r0 == 0) goto L_0x069e
            java.lang.String r0 = r0.f298272e
            r9 = r0
            goto L_0x069f
        L_0x069e:
            r9 = 0
        L_0x069f:
            java.lang.String r5 = r15.UserName
            di3.d r0 = di3.C86312j.m106911c(r17)
            om.f r0 = (p214om.C11502f) r0
            wc3.y r1 = r0.mo11461Sr()
            r6 = 5
            r7 = 4
            r8 = 1
            r16 = 0
            java.lang.String r0 = r15.f283893Id
            r2 = r42
            r10 = 3
            r10 = r16
            r41 = r12
            r23 = r14
            r14 = r38
            r12 = r0
            r1.mo93162s5(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            goto L_0x06c8
        L_0x06c2:
            r41 = r12
            r23 = r14
            r14 = r38
        L_0x06c8:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 11105(0x2b61, float:1.5561E-41)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r15.UserName
            r2.append(r4)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r4 = 0
            r3[r4] = r2
            te3.j00 r2 = r15.ContentObj
            java.lang.String r2 = r2.f298426g
            r4 = 1
            r3[r4] = r2
            r0.mo160131h(r1, r3)
            if (r14 == 0) goto L_0x0721
            int r1 = r14.field_type
            r2 = 4
            if (r1 == r2) goto L_0x06f8
            r2 = 42
            if (r1 != r2) goto L_0x0721
        L_0x06f8:
            te3.j00 r1 = r15.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            te3.kv2 r1 = (te3.C101804kv2) r1
            r3 = 13043(0x32f3, float:1.8277E-41)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4[r2] = r6
            if (r1 != 0) goto L_0x0713
            r7 = r13
            goto L_0x0715
        L_0x0713:
            java.lang.String r7 = r1.f298691f
        L_0x0715:
            r4[r5] = r7
            te3.r5 r1 = r15.AppInfo
            java.lang.String r1 = r1.f299236d
            r2 = 2
            r4[r2] = r1
            r0.mo160131h(r3, r4)
        L_0x0721:
            if (r14 == 0) goto L_0x0732
            java.lang.String r0 = r14.getUserName()
            java.lang.String r1 = r14.getLocalid()
            int r2 = r14.getTypeFlag()
            m123088G(r0, r1, r2)
        L_0x0732:
            r1 = r23
            r2 = r41
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            return
        L_0x073a:
            r1 = r14
            r2 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123091J(android.content.Context, com.tencent.mm.plugin.sns.ui.g0, android.view.View, com.tencent.mm.plugin.sns.model.d1, int):void");
    }

    /* renamed from: K */
    public static void m123092K(C95787g0 g0Var) {
        SnsMethodCalculate.markStartTimeMs("urlLickClickHeader", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        SnsInfo DN = C94866e1.Yx0().mo139798DN(g0Var.f279451b);
        if (m123089H(f280582z)) {
            f280582z.mo130970a().mo131335v(DN);
        }
        SnsMethodCalculate.markEndTimeMs("urlLickClickHeader", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: a */
    public static /* synthetic */ int m123093a() {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        int i = f280581y;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        return i;
    }

    /* renamed from: b */
    public static /* synthetic */ Context m123094b(C96085n8 n8Var) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        Context context = n8Var.f280584b;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        return context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0046, code lost:
        r12 = r12.f298439w;
     */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x080a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0175  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m123095c(android.view.View r53, int r54) {
        /*
            r0 = r53
            java.lang.Class<ir.n> r1 = p565ir.C60606n.class
            java.lang.Class<ls3.g> r2 = ls3.C61397g.class
            java.lang.Class<h81.i> r3 = h81.C59774i.class
            java.lang.Class<om.f> r4 = p214om.C11502f.class
            java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
            java.lang.String r6 = "appRedirectHandle"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            android.content.Context r10 = r53.getContext()
            java.lang.String r8 = "localAppRedirectHandle"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
            java.lang.Object r9 = r53.getTag()
            boolean r9 = r9 instanceof com.tencent.p014mm.protocal.protobuf.TimeLineObject
            java.lang.String r15 = "MicroMsg.TimeLineClickEvent"
            java.lang.String r13 = ""
            if (r9 != 0) goto L_0x0032
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            r23 = r1
            r22 = r4
            goto L_0x0172
        L_0x0032:
            android.content.Context r9 = r53.getContext()
            java.lang.Object r18 = r53.getTag()
            r12 = r18
            com.tencent.mm.protocal.protobuf.TimeLineObject r12 = (com.tencent.p014mm.protocal.protobuf.TimeLineObject) r12
            te3.r5 r14 = r12.AppInfo
            java.lang.String r14 = r14.f299236d
            te3.j00 r12 = r12.ContentObj
            if (r12 == 0) goto L_0x004d
            te3.t23 r12 = r12.f298439w
            if (r12 == 0) goto L_0x004d
            java.lang.String r12 = r12.f185476x
            goto L_0x004e
        L_0x004d:
            r12 = r13
        L_0x004e:
            java.lang.String r11 = "wx485a97c844086dc9"
            boolean r21 = r11.equals(r14)
            r22 = r4
            java.lang.String r4 = ".ui.ShakeReportUI"
            r23 = r1
            java.lang.String r1 = "shake"
            java.lang.String r0 = "enter_from_scene"
            if (r21 != 0) goto L_0x0156
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x006a
            goto L_0x0156
        L_0x006a:
            java.lang.String r11 = "wx7fa037cc7dfabad5"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x00c2
            r11 = 34
            tv2.C14096e.m13447a(r11)
            f40.C86709a0.m107528h()
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            java.lang.String r1 = "gh_43f2581f6fd6"
            com.tencent.mm.storage.z1 r0 = r0.get(r1)
            boolean r0 = r0.mo62927s3()
            if (r0 == 0) goto L_0x00aa
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r4 = "Chat_User"
            r0.putExtra(r4, r1)
            java.lang.String r1 = "finish_direct"
            r4 = 1
            r0.putExtra(r1, r4)
            java.lang.String r1 = ".ui.chatting.ChattingUI"
            r4 = 0
            ke3.C88144b.m109801s(r9, r1, r0, r4)
            goto L_0x00bd
        L_0x00aa:
            r4 = 0
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r11 = "Contact_User"
            r0.putExtra(r11, r1)
            java.lang.String r1 = "profile"
            java.lang.String r11 = ".ui.ContactInfoUI"
            ke3.C88144b.m109791i(r9, r1, r11, r0, r4)
        L_0x00bd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            goto L_0x0172
        L_0x00c2:
            java.lang.String r11 = "wx9181ed3f223e6d76"
            boolean r11 = r11.equals(r14)
            java.lang.String r12 = "shake_tv"
            if (r11 != 0) goto L_0x0138
            java.lang.String r11 = "wx2fe12a395c426fcf"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x00d8
            goto L_0x0138
        L_0x00d8:
            java.lang.String r11 = "wxfbc915ff7c30e335"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x010b
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "BaseScanUI_select_scan_mode"
            r4 = 1
            r0.putExtra(r1, r4)
            boolean r1 = p182kk.C61104a.m71651g(r9)
            if (r1 != 0) goto L_0x0107
            boolean r1 = p182kk.C61104a.m71665u(r9)
            if (r1 != 0) goto L_0x0107
            boolean r1 = p182kk.C61104a.m71649e(r9)
            if (r1 != 0) goto L_0x0107
            java.lang.String r1 = "scanner"
            java.lang.String r4 = ".ui.BaseScanUI"
            r11 = 0
            ke3.C88144b.m109791i(r9, r1, r4, r0, r11)
        L_0x0107:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            goto L_0x0172
        L_0x010b:
            java.lang.String r11 = "wxaf060266bfa9a35c"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0133
            boolean r11 = qc0.C77328l.m93194c()
            if (r11 != 0) goto L_0x011e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            goto L_0x0172
        L_0x011e:
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            r14 = 1
            r11.putExtra(r12, r14)
            r12 = 2
            r11.putExtra(r0, r12)
            r0 = 0
            ke3.C88144b.m109791i(r9, r1, r4, r11, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            goto L_0x0172
        L_0x0133:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            r4 = 0
            goto L_0x0173
        L_0x0138:
            java.lang.String r9 = "hy: shake new year closed. try to go to shake TV"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r9)
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            r11 = 1
            r9.putExtra(r12, r11)
            r12 = 2
            r9.putExtra(r0, r12)
            android.content.Context r0 = r53.getContext()
            r14 = 0
            ke3.C88144b.m109791i(r0, r1, r4, r9, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            goto L_0x0172
        L_0x0156:
            r11 = 1
            r12 = 2
            r14 = 0
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r14 = "shake_music"
            r9.putExtra(r14, r11)
            r9.putExtra(r0, r12)
            android.content.Context r0 = r53.getContext()
            r11 = 0
            ke3.C88144b.m109791i(r0, r1, r4, r9, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
        L_0x0172:
            r4 = 1
        L_0x0173:
            if (r4 != 0) goto L_0x080a
            java.lang.Object r0 = r53.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.protocal.protobuf.TimeLineObject
            if (r0 != 0) goto L_0x0181
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            return
        L_0x0181:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MomentChannels
            android.content.Context r1 = r53.getContext()
            boolean r0 = r0.checkAvailable(r1)
            if (r0 != 0) goto L_0x0191
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            return
        L_0x0191:
            java.lang.Object r0 = r53.getTag()
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = (com.tencent.p014mm.protocal.protobuf.TimeLineObject) r0
            if (r0 == 0) goto L_0x07ff
            te3.r5 r1 = r0.AppInfo
            if (r1 != 0) goto L_0x019f
            goto L_0x07ff
        L_0x019f:
            te3.j00 r4 = r0.ContentObj
            java.lang.String r8 = "key_finder_teen_mode_user_name"
            java.lang.String r9 = "key_finder_teen_mode_scene"
            java.lang.String r11 = "key_finder_teen_mode_check"
            java.lang.String r12 = "key_finder_object_nonce_id_key"
            java.lang.String r14 = "key_finder_object_Id"
            r21 = r1
            java.lang.String r1 = "key_enter_profile_type"
            r24 = r2
            java.lang.String r2 = "report_scene"
            r25 = r6
            java.lang.String r6 = "finder_username"
            r26 = r7
            java.lang.String r7 = ","
            r27 = r10
            java.lang.String r10 = "key_biz_username"
            r30 = r15
            java.lang.String r15 = "key_from_comment_scene"
            r31 = r7
            java.lang.String r7 = "report20587, "
            r33 = r7
            java.lang.String r7 = "key_finder_teen_mode_user_id"
            r34 = r3
            if (r4 == 0) goto L_0x0323
            int r3 = r4.f298424e
            r35 = r10
            r10 = 28
            if (r3 != r10) goto L_0x0318
            te3.rk1 r3 = r4.f298431o
            if (r3 == 0) goto L_0x0318
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r4 = 3
            r3.putExtra(r2, r4)
            r2 = 8
            r3.putExtra(r1, r2)
            r1 = 37
            r3.putExtra(r15, r1)
            te3.j00 r1 = r0.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r1 = r1.f185184e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x021b
            r3.putExtra(r6, r13)
            te3.j00 r1 = r0.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r1 = r1.f185183d
            r3.putExtra(r14, r1)
            te3.j00 r1 = r0.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r1 = r1.f185191o
            r3.putExtra(r12, r1)
            goto L_0x0224
        L_0x021b:
            te3.j00 r1 = r0.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r1 = r1.f185184e
            r3.putExtra(r6, r1)
        L_0x0224:
            di3.d r1 = di3.C86312j.m106911c(r5)
            ht1.t1 r1 = (ht1.C60200t1) r1
            ht1.z4 r1 = r1.mo76861l7()
            boolean r1 = r1.mo83771R5()
            r3.putExtra(r11, r1)
            r1 = 3
            r3.putExtra(r9, r1)
            te3.j00 r1 = r0.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r1 = vr2.C102236a0.m134703A(r1)
            r3.putExtra(r8, r1)
            te3.j00 r1 = r0.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r1 = r1.f185184e
            r3.putExtra(r7, r1)
            te3.j00 r1 = r0.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r2 = r1.f185195s
            java.lang.String r1 = r1.f185200x
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0261
            te3.j00 r1 = r0.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r2 = r1.f185200x
        L_0x0261:
            r10 = r35
            r3.putExtra(r10, r2)
            di3.d r1 = di3.C86312j.m106911c(r34)
            h81.i r1 = (h81.C59774i) r1
            java.lang.String r1 = r1.mo84751Wb()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            java.lang.String r2 = r0.UserName
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            te3.j00 r4 = r0.ContentObj
            te3.rk1 r4 = r4.f298431o
            java.lang.String r4 = r4.f185183d
            java.lang.String r6 = r0.f283893Id
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r13)
            r7.append(r1)
            r1 = r31
            r7.append(r1)
            r7.append(r2)
            r7.append(r1)
            r7.append(r4)
            r7.append(r1)
            r7.append(r6)
            java.lang.String r1 = r7.toString()
            te3.j00 r0 = r0.ContentObj
            te3.rk1 r0 = r0.f298431o
            java.lang.String r0 = r0.f185181D
            if (r0 == 0) goto L_0x02bc
            di3.d r2 = di3.C86312j.m106911c(r5)
            ht1.t1 r2 = (ht1.C60200t1) r2
            ht1.z4 r2 = r2.mo76861l7()
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r12 = r2.mo83757D5(r0)
            goto L_0x02bd
        L_0x02bc:
            r12 = 0
        L_0x02bd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = r33
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 20587(0x506b, float:2.8849E-41)
            r0.kvStat(r2, r1)
            di3.d r0 = di3.C86312j.m106911c(r5)
            ht1.t1 r0 = (ht1.C60200t1) r0
            ht1.z4 r0 = r0.mo76861l7()
            r16 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r2 = r27
            java.lang.Boolean r0 = r0.mo83795m6(r2, r12, r1)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0310
            di3.d r0 = di3.C86312j.m106911c(r5)
            ht1.t1 r0 = (ht1.C60200t1) r0
            r1 = 32
            r2 = 4
            r4 = 2
            r0.mo76842e7(r2, r4, r1, r3)
            di3.d r0 = di3.C86312j.m106911c(r5)
            ht1.t1 r0 = (ht1.C60200t1) r0
            android.content.Context r1 = r53.getContext()
            r0.mo76819V1(r1, r3)
        L_0x0310:
            r0 = r25
            r3 = r26
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            return
        L_0x0318:
            r37 = r25
            r38 = r30
            r3 = r31
            r36 = r33
            r10 = r35
            goto L_0x032b
        L_0x0323:
            r37 = r25
            r38 = r30
            r3 = r31
            r36 = r33
        L_0x032b:
            r16 = 0
            if (r4 == 0) goto L_0x0446
            r31 = r3
            int r3 = r4.f298424e
            r35 = r10
            r10 = 36
            if (r3 != r10) goto L_0x0439
            te3.fw2 r3 = r4.f298436t
            if (r3 == 0) goto L_0x0439
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r4 = 3
            r3.putExtra(r2, r4)
            r2 = 8
            r3.putExtra(r1, r2)
            r1 = 37
            r3.putExtra(r15, r1)
            te3.j00 r1 = r0.ContentObj
            te3.fw2 r1 = r1.f298436t
            java.lang.String r1 = r1.f183242e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0372
            r3.putExtra(r6, r13)
            te3.j00 r1 = r0.ContentObj
            te3.fw2 r1 = r1.f298436t
            java.lang.String r1 = r1.f183241d
            r3.putExtra(r14, r1)
            te3.j00 r1 = r0.ContentObj
            te3.fw2 r1 = r1.f298436t
            java.lang.String r1 = r1.f183248n
            r3.putExtra(r12, r1)
            goto L_0x037b
        L_0x0372:
            te3.j00 r1 = r0.ContentObj
            te3.fw2 r1 = r1.f298436t
            java.lang.String r1 = r1.f183242e
            r3.putExtra(r6, r1)
        L_0x037b:
            di3.d r1 = di3.C86312j.m106911c(r5)
            ht1.t1 r1 = (ht1.C60200t1) r1
            ht1.z4 r1 = r1.mo76861l7()
            boolean r1 = r1.mo83771R5()
            r3.putExtra(r11, r1)
            r1 = 3
            r3.putExtra(r9, r1)
            te3.j00 r1 = r0.ContentObj
            te3.fw2 r1 = r1.f298436t
            java.lang.String r1 = r1.f183243f
            r3.putExtra(r8, r1)
            te3.j00 r1 = r0.ContentObj
            te3.fw2 r1 = r1.f298436t
            java.lang.String r1 = r1.f183242e
            r3.putExtra(r7, r1)
            te3.j00 r1 = r0.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r2 = r1.f185195s
            java.lang.String r1 = r1.f185200x
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x03b6
            te3.j00 r1 = r0.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r2 = r1.f185200x
        L_0x03b6:
            r1 = r35
            r3.putExtra(r1, r2)
            di3.d r1 = di3.C86312j.m106911c(r34)
            h81.i r1 = (h81.C59774i) r1
            java.lang.String r1 = r1.mo84751Wb()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            java.lang.String r2 = r0.UserName
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            te3.j00 r4 = r0.ContentObj
            te3.fw2 r4 = r4.f298436t
            java.lang.String r4 = r4.f183241d
            java.lang.String r0 = r0.f283893Id
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r13)
            r6.append(r1)
            r10 = r31
            r6.append(r10)
            r6.append(r2)
            r6.append(r10)
            r6.append(r4)
            r6.append(r10)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r15 = r36
            r1.append(r15)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r2 = r38
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 20587(0x506b, float:2.8849E-41)
            r1.kvStat(r2, r0)
            di3.d r0 = di3.C86312j.m106911c(r5)
            ht1.t1 r0 = (ht1.C60200t1) r0
            r1 = 32
            r2 = 4
            r4 = 2
            r0.mo76842e7(r2, r4, r1, r3)
            di3.d r0 = di3.C86312j.m106911c(r5)
            ht1.t1 r0 = (ht1.C60200t1) r0
            android.content.Context r1 = r53.getContext()
            r0.mo76819V1(r1, r3)
            r3 = r26
            r0 = r37
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            return
        L_0x0439:
            r10 = r31
            r15 = r36
            r39 = r37
            r3 = r38
            r17 = 2
            r30 = r3
            goto L_0x044f
        L_0x0446:
            r10 = r3
            r15 = r36
            r39 = r37
            r17 = 2
            r30 = r38
        L_0x044f:
            r3 = 45
            if (r4 == 0) goto L_0x053d
            r33 = r15
            int r15 = r4.f298424e
            r31 = r10
            r10 = 34
            if (r15 == r10) goto L_0x0463
            if (r15 == r3) goto L_0x0463
            r10 = 43
            if (r15 != r10) goto L_0x053d
        L_0x0463:
            te3.p81 r10 = r4.f298435s
            if (r10 == 0) goto L_0x053d
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r4 = 3
            r3.putExtra(r2, r4)
            r2 = 8
            r3.putExtra(r1, r2)
            te3.j00 r1 = r0.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184779e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0497
            r3.putExtra(r6, r13)
            te3.j00 r1 = r0.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184780f
            r3.putExtra(r14, r1)
            te3.j00 r1 = r0.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184790s
            r3.putExtra(r12, r1)
            goto L_0x04a9
        L_0x0497:
            te3.j00 r1 = r0.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184779e
            r3.putExtra(r6, r1)
            te3.j00 r1 = r0.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184779e
            r3.putExtra(r7, r1)
        L_0x04a9:
            te3.j00 r1 = r0.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184781g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x04be
            te3.j00 r1 = r0.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184781g
            r3.putExtra(r8, r1)
        L_0x04be:
            di3.d r1 = di3.C86312j.m106911c(r5)
            ht1.t1 r1 = (ht1.C60200t1) r1
            ht1.z4 r1 = r1.mo76861l7()
            boolean r1 = r1.mo83771R5()
            r3.putExtra(r11, r1)
            r1 = 3
            r3.putExtra(r9, r1)
            di3.d r1 = di3.C86312j.m106911c(r34)
            h81.i r1 = (h81.C59774i) r1
            java.lang.String r1 = r1.mo84751Wb()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            java.lang.String r2 = r0.UserName
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            te3.j00 r4 = r0.ContentObj
            te3.p81 r4 = r4.f298435s
            java.lang.String r4 = r4.f184780f
            java.lang.String r0 = r0.f283893Id
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r13)
            r6.append(r1)
            r1 = r31
            r6.append(r1)
            r6.append(r2)
            r6.append(r1)
            r6.append(r4)
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r33
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            di3.d r0 = di3.C86312j.m106911c(r5)
            ht1.t1 r0 = (ht1.C60200t1) r0
            android.content.Context r1 = r53.getContext()
            r0.mo76819V1(r1, r3)
            r2 = r26
            r6 = r39
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
            return
        L_0x053d:
            r2 = r26
            r6 = r39
            r7 = 0
            if (r4 == 0) goto L_0x070c
            int r1 = r4.f298424e
            r14 = 1
            if (r1 != r14) goto L_0x070c
            te3.p81 r1 = r4.f298435s
            if (r1 == 0) goto L_0x070c
            java.lang.String r1 = r1.f184778d
            long r3 = vr2.C102236a0.m134706B0(r1)
            te3.j00 r1 = r0.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184780f
            long r20 = vr2.C102236a0.m134706B0(r1)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0708
            int r1 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0708
            di3.d r1 = di3.C86312j.m106911c(r24)
            r28 = r1
            ls3.g r28 = (ls3.C61397g) r28
            te3.j00 r1 = r0.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184779e
            r7 = 2131303693(0x7f091d0d, float:1.8225508E38)
            r8 = r53
            android.view.View r30 = r8.findViewById(r7)
            r7 = 2131303455(0x7f091c1f, float:1.8225025E38)
            android.view.View r31 = r8.findViewById(r7)
            r29 = r1
            r32 = r3
            boolean r1 = r28.Nj0(r29, r30, r31, r32)
            if (r1 == 0) goto L_0x0605
            di3.d r1 = di3.C86312j.m106911c(r24)
            r8 = r1
            ls3.g r8 = (ls3.C61397g) r8
            di3.d r1 = di3.C86312j.m106911c(r5)
            ht1.t1 r1 = (ht1.C60200t1) r1
            ht1.z4 r1 = r1.mo76861l7()
            java.lang.String r7 = "share"
            r9 = 3
            r10 = 0
            android.content.Intent r9 = r1.mo83773T5(r10, r7, r9)
            te3.j00 r1 = r0.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r15 = r1.f184779e
            java.lang.String r7 = r1.f184790s
            java.lang.String r1 = r1.f184782h
            di3.d r5 = di3.C86312j.m106911c(r5)
            ht1.t1 r5 = (ht1.C60200t1) r5
            ht1.z4 r5 = r5.mo76861l7()
            boolean r19 = r5.mo83771R5()
            java.lang.String r18 = ""
            r10 = r27
            r11 = r20
            r5 = 2
            r13 = r3
            r4 = 0
            r16 = r7
            r17 = r1
            r8.mo83482aR(r9, r10, r11, r13, r15, r16, r17, r18, r19)
            te3.j00 r0 = r0.ContentObj
            te3.p81 r0 = r0.f298435s
            int r0 = r0.f184759C
            if (r0 == r5) goto L_0x05e3
            r1 = 8
            if (r0 == r1) goto L_0x05e3
            r1 = 16
            if (r0 != r1) goto L_0x05e1
            goto L_0x05e3
        L_0x05e1:
            r15 = 0
            goto L_0x05e4
        L_0x05e3:
            r15 = 1
        L_0x05e4:
            if (r15 != 0) goto L_0x05ed
            r1 = 6
            if (r0 != r1) goto L_0x05ea
            goto L_0x05ed
        L_0x05ea:
            r33 = 2
            goto L_0x05ef
        L_0x05ed:
            r33 = 1
        L_0x05ef:
            di3.d r0 = di3.C86312j.m106911c(r24)
            r28 = r0
            ls3.g r28 = (ls3.C61397g) r28
            r29 = 0
            r34 = 3
            java.lang.String r32 = "share"
            r30 = r20
            r28.mo83473AP(r29, r30, r32, r33, r34)
            goto L_0x0704
        L_0x0605:
            r1 = 2
            java.lang.String r7 = eb0.C75592q0.m90778h()
            te3.j00 r8 = r0.ContentObj
            te3.p81 r8 = r8.f298435s
            java.lang.String r8 = r8.f184779e
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r8)
            if (r7 == 0) goto L_0x0648
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            te3.j00 r1 = r0.ContentObj
            te3.p81 r1 = r1.f298435s
            int r1 = r1.f184793v
            java.lang.String r5 = "KEY_PARAMS_SOURCE_TYPE"
            r9.putExtra(r5, r1)
            di3.d r1 = di3.C86312j.m106911c(r23)
            r8 = r1
            ir.n r8 = (p565ir.C60606n) r8
            java.lang.Long r13 = java.lang.Long.valueOf(r3)
            te3.j00 r0 = r0.ContentObj
            te3.p81 r0 = r0.f298435s
            java.lang.String r14 = r0.f184790s
            java.lang.String r15 = r0.f184782h
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            java.lang.String r18 = ""
            r10 = r27
            r11 = r20
            r8.o90(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            goto L_0x0704
        L_0x0648:
            java.lang.String r7 = r0.UserName
            if (r7 != 0) goto L_0x064d
            r7 = r13
        L_0x064d:
            t91.C64208c.f181958h = r7
            java.lang.String r7 = r0.f283893Id
            t91.C64208c.f181959i = r7
            java.lang.Class<kq.g> r7 = p185kq.C61130g.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            kq.g r7 = (p185kq.C61130g) r7
            java.lang.String r8 = "temp_6"
            r7.mo33246ry(r8)
            di3.d r7 = di3.C86312j.m106911c(r5)
            r35 = r7
            ht1.t1 r35 = (ht1.C60200t1) r35
            te3.j00 r7 = r0.ContentObj
            te3.p81 r7 = r7.f298435s
            java.lang.String r8 = r7.f184779e
            r41 = -1
            r42 = -1
            r43 = 7
            int r7 = r7.f184791t
            r9 = 1
            if (r7 != r9) goto L_0x067d
            r46 = 1
            goto L_0x067f
        L_0x067d:
            r46 = 2
        L_0x067f:
            java.lang.Class<oq.e> r7 = p217oq.C62120e.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            oq.e r7 = (p217oq.C62120e) r7
            int r47 = r7.Oc0()
            java.lang.String r48 = t91.C64208c.f181958h
            java.lang.String r49 = t91.C64208c.f181959i
            long r50 = java.lang.System.currentTimeMillis()
            r52 = 1
            java.lang.String r45 = "temp_6"
            r36 = r20
            r38 = r3
            r40 = r8
            r35.jm0(r36, r38, r40, r41, r42, r43, r45, r46, r47, r48, r49, r50, r52)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r8 = "key_enter_live_param_visitor_enter_scene"
            r7.putExtra(r8, r1)
            java.lang.String r1 = "key_enter_live_param_pull_more_type"
            r7.putExtra(r1, r9)
            te3.j00 r1 = r0.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184794w
            if (r1 != 0) goto L_0x06bb
            goto L_0x06bc
        L_0x06bb:
            r13 = r1
        L_0x06bc:
            java.lang.String r1 = "key_enter_live_param_ecsource"
            r7.putExtra(r1, r13)
            java.lang.String r1 = "KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE"
            r8 = 4
            r7.putExtra(r1, r8)
            di3.d r1 = di3.C86312j.m106911c(r23)
            r8 = r1
            ir.n r8 = (p565ir.C60606n) r8
            java.lang.Long r13 = java.lang.Long.valueOf(r3)
            te3.j00 r0 = r0.ContentObj
            te3.p81 r0 = r0.f298435s
            java.lang.String r14 = r0.f184779e
            java.lang.String r15 = r0.f184790s
            java.lang.String r0 = r0.f184782h
            r1 = 4
            r22 = 1
            di3.d r3 = di3.C86312j.m106911c(r5)
            ht1.t1 r3 = (ht1.C60200t1) r3
            ht1.z4 r3 = r3.mo76861l7()
            boolean r23 = r3.mo83771R5()
            java.lang.String r17 = ""
            java.lang.String r18 = ""
            java.lang.String r19 = ""
            java.lang.String r3 = ""
            r9 = r7
            r10 = r27
            r11 = r20
            r16 = r0
            r20 = r1
            r21 = r3
            r8.mo85047ZH(r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0704:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
            return
        L_0x0708:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
            return
        L_0x070c:
            r1 = 2
            r4 = 0
            r9 = 1
            r10 = 0
            r5 = r21
            java.lang.String r5 = r5.f299236d
            di3.d r11 = di3.C86312j.m106911c(r22)
            om.f r11 = (p214om.C11502f) r11
            wc3.y r11 = r11.mo11461Sr()
            java.lang.String r4 = r11.mo93137CP(r5, r4)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r11 != 0) goto L_0x0783
            java.lang.String r3 = r0.UserName
            te3.j00 r11 = r0.ContentObj
            int r11 = r11.f298424e
            r13 = 5
            if (r11 != r9) goto L_0x0732
            goto L_0x0737
        L_0x0732:
            r9 = 3
            if (r11 != r9) goto L_0x0737
            r9 = 5
            goto L_0x0738
        L_0x0737:
            r9 = 2
        L_0x0738:
            te3.k1 r11 = r0.actionInfo
            if (r11 == 0) goto L_0x0743
            te3.g1 r11 = r11.f298580j
            if (r11 == 0) goto L_0x0743
            java.lang.String r12 = r11.f298272e
            goto L_0x0744
        L_0x0743:
            r12 = r10
        L_0x0744:
            com.tencent.mm.autogen.events.ReportMsgClickEvent r10 = new com.tencent.mm.autogen.events.ReportMsgClickEvent
            r10.<init>()
            com.tencent.mm.autogen.events.ReportMsgClickEvent$a r11 = r10.f193900d
            r14 = r27
            r11.f193901a = r14
            r15 = 4
            r11.f193907g = r15
            r11.f193902b = r5
            r11.f193903c = r4
            r11.f193905e = r9
            r11.f193904d = r3
            r11.f193906f = r12
            r11.f193908h = r13
            r11.f193909i = r7
            java.lang.String r0 = r0.f283893Id
            r11.f193910j = r0
            r10.publish()
            com.tencent.mm.autogen.events.GameCenterOperationEvent r0 = new com.tencent.mm.autogen.events.GameCenterOperationEvent
            r0.<init>()
            com.tencent.mm.autogen.events.GameCenterOperationEvent$a r3 = r0.f107543d
            r3.f107544a = r1
            r1 = 3
            r3.f107549f = r1
            java.lang.String r1 = "timeline_src=3"
            r3.f107550g = r1
            r3.f107546c = r5
            r3.f107545b = r14
            r0.publish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
            return
        L_0x0783:
            r14 = r27
            java.lang.String r4 = "getAppUrl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            di3.d r7 = di3.C86312j.m106911c(r22)
            om.f r7 = (p214om.C11502f) r7
            wc3.y r7 = r7.mo11461Sr()
            java.lang.String r8 = "timeline"
            java.lang.String r5 = r7.v10(r14, r5, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            if (r5 == 0) goto L_0x07fb
            int r4 = r5.length()
            if (r4 != 0) goto L_0x07a7
            goto L_0x07fb
        L_0x07a7:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r7 = "rawUrl"
            r4.putExtra(r7, r5)
            java.lang.String r7 = "shortUrl"
            r4.putExtra(r7, r5)
            java.lang.String r5 = "useJs"
            r4.putExtra(r5, r9)
            r5 = -255(0xffffffffffffff01, float:NaN)
            java.lang.String r7 = "type"
            r4.putExtra(r7, r5)
            java.lang.String r5 = "getA8KeyScene"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r2)
            if (r54 != 0) goto L_0x07d2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            r13 = 2
            goto L_0x07d7
        L_0x07d2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            r13 = 45
        L_0x07d7:
            java.lang.String r1 = "geta8key_scene"
            r4.putExtra(r1, r13)
            java.lang.String r1 = r0.UserName
            java.lang.String r3 = "geta8key_username"
            r4.putExtra(r3, r1)
            java.lang.String r0 = r0.f283893Id
            java.lang.String r1 = "serverMsgID"
            r4.putExtra(r1, r0)
            di3.d r0 = di3.C86312j.m106911c(r22)
            om.f r0 = (p214om.C11502f) r0
            wc3.z r0 = r0.mo11462yM()
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            r0.mo93190w(r4, r14)
            goto L_0x080b
        L_0x07fb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
            return
        L_0x07ff:
            r2 = r7
            r1 = r15
            java.lang.String r0 = "appInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
            return
        L_0x080a:
            r2 = r7
        L_0x080b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123095c(android.view.View, int):void");
    }

    /* renamed from: d */
    public static void m123096d(Context context, C95787g0 g0Var, C94851d1 d1Var) {
        Context context2 = context;
        C95787g0 g0Var2 = g0Var;
        SnsMethodCalculate.markStartTimeMs("cardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var2.f279450a;
        if (timeLineObject.ContentObj.f298427h.size() > 0) {
            SnsInfo DN = C94866e1.Yx0().mo139798DN(g0Var2.f279451b);
            if (m123089H(d1Var)) {
                d1Var.mo130970a().mo131335v(DN);
            }
            String str = timeLineObject.ContentObj.f298427h.get(0).f298703u;
            Intent intent = new Intent();
            intent.putExtra("key_from_scene", 12);
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("#");
                if (split.length >= 2) {
                    Log.m105924i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData[0]:" + split[0]);
                    intent.putExtra("key_card_id", split[0]);
                    intent.putExtra("key_card_ext", split[1]);
                    C88144b.m109791i(context2, "card", ".ui.CardDetailUI", intent, (Bundle) null);
                } else if (split.length == 1) {
                    Log.m105924i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData not include cardExt");
                    Log.m105924i("MicroMsg.TimeLineClickEvent", "cardRediretListener card_id :" + str);
                    intent.putExtra("key_card_id", split[0]);
                    intent.putExtra("key_card_ext", "");
                    C88144b.m109791i(context2, "card", ".ui.CardDetailUI", intent, (Bundle) null);
                } else {
                    Log.m105924i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData not include card_id and cardExt");
                    Log.m105924i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData :" + str);
                }
            } else {
                Log.m105924i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData is empty");
            }
        }
        m123087F(g0Var);
        SnsMethodCalculate.markEndTimeMs("cardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: e */
    public static void m123097e(View view) {
        String str;
        String str2;
        C64378fw2 fw22;
        C64682rk1 rk12;
        View view2 = view;
        Class<C60200t1> cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("clickFinderMedia", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        if (view.getTag() == null || !(view.getTag() instanceof TimeLineObject)) {
            str = "clickFinderMedia";
            str2 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent";
        } else if (!WeChatBrands.Business.Entries.MomentChannels.checkAvailable(view.getContext())) {
            SnsMethodCalculate.markEndTimeMs("clickFinderMedia", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        } else {
            if (m123089H(f280582z) && view2.getTag(C0966R.C0970id.oo7) != null) {
                f280582z.mo130970a().mo131335v((SnsInfo) view2.getTag(C0966R.C0970id.oo7));
            }
            Context context = view.getContext();
            TimeLineObject timeLineObject = (TimeLineObject) view.getTag();
            C101789j00 j002 = timeLineObject.ContentObj;
            String str3 = "clickFinderMedia";
            String str4 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent";
            if (j002 == null || (rk12 = j002.f298431o) == null) {
                Class<C60200t1> cls2 = cls;
                String str5 = "key_finder_teen_mode_check";
                Context context2 = context;
                if (!(j002 == null || (fw22 = j002.f298436t) == null)) {
                    long B0 = C102236a0.m134706B0(fw22.f183241d);
                    if (B0 != 0) {
                        Intent intent = new Intent();
                        intent.putExtra("report_scene", 3);
                        intent.putExtra("from_user", timeLineObject.UserName);
                        intent.putExtra("feed_object_id", B0);
                        intent.putExtra("feed_object_nonceId", timeLineObject.ContentObj.f298436t.f183248n);
                        intent.putExtra("business_type", 1);
                        intent.putExtra("key_from_user_name", timeLineObject.UserName);
                        intent.putExtra("key_ec_source", timeLineObject.ContentObj.f298431o.f185182E);
                        intent.putExtra("tab_type", 5);
                        intent.putExtra("key_comment_scene", 53);
                        intent.putExtra(str5, ((C60200t1) C86312j.m106911c(cls2)).mo76861l7().mo83771R5());
                        intent.putExtra("key_finder_teen_mode_scene", 3);
                        intent.putExtra("key_finder_teen_mode_user_name", timeLineObject.ContentObj.f298436t.f183243f);
                        intent.putExtra("key_finder_teen_mode_user_id", timeLineObject.ContentObj.f298436t.f183242e);
                        ((C60200t1) C86312j.m106911c(cls2)).mo76842e7(4, 2, 38, intent);
                        ((C60200t1) C86312j.m106911c(cls2)).mo76864nr(context2, intent);
                    }
                }
            } else {
                Context context3 = context;
                long B02 = C102236a0.m134706B0(rk12.f185183d);
                String str6 = "key_finder_teen_mode_check";
                long j = timeLineObject.ContentObj.f298431o.f185192p;
                int i = (B02 > 0 ? 1 : (B02 == 0 ? 0 : -1));
                if (!(i == 0 && j == 0)) {
                    Intent intent2 = new Intent();
                    Class<C60200t1> cls3 = cls;
                    intent2.putExtra("report_scene", 3);
                    intent2.putExtra("from_user", timeLineObject.UserName);
                    intent2.putExtra("feed_object_id", B02);
                    intent2.putExtra("feed_object_nonceId", timeLineObject.ContentObj.f298431o.f185191o);
                    intent2.putExtra("business_type", 0);
                    intent2.putExtra("finder_user_name", timeLineObject.ContentObj.f298431o.f185184e);
                    intent2.putExtra("key_from_user_name", timeLineObject.UserName);
                    intent2.putExtra("key_ec_source", timeLineObject.ContentObj.f298431o.f185182E);
                    intent2.putExtra("tab_type", 5);
                    intent2.putExtra("key_comment_scene", 38);
                    intent2.putExtra("feed_local_id", j);
                    intent2.putExtra("KEY_AUTHORIZATION_CONTENT", C68070l.C68072b.m80420s(m123113u(timeLineObject.ContentObj.f298431o), (String) null, (C98121d) null));
                    intent2.putExtra("KEY_FINDER_FORWARD_SOURCE", timeLineObject.ContentObj.f298431o.f185180C);
                    intent2.putExtra(str6, ((C60200t1) C86312j.m106911c(cls3)).mo76861l7().mo83771R5());
                    intent2.putExtra("key_finder_teen_mode_scene", 3);
                    intent2.putExtra("key_finder_teen_mode_user_name", C102236a0.m134703A(timeLineObject.ContentObj.f298431o));
                    intent2.putExtra("key_finder_teen_mode_user_id", timeLineObject.ContentObj.f298431o.f185184e);
                    if (i == 0 && j != 0) {
                        intent2.putExtra("key_posting_scene", true);
                    }
                    ((C31570b) C86312j.m106911c(C31570b.class)).mo8445ge(intent2, view, 280);
                    C60188n4 n4Var = (C60188n4) C86312j.m106911c(C60188n4.class);
                    if (!n4Var.mo75337Fv() || !n4Var.k90()) {
                        ((C60200t1) C86312j.m106911c(cls3)).mo76842e7(4, 2, 38, intent2);
                        ((C60200t1) C86312j.m106911c(cls3)).mo76864nr(context3, intent2);
                    } else {
                        intent2.putExtra("KEY_OBJECT_ID", C61926c.m72671P(timeLineObject.ContentObj.f298431o.f185183d));
                        intent2.putExtra("KEY_OBJECT_NONCE_ID", timeLineObject.ContentObj.f298431o.f185191o);
                        intent2.putExtra("FROM_SCENE_KEY", 6);
                        intent2.putExtra("KEY_FINDER_POST_FINISH_JUMP_HOT_TAB", true);
                        ((C60200t1) C86312j.m106911c(cls3)).mo76842e7(4, 2, 20, intent2);
                        ((C60200t1) C86312j.m106911c(cls3)).Hm0(context3, intent2);
                    }
                }
            }
            str = str3;
            str2 = str4;
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    /* renamed from: f */
    public static void m123098f(View view, int i, n8$$g0 n8__g0) {
        SnsMethodCalculate.markStartTimeMs("clickMediaIcon", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        boolean z = view.getTag() instanceof C95787g0;
        Log.m105918d("MicroMsg.TimeLineClickEvent", "musicRedirectListener click " + z);
        if (!z) {
            SnsMethodCalculate.markEndTimeMs("clickMediaIcon", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        C95787g0 g0Var = (C95787g0) view.getTag();
        Context context = view.getContext();
        Class cls = C100910b.class;
        Class cls2 = C34648o.class;
        SnsMethodCalculate.markStartTimeMs("playMusic", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        int i2 = 17;
        if (m123116x(timeLineObject.f283893Id)) {
            if (g0Var.f279454e != 0) {
                MvCardActionReportStruct mvCardActionReportStruct = new MvCardActionReportStruct();
                mvCardActionReportStruct.f156520l = mvCardActionReportStruct.mo86045b("FromSourceId", g0Var.f279450a.f283893Id, true);
                if (1 == g0Var.f279454e) {
                    i2 = 1;
                }
                mvCardActionReportStruct.f156518j = 2;
                mvCardActionReportStruct.f156519k = (long) i2;
                ((C34648o) C86312j.m106911c(cls2)).mo59203Jr(mvCardActionReportStruct);
            }
            C115669n.INSTANCE.kvStat(10231, String.valueOf(1));
            C101093a.m132490l();
        } else if (!C61104a.m71669y(context) && !C61104a.m71665u(context) && !C61104a.m71649e(context)) {
            C115669n.INSTANCE.kvStat(10090, "1,0");
            if (timeLineObject.ContentObj.f298427h.size() > 0) {
                C101804kv2 kv22 = timeLineObject.ContentObj.f298427h.get(0);
                if (i == 0) {
                    C91998s.m115550d(738);
                } else {
                    C91998s.m115549c(738);
                }
                String str = kv22.f298697o;
            }
            if (g0Var.f279452c) {
                MMHandlerThread.postToMainThread(new C101104g(((C100910b) C86312j.m106911c(cls)).Qn0(C94866e1.xx0(), timeLineObject, 9)));
            } else {
                C101789j00 j002 = timeLineObject.ContentObj;
                C101093a.m132488j(((C100910b) C86312j.m106911c(cls)).Au0(C94866e1.xx0(), timeLineObject, 1, C62602o.m73561a(timeLineObject.f283893Id, j002 != null ? j002.f298439w : null)));
            }
            if (g0Var.f279454e != 0) {
                MvCardActionReportStruct mvCardActionReportStruct2 = new MvCardActionReportStruct();
                mvCardActionReportStruct2.f156520l = mvCardActionReportStruct2.mo86045b("FromSourceId", g0Var.f279450a.f283893Id, true);
                if (1 == g0Var.f279454e) {
                    i2 = 1;
                }
                mvCardActionReportStruct2.f156518j = 1;
                mvCardActionReportStruct2.f156519k = (long) i2;
                ((C34648o) C86312j.m106911c(cls2)).mo59203Jr(mvCardActionReportStruct2);
            }
        }
        if (n8__g0 != null) {
            n8__g0.mo132640a();
        }
        SnsMethodCalculate.markEndTimeMs("playMusic", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        SnsMethodCalculate.markEndTimeMs("clickMediaIcon", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: g */
    public static void m123099g(View view) {
        C101804kv2 kv22;
        C101833r5 r5Var;
        SnsMethodCalculate.markStartTimeMs("clickMusicItem", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        Context context = view.getContext();
        if (view.getTag() != null && (view.getTag() instanceof C95787g0)) {
            if (!((C60200t1) C86312j.m106911c(C60200t1.class)).mo76822Vm()) {
                SnsMethodCalculate.markEndTimeMs("clickMusicItem", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            }
            TimeLineObject timeLineObject = ((C95787g0) view.getTag()).f279450a;
            int i = ((C95787g0) view.getTag()).f279454e;
            int i2 = timeLineObject.ContentObj.f298424e;
            boolean z = i2 == 42;
            if (!z && (r5Var = timeLineObject.AppInfo) != null) {
                z = i2 == 4 && C87412m.m108589b("wx5aa333606550dfd5", r5Var.f299236d);
            }
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(z);
            objArr[1] = Integer.valueOf(timeLineObject.ContentObj.f298424e);
            C101833r5 r5Var2 = timeLineObject.AppInfo;
            objArr[2] = r5Var2 == null ? "" : r5Var2.f299236d;
            Log.m105925i("MicroMsg.TimeLineClickEvent", "canEnterMv:%b, type:%d, appId:%s", objArr);
            if (z) {
                if (m123089H(f280582z)) {
                    f280582z.mo130970a().mo131335v(C94866e1.Yx0().mo139798DN(((C95787g0) view.getTag()).f279451b));
                }
                if (!m123116x(timeLineObject.f283893Id)) {
                    C101789j00 j002 = timeLineObject.ContentObj;
                    C64719t23 t232 = j002 != null ? j002.f298439w : null;
                    if (t232 != null) {
                        try {
                            C64719t23 t233 = new C64719t23();
                            t233.parseFrom(t232.toByteArray());
                            C101093a.m132488j(((C100910b) C86312j.m106911c(C100910b.class)).Au0(C94866e1.xx0(), timeLineObject, 1, C62602o.m73561a(timeLineObject.f283893Id, t233)));
                        } catch (IOException e) {
                            Log.m105920e("MicroMsg.TimeLineClickEvent", "playMvMusic fail: " + e.getLocalizedMessage());
                        }
                    }
                }
                Intent intent = new Intent();
                intent.putExtra("key_scene", 7);
                if (!timeLineObject.ContentObj.f298427h.isEmpty() && (kv22 = timeLineObject.ContentObj.f298427h.get(0)) != null) {
                    intent.putExtra("key_mv_song_name", kv22.f298697o);
                    intent.putExtra("key_mv_song_lyric", kv22.f298683Q);
                    intent.putExtra("key_mv_album_cover_url", kv22.f298682P);
                }
                C64719t23 t234 = timeLineObject.ContentObj.f298439w;
                if (t234 != null) {
                    intent.putExtra("key_mv_feed_id", t234.f185459d);
                    intent.putExtra("key_mv_nonce_id", t234.f185460e);
                    intent.putExtra("key_mv_cover_url", t234.f185461f);
                    intent.putExtra("key_mv_poster", t234.f185462g);
                    intent.putExtra("key_mv_singer_name", t234.f185463h);
                    intent.putExtra("key_mv_album_name", t234.f185464i);
                    intent.putExtra("key_mv_music_genre", t234.f185466n);
                    intent.putExtra("key_mv_issue_date", String.valueOf(t234.f185467o));
                    intent.putExtra("key_mv_identification", t234.f185468p);
                    intent.putExtra("key_mv_extra_info", t234.f185465j);
                    intent.putExtra("key_mv_music_duration", t234.f185469q);
                    intent.putExtra("key_mv_thumb_path", t234.f185472t);
                    intent.putExtra("key_mv_music_operation_url", t234.f185471s);
                    intent.putExtra("key_mv_song_mid", t234.f185470r);
                }
                intent.setFlags(268435456);
                C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).mo72357nb(context, "MusicMvMainUI", 7, C64793w23.class);
                w232.f186033d = 1;
                if (i == 2) {
                    w232.f186033d = 17;
                }
                String uuid = UUID.randomUUID().toString();
                C87412m.m108593f(uuid, "randomUUID().toString()");
                w232.f186034e = uuid;
                w232.f186035f = 85;
                w232.f186036g = timeLineObject.f283893Id;
                try {
                    intent.putExtra("key_mv_report_data", w232.toByteArray());
                } catch (IOException e2) {
                    Log.printErrStackTrace("MicroMsg.TimeLineClickEvent", e2, "", new Object[0]);
                }
                C88144b.m109791i(context, "mv", ".ui.MusicMvMainUI", intent, (Bundle) null);
                SnsMethodCalculate.markEndTimeMs("clickMusicItem", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            }
            m123088G(timeLineObject.UserName, ((C95787g0) view.getTag()).f279451b, -1);
        }
        SnsMethodCalculate.markEndTimeMs("clickMusicItem", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: h */
    public static void m123100h(C95787g0 g0Var, Context context, C94851d1 d1Var) {
        SnsMethodCalculate.markStartTimeMs("designerClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        if (timeLineObject.ContentObj.f298427h.size() > 0) {
            SnsInfo DN = C94866e1.Yx0().mo139798DN(g0Var.f279451b);
            if (m123089H(d1Var)) {
                d1Var.mo130970a().mo131335v(DN);
            }
            String str = timeLineObject.ContentObj.f298427h.get(0).f298703u;
            Intent intent = new Intent();
            intent.putExtra("sns_object_data", str);
            intent.putExtra("extra_scence", 13);
            C88144b.m109791i(context, "emoji", ".ui.v2.EmojiStoreV2DesignerUI", intent, (Bundle) null);
        }
        m123087F(g0Var);
        SnsMethodCalculate.markEndTimeMs("designerClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: i */
    public static void m123101i(C95787g0 g0Var, Context context, C94851d1 d1Var) {
        SnsMethodCalculate.markStartTimeMs("emojiListClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        if (timeLineObject.ContentObj.f298427h.size() > 0) {
            SnsInfo DN = C94866e1.Yx0().mo139798DN(g0Var.f279451b);
            if (m123089H(d1Var)) {
                d1Var.mo130970a().mo131335v(DN);
            }
            String str = timeLineObject.ContentObj.f298427h.get(0).f298703u;
            Intent intent = new Intent();
            intent.putExtra("sns_object_data", str);
            C88144b.m109791i(context, "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", intent, (Bundle) null);
        }
        m123087F(g0Var);
        SnsMethodCalculate.markEndTimeMs("emojiListClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: j */
    public static void m123102j(C95787g0 g0Var, Context context, C94851d1 d1Var) {
        SnsMethodCalculate.markStartTimeMs("emojiShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        if (timeLineObject.ContentObj.f298427h.size() > 0) {
            SnsInfo DN = C94866e1.Yx0().mo139798DN(g0Var.f279451b);
            if (m123089H(d1Var)) {
                d1Var.mo130970a().mo131335v(DN);
            }
            String str = timeLineObject.ContentObj.f298427h.get(0).f298703u;
            Intent intent = new Intent();
            intent.putExtra("sns_object_data", str);
            intent.putExtra("preceding_scence", 10);
            intent.putExtra("download_entrance_scene", 13);
            C88144b.m109791i(context, "emoji", ".ui.EmojiStoreDetailUI", intent, (Bundle) null);
        }
        m123087F(g0Var);
        SnsMethodCalculate.markEndTimeMs("emojiShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00da  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m123103k(com.tencent.p014mm.plugin.sns.p106ui.C95787g0 r11, android.content.Context r12, com.tencent.p014mm.plugin.sns.model.C94851d1 r13) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "emotionListClick"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r11.f279450a
            te3.j00 r4 = r3.ContentObj
            java.util.LinkedList<te3.kv2> r4 = r4.f298427h
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x00f1
            os2.e0 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r5 = r11.f279451b
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r4.mo139798DN(r5)
            boolean r5 = m123089H(r13)
            if (r5 == 0) goto L_0x002c
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r13 = r13.mo130970a()
            r13.mo131335v(r4)
        L_0x002c:
            te3.j00 r13 = r3.ContentObj
            java.util.LinkedList<te3.kv2> r13 = r13.f298427h
            r3 = 0
            java.lang.Object r13 = r13.get(r3)
            te3.kv2 r13 = (te3.C101804kv2) r13
            java.lang.String r13 = r13.f298703u
            java.lang.String r4 = "xml"
            r5 = 0
            java.util.Map r4 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r13, r4, r5)
            java.lang.String r6 = ".xml.tid"
            java.lang.Object r6 = r4.get(r6)     // Catch:{ Exception -> 0x009f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x009f }
            com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r6)     // Catch:{ Exception -> 0x009f }
            java.lang.String r6 = ".xml.title"
            java.lang.Object r6 = r4.get(r6)     // Catch:{ Exception -> 0x009f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x009f }
            if (r6 != 0) goto L_0x0057
            r6 = r0
        L_0x0057:
            java.lang.String r7 = ".xml.desc"
            java.lang.Object r7 = r4.get(r7)     // Catch:{ Exception -> 0x009c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x009c }
            if (r7 != 0) goto L_0x0062
            r7 = r0
        L_0x0062:
            java.lang.String r8 = ".xml.iconUrl"
            java.lang.Object r8 = r4.get(r8)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0099 }
            if (r8 != 0) goto L_0x006d
            r8 = r0
        L_0x006d:
            java.lang.String r9 = ".xml.secondUrl"
            java.lang.Object r9 = r4.get(r9)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0097 }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r0)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r10 = "nullAs(maps[\".xml.secondUrl\"], \"\")"
            gy3.C87412m.m108593f(r9, r10)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r9 = ".xml.pageType"
            java.lang.Object r9 = r4.get(r9)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0097 }
            com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r9)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r9 = ".xml.setKey"
            java.lang.Object r4 = r4.get(r9)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0097 }
            if (r4 != 0) goto L_0x0095
            goto L_0x00b3
        L_0x0095:
            r0 = r4
            goto L_0x00b3
        L_0x0097:
            r4 = move-exception
            goto L_0x00a3
        L_0x0099:
            r4 = move-exception
            r8 = r0
            goto L_0x00a3
        L_0x009c:
            r4 = move-exception
            r7 = r0
            goto L_0x00a2
        L_0x009f:
            r4 = move-exception
            r6 = r0
            r7 = r6
        L_0x00a2:
            r8 = r7
        L_0x00a3:
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r4 = r4.toString()
            r9[r3] = r4
            java.lang.String r3 = "MicroMsg.EmotionSnsShareObject"
            java.lang.String r4 = "fromXml exception. %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r9)
        L_0x00b3:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r4 = "emoji"
            if (r3 != 0) goto L_0x00da
            android.content.Intent r13 = new android.content.Intent
            r13.<init>()
            java.lang.String r3 = "extra_ip_set_key"
            r13.putExtra(r3, r0)
            java.lang.String r0 = "EXTRA_IP_SET_NAME"
            r13.putExtra(r0, r6)
            java.lang.String r0 = "EXTRA_IP_SET_DESC"
            r13.putExtra(r0, r7)
            java.lang.String r0 = "EXTRA_IP_SET_URL"
            r13.putExtra(r0, r8)
            java.lang.String r0 = ".ui.EmojiDesignerIPInfoUI"
            ke3.C88144b.m109791i(r12, r4, r0, r13, r5)
            goto L_0x00f1
        L_0x00da:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r3 = "sns_object_data"
            r0.putExtra(r3, r13)
            r13 = 13
            java.lang.String r3 = "extra_scence"
            r0.putExtra(r3, r13)
            java.lang.String r13 = ".ui.EmojiStoreTopicUI"
            ke3.C88144b.m109791i(r12, r4, r13, r0, r5)
        L_0x00f1:
            m123087F(r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123103k(com.tencent.mm.plugin.sns.ui.g0, android.content.Context, com.tencent.mm.plugin.sns.model.d1):void");
    }

    /* renamed from: l */
    public static void m123104l(Context context, TimeLineObject timeLineObject, long j, long j2, String str, Boolean bool) {
        int i;
        TimeLineObject timeLineObject2 = timeLineObject;
        long j3 = j2;
        Class cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("enterFinderLiveVisitorUI", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        String str2 = timeLineObject2.UserName;
        if (str2 == null) {
            str2 = "";
        }
        C64208c.f181958h = str2;
        C64208c.f181959i = timeLineObject2.f283893Id;
        ((C61130g) C86312j.m106911c(C61130g.class)).mo33246ry("temp_6");
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(cls);
        C64623p81 p812 = timeLineObject2.ContentObj.f298435s;
        String str3 = "";
        String str4 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent";
        String str5 = "enterFinderLiveVisitorUI";
        t1Var.jm0(j2, j, p812.f184779e, -1, -1, 7, "temp_6", p812.f184791t == 1 ? 1 : 2, ((C62120e) C86312j.m106911c(C62120e.class)).Oc0(), C64208c.f181958h, C64208c.f181959i, System.currentTimeMillis(), 1);
        String R1 = ((C60200t1) C86312j.m106911c(cls)).mo76802R1(4, 2, 65);
        Intent intent = new Intent();
        long j4 = j2;
        intent.putExtra("CURRENT_FEED_ID", j4);
        intent.putExtra("LAUNCH_WITH_ANIM", bool);
        intent.putExtra("key_enter_live_param_share_username", C64208c.f181958h);
        intent.putExtra("key_enter_live_param_from_share_scene", 0);
        intent.putExtra("key_enter_live_param_from_share_scene_new", 2);
        intent.putExtra("key_enter_live_param_visitor_enter_scene", 2);
        String str6 = timeLineObject2.ContentObj.f298435s.f184794w;
        if (str6 == null) {
            str6 = str3;
        }
        intent.putExtra("key_enter_live_param_ecsource", str6);
        String str7 = timeLineObject2.ContentObj.f298435s.f184765I;
        if (str7 == null || str7.isEmpty() || !Objects.equals(timeLineObject2.ContentObj.f298435s.f184768L, "1")) {
            i = 0;
        } else {
            C64855yf1 yf12 = new C64855yf1();
            C64623p81 p813 = timeLineObject2.ContentObj.f298435s;
            yf12.f186510e = p813.f184765I;
            yf12.f186509d = p813.f184764H;
            yf12.f186512g = p813.f184767K;
            yf12.f186511f = p813.f184766J;
            try {
                intent.putExtra("KEY_ENTER_LIVE_PARAM_OLYMPIC_FIRE_AUTHOR_INFO", yf12.toByteArray());
            } catch (IOException unused) {
            }
            i = 1;
        }
        int i2 = C10412u.f31640a;
        intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 4);
        if (!Util.isNullOrNil(timeLineObject2.ContentObj.f298435s.f184768L)) {
            C64700s53 s532 = new C64700s53();
            int i3 = C61164r.f174124a;
            s532.f185345d = 6;
            String str8 = timeLineObject2.UserName;
            if (str8 == null) {
                str8 = str3;
            }
            s532.f185347f = str8;
            s532.f185349h = i;
        }
        C64238ap2 ap22 = new C64238ap2();
        ap22.f182124d = j4;
        ap22.f182125e = j;
        C64623p81 p814 = timeLineObject2.ContentObj.f298435s;
        ap22.f182126f = p814.f184790s;
        ap22.f182127g = p814.f184779e;
        String str9 = str3;
        ap22.f182128h = str9;
        ap22.f182129i = p814.f184782h;
        ap22.f182130j = p814.f184761E;
        C64279c90 c902 = new C64279c90();
        c902.f182444d = R1;
        c902.f182445e = str9;
        c902.f182447g = -1;
        c902.f182448h = -1;
        c902.f182449i = 1;
        ((C10649f) C86312j.m106911c(C10649f.class)).mo10916tP(context, intent, ap22, ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83771R5(), c902, (C10649f.C10650a) null);
        SnsMethodCalculate.markEndTimeMs(str5, str4);
    }

    /* renamed from: m */
    public static void m123105m(Context context, C95787g0 g0Var) {
        Context context2 = context;
        Class cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("finderAgreeClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        m123092K(g0Var);
        C101789j00 j002 = timeLineObject.ContentObj;
        int i = j002.f298437u;
        if (i != 3) {
            if (i != 100000000) {
                SnsMethodCalculate.markEndTimeMs("finderAgreeClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            } else if (j002.f298432p != null) {
                Intent intent = new Intent();
                intent.putExtra("key_topic_title", timeLineObject.ContentObj.f298432p.f185603d);
                intent.putExtra("key_topic_type", timeLineObject.ContentObj.f298432p.f185604e);
                C64311db1 db12 = new C64311db1();
                C64609ok1 ok12 = timeLineObject.ContentObj.f298432p.f185607h;
                db12.f182666i = ok12.f184668d;
                db12.f182661d = ok12.f184669e;
                db12.f182662e = ok12.f184670f;
                try {
                    intent.putExtra("key_topic_poi_location", db12.toByteArray());
                } catch (IOException unused) {
                    Log.m105920e("MicroMsg.TimeLineClickEvent", "location toByteArray exception");
                }
                intent.putExtra("key_from_user", timeLineObject.UserName);
                intent.putExtra("key_report_scene", 3);
                intent.putExtra("KEY_TAB_TYPE", 5);
                UUID.randomUUID().toString();
                intent.putExtra("key_finder_teen_mode_check", true);
                intent.putExtra("key_finder_teen_mode_scene", 3);
                intent.putExtra("key_finder_teen_mode_user_name", "");
                intent.putExtra("key_finder_teen_mode_user_id", "");
                ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 2, timeLineObject.ContentObj.f298432p.f185604e == 1 ? 22 : 26, intent);
                ((C60200t1) C86312j.m106911c(cls)).yt0(context, intent);
                SnsMethodCalculate.markEndTimeMs("finderAgreeClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            }
        }
        Context context3 = context;
        Intent intent2 = new Intent();
        intent2.putExtra("key_topic_title", timeLineObject.ContentObj.f298438v.f185603d);
        intent2.putExtra("key_topic_type", timeLineObject.ContentObj.f298438v.f185604e);
        C64311db1 db13 = new C64311db1();
        C64609ok1 ok13 = timeLineObject.ContentObj.f298438v.f185607h;
        db13.f182666i = ok13.f184668d;
        db13.f182661d = ok13.f184669e;
        db13.f182662e = ok13.f184670f;
        try {
            intent2.putExtra("key_topic_poi_location", db13.toByteArray());
        } catch (IOException unused2) {
            Log.m105920e("MicroMsg.TimeLineClickEvent", "location toByteArray exception");
        }
        intent2.putExtra("key_finder_teen_mode_check", true);
        intent2.putExtra("key_from_user", timeLineObject.UserName);
        intent2.putExtra("key_report_scene", 3);
        intent2.putExtra("KEY_TAB_TYPE", 5);
        UUID.randomUUID().toString();
        C64258bf0 bf02 = timeLineObject.ContentObj.f298438v.f185609j;
        intent2.putExtra("key_activity_id", C61926c.m72671P(bf02.f182280d));
        intent2.putExtra("key_activity_name", bf02.f182281e);
        intent2.putExtra("key_nick_name", bf02.f182282f);
        intent2.putExtra("key_display_mask", bf02.f182284h);
        intent2.putExtra("key_cover_url", timeLineObject.ContentObj.f298438v.f185605f);
        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 2, 59, intent2);
        intent2.putExtra("key_activity_profile_src_type", "3");
        intent2.putExtra("key_entrance_type", 0);
        ((C60200t1) C86312j.m106911c(cls)).cl0(context3, intent2, 4);
        SnsMethodCalculate.markEndTimeMs("finderAgreeClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: n */
    public static void m123106n(Context context, C95787g0 g0Var) {
        SnsMethodCalculate.markStartTimeMs("finderColumnCardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        m123092K(g0Var);
        C64581nk1 nk12 = timeLineObject.ContentObj.f298434r;
        if (nk12 != null) {
            Intent intent = new Intent();
            intent.putExtra("TITLE_WORDING", nk12.f184476e);
            intent.putExtra("AUTO_REFRESH", true);
            try {
                intent.putExtra("FINDER_SHARE_ALBUM", nk12.toByteArray());
            } catch (IOException unused) {
            }
            intent.putExtra("STREAM_CARD_BUFFER", nk12.f184480i.mo123703f());
            intent.putExtra("GET_REL_SCENE", 14);
            intent.putExtra("COMMENT_SCENE", 51);
            intent.putExtra("CARD_ID", C102236a0.m134706B0(nk12.f184475d));
            intent.putExtra("SHARED_USERNAME", timeLineObject.UserName);
            intent.putExtra("FROM_SHARE_SCENE", 3);
            ((C60200t1) C86312j.m106911c(C60200t1.class)).dk0(context, intent);
            SnsMethodCalculate.markEndTimeMs("finderColumnCardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("finderColumnCardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: o */
    public static void m123107o(Context context, C95787g0 g0Var) {
        Class cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("finderFollowTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        m123092K(g0Var);
        if (timeLineObject.ContentObj.f298432p != null) {
            Intent intent = new Intent();
            intent.putExtra("key_topic_title", timeLineObject.ContentObj.f298432p.f185603d);
            intent.putExtra("KEY_FOLLOW_ID", timeLineObject.ContentObj.f298432p.f185608i);
            intent.putExtra("key_topic_type", timeLineObject.ContentObj.f298432p.f185604e);
            C64311db1 db12 = new C64311db1();
            C64609ok1 ok12 = timeLineObject.ContentObj.f298432p.f185607h;
            db12.f182666i = ok12.f184668d;
            db12.f182661d = ok12.f184669e;
            db12.f182662e = ok12.f184670f;
            try {
                intent.putExtra("key_topic_poi_location", db12.toByteArray());
            } catch (IOException unused) {
                Log.m105920e("MicroMsg.TimeLineClickEvent", "location toByteArray exception");
            }
            intent.putExtra("key_from_user", timeLineObject.UserName);
            intent.putExtra("key_report_scene", 3);
            intent.putExtra("KEY_TAB_TYPE", 5);
            UUID.randomUUID().toString();
            int i = timeLineObject.ContentObj.f298432p.f185604e;
            int i2 = 22;
            if (i != 1) {
                if (i == 2) {
                    i2 = 26;
                } else if (i == 4) {
                    i2 = 49;
                }
            }
            intent.putExtra("key_finder_teen_mode_scene", 3);
            intent.putExtra("key_finder_teen_mode_check", true);
            intent.putExtra("key_finder_teen_mode_user_name", "");
            intent.putExtra("key_finder_teen_mode_user_id", "");
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 2, i2, intent);
            ((C60200t1) C86312j.m106911c(cls)).yt0(context, intent);
            SnsMethodCalculate.markEndTimeMs("finderFollowTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("finderFollowTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: p */
    public static void m123108p(Context context, C95787g0 g0Var, View view) {
        long j;
        boolean z;
        View view2 = view;
        Class cls = C60200t1.class;
        Class cls2 = C61397g.class;
        SnsMethodCalculate.markStartTimeMs("finderLiveShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        m123092K(g0Var);
        long B0 = C102236a0.m134706B0(timeLineObject.ContentObj.f298435s.f184778d);
        long B02 = C102236a0.m134706B0(timeLineObject.ContentObj.f298435s.f184780f);
        if (B0 == 0 || B02 == 0) {
            SnsMethodCalculate.markEndTimeMs("finderLiveShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        if (view2 != null) {
            j = B02;
            z = ((C61397g) C86312j.m106911c(cls2)).Nj0(timeLineObject.ContentObj.f298435s.f184779e, view2.findViewById(C0966R.C0970id.dnt), view2.findViewById(C0966R.C0970id.dke), B0);
        } else {
            j = B02;
            z = ((C61397g) C86312j.m106911c(cls2)).Nj0(timeLineObject.ContentObj.f298435s.f184779e, (View) null, (View) null, B0);
        }
        if (z) {
            int i = C61160f.f174109a;
            int i2 = timeLineObject.ContentObj.f298435s.f184759C;
            ((C61397g) C86312j.m106911c(cls2)).mo83473AP(false, j, FirebaseAnalytics.C113378a.SHARE, ((i2 == 2 || i2 == 8 || i2 == 16) || timeLineObject.ContentObj.f298435s.f184759C == 6) ? 1 : 2, 3);
            Intent T5 = ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83773T5((Intent) null, FirebaseAnalytics.C113378a.SHARE, 3);
            C64623p81 p812 = timeLineObject.ContentObj.f298435s;
            ((C61397g) C86312j.m106911c(cls2)).mo83482aR(T5, context, j, B0, p812.f184779e, p812.f184790s, p812.f184782h, "", ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83771R5());
        } else if (Util.isEqual(C75592q0.m90778h(), timeLineObject.ContentObj.f298435s.f184779e)) {
            Intent intent = new Intent();
            intent.putExtra("KEY_PARAMS_SOURCE_TYPE", timeLineObject.ContentObj.f298435s.f184793v);
            Long valueOf = Long.valueOf(B0);
            C64623p81 p813 = timeLineObject.ContentObj.f298435s;
            ((C60606n) C86312j.m106911c(C60606n.class)).o90(intent, context, j, valueOf, p813.f184790s, p813.f184782h, "", "", "");
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("key_enter_live_param_visitor_enter_scene", 2);
            String str = timeLineObject.ContentObj.f298435s.f184794w;
            if (str == null) {
                str = "";
            }
            intent2.putExtra("key_enter_live_param_ecsource", str);
            int i3 = C10412u.f31640a;
            intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 4);
            C64238ap2 ap22 = new C64238ap2();
            ap22.f182124d = j;
            ap22.f182125e = B0;
            C64623p81 p814 = timeLineObject.ContentObj.f298435s;
            ap22.f182126f = p814.f184790s;
            ap22.f182127g = p814.f184779e;
            ap22.f182128h = "";
            ap22.f182129i = p814.f184782h;
            ap22.f182130j = null;
            C64279c90 c902 = new C64279c90();
            c902.f182444d = "";
            c902.f182445e = "";
            c902.f182447g = -1;
            c902.f182448h = -1;
            c902.f182449i = 1;
            ((C10649f) C86312j.m106911c(C10649f.class)).mo10916tP(context, intent2, ap22, ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83771R5(), c902, (C10649f.C10650a) null);
        }
        SnsMethodCalculate.markEndTimeMs("finderLiveShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: q */
    public static void m123109q(Context context, C95787g0 g0Var) {
        Class cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("finderMegaShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        m123092K(g0Var);
        long B0 = C102236a0.m134706B0(timeLineObject.ContentObj.f298436t.f183241d);
        if (B0 != 0) {
            Intent intent = new Intent();
            intent.putExtra("report_scene", 3);
            intent.putExtra("from_user", timeLineObject.UserName);
            intent.putExtra("feed_object_id", B0);
            intent.putExtra("feed_object_nonceId", timeLineObject.ContentObj.f298436t.f183248n);
            intent.putExtra("business_type", 1);
            intent.putExtra("key_from_user_name", timeLineObject.UserName);
            intent.putExtra("key_ec_source", timeLineObject.ContentObj.f298431o.f185182E);
            intent.putExtra("tab_type", 5);
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 2, 53, intent);
            ((C60200t1) C86312j.m106911c(cls)).mo76864nr(context, intent);
            SnsMethodCalculate.markEndTimeMs("finderMegaShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("finderMegaShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: r */
    public static void m123110r(Context context, C95787g0 g0Var) {
        Class cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("finderShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        m123092K(g0Var);
        long B0 = C102236a0.m134706B0(timeLineObject.ContentObj.f298431o.f185183d);
        long j = timeLineObject.ContentObj.f298431o.f185192p;
        int i = (B0 > 0 ? 1 : (B0 == 0 ? 0 : -1));
        if (!(i == 0 && j == 0)) {
            Intent intent = new Intent();
            intent.putExtra("report_scene", 3);
            intent.putExtra("from_user", timeLineObject.UserName);
            intent.putExtra("feed_object_id", B0);
            intent.putExtra("feed_object_nonceId", timeLineObject.ContentObj.f298431o.f185191o);
            intent.putExtra("business_type", 0);
            intent.putExtra("finder_user_name", timeLineObject.ContentObj.f298431o.f185184e);
            intent.putExtra("key_from_user_name", timeLineObject.UserName);
            intent.putExtra("key_ec_source", timeLineObject.ContentObj.f298431o.f185182E);
            intent.putExtra("tab_type", 5);
            intent.putExtra("feed_local_id", j);
            intent.putExtra("KEY_AUTHORIZATION_CONTENT", C68070l.C68072b.m80420s(m123113u(timeLineObject.ContentObj.f298431o), (String) null, (C98121d) null));
            intent.putExtra("KEY_FINDER_FORWARD_SOURCE", timeLineObject.ContentObj.f298431o.f185180C);
            intent.putExtra("key_finder_teen_mode_check", ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83771R5());
            intent.putExtra("key_finder_teen_mode_scene", 3);
            intent.putExtra("key_finder_teen_mode_user_name", C102236a0.m134703A(timeLineObject.ContentObj.f298431o));
            intent.putExtra("key_finder_teen_mode_user_id", timeLineObject.ContentObj.f298431o.f185184e);
            if (i == 0 && j != 0) {
                intent.putExtra("key_posting_scene", true);
            }
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 2, 25, intent);
            ((C60200t1) C86312j.m106911c(cls)).mo76864nr(context, intent);
        }
        SnsMethodCalculate.markEndTimeMs("finderShareClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: s */
    public static void m123111s(Context context, C95787g0 g0Var) {
        Class cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("finderTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        m123092K(g0Var);
        if (timeLineObject.ContentObj.f298432p != null) {
            Intent intent = new Intent();
            intent.putExtra("key_topic_title", timeLineObject.ContentObj.f298432p.f185603d);
            intent.putExtra("key_topic_type", timeLineObject.ContentObj.f298432p.f185604e);
            C64311db1 db12 = new C64311db1();
            C64609ok1 ok12 = timeLineObject.ContentObj.f298432p.f185607h;
            db12.f182666i = ok12.f184668d;
            db12.f182661d = ok12.f184669e;
            db12.f182662e = ok12.f184670f;
            try {
                intent.putExtra("key_topic_poi_location", db12.toByteArray());
            } catch (IOException unused) {
                Log.m105920e("MicroMsg.TimeLineClickEvent", "location toByteArray exception");
            }
            intent.putExtra("key_from_user", timeLineObject.UserName);
            intent.putExtra("key_report_scene", 3);
            intent.putExtra("KEY_TAB_TYPE", 5);
            UUID.randomUUID().toString();
            intent.putExtra("key_finder_teen_mode_check", true);
            intent.putExtra("key_finder_teen_mode_scene", 3);
            intent.putExtra("key_finder_teen_mode_user_name", "");
            intent.putExtra("key_finder_teen_mode_user_id", "");
            intent.putExtra("key_entrance_type", 0);
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 2, timeLineObject.ContentObj.f298432p.f185604e == 1 ? 22 : 26, intent);
            ((C60200t1) C86312j.m106911c(cls)).yt0(context, intent);
            SnsMethodCalculate.markEndTimeMs("finderTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("finderTopicClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: t */
    public static void m123112t(Context context, C95787g0 g0Var) {
        SnsMethodCalculate.markStartTimeMs("gameShareCardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        if (timeLineObject.liteappInfo == null || timeLineObject.gameShareCardObject == null) {
            Log.m105920e("MicroMsg.TimeLineClickEvent", "liteappinfo or gamesharecardobject is null");
            SnsMethodCalculate.markEndTimeMs("gameShareCardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        String str = timeLineObject.f283893Id;
        String str2 = timeLineObject.AppInfo.f299236d;
        C101815ms1 ms12 = timeLineObject.gameShareCardObject;
        ((C77050b) C86312j.m106911c(C77050b.class)).u10(str, str2, ms12.f298869f, ms12.f298868e, 2);
        if (Util.isNullOrNil(timeLineObject.liteappInfo.f298552d)) {
            SnsMethodCalculate.markEndTimeMs("gameShareCardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return;
        }
        String str3 = null;
        String str4 = timeLineObject.gameShareCardObject.f298871h;
        m123087F(g0Var);
        Bundle bundle = new Bundle();
        bundle.putString("appId", timeLineObject.liteappInfo.f298552d);
        if (!Util.isNullOrNil(timeLineObject.liteappInfo.f298553e)) {
            bundle.putString("path", timeLineObject.liteappInfo.f298553e);
        }
        if (!Util.isNullOrNil(timeLineObject.liteappInfo.f298554f)) {
            bundle.putString(SearchIntents.EXTRA_QUERY, timeLineObject.liteappInfo.f298554f);
        }
        C104289g gVar = new C104289g();
        try {
            if (!Util.isNullOrNil(str4)) {
                gVar.put("liteAppBizData", str4);
                str3 = new C104289g(str4).getString("wechat_pkgid");
            } else {
                gVar.put("liteAppBizData", "");
            }
            if (!Util.isNullOrNil(timeLineObject.gameShareCardObject.f298867d)) {
                gVar.put("shareData", timeLineObject.gameShareCardObject.f298867d);
            }
            if (!Util.isNullOrNil(timeLineObject.ContentObj.f298425f)) {
                gVar.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, timeLineObject.ContentObj.f298425f);
            }
            if (!Util.isNullOrNil(timeLineObject.gameShareCardObject.f298868e)) {
                gVar.put("gameShareId", timeLineObject.gameShareCardObject.f298868e);
            }
            gVar.mo145953n("isVideo", timeLineObject.gameShareCardObject.f298869f);
            gVar.mo145953n("duration", timeLineObject.gameShareCardObject.f298870g);
            gVar.mo145953n("sceneId", 1);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.TimeLineClickEvent", "johnjh liteapp jsonObject : " + e.toString());
        }
        if (!Util.isNullOrNil(str3)) {
            bundle.putString("pkgId", str3);
        }
        Context context2 = context;
        ((C14088e) C86312j.m106911c(C14088e.class)).mo13525ke(context2, bundle, false, gVar, (JSONArray) null, new n8$$x(C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.a4d), true, true, new n8$$w()), context));
        SnsMethodCalculate.markEndTimeMs("gameShareCardClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: u */
    public static C68070l.C68072b m123113u(C64682rk1 rk12) {
        SnsMethodCalculate.markStartTimeMs("getAppMsgContent", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        C68070l.C68072b bVar = new C68070l.C68072b();
        C60166f fVar = new C60166f();
        C87412m.m108594g(rk12, "<set-?>");
        fVar.f171710b = rk12;
        bVar.mo93545f(fVar);
        bVar.f195582i = 51;
        bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
        bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
        SnsMethodCalculate.markEndTimeMs("getAppMsgContent", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        return bVar;
    }

    /* renamed from: v */
    public static String m123114v(Context context, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getReditectUrl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        Log.m105918d("MicroMsg.TimeLineClickEvent", "url:" + str);
        String K3 = ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93142K3(str, "timeline");
        SnsMethodCalculate.markEndTimeMs("getReditectUrl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        return K3;
    }

    /* renamed from: w */
    public static void m123115w(C95787g0 g0Var, Context context, C94851d1 d1Var) {
        SnsMethodCalculate.markStartTimeMs("hardTvClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        TimeLineObject timeLineObject = g0Var.f279450a;
        if (timeLineObject.ContentObj.f298427h.size() > 0) {
            SnsInfo DN = C94866e1.Yx0().mo139798DN(g0Var.f279451b);
            if (m123089H(d1Var)) {
                d1Var.mo130970a().mo131335v(DN);
            }
            String str = timeLineObject.ContentObj.f298427h.get(0).f298703u;
            Intent intent = new Intent();
            intent.putExtra("key_TV_xml", str);
            intent.putExtra("key_TV_getProductInfoScene", 2);
            C88144b.m109791i(context, "shake", ".ui.TVInfoUI", intent, (Bundle) null);
        }
        m123087F(g0Var);
        SnsMethodCalculate.markEndTimeMs("hardTvClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: x */
    public static boolean m123116x(String str) {
        SnsMethodCalculate.markStartTimeMs("isTheSameId", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        MusicActionEvent musicActionEvent = new MusicActionEvent();
        musicActionEvent.f264920d.f264922a = -2;
        musicActionEvent.publish();
        C101106m mVar = musicActionEvent.f264921e.f264930a;
        if (mVar == null || !C101093a.m132482d(mVar) || !str.equals(mVar.f295960e) || !C101093a.m132481c()) {
            SnsMethodCalculate.markEndTimeMs("isTheSameId", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isTheSameId", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        return true;
    }

    /* renamed from: y */
    public static void m123117y(View view) {
        String str;
        int i;
        String str2;
        String str3;
        View view2 = view;
        Class cls = C60606n.class;
        Class cls2 = C61397g.class;
        Class cls3 = C60192p2.class;
        SnsMethodCalculate.markStartTimeMs("jumpToFinderLivePage", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        if (view.getTag() != null && (view.getTag() instanceof TimeLineObject)) {
            TimeLineObject timeLineObject = (TimeLineObject) view.getTag();
            Context context = view.getContext();
            long B0 = C102236a0.m134706B0(timeLineObject.ContentObj.f298435s.f184778d);
            long B02 = C102236a0.m134706B0(timeLineObject.ContentObj.f298435s.f184780f);
            if (!(B0 == 0 || B02 == 0)) {
                ImageView imageView = (ImageView) view2.findViewById(C0966R.C0970id.jtg);
                Boolean valueOf = Boolean.valueOf(((C60192p2) C86312j.m106911c(cls3)).Xl0());
                if (valueOf.booleanValue()) {
                    C64623p81 p812 = timeLineObject.ContentObj.f298435s;
                    SnsMethodCalculate.markStartTimeMs("getStreamUrl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                    C64273c21 c212 = p812.f184761E;
                    String str4 = "";
                    if (c212 == null || c212.f182384X == 1) {
                        SnsMethodCalculate.markEndTimeMs("getStreamUrl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                    } else if (p812.f184791t == 1) {
                        String str5 = c212.f182395g;
                        str3 = str5 != null ? str5 : str4;
                        SnsMethodCalculate.markEndTimeMs("getStreamUrl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                        str = str3;
                    } else {
                        SnsMethodCalculate.markEndTimeMs("getStreamUrl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                    }
                    str3 = str4;
                    str = str3;
                } else {
                    str = "";
                }
                String str6 = "jumpToFinderLivePage";
                String str7 = str;
                Boolean bool = valueOf;
                if (((C61397g) C86312j.m106911c(cls2)).Nj0(timeLineObject.ContentObj.f298435s.f184779e, view2.findViewById(C0966R.C0970id.dnt), view2.findViewById(C0966R.C0970id.dke), B0)) {
                    Class cls4 = C60200t1.class;
                    SnsMethodCalculate.markStartTimeMs("jumpToReplayLive", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                    Context context2 = view.getContext();
                    int i2 = C61160f.f174109a;
                    int i3 = timeLineObject.ContentObj.f298435s.f184759C;
                    ((C61397g) C86312j.m106911c(cls2)).mo83473AP(false, B02, FirebaseAnalytics.C113378a.SHARE, ((i3 == 2 || i3 == 8 || i3 == 16) || i3 == 6) ? 1 : 2, 3);
                    Intent T5 = ((C60200t1) C86312j.m106911c(cls4)).mo76861l7().mo83773T5((Intent) null, FirebaseAnalytics.C113378a.SHARE, 3);
                    Boolean valueOf2 = Boolean.valueOf(((C60606n) C86312j.m106911c(cls)).ih0(B0));
                    Log.m105924i("MicroMsg.TimeLineClickEvent", "jumpToReplayLive fluentSwitch " + bool + " validStatus = " + valueOf2);
                    if (imageView == null || !bool.booleanValue()) {
                        str2 = "jumpToReplayLive";
                        C64623p81 p813 = timeLineObject.ContentObj.f298435s;
                        ((C61397g) C86312j.m106911c(cls2)).mo83482aR(T5, context2, B02, B0, p813.f184779e, p813.f184790s, p813.f184782h, "", ((C60200t1) C86312j.m106911c(cls4)).mo76861l7().mo83771R5());
                    } else {
                        C61402b co = ((C60192p2) C86312j.m106911c(cls3)).mo85196co(view.getContext(), ((C60192p2) C86312j.m106911c(cls3)).mo85193Pz(C61401a.SNS_REPLAY, B02, (ViewGroup) imageView.getParent(), imageView, "", !((C60192p2) C86312j.m106911c(cls3)).mo85190I1(timeLineObject.ContentObj.f298435s.f184761E), timeLineObject.ContentObj.f298435s.f184761E));
                        if (co != null) {
                            str2 = "jumpToReplayLive";
                            co.mo84323h(new n8$$d(T5, B02, context2, B0, timeLineObject));
                        } else {
                            str2 = "jumpToReplayLive";
                            C64623p81 p814 = timeLineObject.ContentObj.f298435s;
                            ((C61397g) C86312j.m106911c(cls2)).mo83482aR(T5, context2, B02, B0, p814.f184779e, p814.f184790s, p814.f184782h, "", ((C60200t1) C86312j.m106911c(cls4)).mo76861l7().mo83771R5());
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                } else {
                    long j = B0;
                    String str8 = "MicroMsg.TimeLineClickEvent";
                    if (Util.isEqual(C75592q0.m90778h(), timeLineObject.ContentObj.f298435s.f184779e)) {
                        Intent intent = new Intent();
                        intent.putExtra("KEY_PARAMS_SOURCE_TYPE", timeLineObject.ContentObj.f298435s.f184793v);
                        Long valueOf3 = Long.valueOf(j);
                        C64623p81 p815 = timeLineObject.ContentObj.f298435s;
                        ((C60606n) C86312j.m106911c(cls)).o90(intent, context, B02, valueOf3, p815.f184790s, p815.f184782h, "", "", "");
                    } else {
                        Log.m105924i(str8, "finderLiveListener click fluentSwitch: " + bool + " streamUrl: " + str7 + " liveStatus = " + timeLineObject.ContentObj.f298435s.f184791t);
                        SnsMethodCalculate.markStartTimeMs("jumpToVisitorLive", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                        Context context3 = view.getContext();
                        if (timeLineObject.ContentObj.f298435s.f184791t != 1 || imageView == null || !bool.booleanValue()) {
                            i = 2;
                            m123104l(context3, timeLineObject, j, B02, str7, Boolean.FALSE);
                        } else {
                            i = 2;
                            C61402b Ui = ((C60192p2) C86312j.m106911c(cls3)).mo85194Ui(view.getContext(), ((C60192p2) C86312j.m106911c(cls3)).mo85193Pz(C61401a.SNS, B02, (ViewGroup) imageView.getParent(), imageView, str7, !((C60192p2) C86312j.m106911c(cls3)).mo85190I1(timeLineObject.ContentObj.f298435s.f184761E), timeLineObject.ContentObj.f298435s.f184761E));
                            if (Ui != null) {
                                Ui.mo84323h(new n8$$a(context3, timeLineObject, j, B02, str7));
                            } else {
                                m123104l(context3, timeLineObject, j, B02, str7, Boolean.FALSE);
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("jumpToVisitorLive", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                        HashMap hashMap = new HashMap();
                        hashMap.put("view_id", "live_room_card_share");
                        hashMap.put("live_share_type", Integer.valueOf(i));
                        ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("view_clk", view, hashMap, 26236);
                    }
                }
                SnsMethodCalculate.markEndTimeMs(str6, "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                return;
            }
        }
        SnsMethodCalculate.markEndTimeMs("jumpToFinderLivePage", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }

    /* renamed from: z */
    public static void m123118z(Context context, C95787g0 g0Var) {
        Context context2 = context;
        C95787g0 g0Var2 = g0Var;
        Class cls = C14088e.class;
        SnsMethodCalculate.markStartTimeMs("liteAppClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        Log.m105924i("MicroMsg.TimeLineClickEvent", "LiteApp Click");
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1293, 35, 1);
        TimeLineObject timeLineObject = g0Var2.f279450a;
        C101796jo2 jo22 = timeLineObject.liteappInfo;
        if (jo22 == null) {
            Log.m105920e("MicroMsg.TimeLineClickEvent", "appbrandRedirectListener username is null");
        } else {
            String str = jo22.f298552d;
            if (!Util.isNullOrNil(str)) {
                C101789j00 j002 = timeLineObject.ContentObj;
                boolean z = true;
                boolean z2 = j002 != null && !Util.isNullOrNil(j002.f298426g);
                if (z2 && !((C14088e) C86312j.m106911c(cls)).e00(str)) {
                    z = false;
                }
                if (!z) {
                    nVar.mo175913w(1293, 86, 1);
                } else {
                    m123087F(g0Var);
                    nVar.mo175913w(1293, 85, 1);
                    Bundle bundle = new Bundle();
                    bundle.putString("appId", timeLineObject.liteappInfo.f298552d);
                    if (!Util.isNullOrNil(timeLineObject.liteappInfo.f298553e)) {
                        bundle.putString("path", timeLineObject.liteappInfo.f298553e);
                    }
                    if (!Util.isNullOrNil(timeLineObject.liteappInfo.f298554f)) {
                        bundle.putString(SearchIntents.EXTRA_QUERY, timeLineObject.liteappInfo.f298554f);
                    }
                    ((C14088e) C86312j.m106911c(cls)).mo13510OP(context, bundle, true, false, new n8$$u(C76879j.m92723Q(context, context2.getString(C0966R.string.a3h), context2.getString(C0966R.string.a4d), true, true, new n8$$t()), z2, context2, g0Var2));
                    SnsMethodCalculate.markEndTimeMs("liteAppClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                    return;
                }
            }
        }
        View view = new View(context2);
        view.setTag(g0Var2);
        f280580B.onClick(view);
        SnsMethodCalculate.markEndTimeMs("liteAppClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
    }
}
