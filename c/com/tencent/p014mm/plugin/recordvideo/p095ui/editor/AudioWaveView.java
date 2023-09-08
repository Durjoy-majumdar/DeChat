package com.tencent.p014mm.plugin.recordvideo.p095ui.editor;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import p295b8.C16774g;
import p370p7.C21962v;
import p396x6.C22997e;
import p396x6.C23016o;
import p396x6.C23017p;
import p396x6.C23023u;
import p396x6.C23027v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PB!\b\u0016\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010N\u001a\u00020M\u0012\u0006\u0010Q\u001a\u00020\u0002¢\u0006\u0004\bO\u0010RJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010*\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010\u0010R\"\u00101\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010\u000e\u001a\u0004\b/\u0010\u0010\"\u0004\b0\u0010\u0012R\"\u00109\u001a\u0002028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010<\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R.\u0010H\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010@8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bI\u0010;\u001a\u0004\bI\u0010=\"\u0004\bJ\u0010?¨\u0006S"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/AudioWaveView;", "Landroid/view/View;", "", "color", "Lrx3/b0;", "setColor", "Landroid/content/res/ColorStateList;", "colorStateList", "", "selected", "setSelected", "isShow", "setShow", "d", "I", "getMWidth", "()I", "setMWidth", "(I)V", "mWidth", "e", "getMRectWidth", "setMRectWidth", "mRectWidth", "f", "getMRectHeight", "setMRectHeight", "mRectHeight", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "getMWavePaint", "()Landroid/graphics/Paint;", "setMWavePaint", "(Landroid/graphics/Paint;)V", "mWavePaint", "h", "Landroid/content/res/ColorStateList;", "getMWavePatinColorState", "()Landroid/content/res/ColorStateList;", "setMWavePatinColorState", "(Landroid/content/res/ColorStateList;)V", "mWavePatinColorState", "i", "getOffset", "offset", "j", "getMRectCount", "setMRectCount", "mRectCount", "", "n", "D", "getMRandom", "()D", "setMRandom", "(D)V", "mRandom", "o", "Z", "isRunningShow", "()Z", "setRunningShow", "(Z)V", "Lx6/u;", "value", "p", "Lx6/u;", "getPlayer", "()Lx6/u;", "setPlayer", "(Lx6/u;)V", "player", "isPlayerLoading", "setPlayerLoading", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.AudioWaveView */
public final class AudioWaveView extends View {

    /* renamed from: d */
    public int f315470d;

    /* renamed from: e */
    public int f315471e;

    /* renamed from: f */
    public int f315472f;

    /* renamed from: g */
    public Paint f315473g;

    /* renamed from: h */
    public ColorStateList f315474h;

    /* renamed from: i */
    public final int f315475i = C76577a.m92152c(getContext(), 3);

    /* renamed from: j */
    public int f315476j;

    /* renamed from: n */
    public double f315477n;

    /* renamed from: o */
    public boolean f315478o;

    /* renamed from: p */
    public C23023u f315479p;

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.AudioWaveView$a */
    public static final class C105996a implements C23017p.C23018a {

        /* renamed from: d */
        public final /* synthetic */ AudioWaveView f315480d;

        public C105996a(AudioWaveView audioWaveView) {
            this.f315480d = audioWaveView;
        }

        public void onLoadingChanged(boolean z) {
        }

        public void onPlaybackParametersChanged(C23016o oVar) {
        }

        public void onPlayerError(C22997e eVar) {
        }

        public void onPlayerStateChanged(boolean z, int i) {
            if (i == 3) {
                this.f315480d.setPlayerLoading(false);
            }
        }

        public void onPositionDiscontinuity() {
        }

        public void onRepeatModeChanged(int i) {
        }

        public void onTimelineChanged(C23027v vVar, Object obj) {
        }

        public void onTracksChanged(C21962v vVar, C16774g gVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioWaveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo151331a();
    }

