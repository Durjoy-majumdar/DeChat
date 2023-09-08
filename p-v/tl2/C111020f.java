package tl2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.scanner.model.ScanPoint;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import sx3.C110818d0;
import sx3.C110823p;
import tl2.C111016c;

/* renamed from: tl2.f */
public final class C111020f implements C111016c {

    /* renamed from: a */
    public final C111018d f332480a;

    /* renamed from: b */
    public float f332481b;

    /* renamed from: c */
    public final ValueAnimator f332482c;

    /* renamed from: d */
    public final ValueAnimator f332483d;

    /* renamed from: e */
    public Paint f332484e;

    /* renamed from: f */
    public AnimatorSet f332485f;

    /* renamed from: g */
    public C111022b f332486g = new C111022b(this);

    /* renamed from: h */
    public C111016c.C111017a f332487h;

    /* renamed from: i */
    public int f332488i;

    /* renamed from: j */
    public ArrayList<ScanPoint> f332489j = new ArrayList<>();

    /* renamed from: k */
    public int f332490k;

    /* renamed from: l */
    public int f332491l;

    /* renamed from: m */
    public boolean f332492m;

    /* renamed from: n */
    public long f332493n = 700;

    /* renamed from: tl2.f$a */
    public static final class C111021a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C111020f f332494d;

        public C111021a(C111020f fVar) {
            this.f332494d = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (floatValue <= 0.0f) {
                this.f332494d.f332484e.setAlpha((int) ((floatValue + 1.0f) * ((float) 255)));
            } else {
                this.f332494d.f332484e.setAlpha((int) ((1.0f - floatValue) * ((float) 255)));
            }
            this.f332494d.f332480a.mo151668a();
        }
    }

    /* renamed from: tl2.f$b */
    public static final class C111022b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C111020f f332495d;

        public C111022b(C111020f fVar) {
            this.f332495d = fVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f332495d.f332492m = false;
        }

        public void onAnimationEnd(Animator animator) {
            C111020f fVar = this.f332495d;
            fVar.f332492m = false;
            C111016c.C111017a aVar = fVar.f332487h;
            if (aVar != null) {
                aVar.mo162697a(fVar);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            C111020f fVar = this.f332495d;
            fVar.f332492m = true;
            C111016c.C111017a aVar = fVar.f332487h;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
        }
    }

    /* renamed from: tl2.f$c */
    public static final class C111023c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C111020f f332496d;

        public C111023c(C111020f fVar) {
            this.f332496d = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C111020f fVar = this.f332496d;
            fVar.f332481b = floatValue;
            fVar.f332480a.mo151668a();
        }
    }

    public C111020f(Context context, C111018d dVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(dVar, "dotsView");
        this.f332480a = dVar;
        float dimension = context.getResources().getDimension(C0966R.dimen.alq);
        this.f332481b = dimension;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, dimension});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C111023c(this));
        this.f332482c = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{-1.0f, 1.0f});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new C111021a(this));
        this.f332483d = ofFloat2;
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(C0966R.color.f2975b6));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f332484e = paint;
    }

    /* renamed from: a */
    public boolean mo162699a() {
        return this.f332492m;
    }

    /* renamed from: b */
    public void mo162700b(ScanPoint[] scanPointArr, int i) {
        C87412m.m108594g(scanPointArr, "points");
        this.f332488i = i;
        for (int i2 = 0; i2 < i; i2++) {
            ScanPoint scanPoint = (ScanPoint) C110823p.m150982H(scanPointArr, i2);
            ScanPoint scanPoint2 = (ScanPoint) C110818d0.m150917O(this.f332489j, i2);
            if (scanPoint2 == null) {
                scanPoint2 = new ScanPoint();
                this.f332489j.add(scanPoint2);
            }
            scanPoint2.setXFactor(scanPoint != null ? scanPoint.getXFactor() : 0.0f);
            scanPoint2.setYFactor(scanPoint != null ? scanPoint.getYFactor() : 0.0f);
            scanPoint2.setX(0.0f);
            scanPoint2.setY(0.0f);
        }
    }

    /* renamed from: c */
    public void mo162701c(C111016c.C111017a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Log.m105927v("MicroMsg.ScanAnimationDotsGroupView", "alvinluo startAnimation %d", Integer.valueOf(hashCode()));
        this.f332487h = aVar;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f332485f = animatorSet;
        animatorSet.setDuration(this.f332493n);
        animatorSet.removeAllListeners();
        animatorSet.addListener(this.f332486g);
        animatorSet.playTogether(new Animator[]{this.f332482c, this.f332483d});
        animatorSet.start();
    }

    /* renamed from: d */
    public void mo162702d(int i, int i2, boolean z) {
        Log.m105927v("MicroMsg.ScanAnimationDotsGroupView", "alvinluo setViewSize width: %d, height: %d, forceUpdateDotsCenter: %b", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        boolean z2 = ((this.f332490k == i && this.f332491l == i2 && !z) || i == 0 || i2 == 0) ? false : true;
        this.f332490k = i;
        this.f332491l = i2;
        if (z2) {
            int i3 = this.f332488i;
            for (int i4 = 0; i4 < i3; i4++) {
                ScanPoint scanPoint = (ScanPoint) C110818d0.m150917O(this.f332489j, i4);
                if (scanPoint == null) {
                    scanPoint = new ScanPoint();
                    this.f332489j.add(scanPoint);
                }
                scanPoint.setX(((float) i) * scanPoint.getXFactor());
                scanPoint.setY(((float) i2) * scanPoint.getYFactor());
                Log.m105919d("MicroMsg.ScanAnimationDotsGroupView", "alvinluo onViewSizeChanged i: %d, %f, %f", Integer.valueOf(i4), Float.valueOf(scanPoint.getX()), Float.valueOf(scanPoint.getY()));
            }
        }
    }

    /* renamed from: e */
    public void mo162703e(Canvas canvas) {
        if (this.f332492m) {
            int i = 0;
            int i2 = this.f332488i;
            while (i < i2) {
                ScanPoint scanPoint = (ScanPoint) C110818d0.m150917O(this.f332489j, i);
                if (scanPoint != null) {
                    if (canvas != null) {
                        canvas.drawCircle(scanPoint.getX(), scanPoint.getY(), this.f332481b, this.f332484e);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void release() {
        this.f332488i = 0;
        this.f332489j.clear();
    }

    public void setDuration(long j) {
        this.f332493n = j;
    }

    public void stopAnimation() {
        Log.m105926v("MicroMsg.ScanAnimationDotsGroupView", "alvinluo stopAnimation");
        AnimatorSet animatorSet = this.f332485f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
