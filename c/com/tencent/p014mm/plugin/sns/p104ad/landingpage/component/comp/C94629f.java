package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94762a;
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
import so2.C101672g;
import uo2.C90717a;
import vr2.C102236a0;
import ys2.C66696h;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f */
public class C94629f extends C95108i0 {

    /* renamed from: B */
    public final C101672g f273827B;

    /* renamed from: C */
    public C89779i0 f273828C;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f$a */
    public static class C94630a implements C100372b {

        /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f$a$a */
        public class C94631a implements C98771b.C98772a {

            /* renamed from: a */
            public final /* synthetic */ String f273829a;

            /* renamed from: b */
            public final /* synthetic */ C47518b f273830b;

            public C94631a(C94630a aVar, String str, C47518b bVar) {
                this.f273829a = str;
                this.f273830b = bVar;
            }

            /* renamed from: a */
            public void mo130218a(String str, int i, int i2, Object obj) {
                SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnAcquiringFinderLivingNoticeStatus$1");
                try {
                    Log.m105924i("SnsAd.FinderLivingNoticeComp", "Subscription out sns id is " + this.f273829a + ", inner snsId is " + str + "errorCode = " + i2);
                    if (i2 == 0) {
                        if (obj instanceof Integer) {
                            C94762a.m120038g(str, ((Integer) obj).intValue());
                            if (this.f273830b == null) {
                                SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnAcquiringFinderLivingNoticeStatus$1");
                                return;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putInt("status", ((Integer) obj).intValue());
                            bundle.putInt(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i2);
                            ((C101232a) this.f273830b).mo140694d(bundle);
                            SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnAcquiringFinderLivingNoticeStatus$1");
                            return;
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnAcquiringFinderLivingNoticeStatus$1");
                } catch (Throwable unused) {
                }
            }
        }

        /* renamed from: a */
        public Bundle mo67224a(C47518b bVar, Bundle bundle) {
            SnsMethodCalculate.markStartTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnAcquiringFinderLivingNoticeStatus");
            Bundle bundle2 = new Bundle();
            String string = IntentUtil.getString(bundle, "sns_id");
            String string2 = IntentUtil.getString(bundle, "finderUsername");
            String string3 = IntentUtil.getString(bundle, "finderLiveNoticeId");
            if (!TextUtils.isEmpty(string)) {
                bundle2.putInt("status", C94762a.m120036c(string, 1));
                C98771b.m128554c(string, string2, string3, new C94631a(this, string, bVar));
            }
            SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnAcquiringFinderLivingNoticeStatus");
            return bundle2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f$b */
    public static class C94632b implements C100371a {

        /* renamed from: a */
        public final Reference<C94629f> f273831a;

        /* renamed from: b */
        public final boolean f273832b;

        public C94632b(C94629f fVar, boolean z) {
            this.f273831a = new WeakReference(fVar);
            this.f273832b = z;
        }

        @C117634b
        /* renamed from: b */
        public void mo86295b(Bundle bundle) {
            SnsMethodCalculate.markStartTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnFinderLivingNoticeStatusOnClient");
            try {
                Log.m105918d("SnsAd.FinderLivingNoticeComp", "OnSubscriptionOfFinderLivingOnClient is called");
                int i = IntentUtil.getInt(bundle, "status", 257);
                int i2 = IntentUtil.getInt(bundle, OpenSDKTool4Assistant.EXTRA_ERROR_CODE, 0);
                C94629f fVar = this.f273831a.get();
                if (fVar != null) {
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                    SnsMethodCalculate.markStartTimeMs("closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                    C89779i0 i0Var = fVar.f273828C;
                    if (i0Var != null && i0Var.isShowing()) {
                        i0Var.dismiss();
                    }
                    SnsMethodCalculate.markEndTimeMs("closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                    if (!this.f273832b) {
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                        SnsMethodCalculate.markStartTimeMs("showSubscribingResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                        C98771b.m128553b(fVar.f276579d, i2);
                        SnsMethodCalculate.markEndTimeMs("showSubscribingResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                    }
                    fVar.mo130215c0(i);
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnFinderLivingNoticeStatusOnClient");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f$c */
    public static class C94633c implements C100372b {

        /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f$c$a */
        public class C94634a implements C98771b.C98772a {

            /* renamed from: a */
            public final /* synthetic */ String f273833a;

            /* renamed from: b */
            public final /* synthetic */ String f273834b;

            /* renamed from: c */
            public final /* synthetic */ String f273835c;

            /* renamed from: d */
            public final /* synthetic */ String f273836d;

            /* renamed from: e */
            public final /* synthetic */ String f273837e;

            /* renamed from: f */
            public final /* synthetic */ C47518b f273838f;

            public C94634a(String str, String str2, String str3, String str4, String str5, C47518b bVar) {
                this.f273833a = str;
                this.f273834b = str2;
                this.f273835c = str3;
                this.f273836d = str4;
                this.f273837e = str5;
                this.f273838f = bVar;
            }

            /* renamed from: a */
            public void mo130218a(String str, int i, int i2, Object obj) {
                int i3;
                String str2 = str;
                int i4 = i2;
                SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving$1");
                Log.m105924i("SnsAd.FinderLivingNoticeComp", "Subscription out sns id is " + this.f273833a + ", inner snsId is " + str2);
                if (i4 == 0) {
                    C94762a.m120038g(str2, 513);
                    i3 = 513;
                } else {
                    i3 = 257;
                }
                C94633c cVar = C94633c.this;
                String str3 = this.f273834b;
                String str4 = this.f273835c;
                String str5 = this.f273836d;
                String str6 = this.f273837e;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
                cVar.getClass();
                SnsMethodCalculate.markStartTimeMs("reportResultData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
                C98770a aVar = new C98770a();
                aVar.mo138150c(str, str3, str4, str5, str6, i2, 0);
                C63505q.m74843b(aVar);
                SnsMethodCalculate.markEndTimeMs("reportResultData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
                if (this.f273838f != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i4);
                    bundle.putInt("status", i3);
                    ((C101232a) this.f273838f).mo140694d(bundle);
                }
                SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving$1");
            }
        }

        /* renamed from: a */
        public Bundle mo67224a(C47518b bVar, Bundle bundle) {
            SnsMethodCalculate.markStartTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
            String string = IntentUtil.getString(bundle, "sns_id");
            String string2 = IntentUtil.getString(bundle, "uxInfo");
            String string3 = IntentUtil.getString(bundle, "adExtInfo");
            String string4 = IntentUtil.getString(bundle, "finderUsername");
            String string5 = IntentUtil.getString(bundle, "finderLiveNoticeId");
            C98771b.m128556e(string, string4, string5, new C94634a(string, string2, string3, string4, string5, bVar));
            SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnSubscriptionOfFinderLiving");
            return null;
        }
    }

    public C94629f(Context context, C101672g gVar, ViewGroup viewGroup) {
        super(context, gVar, viewGroup);
        this.f273827B = gVar;
        SnsMethodCalculate.markStartTimeMs("appendClickExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
        try {
            C66696h.C66697a aVar = this.f276010t;
            if (!(aVar == null || gVar == null)) {
                aVar.mo90729c("finderUsername", gVar.f297614Z);
                this.f276010t.mo90729c("finderLiveNoticeId", gVar.f297615a0);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("appendClickExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
    }

    /* renamed from: K */
    public void mo130177K() {
        SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
        try {
            Log.m105918d("SnsAd.FinderLivingNoticeComp", "doBtnClick:: is called!");
            mo130217e0();
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
    }

    /* renamed from: b0 */
    public final int mo130214b0() {
        SnsMethodCalculate.markStartTimeMs("acquireLivingNoticeStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
        C101271i0 m = mo131854m();
        C101672g gVar = this.f273827B;
        int i = 257;
        if (m == null || gVar == null) {
            Log.m105920e("SnsAd.FinderLivingNoticeComp", "the page data or info is null, it can't do anything!!!!!");
            SnsMethodCalculate.markEndTimeMs("acquireLivingNoticeStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
            return 257;
        }
        String q0 = C102236a0.m134765q0(mo130216d0(m.mo140741h()));
        Bundle bundle = new Bundle();
        bundle.putString("sns_id", q0);
        bundle.putString("finderUsername", Util.nullAsNil(gVar.f297614Z));
        bundle.putString("finderLiveNoticeId", Util.nullAsNil(gVar.f297615a0));
        C100150a aVar = new C100150a();
        aVar.mo139441d(new C94630a());
        aVar.mo139440c(new C94632b(this, true));
        C62489a a = aVar.mo139438a();
        if (a != null) {
            i = IntentUtil.getInt(((C101232a) a).mo140693c(bundle), "status", 257);
        }
        SnsMethodCalculate.markEndTimeMs("acquireLivingNoticeStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
        return i;
    }

    /* renamed from: c0 */
    public void mo130215c0(int i) {
        SnsMethodCalculate.markStartTimeMs("onLivingStatusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
        Button N = mo131625N();
        SnsMethodCalculate.markStartTimeMs("getBtnLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.f276026u;
        SnsMethodCalculate.markEndTimeMs("getBtnLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (N == null || roundedCornerFrameLayout == null) {
            SnsMethodCalculate.markEndTimeMs("onLivingStatusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
            return;
        }
        if (i == 513) {
            N.setText(this.f276579d.getText(C0966R.string.j_c));
            N.setEnabled(false);
            N.setAlpha(0.6f);
            roundedCornerFrameLayout.setAlpha(0.6f);
        } else {
            C101672g gVar = this.f273827B;
            if (gVar != null) {
                N.setText(gVar.f296714z);
            }
            N.setEnabled(true);
            N.setAlpha(1.0f);
            roundedCornerFrameLayout.setAlpha(1.0f);
        }
        SnsMethodCalculate.markEndTimeMs("onLivingStatusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
    }

    /* renamed from: d0 */
    public final long mo130216d0(String str) {
        SnsMethodCalculate.markStartTimeMs("stringToLong", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                SnsMethodCalculate.markEndTimeMs("stringToLong", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                return parseLong;
            } catch (Throwable unused) {
                Log.m105918d("SnsAd.FinderLivingNoticeComp", "string to long has something wrong!!");
            }
        }
        SnsMethodCalculate.markEndTimeMs("stringToLong", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
        return 0;
    }

    /* renamed from: e0 */
    public final void mo130217e0() {
        SnsMethodCalculate.markStartTimeMs("subscribe", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
        C101271i0 m = mo131854m();
        C101672g gVar = this.f273827B;
        if (m == null || gVar == null) {
            Log.m105920e("SnsAd.FinderLivingNoticeComp", "the page data is null, it can't do anything!!!!!");
            SnsMethodCalculate.markEndTimeMs("subscribe", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
            return;
        }
        C100150a aVar = new C100150a();
        aVar.mo139441d(new C94633c());
        aVar.mo139440c(new C94632b(this, false));
        C62489a a = aVar.mo139438a();
        if (a != null) {
            Bundle bundle = new Bundle();
            String q0 = C102236a0.m134765q0(mo130216d0(m.mo140741h()));
            String k = m.mo140744k();
            if (TextUtils.isEmpty(k)) {
                k = m.mo140745l();
            }
            bundle.putString("sns_id", Util.nullAsNil(q0));
            bundle.putString("uxInfo", Util.nullAsNil(k));
            bundle.putString("adExtInfo", Util.nullAsNil(m.mo140734a()));
            bundle.putString("finderUsername", Util.nullAsNil(gVar.f297614Z));
            bundle.putString("finderLiveNoticeId", Util.nullAsNil(gVar.f297615a0));
            ((C101232a) a).mo140693c(bundle);
            SnsMethodCalculate.markStartTimeMs("showProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
            C89779i0 i0Var = this.f273828C;
            if (i0Var == null) {
                i0Var = C90717a.m113753f(this.f276579d, C0966R.string.gap, (DialogInterface.OnCancelListener) null);
                this.f273828C = i0Var;
            }
            if (i0Var != null && !i0Var.isShowing()) {
                i0Var.show();
            }
            SnsMethodCalculate.markEndTimeMs("showProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
        }
        SnsMethodCalculate.markEndTimeMs("subscribe", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
        try {
            super.mo67240g();
            int b0 = mo130214b0();
            mo130215c0(b0);
            Log.m105918d("SnsAd.FinderLivingNoticeComp", "fillItem:: acquireLivingNoticeStatus is " + b0);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
    }
}