    /* renamed from: a */
    public final void mo151331a() {
        this.f315476j = 20;
        Paint paint = new Paint();
        this.f315473g = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.f315473g;
        C87412m.m108591d(paint2);
        paint2.setColor(-3355444);
        Paint paint3 = this.f315473g;
        C87412m.m108591d(paint3);
        paint3.setAntiAlias(true);
    }

    public final double getMRandom() {
        return this.f315477n;
    }

    public final int getMRectCount() {
        return this.f315476j;
    }

    public final int getMRectHeight() {
        return this.f315472f;
    }

    public final int getMRectWidth() {
        return this.f315471e;
    }

    public final Paint getMWavePaint() {
        return this.f315473g;
    }

    public final ColorStateList getMWavePatinColorState() {
        return this.f315474h;
    }

    public final int getMWidth() {
        return this.f315470d;
    }

    public final int getOffset() {
        return this.f315475i;
    }

    public final C23023u getPlayer() {
        return this.f315479p;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        canvas.translate((float) (getWidth() / 2), (float) getHeight());
        int i = this.f315476j;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f315478o) {
                double random = Math.random();
                this.f315477n = random;
                float f = (float) (((double) this.f315472f) * random);
                int i3 = this.f315471e;
                RectF rectF = new RectF((float) (((double) (i3 * i2)) + ((double) this.f315475i)), 0.0f, (float) (i3 * (i2 + 1)), -f);
                int i4 = this.f315471e;
                int i5 = i4 / 2;
                int i6 = i4 / 4;
                Paint paint = this.f315473g;
                C87412m.m108591d(paint);
                canvas.drawRect(rectF, paint);
            } else {
                int i7 = this.f315471e;
                RectF rectF2 = new RectF((float) (((double) (i7 * i2)) + ((double) this.f315475i)), 0.0f, (float) (i7 * (i2 + 1)), -0.5f);
                int i8 = this.f315471e;
                int i9 = i8 / 2;
                int i15 = i8 / 4;
                Paint paint2 = this.f315473g;
                C87412m.m108591d(paint2);
                canvas.drawRect(rectF2, paint2);
            }
        }
        postInvalidateDelayed(100);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f315470d = getWidth();
        this.f315472f = getHeight() / 2;
        this.f315471e = this.f315470d / (this.f315476j * 2);
    }

    public final void setColor(int i) {
        Paint paint = this.f315473g;
        C87412m.m108591d(paint);
        paint.setColor(i);
    }

    public final void setMRandom(double d) {
        this.f315477n = d;
    }

    public final void setMRectCount(int i) {
        this.f315476j = i;
    }

    public final void setMRectHeight(int i) {
        this.f315472f = i;
    }

    public final void setMRectWidth(int i) {
        this.f315471e = i;
    }

    public final void setMWavePaint(Paint paint) {
        this.f315473g = paint;
    }

    public final void setMWavePatinColorState(ColorStateList colorStateList) {
        this.f315474h = colorStateList;
    }

    public final void setMWidth(int i) {
        this.f315470d = i;
    }

    public final void setPlayer(C23023u uVar) {
        if (uVar != null) {
            this.f315479p = uVar;
            uVar.mo36323h(new C105996a(this));
        }
    }

    public final void setPlayerLoading(boolean z) {
    }

    public final void setRunningShow(boolean z) {
        this.f315478o = z;
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        Paint paint = this.f315473g;
        C87412m.m108591d(paint);
        ColorStateList colorStateList = this.f315474h;
        int i = 0;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(getDrawableState(), 0);
        }
        paint.setColor(i);
    }

    public final void setShow(boolean z) {
        this.f315478o = z;
    }

    public final void setColor(ColorStateList colorStateList) {
        C87412m.m108594g(colorStateList, "colorStateList");
        this.f315474h = colorStateList;
        Paint paint = this.f315473g;
        C87412m.m108591d(paint);
        ColorStateList colorStateList2 = this.f315474h;
        int i = 0;
        if (colorStateList2 != null) {
            i = colorStateList2.getColorForState(getDrawableState(), 0);
        }
        paint.setColor(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo151331a();
    }
}
