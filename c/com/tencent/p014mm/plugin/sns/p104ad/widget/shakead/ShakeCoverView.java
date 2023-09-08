package com.tencent.p014mm.plugin.sns.p104ad.widget.shakead;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p104ad.widget.interactionlabel.ShakeCoverAnimView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.C94782f;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fr2.C97952a;
import fr2.C97954d;
import fr2.C97955e;
import fr2.C97956f;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import org.libpag.PAGView;
import qs2.C101271i0;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView */
public class ShakeCoverView extends FrameLayout implements C0124r {

    /* renamed from: B */
    public static final /* synthetic */ int f274472B = 0;

    /* renamed from: A */
    public C94772d f274473A;

    /* renamed from: d */
    public PAGView f274474d;

    /* renamed from: e */
    public TextView f274475e;

    /* renamed from: f */
    public TextView f274476f;

    /* renamed from: g */
    public ViewGroup f274477g;

    /* renamed from: h */
    public ShakeCoverAnimView f274478h;

    /* renamed from: i */
    public Context f274479i;

    /* renamed from: j */
    public SnsInfo f274480j;

    /* renamed from: n */
    public C97952a f274481n;

    /* renamed from: o */
    public C94782f f274482o;

    /* renamed from: p */
    public boolean f274483p = false;

    /* renamed from: q */
    public boolean f274484q = false;

    /* renamed from: r */
    public int f274485r;

    /* renamed from: s */
    public Handler f274486s = new C94769a();

    /* renamed from: t */
    public boolean f274487t = true;

    /* renamed from: u */
    public boolean f274488u = false;

    /* renamed from: v */
    public boolean f274489v = false;

    /* renamed from: w */
    public boolean f274490w = false;

    /* renamed from: x */
    public boolean f274491x = false;

    /* renamed from: y */
    public boolean f274492y = false;

    /* renamed from: z */
    public boolean f274493z = false;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$a */
    public class C94769a extends Handler {
        public C94769a() {
        }

