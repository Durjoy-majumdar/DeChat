package com.tencent.p014mm.plugin.sns.p104ad.widget.twistad;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p104ad.widget.gllib.GLViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2helper;
import kg3.C76577a;
import zq2.C103063b;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView */
public class GLTwistRoateCardsView extends GLViewContainer {

    /* renamed from: L */
    public static final /* synthetic */ int f274526L = 0;

    /* renamed from: A */
    public int f274527A;

    /* renamed from: B */
    public View f274528B;

    /* renamed from: C */
    public boolean f274529C = false;

    /* renamed from: D */
    public int f274530D;

    /* renamed from: E */
    public String f274531E;

    /* renamed from: F */
    public int f274532F;

    /* renamed from: G */
    public Bitmap f274533G;

    /* renamed from: H */
    public Handler f274534H;

    /* renamed from: I */
    public HandlerThread f274535I;

    /* renamed from: J */
    public int f274536J = 0;

    /* renamed from: K */
    public C94785a f274537K;

    /* renamed from: s */
    public Context f274538s;

    /* renamed from: t */
    public int f274539t = 0;

    /* renamed from: u */
    public int f274540u = 0;

    /* renamed from: v */
    public int f274541v;

    /* renamed from: w */
    public int f274542w;

    /* renamed from: x */
    public int f274543x;

    /* renamed from: y */
    public int f274544y;

    /* renamed from: z */
    public int f274545z;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$a */
    public interface C94785a {
    }

    public GLTwistRoateCardsView(Context context) {
        super(context, (AttributeSet) null);
        mo130620j(context);
    }

    /* renamed from: h */
    public static /* synthetic */ C94785a m120098h(GLTwistRoateCardsView gLTwistRoateCardsView) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        C94785a aVar = gLTwistRoateCardsView.f274537K;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        return aVar;
    }

    /* renamed from: g */
    public void mo130532g(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        Log.m105924i("GLTwistRoateCardsView", "glOnSizeChanged, w=" + getWidth() + ", h=" + getHeight());
        if (getWidth() > 0 && getHeight() > 0) {
            this.f274539t = getWidth() / 2;
            this.f274540u = getHeight() + C76577a.m92151b(this.f274538s, 40);
            mo130619i();
        }
        SnsMethodCalculate.markEndTimeMs("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    /* renamed from: i */
    public final void mo130619i() {
        int i;
        int i2;
        SnsMethodCalculate.markStartTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        Log.m105924i("GLTwistRoateCardsView", "doLayout, child=" + getChildCount() + ", CARD_COUNT=" + 12);
        if (getChildCount() != 12) {
            SnsMethodCalculate.markEndTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            return;
        }
        for (int i3 = 0; i3 < 12; i3++) {
            C103063b bVar = (C103063b) mo130530e(i3);
            if (this.f274529C) {
                double d = ((double) i3) * 0.5235987755982988d;
                i2 = (int) (((double) this.f274541v) * Math.cos(d));
                i = (int) (((double) this.f274541v) * Math.sin(d));
                bVar.mo142777n((float) (90 - ((i3 * v2helper.VOIP_ENC_HEIGHT_LV1) / 12)));
            } else {
                double d2 = ((double) (-i3)) * 0.5235987755982988d;
                i2 = (int) (((double) this.f274541v) * Math.cos(d2));
                i = (int) (((double) this.f274541v) * Math.sin(d2));
                bVar.mo142777n((float) (((i3 * v2helper.VOIP_ENC_HEIGHT_LV1) / 12) + 90));
            }
            int i4 = this.f274539t + i2;
            int i5 = this.f274540u - i;
            int i6 = this.f274543x;
            int i7 = this.f274545z;
            int i8 = (i6 + (i7 * 2)) / 2;
            int i9 = (this.f274544y + (i7 * 2)) / 2;
            bVar.mo142774k(i4 - i8, i5 - i9, i4 + i8, i5 + i9);
            SnsMethodCalculate.markStartTimeMs("setRotationCenter", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
            bVar.f304101I = true;
            bVar.f304097E = (float) this.f274539t;
            bVar.f304098F = (float) this.f274540u;
            bVar.mo142766c();
            SnsMethodCalculate.markEndTimeMs("setRotationCenter", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        }
        SnsMethodCalculate.markEndTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    /* renamed from: j */
    public final void mo130620j(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        this.f274538s = context;
        this.f274545z = C76577a.m92151b(context, 14);
        this.f274527A = C76577a.m92151b(this.f274538s, 8);
        HandlerThread handlerThread = new HandlerThread("twist_anim_thread");
        this.f274535I = handlerThread;
        handlerThread.setPriority(10);
        this.f274535I.start();
        this.f274534H = new Handler(this.f274535I.getLooper());
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        super.onDetachedFromWindow();
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        this.f274535I.quitSafely();
        this.f274534H.removeCallbacksAndMessages((Object) null);
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        Log.m105924i("GLTwistRoateCardsView", "onDetachedFromWindow");
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    public void setAnimCardView(View view) {
        SnsMethodCalculate.markStartTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        this.f274528B = view;
        SnsMethodCalculate.markEndTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    public void setOnCardAnimListener(C94785a aVar) {
        SnsMethodCalculate.markStartTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        this.f274537K = aVar;
        SnsMethodCalculate.markEndTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    public GLTwistRoateCardsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo130620j(context);
    }
}
