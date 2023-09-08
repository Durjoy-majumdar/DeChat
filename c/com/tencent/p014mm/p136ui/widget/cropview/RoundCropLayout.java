package com.tencent.p014mm.p136ui.widget.cropview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;
import sn0.C90259e;
import vx3.C90875b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0012\u001a\u0004\u0018\u00010\f¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/cropview/RoundCropLayout;", "Landroid/widget/FrameLayout;", "", "ratio", "Lrx3/b0;", "setCropWidthRatio", "", "width", "setCropWidth", "colorValue", "setCropLineColor", "setCropLayerColor", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "", "filePath", "setImagePath", "getCropBitmap", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.cropview.RoundCropLayout */
public final class RoundCropLayout extends FrameLayout {

    /* renamed from: d */
    public final String f285530d;

    /* renamed from: e */
    public float f285531e;

    /* renamed from: f */
    public int f285532f;

    /* renamed from: g */
    public int f285533g;

    /* renamed from: h */
    public int f285534h;

    /* renamed from: i */
    public int f285535i;

    /* renamed from: j */
    public Paint f285536j;

    /* renamed from: n */
    public Paint f285537n;

    /* renamed from: o */
    public Bitmap f285538o;

    /* renamed from: p */
    public MultiTouchImageView f285539p;

    /* renamed from: q */
    public GestureDetector f285540q;

    /* renamed from: r */
    public ScaleGestureDetector f285541r;

    /* renamed from: com.tencent.mm.ui.widget.cropview.RoundCropLayout$b */
    public final class C57864b implements View.OnTouchListener {

        /* renamed from: d */
        public boolean f165529d;

