package com.tencent.p014mm.p136ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;
import t40.C77853a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001(B!\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010$\u001a\u00020\t¢\u0006\u0004\b%\u0010&B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b%\u0010'J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006)"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/LiveBottomSheetPanel;", "Landroid/widget/RelativeLayout;", "Landroid/view/View;", "contentView", "Lrx3/b0;", "setContentView", "Landroid/graphics/drawable/Drawable;", "background", "setContentBg", "", "g", "I", "getDirection", "()I", "setDirection", "(I)V", "direction", "", "h", "Z", "isShowing", "()Z", "setShowing", "(Z)V", "Lkotlin/Function1;", "i", "Lfy3/l;", "getOnVisibilityListener", "()Lfy3/l;", "setOnVisibilityListener", "(Lfy3/l;)V", "onVisibilityListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.LiveBottomSheetPanel */
public class LiveBottomSheetPanel extends RelativeLayout {

    /* renamed from: d */
    public final String f165497d;

    /* renamed from: e */
    public int f165498e;

    /* renamed from: f */
    public boolean f165499f;

    /* renamed from: g */
    public int f165500g;

    /* renamed from: h */
    public boolean f165501h;

    /* renamed from: i */
    public C32226l<? super Boolean, C13598b0> f165502i;

    /* renamed from: j */
    public C7039a f165503j;

    /* renamed from: n */
    public Path f165504n;

    /* renamed from: com.tencent.mm.ui.widget.LiveBottomSheetPanel$a */
    public static final class C7039a {

        /* renamed from: a */
        public float f24812a;

        /* renamed from: b */
        public float f24813b;

        /* renamed from: c */
        public float f24814c;

        /* renamed from: d */
        public float f24815d;

        public C7039a(float f, float f2, float f3, float f4) {
            this.f24812a = f;
            this.f24813b = f2;
            this.f24814c = f3;
            this.f24815d = f4;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.LiveBottomSheetPanel$b */
    public static final class C57855b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ LiveBottomSheetPanel f165505d;

        public C57855b(LiveBottomSheetPanel liveBottomSheetPanel) {
            this.f165505d = liveBottomSheetPanel;
        }

        public void onAnimationEnd(Animator animator) {
            C32226l<Boolean, C13598b0> onVisibilityListener;
            LiveBottomSheetPanel liveBottomSheetPanel = this.f165505d;
            boolean z = liveBottomSheetPanel.f165501h;
            liveBottomSheetPanel.setShowing(false);
            if (z && (onVisibilityListener = this.f165505d.getOnVisibilityListener()) != null) {
                onVisibilityListener.invoke(Boolean.FALSE);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.LiveBottomSheetPanel$c */
    public static final class C57856c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ LiveBottomSheetPanel f165506d;

        public C57856c(LiveBottomSheetPanel liveBottomSheetPanel) {
            this.f165506d = liveBottomSheetPanel;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f165506d;
            liveBottomSheetPanel.mo78803b(liveBottomSheetPanel.getTranslationY(), false, false);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.LiveBottomSheetPanel$d */
    public static final class C57857d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ LiveBottomSheetPanel f165507d;

        public C57857d(LiveBottomSheetPanel liveBottomSheetPanel) {
            this.f165507d = liveBottomSheetPanel;
        }

        public void onAnimationEnd(Animator animator) {
            C32226l<Boolean, C13598b0> onVisibilityListener;
            LiveBottomSheetPanel liveBottomSheetPanel = this.f165507d;
            boolean z = liveBottomSheetPanel.f165501h;
            liveBottomSheetPanel.setShowing(false);
            if (z && (onVisibilityListener = this.f165507d.getOnVisibilityListener()) != null) {
                onVisibilityListener.invoke(Boolean.FALSE);
            }
            LiveBottomSheetPanel liveBottomSheetPanel2 = this.f165507d;
            liveBottomSheetPanel2.mo78803b(liveBottomSheetPanel2.getTranslationY(), false, false);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.LiveBottomSheetPanel$e */
    public static final class C57858e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ LiveBottomSheetPanel f165508d;

        public C57858e(LiveBottomSheetPanel liveBottomSheetPanel) {
            this.f165508d = liveBottomSheetPanel;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f165508d;
            liveBottomSheetPanel.mo78803b(liveBottomSheetPanel.getTranslationY(), true, false);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.LiveBottomSheetPanel$f */
    public static final class C57859f extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ LiveBottomSheetPanel f165509d;

        public C57859f(LiveBottomSheetPanel liveBottomSheetPanel) {
            this.f165509d = liveBottomSheetPanel;
        }

        public void onAnimationEnd(Animator animator) {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f165509d;
            liveBottomSheetPanel.mo78803b(liveBottomSheetPanel.getTranslationY(), true, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveBottomSheetPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f165497d = "MicroMsg.LiveBottomSheetPanel";
        this.f165500g = 1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226864j);
            C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…ble.LiveBottomSheetPanel)");
            this.f165500g = obtainStyledAttributes.getInt(0, 1);
            obtainStyledAttributes.recycle();
        }
        View.inflate(context, C0966R.C0971layout.b6j, this);
        setWillNotDraw(false);
        this.f165503j = new C7039a(0.0f, 0.0f, 0.0f, 0.0f);
        this.f165504n = new Path();
    }

    /* renamed from: a */
    public void mo78802a() {
        if (this.f165500g == 0) {
            animate().translationX((float) C75044y4.m89990b(getContext()).x).setListener(new C57855b(this)).start();
        } else {
            animate().translationY((float) C75044y4.m89990b(getContext()).y).setUpdateListener(new C57856c(this)).setListener(new C57857d(this)).start();
        }
    }

    /* renamed from: b */
    public void mo78803b(float f, boolean z, boolean z2) {
    }

    /* renamed from: c */
    public final void mo82284c() {
        if (getWidth() > 0 && getHeight() > 0) {
            C7039a aVar = this.f165503j;
            this.f165504n.reset();
            RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            Path path = this.f165504n;
            float f = aVar.f24812a;
            float f2 = aVar.f24813b;
            float f3 = aVar.f24815d;
            float f4 = aVar.f24814c;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CCW);
            this.f165504n.close();
        }
    }

    /* renamed from: d */
    public void mo78804d() {
        C32226l<? super Boolean, C13598b0> lVar;
        boolean z = this.f165501h;
        this.f165501h = true;
        if (!z && (lVar = this.f165502i) != null) {
            lVar.invoke(Boolean.TRUE);
        }
        Window window = null;
        if (this.f165500g == 0) {
            animate().setListener((Animator.AnimatorListener) null).translationX(0.0f).start();
            Context context = getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                window = activity.getWindow();
            }
            if (window != null) {
                window.getDecorView().setSystemUiVisibility(7942);
                return;
            }
            return;
        }
        animate().setListener((Animator.AnimatorListener) null).translationY(0.0f).setUpdateListener(new C57858e(this)).setListener(new C57859f(this)).start();
    }

    public void draw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        if (this.f165504n.isEmpty()) {
            mo82284c();
        }
        int save = canvas.save();
        canvas.clipPath(this.f165504n);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final int getDirection() {
        return this.f165500g;
    }

    public final C32226l<Boolean, C13598b0> getOnVisibilityListener() {
        return this.f165502i;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo82284c();
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        String str = this.f165497d;
        Log.m105918d(str, "onNestedFling velocityX:" + f + " velocityY:" + f2 + " ViewConfiguration.getMinimumFlingVelocity():" + ViewConfiguration.getMinimumFlingVelocity());
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i > 0) {
            this.f165499f = true;
            mo78804d();
        } else if (i > 0) {
            this.f165499f = true;
            mo78802a();
        }
        return super.onNestedFling(view, f, f2, z);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        String str = this.f165497d;
        Log.m105918d(str, "onNestedPreScroll target:" + view + " dx:" + i + " dy:" + i2);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        Log.m105918d(this.f165497d, "onNestedScroll target:" + view + " dxConsumed:" + i + " dyConsumed:" + i2 + " dxUnconsumed:" + i3 + " dyUnconsumed:" + i4);
        float f = 0.0f;
        if (this.f165500g == 0) {
            this.f165498e += i3;
            float f2 = (float) C75044y4.m89990b(getContext()).x;
            float translationX = getTranslationX() - ((float) i3);
            if (0.0f < translationX) {
                f = translationX;
            }
            if (f2 > f) {
                f2 = f;
            }
            setTranslationX(f2);
        } else {
            this.f165498e += i4;
            float f3 = (float) C75044y4.m89990b(getContext()).y;
            float translationY = getTranslationY() - ((float) i4);
            if (0.0f < translationY) {
                f = translationY;
            }
            if (f3 > f) {
                f3 = f;
            }
            setTranslationY(f3);
        }
        mo78803b(getTranslationY(), false, true);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        String str = this.f165497d;
        Log.m105918d(str, "onStartNestedScroll target:" + view2 + ",nestedScrollAxes:" + i);
        this.f165498e = 0;
        this.f165499f = false;
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        int i;
        if (!this.f165499f && (i = this.f165498e) != 0) {
            if (i > 0) {
                mo78804d();
            } else if (Math.abs(i) > getHeight() / 5) {
                mo78802a();
            } else {
                mo78804d();
            }
        }
        String str = this.f165497d;
        Log.m105918d(str, "onStopNestedScroll child:" + view + ", totalConsumed:" + this.f165498e);
        this.f165498e = 0;
        this.f165499f = false;
    }

    public final void setContentBg(Drawable drawable) {
        setBackground(drawable);
    }

    public final void setContentView(View view) {
        C87412m.m108594g(view, "contentView");
        addView(view);
    }

    public final void setDirection(int i) {
        this.f165500g = i;
    }

    public final void setOnVisibilityListener(C32226l<? super Boolean, C13598b0> lVar) {
        this.f165502i = lVar;
    }

    public final void setShowing(boolean z) {
        this.f165501h = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LiveBottomSheetPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
