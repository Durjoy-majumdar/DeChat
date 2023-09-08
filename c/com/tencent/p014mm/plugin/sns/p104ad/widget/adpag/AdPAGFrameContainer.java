package com.tencent.p014mm.plugin.sns.p104ad.widget.adpag;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsAdInteractionEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import com.tencent.xweb.IXWebBroadcastListener;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer */
public class AdPAGFrameContainer extends FrameLayout implements C0124r {

    /* renamed from: p */
    public static final /* synthetic */ int f274214p = 0;

    /* renamed from: d */
    public PAGView f274215d;

    /* renamed from: e */
    public ImageView f274216e;

    /* renamed from: f */
    public volatile boolean f274217f;

    /* renamed from: g */
    public boolean f274218g;

    /* renamed from: h */
    public boolean f274219h;

    /* renamed from: i */
    public long f274220i;

    /* renamed from: j */
    public PAGView.PAGFlushListener f274221j;

    /* renamed from: n */
    public PAGView.PAGViewListener f274222n;

    /* renamed from: o */
    public IListener<SnsAdInteractionEvent> f274223o;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$a */
    public class C94731a implements PAGView.PAGFlushListener {
        public C94731a() {
        }

        public void onFlush() {
            SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$1");
            if (AdPAGFrameContainer.m119949a(AdPAGFrameContainer.this) != null && AdPAGFrameContainer.m119949a(AdPAGFrameContainer.this).getVisibility() == 0) {
                Log.m105924i("AdPAGFrameContainer", "mThumbIv need to be gone");
                AdPAGFrameContainer.m119949a(AdPAGFrameContainer.this).clearAnimation();
                AdPAGFrameContainer.m119949a(AdPAGFrameContainer.this).setVisibility(8);
            }
            SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$b */
    public class C94732b extends SimplePAGViewUpdateListener {
        public C94732b() {
        }

        public void onAnimationCancel(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
            SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
        }

        public void onAnimationEnd(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
        }

        public void onAnimationRepeat(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
        }

        public void onAnimationStart(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
            AdPAGFrameContainer adPAGFrameContainer = AdPAGFrameContainer.this;
            int i = AdPAGFrameContainer.f274214p;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            adPAGFrameContainer.getClass();
            SnsMethodCalculate.markStartTimeMs("startListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            PAGView pAGView2 = adPAGFrameContainer.f274215d;
            if (pAGView2 == null) {
                SnsMethodCalculate.markEndTimeMs("startListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            } else {
                try {
                    if (!adPAGFrameContainer.f274219h) {
                        adPAGFrameContainer.f274219h = true;
                        pAGView2.addPAGFlushListener(adPAGFrameContainer.f274221j);
                        Log.m105924i("AdPAGFrameContainer", "startListenFlushListener");
                    }
                } catch (Throwable unused) {
                }
                SnsMethodCalculate.markEndTimeMs("startListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            }
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$c */
    public class C94733c implements Runnable {
        public C94733c() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$3");
            AdPAGFrameContainer adPAGFrameContainer = AdPAGFrameContainer.this;
            int i = AdPAGFrameContainer.f274214p;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            PAGView pAGView = adPAGFrameContainer.f274215d;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            pAGView.play();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$3");
        }
    }

    public AdPAGFrameContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public static /* synthetic */ ImageView m119949a(AdPAGFrameContainer adPAGFrameContainer) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        ImageView imageView = adPAGFrameContainer.f274216e;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        return imageView;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x007f */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo130432b() {
        /*
            r7 = this;
            java.lang.String r0 = "AdPAGFrameContainer"
            java.lang.String r1 = "resetPAGViewStatus"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            boolean r3 = r7.f274217f     // Catch:{ all -> 0x0089 }
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "resetPAGViewStatus, mIsReset is true so return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x0089 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L_0x0018:
            android.widget.ImageView r3 = r7.f274216e     // Catch:{ all -> 0x0089 }
            r4 = 0
            if (r3 == 0) goto L_0x0020
            r3.setVisibility(r4)     // Catch:{ all -> 0x0089 }
        L_0x0020:
            org.libpag.PAGView r3 = r7.f274215d     // Catch:{ all -> 0x0089 }
            if (r3 == 0) goto L_0x009f
            r5 = 8
            r3.setVisibility(r5)     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "stop"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)     // Catch:{ all -> 0x0089 }
            org.libpag.PAGView r5 = r7.f274215d     // Catch:{ all -> 0x0089 }
            if (r5 == 0) goto L_0x003e
            com.tencent.mm.plugin.sns.ad.widget.adpag.b r6 = new com.tencent.mm.plugin.sns.ad.widget.adpag.b     // Catch:{ all -> 0x0089 }
            r6.<init>(r7)     // Catch:{ all -> 0x0089 }
            r5.post(r6)     // Catch:{ all -> 0x0089 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x0089 }
        L_0x003e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "stopListenPAGView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)     // Catch:{ all -> 0x0089 }
            org.libpag.PAGView r5 = r7.f274215d     // Catch:{ all -> 0x0089 }
            if (r5 != 0) goto L_0x004f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)     // Catch:{ all -> 0x0089 }
            goto L_0x0063
        L_0x004f:
            boolean r6 = r7.f274218g     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x0060
            r7.f274218g = r4     // Catch:{ all -> 0x0060 }
            org.libpag.PAGView$PAGViewListener r6 = r7.f274222n     // Catch:{ all -> 0x0060 }
            r5.removeListener(r6)     // Catch:{ all -> 0x0060 }
            java.lang.String r5 = "stopListenPagView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x0060 }
        L_0x0060:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)     // Catch:{ all -> 0x0089 }
        L_0x0063:
            java.lang.String r3 = "stopListenFlushListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)     // Catch:{ all -> 0x0089 }
            org.libpag.PAGView r5 = r7.f274215d     // Catch:{ all -> 0x0089 }
            if (r5 != 0) goto L_0x0071
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)     // Catch:{ all -> 0x0089 }
            goto L_0x0082
        L_0x0071:
            boolean r6 = r7.f274219h     // Catch:{ all -> 0x007f }
            if (r6 == 0) goto L_0x007f
            r7.f274219h = r4     // Catch:{ all -> 0x007f }
            org.libpag.PAGView$PAGFlushListener r4 = r7.f274221j     // Catch:{ all -> 0x007f }
            r5.removePAGFlushListener(r4)     // Catch:{ all -> 0x007f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x007f }
        L_0x007f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)     // Catch:{ all -> 0x0089 }
        L_0x0082:
            r3 = 1
            r7.f274217f = r3     // Catch:{ all -> 0x0089 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0089 }
            goto L_0x009f
        L_0x0089:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "resetPAGViewStatus exp is "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
        L_0x009f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.widget.adpag.AdPAGFrameContainer.mo130432b():void");
    }

    /* renamed from: c */
    public void mo130433c() {
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        if (this.f274215d != null) {
            setProgress(0.0d);
            this.f274215d.setVisibility(0);
            SnsMethodCalculate.markStartTimeMs("startListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            PAGView pAGView = this.f274215d;
            if (pAGView == null) {
                SnsMethodCalculate.markEndTimeMs("startListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            } else {
                try {
                    if (!this.f274218g) {
                        this.f274218g = true;
                        pAGView.addListener(this.f274222n);
                        Log.m105924i("AdPAGFrameContainer", "startListenPagView");
                    }
                } catch (Throwable unused) {
                }
                SnsMethodCalculate.markEndTimeMs("startListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            }
            this.f274215d.post(new C94733c());
            this.f274217f = false;
            Log.m105924i("AdPAGFrameContainer", AssetExtension.SCENE_PLAY);
        }
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        mo130432b();
        setEventListenerEnabled(false);
        super.onDetachedFromWindow();
        Log.m105924i("AdPAGFrameContainer", "onDetachedFromWindow");
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        try {
            Log.m105924i("AdPAGFrameContainer", "onPause");
            mo130432b();
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    public void onStartTemporaryDetach() {
        SnsMethodCalculate.markStartTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        if (Build.VERSION.SDK_INT < 24) {
            mo130432b();
            setEventListenerEnabled(false);
            Log.m105924i("AdPAGFrameContainer", "onStartTemporaryDetach");
        } else {
            Log.m105918d("AdPAGFrameContainer", "onStartTemporaryDetach");
        }
        super.onStartTemporaryDetach();
        SnsMethodCalculate.markEndTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    public void setEventListenerEnabled(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setEventListenerEnabled", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        Log.m105924i("AdPAGFrameContainer", "setEventListenerEnabled: " + z);
        if (z) {
            try {
                this.f274223o.alive();
            } catch (Throwable th) {
                Log.m105920e("AdPAGFrameContainer", "setEventListenerEnabled, exp is" + th);
            }
        } else {
            this.f274223o.dead();
        }
        SnsMethodCalculate.markEndTimeMs("setEventListenerEnabled", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    public void setProgress(double d) {
        SnsMethodCalculate.markStartTimeMs("setProgress", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        PAGView pAGView = this.f274215d;
        if (pAGView != null) {
            pAGView.setProgress(d);
        }
        SnsMethodCalculate.markEndTimeMs("setProgress", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    public void setSnsId(long j) {
        SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        this.f274220i = j;
        SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    public AdPAGFrameContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdPAGFrameContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f274217f = false;
        this.f274221j = new C94731a();
        this.f274222n = new C94732b();
        this.f274223o = new IListener<SnsAdInteractionEvent>(C40008f.f107254d) {
            {
                this.__eventId = 783234387;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                SnsAdInteractionEvent.C92568a aVar = ((SnsAdInteractionEvent) iEvent).f265118d;
                int i = aVar.f265119a;
                long j = aVar.f265120b;
                StringBuilder sb = new StringBuilder();
                sb.append("snsAdInteractionEvent callback, visibility is ");
                sb.append(i);
                sb.append(", snsId is ");
                sb.append(C102236a0.m134765q0(j));
                sb.append(", curSnsId is ");
                AdPAGFrameContainer adPAGFrameContainer = AdPAGFrameContainer.this;
                int i2 = AdPAGFrameContainer.f274214p;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                long j2 = adPAGFrameContainer.f274220i;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                sb.append(C102236a0.m134765q0(j2));
                sb.append(", adPAGFrameContainer hashCode is ");
                sb.append(AdPAGFrameContainer.this.hashCode());
                Log.m105924i("AdPAGFrameContainer", sb.toString());
                AdPAGFrameContainer adPAGFrameContainer2 = AdPAGFrameContainer.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                long j3 = adPAGFrameContainer2.f274220i;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                if (j3 != j) {
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                } else {
                    AdPAGFrameContainer.this.setVisibility(i);
                    if (i == 8) {
                        AdPAGFrameContainer.this.setEventListenerEnabled(false);
                    }
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                return false;
            }
        };
        if (context instanceof C0125s) {
            ((C0125s) context).getLifecycle().addObserver(this);
        }
    }
}