        public C57864b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/cropview/RoundCropLayout$SimpleTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            Integer valueOf = motionEvent2 != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
            String str = RoundCropLayout.this.f285530d;
            Log.m105918d(str, "action " + valueOf);
            if (valueOf != null && valueOf.intValue() == 0) {
                this.f165529d = false;
            } else if (valueOf != null && valueOf.intValue() == 5 && motionEvent.getPointerCount() == 2) {
                this.f165529d = true;
            }
            RoundCropLayout.this.f285541r.onTouchEvent(motionEvent2);
            if (!this.f165529d) {
                GestureDetector gestureDetector = RoundCropLayout.this.f285540q;
                C9556a aVar = new C9556a();
                aVar.mo10233c(motionEvent2);
                GestureDetector gestureDetector2 = gestureDetector;
                C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/ui/widget/cropview/RoundCropLayout$SimpleTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                C117292a.m165360f(gestureDetector2, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/ui/widget/cropview/RoundCropLayout$SimpleTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            }
            C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/cropview/RoundCropLayout$SimpleTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.RoundCropLayout$a */
    public final class C97281a extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
        public C97281a() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/cropview/RoundCropLayout$ScrollScaleListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/ui/widget/cropview/RoundCropLayout$ScrollScaleListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/cropview/RoundCropLayout$ScrollScaleListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/ui/widget/cropview/RoundCropLayout$ScrollScaleListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/cropview/RoundCropLayout$ScrollScaleListener", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/cropview/RoundCropLayout$ScrollScaleListener", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (scaleGestureDetector == null) {
                return true;
            }
            RoundCropLayout roundCropLayout = RoundCropLayout.this;
            String str = roundCropLayout.f285530d;
            Log.m105918d(str, "onScale scaleFactor " + scaleGestureDetector.getScaleFactor() + " imageScale " + roundCropLayout.f285539p.getScale() + " pivot (" + scaleGestureDetector.getFocusX() + ", " + scaleGestureDetector.getFocusY() + ')');
            roundCropLayout.f285539p.mo26073l(scaleGestureDetector.getScaleFactor() * roundCropLayout.f285539p.getScale(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            Log.m105918d(RoundCropLayout.this.f285530d, "scale begin");
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            Log.m105918d(RoundCropLayout.this.f285530d, "scale end");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent2 == null) {
                return false;
            }
            RoundCropLayout roundCropLayout = RoundCropLayout.this;
            String str = roundCropLayout.f285530d;
            Log.m105918d(str, "distanceX " + f + " distanceY " + f2);
            roundCropLayout.f285539p.mo26056a(-f, -f2);
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/cropview/RoundCropLayout$ScrollScaleListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/ui/widget/cropview/RoundCropLayout$ScrollScaleListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.RoundCropLayout$c */
    public static final class C97282c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f285543d;

        /* renamed from: e */
        public final /* synthetic */ RoundCropLayout f285544e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97282c(String str, RoundCropLayout roundCropLayout) {
            super(0);
            this.f285543d = str;
            this.f285544e = roundCropLayout;
        }

        public Object invoke() {
            Bitmap decodeFile = BitmapUtil.decodeFile(this.f285543d);
            if (decodeFile != null) {
                RoundCropLayout roundCropLayout = this.f285544e;
                roundCropLayout.post(new C97283a(roundCropLayout, decodeFile));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RoundCropLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        C87412m.m108594g(context, "context");
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas != null) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null, 31);
            canvas.drawColor(this.f285535i);
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), ((float) (this.f285532f / 2)) + ((float) this.f285534h), this.f285536j);
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) (this.f285532f / 2), this.f285537n);
            canvas.restoreToCount(saveLayer);
        }
    }

    public final Bitmap getCropBitmap() {
        Bitmap bitmap = this.f285538o;
        if (bitmap == null) {
            return null;
        }
        int width = (getWidth() - this.f285532f) / 2;
        int height = (getHeight() - this.f285532f) / 2;
        Matrix matrix = new Matrix();
        this.f285539p.getImageMatrix().invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, new RectF((float) width, (float) height, (float) (getWidth() - width), (float) (getHeight() - height)));
        String str = this.f285530d;
        Log.m105924i(str, "cropArea " + rectF);
        if (rectF.left < 0.0f) {
            rectF.left = 0.0f;
        }
        if (rectF.top < 0.0f) {
            rectF.top = 0.0f;
        }
        if (rectF.right > ((float) bitmap.getWidth())) {
            rectF.right = (float) bitmap.getWidth();
        }
        if (rectF.bottom > ((float) bitmap.getHeight())) {
            rectF.bottom = (float) bitmap.getHeight();
        }
        String str2 = this.f285530d;
        Log.m105924i(str2, "fix cropArea " + rectF);
        if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return null;
        }
        Bitmap bitmap2 = this.f285538o;
        C87412m.m108591d(bitmap2);
        return Bitmap.createBitmap(bitmap2, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) rectF.height());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f285532f == 0) {
            this.f285532f = (int) (this.f285531e * ((float) getWidth()));
        }
    }

    public final void setBitmap(Bitmap bitmap) {
        this.f285538o = bitmap;
        if (bitmap != null) {
            this.f285539p.setImageBitmap(bitmap);
            MultiTouchImageView multiTouchImageView = this.f285539p;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            multiTouchImageView.f348280o = width;
            multiTouchImageView.f348281p = height;
            this.f285539p.mo26059d();
        }
    }

    public final void setCropLayerColor(int i) {
        this.f285535i = i;
    }

    public final void setCropLineColor(int i) {
        this.f285533g = i;
    }

    public final void setCropWidth(int i) {
        this.f285532f = i;
    }

    public final void setCropWidthRatio(float f) {
        this.f285531e = f;
    }

    public final void setImagePath(String str) {
        C90875b.m113988a(false, false, (ClassLoader) null, (String) null, 0, new C97282c(str, this), 31, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundCropLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f285530d = "MicroMsg.RoundCropLayout";
        this.f285533g = -1;
        this.f285534h = C74942w4.m89784a(getContext(), 1);
        this.f285535i = getResources().getColor(C0966R.color.BW_0_Alpha_0_3);
        this.f285536j = new Paint();
        this.f285537n = new Paint();
        setWillNotDraw(false);
        this.f285536j.setColor(this.f285533g);
        this.f285536j.setStrokeWidth((float) this.f285534h);
        this.f285536j.setAntiAlias(true);
        this.f285536j.setStyle(Paint.Style.STROKE);
        this.f285537n.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        MultiTouchImageView multiTouchImageView = new MultiTouchImageView(context, (AttributeSet) null);
        this.f285539p = multiTouchImageView;
        addView(multiTouchImageView, 0, new FrameLayout.LayoutParams(-1, -1));
        C97281a aVar = new C97281a();
        this.f285540q = new GestureDetector(context, aVar);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, aVar);
        this.f285541r = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(true);
        this.f285539p.setOnTouchListener(new C57864b());
        setCropWidthRatio(0.9f);
    }
}
