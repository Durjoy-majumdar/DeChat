package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.autogen.events.SnsAdFloatPageLifecycleEvent;
import com.tencent.p014mm.plugin.sns.p106ui.C96328z2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import fm0.C86937f0;
import gv2.C98233h;
import gv2.C98234i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ps2.C100882l;
import ps2.C100894u;
import qs2.C101255a0;
import qs2.C101298y;
import rq2.C101425k;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView */
public class SnsAdLandingPageFloatView extends FrameLayout {

    /* renamed from: d */
    public String f281472d;

    /* renamed from: e */
    public String f281473e;

    /* renamed from: f */
    public C101298y f281474f;

    /* renamed from: g */
    public C100882l f281475g;

    /* renamed from: h */
    public C95295z f281476h;

    /* renamed from: i */
    public List<C95295z> f281477i;

    /* renamed from: j */
    public Map<String, String> f281478j = new HashMap();

    /* renamed from: n */
    public boolean f281479n;

    /* renamed from: o */
    public boolean f281480o;

    /* renamed from: p */
    public View f281481p;

    /* renamed from: q */
    public AnimatorSet f281482q = new AnimatorSet();

    /* renamed from: r */
    public ValueAnimator f281483r = ValueAnimator.ofFloat(new float[]{1.0f, 0.4f}).setDuration(100);

    /* renamed from: s */
    public boolean f281484s = true;

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$a */
    public class C96286a implements ValueAnimator.AnimatorUpdateListener {
        public C96286a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SnsAdLandingPageFloatView.m123456a(SnsAdLandingPageFloatView.this).setScaleX(floatValue);
            SnsAdLandingPageFloatView.m123456a(SnsAdLandingPageFloatView.this).setScaleY(floatValue);
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$b */
    public class C96287b implements ValueAnimator.AnimatorUpdateListener {
        public C96287b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$2");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SnsAdLandingPageFloatView.m123456a(SnsAdLandingPageFloatView.this).setScaleX(floatValue);
            SnsAdLandingPageFloatView.m123456a(SnsAdLandingPageFloatView.this).setScaleY(floatValue);
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$c */
    public class C96288c extends AnimatorListenerAdapter {
        public C96288c() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$3");
            SnsAdLandingPageFloatView.m123457b(SnsAdLandingPageFloatView.this, false);
            SnsAdLandingPageFloatView snsAdLandingPageFloatView = SnsAdLandingPageFloatView.this;
            snsAdLandingPageFloatView.getClass();
            SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            if (snsAdLandingPageFloatView.f281475g != null) {
                snsAdLandingPageFloatView.f281476h.mo124360B();
                snsAdLandingPageFloatView.post(new C98234i(snsAdLandingPageFloatView));
            }
            SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            SnsAdFloatPageLifecycleEvent snsAdFloatPageLifecycleEvent = new SnsAdFloatPageLifecycleEvent();
            snsAdFloatPageLifecycleEvent.f265115d.f265116a = SnsAdLandingPageFloatView.m123458c(SnsAdLandingPageFloatView.this);
            snsAdFloatPageLifecycleEvent.f265115d.f265117b = 121;
            snsAdFloatPageLifecycleEvent.publish();
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$3");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$3");
            SnsAdLandingPageFloatView.m123457b(SnsAdLandingPageFloatView.this, true);
            SnsAdFloatPageLifecycleEvent snsAdFloatPageLifecycleEvent = new SnsAdFloatPageLifecycleEvent();
            snsAdFloatPageLifecycleEvent.f265115d.f265116a = SnsAdLandingPageFloatView.m123458c(SnsAdLandingPageFloatView.this);
            snsAdFloatPageLifecycleEvent.f265115d.f265117b = 120;
            snsAdFloatPageLifecycleEvent.publish();
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$d */
    public class C96289d implements ValueAnimator.AnimatorUpdateListener {
        public C96289d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$4");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SnsAdLandingPageFloatView.m123456a(SnsAdLandingPageFloatView.this).setScaleX(floatValue);
            SnsAdLandingPageFloatView.m123456a(SnsAdLandingPageFloatView.this).setScaleY(floatValue);
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$e */
    public class C96290e extends AnimatorListenerAdapter {
        public C96290e() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$5");
            View a = SnsAdLandingPageFloatView.m123456a(SnsAdLandingPageFloatView.this);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(a, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdLandingPageFloatView$5", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(a, "com/tencent/mm/plugin/sns/ui/widget/SnsAdLandingPageFloatView$5", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsAdLandingPageFloatView.m123457b(SnsAdLandingPageFloatView.this, false);
            SnsAdFloatPageLifecycleEvent snsAdFloatPageLifecycleEvent = new SnsAdFloatPageLifecycleEvent();
            snsAdFloatPageLifecycleEvent.f265115d.f265116a = SnsAdLandingPageFloatView.m123458c(SnsAdLandingPageFloatView.this);
            snsAdFloatPageLifecycleEvent.f265115d.f265117b = 123;
            snsAdFloatPageLifecycleEvent.publish();
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$5");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$5");
            SnsAdLandingPageFloatView.m123457b(SnsAdLandingPageFloatView.this, true);
            SnsAdLandingPageFloatView snsAdLandingPageFloatView = SnsAdLandingPageFloatView.this;
            SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            snsAdLandingPageFloatView.getClass();
            SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            SnsAdLandingPageFloatView.this.mo134022g();
            SnsAdLandingPageFloatView snsAdLandingPageFloatView2 = SnsAdLandingPageFloatView.this;
            snsAdLandingPageFloatView2.getClass();
            SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            if (snsAdLandingPageFloatView2.f281474f != null && !snsAdLandingPageFloatView2.f281480o) {
                snsAdLandingPageFloatView2.f281480o = true;
                snsAdLandingPageFloatView2.f281476h.mo67235C();
            }
            SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            SnsAdFloatPageLifecycleEvent snsAdFloatPageLifecycleEvent = new SnsAdFloatPageLifecycleEvent();
            snsAdFloatPageLifecycleEvent.f265115d.f265116a = SnsAdLandingPageFloatView.m123458c(SnsAdLandingPageFloatView.this);
            snsAdFloatPageLifecycleEvent.f265115d.f265117b = 122;
            snsAdFloatPageLifecycleEvent.publish();
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$5");
        }
    }

