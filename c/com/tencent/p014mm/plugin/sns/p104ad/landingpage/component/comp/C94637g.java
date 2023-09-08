package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95108i0;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import io2.C98770a;
import io2.C98771b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import np2.C100150a;
import np2.C117634b;
import op2.C100371a;
import op2.C100372b;
import pp2.C47518b;
import pp2.C62489a;
import qo3.C89779i0;
import qp2.C101232a;
import qs2.C101271i0;
import rq2.C63505q;
import so2.C101673h;
import uo2.C90717a;
import vr2.C102236a0;
import ys2.C66696h;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g */
public class C94637g extends C95108i0 {

    /* renamed from: B */
    public final C101673h f273843B;

    /* renamed from: C */
    public C89779i0 f273844C;

    /* renamed from: D */
    public int f273845D = 0;

    /* renamed from: E */
    public int f273846E = 0;

    /* renamed from: F */
    public int f273847F = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g$a */
    public static class C94638a implements C100372b {

        /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g$a$a */
        public class C94639a implements C98771b.C98772a {

            /* renamed from: a */
            public final /* synthetic */ String f273848a;

            /* renamed from: b */
            public final /* synthetic */ C47518b f273849b;

            public C94639a(C94638a aVar, String str, C47518b bVar) {
                this.f273848a = str;
                this.f273849b = bVar;
            }

            /* renamed from: a */
            public void mo130218a(String str, int i, int i2, Object obj) {
                SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus$1");
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnAcquiringFinderLivingNoticeStatus onServerCall, sns id is ");
                    sb.append(this.f273848a);
                    sb.append(", inner snsId is ");
                    sb.append(str);
                    sb.append(", errorCode is ");
                    sb.append(i2);
                    sb.append(", data is ");
                    sb.append(obj instanceof Integer ? (Integer) obj : "not Integer");
                    Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", sb.toString());
                    if (this.f273849b == null) {
                        SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus$1");
                        return;
                    }
                    int i3 = 257;
                    if (i2 == 0) {
                        if (obj instanceof Integer) {
                            i3 = ((Integer) obj).intValue();
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("status", i3);
                    bundle.putInt(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i2);
                    ((C101232a) this.f273849b).mo140694d(bundle);
                    SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus$1");
                } catch (Throwable unused) {
                }
            }
        }

        /* renamed from: a */
        public Bundle mo67224a(C47518b bVar, Bundle bundle) {
            SnsMethodCalculate.markStartTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus");
            String string = IntentUtil.getString(bundle, "sns_id");
            String string2 = IntentUtil.getString(bundle, "finderUsername");
            String string3 = IntentUtil.getString(bundle, "finderLiveNoticeId");
            if (!TextUtils.isEmpty(string)) {
                Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "OnAcquiringFinderLivingNoticeStatus start, snsId is " + string + ", finderUsername is " + string2 + ", finderLiveNoticeId is " + string3);
                C98771b.m128554c(string, string2, string3, new C94639a(this, string, bVar));
            }
            SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnAcquiringFinderLivingNoticeStatus");
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g$b */
    public static class C94640b implements C100371a {

        /* renamed from: a */
        public final Reference<C94637g> f273850a;

        /* renamed from: b */
        public final boolean f273851b;

        public C94640b(C94637g gVar, boolean z) {
            this.f273850a = new WeakReference(gVar);
            this.f273851b = z;
        }

