package com.tencent.p014mm.p136ui.widget;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.p136ui.widget.cropview.DragExitCropLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.TouchableLayout;
import fy3.C32224a;
import fy3.C32226l;
import go3.C107868c0;
import go3.C8370d0;
import gy3.C59741c0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C109752f;
import po3.C110244n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sn0.C90259e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003IJKB\u001b\b\u0016\u0012\u0006\u0010A\u001a\u00020@\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010EB#\b\u0016\u0012\u0006\u0010A\u001a\u00020@\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bD\u0010HR\u001b\u0010\n\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\"\u0010 \u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0002¢\u0006\f\n\u0004\b2\u0010\u0007\u001a\u0004\b3\u00104R$\u0010;\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u0010\t\"\u0004\b9\u0010:R\"\u0010?\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010\r\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010\u0011¨\u0006L"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/TouchMediaPreviewLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "Landroid/view/GestureDetector$OnGestureListener;", "Landroid/view/GestureDetector$OnDoubleTapListener;", "Landroid/view/View;", "d", "Lrx3/g;", "getBackgroundView", "()Landroid/view/View;", "backgroundView", "", "g", "Z", "isPreViewMode", "()Z", "setPreViewMode", "(Z)V", "Lcom/tencent/mm/ui/widget/TouchMediaPreviewLayout$c;", "o", "Lcom/tencent/mm/ui/widget/TouchMediaPreviewLayout$c;", "getScaleListener", "()Lcom/tencent/mm/ui/widget/TouchMediaPreviewLayout$c;", "setScaleListener", "(Lcom/tencent/mm/ui/widget/TouchMediaPreviewLayout$c;)V", "scaleListener", "p", "isEnable", "setEnable", "q", "getInScaleAnimation", "setInScaleAnimation", "inScaleAnimation", "Lcom/tencent/mm/ui/widget/TouchMediaPreviewLayout$b;", "r", "Lcom/tencent/mm/ui/widget/TouchMediaPreviewLayout$b;", "getLongPressListener", "()Lcom/tencent/mm/ui/widget/TouchMediaPreviewLayout$b;", "setLongPressListener", "(Lcom/tencent/mm/ui/widget/TouchMediaPreviewLayout$b;)V", "longPressListener", "Lcom/tencent/mm/ui/widget/TouchMediaPreviewLayout$a;", "s", "Lcom/tencent/mm/ui/widget/TouchMediaPreviewLayout$a;", "getDoubleTapListener", "()Lcom/tencent/mm/ui/widget/TouchMediaPreviewLayout$a;", "setDoubleTapListener", "(Lcom/tencent/mm/ui/widget/TouchMediaPreviewLayout$a;)V", "doubleTapListener", "Landroid/view/GestureDetector;", "t", "getTouchDetector", "()Landroid/view/GestureDetector;", "touchDetector", "z", "Landroid/view/View;", "getTouchView", "setTouchView", "(Landroid/view/View;)V", "touchView", "B", "getAddTouchView", "setAddTouchView", "addTouchView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.TouchMediaPreviewLayout */
public class TouchMediaPreviewLayout extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* renamed from: A */
    public boolean f319198A;

    /* renamed from: B */
    public boolean f319199B;

    /* renamed from: C */
    public boolean f319200C;

    /* renamed from: d */
    public final C13601g f319201d = C36568h.m40985a(new C7042e(this));

    /* renamed from: e */
    public MotionEvent f319202e;

    /* renamed from: f */
    public MotionEvent f319203f;

    /* renamed from: g */
    public boolean f319204g = true;

    /* renamed from: h */
    public boolean f319205h;

    /* renamed from: i */
    public boolean f319206i;

    /* renamed from: j */
    public boolean f319207j;

    /* renamed from: n */
    public ScaleGestureDetector f319208n = new ScaleGestureDetector(getContext(), this);

    /* renamed from: o */
    public C97277c f319209o;

    /* renamed from: p */
    public boolean f319210p = true;

    /* renamed from: q */
    public boolean f319211q;

    /* renamed from: r */
    public C97276b f319212r;

    /* renamed from: s */
    public C97275a f319213s;

    /* renamed from: t */
    public final C13601g f319214t = C36568h.m40985a(new C7043h(this));

    /* renamed from: u */
    public boolean f319215u;

    /* renamed from: v */
    public final DragExitCropLayout f319216v;

    /* renamed from: w */
    public ViewGroup f319217w;

    /* renamed from: x */
    public ViewGroup.LayoutParams f319218x;

    /* renamed from: y */
    public int f319219y;

    /* renamed from: z */
    public View f319220z;

    /* renamed from: com.tencent.mm.ui.widget.TouchMediaPreviewLayout$e */
    public static final class C7042e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TouchMediaPreviewLayout f24826d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7042e(TouchMediaPreviewLayout touchMediaPreviewLayout) {
            super(0);
            this.f24826d = touchMediaPreviewLayout;
        }

        public Object invoke() {
            View view = new View(this.f24826d.getContext());
            TouchMediaPreviewLayout touchMediaPreviewLayout = this.f24826d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$backgroundView$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$backgroundView$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setBackgroundColor(0);
            touchMediaPreviewLayout.addView(view, 1, new FrameLayout.LayoutParams(-1, -1));
            return view;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.TouchMediaPreviewLayout$h */
    public static final class C7043h extends C87413o implements C32224a<GestureDetector> {

        /* renamed from: d */
        public final /* synthetic */ TouchMediaPreviewLayout f24827d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7043h(TouchMediaPreviewLayout touchMediaPreviewLayout) {
            super(0);
            this.f24827d = touchMediaPreviewLayout;
        }

        public Object invoke() {
            return new GestureDetector(this.f24827d.getContext(), this.f24827d);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.TouchMediaPreviewLayout$a */
    public interface C97275a {
        void onDoubleTap(float f, float f2);
    }

    /* renamed from: com.tencent.mm.ui.widget.TouchMediaPreviewLayout$b */
    public interface C97276b {
        /* renamed from: a */
        void mo132739a();
    }

    /* renamed from: com.tencent.mm.ui.widget.TouchMediaPreviewLayout$c */
    public interface C97277c extends ScaleGestureDetector.OnScaleGestureListener {
    }

    /* renamed from: com.tencent.mm.ui.widget.TouchMediaPreviewLayout$d */
    public static final class C97278d extends C87413o implements C32226l<Matrix, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ float f285522d;

        /* renamed from: e */
        public final /* synthetic */ float f285523e;

        /* renamed from: f */
        public final /* synthetic */ TouchMediaPreviewLayout f285524f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97278d(float f, float f2, TouchMediaPreviewLayout touchMediaPreviewLayout) {
            super(1);
            this.f285522d = f;
            this.f285523e = f2;
            this.f285524f = touchMediaPreviewLayout;
        }

        public Object invoke(Object obj) {
            Matrix matrix = (Matrix) obj;
            C87412m.m108594g(matrix, LocaleUtil.ITALIAN);
            matrix.postTranslate(this.f285522d, this.f285523e);
            this.f285524f.f319198A = true;
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.TouchMediaPreviewLayout$f */
    public static final class C106767f implements CropLayout.C106806d {

        /* renamed from: a */
        public final /* synthetic */ TouchMediaPreviewLayout f319221a;

        public C106767f(TouchMediaPreviewLayout touchMediaPreviewLayout) {
            this.f319221a = touchMediaPreviewLayout;
        }

        /* renamed from: a */
        public void mo153943a() {
            this.f319221a.setInScaleAnimation(false);
            this.f319221a.f319205h = true;
        }

        /* renamed from: b */
        public void mo153944b() {
            this.f319221a.setInScaleAnimation(true);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.TouchMediaPreviewLayout$g */
    public static final class C106768g extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TouchMediaPreviewLayout f319222d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106768g(TouchMediaPreviewLayout touchMediaPreviewLayout) {
            super(1);
            this.f319222d = touchMediaPreviewLayout;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            TouchMediaPreviewLayout touchMediaPreviewLayout = this.f319222d;
            touchMediaPreviewLayout.f319215u = false;
            touchMediaPreviewLayout.setInScaleAnimation(false);
            C97277c scaleListener = this.f319222d.getScaleListener();
            if (scaleListener != null) {
                scaleListener.onScaleEnd(this.f319222d.f319208n);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchMediaPreviewLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        DragExitCropLayout dragExitCropLayout = new DragExitCropLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        dragExitCropLayout.setLayoutParams(layoutParams);
        dragExitCropLayout.setTag("TouchMediaPreviewLayout");
        dragExitCropLayout.setEnableTouch(false);
        dragExitCropLayout.setHasBorder(false);
        dragExitCropLayout.setEnableOverScroll(false);
        dragExitCropLayout.setEnableDragExit(true);
        dragExitCropLayout.setBackgroundColor(dragExitCropLayout.getContext().getResources().getColor(17170445));
        this.f319216v = dragExitCropLayout;
        int i = getContext().getResources().getDisplayMetrics().heightPixels;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(mo153910d(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16711936);
    }

    /* access modifiers changed from: private */
    public final View getBackgroundView() {
        return (View) this.f319201d.getValue();
    }

    private final GestureDetector getTouchDetector() {
        return (GestureDetector) this.f319214t.getValue();
    }

    /* renamed from: b */
    public final void mo153908b(View view) {
        C87412m.m108594g(view, "touchView");
        if (!this.f319199B) {
            this.f319220z = view;
            this.f319199B = true;
            Rect rect = new Rect();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
            Rect rect2 = new Rect();
            int[] iArr2 = new int[2];
            getLocationOnScreen(iArr2);
            int i2 = iArr2[0];
            rect2.set(i2, iArr2[1], getWidth() + i2, iArr2[1] + getHeight());
            float centerX = (float) (rect.centerX() - rect2.centerX());
            float centerY = (float) (rect.centerY() - rect2.centerY());
            ViewParent parent = view.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f319217w = (ViewGroup) parent;
            this.f319218x = view.getLayoutParams();
            ViewGroup viewGroup = this.f319217w;
            this.f319219y = viewGroup != null ? viewGroup.indexOfChild(view) : 0;
            this.f319216v.setBgView(getBackgroundView());
            ViewParent parent2 = this.f319216v.getParent();
            if (parent2 != null) {
                ((ViewGroup) parent2).removeView(this.f319216v);
            }
            ViewGroup viewGroup2 = this.f319217w;
            if (viewGroup2 != null) {
                viewGroup2.removeView(view);
                viewGroup2.addView(this.f319216v, 0);
            }
            this.f319216v.setMinScaleFactor(1.0f);
            this.f319216v.mo154438D(view, view.getWidth(), view.getHeight(), new Matrix(), CropLayout.C97279e.CENTER_INSIDE, new C97278d(centerX, centerY, this));
        }
    }

    /* renamed from: c */
    public final void mo153909c(View view) {
        C87412m.m108594g(view, "view");
        ViewGroup viewGroup = (ViewGroup) view;
        View childAt = viewGroup.getChildAt(0);
        viewGroup.removeView(childAt);
        addView(childAt, 0);
        viewGroup.addView(this, 0);
    }

    /* renamed from: d */
    public final float mo153910d(float f) {
        return TypedValue.applyDimension(1, f, getContext().getResources().getDisplayMetrics());
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C87412m.m108594g(motionEvent2, "ev");
        if (!this.f319210p) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            TouchableLayout.f24959d = (int) motionEvent.getRawX();
            TouchableLayout.f24960e = (int) motionEvent.getRawY();
        }
        this.f319208n.onTouchEvent(motionEvent2);
        GestureDetector touchDetector = getTouchDetector();
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent2);
        C117292a.m165358d(touchDetector, aVar.mo10232b(), "com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean z = false;
        C117292a.m165360f(touchDetector, touchDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        this.f319202e = motionEvent2;
        if (motionEvent.getAction() == 0) {
            Log.m105924i("TouchMediaPreviewLayout", "[dispatchTouchEvent] down... visibility=" + getVisibility() + " isCanScale=" + this.f319205h + " isInitFinish=" + this.f319198A);
            this.f319203f = MotionEvent.obtain(motionEvent);
        }
        if (!this.f319205h && (motionEvent.getAction() & 255) == 5 && motionEvent.getPointerCount() == 2) {
            ScaleGestureDetector scaleGestureDetector = this.f319208n;
            C97277c cVar = this.f319209o;
            boolean z2 = cVar != null && cVar.onScaleBegin(scaleGestureDetector);
            if (z2) {
                getBackgroundView().setTag(Boolean.TRUE);
                View backgroundView = getBackgroundView();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(0.0f));
                View view = backgroundView;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "onTouchScaleBegin", "(Landroid/view/ScaleGestureDetector;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                backgroundView.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "onTouchScaleBegin", "(Landroid/view/ScaleGestureDetector;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View backgroundView2 = getBackgroundView();
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view2 = backgroundView2;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "onTouchScaleBegin", "(Landroid/view/ScaleGestureDetector;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                backgroundView2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "onTouchScaleBegin", "(Landroid/view/ScaleGestureDetector;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            Log.m105924i("TouchMediaPreviewLayout", "onTouchScaleBegin result=" + z2);
            this.f319205h = z2;
            if (z2) {
                MotionEvent obtain = MotionEvent.obtain(this.f319202e);
                obtain.setAction(3);
                super.dispatchTouchEvent(obtain);
            }
        }
        if (motionEvent.getPointerCount() == 1) {
            if (motionEvent.getAction() == 0) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 1 && this.f319206i) {
                this.f319206i = false;
                return super.dispatchTouchEvent(motionEvent);
            } else if (this.f319216v.mo154465q()) {
                if (motionEvent.getAction() == 2) {
                    CropLayout.m144359E(this.f319216v, (Animator.AnimatorListener) null, 1, (Object) null);
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        if (!this.f319205h) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 6 || motionEvent.getAction() == 262 || motionEvent.getAction() == 1) {
            if (this.f319216v.getContentViewScale()[0] >= 1.2f) {
                z = true;
            }
            this.f319204g = z;
            Log.m105924i("TouchMediaPreviewLayout", "[onTouchScaleEnd] isPreViewMode=" + this.f319204g + " isCanScale=" + this.f319205h + " isInitFinish=" + this.f319198A);
            float x = motionEvent.getX();
            MotionEvent motionEvent3 = this.f319203f;
            C87412m.m108591d(motionEvent3);
            if ((Math.abs(x - motionEvent3.getX()) >= 5.0f || this.f319207j) && this.f319204g) {
                this.f319216v.mo82325c(motionEvent2);
            } else {
                mo153914f();
            }
        }
        return true;
    }

    public void draw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.draw(canvas);
    }

    /* renamed from: e */
    public final void mo153913e(float f, float f2) {
        if (!this.f319211q) {
            float f3 = this.f319216v.getContentViewScale()[0];
            this.f319211q = true;
            if (f3 > 1.0f) {
                mo153914f();
                return;
            }
            this.f319207j = true;
            DragExitCropLayout dragExitCropLayout = this.f319216v;
            dragExitCropLayout.setMaxScaleValue(5.0f);
            float f4 = dragExitCropLayout.getContentViewScale()[0];
            C59741c0 c0Var = new C59741c0();
            c0Var.f170634d = dragExitCropLayout.f319593U0;
            if (f4 > 1.0f) {
                c0Var.f170634d = 1.0f;
            }
            if (dragExitCropLayout.getContentRectF().isEmpty()) {
                dragExitCropLayout.requestLayout();
                dragExitCropLayout.post(new C110244n(dragExitCropLayout, c0Var, f, f2));
                return;
            }
            dragExitCropLayout.mo154435A(c0Var.f170634d, dragExitCropLayout.getContentViewScale()[0], f, f2);
        }
    }

    /* renamed from: f */
    public final void mo153914f() {
        Log.m105924i("TouchMediaPreviewLayout", "revertViewTo isReverting=" + this.f319215u);
        if (!this.f319215u) {
            this.f319215u = true;
            this.f319204g = false;
            C106768g gVar = new C106768g(this);
            Log.m105925i("TouchMediaPreviewLayout", "removeTouchView, isRemoving:%s, stack:%s", Boolean.valueOf(this.f319200C), Util.getStack());
            if (!this.f319200C) {
                float alpha = getBackgroundView().getAlpha();
                this.f319200C = true;
                this.f319199B = false;
                this.f319216v.mo154439F(new C107868c0(this, gVar), new C8370d0(this, alpha));
            }
        }
    }

    public final boolean getAddTouchView() {
        return this.f319199B;
    }

    public final C97275a getDoubleTapListener() {
        return this.f319213s;
    }

    public final boolean getInScaleAnimation() {
        return this.f319211q;
    }

    public final C97276b getLongPressListener() {
        return this.f319212r;
    }

    public final C97277c getScaleListener() {
        return this.f319209o;
    }

    public final View getTouchView() {
        return this.f319220z;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f319216v.getContentViewScale()[0] > 1.0f) {
            mo153914f();
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        Log.m105924i("TouchMediaPreviewLayout", "onDoubleTap!!");
        if (this.f319211q) {
            C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return true;
        }
        C97275a aVar = this.f319213s;
        if (aVar != null) {
            aVar.onDoubleTap(C109752f.m149072b(motionEvent, 0), C109752f.m149073c(motionEvent, 0));
        }
        this.f319216v.setOnScaleListener(new C106767f(this));
        C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        C87412m.m108591d(motionEvent);
        Log.m105925i("TouchMediaPreviewLayout", "onDoubleTapEvent!! action:%s, scale:%s", Integer.valueOf(motionEvent.getAction()), Float.valueOf(this.f319216v.getContentViewScale()[0]));
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        if (!this.f319198A) {
            return true;
        }
        this.f319216v.onDown(motionEvent);
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        if (!this.f319198A || !this.f319204g) {
            return true;
        }
        this.f319216v.onFling(motionEvent, motionEvent2, f, f2);
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C97276b bVar = this.f319212r;
        if (bVar != null) {
            bVar.mo132739a();
        }
        Log.m105924i("TouchMediaPreviewLayout", "onLongPress!");
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C87412m.m108594g(scaleGestureDetector, "detector");
        if (!this.f319198A || !this.f319205h) {
            return true;
        }
        this.f319216v.onScale(scaleGestureDetector);
        C97277c cVar = this.f319209o;
        if (cVar != null) {
            cVar.onScale(scaleGestureDetector);
        }
        if (C87412m.m108589b(getBackgroundView().getTag(), Boolean.TRUE)) {
            getBackgroundView().animate().cancel();
        }
        View backgroundView = getBackgroundView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf((this.f319216v.getContentViewScale()[0] - 1.0f) / 0.20000005f));
        C117292a.m165358d(backgroundView, aVar.mo10232b(), "com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "onTouchScale", "(Landroid/view/ScaleGestureDetector;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        backgroundView.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(backgroundView, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "onTouchScale", "(Landroid/view/ScaleGestureDetector;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C87412m.m108594g(scaleGestureDetector, "detector");
        return this.f319205h;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C87412m.m108594g(scaleGestureDetector, "detector");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        Log.m105924i("TouchMediaPreviewLayout", "onScroll isCanScale=" + this.f319205h + ", isInitFinish=" + this.f319198A);
        if (!this.f319205h || !this.f319198A) {
            return true;
        }
        this.f319216v.onScroll(motionEvent, motionEvent2, f, f2);
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C87412m.m108594g(motionEvent, "e");
        Log.m105924i("TouchMediaPreviewLayout", "onSingleTapUp!!");
        this.f319206i = true;
        C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f319205h) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAddTouchView(boolean z) {
        this.f319199B = z;
    }

    public final void setDoubleTapListener(C97275a aVar) {
        this.f319213s = aVar;
    }

    public final void setEnable(boolean z) {
        this.f319210p = z;
    }

    public final void setInScaleAnimation(boolean z) {
        this.f319211q = z;
    }

    public final void setLongPressListener(C97276b bVar) {
        this.f319212r = bVar;
    }

    public final void setPreViewMode(boolean z) {
        this.f319204g = z;
    }

    public final void setScaleListener(C97277c cVar) {
        this.f319209o = cVar;
    }

    public final void setTouchView(View view) {
        this.f319220z = view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchMediaPreviewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        DragExitCropLayout dragExitCropLayout = new DragExitCropLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        dragExitCropLayout.setLayoutParams(layoutParams);
        dragExitCropLayout.setTag("TouchMediaPreviewLayout");
        dragExitCropLayout.setEnableTouch(false);
        dragExitCropLayout.setHasBorder(false);
        dragExitCropLayout.setEnableOverScroll(false);
        dragExitCropLayout.setEnableDragExit(true);
        dragExitCropLayout.setBackgroundColor(dragExitCropLayout.getContext().getResources().getColor(17170445));
        this.f319216v = dragExitCropLayout;
        int i = getContext().getResources().getDisplayMetrics().heightPixels;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(mo153910d(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16711936);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchMediaPreviewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        DragExitCropLayout dragExitCropLayout = new DragExitCropLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        dragExitCropLayout.setLayoutParams(layoutParams);
        dragExitCropLayout.setTag("TouchMediaPreviewLayout");
        dragExitCropLayout.setEnableTouch(false);
        dragExitCropLayout.setHasBorder(false);
        dragExitCropLayout.setEnableOverScroll(false);
        dragExitCropLayout.setEnableDragExit(true);
        dragExitCropLayout.setBackgroundColor(dragExitCropLayout.getContext().getResources().getColor(17170445));
        this.f319216v = dragExitCropLayout;
        int i2 = getContext().getResources().getDisplayMetrics().heightPixels;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(mo153910d(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16711936);
    }
}