    public SnsAdLandingPageFloatView(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public static /* synthetic */ View m123456a(SnsAdLandingPageFloatView snsAdLandingPageFloatView) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        View view = snsAdLandingPageFloatView.f281481p;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        return view;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m123457b(SnsAdLandingPageFloatView snsAdLandingPageFloatView, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        snsAdLandingPageFloatView.f281479n = z;
        SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        return z;
    }

    /* renamed from: c */
    public static /* synthetic */ String m123458c(SnsAdLandingPageFloatView snsAdLandingPageFloatView) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        String str = snsAdLandingPageFloatView.f281472d;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        return str;
    }

    /* renamed from: d */
    public static /* synthetic */ C95295z m123459d(SnsAdLandingPageFloatView snsAdLandingPageFloatView) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        C95295z zVar = snsAdLandingPageFloatView.f281476h;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        return zVar;
    }

    /* renamed from: e */
    public void mo134020e(Bundle bundle, C100882l lVar) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        if (bundle == null || lVar == null) {
            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            return;
        }
        try {
            this.f281472d = bundle.getString("sns_float_component_id");
            this.f281473e = bundle.getString("sns_landing_pages_canvas_ext");
            C100882l lVar2 = new C100882l();
            this.f281475g = lVar2;
            lVar2.f295427b = lVar.f295427b;
            boolean z = true;
            lVar2.f295431f = true;
            lVar2.f295432g = 0;
            if (C101425k.m133101e(lVar.f295430e)) {
                C101255a0 a0Var = (C101255a0) ((LinkedHashMap) lVar.f295430e).get(this.f281472d);
                if (a0Var != null && C100894u.m132236p(a0Var.f296505k)) {
                    C101298y yVar = (C101298y) a0Var;
                    this.f281474f = yVar;
                    this.f281475g.f295429d.add(yVar);
                    this.f281475g.f295430e.putAll(lVar.f295430e);
                    if (this.f281474f.f296772C >= 1) {
                        z = false;
                    }
                    this.f281484s = z;
                }
            }
            mo134021f();
        } catch (Throwable unused) {
            Log.m105920e("MicroMsg.SnsAdLandingPageFloatView", "the init from helper has something wrong!!");
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
    }