        @C117634b
        /* renamed from: b */
        public void mo86295b(Bundle bundle) {
            SnsMethodCalculate.markStartTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnFinderLivingNoticeStatusOnClient");
            try {
                Log.m105918d("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "OnFinderLivingNoticeStatusOnClient is called");
                C94637g gVar = this.f273850a.get();
                if (gVar == null) {
                    Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "OnFinderLivingNoticeStatusOnClient onCallbackFromServer, comp is null");
                    SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnFinderLivingNoticeStatusOnClient");
                    return;
                }
                int i = IntentUtil.getInt(bundle, "status", 257);
                int i2 = IntentUtil.getInt(bundle, OpenSDKTool4Assistant.EXTRA_ERROR_CODE, 0);
                Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "OnFinderLivingNoticeStatusOnClient onCallbackFromServer, mRequestNoticeStatus is " + this.f273851b + ", status is " + i + ", errorCode is " + i2);
                if (this.f273851b) {
                    Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", " request status, status is " + i + ", errorCode is " + i2);
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                    gVar.mo130220d0(i);
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                } else {
                    Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", " do appointment callback, status is " + i + ", errorCode is " + i2);
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                    SnsMethodCalculate.markStartTimeMs("closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                    C89779i0 i0Var = gVar.f273844C;
                    if (i0Var != null && i0Var.isShowing()) {
                        i0Var.dismiss();
                    }
                    SnsMethodCalculate.markEndTimeMs("closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                    C94637g.m119751b0(gVar, i2);
                }
                SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                gVar.f273845D = 2;
                SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnFinderLivingNoticeStatusOnClient");
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g$c */
    public static class C94641c implements C100372b {

        /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g$c$a */
        public class C94642a implements C98771b.C98772a {

            /* renamed from: a */
            public final /* synthetic */ String f273852a;

            /* renamed from: b */
            public final /* synthetic */ String f273853b;

            /* renamed from: c */
            public final /* synthetic */ String f273854c;

            /* renamed from: d */
            public final /* synthetic */ String f273855d;

            /* renamed from: e */
            public final /* synthetic */ String f273856e;

            /* renamed from: f */
            public final /* synthetic */ C47518b f273857f;

            public C94642a(String str, String str2, String str3, String str4, String str5, C47518b bVar) {
                this.f273852a = str;
                this.f273853b = str2;
                this.f273854c = str3;
                this.f273855d = str4;
                this.f273856e = str5;
                this.f273857f = bVar;
            }

            /* renamed from: a */
            public void mo130218a(String str, int i, int i2, Object obj) {
                int i3 = i2;
                SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving$1");
                Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "OnSubscriptionOfFinderLiving onServerCall, sns id is " + this.f273852a + ", inner snsId is " + str);
                int i4 = i3 == 0 ? 513 : 257;
                C94641c cVar = C94641c.this;
                String str2 = this.f273853b;
                String str3 = this.f273854c;
                String str4 = this.f273855d;
                String str5 = this.f273856e;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving");
                cVar.getClass();
                SnsMethodCalculate.markStartTimeMs("reportResultData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving");
                C98770a aVar = new C98770a();
                aVar.mo138150c(str, str2, str3, str4, str5, i2, 2);
                C63505q.m74843b(aVar);
                SnsMethodCalculate.markEndTimeMs("reportResultData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving");
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving");
                if (this.f273857f != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("status", i4);
                    bundle.putInt(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i3);
                    ((C101232a) this.f273857f).mo140694d(bundle);
                }
                SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving$1");
            }
        }

        /* renamed from: a */
        public Bundle mo67224a(C47518b bVar, Bundle bundle) {
            SnsMethodCalculate.markStartTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving");
            String string = IntentUtil.getString(bundle, "sns_id");
            String string2 = IntentUtil.getString(bundle, "uxInfo");
            String string3 = IntentUtil.getString(bundle, "adExtInfo");
            String string4 = IntentUtil.getString(bundle, "finderUsername");
            String string5 = IntentUtil.getString(bundle, "finderLiveNoticeId");
            Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "OnSubscriptionOfFinderLiving start, snsId is " + string + ", finderUsername is " + string4 + ", finderLiveNoticeId is " + string5);
            C98771b.m128556e(string, string4, string5, new C94642a(string, string2, string3, string4, string5, bVar));
            SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnSubscriptionOfFinderLiving");
            return null;
        }
    }

    public C94637g(Context context, C101673h hVar, ViewGroup viewGroup) {
        super(context, hVar, viewGroup);
        this.f273843B = hVar;
    }

    /* renamed from: b0 */
    public static void m119751b0(C94637g gVar, int i) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        gVar.getClass();
        SnsMethodCalculate.markStartTimeMs("fillAppointmentStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillAppointmentStatusResult, errCode is " + i);
        SnsMethodCalculate.markStartTimeMs("showSubscribingResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        C98771b.m128553b(gVar.f276579d, i);
        SnsMethodCalculate.markEndTimeMs("showSubscribingResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        if (gVar.mo131625N() == null || gVar.f273843B == null) {
            Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillAppointmentStatusResult, button or mAdLandingFinderLivingNoticeBtnMutiInfo is null");
            SnsMethodCalculate.markEndTimeMs("fillAppointmentStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        } else {
            if (i == 0) {
                gVar.f273847F = 513;
                gVar.mo130220d0(513);
            } else if (i == -200045 || i == -200023) {
                gVar.f273846E = 2;
                gVar.mo130221e0();
            }
            SnsMethodCalculate.markEndTimeMs("fillAppointmentStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        }
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        SnsMethodCalculate.markStartTimeMs("getViewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        boolean z = this.f276585j;
        SnsMethodCalculate.markEndTimeMs("getViewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        if (!z) {
            Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "viewWillAppear, curComp is " + mo131626O().f296495a);
            SnsMethodCalculate.markStartTimeMs("doViewWillAppearReqLogic", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            if (this.f273846E == 2) {
                mo130221e0();
                Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "viewAppeared, mLivingStatus is FINDER_LIVE_STARTED");
            } else {
                int i = this.f273843B.f297618b0;
                SnsMethodCalculate.markStartTimeMs("isExpire", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                int syncServerTimeSecond = AdLandingPagesProxy.getInstance().getSyncServerTimeSecond();
                Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "isExpire, currentTime is " + syncServerTimeSecond + ", finderLiveStartTime is " + i);
                boolean z2 = i > 0 && syncServerTimeSecond > i;
                SnsMethodCalculate.markEndTimeMs("isExpire", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                if (z2) {
                    this.f273846E = 2;
                    mo130221e0();
                } else {
                    this.f273846E = 1;
                    SnsMethodCalculate.markStartTimeMs("acquireLivingNoticeStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                    this.f273845D = 1;
                    C101271i0 m = mo131854m();
                    C101673h hVar = this.f273843B;
                    if (m == null || hVar == null) {
                        Log.m105920e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "the page data or info is null, it can't do anything!!!!!");
                        SnsMethodCalculate.markEndTimeMs("acquireLivingNoticeStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                    } else {
                        String q0 = C102236a0.m134765q0(mo130223h0(m.mo140741h()));
                        Bundle bundle = new Bundle();
                        bundle.putString("sns_id", q0);
                        bundle.putString("finderUsername", Util.nullAsNil(hVar.f297619c0));
                        bundle.putString("finderLiveNoticeId", Util.nullAsNil(hVar.f297620d0));
                        Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "acquireLivingNoticeStatus, snsId is " + q0 + ", finderUsername is " + hVar.f297619c0 + ", finderLiveNoticeId is " + hVar.f297620d0);
                        C100150a aVar = new C100150a();
                        aVar.mo139441d(new C94638a());
                        aVar.mo139440c(new C94640b(this, true));
                        C62489a a = aVar.mo139438a();
                        if (a != null) {
                            ((C101232a) a).mo140693c(bundle);
                        }
                        SnsMethodCalculate.markEndTimeMs("acquireLivingNoticeStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("doViewWillAppearReqLogic", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        }
        super.mo124360B();
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    /* renamed from: K */
    public void mo130177K() {
        SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        try {
            if (this.f273846E == 2) {
                Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, mLivingStatus is FINDER_LIVE_STARTED, jumpToFinderProfileUI");
                mo130222g0();
                SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            } else if (this.f273845D != 2) {
                Log.m105928w("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, mRequestStatus not finish, the mRequestStatus is " + this.f273845D);
                SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            } else {
                if (this.f273847F == 513) {
                    Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, mAppointmentStatus is FINDER_LIVING_NOTICE_SUBSCRIBED, jumpToFinderProfileUI");
                    mo130222g0();
                } else {
                    Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, mAppointmentStatus is FINDER_LIVING_NOTICE_NO_SUBSCRIBED, subscribe");
                    mo130224i0();
                }
                SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c0 */
    public void mo130219c0(int i) {
        C101673h hVar;
        SnsMethodCalculate.markStartTimeMs("appendClickExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        try {
            C66696h.C66697a aVar = this.f276010t;
            if (!(aVar == null || (hVar = this.f273843B) == null)) {
                aVar.mo90729c("finderUsername", hVar.f297619c0);
                this.f276010t.mo90729c("finderLiveNoticeId", this.f273843B.f297620d0);
                this.f276010t.mo90728b("opType", (long) i);
                this.f276010t.mo90728b("isSimpleFinderLiveNotice", (long) this.f273843B.f297621e0);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("appendClickExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    /* renamed from: d0 */
    public final void mo130220d0(int i) {
        C101673h hVar;
        SnsMethodCalculate.markStartTimeMs("fillAcquireStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillAcquireStatusResult, status is " + i);
        this.f273847F = i;
        Button N = mo131625N();
        if (N == null || (hVar = this.f273843B) == null) {
            Log.m105920e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillAcquireStatusResult, button or mAdLandingFinderLivingNoticeBtnMutiInfo is null");
            SnsMethodCalculate.markEndTimeMs("fillAcquireStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            return;
        }
        if (i == 513) {
            N.setText(hVar.f297616Z);
            mo131628R();
        } else {
            mo131629U();
        }
        SnsMethodCalculate.markEndTimeMs("fillAcquireStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    /* renamed from: e0 */
    public final void mo130221e0() {
        C101673h hVar;
        SnsMethodCalculate.markStartTimeMs("fillLivingStartedText", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        Button N = mo131625N();
        if (N == null || (hVar = this.f273843B) == null) {
            Log.m105920e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillLivingStartedText, button or mAdLandingFinderLivingNoticeBtnMutiInfo is null");
            SnsMethodCalculate.markEndTimeMs("fillLivingStartedText", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            return;
        }
        if (this.f273846E == 2) {
            N.setText(hVar.f297617a0);
            mo131628R();
        }
        SnsMethodCalculate.markEndTimeMs("fillLivingStartedText", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    /* renamed from: g0 */
    public final void mo130222g0() {
        SnsMethodCalculate.markStartTimeMs("jumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        String l = mo131854m().mo140745l();
        String h = mo131854m().mo140741h();
        Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, uxInfo = " + l + ", snsId = " + h);
        AdLandingPagesProxy.getInstance().doJumpToFinderProfileUI(this.f276579d, this.f273843B.f297619c0, l, h, 5);
        mo130219c0(1);
        SnsMethodCalculate.markEndTimeMs("jumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    /* renamed from: h0 */
    public final long mo130223h0(String str) {
        SnsMethodCalculate.markStartTimeMs("stringToLong", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                SnsMethodCalculate.markEndTimeMs("stringToLong", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                return parseLong;
            } catch (Throwable unused) {
                Log.m105920e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "string to long has something wrong!!");
            }
        }
        SnsMethodCalculate.markEndTimeMs("stringToLong", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        return 0;
    }

    /* renamed from: i0 */
    public final void mo130224i0() {
        SnsMethodCalculate.markStartTimeMs("subscribe", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        C101271i0 m = mo131854m();
        C101673h hVar = this.f273843B;
        if (m == null || hVar == null) {
            Log.m105920e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "the page data is null, it can't do anything!!!!!");
            SnsMethodCalculate.markEndTimeMs("subscribe", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            return;
        }
        C100150a aVar = new C100150a();
        aVar.mo139441d(new C94641c());
        aVar.mo139440c(new C94640b(this, false));
        C62489a a = aVar.mo139438a();
        if (a != null) {
            Bundle bundle = new Bundle();
            String q0 = C102236a0.m134765q0(mo130223h0(m.mo140741h()));
            bundle.putString("sns_id", Util.nullAsNil(q0));
            String k = m.mo140744k();
            if (TextUtils.isEmpty(k)) {
                k = m.mo140745l();
            }
            bundle.putString("uxInfo", Util.nullAsNil(k));
            bundle.putString("adExtInfo", Util.nullAsNil(m.mo140734a()));
            bundle.putString("finderUsername", Util.nullAsNil(hVar.f297619c0));
            bundle.putString("finderLiveNoticeId", Util.nullAsNil(hVar.f297620d0));
            Log.m105924i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "subscribe, snsId is " + q0 + ", finderUsername is " + hVar.f297619c0 + ", finderLiveNoticeId is " + hVar.f297620d0);
            ((C101232a) a).mo140693c(bundle);
        }
        mo130219c0(0);
        SnsMethodCalculate.markStartTimeMs("showProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        C89779i0 i0Var = this.f273844C;
        if (i0Var == null) {
            i0Var = C90717a.m113753f(this.f276579d, C0966R.string.gap, (DialogInterface.OnCancelListener) null);
            this.f273844C = i0Var;
        }
        if (i0Var != null && !i0Var.isShowing()) {
            i0Var.show();
        }
        SnsMethodCalculate.markEndTimeMs("showProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        SnsMethodCalculate.markEndTimeMs("subscribe", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }
}
