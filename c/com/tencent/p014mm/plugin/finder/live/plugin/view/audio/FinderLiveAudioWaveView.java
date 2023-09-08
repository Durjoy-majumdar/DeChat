package com.tencent.p014mm.plugin.finder.live.plugin.view.audio;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveReplayUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import x50.C15626c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001@B\u0011\b\u0016\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:B\u001b\b\u0016\u0012\u0006\u00108\u001a\u000207\u0012\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b9\u0010=B#\b\u0016\u0012\u0006\u00108\u001a\u000207\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\u0006\u0010>\u001a\u00020\u0011¢\u0006\u0004\b9\u0010?J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0004R\u00020\u0000H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bJ(\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0014J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u0019\u001a\u00020\u0006H\u0014R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002XD¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u00118\u0002XD¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002XD¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0016\u0010%\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R \u0010)\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00000(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010+\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\u0014\u00105\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010'¨\u0006A"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/plugin/view/audio/FinderLiveAudioWaveView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "Lcom/tencent/mm/plugin/finder/live/plugin/view/audio/FinderLiveAudioWaveView$Wave;", "wave", "Lrx3/b0;", "drawWave", "", "percent", "drawWaveInternal", "", "isQuickMode", "changeMode", "waveStart", "leftToRight", "setWaveStart", "", "w", "h", "oldw", "oldh", "onSizeChanged", "onDraw", "getAlpha", "onDetachedFromWindow", "", "TAG", "Ljava/lang/String;", "centerRadius", "I", "maxRadius", "NORMAL_INTERVAL", "", "NORMAL_DURATION", "J", "waveIntervalTime", "waveDuration", "running", "Z", "", "waveList", "Ljava/util/List;", "waveWidth", "F", "getWaveWidth", "()F", "setWaveWidth", "(F)V", "arcWidth", "getArcWidth", "setArcWidth", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attributeSet", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Wave", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveView */
public final class FinderLiveAudioWaveView extends View {
    private final long NORMAL_DURATION;
    private final int NORMAL_INTERVAL;
    private final String TAG;
    private float arcWidth;
    /* access modifiers changed from: private */
    public int centerRadius;
    private boolean isQuickMode;
    private boolean leftToRight;
    /* access modifiers changed from: private */
    public int maxRadius;
    private final Paint paint;
    /* access modifiers changed from: private */
    public boolean running;
    /* access modifiers changed from: private */
    public long waveDuration;
    /* access modifiers changed from: private */
    public int waveIntervalTime;
    /* access modifiers changed from: private */
    public List<Wave> waveList;
    private float waveWidth;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveAudioWaveView(Context context) {
        this(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
    }

    private final void drawWave(Canvas canvas, Wave wave) {
        drawWaveInternal(canvas, wave.getPercent());
    }

    private final void drawWaveInternal(Canvas canvas, float f) {
        float f2 = f;
        int alpha = getAlpha(f2);
        if (this.leftToRight) {
            Paint paint2 = this.paint;
            if (alpha < 0) {
                alpha = 0;
            }
            paint2.setAlpha(alpha);
            Paint paint3 = this.paint;
            float f3 = this.waveWidth;
            paint3.setStrokeWidth((f3 / 3.0f) + (((f3 * 2.0f) / 3.0f) * f2));
            this.paint.setStyle(Paint.Style.STROKE);
            float width = ((float) getWidth()) * f2;
            Canvas canvas2 = canvas;
            canvas2.drawArc(width, (((float) getHeight()) / 2.0f) - ((((float) getHeight()) / 2.0f) * f2), width + (this.arcWidth * f2), (((float) getHeight()) / 2.0f) + ((((float) getHeight()) / 2.0f) * f2), -80.0f, 160.0f, false, this.paint);
            return;
        }
        Paint paint4 = this.paint;
        if (alpha < 0) {
            alpha = 0;
        }
        paint4.setAlpha(alpha);
        Paint paint5 = this.paint;
        float f4 = this.waveWidth;
        paint5.setStrokeWidth((f4 / 3.0f) + (((f4 * 2.0f) / 3.0f) * f2));
        this.paint.setStyle(Paint.Style.STROKE);
        float width2 = ((float) getWidth()) * (1.0f - f2);
        canvas.drawArc(width2 - (this.arcWidth * f2), (((float) getHeight()) / 2.0f) - ((((float) getHeight()) / 2.0f) * f2), width2, (((float) getHeight()) / 2.0f) + ((((float) getHeight()) / 2.0f) * f2), 100.0f, 160.0f, false, this.paint);
    }

    public static /* synthetic */ void setWaveStart$default(FinderLiveAudioWaveView finderLiveAudioWaveView, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        finderLiveAudioWaveView.setWaveStart(z, z2);
    }

    public final void changeMode(boolean z) {
        if (this.isQuickMode != z) {
            if (z) {
                this.waveIntervalTime = this.NORMAL_INTERVAL / 2;
                this.waveDuration = this.NORMAL_DURATION / ((long) 2);
            } else {
                this.waveIntervalTime = this.NORMAL_INTERVAL;
                this.waveDuration = this.NORMAL_DURATION;
            }
        }
        this.isQuickMode = z;
    }

    public final int getAlpha(float f) {
        return (int) (f <= 0.4f ? 637.5f * f : 1274.9999f * (0.6f - f));
    }

    public final float getArcWidth() {
        return this.arcWidth;
    }

    public final float getWaveWidth() {
        return this.waveWidth;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.running = false;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        this.paint.setAntiAlias(true);
        if (this.running) {
            for (Wave drawWave : this.waveList) {
                drawWave(canvas, drawWave);
            }
            return;
        }
        for (int i = 1; i < 4; i++) {
            drawWaveInternal(canvas, ((float) i) * 0.13f);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int min = (int) (((float) Math.min(i, i2)) / 2.0f);
        if (min < this.maxRadius) {
            this.maxRadius = min;
        }
    }

    public final void setArcWidth(float f) {
        this.arcWidth = f;
    }

    public final void setWaveStart(boolean z, boolean z2) {
        this.leftToRight = z2;
        if (!(getContext() instanceof FinderLiveReplayUI)) {
            boolean z3 = this.running;
            if (z == z3) {
                return;
            }
            if (z3 && !z) {
                return;
            }
        }
        if (!z) {
            this.running = false;
            for (Wave cancelAnimation : this.waveList) {
                cancelAnimation.cancelAnimation();
            }
            this.waveList.clear();
        } else if (!this.running) {
            this.running = true;
            this.waveList.add(new Wave(true));
        }
    }

    public final void setWaveWidth(float f) {
        this.waveWidth = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveAudioWaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveAudioWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.TAG = "FinderLiveAudioWaveView";
        this.centerRadius = C15626c.m14629a(getContext(), 4.0f);
        this.maxRadius = C15626c.m14629a(getContext(), 14.0f);
        this.NORMAL_INTERVAL = 800;
        this.NORMAL_DURATION = 3000;
        this.waveIntervalTime = 800;
        this.waveDuration = 3000;
        this.waveList = new ArrayList();
        this.waveWidth = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
        this.arcWidth = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3738cr);
        Paint paint2 = new Paint();
        this.paint = paint2;
        this.leftToRight = true;
        paint2.setColor(getResources().getColor(C0966R.color.f2975b6));
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00048\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/plugin/view/audio/FinderLiveAudioWaveView$Wave;", "", "Lrx3/b0;", "cancelAnimation", "", "getCurrentRadius", "", "isAnim", "Z", "()Z", "hasCreateNewWave", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "createWaveAnimation", "Landroid/animation/ObjectAnimator;", "value", "percent", "F", "getPercent", "()F", "setPercent", "(F)V", "<init>", "(Lcom/tencent/mm/plugin/finder/live/plugin/view/audio/FinderLiveAudioWaveView;Z)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveView$Wave */
    public final class Wave {
        private final ObjectAnimator createWaveAnimation;
        private boolean hasCreateNewWave;
        private final boolean isAnim;
        private float percent;

        public Wave(boolean z) {
            this.isAnim = z;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "percent", new float[]{0.1f, 1.0f});
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(FinderLiveAudioWaveView.this.waveDuration);
            ofFloat.addListener(new FinderLiveAudioWaveView$Wave$createWaveAnimation$1$1(FinderLiveAudioWaveView.this, this));
            this.createWaveAnimation = ofFloat;
            if (z) {
                ofFloat.start();
            }
        }

        public final void cancelAnimation() {
            this.createWaveAnimation.cancel();
        }

        public final float getCurrentRadius() {
            return ((float) FinderLiveAudioWaveView.this.centerRadius) + (this.percent * ((float) (FinderLiveAudioWaveView.this.maxRadius - FinderLiveAudioWaveView.this.centerRadius)));
        }

        public final float getPercent() {
            return this.percent;
        }

        public final boolean isAnim() {
            return this.isAnim;
        }

        public final void setPercent(float f) {
            this.percent = f;
            if (FinderLiveAudioWaveView.this.running && f >= ((float) FinderLiveAudioWaveView.this.waveIntervalTime) / ((float) FinderLiveAudioWaveView.this.waveDuration) && !this.hasCreateNewWave) {
                if (FinderLiveAudioWaveView.this.isShown()) {
                    FinderLiveAudioWaveView.this.waveList.add(new Wave(this.isAnim));
                } else {
                    FinderLiveAudioWaveView.this.waveList.clear();
                    FinderLiveAudioWaveView.this.running = false;
                    cancelAnimation();
                }
                this.hasCreateNewWave = true;
            }
            FinderLiveAudioWaveView.this.invalidate();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Wave(FinderLiveAudioWaveView finderLiveAudioWaveView, boolean z, int i, C8480h hVar) {
            this((i & 1) != 0 ? false : z);
        }
    }
}
