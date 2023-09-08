package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import androidx.camera.core.FocusMeteringAction;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003&'(B'\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0014R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006)"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvMarqueeTextView;", "Landroid/view/View;", "", "text", "Lrx3/b0;", "setText", "", "textSize", "setTextSize", "", "textColor", "setTextColor", "", "bold", "setTextBold", "getLeftFadingEdgeStrength", "getRightFadingEdgeStrength", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvMarqueeTextView$c;", "o", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvMarqueeTextView$c;", "getViewProvider", "()Lcom/tencent/mm/plugin/mv/ui/view/MusicMvMarqueeTextView$c;", "viewProvider", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvMarqueeTextView$a;", "p", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvMarqueeTextView$a;", "getEffect", "()Lcom/tencent/mm/plugin/mv/ui/view/MusicMvMarqueeTextView$a;", "setEffect", "(Lcom/tencent/mm/plugin/mv/ui/view/MusicMvMarqueeTextView$a;)V", "effect", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvMarqueeTextView */
public final class MusicMvMarqueeTextView extends View {

    /* renamed from: d */
    public final Paint f315225d;

    /* renamed from: e */
    public String f315226e;

    /* renamed from: f */
    public float f315227f;

    /* renamed from: g */
    public float f315228g;

    /* renamed from: h */
    public float f315229h;

    /* renamed from: i */
    public final Scroller f315230i;

    /* renamed from: j */
    public boolean f315231j;

    /* renamed from: n */
    public boolean f315232n;

    /* renamed from: o */
    public final C105935c f315233o;

    /* renamed from: p */
    public C105932a f315234p;

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvMarqueeTextView$a */
    public interface C105932a {
        /* renamed from: a */
        boolean mo151129a();

        /* renamed from: b */
        boolean mo151130b();

        void onDraw();

        void start();

        void stop();
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvMarqueeTextView$b */
    public static final class C105933b implements C105932a {

        /* renamed from: a */
        public final C105935c f315235a;

        /* renamed from: b */
        public float f315236b = 200.0f;

        /* renamed from: c */
        public long f315237c = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;

        /* renamed from: d */
        public int f315238d;

        /* renamed from: e */
        public final Runnable f315239e = new C105934a(this);

        /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvMarqueeTextView$b$a */
        public static final class C105934a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C105933b f315240d;

            public C105934a(C105933b bVar) {
                this.f315240d = bVar;
            }

            public final void run() {
                C105933b bVar = this.f315240d;
                bVar.f315238d = 2;
                float b = bVar.f315235a.mo151136b() + this.f315240d.f315235a.mo151137d();
                C105933b bVar2 = this.f315240d;
                bVar2.f315235a.mo151135a().startScroll(0, 0, (int) b, 0, (int) ((b / bVar2.f315236b) * ((float) 1000)));
                this.f315240d.f315235a.getView().postInvalidate();
            }
        }

        public C105933b(C105935c cVar) {
            C87412m.m108594g(cVar, "viewProvider");
            this.f315235a = cVar;
        }

        /* renamed from: a */
        public boolean mo151129a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo151130b() {
            return this.f315235a.getView().getScrollX() == 0;
        }

        public void onDraw() {
            if (this.f315235a.mo151135a().isFinished()) {
                this.f315235a.getView().scrollTo(0, 0);
                if (this.f315238d == 2) {
                    this.f315238d = 1;
                    this.f315235a.getView().removeCallbacks(this.f315239e);
                    this.f315235a.getView().postDelayed(this.f315239e, this.f315237c);
                }
            }
        }

        public void start() {
            if (this.f315238d == 0) {
                this.f315238d = 1;
                this.f315235a.getView().removeCallbacks(this.f315239e);
                this.f315235a.getView().postDelayed(this.f315239e, this.f315237c);
            }
        }

