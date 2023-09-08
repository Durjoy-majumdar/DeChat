package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.C95812i3;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import mo2.C99934a;
import mo2.C99936b;
import mo2.C99937c;
import nj3.C76912y0;
import org.json.JSONArray;
import org.json.JSONObject;
import p749xh.C102646h;
import po2.C47516d;
import po2.C47517e;
import qs2.C101255a0;
import qs2.C101264f;
import qs2.C101271i0;
import rq2.C101424j;
import so2.C101677l;
import te3.C50103ka2;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent */
public class AdLandingHBCardComponent extends C95295z implements C0124r {

    /* renamed from: A */
    public Bitmap f273699A;

    /* renamed from: B */
    public C99937c f273700B;

    /* renamed from: C */
    public C99934a f273701C;

    /* renamed from: D */
    public View.OnClickListener f273702D = new C94592a();

    /* renamed from: E */
    public boolean f273703E = false;

    /* renamed from: F */
    public View.OnClickListener f273704F = new C94593b();

    /* renamed from: G */
    public View.OnClickListener f273705G = new C94594c();

    /* renamed from: s */
    public C99936b f273706s;

    /* renamed from: t */
    public C99936b f273707t;

    /* renamed from: u */
    public C101677l f273708u;

    /* renamed from: v */
    public FrameLayout f273709v;

    /* renamed from: w */
    public int f273710w = -1;

    /* renamed from: x */
    public String f273711x = "";

    /* renamed from: y */
    public String f273712y = "";

