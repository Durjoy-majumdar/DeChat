package com.tencent.p014mm.plugin.sns.p104ad.widget.shakead;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p104ad.widget.gllib.GLViewContainer;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.ShakeCardAnimView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import kg3.C76577a;
import sq2.C13774c;
import zq2.C103063b;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView */
public class GLCardAnimView extends GLViewContainer {

    /* renamed from: B */
    public static final /* synthetic */ int f274448B = 0;

    /* renamed from: A */
    public ShakeCardAnimView.C94768c f274449A;

    /* renamed from: s */
    public Context f274450s;

    /* renamed from: t */
    public int f274451t;

    /* renamed from: u */
    public int f274452u;

    /* renamed from: v */
    public int f274453v;

    /* renamed from: w */
    public View f274454w;

    /* renamed from: x */
    public C103063b f274455x;

    /* renamed from: y */
    public ArrayList<C103063b> f274456y = new ArrayList<>();

    /* renamed from: z */
    public boolean f274457z = false;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$a */
    public class C94765a extends C13774c {

        /* renamed from: d */
        public final /* synthetic */ C103063b f274458d;

        public C94765a(GLCardAnimView gLCardAnimView, C103063b bVar) {
            this.f274458d = bVar;
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$1");
            C103063b bVar = this.f274458d;
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            bVar.f304091u = 0;
            SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$1");
        }
    }

    public GLCardAnimView(Context context) {
        super(context, (AttributeSet) null);
        mo130568j(context);
    }

    /* renamed from: h */
    public static /* synthetic */ ShakeCardAnimView.C94768c m120056h(GLCardAnimView gLCardAnimView) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        ShakeCardAnimView.C94768c cVar = gLCardAnimView.f274449A;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        return cVar;
    }

    /* renamed from: i */
    public static /* synthetic */ void m120057i(GLCardAnimView gLCardAnimView, int i) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        gLCardAnimView.setCardVisibility(i);
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    private void setCardVisibility(int i) {
        SnsMethodCalculate.markStartTimeMs("setCardVisibility", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        for (int i2 = 0; i2 < this.f274456y.size(); i2++) {
            C103063b bVar = this.f274456y.get(i2);
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            bVar.f304091u = i;
            SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        }
        SnsMethodCalculate.markEndTimeMs("setCardVisibility", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    /* renamed from: g */
    public void mo130532g(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        if (i <= 0 || i2 <= 0) {
            SnsMethodCalculate.markEndTimeMs("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            return;
        }
        int b = C76577a.m92151b(this.f274450s, 16);
        int i3 = (i / 2) - (this.f274451t / 2);
        int height = getHeight() / 2;
        int i4 = this.f274452u;
        int i5 = height - (i4 / 2);
        int i6 = height + (i4 / 2);
        ((C103063b) mo130530e(2)).mo142774k(i3, i5, this.f274451t + i3, i6);
        int i7 = i3 - (this.f274451t + b);
        ((C103063b) mo130530e(1)).mo142774k(i7, i5, this.f274451t + i7, i6);
        int i8 = i3 - ((this.f274451t + b) * 2);
        ((C103063b) mo130530e(0)).mo142774k(i8, i5, this.f274451t + i8, i6);
        int i9 = this.f274451t + b + i3;
        ((C103063b) mo130530e(3)).mo142774k(i9, i5, this.f274451t + i9, i6);
        int i15 = i3 + ((b + this.f274451t) * 2);
        ((C103063b) mo130530e(4)).mo142774k(i15, i5, this.f274451t + i15, i6);
        SnsMethodCalculate.markEndTimeMs("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    /* renamed from: j */
    public final void mo130568j(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        this.f274450s = context;
        this.f274451t = C76577a.m92151b(context, 96);
        this.f274452u = C76577a.m92151b(this.f274450s, 162);
        this.f274453v = C76577a.m92151b(this.f274450s, 72);
        Context context2 = this.f274450s;
        SnsMethodCalculate.markStartTimeMs("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        for (int i = 0; i < 5; i++) {
            C103063b bVar = new C103063b(context2);
            SnsMethodCalculate.markStartTimeMs("setScaleType", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            bVar.f304079i = 1;
            SnsMethodCalculate.markEndTimeMs("setScaleType", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            bVar.mo142776m(new C103063b.C103064a(this.f274451t, this.f274452u));
            mo130529d(bVar);
            this.f274456y.add(bVar);
        }
        setCardVisibility(4);
        SnsMethodCalculate.markEndTimeMs("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    /* renamed from: k */
    public final void mo130569k(C103063b bVar, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("playOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar, "translationY", new float[]{(float) (-((getHeight() / 2) + (this.f274452u / 2) + this.f274453v)), 0.0f});
        long j = (long) i2;
        ofFloat.setDuration(j);
        ofFloat.addListener(new C94765a(this, bVar));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar, "scaleX", new float[]{0.33333334f, 1.0f});
        ofFloat2.setDuration(j);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bVar, "scaleY", new float[]{0.33333334f, 1.0f});
        ofFloat3.setDuration(j);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bVar, "translationX", new float[]{0.0f, (float) i3});
        ofFloat4.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.play(ofFloat4).after(ofFloat);
        animatorSet.setStartDelay((long) i);
        animatorSet.start();
        SnsMethodCalculate.markEndTimeMs("playOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    public void setAnimCardView(View view) {
        SnsMethodCalculate.markStartTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        StringBuilder sb = new StringBuilder();
        sb.append("setAnimCardView, target=null?");
        sb.append(view == null);
        Log.m105924i("GLCardAnimView", sb.toString());
        this.f274454w = view;
        SnsMethodCalculate.markEndTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    public void setOnCardAnimListener(ShakeCardAnimView.C94768c cVar) {
        SnsMethodCalculate.markStartTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        this.f274449A = cVar;
        SnsMethodCalculate.markEndTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    public GLCardAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo130568j(context);
    }
}