    /* renamed from: f */
    public final void mo134021f() {
        String str;
        int i;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        if (this.f281475g != null) {
            SnsMethodCalculate.markStartTimeMs("initPage", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            C101298y yVar = this.f281474f;
            if (yVar != null) {
                if (yVar.f296774E > 0) {
                    setBackground((Drawable) null);
                }
                try {
                    i = Color.parseColor(this.f281475g.f295427b);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.SnsAdLandingPageFloatView", "parseColor exp=" + e.toString() + ", colorStr=" + this.f281475g.f295427b);
                    i = 0;
                }
                C95295z a = C96328z2.m123559a(getContext(), this.f281474f, this, i);
                this.f281476h = a;
                SnsMethodCalculate.markStartTimeMs(C86937f0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
                a.f276581f = i;
                SnsMethodCalculate.markEndTimeMs(C86937f0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
                View p = this.f281476h.mo131855p();
                this.f281481p = p;
                addView(p);
                this.f281476h.mo124363d();
                if (this.f281474f.f296773D <= 0) {
                    setOnTouchListener(new C98233h(this));
                }
            }
            SnsMethodCalculate.markEndTimeMs("initPage", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            SnsMethodCalculate.markStartTimeMs("setSomeData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            if (this.f281475g != null && !Util.isNullOrNil(this.f281473e)) {
                Map<String, String> parseXml = XmlParser.parseXml(this.f281473e, "adCardItemList", (String) null);
                int i2 = 0;
                while (true) {
                    if (i2 > 0) {
                        str = ".adCardItemList.cardItem" + i2;
                    } else {
                        str = ".adCardItemList.cardItem";
                    }
                    if (!parseXml.containsKey(str + ".cardTpId")) {
                        break;
                    }
                    String nullAs = Util.nullAs(parseXml.get(str + ".cardTpId"), "");
                    String nullAs2 = Util.nullAs(parseXml.get(str + ".cardExt"), "");
                    if (!Util.isNullOrNil(nullAs) && !Util.isNullOrNil(nullAs2)) {
                        ((HashMap) this.f281478j).put(nullAs, nullAs2);
                    }
                    i2++;
                }
            }
            SnsMethodCalculate.markEndTimeMs("setSomeData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.4f, 0.96f}).setDuration(getAnimationTimeFactor() * 200);
            duration.setInterpolator(new OvershootInterpolator());
            ValueAnimator duration2 = ValueAnimator.ofFloat(new float[]{0.96f, 1.0f}).setDuration(getAnimationTimeFactor() * 100);
            duration.addUpdateListener(new C96286a());
            duration2.addUpdateListener(new C96287b());
            this.f281482q.playSequentially(new Animator[]{duration, duration2});
            this.f281482q.addListener(new C96288c());
            this.f281483r.addUpdateListener(new C96289d());
            this.f281483r.addListener(new C96290e());
        }
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
    }

    /* renamed from: g */
    public void mo134022g() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        if (this.f281475g != null) {
            this.f281476h.mo124361D();
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
    }

    public List<C95295z> getAllComp() {
        SnsMethodCalculate.markStartTimeMs("getAllComp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        List<C95295z> list = this.f281477i;
        if (list != null) {
            SnsMethodCalculate.markEndTimeMs("getAllComp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.f281477i = arrayList;
        arrayList.add(this.f281476h);
        C100894u.m132225e(this.f281477i);
        List<C95295z> list2 = this.f281477i;
        SnsMethodCalculate.markEndTimeMs("getAllComp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        return list2;
    }

    public long getAnimationTimeFactor() {
        SnsMethodCalculate.markStartTimeMs("getAnimationTimeFactor", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        long j = this.f281484s ? 1 : 0;
        SnsMethodCalculate.markEndTimeMs("getAnimationTimeFactor", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        return j;
    }

    public SnsAdLandingPageFloatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
    }

    public SnsAdLandingPageFloatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, -1);
    }
}