        public void stop() {
            this.f315238d = 0;
            this.f315235a.getView().removeCallbacks(this.f315239e);
            this.f315235a.mo151135a().forceFinished(true);
            this.f315235a.getView().scrollTo(0, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvMarqueeTextView$c */
    public interface C105935c {
        /* renamed from: a */
        Scroller mo151135a();

        /* renamed from: b */
        float mo151136b();

        /* renamed from: d */
        float mo151137d();

        View getView();
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvMarqueeTextView$d */
    public static final class C105936d implements C105935c {

        /* renamed from: a */
        public final /* synthetic */ MusicMvMarqueeTextView f315241a;

        public C105936d(MusicMvMarqueeTextView musicMvMarqueeTextView) {
            this.f315241a = musicMvMarqueeTextView;
        }

        /* renamed from: a */
        public Scroller mo151135a() {
            return this.f315241a.f315230i;
        }

        /* renamed from: b */
        public float mo151136b() {
            return this.f315241a.f315227f;
        }

        /* renamed from: d */
        public float mo151137d() {
            return this.f315241a.f315229h;
        }

        public View getView() {
            return this.f315241a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicMvMarqueeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo151114a() {
        float measureText = this.f315225d.measureText(this.f315226e);
        float f = this.f315225d.getFontMetrics().bottom - this.f315225d.getFontMetrics().top;
        boolean z = true;
        if (this.f315227f == measureText) {
            if (this.f315228g != f) {
                z = false;
            }
            if (z) {
                return;
            }
        }
        this.f315227f = measureText;
        this.f315228g = f;
        requestLayout();
    }

    /* renamed from: b */
    public final void mo151115b() {
        if (((float) getWidth()) >= this.f315227f) {
            this.f315231j = false;
            this.f315234p.stop();
            scrollTo(0, 0);
            return;
        }
        this.f315231j = true;
        if (this.f315232n) {
            this.f315234p.start();
        }
    }

    public void computeScroll() {
        if (this.f315230i.computeScrollOffset()) {
            scrollTo(this.f315230i.getCurrX(), this.f315230i.getCurrY());
            postInvalidate();
        }
    }

    public final C105932a getEffect() {
        return this.f315234p;
    }

    public float getLeftFadingEdgeStrength() {
        return (!this.f315231j || this.f315234p.mo151130b()) ? 0.0f : 1.0f;
    }

    public float getRightFadingEdgeStrength() {
        return (!this.f315231j || this.f315234p.mo151129a()) ? 0.0f : 1.0f;
    }

    public final C105935c getViewProvider() {
        return this.f315233o;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        int save = canvas.save();
        canvas.translate(0.0f, ((float) getPaddingTop()) - this.f315225d.getFontMetrics().top);
        canvas.drawText(this.f315226e, 0.0f, 0.0f, this.f315225d);
        if (this.f315231j) {
            canvas.translate(this.f315227f + this.f315229h, 0.0f);
            canvas.drawText(this.f315226e, 0.0f, 0.0f, this.f315225d);
        }
        canvas.restoreToCount(save);
        if (this.f315231j) {
            this.f315234p.onDraw();
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int paddingTop = ((int) this.f315228g) + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE) {
            float f = this.f315227f;
            if (((float) size) >= f) {
                size = (int) f;
            }
        }
        setMeasuredDimension(size, paddingTop);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo151115b();
    }

    public final void setEffect(C105932a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f315234p = aVar;
    }

    public final void setText(String str) {
        if (!C87412m.m108589b(this.f315226e, str)) {
            if (str == null) {
                str = "";
            }
            this.f315226e = str;
            mo151114a();
            this.f315234p.stop();
            scrollTo(0, 0);
            mo151115b();
        }
    }

    public final void setTextBold(boolean z) {
        this.f315225d.setFakeBoldText(z);
    }

    public final void setTextColor(int i) {
        if (this.f315225d.getColor() != i) {
            this.f315225d.setColor(i);
            invalidate();
        }
    }

    public final void setTextSize(float f) {
        if (!(this.f315225d.getTextSize() == f)) {
            this.f315225d.setTextSize(f);
            mo151114a();
            mo151115b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvMarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f315225d = new Paint(1);
        this.f315226e = "";
        this.f315230i = new Scroller(context, new LinearInterpolator());
        this.f315232n = true;
        C105936d dVar = new C105936d(this);
        this.f315233o = dVar;
        this.f315234p = new C105933b(dVar);
        this.f315229h = ((float) 4) * ((float) C76577a.m92151b(context, 8));
    }
}
