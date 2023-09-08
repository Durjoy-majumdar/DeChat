package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95108i0;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import ke3.C88144b;
import lp2.C46885f;
import nj3.C76912y0;
import np2.C100150a;
import np2.C117634b;
import ob0.C11385n;
import op2.C100371a;
import op2.C100372b;
import org.json.JSONObject;
import os2.C100417r0;
import p1035sf.C90183c;
import pp2.C47518b;
import pp2.C62489a;
import qo3.C89779i0;
import qp2.C101232a;
import qs2.C101271i0;
import rq2.C101424j;
import rq2.C63505q;
import so2.C101666b;
import uo2.C90717a;
import vr2.C102236a0;
import vr2.C102260r;
import ys2.C66696h;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a */
public class C94601a extends C95108i0 {

    /* renamed from: B */
    public C101666b f273761B;

    /* renamed from: C */
    public C89779i0 f273762C;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a$c */
    public static class C43025c implements C100372b, C11385n {

        /* renamed from: d */
        public C47518b f116472d;

        /* renamed from: a */
        public Bundle mo67224a(C47518b bVar, Bundle bundle) {
            SnsMethodCalculate.markStartTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponRemoteCall");
            try {
                String string = IntentUtil.getString(bundle, "COUPON_APP_ID");
                String string2 = IntentUtil.getString(bundle, "COUPON_STOCK_ID");
                String string3 = IntentUtil.getString(bundle, "COMP_ID");
                String string4 = IntentUtil.getString(bundle, "UX_INFO");
                this.f116472d = bVar;
                long currentTimeMillis = System.currentTimeMillis();
                C86709a0.m107524d().mo123455a(4743, this);
                C86709a0.m107524d().mo123460f(new C46885f(string, string2, string4, string3));
                Log.m105918d("SnsAd.CouponCardBtnComp", "CouponRemoteCall::the onServerCall is end, take time: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            } catch (Throwable unused) {
                Log.m105920e("SnsAd.CouponCardBtnComp", "CouponRemoteCall::onServerCall has something invalid!");
            }
            SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponRemoteCall");
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0072 A[Catch:{ all -> 0x0078 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r7, int r8, java.lang.String r9, ob0.C117747y r10) {
            /*
                r6 = this;
                java.lang.String r9 = "SnsAd.CouponCardBtnComp"
                java.lang.String r0 = "onSceneEnd"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponRemoteCall"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x0078 }
                r2.<init>()     // Catch:{ all -> 0x0078 }
                ob0.b0 r3 = f40.C86709a0.m107524d()     // Catch:{ all -> 0x0078 }
                r4 = 4743(0x1287, float:6.646E-42)
                r3.mo123470p(r4, r6)     // Catch:{ all -> 0x0078 }
                r3 = -1
                java.lang.String r4 = "call_ipc_result_key"
                if (r7 != 0) goto L_0x004f
                if (r8 != 0) goto L_0x004f
                boolean r5 = r10 instanceof lp2.C46885f     // Catch:{ all -> 0x0078 }
                if (r5 == 0) goto L_0x004f
                lp2.f r10 = (lp2.C46885f) r10     // Catch:{ all -> 0x0078 }
                te3.eu3 r7 = r10.mo72086k1()     // Catch:{ all -> 0x0078 }
                te3.y82 r7 = (te3.C52084y82) r7     // Catch:{ all -> 0x0078 }
                if (r7 == 0) goto L_0x0046
                java.lang.String r8 = "ret"
                int r10 = r7.f145173d     // Catch:{ all -> 0x0078 }
                r2.putInt(r8, r10)     // Catch:{ all -> 0x0078 }
                java.lang.String r8 = r7.f145174e     // Catch:{ all -> 0x0078 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0078 }
                if (r8 != 0) goto L_0x006e
                java.lang.String r8 = "msg"
                java.lang.String r7 = r7.f145174e     // Catch:{ all -> 0x0078 }
                r2.putString(r8, r7)     // Catch:{ all -> 0x0078 }
                goto L_0x006e
            L_0x0046:
                java.lang.String r7 = "CouponRemoteCall::onSceneEnd, the response is null!!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r7)     // Catch:{ all -> 0x0078 }
                r2.putInt(r4, r3)     // Catch:{ all -> 0x0078 }
                goto L_0x006e
            L_0x004f:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
                r10.<init>()     // Catch:{ all -> 0x0078 }
                java.lang.String r5 = "CouponRemoteCall::onSceneEnd is return error errType is "
                r10.append(r5)     // Catch:{ all -> 0x0078 }
                r10.append(r7)     // Catch:{ all -> 0x0078 }
                java.lang.String r7 = ", the error code is "
                r10.append(r7)     // Catch:{ all -> 0x0078 }
                r10.append(r8)     // Catch:{ all -> 0x0078 }
                java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x0078 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r7)     // Catch:{ all -> 0x0078 }
                r2.putInt(r4, r3)     // Catch:{ all -> 0x0078 }
            L_0x006e:
                pp2.b r7 = r6.f116472d     // Catch:{ all -> 0x0078 }
                if (r7 == 0) goto L_0x007d
                qp2.a r7 = (qp2.C101232a) r7     // Catch:{ all -> 0x0078 }
                r7.mo140694d(r2)     // Catch:{ all -> 0x0078 }
                goto L_0x007d
            L_0x0078:
                java.lang.String r7 = "CouponRemoteCall::onSceneEnd has something invalid!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r7)
            L_0x007d:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94601a.C43025c.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a$b */
    public static class C94603b implements C100371a {

        /* renamed from: a */
        public WeakReference<C94601a> f273772a;

        public C94603b(C94601a aVar) {
            this.f273772a = new WeakReference<>(aVar);
        }

        @C117634b
        /* renamed from: b */
        public void mo86295b(Bundle bundle) {
            C94601a aVar;
            SnsMethodCalculate.markStartTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponClientCall");
            Log.m105918d("SnsAd.CouponCardBtnComp", "the onCallbackFromServer running!");
            try {
                WeakReference<C94601a> weakReference = this.f273772a;
                if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
                    C94601a.m119688b0(aVar, bundle);
                }
            } catch (Throwable unused) {
                Log.m105918d("SnsAd.CouponCardBtnComp", "there is something wrong in client!");
            }
            SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponClientCall");
        }
    }

    public C94601a(Context context, C101666b bVar, ViewGroup viewGroup) {
        super(context, bVar, viewGroup);
        C101666b bVar2;
        this.f273761B = bVar;
        SnsMethodCalculate.markStartTimeMs("appendClickExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        try {
            C66696h.C66697a aVar = this.f276010t;
            if (!(aVar == null || (bVar2 = this.f273761B) == null)) {
                aVar.mo90729c("appId", bVar2.f297594Z);
                this.f276010t.mo90729c("stockId", this.f273761B.f297595a0);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("appendClickExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
    }

    /* renamed from: b0 */
    public static void m119688b0(C94601a aVar, Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("responseTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        try {
            C89779i0 i0Var = aVar.f273762C;
            if (i0Var != null && i0Var.isShowing()) {
                aVar.f273762C.dismiss();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        if (bundle != null) {
            int i = IntentUtil.getInt(bundle, "call_ipc_result_key", 0);
            Log.m105918d("SnsAd.CouponCardBtnComp", "the value is " + i);
            if (i == 0) {
                int i2 = IntentUtil.getInt(bundle, "ret", -1);
                String string = IntentUtil.getString(bundle, "msg");
                Log.m105918d("SnsAd.CouponCardBtnComp", "responseTo the msg is " + string + ", the ret is " + i2);
                aVar.mo130179d0(i2, string);
            } else {
                aVar.mo130179d0(-1, "");
            }
        }
        SnsMethodCalculate.markEndTimeMs("responseTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
    }

    /* renamed from: K */
    public void mo130177K() {
        SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        try {
            C100150a aVar = new C100150a();
            aVar.mo139441d(new C43025c());
            aVar.mo139440c(new C94603b(this));
            C62489a a = aVar.mo139438a();
            if (a != null) {
                mo130180e0();
                ((C101232a) a).mo140693c(mo130178c0());
            } else {
                Log.m105920e("SnsAd.CouponCardBtnComp", "the ipc request object is null, please check the log to find the reason!");
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
    }

    /* renamed from: c0 */
    public final Bundle mo130178c0() {
        SnsMethodCalculate.markStartTimeMs("makeRequestParam", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        C101666b bVar = this.f273761B;
        if (bVar == null) {
            SnsMethodCalculate.markEndTimeMs("makeRequestParam", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
            return null;
        }
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(bVar.f297594Z)) {
            bundle.putString("COUPON_APP_ID", bVar.f297594Z);
        }
        if (!TextUtils.isEmpty(bVar.f297595a0)) {
            bundle.putString("COUPON_STOCK_ID", bVar.f297595a0);
        }
        if (!TextUtils.isEmpty(bVar.f296495a)) {
            bundle.putString("COMP_ID", bVar.f296495a);
        }
        C101271i0 m = mo131854m();
        if (m != null) {
            String k = m.mo140744k();
            if (TextUtils.isEmpty(k)) {
                k = m.mo140745l();
            }
            if (!TextUtils.isEmpty(k)) {
                bundle.putString("UX_INFO", k);
            }
        }
        SnsMethodCalculate.markEndTimeMs("makeRequestParam", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        return bundle;
    }

    /* renamed from: d0 */
    public void mo130179d0(int i, String str) {
        AdClickActionInfo adClickActionInfo;
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        int i3 = -1;
        if (i2 == 0) {
            SnsMethodCalculate.markStartTimeMs("doOnReceiveSuccess", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
            String string = TextUtils.isEmpty(str) ? this.f276579d.getString(C0966R.string.j9u) : str;
            C76912y0.m92768g(this.f276579d, string);
            SnsMethodCalculate.markStartTimeMs("getReceiveAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
            C101666b bVar = this.f273761B;
            if (bVar == null) {
                SnsMethodCalculate.markEndTimeMs("getReceiveAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
                adClickActionInfo = null;
            } else {
                adClickActionInfo = bVar.f297596b0;
                SnsMethodCalculate.markEndTimeMs("getReceiveAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
            }
            if (adClickActionInfo != null) {
                int i4 = adClickActionInfo.f273641b;
                SnsMethodCalculate.markStartTimeMs("jumpByReceiveAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
                int i5 = adClickActionInfo.f273641b;
                boolean z = true;
                if (i5 == 15) {
                    Intent intent = new Intent();
                    intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f276579d.getString(C0966R.string.j9v));
                    C88144b.m109791i(this.f276579d, "card", ".ui.v4.CouponAndGiftCardListV4UI", intent, (Bundle) null);
                    SnsMethodCalculate.markEndTimeMs("jumpByReceiveAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
                } else if (i5 == 4) {
                    String str2 = mo131854m().mo140741h() + XVFSFile.PATH_SEPARATOR + mo131854m().mo140745l() + XVFSFile.PATH_SEPARATOR + AdLandingPagesProxy.getInstance().getSelfUserName() + XVFSFile.PATH_SEPARATOR + System.currentTimeMillis();
                    String b = C102260r.m134860b(adClickActionInfo.f273647e, AdLandingPagesProxy.getInstance().isWeAppAppendClickTime(mo131854m().mo140741h(), mo131854m().mo140742i()));
                    adClickActionInfo.f273647e = b;
                    C102236a0.m134759n0(this.f276579d, adClickActionInfo.f273645d, b, adClickActionInfo.f273649f + "", mo131854m().mo140735b(), mo131854m().mo140743j(), str2, mo131854m().mo140745l(), 1084);
                    SnsMethodCalculate.markEndTimeMs("jumpByReceiveAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
                } else {
                    if (i5 != 0 || C90183c.m112859g(adClickActionInfo.f273643c)) {
                        SnsMethodCalculate.markEndTimeMs("jumpByReceiveAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
                    } else {
                        Intent intent2 = ((SnsAdNativeLandingPagesUI) this.f276579d).getIntent();
                        if (intent2 == null) {
                            SnsMethodCalculate.markEndTimeMs("jumpByReceiveAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
                        } else {
                            C101424j.m133095a(this.f276579d, adClickActionInfo.f273643c, mo131854m(), intent2.getIntExtra("sns_landig_pages_from_source", 0), C100417r0.m131425n(intent2.getStringExtra("sns_landing_pages_share_sns_id")), mo131626O().f296495a);
                            SnsMethodCalculate.markEndTimeMs("jumpByReceiveAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
                        }
                    }
                    z = false;
                }
                if (z) {
                    i3 = i4;
                }
            }
            C63505q.m74843b(new C94602a(this, 0, string, i3));
            SnsMethodCalculate.markEndTimeMs("doOnReceiveSuccess", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        } else {
            SnsMethodCalculate.markStartTimeMs("doOnReceiveFailed", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
            String str3 = str;
            C63505q.m74843b(new C94602a(this, i2, str3, -1));
            C76912y0.m92767f(this.f276579d, TextUtils.isEmpty(str) ? this.f276579d.getString(C0966R.string.j9t) : str3);
            SnsMethodCalculate.markEndTimeMs("doOnReceiveFailed", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        }
        SnsMethodCalculate.markEndTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
    }

    /* renamed from: e0 */
    public final void mo130180e0() {
        SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        Context context = this.f276579d;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                if (this.f273762C == null) {
                    this.f273762C = C90717a.m113753f(this.f276579d, C0966R.string.j_k, (DialogInterface.OnCancelListener) null);
                }
                C89779i0 i0Var = this.f273762C;
                if (i0Var != null && !i0Var.isShowing()) {
                    this.f273762C.show();
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a$a */
    public static class C94602a implements C63505q.C63506a {

        /* renamed from: a */
        public String f273763a;

        /* renamed from: b */
        public String f273764b;

        /* renamed from: c */
        public String f273765c;

        /* renamed from: d */
        public String f273766d;

        /* renamed from: e */
        public String f273767e;

        /* renamed from: f */
        public int f273768f;

        /* renamed from: g */
        public String f273769g;

        /* renamed from: h */
        public int f273770h;

        /* renamed from: i */
        public int f273771i = -1;

        public C94602a(int i, String str) {
            this.f273768f = i;
            this.f273769g = Util.nullAs(str, "");
        }

        /* renamed from: a */
        public final void mo130181a(JSONObject jSONObject) {
            SnsMethodCalculate.markStartTimeMs("fillExt", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
            if (jSONObject != null) {
                try {
                    jSONObject.putOpt("appId", this.f273766d);
                    jSONObject.putOpt("stockId", this.f273767e);
                    jSONObject.putOpt("result", Integer.valueOf(this.f273768f));
                    jSONObject.putOpt("msg", this.f273769g);
                    jSONObject.putOpt(FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(this.f273770h));
                    jSONObject.putOpt("actionType", Integer.valueOf(this.f273771i));
                } catch (Throwable unused) {
                }
            }
            SnsMethodCalculate.markEndTimeMs("fillExt", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        }

        public String getChannel() {
            SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
            SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
            return "sns_ad_native_landing_page_coupon";
        }

        public String getContent() {
            SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
            JSONObject jSONObject = new JSONObject();
            SnsMethodCalculate.markStartTimeMs("fillContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
            try {
                jSONObject.putOpt("snsid", this.f273763a);
                jSONObject.putOpt("uxinfo", this.f273764b);
                jSONObject.putOpt("adExtInfo", this.f273765c);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.putOpt("extInfo", jSONObject2);
                mo130181a(jSONObject2);
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("fillContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
            String jSONObject3 = jSONObject.toString();
            SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
            return jSONObject3;
        }

        public C94602a(C94601a aVar, int i, String str, int i2) {
            String str2;
            if (aVar != null) {
                C101271i0 m = aVar.mo131854m();
                if (m != null) {
                    String h = m.mo140741h();
                    SnsMethodCalculate.markStartTimeMs("convertSnsId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
                    try {
                        str2 = C102236a0.m134765q0(C102260r.m134863c0(h));
                        SnsMethodCalculate.markEndTimeMs("convertSnsId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
                    } catch (Throwable unused) {
                        SnsMethodCalculate.markEndTimeMs("convertSnsId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
                        str2 = "";
                    }
                    this.f273763a = str2;
                    this.f273765c = Util.nullAs(m.mo140734a(), "");
                    String nullAs = Util.nullAs(m.mo140744k(), "");
                    this.f273764b = nullAs;
                    if (TextUtils.isEmpty(nullAs)) {
                        this.f273764b = Util.nullAs(m.mo140745l(), "");
                    }
                }
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
                C101666b bVar = aVar.f273761B;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
                if (bVar != null) {
                    this.f273766d = bVar.f297594Z;
                    this.f273767e = bVar.f297595a0;
                }
            }
            this.f273770h = 0;
            this.f273768f = i;
            this.f273769g = Util.nullAs(str, "");
            this.f273771i = i2;
        }
    }
}