        public void handleMessage(Message message) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Message message2 = message;
            String str7 = "handleMessage";
            SnsMethodCalculate.markStartTimeMs(str7, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2");
            if (message2.what != 1) {
                str = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
            } else {
                ShakeCoverView shakeCoverView = ShakeCoverView.this;
                long j = (long) message2.arg1;
                int i = ShakeCoverView.f274472B;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                shakeCoverView.getClass();
                SnsMethodCalculate.markStartTimeMs("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                Log.m105918d("ShakeCoverView", "doOnVideoPlay:" + j + ", isDestroyed=" + shakeCoverView.f274483p);
                C97952a aVar = shakeCoverView.f274481n;
                if (aVar == null || shakeCoverView.f274483p) {
                    str2 = "access$100";
                    str4 = str7;
                    str3 = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
                    SnsMethodCalculate.markEndTimeMs("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                } else {
                    if (j < ((long) aVar.f287304f) || j > ((long) aVar.f287305g)) {
                        str2 = "access$100";
                        str4 = str7;
                        str3 = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
                        str6 = "doOnVideoPlay";
                        str5 = ", isDestroyed=";
                        shakeCoverView.mo130587k(false);
                        shakeCoverView.mo130586j();
                    } else {
                        SnsMethodCalculate.markStartTimeMs("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                        if (shakeCoverView.f274491x) {
                            SnsMethodCalculate.markEndTimeMs("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                            str2 = "access$100";
                            str4 = str7;
                            str3 = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
                            str6 = "doOnVideoPlay";
                            str5 = ", isDestroyed=";
                        } else {
                            shakeCoverView.f274491x = true;
                            Log.m105924i("ShakeCoverView", "spreadUp");
                            shakeCoverView.f274493z = true;
                            shakeCoverView.mo130584h();
                            shakeCoverView.f274478h.setVisibility(0);
                            ShakeCoverAnimView shakeCoverAnimView = shakeCoverView.f274478h;
                            shakeCoverAnimView.getClass();
                            SnsMethodCalculate.markStartTimeMs("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
                            Log.m105924i("ShakeCoverAnimView", "spreadUp, scale=" + shakeCoverAnimView.f249070e);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(shakeCoverAnimView.f249069d, "alpha", new float[]{0.7f, 0.7f});
                            str4 = str7;
                            str3 = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
                            long j2 = (long) TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE;
                            ofFloat.setDuration(j2);
                            str2 = "access$100";
                            str6 = "doOnVideoPlay";
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(shakeCoverAnimView.f249069d, "scaleX", new float[]{1.0f, shakeCoverAnimView.f249070e});
                            ofFloat2.setDuration(j2);
                            str5 = ", isDestroyed=";
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(shakeCoverAnimView.f249069d, "scaleY", new float[]{1.0f, shakeCoverAnimView.f249070e});
                            ofFloat3.setDuration(j2);
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
                            animatorSet.start();
                            SnsMethodCalculate.markEndTimeMs("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
                            SnsMethodCalculate.markStartTimeMs("showTipLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                            shakeCoverView.f274477g.setVisibility(0);
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(shakeCoverView.f274477g, "alpha", new float[]{0.0f, 1.0f});
                            ofFloat4.setDuration(500);
                            ofFloat4.addListener(new C97955e(shakeCoverView));
                            ofFloat4.start();
                            SnsMethodCalculate.markEndTimeMs("showTipLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                            SnsMethodCalculate.markEndTimeMs("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                        }
                        if (shakeCoverView.f274493z && !shakeCoverView.f274492y) {
                            shakeCoverView.mo130584h();
                        }
                    }
                    C97952a aVar2 = shakeCoverView.f274481n;
                    if (j < ((long) aVar2.f287302d) || j > ((long) aVar2.f287303e)) {
                        shakeCoverView.mo130585i();
                        shakeCoverView.f274489v = false;
                        if (shakeCoverView.f274488u) {
                            Log.m105924i("ShakeCoverView", "out shake zone");
                            shakeCoverView.f274488u = false;
                            if (!shakeCoverView.f274490w) {
                                ShakeCoverView.m120069g(shakeCoverView.f274480j, 2, shakeCoverView.f274485r);
                            }
                        }
                        shakeCoverView.f274487t = true;
                    } else {
                        SnsMethodCalculate.markStartTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                        if (shakeCoverView.f274483p || shakeCoverView.f274484q) {
                            Log.m105928w("ShakeCoverView", "startListenShake, isUIPaused=" + shakeCoverView.f274484q + str5 + shakeCoverView.f274483p);
                            SnsMethodCalculate.markEndTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                        } else {
                            if (shakeCoverView.f274482o == null) {
                                shakeCoverView.f274482o = new C94782f(shakeCoverView.f274479i);
                            }
                            if (!shakeCoverView.f274482o.mo130611c()) {
                                Log.m105920e("ShakeCoverView", "sensor not support");
                                C115669n.INSTANCE.mo175911u(1572, 4);
                                SnsMethodCalculate.markEndTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                            } else {
                                C115669n.INSTANCE.mo175911u(1572, 3);
                                if (!shakeCoverView.f274482o.mo130610b()) {
                                    C97952a aVar3 = shakeCoverView.f274481n;
                                    int i2 = aVar3.f287312q;
                                    int i3 = aVar3.f287313r;
                                    if (i2 < 6) {
                                        i2 = 6;
                                    }
                                    if (i3 < 9) {
                                        i3 = 9;
                                    }
                                    Log.m105924i("ShakeCoverView", "startListenShake， min=" + i2 + ", max=" + i3);
                                    shakeCoverView.f274482o.mo130612d(new C94773e(shakeCoverView, i2, i3));
                                }
                                SnsMethodCalculate.markEndTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                            }
                        }
                        shakeCoverView.f274489v = true;
                        if (shakeCoverView.f274487t) {
                            Log.m105924i("ShakeCoverView", "in shake zone");
                            shakeCoverView.f274487t = false;
                            shakeCoverView.f274490w = false;
                            ShakeCoverView.m120069g(shakeCoverView.f274480j, 3, shakeCoverView.f274485r);
                        }
                        shakeCoverView.f274488u = true;
                    }
                    SnsMethodCalculate.markEndTimeMs(str6, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                }
                SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                str7 = str4;
                str = str3;
            }
            SnsMethodCalculate.markEndTimeMs(str7, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$b */
    public class C94770b implements Runnable {
        public C94770b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$5");
            ShakeCoverView shakeCoverView = ShakeCoverView.this;
            int i = ShakeCoverView.f274472B;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            boolean z = shakeCoverView.f274483p;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            if (z) {
                Log.m105928w("ShakeCoverView", "do startShakeAnim, isDestroyed");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$5");
                return;
            }
            Log.m105924i("ShakeCoverView", "do startShakeAnim");
            ShakeCoverView.m120067a(ShakeCoverView.this).play();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$c */
    public class C94771c implements Runnable {
        public C94771c() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$6");
            ShakeCoverView.m120067a(ShakeCoverView.this).stop();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$d */
    public interface C94772d {
        /* renamed from: a */
        void mo130195a();
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$e */
    public static class C94773e extends C94782f.C94783a {

        /* renamed from: i */
        public long f274497i = Util.currentTicks();

        /* renamed from: j */
        public WeakReference<ShakeCoverView> f274498j;

        public C94773e(ShakeCoverView shakeCoverView, int i, int i2) {
            super(i, i2);
            this.f274498j = new WeakReference<>(shakeCoverView);
        }

        /* renamed from: a */
        public void mo130596a() {
            SnsMethodCalculate.markStartTimeMs("onRelease", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
            Log.m105924i("ShakeCoverView", "onRelease");
            SnsMethodCalculate.markEndTimeMs("onRelease", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
        }

        /* renamed from: b */
        public void mo130597b(boolean z) {
            SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
            ShakeCoverView shakeCoverView = this.f274498j.get();
            if (shakeCoverView == null) {
                Log.m105928w("ShakeCoverView", "onShake， shakeCoverView==null");
                SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
                return;
            }
            Context context = shakeCoverView.getContext();
            if (context == null) {
                Log.m105928w("ShakeCoverView", "onShake， context==null");
                SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
            } else if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                long ticksToNow = Util.ticksToNow(this.f274497i);
                if (ticksToNow < 1000) {
                    Log.m105924i("ShakeCoverView", "onShake, too short, delay=" + ticksToNow);
                    SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
                    return;
                }
                this.f274497i = Util.currentTicks();
                C102236a0.m134708C0(new long[]{0, 80});
                mo130614c();
                Log.m105924i("ShakeCoverView", "onShake succ");
                int i = ShakeCoverView.f274472B;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                C94772d dVar = shakeCoverView.f274473A;
                if (dVar != null) {
                    dVar.mo130195a();
                }
                shakeCoverView.f274490w = true;
                ShakeCoverView.m120069g(shakeCoverView.f274480j, 1, shakeCoverView.f274485r);
                SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
            } else {
                Log.m105920e("ShakeCoverView", "onShake, ui finished");
                SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
            }
        }
    }

    public ShakeCoverView(Context context) {
        super(context);
        mo130583e(context);
    }

    /* renamed from: a */
    public static /* synthetic */ PAGView m120067a(ShakeCoverView shakeCoverView) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        PAGView pAGView = shakeCoverView.f274474d;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        return pAGView;
    }

    /* renamed from: f */
    public static void m120068f(C101271i0 i0Var, int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("reportGetShakeCardIdResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        if (i0Var == null) {
            Log.m105920e("ShakeCoverView_report", "reportGetShakeCardIdResult, landingPageData==null");
            SnsMethodCalculate.markEndTimeMs("reportGetShakeCardIdResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            return;
        }
        String h = i0Var.mo140741h();
        String l = i0Var.mo140745l();
        int i2 = i0Var.mo140742i();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("snsid", Util.nullAsNil(h));
            jSONObject.put("uxinfo", Util.nullAsNil(l));
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", i);
            jSONObject2.put("encoreShake", z ? 1 : 0);
            jSONObject.put("extInfo", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            C102260r.m134858a("timeline_shakead_canvas_get_cardId_result", jSONObject3);
            Log.m105924i("ShakeCoverView_report", "reportGetShakeCardIdResult, content=" + jSONObject3);
        } catch (Exception e) {
            Log.m105920e("ShakeCoverView_report", "reportGetShakeCardIdResult exp:" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportGetShakeCardIdResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    /* renamed from: g */
    public static void m120069g(SnsInfo snsInfo, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("reportShakeActionResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        if (snsInfo == null) {
            Log.m105920e("ShakeCoverView_report", "reportShakeActionResult, landingPageData==null");
            SnsMethodCalculate.markEndTimeMs("reportShakeActionResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            return;
        }
        String q0 = C102236a0.m134765q0(snsInfo.field_snsId);
        String uxinfo = snsInfo.getUxinfo();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("snsid", Util.nullAsNil(q0));
            jSONObject.put("uxinfo", Util.nullAsNil(uxinfo));
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", i);
            jSONObject.put("extInfo", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            C102260r.m134858a("timeline_shakead_shake_result", jSONObject3);
            Log.m105924i("ShakeCoverView_report", "reportShakeActionResult, content=" + jSONObject3);
        } catch (Exception e) {
            Log.m105920e("ShakeCoverView_report", "reportShakeActionResult exp:" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportShakeActionResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    /* renamed from: b */
    public void mo130580b(long j) {
        SnsMethodCalculate.markStartTimeMs("checkShow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        Log.m105918d("ShakeCoverView", "checkShow:" + j);
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.arg1 = (int) j;
        this.f274486s.removeMessages(1);
        this.f274486s.sendMessageDelayed(obtain, 50);
        SnsMethodCalculate.markEndTimeMs("checkShow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    /* renamed from: c */
    public void mo130581c() {
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        this.f274483p = true;
        this.f274486s.removeCallbacksAndMessages((Object) null);
        mo130582d();
        mo130587k(true);
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    /* renamed from: d */
    public void mo130582d() {
        SnsMethodCalculate.markStartTimeMs("doOnPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        Log.m105924i("ShakeCoverView", "doOnPause");
        mo130585i();
        mo130586j();
        SnsMethodCalculate.markEndTimeMs("doOnPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    /* renamed from: e */
    public final void mo130583e(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        this.f274479i = context;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.c1r, this, true);
        this.f274474d = (PAGView) findViewById(C0966R.C0970id.hqp);
        this.f274475e = (TextView) findViewById(C0966R.C0970id.kmq);
        this.f274476f = (TextView) findViewById(C0966R.C0970id.kmh);
        this.f274477g = (ViewGroup) findViewById(C0966R.C0970id.kmu);
        this.f274478h = (ShakeCoverAnimView) findViewById(C0966R.C0970id.f5844q6);
        C102260r.m134856Y(this.f274475e, C0966R.dimen.f357064ao1);
        C102260r.m134856Y(this.f274476f, C0966R.dimen.f357063ao0);
        this.f274474d.post(new C97954d(this));
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        if (context instanceof C0125s) {
            ((C0125s) context).getLifecycle().addObserver(this);
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    /* renamed from: h */
    public void mo130584h() {
        SnsMethodCalculate.markStartTimeMs("startShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        Log.m105924i("ShakeCoverView", "startShakeAnim, isUIPaused=" + this.f274484q + ", isDestroy=" + this.f274483p);
        if (this.f274483p || this.f274484q) {
            SnsMethodCalculate.markEndTimeMs("startShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            return;
        }
        this.f274492y = true;
        this.f274474d.post(new C94770b());
        SnsMethodCalculate.markEndTimeMs("startShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    /* renamed from: i */
    public final void mo130585i() {
        SnsMethodCalculate.markStartTimeMs("stopListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        C94782f fVar = this.f274482o;
        if (fVar != null) {
            if (fVar.mo130610b()) {
                Log.m105924i("ShakeCoverView", "stopListenShake");
            }
            this.f274482o.mo130613e();
        }
        SnsMethodCalculate.markEndTimeMs("stopListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    /* renamed from: j */
    public void mo130586j() {
        SnsMethodCalculate.markStartTimeMs("stopShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        if (this.f274492y) {
            Log.m105924i("ShakeCoverView", "stopShakeAnim");
        }
        this.f274492y = false;
        this.f274474d.post(new C94771c());
        SnsMethodCalculate.markEndTimeMs("stopShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    /* renamed from: k */
    public final void mo130587k(boolean z) {
        SnsMethodCalculate.markStartTimeMs("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        if (!this.f274491x) {
            SnsMethodCalculate.markEndTimeMs("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            return;
        }
        Log.m105924i("ShakeCoverView", "unSpreadUp, isForDestroy=" + z);
        this.f274491x = false;
        this.f274493z = false;
        if (!z) {
            ShakeCoverAnimView shakeCoverAnimView = this.f274478h;
            shakeCoverAnimView.getClass();
            SnsMethodCalculate.markStartTimeMs("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
            Log.m105924i("ShakeCoverAnimView", "unSpreadUp, scale=" + shakeCoverAnimView.f249070e);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(shakeCoverAnimView.f249069d, "alpha", new float[]{0.7f, 0.7f});
            long j = (long) TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE;
            ofFloat.setDuration(j);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(shakeCoverAnimView.f249069d, "scaleX", new float[]{shakeCoverAnimView.f249070e, 1.0f});
            ofFloat2.setDuration(j);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(shakeCoverAnimView.f249069d, "scaleY", new float[]{shakeCoverAnimView.f249070e, 1.0f});
            ofFloat3.setDuration(j);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
            animatorSet.start();
            SnsMethodCalculate.markEndTimeMs("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
            SnsMethodCalculate.markStartTimeMs("hideTipLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f274477g, "alpha", new float[]{1.0f, 0.0f});
            ofFloat4.setDuration(500);
            ofFloat4.addListener(new C97956f(this));
            ofFloat4.start();
            SnsMethodCalculate.markEndTimeMs("hideTipLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        } else {
            this.f274477g.setVisibility(4);
            this.f274478h.setVisibility(4);
        }
        SnsMethodCalculate.markEndTimeMs("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        super.onDetachedFromWindow();
        Log.m105924i("ShakeCoverView", "onDetachedFromWindow");
        if (this.f274489v && !this.f274490w) {
            m120069g(this.f274480j, 2, this.f274485r);
        }
        mo130581c();
        this.f274487t = true;
        this.f274488u = false;
        this.f274490w = false;
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public void onStartTemporaryDetach() {
        SnsMethodCalculate.markStartTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        super.onStartTemporaryDetach();
        if (Build.VERSION.SDK_INT < 24) {
            Log.m105924i("ShakeCoverView", "onStartTemporaryDetach");
            if (this.f274489v && !this.f274490w) {
                m120069g(this.f274480j, 2, this.f274485r);
            }
            mo130581c();
            this.f274487t = true;
            this.f274488u = false;
            this.f274490w = false;
        } else {
            Log.m105918d("ShakeCoverView", "onStartTemporaryDetach");
        }
        SnsMethodCalculate.markEndTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onUIPause() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        Log.m105924i("ShakeCoverView", "onUIPause");
        this.f274484q = true;
        mo130582d();
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public void onUIResume() {
        SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        Log.m105924i("ShakeCoverView", "onUIResume");
        this.f274484q = false;
        SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public void setOnShakeListener(C94772d dVar) {
        SnsMethodCalculate.markStartTimeMs("setOnShakeListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        this.f274473A = dVar;
        SnsMethodCalculate.markEndTimeMs("setOnShakeListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public ShakeCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo130583e(context);
    }
}
