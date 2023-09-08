package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import org.json.JSONObject;
import os2.C100417r0;
import qs2.C101285q;
import rq2.C101424j;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0 */
public class C95087f0 extends C95295z {

    /* renamed from: s */
    public ImageView f275982s;

    /* renamed from: t */
    public TextView f275983t;

    /* renamed from: u */
    public AnimatorSet f275984u;

    /* renamed from: v */
    public int f275985v = 0;

    /* renamed from: w */
    public int f275986w;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0$a */
    public class C95088a implements View.OnClickListener {
        public C95088a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSwipeComponet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet$1");
            C95087f0.this.mo131594E();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSwipeComponet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C95087f0(Context context, C101285q qVar, ViewGroup viewGroup) {
        super(context, qVar, viewGroup);
        qVar.f296502h = 2.14748365E9f;
        this.f275986w = C76577a.m92151b(context, 130);
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        super.mo67235C();
        this.f275984u.removeAllListeners();
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
    }

    /* renamed from: E */
    public void mo131594E() {
        SnsMethodCalculate.markStartTimeMs("doJump", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        this.f275985v++;
        if (this.f276579d instanceof SnsAdNativeLandingPagesUI) {
            try {
                int i = mo131595G().f296682B;
                Log.m105924i("AdLandingPageBottomSwipeComponet", "doJump, swipCount=" + this.f275985v + ", actionType=" + i);
                if (i == 0) {
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (SnsAdNativeLandingPagesUI) this.f276579d;
                    long n = C100417r0.m131425n(snsAdNativeLandingPagesUI.getIntent().getStringExtra("sns_landing_pages_share_sns_id"));
                    C101424j.m133095a(this.f276579d, mo131595G().f296683z, mo131854m(), snsAdNativeLandingPagesUI.getIntent().getIntExtra("sns_landig_pages_from_source", 0), n, mo131595G().f296495a);
                    snsAdNativeLandingPagesUI.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingPageBottomSwipeComponet", "doJump exp=" + th.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("doJump", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
    }

    /* renamed from: G */
    public final C101285q mo131595G() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        C101285q qVar = (C101285q) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        return qVar;
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        this.f275982s = (ImageView) this.f276586n.findViewById(C0966R.C0970id.kag);
        this.f275983t = (TextView) this.f276586n.findViewById(C0966R.C0970id.kah);
        ImageView imageView = this.f275982s;
        SnsMethodCalculate.markStartTimeMs("initAnimator", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "translationY", new float[]{0.0f, (float) (-C76577a.m92151b(this.f276579d, 12))});
        ofFloat.setDuration(1000);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, "alpha", new float[]{0.0f, 0.8f});
        ofFloat2.setDuration(1000);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, "alpha", new float[]{0.8f, 0.0f});
        ofFloat3.setDuration(500);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f275984u = animatorSet;
        animatorSet.play(ofFloat).with(ofFloat2);
        this.f275984u.play(ofFloat3).after(ofFloat);
        this.f275984u.addListener(new C95092g0(this));
        this.f275984u.start();
        SnsMethodCalculate.markEndTimeMs("initAnimator", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        if (mo131595G().f296503i) {
            this.f275983t.setTextColor(Color.parseColor("#CC000000"));
            this.f275982s.setImageResource(C0966R.C0969drawable.btg);
        } else {
            this.f275983t.setTextColor(Color.parseColor("#CCFFFFFF"));
            this.f275982s.setImageResource(C0966R.C0969drawable.bth);
        }
        this.f276586n.findViewById(C0966R.C0970id.bdp).setOnClickListener(new C95088a());
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        if (this.f275983t == null || this.f275982s == null || mo131595G() == null) {
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
            return;
        }
        if (!TextUtils.isEmpty(mo131595G().f296681A)) {
            this.f275983t.setText(mo131595G().f296681A);
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        return C0966R.C0971layout.f359988c11;
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        if (!super.mo118822v(jSONObject)) {
            Log.m105920e("AdLandingPageBottomSwipeComponet", "setComponentKVReportData super failed");
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
            return false;
        }
        try {
            jSONObject.put("jumpCount", this.f275985v);
            Log.m105924i("AdLandingPageBottomSwipeComponet", "setComponentKVReportData json=" + jSONObject.toString());
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
            return true;
        } catch (Exception e) {
            Log.m105920e("AdLandingPageBottomSwipeComponet", "setComponentKVReportData exp=" + e.toString());
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
            return false;
        }
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
        ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins((int) mo131595G().f296499e, (int) mo131595G().f296497c, (int) mo131595G().f296500f, (int) mo131595G().f296498d);
            this.f276586n.setLayoutParams(marginLayoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSwipeComponet");
    }
}
