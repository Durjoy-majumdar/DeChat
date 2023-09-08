package com.tencent.p014mm.plugin.sns.p104ad.widget.twistad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.wxmm.v2helper;
import java.util.HashMap;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView */
public class TwistRoateCardsView extends FrameLayout {

    /* renamed from: y */
    public static HashMap<String, Bitmap> f274587y = new HashMap<>();

    /* renamed from: d */
    public Context f274588d;

    /* renamed from: e */
    public int f274589e = 0;

    /* renamed from: f */
    public int f274590f = 0;

    /* renamed from: g */
    public int f274591g;

    /* renamed from: h */
    public int f274592h;

    /* renamed from: i */
    public int f274593i;

    /* renamed from: j */
    public int f274594j;

    /* renamed from: n */
    public int f274595n;

    /* renamed from: o */
    public float f274596o = 0.0f;

    /* renamed from: p */
    public float f274597p = 1.0f;

    /* renamed from: q */
    public View f274598q;

    /* renamed from: r */
    public boolean f274599r = false;

    /* renamed from: s */
    public int f274600s;

    /* renamed from: t */
    public String f274601t;

    /* renamed from: u */
    public int f274602u;

    /* renamed from: v */
    public ViewOutlineProvider f274603v = new C94790a();

    /* renamed from: w */
    public int f274604w = 0;

    /* renamed from: x */
    public C94791b f274605x;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$a */
    public class C94790a extends ViewOutlineProvider {
        public C94790a() {
        }

        public void getOutline(View view, Outline outline) {
            SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$1");
            TwistRoateCardsView twistRoateCardsView = TwistRoateCardsView.this;
            HashMap<String, Bitmap> hashMap = TwistRoateCardsView.f274587y;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            int i = twistRoateCardsView.f274592h;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            TwistRoateCardsView twistRoateCardsView2 = TwistRoateCardsView.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            int i2 = twistRoateCardsView2.f274593i;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            TwistRoateCardsView twistRoateCardsView3 = TwistRoateCardsView.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            int i3 = twistRoateCardsView3.f274595n;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            outline.setRoundRect(0, 0, i, i2, (float) i3);
            SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$b */
    public interface C94791b {
    }

    public TwistRoateCardsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        this.f274588d = context;
        this.f274594j = C76577a.m92151b(context, 14);
        this.f274595n = C76577a.m92151b(this.f274588d, 8);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    /* renamed from: a */
    public static /* synthetic */ C94791b m120116a(TwistRoateCardsView twistRoateCardsView) {
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        C94791b bVar = twistRoateCardsView.f274605x;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        return bVar;
    }

    public void dispatchDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        canvas.save();
        canvas.rotate(this.f274596o, (float) this.f274589e, (float) this.f274590f);
        float f = this.f274597p;
        canvas.scale(f, f, (float) this.f274589e, (float) this.f274590f);
        super.dispatchDraw(canvas);
        canvas.restore();
        SnsMethodCalculate.markEndTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        if (getWidth() > 0 && getHeight() > 0) {
            this.f274589e = getWidth() / 2;
            this.f274590f = getHeight() + C76577a.m92151b(this.f274588d, 40);
            SnsMethodCalculate.markStartTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            if (getChildCount() != 12) {
                SnsMethodCalculate.markEndTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            } else {
                for (int i7 = 0; i7 < 12; i7++) {
                    View childAt = getChildAt(i7);
                    if (this.f274599r) {
                        double d = ((double) i7) * 0.5235987755982988d;
                        i6 = (int) (((double) this.f274591g) * Math.cos(d));
                        i5 = (int) (((double) this.f274591g) * Math.sin(d));
                        childAt.setRotation((float) (90 - ((i7 * v2helper.VOIP_ENC_HEIGHT_LV1) / 12)));
                    } else {
                        double d2 = ((double) (-i7)) * 0.5235987755982988d;
                        i6 = (int) (((double) this.f274591g) * Math.cos(d2));
                        i5 = (int) (((double) this.f274591g) * Math.sin(d2));
                        childAt.setRotation((float) (((i7 * v2helper.VOIP_ENC_HEIGHT_LV1) / 12) + 90));
                    }
                    int i8 = this.f274589e + i6;
                    int i9 = this.f274590f - i5;
                    int i15 = this.f274592h;
                    int i16 = this.f274594j * 2;
                    int i17 = (i15 + i16) / 2;
                    int i18 = (this.f274593i + i16) / 2;
                    childAt.layout(i8 - i17, i9 - i18, i8 + i17, i9 + i18);
                }
                SnsMethodCalculate.markEndTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    public void setAnimCardView(View view) {
        SnsMethodCalculate.markStartTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        this.f274598q = view;
        SnsMethodCalculate.markEndTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    public void setOnCardAnimListener(C94791b bVar) {
        SnsMethodCalculate.markStartTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        this.f274605x = bVar;
        SnsMethodCalculate.markEndTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }
}
