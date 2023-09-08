package com.tencent.p014mm.plugin.facedetect.views;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceScanRect */
public class FaceScanRect extends RelativeLayout {

    /* renamed from: d */
    public View f346040d;

    /* renamed from: e */
    public ImageView f346041e;

    /* renamed from: f */
    public ImageView f346042f;

    /* renamed from: g */
    public ImageView f346043g;

    /* renamed from: h */
    public ImageView f346044h;

    /* renamed from: i */
    public ImageView f346045i;

    /* renamed from: j */
    public ImageView f346046j;

    /* renamed from: n */
    public ImageView f346047n;

    /* renamed from: o */
    public ImageView f346048o;

    /* renamed from: p */
    public ImageView[] f346049p;

    /* renamed from: q */
    public ScaleAnimation f346050q;

    /* renamed from: r */
    public ScaleAnimation f346051r;

    /* renamed from: s */
    public ScaleAnimation f346052s;

    /* renamed from: t */
    public ScaleAnimation f346053t;

    /* renamed from: u */
    public TranslateAnimation f346054u;

    /* renamed from: v */
    public C115439b f346055v;

    /* renamed from: w */
    public ViewGroup f346056w;

    /* renamed from: x */
    public View f346057x;

    /* renamed from: y */
    public C115438a f346058y;

    /* renamed from: com.tencent.mm.plugin.facedetect.views.FaceScanRect$a */
    public enum C115438a {
        OPENED,
        CLOSED,
        INIT
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.views.FaceScanRect$b */
    public interface C115439b {
    }

    public FaceScanRect(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo175344a(Animation.AnimationListener animationListener) {
        Animation.AnimationListener animationListener2 = animationListener;
        C115438a aVar = this.f346058y;
        C115438a aVar2 = C115438a.CLOSED;
        if (aVar == aVar2) {
            Log.m105928w("MicroMsg.FaceScanRect", "hy: already closed");
            if (animationListener2 != null) {
                animationListener2.onAnimationEnd((Animation) null);
                return;
            }
            return;
        }
        this.f346058y = aVar2;
        int width = getWidth();
        int height = getHeight();
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.a5i);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0966R.dimen.a5j);
        int i = dimensionPixelSize * 2;
        int i2 = dimensionPixelSize2 * 2;
        float f = (float) dimensionPixelSize2;
        float f2 = ((float) (((width - i) - i2) + dimensionPixelSize2)) / f;
        float f3 = ((float) (((height - i) - i2) + dimensionPixelSize2)) / f;
        Log.m105925i("MicroMsg.FaceScanRect", "hy: horizontalScale : %f, verticalScale : %f", Float.valueOf(f2), Float.valueOf(f3));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f2, 1.0f, 1.0f, 1, 0.0f, 1, 0.0f);
        this.f346050q = scaleAnimation;
        scaleAnimation.setFillAfter(true);
        this.f346050q.setDuration(1500);
        this.f346050q.setInterpolator(getContext(), 17563654);
        this.f346050q.setAnimationListener(animationListener2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, f2, 1.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f346051r = scaleAnimation2;
        scaleAnimation2.setFillAfter(true);
        this.f346051r.setDuration(1500);
        this.f346051r.setInterpolator(getContext(), 17563654);
        float f4 = f3;
        ScaleAnimation scaleAnimation3 = new ScaleAnimation(1.0f, 1.0f, 1.0f, f4, 1, 0.0f, 1, 0.0f);
        this.f346052s = scaleAnimation3;
        scaleAnimation3.setFillAfter(true);
        this.f346052s.setDuration(1500);
        this.f346052s.setInterpolator(getContext(), 17563654);
        ScaleAnimation scaleAnimation4 = new ScaleAnimation(1.0f, 1.0f, 1.0f, f4, 1, 0.0f, 1, 1.0f);
        this.f346053t = scaleAnimation4;
        scaleAnimation4.setFillAfter(true);
        this.f346053t.setDuration(1500);
        this.f346053t.setInterpolator(getContext(), 17563654);
        this.f346041e.startAnimation(this.f346050q);
        this.f346044h.startAnimation(this.f346053t);
        this.f346045i.startAnimation(this.f346052s);
        this.f346048o.startAnimation(this.f346051r);
        View view = this.f346057x;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/facedetect/views/FaceScanRect", "stopScanLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/facedetect/views/FaceScanRect", "stopScanLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f346040d.setBackground((Drawable) null);
        this.f346057x.clearAnimation();
        for (ImageView backgroundColor : this.f346049p) {
            backgroundColor.setBackgroundColor(getResources().getColor(C0966R.color.f3365q0));
        }
    }

    public ViewGroup getCenterHintHolder() {
        return this.f346056w;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C115439b bVar = this.f346055v;
        if (bVar != null) {
            FaceDetectUI.C115429b bVar2 = (FaceDetectUI.C115429b) bVar;
            FaceDetectView faceDetectView = FaceDetectUI.this.f346001q;
            RectF rectF = new RectF((float) FaceDetectUI.this.f346002r.getLeft(), (float) FaceDetectUI.this.f346002r.getTop(), (float) FaceDetectUI.this.f346002r.getRight(), (float) FaceDetectUI.this.f346002r.getBottom());
            FaceDetectDecorView faceDetectDecorView = faceDetectView.f346023e;
            faceDetectDecorView.f197971e = true;
            faceDetectDecorView.f197972f = true;
            faceDetectDecorView.f197973g = rectF;
            faceDetectDecorView.invalidate();
        }
    }

    public void setOnRefreshRectListener(C115439b bVar) {
        this.f346055v = bVar;
    }

    public FaceScanRect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f346040d = null;
        this.f346041e = null;
        this.f346042f = null;
        this.f346043g = null;
        this.f346044h = null;
        this.f346045i = null;
        this.f346046j = null;
        this.f346047n = null;
        this.f346048o = null;
        this.f346049p = null;
        this.f346050q = null;
        this.f346051r = null;
        this.f346052s = null;
        this.f346053t = null;
        this.f346054u = null;
        this.f346055v = null;
        this.f346056w = null;
        this.f346057x = null;
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f359665a60, this, true);
        this.f346040d = findViewById(C0966R.C0970id.cqx);
        this.f346041e = (ImageView) findViewById(C0966R.C0970id.cqv);
        this.f346042f = (ImageView) findViewById(C0966R.C0970id.cqw);
        this.f346043g = (ImageView) findViewById(C0966R.C0970id.cqs);
        this.f346044h = (ImageView) findViewById(C0966R.C0970id.cqr);
        this.f346045i = (ImageView) findViewById(C0966R.C0970id.cqu);
        this.f346046j = (ImageView) findViewById(C0966R.C0970id.cqt);
        this.f346047n = (ImageView) findViewById(C0966R.C0970id.cqp);
        this.f346048o = (ImageView) findViewById(C0966R.C0970id.cqq);
        this.f346057x = findViewById(C0966R.C0970id.cpj);
        this.f346056w = (ViewGroup) findViewById(C0966R.C0970id.cp6);
        this.f346049p = new ImageView[]{this.f346041e, this.f346042f, this.f346043g, this.f346044h, this.f346045i, this.f346046j, this.f346047n, this.f346048o};
        this.f346058y = C115438a.INIT;
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        this.f346054u = translateAnimation;
        translateAnimation.setRepeatCount(-1);
        this.f346054u.setRepeatMode(1);
        this.f346054u.setDuration(1000);
    }
}
