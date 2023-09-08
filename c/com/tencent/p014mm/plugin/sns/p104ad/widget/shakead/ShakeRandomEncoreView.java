package com.tencent.p014mm.plugin.sns.p104ad.widget.shakead;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.C94782f;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.ShakeCoverView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import so2.C101668d;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView */
public class ShakeRandomEncoreView extends LinearLayout implements C0124r {

    /* renamed from: d */
    public Context f274499d;

    /* renamed from: e */
    public ImageView f274500e;

    /* renamed from: f */
    public TextView f274501f;

    /* renamed from: g */
    public C101668d.C101669a f274502g;

    /* renamed from: h */
    public C94782f f274503h;

    /* renamed from: i */
    public ShakeCoverView.C94772d f274504i;

    /* renamed from: j */
    public boolean f274505j = false;

    /* renamed from: n */
    public boolean f274506n = false;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$a */
    public static class C94774a extends C94782f.C94783a {

        /* renamed from: i */
        public long f274507i = Util.currentTicks();

        /* renamed from: j */
        public WeakReference<ShakeRandomEncoreView> f274508j;

        public C94774a(ShakeRandomEncoreView shakeRandomEncoreView, int i, int i2) {
            super(i, i2);
            this.f274508j = new WeakReference<>(shakeRandomEncoreView);
            Log.m105924i("ShakeRandomEncoreView", "onShake, init, hash=" + hashCode());
        }

        /* renamed from: a */
        public void mo130596a() {
            SnsMethodCalculate.markStartTimeMs("onRelease", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
            Log.m105924i("ShakeRandomEncoreView", "onRelease");
            SnsMethodCalculate.markEndTimeMs("onRelease", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
        }

        /* renamed from: b */
        public void mo130597b(boolean z) {
            SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
            ShakeRandomEncoreView shakeRandomEncoreView = this.f274508j.get();
            if (shakeRandomEncoreView == null) {
                Log.m105928w("ShakeRandomEncoreView", "onShake， shakeView==null");
                SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
                return;
            }
            Context context = shakeRandomEncoreView.getContext();
            if (context == null) {
                Log.m105928w("ShakeRandomEncoreView", "onShake， context==null");
                SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
            } else if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                long ticksToNow = Util.ticksToNow(this.f274507i);
                if (ticksToNow < 600) {
                    Log.m105924i("ShakeRandomEncoreView", "onShake, too short, delay=" + ticksToNow + ", hash=" + hashCode());
                    SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
                    return;
                }
                this.f274507i = Util.currentTicks();
                C102236a0.m134708C0(new long[]{0, 80});
                mo130614c();
                Log.m105924i("ShakeRandomEncoreView", "onShake succ, hash=" + hashCode());
                SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
                ShakeCoverView.C94772d dVar = shakeRandomEncoreView.f274504i;
                if (dVar != null) {
                    dVar.mo130195a();
                }
                SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
                SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
            } else {
                Log.m105920e("ShakeRandomEncoreView", "onShake, ui finished");
                SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
            }
        }
    }

    public ShakeRandomEncoreView(Context context) {
        super(context);
        mo130598a(context);
    }

    /* renamed from: a */
    public final void mo130598a(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        setOrientation(0);
        setGravity(16);
        this.f274499d = context;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.c1s, this);
        this.f274500e = (ImageView) findViewById(C0966R.C0970id.cjp);
        TextView textView = (TextView) findViewById(C0966R.C0970id.cjq);
        this.f274501f = textView;
        C102260r.m134855X(textView, C0966R.dimen.ann);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        if (context instanceof C0125s) {
            ((C0125s) context).getLifecycle().addObserver(this);
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    /* renamed from: b */
    public void mo130599b() {
        C101668d.C101669a aVar;
        SnsMethodCalculate.markStartTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        if (this.f274505j || this.f274506n) {
            Log.m105928w("ShakeRandomEncoreView", "startListenShake, isUIPaused=" + this.f274506n + ", isDestroyed=" + this.f274505j);
            SnsMethodCalculate.markEndTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
            return;
        }
        C94782f fVar = this.f274503h;
        if (fVar == null) {
            Log.m105928w("ShakeRandomEncoreView", "startListenShake, shakeSensor==null");
            SnsMethodCalculate.markEndTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        } else if (!fVar.mo130611c()) {
            Log.m105920e("ShakeRandomEncoreView", "sensor not support");
            C115669n.INSTANCE.mo175911u(1572, 4);
            SnsMethodCalculate.markEndTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        } else {
            C115669n.INSTANCE.mo175911u(1572, 3);
            if (!this.f274503h.mo130610b() && (aVar = this.f274502g) != null) {
                int i = aVar.f297608d;
                int i2 = aVar.f297609e;
                if (i < 8) {
                    i = 8;
                }
                if (i2 < 10) {
                    i2 = 10;
                }
                Log.m105924i("ShakeRandomEncoreView", "startListenShake， min=" + i + ", max=" + i2);
                this.f274503h.mo130612d(new C94774a(this, i, i2));
            }
            SnsMethodCalculate.markEndTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        }
    }

    /* renamed from: c */
    public void mo130600c() {
        SnsMethodCalculate.markStartTimeMs("stopListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        C94782f fVar = this.f274503h;
        if (fVar != null) {
            if (fVar.mo130610b()) {
                Log.m105924i("ShakeRandomEncoreView", "stopListenShake");
            }
            this.f274503h.mo130613e();
        }
        SnsMethodCalculate.markEndTimeMs("stopListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        super.onDetachedFromWindow();
        Log.m105924i("ShakeRandomEncoreView", "onDetachedFromWindow");
        this.f274505j = true;
        mo130600c();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onUIPause() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        Log.m105924i("ShakeRandomEncoreView", "onUIPause");
        this.f274506n = true;
        mo130600c();
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public void onUIResume() {
        SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        Log.m105924i("ShakeRandomEncoreView", "onUIResume");
        this.f274506n = false;
        mo130599b();
        SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    public void setOnShakeListener(ShakeCoverView.C94772d dVar) {
        SnsMethodCalculate.markStartTimeMs("setOnShakeListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        this.f274504i = dVar;
        SnsMethodCalculate.markEndTimeMs("setOnShakeListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    public ShakeRandomEncoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo130598a(context);
    }
}
