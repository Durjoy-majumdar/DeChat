package com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bp3.C79758p;
import co2.C92435h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsAdEggCardEncoreEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingHBCardComponent;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94625d;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94646j;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94680v;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94686x;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.floatpage.FloatJumpCompHelper;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.CardAnimView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.GLCardAnimView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.ShakeCardAnimView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.ShakeCoverView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.GLTwistRoateCardsView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.TwistRoateCardsView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdSphereAnimView;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.C95250a;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.IXWebBroadcastListener;
import f40.C86709a0;
import hr2.C98516i;
import hr2.C98517j;
import hr2.C98518k;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lf3.C99416d;
import mo2.C99937c;
import org.json.JSONObject;
import ps2.C100891r;
import qs2.C101255a0;
import qs2.C101271i0;
import rq2.C101419f;
import rq2.C101422h;
import sq2.C13774c;
import te3.C49820ia2;
import te3.dk4;
import vr2.C102260r;
import vr2.C37817q;
import zq2.C103063b;
import zq2.C112668f;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper */
public class AdLandingPageEggCardHelper {

    /* renamed from: A */
    public AnimatorSet f274084A;

    /* renamed from: B */
    public ObjectAnimator f274085B;

    /* renamed from: C */
    public IListener<SnsAdEggCardEncoreEvent> f274086C = new IListener<SnsAdEggCardEncoreEvent>(C40008f.f107254d) {
        {
            this.__eventId = -2051158360;
        }

        public boolean callback(IEvent iEvent) {
            JSONObject M;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$13");
            SnsAdEggCardEncoreEvent snsAdEggCardEncoreEvent = (SnsAdEggCardEncoreEvent) iEvent;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$13");
            Log.m105924i("AdLandingPageEggCardHelper", "callback SnsAdEggCardEncoreEvent");
            AdLandingPageEggCardHelper adLandingPageEggCardHelper = AdLandingPageEggCardHelper.this;
            adLandingPageEggCardHelper.getClass();
            SnsMethodCalculate.markStartTimeMs("reportShakeActionResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            Log.m105924i("AdLandingPageEggCardHelper", "reportShakeActionResult, result=1");
            try {
                C101271i0 n8 = adLandingPageEggCardHelper.f274090a.mo132541n8();
                String g = n8.mo140740g();
                String l = n8.mo140745l();
                int i = n8.mo140742i();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("snsid", Util.nullAsNil(g));
                jSONObject.put("uxinfo", Util.nullAsNil(l));
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", 1);
                C94625d dVar = adLandingPageEggCardHelper.f274096g;
                if (dVar != null) {
                    SnsMethodCalculate.markStartTimeMs("getCurrentShowCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    C101255a0 a0Var = dVar.f273819x;
                    SnsMethodCalculate.markEndTimeMs("getCurrentShowCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    if (a0Var != null) {
                        jSONObject2.put("twistCardId", Util.nullAsNil(a0Var.f296515u));
                    }
                    C94625d dVar2 = adLandingPageEggCardHelper.f274096g;
                    dVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs("getHBCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    AdLandingHBCardComponent adLandingHBCardComponent = dVar2.f273821z;
                    SnsMethodCalculate.markEndTimeMs("getHBCardComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    if (!(adLandingHBCardComponent == null || (M = adLandingHBCardComponent.mo130148M()) == null)) {
                        jSONObject2.put("hbCard", M);
                    }
                }
                jSONObject.put("extInfo", jSONObject2);
                C102260r.m134858a("canvas_shakead_encore_shake_result", jSONObject.toString());
            } catch (Exception e) {
                Log.m105920e("AdLandingPageEggCardHelper", "reportShakeActionResult, exp=" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("reportShakeActionResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            if (AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this) != null) {
                AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130211b0(false);
                AdLandingPageEggCardHelper.m119900j(AdLandingPageEggCardHelper.this).removeCallbacksAndMessages((Object) null);
                AdLandingPageEggCardHelper adLandingPageEggCardHelper2 = AdLandingPageEggCardHelper.this;
                SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                adLandingPageEggCardHelper2.getClass();
                SnsMethodCalculate.markStartTimeMs("endShakeCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                ObjectAnimator objectAnimator = adLandingPageEggCardHelper2.f274085B;
                if (objectAnimator != null) {
                    objectAnimator.removeAllListeners();
                }
                AnimatorSet animatorSet = adLandingPageEggCardHelper2.f274084A;
                if (animatorSet != null) {
                    animatorSet.end();
                }
                SnsMethodCalculate.markEndTimeMs("endShakeCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                AdLandingPageEggCardHelper adLandingPageEggCardHelper3 = AdLandingPageEggCardHelper.this;
                SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                adLandingPageEggCardHelper3.f274097h = "";
                SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                AdLandingPageEggCardHelper adLandingPageEggCardHelper4 = AdLandingPageEggCardHelper.this;
                SnsMethodCalculate.markStartTimeMs("access$1102", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                adLandingPageEggCardHelper4.f274098i = "";
                SnsMethodCalculate.markEndTimeMs("access$1102", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                AdLandingPageEggCardHelper adLandingPageEggCardHelper5 = AdLandingPageEggCardHelper.this;
                SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                adLandingPageEggCardHelper5.f274113x = null;
                SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                AdLandingPageEggCardHelper.this.mo130363u();
                View I = C94625d.m119712I(AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130204Q());
                if (I != null) {
                    C94625d i2 = AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this);
                    i2.getClass();
                    SnsMethodCalculate.markStartTimeMs("hideCurrentComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    C95295z zVar = i2.f273818w;
                    if (zVar != null) {
                        zVar.mo124361D();
                    }
                    SnsMethodCalculate.markEndTimeMs("hideCurrentComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(I, "alpha", new float[]{1.0f, 0.0f});
                    ofFloat.setDuration(500);
                    ofFloat.setStartDelay(100);
                    ofFloat.addListener(new C94714c(this));
                    ofFloat.start();
                    AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130207V();
                    AdLandingPageEggCardHelper.m119901k(AdLandingPageEggCardHelper.this, false, true);
                } else {
                    Log.m105928w("AdLandingPageEggCardHelper", "callback SnsAdEggCardEncoreEvent, findAnimCardView==null");
                }
            } else {
                AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130211b0(false);
                Log.m105928w("AdLandingPageEggCardHelper", "callback SnsAdEggCardEncoreEvent, mEggCardComponent==null");
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$13");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$13");
            return false;
        }
    };

    /* renamed from: D */
    public Handler f274087D = new C94703b(Looper.getMainLooper());

    /* renamed from: E */
    public boolean f274088E = false;

    /* renamed from: F */
    public C94680v f274089F;

    /* renamed from: a */
    public SnsAdNativeLandingPagesUI f274090a;

    /* renamed from: b */
    public TwistRoateCardsView f274091b;

    /* renamed from: c */
    public GLTwistRoateCardsView f274092c;

    /* renamed from: d */
    public boolean f274093d = false;

    /* renamed from: e */
    public boolean f274094e = false;

    /* renamed from: f */
    public View f274095f;

    /* renamed from: g */
    public C94625d f274096g;

    /* renamed from: h */
    public String f274097h = "";

    /* renamed from: i */
    public String f274098i = "";

    /* renamed from: j */
    public ShakeCardAnimView f274099j;

    /* renamed from: k */
    public boolean f274100k = false;

    /* renamed from: l */
    public boolean f274101l = false;

    /* renamed from: m */
    public SnsAdSphereAnimView f274102m;

    /* renamed from: n */
    public boolean f274103n = false;

    /* renamed from: o */
    public Bitmap f274104o;

    /* renamed from: p */
    public View f274105p;

    /* renamed from: q */
    public View f274106q;

    /* renamed from: r */
    public View f274107r;

    /* renamed from: s */
    public View f274108s;

    /* renamed from: t */
    public boolean f274109t = false;

    /* renamed from: u */
    public C92435h f274110u;

    /* renamed from: v */
    public boolean f274111v;

    /* renamed from: w */
    public boolean f274112w;

    /* renamed from: x */
    public C99937c f274113x;

    /* renamed from: y */
    public int f274114y;

    /* renamed from: z */
    public boolean f274115z = false;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$a */
    public class C94702a implements AdLandingPagesProxy.C94830p {

        /* renamed from: a */
        public final /* synthetic */ long f274117a;

        /* renamed from: b */
        public final /* synthetic */ int f274118b;

        public C94702a(long j, int i) {
            this.f274117a = j;
            this.f274118b = i;
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$12");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$12");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            int i3 = i;
            int i4 = i2;
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$12");
            SnsMethodCalculate.markStartTimeMs("parseTwistCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCard");
            Log.m105924i("NetSceneAdGetTwistCard", "parseTwistCardInfo, errType=" + i3 + ", errNo=" + i4);
            Bundle bundle = new Bundle();
            if (i3 == 0 && i4 == 0 && obj != null) {
                C49820ia2 ia22 = new C49820ia2();
                try {
                    ia22.parseFrom((byte[]) obj);
                    Log.m105924i("NetSceneAdGetTwistCard", "parseTwistCardInfo, cardId=" + ia22.f135188d + ", snsId=" + ia22.f135189e);
                    bundle.putString("card_id", Util.nullAsNil(ia22.f135188d));
                    dk4 dk4 = ia22.f135190f;
                    if (dk4 != null) {
                        bundle.putString("card_ext_info", Util.nullAsNil(dk4.f132386d));
                    }
                } catch (Throwable th) {
                    Log.m105920e("NetSceneAdGetTwistCard", "parseTwistCardInfo exp=" + th.toString());
                }
            }
            SnsMethodCalculate.markEndTimeMs("parseTwistCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCard");
            String str = "";
            String string = bundle.getString("card_id", str);
            String string2 = bundle.getString("card_ext_info", str);
            AdLandingPageEggCardHelper adLandingPageEggCardHelper = AdLandingPageEggCardHelper.this;
            adLandingPageEggCardHelper.getClass();
            SnsMethodCalculate.markStartTimeMs("onGetServerCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            adLandingPageEggCardHelper.f274097h = string;
            C94680v vVar = adLandingPageEggCardHelper.f274089F;
            if (vVar != null) {
                SnsMethodCalculate.markStartTimeMs("selectCardFromReq", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                vVar.f273991L.post(new C94686x(string, vVar));
                SnsMethodCalculate.markEndTimeMs("selectCardFromReq", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            }
            SnsMethodCalculate.markEndTimeMs("onGetServerCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            AdLandingPageEggCardHelper adLandingPageEggCardHelper2 = AdLandingPageEggCardHelper.this;
            SnsMethodCalculate.markStartTimeMs("access$1102", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            adLandingPageEggCardHelper2.f274098i = string2;
            SnsMethodCalculate.markEndTimeMs("access$1102", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            long currentTimeMillis = System.currentTimeMillis() - this.f274117a;
            Log.m105924i("AdLandingPageEggCardHelper", "reqEggCardId rsp, errType=" + i3 + ", errNo=" + i4 + ", cardId=" + string + ", timeCost=" + currentTimeMillis + ", extInfo=" + string2);
            int i5 = (i3 == 0 && i4 == 0 && obj != null) ? 1 : 0;
            try {
                String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
                AdLandingPageEggCardHelper adLandingPageEggCardHelper3 = AdLandingPageEggCardHelper.this;
                SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                boolean z = adLandingPageEggCardHelper3.f274100k;
                SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                if (z) {
                    str = "1";
                }
                C37817q.m41545a("twist_req_cost", formatedNetType, (int) currentTimeMillis, i5 ^ 1, str + "|" + this.f274118b);
            } catch (Throwable th4) {
                Log.m105920e("AdLandingPageEggCardHelper", "reqEggCardId exp=" + th4.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$12");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$b */
    public class C94703b extends Handler {

        /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$b$a */
        public class C94704a extends C13774c {
            public C94704a() {
            }

            public void onAnimationEnd(Animator animator) {
                SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$14$1");
                AdLandingPageEggCardHelper.m119900j(AdLandingPageEggCardHelper.this).sendEmptyMessageDelayed(2, 2000);
                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$14$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$b$b */
        public class C94705b extends C13774c {
            public C94705b() {
            }

            public void onAnimationEnd(Animator animator) {
                SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$14$2");
                AdLandingPageEggCardHelper.m119900j(AdLandingPageEggCardHelper.this).sendEmptyMessageDelayed(3, 1000);
                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$14$2");
            }
        }

        public C94703b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$14");
            int i = message.what;
            if (i == 1) {
                AdLandingPageEggCardHelper.m119896f(AdLandingPageEggCardHelper.this, new C94704a());
            } else if (i == 2) {
                AdLandingPageEggCardHelper.m119896f(AdLandingPageEggCardHelper.this, new C94705b());
            } else if (i == 3) {
                AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130207V();
                AdLandingPageEggCardHelper.m119901k(AdLandingPageEggCardHelper.this, true, true);
            }
            SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$14");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$c */
    public class C94706c extends C13774c {

        /* renamed from: d */
        public final /* synthetic */ View f274123d;

        public C94706c(AdLandingPageEggCardHelper adLandingPageEggCardHelper, View view) {
            this.f274123d = view;
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$15");
            View view = this.f274123d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$15", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$15", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$15");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$d */
    public class C94707d implements Runnable {
        public C94707d() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$5");
            AdLandingPageEggCardHelper adLandingPageEggCardHelper = AdLandingPageEggCardHelper.this;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            boolean z = adLandingPageEggCardHelper.f274112w;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            if (!z) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(AdLandingPageEggCardHelper.m119892b(AdLandingPageEggCardHelper.this), "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.start();
            }
            AdLandingPageEggCardHelper.m119898h(AdLandingPageEggCardHelper.this).mo130574e();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$e */
    public class C94708e implements ShakeCardAnimView.C94768c {

        /* renamed from: a */
        public final /* synthetic */ boolean f274125a;

        public C94708e(boolean z) {
            this.f274125a = z;
        }

        /* renamed from: a */
        public void mo130369a() {
            SnsMethodCalculate.markStartTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$6");
            ShakeCardAnimView h = AdLandingPageEggCardHelper.m119898h(AdLandingPageEggCardHelper.this);
            h.getClass();
            SnsMethodCalculate.markStartTimeMs("isPAGAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            boolean z = h.f274466j;
            SnsMethodCalculate.markEndTimeMs("isPAGAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            Log.m105924i("AdLandingPageEggCardHelper", "onEndFlip, isPagAniming=" + z);
            if (AdLandingPageEggCardHelper.m119891a(AdLandingPageEggCardHelper.this).isSupportNavigationSwipeBack()) {
                AdLandingPageEggCardHelper.m119891a(AdLandingPageEggCardHelper.this).getSwipeBackLayout().setEnableGesture(true);
            }
            if (!AdLandingPageEggCardHelper.m119895e(AdLandingPageEggCardHelper.this)) {
                View g = AdLandingPageEggCardHelper.m119897g(AdLandingPageEggCardHelper.this);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(g, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$6", "onEndFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(g, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$6", "onEndFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!this.f274125a) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(AdLandingPageEggCardHelper.m119897g(AdLandingPageEggCardHelper.this), "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(500);
                ofFloat.start();
            }
            if (!this.f274125a) {
                AdLandingPageEggCardHelper.m119891a(AdLandingPageEggCardHelper.this).mo132500I8();
                AdLandingPageEggCardHelper.m119891a(AdLandingPageEggCardHelper.this).mo132503L8();
                if (!z) {
                    AdLandingPageEggCardHelper.m119898h(AdLandingPageEggCardHelper.this).setVisibility(8);
                }
            } else {
                AdLandingPageEggCardHelper.m119898h(AdLandingPageEggCardHelper.this).setVisibility(8);
            }
            if (AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this) != null) {
                AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130197G();
                if (AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130208W()) {
                    AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130211b0(true);
                    AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130212c0();
                    AdLandingPageEggCardHelper.m119900j(AdLandingPageEggCardHelper.this).removeCallbacksAndMessages((Object) null);
                    C94625d i = AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this);
                    i.getClass();
                    SnsMethodCalculate.markStartTimeMs("isShowDoubleHBCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    boolean z2 = i.f273820y;
                    SnsMethodCalculate.markEndTimeMs("isShowDoubleHBCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    if (z2) {
                        AdLandingPageEggCardHelper.m119900j(AdLandingPageEggCardHelper.this).sendEmptyMessageDelayed(3, 7000);
                    } else {
                        AdLandingPageEggCardHelper.m119900j(AdLandingPageEggCardHelper.this).sendEmptyMessageDelayed(1, 3000);
                    }
                } else {
                    AdLandingPageEggCardHelper.m119901k(AdLandingPageEggCardHelper.this, true, true);
                }
                AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130198H();
            }
            SnsMethodCalculate.markEndTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$6");
        }

        /* renamed from: b */
        public void mo130370b() {
            SnsMethodCalculate.markStartTimeMs("onPrepareCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$6");
            AdLandingPageEggCardHelper adLandingPageEggCardHelper = AdLandingPageEggCardHelper.this;
            SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            String str = adLandingPageEggCardHelper.f274097h;
            SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            AdLandingPageEggCardHelper adLandingPageEggCardHelper2 = AdLandingPageEggCardHelper.this;
            SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            String str2 = adLandingPageEggCardHelper2.f274098i;
            SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            Log.m105924i("AdLandingPageEggCardHelper", "onPrepareCard, shakeCardId=" + str + ", ext=" + str2);
            try {
                if (TextUtils.isEmpty(str)) {
                    ShakeCoverView.m120068f(AdLandingPageEggCardHelper.m119891a(AdLandingPageEggCardHelper.this).mo132541n8(), 2, this.f274125a);
                    if (this.f274125a) {
                        C115669n.INSTANCE.mo175911u(1572, 14);
                    } else {
                        C115669n.INSTANCE.mo175911u(1572, 6);
                    }
                } else {
                    ShakeCoverView.m120068f(AdLandingPageEggCardHelper.m119891a(AdLandingPageEggCardHelper.this).mo132541n8(), 1, this.f274125a);
                    if (this.f274125a) {
                        C115669n.INSTANCE.mo175911u(1572, 13);
                    } else {
                        C115669n.INSTANCE.mo175911u(1572, 5);
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingPageEggCardHelper", "shake report exp=" + th.toString());
            }
            if (AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this) != null) {
                AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130210Y(str, str2);
                AdLandingPageEggCardHelper adLandingPageEggCardHelper3 = AdLandingPageEggCardHelper.this;
                View I = C94625d.m119712I(AdLandingPageEggCardHelper.m119899i(adLandingPageEggCardHelper3).mo130204Q());
                SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                adLandingPageEggCardHelper3.f274095f = I;
                SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                Log.m105924i("AdLandingPageEggCardHelper", "findAnimCardView, view=" + AdLandingPageEggCardHelper.m119893c(AdLandingPageEggCardHelper.this));
                if (AdLandingPageEggCardHelper.m119893c(AdLandingPageEggCardHelper.this) != null) {
                    View c = AdLandingPageEggCardHelper.m119893c(AdLandingPageEggCardHelper.this);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(0.0f));
                    C117292a.m165358d(c, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$6", "onPrepareCard", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    c.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(c, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$6", "onPrepareCard", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    AdLandingPageEggCardHelper.m119898h(AdLandingPageEggCardHelper.this).setAnimCardView(AdLandingPageEggCardHelper.m119893c(AdLandingPageEggCardHelper.this));
                } else {
                    Log.m105920e("AdLandingPageEggCardHelper", "mShakeCardAnimView==null");
                }
            }
            SnsMethodCalculate.markEndTimeMs("onPrepareCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$f */
    public class C94709f implements TwistRoateCardsView.C94791b {

        /* renamed from: a */
        public final /* synthetic */ boolean f274127a;

        public C94709f(boolean z) {
            this.f274127a = z;
        }
    }

    public AdLandingPageEggCardHelper(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f274090a = snsAdNativeLandingPagesUI;
    }

    /* renamed from: a */
    public static /* synthetic */ SnsAdNativeLandingPagesUI m119891a(AdLandingPageEggCardHelper adLandingPageEggCardHelper) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = adLandingPageEggCardHelper.f274090a;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return snsAdNativeLandingPagesUI;
    }

    /* renamed from: b */
    public static /* synthetic */ View m119892b(AdLandingPageEggCardHelper adLandingPageEggCardHelper) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        View view = adLandingPageEggCardHelper.f274107r;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return view;
    }

    /* renamed from: c */
    public static /* synthetic */ View m119893c(AdLandingPageEggCardHelper adLandingPageEggCardHelper) {
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        View view = adLandingPageEggCardHelper.f274095f;
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return view;
    }

    /* renamed from: d */
    public static /* synthetic */ View m119894d(AdLandingPageEggCardHelper adLandingPageEggCardHelper) {
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        View view = adLandingPageEggCardHelper.f274106q;
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return view;
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m119895e(AdLandingPageEggCardHelper adLandingPageEggCardHelper) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        boolean z = adLandingPageEggCardHelper.f274115z;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return z;
    }

    /* renamed from: f */
    public static void m119896f(AdLandingPageEggCardHelper adLandingPageEggCardHelper, Animator.AnimatorListener animatorListener) {
        SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        adLandingPageEggCardHelper.getClass();
        SnsMethodCalculate.markStartTimeMs("shakeCardViewForTip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        View view = adLandingPageEggCardHelper.f274095f;
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("shakeCardViewForTip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        } else {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", new float[]{0.0f, -1.0f});
            ofFloat.setDuration(250);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(adLandingPageEggCardHelper.f274095f, "rotation", new float[]{-1.0f, 1.0f});
            ofFloat2.setDuration(250);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(adLandingPageEggCardHelper.f274095f, "rotation", new float[]{1.0f, -1.0f});
            ofFloat3.setDuration(250);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(adLandingPageEggCardHelper.f274095f, "rotation", new float[]{-1.0f, 1.0f});
            ofFloat4.setDuration(250);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(adLandingPageEggCardHelper.f274095f, "rotation", new float[]{1.0f, -1.0f});
            ofFloat5.setDuration(250);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(adLandingPageEggCardHelper.f274095f, "rotation", new float[]{-1.0f, 0.0f});
            ofFloat6.setDuration(250);
            ofFloat6.addListener(animatorListener);
            adLandingPageEggCardHelper.f274085B = ofFloat6;
            AnimatorSet animatorSet = new AnimatorSet();
            adLandingPageEggCardHelper.f274084A = animatorSet;
            animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6});
            animatorSet.start();
            SnsMethodCalculate.markEndTimeMs("shakeCardViewForTip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        }
        SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    /* renamed from: g */
    public static /* synthetic */ View m119897g(AdLandingPageEggCardHelper adLandingPageEggCardHelper) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        View view = adLandingPageEggCardHelper.f274108s;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return view;
    }

    /* renamed from: h */
    public static /* synthetic */ ShakeCardAnimView m119898h(AdLandingPageEggCardHelper adLandingPageEggCardHelper) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        ShakeCardAnimView shakeCardAnimView = adLandingPageEggCardHelper.f274099j;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return shakeCardAnimView;
    }

    /* renamed from: i */
    public static /* synthetic */ C94625d m119899i(AdLandingPageEggCardHelper adLandingPageEggCardHelper) {
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        C94625d dVar = adLandingPageEggCardHelper.f274096g;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return dVar;
    }

    /* renamed from: j */
    public static /* synthetic */ Handler m119900j(AdLandingPageEggCardHelper adLandingPageEggCardHelper) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        Handler handler = adLandingPageEggCardHelper.f274087D;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return handler;
    }

    /* renamed from: k */
    public static /* synthetic */ void m119901k(AdLandingPageEggCardHelper adLandingPageEggCardHelper, boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        adLandingPageEggCardHelper.mo130364v(z, z2);
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    /* renamed from: m */
    public static C94680v m119902m(C95295z zVar) {
        SnsMethodCalculate.markStartTimeMs("findHalfEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (zVar instanceof C94680v) {
            C94680v vVar = (C94680v) zVar;
            SnsMethodCalculate.markEndTimeMs("findHalfEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return vVar;
        }
        if (zVar instanceof C95250a) {
            for (C95295z m : ((C95250a) zVar).mo130196E()) {
                C94680v m2 = m119902m(m);
                if (m2 != null) {
                    SnsMethodCalculate.markEndTimeMs("findHalfEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    return m2;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("findHalfEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return null;
    }

    /* renamed from: n */
    public static String m119903n(String str) {
        SnsMethodCalculate.markStartTimeMs("getCacheKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        try {
            if (MMApplicationContext.isMainProcess()) {
                str = C86709a0.m107523b().mo121111i() + "_" + str;
            } else {
                str = AdLandingPagesProxy.getInstance().getUin() + "_" + str;
            }
        } catch (Throwable th) {
            Log.m105920e("AdLandingPageEggCardHelper", "getCacheKey exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getCacheKey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return str;
    }

    /* renamed from: o */
    public static String m119904o(String str) {
        SnsMethodCalculate.markStartTimeMs("getHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("AdLandingPageEggCardHelper", "getHalfEggCardExposedId, pageId empty");
            SnsMethodCalculate.markEndTimeMs("getHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return "";
        }
        SnsMethodCalculate.markStartTimeMs("isDebugHalfEggCardSwitchOpen", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        boolean z = true;
        if (!C102260r.m134844M() || C79758p.f233760a.mo109883f(new C99416d()) != 1) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isDebugHalfEggCardSwitchOpen", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (z) {
            Log.m105928w("AdLandingPageEggCardHelper", "getHalfEggCardExposedId debug switch open");
            m119906w(str, "");
            SnsMethodCalculate.markEndTimeMs("getHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return "";
        }
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("finder_cny_ad");
        String n = m119903n(str);
        String string = mmkv.getString(n, "");
        Log.m105924i("AdLandingPageEggCardHelper", "getHalfEggCardExposedId, cacheKey=" + n + ", cardId=" + string);
        SnsMethodCalculate.markEndTimeMs("getHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return string;
    }

    /* renamed from: t */
    public static void m119905t(C101271i0 i0Var, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("reportGetHalfEggCardIdResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (i0Var == null) {
            Log.m105920e("AdLandingPageEggCardHelper", "reportGetHalfEggCardIdResult, landingPageData==null");
            SnsMethodCalculate.markEndTimeMs("reportGetHalfEggCardIdResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return;
        }
        String l = i0Var.mo140745l();
        int i2 = i0Var.mo140742i();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uxinfo", Util.nullAsNil(l));
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", i);
            jSONObject2.put("canvasId", Util.nullAsNil(i0Var.mo140737d()));
            jSONObject2.put("pageId", Util.nullAsNil(i0Var.mo140739f()));
            jSONObject2.put("cardId", Util.nullAsNil(str));
            jSONObject.put("extInfo", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            C102260r.m134858a("finder_cny_get_cardId_result", jSONObject3);
            Log.m105924i("AdLandingPageEggCardHelper", "reportGetHalfEggCardIdResult, content=" + jSONObject3);
        } catch (Exception e) {
            Log.m105920e("AdLandingPageEggCardHelper", "reportGetHalfEggCardIdResult exp:" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportGetHalfEggCardIdResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    /* renamed from: w */
    public static void m119906w(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("setHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("AdLandingPageEggCardHelper", "setHalfEggCardExposedId, pageId empty, cardId=" + str2);
            SnsMethodCalculate.markEndTimeMs("setHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return;
        }
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("finder_cny_ad");
        String n = m119903n(str);
        mmkv.edit().putString(n, str2).commit();
        Log.m105924i("AdLandingPageEggCardHelper", "setHalfEggCardExposedId, cacheKey=" + n + ", cardId=" + str2);
        SnsMethodCalculate.markEndTimeMs("setHalfEggCardExposedId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    /* renamed from: l */
    public boolean mo130358l() {
        SnsMethodCalculate.markStartTimeMs("checkStartShakeSimpleAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        boolean z = true;
        if (this.f274101l) {
            SnsMethodCalculate.markStartTimeMs("doSimpleShakeAdAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            mo130360q();
            ShakeCardAnimView shakeCardAnimView = this.f274099j;
            if (shakeCardAnimView == null) {
                SnsMethodCalculate.markEndTimeMs("doSimpleShakeAdAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                z = false;
            } else {
                shakeCardAnimView.getViewTreeObserver().addOnPreDrawListener(new C94710a(this));
                this.f274099j.setVisibility(0);
                ShakeCardAnimView shakeCardAnimView2 = this.f274099j;
                C92435h.C92438b bVar = this.f274110u.f264515e;
                shakeCardAnimView2.getClass();
                SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
                if (bVar == null) {
                    Log.m105920e("ShakeCardAnimView", "initData, pagThemeAnimInfo==null");
                    SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
                } else {
                    Log.m105924i("ShakeCardAnimView", "initData, simple anim");
                    shakeCardAnimView2.mo130572c(bVar.f264522a, bVar.f264523b);
                    SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
                }
                this.f274099j.mo130575f();
                C119179t tVar = C119157j.f356862d;
                C94711b bVar2 = new C94711b(this);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(bVar2, 1000, false);
                SnsMethodCalculate.markEndTimeMs("doSimpleShakeAdAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            }
            SnsMethodCalculate.markEndTimeMs("checkStartShakeSimpleAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return z;
        } else if (this.f274103n) {
            SnsMethodCalculate.markStartTimeMs("tryPlayLongPressAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            if (this.f274102m == null || this.f274104o == null) {
                SnsMethodCalculate.markEndTimeMs("tryPlayLongPressAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                z = false;
            } else {
                Log.m105924i("AdLandingPageEggCardHelper", "tryPlayLongPressAnim");
                this.f274102m.getViewTreeObserver().addOnPreDrawListener(new C94716f(this));
                C92435h.C92439c cVar = this.f274110u.f264516f;
                this.f274102m.setVisibility(0);
                SnsAdSphereAnimView snsAdSphereAnimView = this.f274102m;
                Bitmap bitmap = this.f274104o;
                int i = cVar.f264524a;
                int i2 = cVar.f264526c;
                int i3 = cVar.f264525b;
                snsAdSphereAnimView.getClass();
                SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
                Log.m105924i("SnsAdSphereAnimView", "setData, sceneType=" + i + ", duration=" + i2 + ", bmp=" + bitmap);
                snsAdSphereAnimView.f281504u = false;
                if (bitmap == null) {
                    Log.m105920e("SnsAdSphereAnimView", "setData, bmp==null");
                    SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
                } else {
                    snsAdSphereAnimView.f281505v = bitmap;
                    snsAdSphereAnimView.f281501r = i;
                    snsAdSphereAnimView.f281502s = i2;
                    snsAdSphereAnimView.f281503t = i3;
                    int width = snsAdSphereAnimView.getWidth();
                    int height = snsAdSphereAnimView.getHeight();
                    if (width == 0 || height == 0) {
                        Log.m105928w("SnsAdSphereAnimView", "setData, w,h==0");
                        snsAdSphereAnimView.f281504u = true;
                        SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
                    } else {
                        snsAdSphereAnimView.mo134032g(width, height);
                        SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
                    }
                }
                SnsAdSphereAnimView snsAdSphereAnimView2 = this.f274102m;
                snsAdSphereAnimView2.getClass();
                SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
                Log.m105924i("SnsAdSphereAnimView", IXWebBroadcastListener.STAGE_START);
                snsAdSphereAnimView2.invalidate();
                SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
                C119157j jVar2 = (C119157j) C119157j.f356862d;
                jVar2.getClass();
                jVar2.mo183892w(new C94717g(this), (long) (cVar.f264526c + 50), false);
                C119157j jVar3 = (C119157j) C119157j.f356862d;
                jVar3.getClass();
                jVar3.mo183892w(new C94720h(this), (long) (cVar.f264526c - 300), false);
                SnsMethodCalculate.markEndTimeMs("tryPlayLongPressAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            }
            SnsMethodCalculate.markEndTimeMs("checkStartShakeSimpleAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return z;
        } else {
            SnsMethodCalculate.markEndTimeMs("checkStartShakeSimpleAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
    }

    /* renamed from: p */
    public int mo130359p() {
        C92435h.C92439c cVar;
        SnsMethodCalculate.markStartTimeMs("getLongPressAnimDuration", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        C92435h hVar = this.f274110u;
        if (hVar == null || (cVar = hVar.f264516f) == null) {
            SnsMethodCalculate.markEndTimeMs("getLongPressAnimDuration", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return 0;
        }
        int i = cVar.f264526c;
        SnsMethodCalculate.markEndTimeMs("getLongPressAnimDuration", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return i;
    }

    /* renamed from: q */
    public final void mo130360q() {
        ViewStub viewStub;
        SnsMethodCalculate.markStartTimeMs("inflateShakeCardView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        try {
            if (this.f274099j == null && (viewStub = (ViewStub) this.f274090a.findViewById(C0966R.C0970id.jfi)) != null) {
                this.f274099j = (ShakeCardAnimView) viewStub.inflate();
            }
        } catch (Throwable th) {
            Log.m105920e("AdLandingPageEggCardHelper", "inflateShakeCardView, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("inflateShakeCardView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    /* renamed from: r */
    public final void mo130361r(ContentFragment contentFragment) {
        SnsMethodCalculate.markStartTimeMs("initEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (this.f274096g == null) {
            Iterator<C95295z> it = contentFragment.mo131807R().iterator();
            while (true) {
                if (it.hasNext()) {
                    C94625d J = C94625d.m119713J(it.next());
                    if (J != null) {
                        this.f274096g = J;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("initEggCardComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    /* renamed from: s */
    public boolean mo130362s(String str) {
        SnsMethodCalculate.markStartTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        Log.m105924i("AdLandingPageEggCardHelper", "loadSpriteImage:" + str);
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        try {
            String k = C100891r.m132216k(str);
            if (!C86013q1.m106450k(k)) {
                Log.m105920e("AdLandingPageEggCardHelper", "loadLongSpriteImage, !fileExists");
                SnsMethodCalculate.markStartTimeMs("doDownloadSpriteImg", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                C100891r.m132207b("adId", str, true, 0, 0, new C57334e(this, str));
                SnsMethodCalculate.markEndTimeMs("doDownloadSpriteImg", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                C115669n.INSTANCE.mo175911u(1572, 19);
                SnsMethodCalculate.markEndTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                return false;
            }
            Bitmap decodeFile = BitmapUtil.decodeFile(k, (BitmapFactory.Options) null);
            if (decodeFile != null) {
                this.f274104o = decodeFile;
                C115669n.INSTANCE.mo175911u(1572, 18);
                Log.m105924i("AdLandingPageEggCardHelper", "loadLongSpriteImage succ");
                SnsMethodCalculate.markEndTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                return true;
            }
            Log.m105920e("AdLandingPageEggCardHelper", "loadLongSpriteImage, bitmap==null");
            C115669n.INSTANCE.mo175911u(1572, 19);
            SnsMethodCalculate.markEndTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        } catch (Throwable th) {
            Log.m105920e("AdLandingPageEggCardHelper", "loadLongSpriteImage, exp=" + th.toString());
        }
    }

    /* renamed from: u */
    public void mo130363u() {
        SnsMethodCalculate.markStartTimeMs("reqEggCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        try {
            int i = this.f274090a.mo132541n8().mo140742i();
            String nullAsNil = Util.nullAsNil(this.f274090a.mo132541n8().mo140745l());
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f274090a;
            snsAdNativeLandingPagesUI.getClass();
            SnsMethodCalculate.markStartTimeMs("getRawSnsId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            String str = snsAdNativeLandingPagesUI.f277522K;
            SnsMethodCalculate.markEndTimeMs("getRawSnsId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            String nullAsNil2 = Util.nullAsNil(str);
            String nullAsNil3 = Util.nullAsNil(this.f274090a.mo132541n8().mo140737d());
            Log.m105924i("AdLandingPageEggCardHelper", "start reqEggCardId, source=" + i + ", rawSnsId=" + nullAsNil2 + ", canvasId=" + nullAsNil3 + ", uxInfo=" + nullAsNil);
            long currentTimeMillis = System.currentTimeMillis();
            AdLandingPagesProxy.getInstance().getTwistAdCard(nullAsNil, nullAsNil2, i, nullAsNil3, "", new C94702a(currentTimeMillis, i));
        } catch (Throwable th) {
            Log.m105920e("AdLandingPageEggCardHelper", "reqEggCardId, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reqEggCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
    }

    /* renamed from: v */
    public final void mo130364v(boolean z, boolean z2) {
        boolean z3 = z;
        boolean z4 = z2;
        SnsMethodCalculate.markStartTimeMs("setFloatJumpCompVisible", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        Log.m105924i("AdLandingPageEggCardHelper", "setFloatJumpCompVisible, visible=" + z3 + ", withAnim=" + z4);
        try {
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f274090a;
            if (snsAdNativeLandingPagesUI == null) {
                Log.m105928w("AdLandingPageEggCardHelper", "setFloatJumpCompVisible, mLandingPagesUI==null");
                SnsMethodCalculate.markEndTimeMs("setFloatJumpCompVisible", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                return;
            }
            SnsMethodCalculate.markStartTimeMs("getFloatJumpComHelper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            FloatJumpCompHelper floatJumpCompHelper = snsAdNativeLandingPagesUI.f277501A2;
            SnsMethodCalculate.markEndTimeMs("getFloatJumpComHelper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (floatJumpCompHelper != null) {
                SnsMethodCalculate.markStartTimeMs("getComp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
                COMP comp = floatJumpCompHelper.f274146e;
                SnsMethodCalculate.markEndTimeMs("getComp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
                if (comp != null) {
                    if (comp instanceof C94646j) {
                        if (z3) {
                            SnsMethodCalculate.markStartTimeMs("setEnableShow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                            ((C94646j) comp).f273867F = true;
                            SnsMethodCalculate.markEndTimeMs("setEnableShow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                        } else {
                            SnsMethodCalculate.markStartTimeMs("setEnableShow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                            ((C94646j) comp).f273867F = false;
                            SnsMethodCalculate.markEndTimeMs("setEnableShow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
                        }
                    }
                    View i = comp.mo131609i();
                    if (i == null) {
                        Log.m105928w("AdLandingPageEggCardHelper", "setFloatJumpCompVisible, view==null");
                    } else if (!z3) {
                        if (i.getVisibility() != 0) {
                            SnsMethodCalculate.markEndTimeMs("setFloatJumpCompVisible", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                            return;
                        } else if (z4) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i, "alpha", new float[]{1.0f, 0.0f});
                            ofFloat.addListener(new C94706c(this, i));
                            ofFloat.setDuration(400);
                            ofFloat.start();
                        } else {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            C117292a.m165358d(i, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "setFloatJumpCompVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            i.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(i, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "setFloatJumpCompVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else if (i.getVisibility() == 0) {
                        SnsMethodCalculate.markEndTimeMs("setFloatJumpCompVisible", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        return;
                    } else {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        String str = "alpha";
                        C117292a.m165358d(i, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "setFloatJumpCompVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        i.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(i, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "setFloatJumpCompVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (z4) {
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(i, str, new float[]{0.0f, 1.0f});
                            ofFloat2.setDuration(400);
                            ofFloat2.start();
                        }
                    }
                } else {
                    Log.m105928w("AdLandingPageEggCardHelper", "setFloatJumpCompVisible, comp==null");
                }
            } else {
                Log.m105928w("AdLandingPageEggCardHelper", "setFloatJumpCompVisible, FloatJumpCompHelper==null");
            }
            SnsMethodCalculate.markEndTimeMs("setFloatJumpCompVisible", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        } catch (Throwable th) {
            Log.m105920e("AdLandingPageEggCardHelper", "setFloatJumpCompVisible exp=" + th.toString());
        }
    }

    /* renamed from: x */
    public final boolean mo130365x(ContentFragment contentFragment, boolean z) {
        String str;
        String str2;
        GLCardAnimView gLCardAnimView;
        int i;
        AdLandingPageEggCardHelper adLandingPageEggCardHelper = this;
        boolean z2 = z;
        SnsMethodCalculate.markStartTimeMs("tryPlayShakeAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        Log.m105924i("AdLandingPageEggCardHelper", "tryPlayShakeAdAnimation, isFromEncoreShake=" + z2);
        if (adLandingPageEggCardHelper.f274099j == null) {
            Log.m105920e("AdLandingPageEggCardHelper", "tryPlayShakeAdAnimation, ShakeAdCardView==null");
            SnsMethodCalculate.markEndTimeMs("tryPlayShakeAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        mo130361r(contentFragment);
        C94625d dVar = adLandingPageEggCardHelper.f274096g;
        if (dVar != null) {
            dVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getDropCardAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            C92435h.C92436a aVar = dVar.f273814s.f297602B;
            SnsMethodCalculate.markEndTimeMs("getDropCardAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            if (aVar == null && adLandingPageEggCardHelper.f274110u.f264514d == null) {
                SnsMethodCalculate.markEndTimeMs("tryPlayShakeAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                return false;
            }
            C92435h hVar = adLandingPageEggCardHelper.f274110u;
            if (hVar.f264514d == null) {
                hVar.f264514d = aVar;
            }
            if (TextUtils.isEmpty(adLandingPageEggCardHelper.f274097h) && !z2) {
                mo130363u();
            }
            if (adLandingPageEggCardHelper.f274090a.isSupportNavigationSwipeBack()) {
                adLandingPageEggCardHelper.f274090a.getSwipeBackLayout().setEnableGesture(false);
                adLandingPageEggCardHelper.f274090a.getSwipeBackLayout().mo26381c(true);
            }
            if (!z2) {
                adLandingPageEggCardHelper.f274099j.setVisibility(0);
                ShakeCardAnimView shakeCardAnimView = adLandingPageEggCardHelper.f274099j;
                C92435h.C92436a aVar2 = adLandingPageEggCardHelper.f274110u.f264514d;
                shakeCardAnimView.getClass();
                SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
                if (aVar2 == null) {
                    Log.m105920e("ShakeCardAnimView", "initData, ShakeCardInfo==null");
                    SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
                    str2 = "tryPlayShakeAdAnimation";
                    str = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper";
                } else {
                    Log.m105924i("ShakeCardAnimView", "initData");
                    shakeCardAnimView.f274462f = aVar2;
                    str2 = "tryPlayShakeAdAnimation";
                    str = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper";
                    if (shakeCardAnimView.f274465i) {
                        GLCardAnimView gLCardAnimView2 = shakeCardAnimView.f274464h;
                        gLCardAnimView2.getClass();
                        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                        ArrayList<C92435h.C92436a.C92437a> arrayList = aVar2.f264517a;
                        if (arrayList == null || arrayList.size() != 5) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("initData, cardItem.size=");
                            ArrayList<C92435h.C92436a.C92437a> arrayList2 = aVar2.f264517a;
                            sb.append(arrayList2 == null ? 0 : arrayList2.size());
                            Log.m105920e("GLCardAnimView", sb.toString());
                            SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                        } else {
                            ArrayList<C92435h.C92436a.C92437a> arrayList3 = aVar2.f264517a;
                            SnsMethodCalculate.markStartTimeMs("reOrderCardItemData", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(arrayList3.get(3));
                                arrayList4.add(arrayList3.get(1));
                                arrayList4.add(arrayList3.get(0));
                                arrayList4.add(arrayList3.get(2));
                                arrayList4.add(arrayList3.get(4));
                            } catch (Exception unused) {
                            }
                            SnsMethodCalculate.markEndTimeMs("reOrderCardItemData", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                            SnsMethodCalculate.markStartTimeMs("loadCardImg", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                            int a = C76577a.m92150a(gLCardAnimView2.f274450s, 4.0f);
                            int i2 = 0;
                            for (int i3 = 5; i2 < i3; i3 = 5) {
                                C103063b bVar = gLCardAnimView2.f274456y.get(i2);
                                ArrayList arrayList5 = arrayList4;
                                C92435h.C92436a.C92437a aVar3 = (C92435h.C92436a.C92437a) arrayList4.get(i2);
                                if (!TextUtils.isEmpty(aVar3.f264521b)) {
                                    try {
                                        bVar.mo142771h(C112668f.m154044a(gLCardAnimView2.f274451t, gLCardAnimView2.f274452u, Color.parseColor(aVar3.f264521b), a));
                                    } catch (Throwable th) {
                                        Log.m105920e("GLCardAnimView", "loadCardImg err=" + th.toString() + ", value=" + aVar3.f264521b);
                                    }
                                }
                                if (!TextUtils.isEmpty(aVar3.f264520a)) {
                                    String str3 = aVar3.f264520a;
                                    float f = (float) a;
                                    SnsMethodCalculate.markStartTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                                    if (TextUtils.isEmpty(str3)) {
                                        SnsMethodCalculate.markEndTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                                    } else {
                                        i = a;
                                        StringBuilder sb4 = new StringBuilder();
                                        gLCardAnimView = gLCardAnimView2;
                                        sb4.append("loadImageByCdn, hash=");
                                        sb4.append(bVar.hashCode());
                                        sb4.append(", url=");
                                        sb4.append(str3);
                                        Log.m105918d("SnsAd.AdImageLoader", sb4.toString());
                                        C100891r.m132208c(str3, false, 1, 0, new C101422h(bVar, str3, f));
                                        SnsMethodCalculate.markEndTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                                        i2++;
                                        boolean z3 = z;
                                        arrayList4 = arrayList5;
                                        a = i;
                                        gLCardAnimView2 = gLCardAnimView;
                                    }
                                }
                                i = a;
                                gLCardAnimView = gLCardAnimView2;
                                i2++;
                                boolean z34 = z;
                                arrayList4 = arrayList5;
                                a = i;
                                gLCardAnimView2 = gLCardAnimView;
                            }
                            SnsMethodCalculate.markEndTimeMs("loadCardImg", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                            SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                        }
                    } else {
                        CardAnimView cardAnimView = shakeCardAnimView.f274463g;
                        cardAnimView.getClass();
                        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                        ArrayList<C92435h.C92436a.C92437a> arrayList6 = aVar2.f264517a;
                        if (arrayList6 == null || arrayList6.size() != 5) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("initData, cardItem.size=");
                            ArrayList<C92435h.C92436a.C92437a> arrayList7 = aVar2.f264517a;
                            sb5.append(arrayList7 == null ? 0 : arrayList7.size());
                            Log.m105920e("ShakeCardAnimView", sb5.toString());
                            SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                        } else {
                            ArrayList<C92435h.C92436a.C92437a> arrayList8 = aVar2.f264517a;
                            SnsMethodCalculate.markStartTimeMs("reOrderCardItemData", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                arrayList9.add(arrayList8.get(3));
                                arrayList9.add(arrayList8.get(1));
                                arrayList9.add(arrayList8.get(0));
                                arrayList9.add(arrayList8.get(2));
                                arrayList9.add(arrayList8.get(4));
                            } catch (Exception unused2) {
                            }
                            SnsMethodCalculate.markEndTimeMs("reOrderCardItemData", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                            SnsMethodCalculate.markStartTimeMs("loadCardImg", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                            for (int i4 = 0; i4 < 5; i4++) {
                                ImageView imageView = (ImageView) cardAnimView.f274445j.get(i4);
                                C92435h.C92436a.C92437a aVar4 = (C92435h.C92436a.C92437a) arrayList9.get(i4);
                                if (!TextUtils.isEmpty(aVar4.f264521b)) {
                                    try {
                                        imageView.setImageDrawable(new ColorDrawable(Color.parseColor(aVar4.f264521b)));
                                    } catch (Exception e) {
                                        Log.m105920e("ShakeCardAnimView", "loadCardImg err=" + e.toString() + ", value=" + aVar4.f264521b);
                                    }
                                }
                                if (!TextUtils.isEmpty(aVar4.f264520a)) {
                                    C101419f.m133083f(aVar4.f264520a, imageView);
                                }
                            }
                            SnsMethodCalculate.markEndTimeMs("loadCardImg", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                            SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                        }
                    }
                    C92435h.C92436a aVar5 = shakeCardAnimView.f274462f;
                    shakeCardAnimView.mo130572c(aVar5.f264518b, aVar5.f264519c);
                    SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
                }
                adLandingPageEggCardHelper = this;
                adLandingPageEggCardHelper.f274099j.mo130575f();
                C119179t tVar = C119157j.f356862d;
                C94707d dVar2 = new C94707d();
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(dVar2, 1300, false);
            } else {
                str2 = "tryPlayShakeAdAnimation";
                str = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper";
                adLandingPageEggCardHelper.f274099j.setVisibility(0);
                ShakeCardAnimView shakeCardAnimView2 = adLandingPageEggCardHelper.f274099j;
                shakeCardAnimView2.getClass();
                SnsMethodCalculate.markStartTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
                Log.m105924i("ShakeCardAnimView", "resetAnim");
                if (shakeCardAnimView2.f274465i) {
                    GLCardAnimView gLCardAnimView3 = shakeCardAnimView2.f274464h;
                    gLCardAnimView3.getClass();
                    SnsMethodCalculate.markStartTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                    for (int i5 = 0; i5 < gLCardAnimView3.f274456y.size(); i5++) {
                        C103063b bVar2 = gLCardAnimView3.f274456y.get(i5);
                        bVar2.mo142775l(1.0f);
                        SnsMethodCalculate.markStartTimeMs("setRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        bVar2.f304095C = -0.0f;
                        bVar2.mo142766c();
                        SnsMethodCalculate.markEndTimeMs("setRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        SnsMethodCalculate.markStartTimeMs("setRotationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        bVar2.f304096D = 0.0f;
                        bVar2.mo142766c();
                        SnsMethodCalculate.markEndTimeMs("setRotationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        SnsMethodCalculate.markStartTimeMs("setTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        bVar2.f304106w = 0.0f;
                        bVar2.mo142766c();
                        SnsMethodCalculate.markEndTimeMs("setTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        SnsMethodCalculate.markStartTimeMs("setTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        bVar2.f304107x = 0.0f;
                        bVar2.mo142766c();
                        SnsMethodCalculate.markEndTimeMs("setTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        SnsMethodCalculate.markStartTimeMs("setScaleX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        bVar2.f304093A = 1.0f;
                        bVar2.mo142766c();
                        SnsMethodCalculate.markEndTimeMs("setScaleX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        SnsMethodCalculate.markStartTimeMs("setScaleY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        bVar2.f304094B = 1.0f;
                        bVar2.mo142766c();
                        SnsMethodCalculate.markEndTimeMs("setScaleY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                    }
                    SnsMethodCalculate.markEndTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                } else {
                    CardAnimView cardAnimView2 = shakeCardAnimView2.f274463g;
                    cardAnimView2.getClass();
                    SnsMethodCalculate.markStartTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                    for (int i6 = 0; i6 < cardAnimView2.f274445j.size(); i6++) {
                        View view = cardAnimView2.f274445j.get(i6);
                        C9556a aVar6 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar6.mo10233c(Float.valueOf(1.0f));
                        View view2 = view;
                        C117292a.m165358d(view2, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "resetAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setAlpha(((Float) aVar6.mo10231a(0)).floatValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "resetAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setRotation(0.0f);
                        view.setRotationY(0.0f);
                        view.setTranslationX(0.0f);
                        view.setTranslationY(0.0f);
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                    }
                    SnsMethodCalculate.markEndTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                }
                SnsMethodCalculate.markEndTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
                adLandingPageEggCardHelper.f274099j.mo130574e();
            }
            adLandingPageEggCardHelper.f274099j.setOnCardAnimListener(new C94708e(z));
            SnsMethodCalculate.markEndTimeMs(str2, str);
            return true;
        }
        Log.m105920e("AdLandingPageEggCardHelper", "tryPlayShakeAdAnimation, mEggCardComponent==null");
        SnsMethodCalculate.markEndTimeMs("tryPlayShakeAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return false;
    }

    /* renamed from: y */
    public final boolean mo130366y(ContentFragment contentFragment, boolean z) {
        Bitmap decodeFileWithSample;
        boolean z2 = z;
        SnsMethodCalculate.markStartTimeMs("tryPlayTwistAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (this.f274091b == null) {
            Log.m105920e("AdLandingPageEggCardHelper", "tryPlayTwistAdAnimation, TwistAdCardView==null");
            SnsMethodCalculate.markEndTimeMs("tryPlayTwistAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return false;
        }
        mo130361r(contentFragment);
        C94625d dVar = this.f274096g;
        if (dVar != null) {
            SnsMethodCalculate.markStartTimeMs("getTwistCardAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            C92435h.C92441e eVar = dVar.f273814s.f297601A;
            SnsMethodCalculate.markEndTimeMs("getTwistCardAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
            if (TextUtils.isEmpty(this.f274110u.f264512b.f264530b) && eVar != null) {
                C92435h.C92441e eVar2 = this.f274110u.f264512b;
                eVar2.f264530b = eVar.f264530b;
                eVar2.f264531c = eVar.f264531c;
            }
            if (!TextUtils.isEmpty(this.f274097h) || z2) {
                Log.m105928w("AdLandingPageEggCardHelper", "skip reqTwistCardId, twistCardId=" + this.f274097h);
            } else {
                mo130363u();
            }
            boolean z3 = true;
            if (this.f274090a.isSupportNavigationSwipeBack()) {
                this.f274090a.getSwipeBackLayout().setEnableGesture(false);
                this.f274090a.getSwipeBackLayout().mo26381c(true);
            }
            if (this.f274112w) {
                View i = this.f274096g.mo131609i();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(i, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "tryPlayTwistAdAnimation", "(Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(i, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "tryPlayTwistAdAnimation", "(Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f274091b.setVisibility(0);
            this.f274091b.setOnCardAnimListener(new C94709f(z2));
            Pair<Integer, Integer> U = this.f274096g.mo130206U();
            TwistRoateCardsView twistRoateCardsView = this.f274091b;
            int intValue = ((Integer) U.first).intValue();
            int intValue2 = ((Integer) U.second).intValue();
            C92435h.C92441e eVar3 = this.f274110u.f264512b;
            boolean z4 = eVar3.f264529a;
            String str = eVar3.f264530b;
            String str2 = eVar3.f264531c;
            twistRoateCardsView.getClass();
            SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            Log.m105924i("TwistRoateCardsView", "initData, defBgColor=" + str2 + ", imgUrl=" + str + ", isClockwise=" + z4);
            twistRoateCardsView.f274601t = str;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    twistRoateCardsView.f274602u = Color.parseColor(str2);
                } catch (Exception e) {
                    Log.m105920e("TwistRoateCardsView", "parseColor exp=" + e.toString());
                }
            }
            if (intValue <= 0 || intValue2 <= 0) {
                Log.m105920e("TwistRoateCardsView", "initData, size is 0, w=" + intValue + ", h=" + intValue2);
                twistRoateCardsView.f274592h = C76577a.m92151b(twistRoateCardsView.f274588d, 221);
                twistRoateCardsView.f274593i = C76577a.m92151b(twistRoateCardsView.f274588d, 375);
            } else {
                twistRoateCardsView.f274592h = (int) (((float) intValue) * 0.75f);
                twistRoateCardsView.f274593i = (int) (((float) intValue2) * 0.75f);
            }
            twistRoateCardsView.f274591g = C76577a.m92151b(twistRoateCardsView.f274588d, 200) + (twistRoateCardsView.f274593i / 2);
            twistRoateCardsView.f274599r = z4;
            if (z4) {
                twistRoateCardsView.f274600s = 3;
            } else {
                twistRoateCardsView.f274600s = 9;
            }
            twistRoateCardsView.removeAllViews();
            SnsMethodCalculate.markStartTimeMs("addCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            int i2 = 0;
            while (i2 < 12) {
                SnsMethodCalculate.markStartTimeMs("getCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
                ImageView imageView = new ImageView(twistRoateCardsView.f274588d);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(twistRoateCardsView.f274592h, twistRoateCardsView.f274593i);
                int i3 = twistRoateCardsView.f274594j;
                layoutParams.setMargins(i3, i3, i3, i3);
                layoutParams.gravity = 17;
                imageView.setLayoutParams(layoutParams);
                imageView.setClipToOutline(z3);
                imageView.setOutlineProvider(twistRoateCardsView.f274603v);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setBackgroundColor(twistRoateCardsView.f274602u);
                String str3 = twistRoateCardsView.f274601t;
                int i4 = twistRoateCardsView.f274592h;
                int i5 = twistRoateCardsView.f274593i;
                SnsMethodCalculate.markStartTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
                if (TextUtils.isEmpty(str3)) {
                    SnsMethodCalculate.markEndTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
                } else {
                    try {
                        Bitmap bitmap = TwistRoateCardsView.f274587y.get(str3);
                        if (bitmap != null) {
                            Log.m105924i("TwistRoateCardsView", "setCardBackgroundImg, hit memCache");
                            imageView.setImageBitmap(bitmap);
                            SnsMethodCalculate.markEndTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
                        } else {
                            String l = C100891r.m132217l("adId", str3);
                            if (C86013q1.m106450k(l) && (decodeFileWithSample = BitmapUtil.decodeFileWithSample(l, i4, i5)) != null && !decodeFileWithSample.isRecycled()) {
                                Log.m105924i("TwistRoateCardsView", "setCardBackgroundImg, hit diskCache");
                                imageView.setImageBitmap(decodeFileWithSample);
                                TwistRoateCardsView.f274587y.put(str3, decodeFileWithSample);
                                SnsMethodCalculate.markEndTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
                            }
                            Log.m105924i("TwistRoateCardsView", "setCardBackgroundImg, download img");
                            C101419f.m133080c(str3, imageView);
                            SnsMethodCalculate.markEndTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
                        }
                    } catch (Throwable th) {
                        Log.m105920e("TwistRoateCardsView", "setCardBackgroundImg, exp=" + th.toString());
                    }
                }
                FrameLayout frameLayout = new FrameLayout(twistRoateCardsView.f274588d);
                frameLayout.addView(imageView);
                frameLayout.setBackgroundResource(C0966R.C0969drawable.bqh);
                int i6 = twistRoateCardsView.f274592h;
                int i7 = twistRoateCardsView.f274594j * 2;
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(i6 + i7, twistRoateCardsView.f274593i + i7));
                SnsMethodCalculate.markEndTimeMs("getCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
                twistRoateCardsView.addView(frameLayout);
                i2++;
                z3 = true;
            }
            SnsMethodCalculate.markEndTimeMs("addCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            TwistRoateCardsView twistRoateCardsView2 = this.f274091b;
            twistRoateCardsView2.getClass();
            SnsMethodCalculate.markStartTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            twistRoateCardsView2.f274604w = 0;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(twistRoateCardsView2, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(1500);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{twistRoateCardsView2.f274599r ? -180.0f : 180.0f, 0.0f});
            ofFloat2.setDuration(1500);
            ofFloat2.addUpdateListener(new C98516i(twistRoateCardsView2));
            ofFloat2.addListener(new C98517j(twistRoateCardsView2));
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.3f, 1.0f});
            ofFloat3.setDuration(1500);
            ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat3.addUpdateListener(new C98518k(twistRoateCardsView2));
            ofFloat2.start();
            ofFloat3.start();
            ofFloat.start();
            SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            SnsMethodCalculate.markEndTimeMs("tryPlayTwistAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            return true;
        }
        Log.m105920e("AdLandingPageEggCardHelper", "mEggCardComponent==null");
        SnsMethodCalculate.markEndTimeMs("tryPlayTwistAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        return false;
    }
}
