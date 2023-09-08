package com.tencent.p014mm.plugin.sns.p104ad.widget.twistad;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import hr2.C98513g;
import hr2.C98514h;
import no2.C100143a;
import no2.C100149d;
import nu2.C100214l;
import org.json.JSONObject;
import qs2.C101271i0;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView */
public class TwistCoverView extends FrameLayout implements C0124r {

    /* renamed from: C */
    public static final /* synthetic */ int f274546C = 0;

    /* renamed from: A */
    public C100143a.C100144a f274547A = new C94788c();

    /* renamed from: B */
    public C94789d f274548B;

    /* renamed from: d */
    public TwistDegreeView f274549d;

    /* renamed from: e */
    public ImageView f274550e;

    /* renamed from: f */
    public TextView f274551f;

    /* renamed from: g */
    public TextView f274552g;

    /* renamed from: h */
    public SnsInfo f274553h;

    /* renamed from: i */
    public volatile ADXml.C95024k f274554i;

    /* renamed from: j */
    public C100149d f274555j;

    /* renamed from: n */
    public AnimatorSet f274556n;

    /* renamed from: o */
    public boolean f274557o = false;

    /* renamed from: p */
    public boolean f274558p = false;

    /* renamed from: q */
    public boolean f274559q = false;

    /* renamed from: r */
    public boolean f274560r = false;

    /* renamed from: s */
    public int f274561s;

    /* renamed from: t */
    public boolean f274562t = true;

    /* renamed from: u */
    public boolean f274563u = false;

    /* renamed from: v */
    public boolean f274564v = false;

    /* renamed from: w */
    public boolean f274565w = false;

    /* renamed from: x */
    public boolean f274566x = false;

    /* renamed from: y */
    public Handler f274567y = new C94786a();

    /* renamed from: z */
    public float f274568z = 0.0f;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$a */
    public class C94786a extends Handler {
        public C94786a() {
        }