    /* renamed from: z */
    public C101677l.C101678a f273713z;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$a */
    public class C94592a implements View.OnClickListener {
        public C94592a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$3");
            Log.m105924i("AdLandingHBCardComponent", "onInviteLinkClick, subType=" + AdLandingHBCardComponent.m119638H(AdLandingHBCardComponent.this));
            AdLandingHBCardComponent adLandingHBCardComponent = AdLandingHBCardComponent.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            Context context = adLandingHBCardComponent.f276579d;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            if (context instanceof SnsAdNativeLandingPagesUI) {
                AdLandingHBCardComponent adLandingHBCardComponent2 = AdLandingHBCardComponent.this;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                Context context2 = adLandingHBCardComponent2.f276579d;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                ((SnsAdNativeLandingPagesUI) context2).mo132501J8();
                if (AdLandingHBCardComponent.m119638H(AdLandingHBCardComponent.this) != 3) {
                    AdLandingHBCardComponent.m119639I(AdLandingHBCardComponent.this).mo139273d(AdLandingHBCardComponent.m119638H(AdLandingHBCardComponent.this), false, 3);
                } else {
                    AdLandingHBCardComponent.m119639I(AdLandingHBCardComponent.this).mo139273d(1, true, 3);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$b */
    public class C94593b implements View.OnClickListener {
        public C94593b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$4");
            Log.m105924i("AdLandingHBCardComponent", "onGetHbBtnClick, subType=" + AdLandingHBCardComponent.m119638H(AdLandingHBCardComponent.this));
            if (AdLandingHBCardComponent.m119638H(AdLandingHBCardComponent.this) != 3) {
                AdLandingHBCardComponent.m119639I(AdLandingHBCardComponent.this).mo139273d(AdLandingHBCardComponent.m119638H(AdLandingHBCardComponent.this), false, 1);
            } else {
                AdLandingHBCardComponent.m119639I(AdLandingHBCardComponent.this).mo139273d(1, true, 1);
            }
            if (AdLandingHBCardComponent.m119638H(AdLandingHBCardComponent.this) == 4) {
                AdLandingHBCardComponent adLandingHBCardComponent = AdLandingHBCardComponent.this;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                C101677l.C101678a aVar = adLandingHBCardComponent.f273713z;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                boolean O = adLandingHBCardComponent.mo130150O(aVar);
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                if (O) {
                    AdLandingHBCardComponent.m119636E(AdLandingHBCardComponent.this).mo139281h(false);
                    C99936b E = AdLandingHBCardComponent.m119636E(AdLandingHBCardComponent.this);
                    AdLandingHBCardComponent adLandingHBCardComponent2 = AdLandingHBCardComponent.this;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                    C101677l.C101678a aVar2 = adLandingHBCardComponent2.f273713z;
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                    E.mo139283j(aVar2.f297649e);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$4");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                AdLandingHBCardComponent adLandingHBCardComponent3 = AdLandingHBCardComponent.this;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                Context context = adLandingHBCardComponent3.f276579d;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                String string = context.getString(C0966R.string.j_u);
                SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                Context context2 = adLandingHBCardComponent3.f276579d;
                if (context2 instanceof SnsAdNativeLandingPagesUI) {
                    ((SnsAdNativeLandingPagesUI) context2).mo132517V8(string);
                }
                SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                AdLandingHBCardComponent adLandingHBCardComponent4 = AdLandingHBCardComponent.this;
                C99936b E2 = AdLandingHBCardComponent.m119636E(adLandingHBCardComponent4);
                AdLandingHBCardComponent adLandingHBCardComponent5 = AdLandingHBCardComponent.this;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                C101677l.C101678a aVar3 = adLandingHBCardComponent5.f273713z;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                adLandingHBCardComponent4.mo130149N(E2, aVar3, 1);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$4");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (AdLandingHBCardComponent.m119638H(AdLandingHBCardComponent.this) == 3) {
                AdLandingHBCardComponent adLandingHBCardComponent6 = AdLandingHBCardComponent.this;
                SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                adLandingHBCardComponent6.f273703E = true;
                SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            }
            AdLandingHBCardComponent adLandingHBCardComponent7 = AdLandingHBCardComponent.this;
            SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            String str = adLandingHBCardComponent7.f273712y;
            SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            adLandingHBCardComponent7.mo130146J(str);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$4");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$c */
    public class C94594c implements View.OnClickListener {
        public C94594c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$5");
            AdLandingHBCardComponent adLandingHBCardComponent = AdLandingHBCardComponent.this;
            SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            Context context = adLandingHBCardComponent.f276579d;
            SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            if (context instanceof SnsAdNativeLandingPagesUI) {
                C101677l G = AdLandingHBCardComponent.m119637G(AdLandingHBCardComponent.this);
                SnsMethodCalculate.markStartTimeMs("getShageGiveCardXMLInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
                String str = "<giveHBCardInfo>" + "<twistCardId>" + G.f296515u + "</twistCardId>" + "<giveCardId>" + G.f297644z + "</giveCardId>" + "<senderUserName>" + AdLandingPagesProxy.getInstance().getSelfUserName() + "</senderUserName>" + "<senderNickName>" + AdLandingPagesProxy.getInstance().getSelfNickName() + "</senderNickName>" + "<subCardType>" + 4 + "</subCardType>" + "<shareTime>" + AdLandingPagesProxy.getInstance().getSyncServerTimeSecond() + "</shareTime>" + "</giveHBCardInfo>";
                SnsMethodCalculate.markEndTimeMs("getShageGiveCardXMLInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
                String str2 = AdLandingHBCardComponent.m119637G(AdLandingHBCardComponent.this).f297638G;
                String selfNickName = AdLandingPagesProxy.getInstance().getSelfNickName();
                if (TextUtils.isEmpty(str2)) {
                    AdLandingHBCardComponent adLandingHBCardComponent2 = AdLandingHBCardComponent.this;
                    SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                    Context context2 = adLandingHBCardComponent2.f276579d;
                    SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                    str2 = context2.getString(C0966R.string.j_g);
                }
                if (!TextUtils.isEmpty(selfNickName)) {
                    str2 = selfNickName + str2;
                }
                String str3 = str2;
                Log.m105924i("AdLandingHBCardComponent", "onShareGiveCard, xml=" + str + ", shareTitle=" + str3 + ", compSubType=" + AdLandingHBCardComponent.m119637G(AdLandingHBCardComponent.this).f296504j);
                String str4 = AdLandingHBCardComponent.m119637G(AdLandingHBCardComponent.this).f297639H;
                if (TextUtils.isEmpty(str4)) {
                    if (AdLandingHBCardComponent.m119637G(AdLandingHBCardComponent.this).f296504j == 0) {
                        str4 = AdLandingHBCardComponent.m119637G(AdLandingHBCardComponent.this).f297632A;
                        Log.m105924i("AdLandingHBCardComponent", "shareThumbUrl is empty, use hbImgUrl");
                    } else if (AdLandingHBCardComponent.m119637G(AdLandingHBCardComponent.this).f296504j == 1 && AdLandingHBCardComponent.m119637G(AdLandingHBCardComponent.this).f297633B != null && !TextUtils.isEmpty(AdLandingHBCardComponent.m119637G(AdLandingHBCardComponent.this).f297633B.f296574A)) {
                        str4 = AdLandingHBCardComponent.m119637G(AdLandingHBCardComponent.this).f297633B.f296574A;
                        Log.m105924i("AdLandingHBCardComponent", "shareThumbUrl is empty, use video.thumbUrl");
                    }
                }
                String str5 = str4;
                AdLandingHBCardComponent adLandingHBCardComponent3 = AdLandingHBCardComponent.this;
                SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                Context context3 = adLandingHBCardComponent3.f276579d;
                SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (SnsAdNativeLandingPagesUI) context3;
                String str6 = AdLandingHBCardComponent.m119637G(AdLandingHBCardComponent.this).f297634C;
                snsAdNativeLandingPagesUI.getClass();
                SnsMethodCalculate.markStartTimeMs("shareGiveHbCard", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                if (SnsAdNativeLandingPagesUI.m121800F8()) {
                    snsAdNativeLandingPagesUI.mo132525a8(new C95812i3(snsAdNativeLandingPagesUI, str, str3, str6, str5));
                } else {
                    snsAdNativeLandingPagesUI.mo132513T8(snsAdNativeLandingPagesUI.f277627x, (String) null, str, str3, str6, str5);
                }
                SnsMethodCalculate.markEndTimeMs("shareGiveHbCard", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                if (AdLandingHBCardComponent.m119638H(AdLandingHBCardComponent.this) != 3) {
                    AdLandingHBCardComponent.m119639I(AdLandingHBCardComponent.this).mo139273d(AdLandingHBCardComponent.m119638H(AdLandingHBCardComponent.this), false, 2);
                } else {
                    AdLandingHBCardComponent.m119639I(AdLandingHBCardComponent.this).mo139273d(2, true, 2);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$5");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$d */
    public class C94595d implements Runnable {
        public C94595d() {
        }

        public void run() {
            String str;
            String str2;
            C99936b bVar;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$6");
            AdLandingHBCardComponent adLandingHBCardComponent = AdLandingHBCardComponent.this;
            adLandingHBCardComponent.getClass();
            SnsMethodCalculate.markStartTimeMs("startDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            if (adLandingHBCardComponent.f273710w != 3 || adLandingHBCardComponent.f273707t == null || (bVar = adLandingHBCardComponent.f273706s) == null) {
                str2 = "run";
                str = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$6";
            } else {
                bVar.mo139280f();
                View view = adLandingHBCardComponent.f273706s.f292813c;
                View view2 = adLandingHBCardComponent.f273707t.f292813c;
                SnsMethodCalculate.markStartTimeMs("doDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                if (view == null || view2 == null) {
                    str2 = "run";
                    str = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$6";
                    SnsMethodCalculate.markEndTimeMs("doDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                } else {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f, (float) (-C76577a.m92151b(adLandingHBCardComponent.f276579d, 300))});
                    ofFloat.setDuration(500);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
                    ofFloat2.setDuration(500);
                    ofFloat2.addListener(new C94677t(adLandingHBCardComponent, view));
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f, 1.05f});
                    ObjectAnimator objectAnimator = ofFloat;
                    ofFloat3.setDuration(250);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f, 1.05f});
                    ofFloat4.setDuration(250);
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.05f, 1.0f});
                    str2 = "run";
                    str = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$6";
                    ofFloat5.setDuration(250);
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.05f, 1.0f});
                    ofFloat6.setDuration(250);
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view2, "Rotation", new float[]{5.0f, 0.0f});
                    ObjectAnimator objectAnimator2 = ofFloat5;
                    ofFloat7.setDuration(500);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(objectAnimator).with(ofFloat2).with(ofFloat7);
                    animatorSet.play(ofFloat3).with(ofFloat4);
                    animatorSet.play(objectAnimator2).with(ofFloat6);
                    animatorSet.play(objectAnimator2).after(ofFloat3);
                    animatorSet.start();
                    SnsMethodCalculate.markEndTimeMs("doDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                }
                adLandingHBCardComponent.f273701C.mo139274e(2, true);
            }
            SnsMethodCalculate.markEndTimeMs("startDoubleCardDisappearAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            SnsMethodCalculate.markEndTimeMs(str2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$e */
    public static class C94596e implements AdLandingPagesProxy.C94830p {

        /* renamed from: a */
        public WeakReference<C99936b> f273718a;

        /* renamed from: b */
        public WeakReference<AdLandingHBCardComponent> f273719b;

        /* renamed from: c */
        public C101677l.C101678a f273720c;

        /* renamed from: d */
        public int f273721d;

        /* renamed from: e */
        public long f273722e = System.currentTimeMillis();

        /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$e$a */
        public class C94597a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f273723d;

            public C94597a(C94596e eVar, Context context) {
                this.f273723d = context;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback$1");
                Context context = this.f273723d;
                C76912y0.m92774m(context, context.getString(C0966R.string.j_e));
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$e$b */
        public class C94598b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f273724d;

            /* renamed from: e */
            public final /* synthetic */ C99936b f273725e;

            /* renamed from: f */
            public final /* synthetic */ AdLandingHBCardComponent f273726f;

            /* renamed from: g */
            public final /* synthetic */ String f273727g;

            /* renamed from: h */
            public final /* synthetic */ Context f273728h;

            public C94598b(int i, C99936b bVar, AdLandingHBCardComponent adLandingHBCardComponent, String str, Context context) {
                this.f273724d = i;
                this.f273725e = bVar;
                this.f273726f = adLandingHBCardComponent;
                this.f273727g = str;
                this.f273728h = context;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback$2");
                int i = this.f273724d;
                if (i == 1) {
                    this.f273725e.mo139281h(true);
                    C99936b bVar = this.f273725e;
                    C94596e eVar = C94596e.this;
                    SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
                    C101677l.C101678a aVar = eVar.f273720c;
                    SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
                    bVar.mo139283j(aVar.f297648d);
                    C94596e eVar2 = C94596e.this;
                    SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
                    int i2 = eVar2.f273721d;
                    SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
                    if (i2 == 1) {
                        this.f273726f.mo130146J(this.f273727g);
                    }
                } else if (i == 2) {
                    this.f273725e.mo139281h(false);
                    C99936b bVar2 = this.f273725e;
                    C94596e eVar3 = C94596e.this;
                    SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
                    C101677l.C101678a aVar2 = eVar3.f273720c;
                    SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
                    bVar2.mo139283j(aVar2.f297650f);
                    C94596e eVar4 = C94596e.this;
                    SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
                    int i3 = eVar4.f273721d;
                    SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
                    if (i3 == 1) {
                        Context context = this.f273728h;
                        C76912y0.m92774m(context, context.getString(C0966R.string.j_d));
                    }
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback$2");
            }
        }

        public C94596e(AdLandingHBCardComponent adLandingHBCardComponent, C99936b bVar, C101677l.C101678a aVar, int i) {
            this.f273719b = new WeakReference<>(adLandingHBCardComponent);
            this.f273718a = new WeakReference<>(bVar);
            this.f273720c = aVar;
            this.f273721d = i;
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            String str;
            AdLandingHBCardComponent adLandingHBCardComponent;
            String str2;
            int i3 = i;
            int i4 = i2;
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
            SnsMethodCalculate.markStartTimeMs("parseTwistCardStatusInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
            Log.m105924i("NetSceneAdGetTwistCardStatus", "parseTwistCardStatusInfo, errType=" + i3 + ", errNo=" + i4);
            Bundle bundle = new Bundle();
            String str3 = "onCallback";
            String str4 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback";
            if (i3 == 0 && i4 == 0 && obj != null) {
                C50103ka2 ka22 = new C50103ka2();
                try {
                    ka22.parseFrom((byte[]) obj);
                    bundle.putInt("status", ka22.f136636d);
                    bundle.putString("card_id", Util.nullAsNil(ka22.f136637e));
                    bundle.putString("give_card_id", Util.nullAsNil(ka22.f136638f));
                    bundle.putString("receive_url", ka22.f136639g);
                    StringBuilder sb = new StringBuilder();
                    str = ", errNo=";
                    try {
                        sb.append("parseTwistCardStatusInfo, status=");
                        sb.append(ka22.f136636d);
                        sb.append(", cardId=");
                        sb.append(ka22.f136637e);
                        sb.append(", giveCardId=");
                        sb.append(ka22.f136638f);
                        sb.append(", jumpUrl=");
                        sb.append(ka22.f136639g);
                        Log.m105924i("NetSceneAdGetTwistCardStatus", sb.toString());
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str = ", errNo=";
                    Log.m105920e("NetSceneAdGetTwistCardStatus", "parseTwistCardStatusInfo exp=" + th.toString());
                    SnsMethodCalculate.markEndTimeMs("parseTwistCardStatusInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
                    int i5 = bundle.getInt("status", -1);
                    String string = bundle.getString("card_id", "");
                    String string2 = bundle.getString("give_card_id", "");
                    String string3 = bundle.getString("receive_url", "");
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("getHBStatus rsp, errType=");
                    sb4.append(i3);
                    sb4.append(str);
                    int i6 = i2;
                    sb4.append(i6);
                    sb4.append(", status=");
                    sb4.append(i5);
                    sb4.append(", cardId=");
                    sb4.append(string);
                    sb4.append(", giveCardId=");
                    sb4.append(string2);
                    sb4.append(", timeCost=");
                    sb4.append(System.currentTimeMillis() - this.f273722e);
                    sb4.append(", opType=");
                    sb4.append(this.f273721d);
                    sb4.append(", jumpUrl=");
                    sb4.append(string3);
                    Log.m105924i("AdLandingHBCardComponent", sb4.toString());
                    adLandingHBCardComponent = this.f273719b.get();
                    C99936b bVar = this.f273718a.get();
                    if (adLandingHBCardComponent != null) {
                    }
                    Log.m105920e("AdLandingHBCardComponent", "onCallback, hbComp==null or showCard==null");
                    SnsMethodCalculate.markEndTimeMs(str3, str4);
                    return;
                }
            } else {
                str = ", errNo=";
            }
            SnsMethodCalculate.markEndTimeMs("parseTwistCardStatusInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
            int i54 = bundle.getInt("status", -1);
            String string4 = bundle.getString("card_id", "");
            String string22 = bundle.getString("give_card_id", "");
            String string32 = bundle.getString("receive_url", "");
            StringBuilder sb42 = new StringBuilder();
            sb42.append("getHBStatus rsp, errType=");
            sb42.append(i3);
            sb42.append(str);
            int i64 = i2;
            sb42.append(i64);
            sb42.append(", status=");
            sb42.append(i54);
            sb42.append(", cardId=");
            sb42.append(string4);
            sb42.append(", giveCardId=");
            sb42.append(string22);
            sb42.append(", timeCost=");
            sb42.append(System.currentTimeMillis() - this.f273722e);
            sb42.append(", opType=");
            sb42.append(this.f273721d);
            sb42.append(", jumpUrl=");
            sb42.append(string32);
            Log.m105924i("AdLandingHBCardComponent", sb42.toString());
            adLandingHBCardComponent = this.f273719b.get();
            C99936b bVar2 = this.f273718a.get();
            if (adLandingHBCardComponent != null || bVar2 == null) {
                Log.m105920e("AdLandingHBCardComponent", "onCallback, hbComp==null or showCard==null");
                SnsMethodCalculate.markEndTimeMs(str3, str4);
                return;
            }
            SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            Context context = adLandingHBCardComponent.f276579d;
            if (context instanceof SnsAdNativeLandingPagesUI) {
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (SnsAdNativeLandingPagesUI) context;
                snsAdNativeLandingPagesUI.getClass();
                SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                C47517e eVar = snsAdNativeLandingPagesUI.f277541S1;
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                ((C119157j) C119157j.f356862d).mo183895z(new C47516d(eVar));
                SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            }
            SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            C101677l lVar = (C101677l) adLandingHBCardComponent.mo131850h();
            SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            Context context2 = adLandingHBCardComponent.f276579d;
            SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            if (i3 == 0 && i64 == 0 && obj != null) {
                if (!(lVar == null || (str2 = lVar.f297644z) == null || !str2.equals(string22) || this.f273720c == null)) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C94598b(i54, bVar2, adLandingHBCardComponent, string32, context2));
                }
                SnsMethodCalculate.markEndTimeMs(str3, str4);
                return;
            }
            String str5 = str3;
            String str6 = str4;
            if (this.f273721d == 1) {
                ((C119157j) C119157j.f356862d).mo183895z(new C94597a(this, context2));
            }
            SnsMethodCalculate.markEndTimeMs(str5, str6);
        }
    }

    public AdLandingHBCardComponent(Context context, C101677l lVar, ViewGroup viewGroup) {
        super(context, lVar, viewGroup);
        this.f273708u = lVar;
        this.f273701C = new C99934a((SnsAdNativeLandingPagesUI) context, this, lVar);
    }

    /* renamed from: E */
    public static /* synthetic */ C99936b m119636E(AdLandingHBCardComponent adLandingHBCardComponent) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        C99936b bVar = adLandingHBCardComponent.f273707t;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return bVar;
    }

    /* renamed from: G */
    public static /* synthetic */ C101677l m119637G(AdLandingHBCardComponent adLandingHBCardComponent) {
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        C101677l lVar = adLandingHBCardComponent.f273708u;
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return lVar;
    }

    /* renamed from: H */
    public static /* synthetic */ int m119638H(AdLandingHBCardComponent adLandingHBCardComponent) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        int i = adLandingHBCardComponent.f273710w;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return i;
    }

    /* renamed from: I */
    public static /* synthetic */ C99934a m119639I(AdLandingHBCardComponent adLandingHBCardComponent) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        C99934a aVar = adLandingHBCardComponent.f273701C;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return aVar;
    }

    /* renamed from: P */
    public static void m119640P(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        SnsMethodCalculate.markStartTimeMs("mergeIntValue", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        try {
            jSONObject.put(str, jSONObject.optInt(str) + jSONObject2.optInt(str));
        } catch (Exception e) {
            Log.m105920e("AdLandingHBCardComponent", "mergeIntValue exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("mergeIntValue", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (r2 != 4) goto L_0x0065;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo130145A() {
        /*
            r4 = this;
            java.lang.String r0 = "viewAppeared"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            super.mo130145A()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "hbComp viewAppeared, subCardType="
            r2.append(r3)
            int r3 = r4.f273710w
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "AdLandingHBCardComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            int r2 = r4.f273710w
            r3 = 1
            if (r2 == r3) goto L_0x005e
            r3 = 2
            if (r2 == r3) goto L_0x0056
            r3 = 3
            if (r2 == r3) goto L_0x0032
            r3 = 4
            if (r2 == r3) goto L_0x0056
            goto L_0x0065
        L_0x0032:
            mo2.b r2 = r4.f273706s
            if (r2 == 0) goto L_0x0044
            android.view.View r2 = r2.f292813c
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0044
            mo2.b r2 = r4.f273706s
            r2.mo139277c()
            goto L_0x0065
        L_0x0044:
            mo2.b r2 = r4.f273707t
            if (r2 == 0) goto L_0x0065
            android.view.View r2 = r2.f292813c
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0065
            mo2.b r2 = r4.f273707t
            r2.mo139277c()
            goto L_0x0065
        L_0x0056:
            mo2.b r2 = r4.f273707t
            if (r2 == 0) goto L_0x0065
            r2.mo139277c()
            goto L_0x0065
        L_0x005e:
            mo2.b r2 = r4.f273706s
            if (r2 == 0) goto L_0x0065
            r2.mo139277c()
        L_0x0065:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingHBCardComponent.mo130145A():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (r2 != 4) goto L_0x0065;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo124360B() {
        /*
            r4 = this;
            java.lang.String r0 = "viewWillAppear"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            super.mo124360B()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "hbComp viewWillAppear, subCardType="
            r2.append(r3)
            int r3 = r4.f273710w
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "AdLandingHBCardComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            int r2 = r4.f273710w
            r3 = 1
            if (r2 == r3) goto L_0x005e
            r3 = 2
            if (r2 == r3) goto L_0x0056
            r3 = 3
            if (r2 == r3) goto L_0x0032
            r3 = 4
            if (r2 == r3) goto L_0x0056
            goto L_0x0065
        L_0x0032:
            mo2.b r2 = r4.f273706s
            if (r2 == 0) goto L_0x0044
            android.view.View r2 = r2.f292813c
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0044
            mo2.b r2 = r4.f273706s
            r2.mo139278d()
            goto L_0x0065
        L_0x0044:
            mo2.b r2 = r4.f273707t
            if (r2 == 0) goto L_0x0065
            android.view.View r2 = r2.f292813c
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0065
            mo2.b r2 = r4.f273707t
            r2.mo139278d()
            goto L_0x0065
        L_0x0056:
            mo2.b r2 = r4.f273707t
            if (r2 == 0) goto L_0x0065
            r2.mo139278d()
            goto L_0x0065
        L_0x005e:
            mo2.b r2 = r4.f273706s
            if (r2 == 0) goto L_0x0065
            r2.mo139278d()
        L_0x0065:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingHBCardComponent.mo124360B():void");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        super.mo67235C();
        Log.m105918d("AdLandingHBCardComponent", "hbComp viewWillDestroy");
        C99936b bVar = this.f273706s;
        if (bVar != null) {
            bVar.mo139279e();
        }
        C99936b bVar2 = this.f273707t;
        if (bVar2 != null) {
            bVar2.mo139279e();
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        super.mo124361D();
        Log.m105918d("AdLandingHBCardComponent", "hbComp viewWillDisappear");
        C99936b bVar = this.f273706s;
        if (bVar != null) {
            bVar.mo139280f();
        }
        C99936b bVar2 = this.f273707t;
        if (bVar2 != null) {
            bVar2.mo139280f();
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* renamed from: J */
    public void mo130146J(String str) {
        SnsMethodCalculate.markStartTimeMs("doGetHBCover", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        String str2 = TextUtils.isEmpty(str) ? this.f273708u.f297637F : str;
        C101271i0 m = mo131854m();
        String g = m.mo140740g();
        long safeParseLong = Util.safeParseLong(g);
        Log.m105924i("AdLandingHBCardComponent", "doGetHBCover, subType=" + this.f273710w + ", jumpUrl=" + str2 + ", dynamicUrl=" + str + ", snsId=" + g);
        C101424j.m133095a(this.f276579d, str2, m, m.mo140742i(), safeParseLong, this.f273708u.f296495a);
        SnsMethodCalculate.markEndTimeMs("doGetHBCover", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* renamed from: K */
    public final FrameLayout.LayoutParams mo130147K() {
        SnsMethodCalculate.markStartTimeMs("getCardContentLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        C101255a0 a0Var = this.f276580e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) a0Var.f296501g, (int) a0Var.f296502h);
        layoutParams.gravity = 1;
        C101255a0 a0Var2 = this.f276580e;
        layoutParams.topMargin = (int) a0Var2.f296497c;
        layoutParams.bottomMargin = (int) a0Var2.f296498d;
        layoutParams.leftMargin = (int) a0Var2.f296499e;
        layoutParams.rightMargin = (int) a0Var2.f296500f;
        SnsMethodCalculate.markEndTimeMs("getCardContentLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return layoutParams;
    }

    /* renamed from: M */
    public JSONObject mo130148M() {
        SnsMethodCalculate.markStartTimeMs("getCurrentShowCardStatInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        try {
            JSONObject jSONObject = new JSONObject();
            int i = this.f273710w;
            if (i != 3) {
                jSONObject.put("subType", i);
                jSONObject.put("isDoubleCard", 0);
            } else {
                jSONObject.put("isDoubleCard", 1);
                if (this.f273706s.f292813c.getVisibility() == 0) {
                    jSONObject.put("subType", 1);
                } else if (this.f273707t.f292813c.getVisibility() == 0) {
                    jSONObject.put("subType", 2);
                }
            }
            if (jSONObject.optInt("subType") != 1) {
                jSONObject.put("giveCardId", this.f273708u.f297644z);
            }
            SnsMethodCalculate.markEndTimeMs("getCurrentShowCardStatInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            return jSONObject;
        } catch (Exception e) {
            Log.m105920e("AdLandingHBCardComponent", "getCurrentShowCardStatInfo, exp=" + e.toString());
            SnsMethodCalculate.markEndTimeMs("getCurrentShowCardStatInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            return null;
        }
    }

    /* renamed from: N */
    public void mo130149N(C99936b bVar, C101677l.C101678a aVar, int i) {
        SnsMethodCalculate.markStartTimeMs("getHBStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        C101271i0 m = mo131854m();
        int i2 = m.mo140742i();
        String nullAsNil = Util.nullAsNil(m.mo140745l());
        String nullAsNil2 = Util.nullAsNil(m.mo140737d());
        C101677l lVar = this.f273708u;
        AdLandingPagesProxy.getInstance().getTwistAdCardStatus(nullAsNil, i2, nullAsNil2, lVar.f296515u, lVar.f297644z, i, new C94596e(this, bVar, aVar, i));
        SnsMethodCalculate.markEndTimeMs("getHBStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* renamed from: O */
    public final boolean mo130150O(C101677l.C101678a aVar) {
        int i;
        SnsMethodCalculate.markStartTimeMs("isHBExpired", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        boolean z = false;
        if (this.f273700B != null) {
            int syncServerTimeSecond = AdLandingPagesProxy.getInstance().getSyncServerTimeSecond();
            int i2 = 86400;
            if (aVar == null || (i = aVar.f297651g) <= 0) {
                Log.m105920e("AdLandingHBCardComponent", "isHBExpired, use Default");
            } else {
                i2 = i;
            }
            if (this.f273700B.f292839f + ((long) i2) < ((long) syncServerTimeSecond)) {
                z = true;
            }
            Log.m105924i("AdLandingHBCardComponent", "isHBExpired, shareTime=" + this.f273700B.f292839f + ", expireTime=" + i2 + ", now=" + syncServerTimeSecond + ", sys.now=" + (System.currentTimeMillis() / 1000));
        } else {
            Log.m105920e("AdLandingHBCardComponent", "isHBExpired, mShareInfo==null");
        }
        SnsMethodCalculate.markEndTimeMs("isHBExpired", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return z;
    }

    /* renamed from: Q */
    public void mo130151Q() {
        C99936b bVar;
        SnsMethodCalculate.markStartTimeMs("restoreVideoToOriginState", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        try {
            if (mo131609i().getVisibility() != 0) {
                Log.m105924i("AdLandingHBCardComponent", "restoreVideoToOriginState, hbCardComp invisible, id=" + mo131857r());
                SnsMethodCalculate.markEndTimeMs("restoreVideoToOriginState", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                return;
            }
            SnsMethodCalculate.markStartTimeMs("getCurrentShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            C99936b bVar2 = this.f273706s;
            if (bVar2 == null || bVar2.f292813c.getVisibility() != 0) {
                C99936b bVar3 = this.f273707t;
                if (bVar3 == null || bVar3.f292813c.getVisibility() != 0) {
                    bVar = null;
                    SnsMethodCalculate.markEndTimeMs("getCurrentShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                } else {
                    bVar = this.f273707t;
                    SnsMethodCalculate.markEndTimeMs("getCurrentShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                }
            } else {
                bVar = this.f273706s;
                SnsMethodCalculate.markEndTimeMs("getCurrentShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            }
            if (!(bVar == null || bVar.f292821k == null)) {
                Log.m105924i("AdLandingHBCardComponent", "restoreVideoToOriginState, vidoCompId=" + bVar.f292821k.mo131857r());
                bVar.f292821k.mo130232G();
                bVar.f292821k.mo130247t();
            }
            SnsMethodCalculate.markEndTimeMs("restoreVideoToOriginState", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        } catch (Exception e) {
            Log.m105920e("AdLandingHBCardComponent", "restoreVideoToOriginState, exp=" + e.toString());
        }
    }

    /* renamed from: R */
    public final void mo130152R(C99936b bVar) {
        SnsMethodCalculate.markStartTimeMs("setCardLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        bVar.f292815e.setLayoutParams(mo130147K());
        bVar.f292814d.setLayoutParams(mo130147K());
        SnsMethodCalculate.markEndTimeMs("setCardLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* renamed from: U */
    public final void mo130153U(int i) {
        C101677l.C101678a aVar;
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("setSubCardType", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        C101677l lVar = this.f273708u;
        lVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getHBCardInfoByType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
        if (i2 < 1 || i2 > 4) {
            SnsMethodCalculate.markEndTimeMs("getHBCardInfoByType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
            aVar = null;
        } else {
            C101677l.C101678a aVar2 = lVar.f297643L[i2 - 1];
            SnsMethodCalculate.markEndTimeMs("getHBCardInfoByType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
            aVar = aVar2;
        }
        if (aVar == null) {
            Log.m105920e("AdLandingHBCardComponent", "setSubCardType, cardInfo==null, subType=" + i2);
            SnsMethodCalculate.markEndTimeMs("setSubCardType", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            return;
        }
        this.f273710w = i2;
        this.f273713z = aVar;
        Log.m105924i("AdLandingHBCardComponent", "setSubCardType, subType=" + i2);
        if (i2 == 1) {
            View view = this.f273706s.f292813c;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f273707t.f292813c;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C99936b bVar = this.f273706s;
            bVar.f292822l.setOnClickListener(this.f273704F);
            View view5 = bVar.f292830t;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bVar.f292830t.setOnClickListener(this.f273702D);
            bVar.mo139284k(aVar);
            bVar.f292815e.setBackgroundResource(C0966R.C0969drawable.btf);
        } else if (i2 == 2) {
            View view7 = this.f273706s.f292813c;
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar6.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view9 = this.f273707t.f292813c;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(0);
            View view10 = view9;
            C117292a.m165358d(view10, aVar7.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C99936b bVar2 = this.f273707t;
            bVar2.f292822l.setOnClickListener(this.f273705G);
            View view11 = bVar2.f292824n;
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(8);
            View view12 = view11;
            C117292a.m165358d(view12, aVar8.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bVar2.f292816f.setVisibility(0);
            bVar2.mo139282i(0);
            bVar2.mo139284k(aVar);
        } else if (i2 == 3) {
            View view13 = this.f273706s.f292813c;
            C9556a aVar9 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar9.mo10233c(0);
            View view14 = view13;
            C117292a.m165358d(view14, aVar9.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view14, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f273706s.f292822l.setOnClickListener(this.f273704F);
            View view15 = this.f273706s.f292830t;
            C9556a aVar10 = new C9556a();
            aVar10.mo10233c(0);
            View view16 = view15;
            C117292a.m165358d(view16, aVar10.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f273706s.f292830t.setOnClickListener(this.f273702D);
            this.f273706s.f292815e.setBackgroundResource(C0966R.C0969drawable.bta);
            View view17 = this.f273707t.f292813c;
            C9556a aVar11 = new C9556a();
            aVar11.mo10233c(8);
            View view18 = view17;
            C117292a.m165358d(view18, aVar11.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view17.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
            C117292a.m165359e(view18, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f273707t.f292822l.setOnClickListener(this.f273705G);
            View view19 = this.f273707t.f292824n;
            C9556a aVar12 = new C9556a();
            aVar12.mo10233c(8);
            View view20 = view19;
            C117292a.m165358d(view20, aVar12.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view19.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
            C117292a.m165359e(view20, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f273707t.f292816f.setVisibility(0);
            this.f273707t.mo139282i(0);
            this.f273706s.mo139284k(aVar.f297652h);
            this.f273707t.mo139284k(aVar.f297653i);
        } else if (i2 == 4) {
            View view21 = this.f273706s.f292813c;
            C9556a aVar13 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar13.mo10233c(8);
            View view22 = view21;
            C117292a.m165358d(view22, aVar13.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view21.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
            C117292a.m165359e(view22, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view23 = this.f273707t.f292813c;
            C9556a aVar14 = new C9556a();
            aVar14.mo10233c(0);
            View view24 = view23;
            C117292a.m165358d(view24, aVar14.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view23.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
            C117292a.m165359e(view24, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C99936b bVar3 = this.f273707t;
            bVar3.f292822l.setOnClickListener(this.f273704F);
            View view25 = bVar3.f292824n;
            C9556a aVar15 = new C9556a();
            aVar15.mo10233c(0);
            View view26 = view25;
            C117292a.m165358d(view26, aVar15.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view25.setVisibility(((Integer) aVar15.mo10231a(0)).intValue());
            C117292a.m165359e(view26, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSubCardType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bVar3.f292816f.setVisibility(8);
            bVar3.mo139282i(8);
            bVar3.mo139284k(aVar);
            SnsMethodCalculate.markStartTimeMs("setSenderInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            if (this.f273700B == null) {
                View view27 = bVar3.f292824n;
                C9556a aVar16 = new C9556a();
                aVar16.mo10233c(8);
                View view28 = view27;
                C117292a.m165358d(view28, aVar16.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSenderInfo", "(Lcom/tencent/mm/plugin/sns/ad/helper/hbcovercard/HBCardViewWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view27.setVisibility(((Integer) aVar16.mo10231a(0)).intValue());
                C117292a.m165359e(view28, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSenderInfo", "(Lcom/tencent/mm/plugin/sns/ad/helper/hbcovercard/HBCardViewWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                Log.m105920e("AdLandingHBCardComponent", "setSenderInfo, mShareInfo==null");
                SnsMethodCalculate.markEndTimeMs("setSenderInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            } else {
                String displayName = AdLandingPagesProxy.getInstance().getDisplayName(this.f273700B.f292836c);
                if (TextUtils.isEmpty(displayName)) {
                    Log.m105924i("AdLandingHBCardComponent", "setSenderInfo, displayName=" + displayName + ", nick=" + this.f273700B.f292837d);
                    displayName = this.f273700B.f292837d;
                }
                if (!TextUtils.isEmpty(displayName)) {
                    bVar3.f292825o.setText(displayName);
                    View view29 = bVar3.f292824n;
                    C9556a aVar17 = new C9556a();
                    aVar17.mo10233c(0);
                    View view30 = view29;
                    C117292a.m165358d(view30, aVar17.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSenderInfo", "(Lcom/tencent/mm/plugin/sns/ad/helper/hbcovercard/HBCardViewWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view29.setVisibility(((Integer) aVar17.mo10231a(0)).intValue());
                    C117292a.m165359e(view30, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSenderInfo", "(Lcom/tencent/mm/plugin/sns/ad/helper/hbcovercard/HBCardViewWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    String str = this.f273700B.f292836c;
                    ImageView imageView = bVar3.f292826p;
                    SnsMethodCalculate.markStartTimeMs("loadAvatarByUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                    Log.m105924i("AdLandingHBCardComponent", "loadAvatarByUserName start, userName=" + str);
                    if (this.f273699A == null) {
                        SnsMethodCalculate.markStartTimeMs("initDefaultAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                        try {
                            Bitmap decodeStream = BackwardSupportUtil.BitmapFactory.decodeStream(MMApplicationContext.getContext().getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null));
                            this.f273699A = BitmapUtil.getRoundedCornerBitmap(decodeStream, false, (float) decodeStream.getWidth());
                        } catch (Throwable th) {
                            Log.m105920e("AdLandingHBCardComponent", "initDefaultAvatar exp=" + th.toString());
                        }
                        SnsMethodCalculate.markEndTimeMs("initDefaultAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                    }
                    imageView.setImageBitmap(this.f273699A);
                    if (TextUtils.isEmpty(str)) {
                        SnsMethodCalculate.markEndTimeMs("loadAvatarByUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                    } else {
                        imageView.setTag(str);
                        ((C119157j) C119157j.f356862d).mo183875f(new C94678u(this, str, imageView));
                        SnsMethodCalculate.markEndTimeMs("loadAvatarByUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                    }
                } else {
                    View view31 = bVar3.f292824n;
                    C9556a aVar18 = new C9556a();
                    aVar18.mo10233c(8);
                    View view32 = view31;
                    C117292a.m165358d(view32, aVar18.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSenderInfo", "(Lcom/tencent/mm/plugin/sns/ad/helper/hbcovercard/HBCardViewWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view31.setVisibility(((Integer) aVar18.mo10231a(0)).intValue());
                    C117292a.m165359e(view32, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "setSenderInfo", "(Lcom/tencent/mm/plugin/sns/ad/helper/hbcovercard/HBCardViewWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                SnsMethodCalculate.markEndTimeMs("setSenderInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            }
            if (mo130150O(aVar)) {
                bVar3.mo139283j(aVar.f297649e);
                bVar3.mo139281h(false);
            } else {
                mo130149N(bVar3, this.f273713z, 0);
            }
        }
        if (i2 != 3) {
            this.f273701C.mo139274e(i2, false);
        } else {
            this.f273701C.mo139274e(1, true);
        }
        SnsMethodCalculate.markEndTimeMs("setSubCardType", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* renamed from: V */
    public void mo130154V(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("updateDynamicContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        try {
            Log.m105924i("AdLandingHBCardComponent", "updateDyncContent, twistCardId=" + str2 + ", extInfo=" + str);
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("subCardType");
            if (optInt == 4) {
                this.f273700B = C99937c.m130571a(str);
            } else {
                this.f273700B = null;
            }
            this.f273711x = str2;
            this.f273712y = jSONObject.optString("receiveUrl");
            this.f273708u.f297644z = jSONObject.optString("giveCardId");
            mo130153U(optInt);
        } catch (Throwable th) {
            Log.m105920e("AdLandingHBCardComponent", "updateDyncContent, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("updateDynamicContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* renamed from: d */
    public void mo124363d() {
        SnsMethodCalculate.markStartTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        SnsMethodCalculate.markEndTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        FrameLayout frameLayout = (FrameLayout) this.f276586n.findViewById(C0966R.C0970id.etr);
        this.f273709v = frameLayout;
        this.f273706s = C99936b.m130556g(this.f276579d, frameLayout, 1);
        C99936b g = C99936b.m130556g(this.f276579d, this.f273709v, 2);
        this.f273707t = g;
        mo130152R(g);
        this.f273709v.addView(this.f273707t.f292813c, new FrameLayout.LayoutParams(-1, -1));
        View view = this.f273707t.f292813c;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo130152R(this.f273706s);
        this.f273709v.addView(this.f273706s.f292813c, new FrameLayout.LayoutParams(-1, -1));
        View view3 = this.f273706s.f292813c;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(4);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f273706s.mo139285l(this.f273708u);
        this.f273707t.mo139285l(this.f273708u);
        this.f273707t.f292815e.setBackgroundResource(C0966R.C0969drawable.btb);
        View view5 = this.f273707t.f292814d;
        SnsMethodCalculate.markStartTimeMs("setShadowPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        int b = C76577a.m92151b(this.f276579d, 7);
        FrameLayout.LayoutParams K = mo130147K();
        K.bottomMargin += b;
        K.rightMargin += b;
        K.topMargin += b;
        K.leftMargin += b;
        int i = b * 2;
        K.width -= i;
        K.height -= i;
        view5.setLayoutParams(K);
        SnsMethodCalculate.markEndTimeMs("setShadowPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        this.f273706s.f292815e.setClickable(true);
        Context context = this.f276579d;
        if (context instanceof C0125s) {
            ((C0125s) context).getLifecycle().addObserver(this);
        }
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        super.mo67240g();
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return C0966R.C0971layout.c18;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public void onUIDestroy() {
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        Log.m105924i("AdLandingHBCardComponent", "onUIDestroy");
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onUIPause() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        Log.m105924i("AdLandingHBCardComponent", "onUIPause");
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public void onUIResume() {
        SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        Log.m105924i("AdLandingHBCardComponent", "onUIResume");
        if (this.f273703E) {
            this.f273703E = false;
            if (this.f273706s.f292813c.getVisibility() == 0) {
                C119179t tVar = C119157j.f356862d;
                C94595d dVar = new C94595d();
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(dVar, 500, false);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* renamed from: u */
    public boolean mo124366u(JSONArray jSONArray) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        JSONObject jSONObject3 = new JSONObject();
        if (mo118822v(jSONObject3)) {
            try {
                JSONArray a = this.f273701C.mo139270a();
                if (a != null) {
                    C99934a aVar = this.f273701C;
                    aVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("getTotalExpCount", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
                    int i = aVar.f292801b;
                    SnsMethodCalculate.markEndTimeMs("getTotalExpCount", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
                    jSONObject3.put(C102646h.COL_EXPOSURECOUNT, i);
                    jSONObject3.put("hbCard", a);
                }
                jSONArray.put(jSONObject3);
                Log.m105924i("AdLandingHBCardComponent", "kv13387:" + jSONObject3.toString());
            } catch (Exception e) {
                Log.m105920e("AdLandingHBCardComponent", "setComponentKVReportData, exp=" + e.toString());
            }
        }
        JSONObject jSONObject4 = null;
        if (this.f273706s.f292821k != null) {
            jSONObject = new JSONObject();
            this.f273706s.f292821k.mo118822v(jSONObject);
        } else {
            jSONObject = null;
        }
        if (this.f273707t.f292821k != null) {
            jSONObject2 = new JSONObject();
            this.f273707t.f292821k.mo118822v(jSONObject2);
        } else {
            jSONObject2 = null;
        }
        Log.m105918d("AdLandingHBCardComponent", "video report json get=" + jSONObject);
        Log.m105918d("AdLandingHBCardComponent", "video report json give=" + jSONObject2);
        SnsMethodCalculate.markStartTimeMs("mergeVideoReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        if (jSONObject == null && jSONObject2 == null) {
            SnsMethodCalculate.markEndTimeMs("mergeVideoReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        } else {
            if (jSONObject != null && jSONObject2 == null) {
                SnsMethodCalculate.markEndTimeMs("mergeVideoReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            } else if (jSONObject2 == null || jSONObject != null) {
                m119640P(C102646h.COL_EXPOSURECOUNT, jSONObject, jSONObject2);
                SnsMethodCalculate.markStartTimeMs("mergeLongValue", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                try {
                    jSONObject.put("stayTime", jSONObject.optLong("stayTime") + jSONObject2.optLong("stayTime"));
                } catch (Exception e2) {
                    Log.m105920e("AdLandingHBCardComponent", "mergeLongValue exp=" + e2.toString());
                }
                SnsMethodCalculate.markEndTimeMs("mergeLongValue", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                m119640P("playTimeInterval", jSONObject, jSONObject2);
                m119640P("playCount", jSONObject, jSONObject2);
                m119640P("playCompletedCount", jSONObject, jSONObject2);
                m119640P("doubleClickCount", jSONObject, jSONObject2);
                m119640P("clickSightCount", jSONObject, jSONObject2);
                m119640P("clickSightIconCount", jSONObject, jSONObject2);
                SnsMethodCalculate.markEndTimeMs("mergeVideoReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            } else {
                SnsMethodCalculate.markEndTimeMs("mergeVideoReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                jSONObject4 = jSONObject2;
            }
            jSONObject4 = jSONObject;
        }
        if (jSONObject4 != null) {
            try {
                C101264f fVar = this.f273708u.f297633B;
                if (fVar != null) {
                    jSONObject4.put("cid", Util.nullAsNil(fVar.f296495a));
                }
            } catch (Exception unused) {
            }
            jSONArray.put(jSONObject4);
        }
        Log.m105918d("AdLandingHBCardComponent", "video report json result=" + jSONObject4);
        SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return true;
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }
}
