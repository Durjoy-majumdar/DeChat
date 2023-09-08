package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import de3.C86258g;
import di3.C86312j;
import h81.C32735h;
import ht1.C60194q2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import ko2.C46734a;
import lo2.C88616u0;
import lo2.C99525b0;
import nj3.C76912y0;
import ob0.C47350c;
import org.json.JSONObject;
import os2.C100417r0;
import ps2.C100880k;
import ps2.C100891r;
import qo3.C77407n;
import qs2.C101261d0;
import qs2.C101266g;
import qs2.C101269i;
import qs2.C101271i0;
import qs2.C101275k;
import qs2.C101277l;
import qs2.C101287r;
import qs2.C89838o;
import rq2.C101419f;
import rq2.C101424j;
import te3.C49964j92;
import te3.C50098k92;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i0 */
public class C95108i0 extends C95098h0 {

    /* renamed from: A */
    public boolean f276025A = false;

    /* renamed from: u */
    public RoundedCornerFrameLayout f276026u;

    /* renamed from: v */
    public Button f276027v;

    /* renamed from: w */
    public View f276028w;

    /* renamed from: x */
    public boolean f276029x;

    /* renamed from: y */
    public boolean f276030y;

    /* renamed from: z */
    public boolean f276031z = false;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i0$e */
    public class C85465e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AdLandingPageChattingTask f249083d;

        /* renamed from: e */
        public final /* synthetic */ WxaExposedParams.C81632b f249084e;

        /* renamed from: f */
        public final /* synthetic */ C89838o f249085f;

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i0$e$a */
        public class C85466a implements MMActivity.C6739d {
            public C85466a() {
            }

            public void mmOnActivityResult(int i, int i2, Intent intent) {
                SnsMethodCalculate.markStartTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$7$1");
                if (i == 1) {
                    C85465e.this.f249083d.mo114397h();
                }
                SnsMethodCalculate.markEndTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$7$1");
            }
        }

        public C85465e(AdLandingPageChattingTask adLandingPageChattingTask, WxaExposedParams.C81632b bVar, C89838o oVar) {
            this.f249083d = adLandingPageChattingTask;
            this.f249084e = bVar;
            this.f249085f = oVar;
        }