        public void handleMessage(Message message) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Message message2 = message;
            SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1");
            int i = message2.what;
            if (i != 1) {
                if (i == 2) {
                    TwistCoverView twistCoverView = TwistCoverView.this;
                    float f = ((float) message2.arg1) / 1000.0f;
                    int i2 = TwistCoverView.f274546C;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    twistCoverView.getClass();
                    SnsMethodCalculate.markStartTimeMs("onTwistDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    twistCoverView.f274549d.setProgress(f);
                    if (Math.abs(f) >= 1.0f && !twistCoverView.f274557o) {
                        Log.m105924i("TwistCoverView", "onTwistActionSucc by degree");
                        twistCoverView.mo130629f();
                        twistCoverView.setSensorEnabled(false);
                        twistCoverView.f274567y.removeMessages(2);
                        twistCoverView.f274567y.removeMessages(1);
                        if (twistCoverView.f274554i != null) {
                            twistCoverView.mo130630h(1, false, (float) twistCoverView.f274554i.f275726h);
                        } else {
                            Log.m105920e("TwistCoverView", "onTwistDegreeChange, mAdTwistInfo==null");
                        }
                        twistCoverView.mo130628e();
                    }
                    SnsMethodCalculate.markEndTimeMs("onTwistDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                } else if (i == 3) {
                    TwistCoverView twistCoverView2 = TwistCoverView.this;
                    int i3 = TwistCoverView.f274546C;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    twistCoverView2.getClass();
                    SnsMethodCalculate.markStartTimeMs("onLargeAcceleration", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    if (!twistCoverView2.f274557o) {
                        Log.m105924i("TwistCoverView", "onTwistActionSucc by acceleration");
                        twistCoverView2.mo130629f();
                        twistCoverView2.setSensorEnabled(false);
                        twistCoverView2.f274567y.removeMessages(2);
                        twistCoverView2.f274567y.removeMessages(1);
                        twistCoverView2.f274549d.setProgress(1.0f);
                        twistCoverView2.mo130630h(1, true, 0.0f);
                        twistCoverView2.mo130628e();
                    }
                    SnsMethodCalculate.markEndTimeMs("onLargeAcceleration", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                } else if (i == 4) {
                    TwistCoverView twistCoverView3 = TwistCoverView.this;
                    int i4 = TwistCoverView.f274546C;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    AnimatorSet animatorSet = twistCoverView3.f274556n;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    if (animatorSet != null) {
                        TwistCoverView twistCoverView4 = TwistCoverView.this;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                        AnimatorSet animatorSet2 = twistCoverView4.f274556n;
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                        if (!animatorSet2.isRunning()) {
                            TwistCoverView twistCoverView5 = TwistCoverView.this;
                            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                            AnimatorSet animatorSet3 = twistCoverView5.f274556n;
                            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                            animatorSet3.start();
                        }
                    }
                }
                str2 = "handleMessage";
                str = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
            } else {
                TwistCoverView twistCoverView6 = TwistCoverView.this;
                long j = (long) message2.arg1;
                int i5 = TwistCoverView.f274546C;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                twistCoverView6.getClass();
                SnsMethodCalculate.markStartTimeMs("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                if (twistCoverView6.f274554i == null) {
                    Log.m105920e("TwistCoverView", "checkShow， mAdTwistInfo==null");
                    twistCoverView6.mo130624a();
                    SnsMethodCalculate.markEndTimeMs("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    str4 = "handleMessage";
                    str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                    str5 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView";
                } else {
                    Log.m105918d("TwistCoverView", "doOnVideoPlay:" + j);
                    str5 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView";
                    if (j < ((long) twistCoverView6.f274554i.f275722d) || j > ((long) twistCoverView6.f274554i.f275723e)) {
                        if (twistCoverView6.mo130627d()) {
                            twistCoverView6.setSensorEnabled(false);
                        }
                        twistCoverView6.f274564v = false;
                        if (twistCoverView6.f274563u) {
                            Log.m105918d("TwistCoverView", "out twist zone");
                            twistCoverView6.f274563u = false;
                            if (!twistCoverView6.f274565w) {
                                twistCoverView6.mo130630h(2, false, twistCoverView6.f274568z);
                            }
                        }
                        twistCoverView6.f274562t = true;
                    } else {
                        if (!twistCoverView6.mo130627d() && !twistCoverView6.f274560r) {
                            twistCoverView6.mo130631i();
                            twistCoverView6.setSensorEnabled(true);
                        }
                        twistCoverView6.f274564v = true;
                        if (twistCoverView6.f274562t) {
                            Log.m105918d("TwistCoverView", "in twist zone");
                            twistCoverView6.f274562t = false;
                            twistCoverView6.f274565w = false;
                            twistCoverView6.mo130630h(3, false, 0.0f);
                        }
                        twistCoverView6.f274563u = true;
                    }
                    if (j < ((long) twistCoverView6.f274554i.f275724f) || j > ((long) twistCoverView6.f274554i.f275725g)) {
                        str4 = "handleMessage";
                        str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                        str6 = "doOnVideoPlay";
                        twistCoverView6.mo130625b();
                    } else {
                        if (!twistCoverView6.f274559q || twistCoverView6.getVisibility() != 0) {
                            SnsMethodCalculate.markStartTimeMs("show", str5);
                            if (twistCoverView6.f274558p) {
                                SnsMethodCalculate.markEndTimeMs("show", str5);
                            } else {
                                Log.m105924i("TwistCoverView", "show");
                                twistCoverView6.f274558p = true;
                                if (twistCoverView6.getVisibility() != 0) {
                                    twistCoverView6.setVisibility(0);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(twistCoverView6, "alpha", new float[]{0.0f, 1.0f});
                                    ofFloat.setDuration(250);
                                    ofFloat.start();
                                    SnsMethodCalculate.markStartTimeMs("initIconAnim", str5);
                                    if (twistCoverView6.f274554i == null) {
                                        Log.m105920e("TwistCoverView", "initIconAnim err, info==null");
                                        SnsMethodCalculate.markEndTimeMs("initIconAnim", str5);
                                        str4 = "handleMessage";
                                        str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                                        str6 = "doOnVideoPlay";
                                    } else {
                                        Log.m105918d("TwistCoverView", "initIconAnim");
                                        float f2 = -45.0f;
                                        float f3 = 5.0f;
                                        if (twistCoverView6.f274554i.f275727i) {
                                            f2 = 45.0f;
                                            f3 = -5.0f;
                                        }
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(twistCoverView6.f274550e, "rotation", new float[]{0.0f, 0.0f});
                                        ofFloat2.setDuration(100);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(twistCoverView6.f274550e, "rotation", new float[]{0.0f, f2});
                                        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                                        ofFloat3.setDuration(700);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(twistCoverView6.f274550e, "rotation", new float[]{f2, f2});
                                        str6 = "doOnVideoPlay";
                                        ofFloat4.setDuration(200);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(twistCoverView6.f274550e, "rotation", new float[]{f2, f3});
                                        ofFloat5.setDuration(200);
                                        float f4 = -f3;
                                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(twistCoverView6.f274550e, "rotation", new float[]{f3, f4});
                                        str4 = "handleMessage";
                                        str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                                        ofFloat6.setDuration(200);
                                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(twistCoverView6.f274550e, "rotation", new float[]{f4, 0.0f});
                                        ofFloat7.setDuration(200);
                                        AnimatorSet animatorSet4 = new AnimatorSet();
                                        twistCoverView6.f274556n = animatorSet4;
                                        animatorSet4.playSequentially(new Animator[]{ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7});
                                        twistCoverView6.f274556n.addListener(new C98513g(twistCoverView6));
                                        SnsMethodCalculate.markEndTimeMs("initIconAnim", str5);
                                    }
                                    twistCoverView6.mo130633k();
                                } else {
                                    str4 = "handleMessage";
                                    str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                                    str6 = "doOnVideoPlay";
                                }
                                if (twistCoverView6.f274554i != null) {
                                    twistCoverView6.f274551f.setText(twistCoverView6.f274554i.f275728j);
                                    twistCoverView6.f274552g.setText(twistCoverView6.f274554i.f275729n);
                                    twistCoverView6.f274549d.setShowMode(twistCoverView6.f274554i.f275727i ? 1 : 0);
                                }
                                SnsMethodCalculate.markEndTimeMs("show", str5);
                            }
                        } else {
                            twistCoverView6.mo130632j();
                        }
                        str4 = "handleMessage";
                        str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                        str6 = "doOnVideoPlay";
                    }
                    twistCoverView6.f274559q = false;
                    SnsMethodCalculate.markEndTimeMs(str6, str5);
                }
                SnsMethodCalculate.markEndTimeMs("access$000", str5);
                str2 = str4;
                str = str3;
            }
            SnsMethodCalculate.markEndTimeMs(str2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$b */
    public class C94787b extends AnimatorListenerAdapter {
        public C94787b() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$2");
            TwistCoverView.this.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$c */
    public class C94788c implements C100143a.C100144a {
        public C94788c() {
        }

        /* renamed from: a */
        public void mo130642a(float f) {
            SnsMethodCalculate.markStartTimeMs("onLargeAcceleration", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
            TwistCoverView twistCoverView = TwistCoverView.this;
            int i = TwistCoverView.f274546C;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            Handler handler = twistCoverView.f274567y;
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            Message.obtain(handler, 3).sendToTarget();
            SnsMethodCalculate.markEndTimeMs("onLargeAcceleration", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
        }

        /* renamed from: b */
        public void mo130643b(float f, float f2) {
            SnsMethodCalculate.markStartTimeMs("onDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
            TwistCoverView twistCoverView = TwistCoverView.this;
            int i = TwistCoverView.f274546C;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            ADXml.C95024k kVar = twistCoverView.f274554i;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            if (kVar == null) {
                Log.m105928w("TwistCoverView", "onDegreeChange, twistInfo==null");
                SnsMethodCalculate.markEndTimeMs("onDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
                return;
            }
            boolean z = kVar.f275727i;
            float f3 = 0.0f;
            if (z && f2 > 0.0f) {
                f2 = 0.0f;
            }
            if (z || f2 >= 0.0f) {
                f3 = f2;
            }
            float abs = Math.abs(f3 / ((float) kVar.f275726h));
            float abs2 = Math.abs(f3);
            TwistCoverView twistCoverView2 = TwistCoverView.this;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            float f4 = twistCoverView2.f274568z;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            if (abs2 > f4) {
                TwistCoverView twistCoverView3 = TwistCoverView.this;
                float abs3 = Math.abs(f3);
                SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                twistCoverView3.f274568z = abs3;
                SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            }
            TwistCoverView twistCoverView4 = TwistCoverView.this;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            Handler handler = twistCoverView4.f274567y;
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            Message obtain = Message.obtain(handler, 2);
            obtain.arg1 = (int) (abs * 1000.0f);
            obtain.sendToTarget();
            SnsMethodCalculate.markEndTimeMs("onDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$d */
    public interface C94789d {
    }

    public TwistCoverView(Context context) {
        super(context);
        mo130626c(context);
    }

    /* renamed from: g */
    public static void m120102g(C101271i0 i0Var, int i) {
        SnsMethodCalculate.markStartTimeMs("reportGetTwistIdResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (i0Var == null) {
            Log.m105920e("TwistCoverView_report", "reportGetTwistIdResult, landingPageData==null");
            SnsMethodCalculate.markEndTimeMs("reportGetTwistIdResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        String g = i0Var.mo140740g();
        String l = i0Var.mo140745l();
        int i2 = i0Var.mo140742i();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("snsid", Util.nullAsNil(g));
            jSONObject.put("uxinfo", Util.nullAsNil(l));
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", i);
            jSONObject.put("extInfo", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            C102260r.m134858a("timeline_twistad_canvas_get_twist_cardId_result", jSONObject3);
            Log.m105924i("TwistCoverView_report", "reportGetTwistIdResult, content=" + jSONObject3);
        } catch (Exception e) {
            Log.m105920e("TwistCoverView_report", "reportGetTwistIdResult exp:" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportGetTwistIdResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    /* renamed from: a */
    public void mo130624a() {
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.f274559q = false;
        this.f274554i = null;
        this.f274553h = null;
        this.f274568z = 0.0f;
        this.f274561s = -1;
        setSensorEnabled(false);
        mo130625b();
        this.f274567y.removeCallbacksAndMessages((Object) null);
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    /* renamed from: b */
    public final void mo130625b() {
        SnsMethodCalculate.markStartTimeMs("hide", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (!this.f274558p) {
            SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        this.f274558p = false;
        Log.m105924i("TwistCoverView", "hide");
        SnsMethodCalculate.markStartTimeMs("stopIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (this.f274556n != null) {
            Log.m105918d("TwistCoverView", "stopIconAnim");
            this.f274567y.removeMessages(4);
            this.f274556n.removeAllListeners();
            this.f274556n.end();
            this.f274556n.setTarget((Object) null);
            this.f274556n = null;
        }
        SnsMethodCalculate.markEndTimeMs("stopIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(250);
        ofFloat.addListener(new C94787b());
        ofFloat.start();
        SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    /* renamed from: c */
    public final void mo130626c(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f359996c21, this, true);
        this.f274549d = (TwistDegreeView) findViewById(C0966R.C0970id.f359449kz1);
        this.f274550e = (ImageView) findViewById(C0966R.C0970id.huv);
        this.f274551f = (TextView) findViewById(C0966R.C0970id.kpo);
        this.f274552g = (TextView) findViewById(C0966R.C0970id.c2j);
        C102260r.m134856Y(this.f274551f, C0966R.dimen.ao7);
        C102260r.m134856Y(this.f274552g, C0966R.dimen.ao6);
        setBackgroundColor(Color.parseColor("#CC000000"));
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (context instanceof C0125s) {
            ((C0125s) context).getLifecycle().addObserver(this);
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    /* renamed from: d */
    public final boolean mo130627d() {
        SnsMethodCalculate.markStartTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        C100149d dVar = this.f274555j;
        boolean z = false;
        if (dVar != null) {
            dVar.getClass();
            SnsMethodCalculate.markStartTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
            C100143a aVar = dVar.f293325a;
            if (aVar != null) {
                z = aVar.mo139431b();
                SnsMethodCalculate.markEndTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
            } else {
                SnsMethodCalculate.markEndTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
            }
            SnsMethodCalculate.markEndTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return z;
        }
        Log.m105924i("TwistCoverView", "isSensorEnabled, sensorMgr==null");
        SnsMethodCalculate.markEndTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        return false;
    }

    /* renamed from: e */
    public void mo130628e() {
        SnsMethodCalculate.markStartTimeMs("onTwistActionSucc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        C94789d dVar = this.f274548B;
        if (dVar != null && !this.f274557o) {
            C100214l.C100215a aVar = (C100214l.C100215a) dVar;
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onTwist", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness$1");
            C100214l lVar = C100214l.this;
            lVar.f293576c.f293355K.f293341b = true;
            if (lVar.f293579f == null) {
                Log.m105920e("TwistAdBusiness", "onTwist, mSnsInfo==null");
                SnsMethodCalculate.markEndTimeMs("onTwist", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness$1");
            } else {
                Bundle bundle = new Bundle();
                bundle.putBoolean("ad_no_click_anim", true);
                ADXml.C95024k kVar = C100214l.this.f293579f.getAdXml().adTwistInfo;
                if (kVar != null) {
                    bundle.putBoolean("isSimpleTwistAnim", kVar.f275730o);
                    bundle.putBoolean("isTwistClockwise", kVar.f275727i);
                    if (kVar.f275730o) {
                        C102236a0.m134708C0(new long[]{0, 80});
                    }
                }
                C100214l.this.mo139500o(bundle);
                C100214l.this.mo139494i();
                C100214l.this.mo139493h(29);
                SnsMethodCalculate.markEndTimeMs("onTwist", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness$1");
            }
            this.f274557o = true;
        }
        this.f274565w = true;
        SnsMethodCalculate.markEndTimeMs("onTwistActionSucc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    /* renamed from: f */
    public final void mo130629f() {
        SnsMethodCalculate.markStartTimeMs("pauseIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.f274567y.removeMessages(4);
        AnimatorSet animatorSet = this.f274556n;
        if (animatorSet != null && animatorSet.isRunning()) {
            Log.m105918d("TwistCoverView", "pauseIconAnim");
            this.f274556n.pause();
        }
        SnsMethodCalculate.markEndTimeMs("pauseIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    /* renamed from: h */
    public void mo130630h(int i, boolean z, float f) {
        SnsMethodCalculate.markStartTimeMs("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        SnsInfo snsInfo = this.f274553h;
        if (snsInfo == null) {
            Log.m105920e("TwistCoverView_report", "reportTwistActionResult, snsInfo==null");
            SnsMethodCalculate.markEndTimeMs("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        String q0 = C102236a0.m134765q0(snsInfo.field_snsId);
        String uxinfo = snsInfo.getUxinfo();
        int i2 = this.f274561s;
        if (TextUtils.isEmpty(q0)) {
            Log.m105920e("TwistCoverView_report", "reportTwistActionResult, snsId==null, source=" + i2);
            SnsMethodCalculate.markEndTimeMs("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        } else if (TextUtils.isEmpty(q0)) {
            Log.m105920e("TwistCoverView_report", "reportTwistActionResult, snsId==null, source=" + i2);
            SnsMethodCalculate.markEndTimeMs("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("snsid", q0);
                jSONObject.put("uxinfo", Util.nullAsNil(uxinfo));
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", i);
                jSONObject2.put("triggerByAcceleration", z ? 1 : 0);
                jSONObject2.put("failedMaxDegree", Math.round(f));
                if (!this.f274566x) {
                    jSONObject2.put("sensorDisable", 1);
                }
                jSONObject.put("extInfo", jSONObject2);
                String jSONObject3 = jSONObject.toString();
                C102260r.m134858a("timeline_twistad_twist_result", jSONObject3);
                Log.m105924i("TwistCoverView_report", "reportTwistActionResult, content=" + jSONObject3);
            } catch (Exception e) {
                Log.m105920e("TwistCoverView_report", "reportTwistActionResult exp:" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        }
    }

    /* renamed from: i */
    public void mo130631i() {
        SnsMethodCalculate.markStartTimeMs("resetTwistAngle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        StringBuilder sb = new StringBuilder();
        sb.append("resetTwistAngle, sensorMgr==null?");
        sb.append(this.f274555j == null);
        Log.m105924i("TwistCoverView", sb.toString());
        C100149d dVar = this.f274555j;
        if (dVar != null) {
            dVar.getClass();
            SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
            C100143a aVar = dVar.f293325a;
            if (aVar != null) {
                aVar.reset();
            }
            SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
        }
        TwistDegreeView twistDegreeView = this.f274549d;
        twistDegreeView.getClass();
        SnsMethodCalculate.markStartTimeMs("resetWithAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        MMHandlerThread.postToMainThread(new C98514h(twistDegreeView));
        SnsMethodCalculate.markEndTimeMs("resetWithAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        this.f274557o = false;
        this.f274568z = 0.0f;
        SnsMethodCalculate.markEndTimeMs("resetTwistAngle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    /* renamed from: j */
    public final void mo130632j() {
        SnsMethodCalculate.markStartTimeMs("resumeIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.f274567y.removeMessages(4);
        StringBuilder sb = new StringBuilder();
        sb.append("resumeIconAnim, isUIPaused=");
        sb.append(this.f274560r);
        sb.append(", anim.isPaused=");
        AnimatorSet animatorSet = this.f274556n;
        sb.append(animatorSet == null ? false : animatorSet.isPaused());
        Log.m105918d("TwistCoverView", sb.toString());
        AnimatorSet animatorSet2 = this.f274556n;
        if (animatorSet2 != null && !this.f274560r) {
            if (animatorSet2.isPaused()) {
                this.f274556n.resume();
            } else {
                mo130633k();
            }
        }
        SnsMethodCalculate.markEndTimeMs("resumeIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    /* renamed from: k */
    public final void mo130633k() {
        SnsMethodCalculate.markStartTimeMs("startIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.f274567y.removeMessages(4);
        AnimatorSet animatorSet = this.f274556n;
        if (animatorSet != null && !animatorSet.isRunning()) {
            Log.m105918d("TwistCoverView", "startIconAnim");
            this.f274556n.start();
        }
        SnsMethodCalculate.markEndTimeMs("startIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        super.onDetachedFromWindow();
        Log.m105924i("TwistCoverView", "onDetachedFromWindow");
        if (this.f274564v && !this.f274565w) {
            mo130630h(2, false, this.f274568z);
        }
        mo130624a();
        this.f274562t = true;
        this.f274563u = false;
        this.f274565w = false;
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public void onStartTemporaryDetach() {
        SnsMethodCalculate.markStartTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        super.onStartTemporaryDetach();
        if (Build.VERSION.SDK_INT < 24) {
            Log.m105924i("TwistCoverView", "onStartTemporaryDetach");
            mo130624a();
        }
        SnsMethodCalculate.markEndTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onUIPause() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (this.f274554i == null) {
            SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        Log.m105924i("TwistCoverView", "onUIPause");
        this.f274560r = true;
        setSensorEnabled(false);
        if (this.f274558p) {
            mo130629f();
        }
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public void onUIResume() {
        SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (this.f274554i == null) {
            SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        Log.m105924i("TwistCoverView", "onUIResume, isTwistActionCalled=" + this.f274557o);
        this.f274560r = false;
        if (this.f274557o && getVisibility() == 0) {
            mo130632j();
        }
        mo130631i();
        SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public void setSensorEnabled(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (this.f274554i == null && z) {
            SnsMethodCalculate.markEndTimeMs("setSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        } else if ((this.f274559q || this.f274560r) && z) {
            Log.m105920e("TwistCoverView", "setSensorEnabled to true when isUIPaused=" + this.f274560r + ", isPlayerPaused=" + this.f274559q);
            SnsMethodCalculate.markEndTimeMs("setSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("setSensorEnabled, enabled=");
            sb.append(z);
            sb.append(", sensorMgr==null?");
            sb.append(this.f274555j == null);
            Log.m105924i("TwistCoverView", sb.toString());
            C100149d dVar = this.f274555j;
            if (dVar != null) {
                dVar.getClass();
                SnsMethodCalculate.markStartTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
                C100143a aVar = dVar.f293325a;
                if (aVar != null) {
                    aVar.setEnabled(z);
                }
                SnsMethodCalculate.markEndTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
            }
            SnsMethodCalculate.markEndTimeMs("setSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        }
    }

    public void setTwistActionListener(C94789d dVar) {
        SnsMethodCalculate.markStartTimeMs("setTwistActionListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.f274548B = dVar;
        SnsMethodCalculate.markEndTimeMs("setTwistActionListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public TwistCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo130626c(context);
    }
}
