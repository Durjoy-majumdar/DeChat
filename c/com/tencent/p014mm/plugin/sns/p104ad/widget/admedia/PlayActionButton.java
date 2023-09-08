package com.tencent.p014mm.plugin.sns.p104ad.widget.admedia;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2helper;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00118F@FX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/admedia/PlayActionButton;", "Landroid/widget/RelativeLayout;", "Landroid/view/View;", "d", "Landroid/view/View;", "getActionImg", "()Landroid/view/View;", "actionImg", "", "value", "g", "I", "getState", "()I", "setState", "(I)V", "state", "", "getShowLoading", "()Z", "setShowLoading", "(Z)V", "showLoading", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton */
public final class PlayActionButton extends RelativeLayout {

    /* renamed from: d */
    public final View f274185d = new View(getContext());

    /* renamed from: e */
    public C94727a f274186e;

    /* renamed from: f */
    public int f274187f = -1;

    /* renamed from: g */
    public int f274188g;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$a */
    public static final class C94727a extends View {

        /* renamed from: d */
        public float f274189d;

        /* renamed from: e */
        public final Paint f274190e;

        /* renamed from: f */
        public final float f274191f;

        /* renamed from: g */
        public boolean f274192g;

        public C94727a(Context context, float f, int i) {
            super(context);
            Display defaultDisplay;
            Paint paint = new Paint();
            this.f274190e = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(f);
            WindowManager windowManager = null;
            Object systemService = context != null ? context.getSystemService("window") : null;
            windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : windowManager;
            float f2 = 60.0f;
            float refreshRate = (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 60.0f : defaultDisplay.getRefreshRate();
            this.f274191f = refreshRate >= 30.0f ? refreshRate : f2;
            Log.m105918d("AnimCircleView", "AnimCircleView() called");
        }

        public final float getCurrentFPS() {
            SnsMethodCalculate.markStartTimeMs("getCurrentFPS", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
            float f = this.f274191f;
            SnsMethodCalculate.markEndTimeMs("getCurrentFPS", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
            return f;
        }

        public final Paint getPaint() {
            SnsMethodCalculate.markStartTimeMs("getPaint", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
            Paint paint = this.f274190e;
            SnsMethodCalculate.markEndTimeMs("getPaint", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
            return paint;
        }

        public void onDraw(Canvas canvas) {
            SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
            super.onDraw(canvas);
            if (canvas == null) {
                SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
                return;
            }
            float strokeWidth = this.f274190e.getStrokeWidth();
            int width = getWidth();
            int height = getHeight();
            if (!this.f274192g) {
                float f = strokeWidth + 0.0f;
                canvas.drawArc(f, f, ((float) width) - strokeWidth, ((float) height) - strokeWidth, 0.0f, 360.0f, false, this.f274190e);
            } else {
                float f2 = strokeWidth + 0.0f;
                canvas.drawArc(f2, f2, ((float) width) - strokeWidth, ((float) height) - strokeWidth, this.f274189d + ((float) 270), 330.0f, false, this.f274190e);
                this.f274189d = (this.f274189d + (180.0f / this.f274191f)) % ((float) v2helper.VOIP_ENC_HEIGHT_LV1);
                invalidate();
            }
            SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        }

        public final void setLoading(boolean z) {
            SnsMethodCalculate.markStartTimeMs("setLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
            this.f274192g = z;
            invalidate();
            SnsMethodCalculate.markEndTimeMs("setLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayActionButton(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public final View getActionImg() {
        SnsMethodCalculate.markStartTimeMs("getActionImg", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        View view = this.f274185d;
        SnsMethodCalculate.markEndTimeMs("getActionImg", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        return view;
    }

    public final boolean getShowLoading() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("getShowLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        C94727a aVar = this.f274186e;
        if (aVar != null) {
            SnsMethodCalculate.markStartTimeMs("isLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
            z = aVar.f274192g;
            SnsMethodCalculate.markEndTimeMs("isLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        } else {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("getShowLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        return z;
    }

    public final int getState() {
        SnsMethodCalculate.markStartTimeMs("getState", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        int i = this.f274188g;
        SnsMethodCalculate.markEndTimeMs("getState", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        return i;
    }

    public final void setShowLoading(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setShowLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        C94727a aVar = this.f274186e;
        if (aVar != null) {
            aVar.setLoading(z);
        }
        SnsMethodCalculate.markEndTimeMs("setShowLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
    }

    public final void setState(int i) {
        SnsMethodCalculate.markStartTimeMs("setState", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
        this.f274188g = i;
        if (i == 1) {
            Drawable drawable = getContext().getDrawable(C0966R.C0969drawable.bz9);
            if (drawable == null) {
                SnsMethodCalculate.markEndTimeMs("setState", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
                return;
            } else {
                drawable.setTint(this.f274187f);
                this.f274185d.setBackground(drawable);
            }
        } else {
            Drawable drawable2 = getContext().getDrawable(C0966R.C0969drawable.bz_);
            if (drawable2 == null) {
                SnsMethodCalculate.markEndTimeMs("setState", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
                return;
            } else {
                drawable2.setTint(this.f274187f);
                this.f274185d.setBackground(drawable2);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setState", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