        public void run() {
            String str;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$7");
            Intent intent = new Intent();
            intent.setFlags(67108864);
            intent.putExtra("Chat_User", this.f249083d.f249077g);
            intent.putExtra("app_brand_chatting_from_scene", 3);
            intent.putExtra("app_brand_chatting_expose_params", this.f249084e.mo113977a());
            intent.putExtra("key_temp_session_from", this.f249083d.f249076f);
            intent.putExtra("finish_direct", true);
            boolean z = BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger();
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            if (hVar != null) {
                z = hVar.mo58784wf(C32735h.C32737c.clicfg_android_appbrand_contact_support_send_video, z);
            }
            Log.m105924i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + z);
            if (!z) {
                intent.putExtra("key_need_send_video", false);
            }
            intent.putExtra("app_brand_chatting_from_scene_new", 4);
            try {
                C89838o oVar = this.f249085f;
                boolean z2 = oVar.f258255d0 == 1;
                String str2 = oVar.f258256e0;
                String str3 = oVar.f258258g0;
                String str4 = oVar.f258257f0;
                if (z2) {
                    if (!Util.isNullOrNil(str2, str4, str3)) {
                        intent.putExtra("showMessageCard", true);
                        intent.putExtra("sendMessageTitle", str2);
                        intent.putExtra("sendMessagePath", str3);
                        intent.putExtra("sendMessageImg", str4);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("uxInfo", C95108i0.this.mo131854m().mo140745l());
                        str = jSONObject.toString();
                        intent.putExtra("sns_landing_pages_ux_info", str);
                        MMActivity mMActivity = (MMActivity) C95108i0.this.f276579d;
                        mMActivity.mmSetOnActivityResultCallback(new C85466a());
                        Log.m105924i("MicroMsg.Sns.AdLandingPageBtnComponent", "open ServiceChattingUI， uxInfo=" + str);
                        C88144b.m109802t(mMActivity, ".ui.chatting.AppBrandServiceChattingUI", intent, 1);
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$7");
                    }
                }
                intent.putExtra("showMessageCard", false);
            } catch (Throwable th) {
                intent.putExtra("showMessageCard", false);
                Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", th.toString());
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("uxInfo", C95108i0.this.mo131854m().mo140745l());
                str = jSONObject2.toString();
            } catch (Exception unused) {
                str = "";
            }
            intent.putExtra("sns_landing_pages_ux_info", str);
            MMActivity mMActivity2 = (MMActivity) C95108i0.this.f276579d;
            mMActivity2.mmSetOnActivityResultCallback(new C85466a());
            Log.m105924i("MicroMsg.Sns.AdLandingPageBtnComponent", "open ServiceChattingUI， uxInfo=" + str);
            C88144b.m109802t(mMActivity2, ".ui.chatting.AppBrandServiceChattingUI", intent, 1);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$7");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i0$a */
    public class C95109a implements C100880k.C100881a {
        public C95109a() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$1");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$1");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$1");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$1");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$1");
            try {
                Log.m105924i("MicroMsg.Sns.AdLandingPageBtnComponent", "onDownloaded, path=" + str);
                Drawable e = C101419f.m133082e(C95108i0.this.f276027v.getResources(), str);
                C95108i0.this.f276027v.setBackground(e);
                if (e != null && C95108i0.this.mo131626O().f296508n > 0.0f && e.getIntrinsicHeight() > 0) {
                    C95108i0.this.f276027v.setLayoutParams(new FrameLayout.LayoutParams((int) ((C95108i0.this.mo131626O().f296508n * ((float) e.getIntrinsicWidth())) / ((float) e.getIntrinsicHeight())), (int) C95108i0.this.mo131626O().f296508n));
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "the backgroundCoverUrl is set error ,because " + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i0$b */
    public class C95110b implements View.OnLongClickListener {
        public C95110b() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$2");
            C95108i0 i0Var = C95108i0.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            i0Var.getClass();
            SnsMethodCalculate.markStartTimeMs("onLongPressed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            i0Var.mo131626O().getClass();
            SnsMethodCalculate.markStartTimeMs("isProductActionValid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompentBtnInfo");
            SnsMethodCalculate.markEndTimeMs("isProductActionValid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompentBtnInfo");
            Context context = i0Var.f276579d;
            if (context instanceof SnsAdNativeLandingPagesUI) {
                ((SnsAdNativeLandingPagesUI) context).mo132531c9(i0Var.mo131626O().f296705Q, i0Var.mo131626O().f296702N, i0Var.mo131626O().f296703O, i0Var.mo131626O().f296704P, i0Var.mo131626O().f296700L == 1, i0Var.mo131626O().f296701M == 1, i0Var.mo131626O().f296699K == 1);
            }
            i0Var.f276028w.setPressed(false);
            SnsMethodCalculate.markEndTimeMs("onLongPressed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$2");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i0$c */
    public class C95111c implements View.OnClickListener {
        public C95111c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$3");
            C95108i0.this.mo131612E();
            C95108i0.this.mo130182P();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i0$d */
    public class C95112d implements C77407n.C47880p {
        public C95112d() {
        }

        public void onDismiss() {
            SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$5");
            C95198o2.m121132d(C95108i0.this.f276579d);
            SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$5");
        }
    }

    public C95108i0(Context context, C101287r rVar, ViewGroup viewGroup) {
        super(context, rVar, viewGroup);
    }

    /* renamed from: K */
    public void mo130177K() {
        long j;
        int i;
        String str;
        SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        C101287r O = mo131626O();
        Context context = this.f276579d;
        if (context instanceof Activity) {
            long n = C100417r0.m131425n(((Activity) context).getIntent().getStringExtra("sns_landing_pages_share_sns_id"));
            int intExtra = ((Activity) this.f276579d).getIntent().getIntExtra("sns_landig_pages_from_source", 0);
            ((Activity) this.f276579d).getIntent().getIntExtra("sns_landing_pages_adType", 0);
            j = n;
            i = intExtra;
        } else {
            j = 0;
            i = 0;
        }
        int i2 = O.f296504j;
        if (i2 == 4) {
            C101266g gVar = (C101266g) O;
            Intent intent = new Intent();
            intent.putExtra("key_card_id", gVar.f296594Z);
            C101271i0 m = mo131854m();
            String str2 = gVar.f296594Z;
            m.getClass();
            SnsMethodCalculate.markStartTimeMs("getCanvasCardExt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            SnsMethodCalculate.markEndTimeMs("getCanvasCardExt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            if (!Util.isNullOrNil((String) ((HashMap) m.f296636u).get(str2))) {
                C101271i0 m2 = mo131854m();
                String str3 = gVar.f296594Z;
                m2.getClass();
                SnsMethodCalculate.markStartTimeMs("getCanvasCardExt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                SnsMethodCalculate.markEndTimeMs("getCanvasCardExt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                gVar.f296595a0 = (String) ((HashMap) m2.f296636u).get(str3);
            }
            intent.putExtra("key_card_ext", gVar.f296595a0);
            intent.putExtra("key_from_scene", 21);
            intent.putExtra("key_stastic_scene", 15);
            C88144b.m109791i(this.f276579d, "card", ".ui.CardDetailUI", intent, (Bundle) null);
            mo131627Q();
            this.f276010t.mo90729c("cardTpId", gVar.f296594Z);
            this.f276010t.mo90729c("cardExt", gVar.f296595a0);
            SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        String str4 = "";
        if (i2 == 8) {
            if (mo131626O() instanceof C101277l) {
                if (!(this.f276579d instanceof Activity) || mo131854m().mo140736c() != 2) {
                    str = str4;
                } else {
                    str4 = ((Activity) this.f276579d).getIntent().getStringExtra("sns_landing_pages_sessionId");
                    str = ((Activity) this.f276579d).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
                }
                String format = String.format("%s:%s:%s:%s:%d:%s:%s:%d", new Object[]{str4, str, ((C101277l) mo131626O()).f296495a, String.valueOf(System.currentTimeMillis() / 1000), Integer.valueOf(mo131854m().mo140736c()), mo131854m().mo140745l(), Long.valueOf(j), Integer.valueOf(i)});
                C101277l lVar = (C101277l) mo131626O();
                String b = C102260r.m134860b(lVar.f296650a0, AdLandingPagesProxy.getInstance().isWeAppAppendClickTime(mo131854m().mo140741h(), i));
                lVar.f296650a0 = b;
                if (lVar.f296712X) {
                    C102236a0.m134757m0(this.f276579d, lVar.f296649Z, b, "", mo131854m().mo140735b(), mo131854m().mo140743j(), format, mo131854m().mo140745l(), 1200);
                } else {
                    C102236a0.m134759n0(this.f276579d, lVar.f296649Z, b, "", mo131854m().mo140735b(), mo131854m().mo140743j(), format, mo131854m().mo140745l(), 1084);
                }
                this.f276010t.mo90729c("weappUserName", lVar.f296649Z);
                this.f276010t.mo90729c("weappPath", lVar.f296650a0);
                if (lVar.f296712X) {
                    this.f276010t.mo90728b("isJumpInHalfScreenStyle", 1);
                }
            }
            SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        } else if (i2 == 9) {
            C101269i iVar = (C101269i) O;
            Intent intent2 = new Intent();
            intent2.putExtra("map_view_type", 1);
            intent2.putExtra("kwebmap_slat", iVar.f296610Z.f296611a);
            intent2.putExtra("kwebmap_lng", iVar.f296610Z.f296612b);
            intent2.putExtra("kwebmap_scale", iVar.f296610Z.f296613c);
            intent2.putExtra("kPoiName", iVar.f296610Z.f296615e);
            intent2.putExtra("Kwebmap_locaion", iVar.f296610Z.f296614d);
            Log.m105924i("MicroMsg.Sns.AdLandingPageBtnComponent", "locatint to slat " + iVar.f296610Z.f296611a + ", slong " + iVar.f296610Z.f296612b + ", " + iVar.f296610Z.f296615e);
            C88144b.m109795m(this.f276579d, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent2, 2002);
            SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        } else if (i2 == 10) {
            if (C86258g.C86259a.f250859a == null) {
                SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                return;
            }
            C101275k kVar = (C101275k) O;
            if (kVar.f296646Z.size() > 1) {
                C86258g.C86259a.f250859a.mo10688Wu(this.f276579d, kVar.f296646Z, new C95112d());
                this.f276010t.mo90729c("phonenumber", kVar.f296646Z.get(0));
            } else if (kVar.f296646Z.size() > 0) {
                AdLandingPagesProxy.getInstance().confirmDialPhoneNum((Activity) this.f276579d, kVar.f296646Z.get(0));
                this.f276010t.mo90729c("phonenumber", kVar.f296646Z.get(0));
            }
            SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        } else if (i2 == 11) {
            SnsMethodCalculate.markStartTimeMs("isProductActionValid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompentBtnInfo");
            SnsMethodCalculate.markEndTimeMs("isProductActionValid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompentBtnInfo");
            Context context2 = this.f276579d;
            if (context2 instanceof SnsAdNativeLandingPagesUI) {
                ((SnsAdNativeLandingPagesUI) context2).mo132531c9(O.f296705Q, O.f296702N, O.f296703O, O.f296704P, O.f296700L == 1, O.f296701M == 1, mo131626O().f296699K == 1);
            }
            SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        } else if (i2 == 12) {
            C89838o oVar = (C89838o) O;
            SnsMethodCalculate.markStartTimeMs("openServiceChat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            Log.m105924i("MicroMsg.Sns.AdLandingPageBtnComponent", "openServiceChat:" + oVar);
            try {
                if (TextUtils.isEmpty(oVar.f258253b0)) {
                    mo131624M(oVar, str4);
                } else {
                    if (TextUtils.isEmpty(oVar.f258251Z)) {
                        SnsMethodCalculate.markEndTimeMs("openServiceChat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                    } else if (!NetStatusUtil.isNetworkConnected(this.f276579d)) {
                        C76912y0.makeText(this.f276579d, (int) C0966R.string.ja5, 0).show();
                        SnsMethodCalculate.markEndTimeMs("openServiceChat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                    } else {
                        C47350c.C47352b bVar = new C47350c.C47352b();
                        bVar.f127066a = new C49964j92();
                        bVar.f127067b = new C50098k92();
                        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxausrevent/getsubbusinessinfo";
                        bVar.f127069d = 1303;
                        bVar.f127070e = 0;
                        bVar.f127071f = 0;
                        C47350c a = bVar.mo72403a();
                        C49964j92 j922 = (C49964j92) a.f127055a.f127080a;
                        j922.f135942d = oVar.f258251Z;
                        j922.f135943e = oVar.f258253b0;
                        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C95133k0(this, oVar));
                    }
                    this.f276010t.mo90729c("weappid", oVar.f258252a0);
                    this.f276010t.mo90729c("weappUserName", oVar.f258251Z);
                    this.f276010t.mo90729c("businessId", oVar.f258253b0);
                    SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "openServiceChat exp:" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("openServiceChat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            this.f276010t.mo90729c("weappid", oVar.f258252a0);
            this.f276010t.mo90729c("weappUserName", oVar.f258251Z);
            this.f276010t.mo90729c("businessId", oVar.f258253b0);
            SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        } else if (i2 == 16) {
            C101261d0 d0Var = (C101261d0) O;
            if (d0Var.f296560Z != null) {
                String k = mo131854m().mo140744k();
                if (TextUtils.isEmpty(k)) {
                    k = mo131854m().mo140745l();
                    Log.m105924i("MicroMsg.Sns.AdLandingPageBtnComponent", "jumpScanUI, use old uxInfo=" + k);
                } else {
                    Log.m105924i("MicroMsg.Sns.AdLandingPageBtnComponent", "jumpScanUI, use new uxInfo=" + k);
                }
                C88616u0.m110482a(this.f276579d, d0Var.f296560Z, k, 8);
            } else {
                Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "scanJumpInfo == null");
            }
            SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        } else {
            String str5 = O.f296689A;
            this.f276010t.mo90729c("btnJumpUrl", str5);
            if (O.f296712X) {
                this.f276010t.mo90728b("isJumpInHalfScreenStyle", 1);
            }
            if (O.f296712X) {
                Context context3 = this.f276579d;
                C101271i0 m3 = mo131854m();
                SnsMethodCalculate.markStartTimeMs("jumpHalfStyleH5ForFinder", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
                if (!TextUtils.isEmpty(m3.mo140743j()) && !TextUtils.isEmpty(m3.mo140735b())) {
                    str5 = C95198o2.m121129a(str5, "traceid=" + m3.mo140743j() + "&aid=" + m3.mo140735b());
                }
                String k2 = m3.mo140744k();
                if (TextUtils.isEmpty(k2)) {
                    k2 = m3.mo140745l();
                    Log.m105924i("AdLandingPageH5Jumper", "jumpHalfEggCardH5, use orig_UxInfo:" + k2);
                } else {
                    Log.m105924i("AdLandingPageH5Jumper", "jumpHalfEggCardH5, use updated_UxInfo:" + k2);
                }
                String e2 = C46734a.m52032e(C102236a0.m134734b(str5, k2));
                Log.m105924i("AdLandingPageH5Jumper", "jumpHalfStyleH5ForFinder, source=" + i + ", snsId=" + C102236a0.m134765q0(j) + ", url=" + e2);
                ((C60194q2) C86312j.m106911c(C60194q2.class)).mo75418lL(context3, e2, 89, 0.75f);
                SnsMethodCalculate.markEndTimeMs("jumpHalfStyleH5ForFinder", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
            } else {
                C101424j.m133095a(this.f276579d, str5, mo131854m(), i, j, mo131626O().f296495a);
            }
            mo131627Q();
            SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        }
    }

    /* renamed from: M */
    public final void mo131624M(C89838o oVar, String str) {
        SnsMethodCalculate.markStartTimeMs("doEnterChatting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        try {
            AdLandingPageChattingTask adLandingPageChattingTask = new AdLandingPageChattingTask();
            String str2 = oVar.f258251Z;
            if (str2 == null) {
                str2 = "";
            }
            WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
            bVar.f239557a = oVar.f258252a0;
            bVar.f239560d = str2;
            bVar.f239561e = "";
            bVar.f239562f = "";
            bVar.f239564h = 0;
            bVar.f239563g = 0;
            bVar.f239565i = "";
            bVar.f239566j = 14;
            bVar.f239567k = "";
            bVar.f239568l = "";
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            adLandingPageChattingTask.f249077g = str;
            adLandingPageChattingTask.f249078h = "";
            adLandingPageChattingTask.f249076f = oVar.f258254c0;
            adLandingPageChattingTask.f249079i = new C85465e(adLandingPageChattingTask, bVar, oVar);
            adLandingPageChattingTask.mo114395c();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "doEnterChatting exp:" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doEnterChatting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    /* renamed from: N */
    public Button mo131625N() {
        SnsMethodCalculate.markStartTimeMs("getBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        Button button = this.f276027v;
        SnsMethodCalculate.markEndTimeMs("getBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return button;
    }

    /* renamed from: O */
    public C101287r mo131626O() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        C101287r rVar = (C101287r) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return rVar;
    }

    /* renamed from: P */
    public void mo130182P() {
        SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        try {
            mo130177K();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "doBtnClick exp=" + e.toString());
        }
        mo131613G();
        SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    /* renamed from: Q */
    public void mo131627Q() {
        SnsMethodCalculate.markStartTimeMs("overridePendingTransition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        SnsMethodCalculate.markStartTimeMs("isInFloatJumpComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        boolean z = this.f276030y;
        SnsMethodCalculate.markEndTimeMs("isInFloatJumpComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (z) {
            Context context = this.f276579d;
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
            }
        }
        SnsMethodCalculate.markEndTimeMs("overridePendingTransition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    /* renamed from: R */
    public void mo131628R() {
        SnsMethodCalculate.markStartTimeMs("refreshBtnDisableUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (this.f276027v == null) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "refreshBtnDisableUI, btn is null");
            SnsMethodCalculate.markEndTimeMs("refreshBtnDisableUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        try {
            mo131633Y(mo131626O().f296709U);
            Drawable background = this.f276027v.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : new GradientDrawable();
            gradientDrawable.setShape(0);
            boolean W = mo131631W(gradientDrawable, mo131626O().f296711W);
            boolean X = mo131632X(gradientDrawable, mo131626O().f296706R);
            boolean V = mo131630V(gradientDrawable, mo131626O().f296710V);
            if (W || X || V) {
                this.f276027v.setBackgroundDrawable(gradientDrawable);
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "refreshBtnDisableUI, exp is " + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("refreshBtnDisableUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    /* renamed from: U */
    public void mo131629U() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        SnsMethodCalculate.markStartTimeMs("refreshBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        int i3 = this.f276588p;
        if (mo131626O().f296501g > 0.0f && mo131626O().f296501g <= ((float) i3)) {
            i3 = ((int) mo131626O().f296501g) + ((int) mo131626O().f296499e) + ((int) mo131626O().f296500f);
        }
        int i4 = i3;
        this.f276026u.setBackgroundColor(this.f276581f);
        if (!Util.isNullOrNil(mo131626O().f296697I)) {
            C100891r.m132207b("adId", mo131626O().f296697I, false, 0, 0, new C95109a());
            z = false;
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            if (Util.isNullOrNil(mo131626O().f296696H) || mo131626O().f296693E <= 0.0f) {
                z2 = false;
                z = false;
            } else {
                try {
                    i2 = Color.parseColor(mo131626O().f296696H);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", Util.stackTraceToString(e));
                    i2 = 0;
                }
                gradientDrawable.setStroke((int) mo131626O().f296693E, i2);
                if (mo131626O().f296706R > 0.0f) {
                    gradientDrawable.setCornerRadius(mo131626O().f296706R);
                }
                z2 = true;
                z = true;
            }
            if (!Util.isNullOrNil(mo131626O().f296695G)) {
                try {
                    i = Color.parseColor(mo131626O().f296695G);
                } catch (Exception e2) {
                    Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "parseColor exp=" + e2.toString());
                    i = 0;
                }
                gradientDrawable.setColor(i);
                z2 = true;
            }
            if (z2) {
                this.f276027v.setBackgroundDrawable(gradientDrawable);
            }
        }
        this.f276027v.setText(mo131626O().f296714z);
        if (mo131626O().f296694F == 1) {
            this.f276027v.setTypeface(Typeface.defaultFromStyle(1));
        } else if (mo131626O().f296694F == 2) {
            this.f276027v.setTypeface(Typeface.defaultFromStyle(2));
        }
        Button button = this.f276027v;
        SnsMethodCalculate.markStartTimeMs("setClickAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        button.setOnClickListener(new C95128j0(this));
        SnsMethodCalculate.markEndTimeMs("setClickAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (mo131626O().f296692D > 0.0f) {
            this.f276027v.setTextSize(0, mo131626O().f296692D);
        }
        if (mo131626O().f296691C != null && mo131626O().f296691C.length() > 0) {
            try {
                this.f276027v.setTextColor(Color.parseColor(mo131626O().f296691C));
            } catch (Exception unused) {
                Log.m105921e("MicroMsg.Sns.AdLandingPageBtnComponent", "invalid color! %s", mo131626O().f296691C);
            }
        }
        try {
            this.f276027v.setTextAlignment(4);
        } catch (Exception unused2) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "the device has no method btn.setTextAlignment");
        }
        if (mo131626O().f296508n > 0.0f) {
            this.f276027v.setLayoutParams(new FrameLayout.LayoutParams((i4 - ((int) mo131626O().f296499e)) - ((int) mo131626O().f296500f), (int) mo131626O().f296508n));
        } else {
            this.f276027v.setLayoutParams(new FrameLayout.LayoutParams((i4 - ((int) mo131626O().f296499e)) - ((int) mo131626O().f296500f), this.f276027v.getLayoutParams().height));
        }
        if (mo131626O().f296698J == 1) {
            this.f276028w.setLayoutParams(new FrameLayout.LayoutParams((i4 - ((int) mo131626O().f296499e)) - ((int) mo131626O().f296500f), this.f276028w.getLayoutParams().height));
            View view = this.f276028w;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent", "refreshBtnUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent", "refreshBtnUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f276028w.setOnLongClickListener(new C95110b());
            this.f276028w.setOnClickListener(new C95111c());
        } else {
            View view3 = this.f276028w;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent", "refreshBtnUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent", "refreshBtnUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!z) {
            this.f276026u.setRadius(mo131626O().f296706R);
            float f = mo131626O().f296706R;
            if (f > 0.0f && Util.isNullOrNil(mo131626O().f296697I)) {
                Drawable background = this.f276027v.getBackground();
                GradientDrawable gradientDrawable2 = background instanceof GradientDrawable ? (GradientDrawable) background : new GradientDrawable();
                gradientDrawable2.setShape(0);
                if (mo131632X(gradientDrawable2, f)) {
                    this.f276027v.setBackgroundDrawable(gradientDrawable2);
                }
            }
        }
        C99525b0.m129881d(this.f276579d, mo131626O(), this.f276027v);
        SnsMethodCalculate.markEndTimeMs("refreshBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    /* renamed from: V */
    public final boolean mo131630V(GradientDrawable gradientDrawable, String str) {
        SnsMethodCalculate.markStartTimeMs("setBtnBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        int i = 0;
        if (gradientDrawable == null) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnBackgroundColor, drawable is null");
            SnsMethodCalculate.markEndTimeMs("setBtnBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return false;
        } else if (!Util.isNullOrNil(str)) {
            try {
                i = Color.parseColor(str);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnBackgroundColor, parseColor exp=" + e.toString() + " , backgroundColor is " + str);
            }
            gradientDrawable.setColor(i);
            SnsMethodCalculate.markEndTimeMs("setBtnBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("setBtnBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return false;
        }
    }

    /* renamed from: W */
    public final boolean mo131631W(GradientDrawable gradientDrawable, String str) {
        SnsMethodCalculate.markStartTimeMs("setBtnBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        int i = 0;
        if (gradientDrawable == null) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnBorderColor, drawable is null");
            SnsMethodCalculate.markEndTimeMs("setBtnBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return false;
        } else if (Util.isNullOrNil(str) || mo131626O().f296693E <= 0.0f) {
            SnsMethodCalculate.markEndTimeMs("setBtnBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return false;
        } else {
            try {
                i = Color.parseColor(str);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnBorderColor, parseColor exp=" + e.toString() + " , borderColor is " + str);
            }
            gradientDrawable.setStroke((int) mo131626O().f296693E, i);
            SnsMethodCalculate.markEndTimeMs("setBtnBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return true;
        }
    }

    /* renamed from: X */
    public final boolean mo131632X(GradientDrawable gradientDrawable, float f) {
        SnsMethodCalculate.markStartTimeMs("setBtnCornerRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (f > 0.0f) {
            RoundedCornerFrameLayout roundedCornerFrameLayout = this.f276026u;
            if (roundedCornerFrameLayout != null) {
                roundedCornerFrameLayout.setRadius(f);
            }
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(f);
                SnsMethodCalculate.markEndTimeMs("setBtnCornerRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("setBtnCornerRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return false;
    }

    /* renamed from: Y */
    public void mo131633Y(String str) {
        SnsMethodCalculate.markStartTimeMs("setBtnFontColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (this.f276027v == null) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnFontColor, btn is null");
            SnsMethodCalculate.markEndTimeMs("setBtnFontColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        if (!Util.isNullOrNil(str)) {
            try {
                this.f276027v.setTextColor(Color.parseColor(str));
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnFontColor, parseColor exp=" + e.toString() + " , fontColor is " + str);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setBtnFontColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        View view = this.f276586n;
        this.f276026u = (RoundedCornerFrameLayout) view.findViewById(C0966R.C0970id.jqa);
        this.f276027v = (Button) view.findViewById(C0966R.C0970id.jq_);
        this.f276028w = view.findViewById(C0966R.C0970id.jqb);
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        mo131615I(0);
        mo131629U();
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (this.f276031z) {
            SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return C0966R.C0971layout.f359990cu1;
        }
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return C0966R.C0971layout.f359989c12;
    }
}
