package com.tencent.maas.handlebox.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.maas.base.Rect2;
import com.tencent.maas.base.Vec2;
import com.tencent.maas.handlebox.MJHandleBoxTouchHelper;
import com.tencent.maas.handlebox.MJHandleBoxUtilsKt;
import com.tencent.maas.handlebox.protocol.MJHandlerBoxListener;
import com.tencent.maas.instamovie.MJMovieSession;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p1134md.a$$a;
import p1134md.a$$b;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001A\u0018\u0000 P2\u00020\u0001:\u0001PB'\b\u0007\u0012\u0006\u0010J\u001a\u00020I\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010K\u0012\b\b\u0002\u0010M\u001a\u00020!¢\u0006\u0004\bN\u0010OJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\bJ&\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0004R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002XD¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010)R\u0014\u0010/\u001a\u00020!8\u0002XD¢\u0006\u0006\n\u0004\b/\u0010#R\"\u00101\u001a\u0002008\u0006@\u0006X.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010DR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010DR\u0016\u0010E\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010\u001cR\u0014\u0010G\u001a\u00020F8\u0002XD¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006Q"}, mo182094d2 = {"Lcom/tencent/maas/handlebox/view/RenderViewContainer;", "Landroid/widget/FrameLayout;", "", "milliseconds", "Lrx3/b0;", "vibrate", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "Lcom/tencent/maas/base/Rect2;", "rect", "Lcom/tencent/maas/base/Vec2;", "scale", "", "rotation", "showBorder", "show", "showVerticalGuideLine", "showHorizontalGuideLine", "", "lt", "lb", "rt", "rb", "updateCornerPosView", "clearBorder", "vibrateTimeMills", "J", "getVibrateTimeMills", "()J", "setVibrateTimeMills", "(J)V", "", "guideLineWidth", "I", "Landroid/widget/ImageView;", "borderView", "Landroid/widget/ImageView;", "Landroid/view/View;", "ltView", "Landroid/view/View;", "lbView", "rtView", "rbView", "centerVerticalLine", "centerHorizontalLine", "cornerPointSize", "Lcom/tencent/maas/instamovie/MJMovieSession;", "movieSession", "Lcom/tencent/maas/instamovie/MJMovieSession;", "getMovieSession", "()Lcom/tencent/maas/instamovie/MJMovieSession;", "setMovieSession", "(Lcom/tencent/maas/instamovie/MJMovieSession;)V", "Lcom/tencent/maas/handlebox/protocol/MJHandlerBoxListener;", "handlerBoxListener", "Lcom/tencent/maas/handlebox/protocol/MJHandlerBoxListener;", "getHandlerBoxListener", "()Lcom/tencent/maas/handlebox/protocol/MJHandlerBoxListener;", "setHandlerBoxListener", "(Lcom/tencent/maas/handlebox/protocol/MJHandlerBoxListener;)V", "Lcom/tencent/maas/handlebox/MJHandleBoxTouchHelper;", "handleBoxTouchHelper", "Lcom/tencent/maas/handlebox/MJHandleBoxTouchHelper;", "com/tencent/maas/handlebox/view/RenderViewContainer$handleBoxTouchHelperListener$1", "handleBoxTouchHelperListener", "Lcom/tencent/maas/handlebox/view/RenderViewContainer$handleBoxTouchHelperListener$1;", "Z", "lastVibrateTimestampMills", "", "showVerticalGuideLineTag", "Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class RenderViewContainer extends FrameLayout {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String TAG = "RenderViewContainer";
    private byte _hellAccFlag_;
    private ImageView borderView;
    private View centerHorizontalLine;
    private View centerVerticalLine;
    private final int cornerPointSize;
    private final int guideLineWidth;
    private MJHandleBoxTouchHelper handleBoxTouchHelper;
    private final RenderViewContainer$handleBoxTouchHelperListener$1 handleBoxTouchHelperListener;
    public MJHandlerBoxListener handlerBoxListener;
    private long lastVibrateTimestampMills;
    private View lbView;
    private View ltView;
    public MJMovieSession movieSession;
    private View rbView;
    private View rtView;
    private boolean showHorizontalGuideLine;
    private boolean showVerticalGuideLine;
    private final String showVerticalGuideLineTag;
    private long vibrateTimeMills;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/maas/handlebox/view/RenderViewContainer$Companion;", "", "()V", "TAG", "", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RenderViewContainer(Context context) {
        this(context, (AttributeSet) null, 0, 6, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RenderViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RenderViewContainer(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    /* renamed from: showHorizontalGuideLine$lambda-7$lambda-6  reason: not valid java name */
    public static final void m168895showHorizontalGuideLine$lambda7$lambda6(RenderViewContainer renderViewContainer) {
        C87412m.m108594g(renderViewContainer, "this$0");
        renderViewContainer.showHorizontalGuideLine(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: showVerticalGuideLine$lambda-3$lambda-2  reason: not valid java name */
    public static final void m168896showVerticalGuideLine$lambda3$lambda2(RenderViewContainer renderViewContainer) {
        C87412m.m108594g(renderViewContainer, "this$0");
        renderViewContainer.showVerticalGuideLine(false);
    }

    private final void vibrate(long j) {
        if (SystemClock.elapsedRealtime() - this.lastVibrateTimestampMills > 200) {
            Object systemService = getContext().getSystemService("vibrator");
            if (systemService != null) {
                ((Vibrator) systemService).vibrate(j);
                this.lastVibrateTimestampMills = SystemClock.elapsedRealtime();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
        }
    }

    public final void clearBorder() {
        ImageView imageView = this.borderView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        showVerticalGuideLine(false);
        showHorizontalGuideLine(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.movieSession == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.handleBoxTouchHelper == null) {
            getMovieSession().createMJHandleBoxTouchHelper(getContext(), new Vec2((float) getWidth(), (float) getHeight()), getHandlerBoxListener(), this.handleBoxTouchHelperListener);
        }
        MJHandleBoxTouchHelper mJHandleBoxTouchHelper = this.handleBoxTouchHelper;
        if (mJHandleBoxTouchHelper != null) {
            mJHandleBoxTouchHelper.dispatchTouchEvent(motionEvent);
            return super.dispatchTouchEvent(motionEvent);
        }
        C87412m.m108603p("handleBoxTouchHelper");
        throw null;
    }

    public final MJHandlerBoxListener getHandlerBoxListener() {
        MJHandlerBoxListener mJHandlerBoxListener = this.handlerBoxListener;
        if (mJHandlerBoxListener != null) {
            return mJHandlerBoxListener;
        }
        C87412m.m108603p("handlerBoxListener");
        throw null;
    }

    public final MJMovieSession getMovieSession() {
        MJMovieSession mJMovieSession = this.movieSession;
        if (mJMovieSession != null) {
            return mJMovieSession;
        }
        C87412m.m108603p("movieSession");
        throw null;
    }

    public final long getVibrateTimeMills() {
        return this.vibrateTimeMills;
    }

    public final void setHandlerBoxListener(MJHandlerBoxListener mJHandlerBoxListener) {
        C87412m.m108594g(mJHandlerBoxListener, "<set-?>");
        this.handlerBoxListener = mJHandlerBoxListener;
    }

    public final void setMovieSession(MJMovieSession mJMovieSession) {
        C87412m.m108594g(mJMovieSession, "<set-?>");
        this.movieSession = mJMovieSession;
    }

    public final void setVibrateTimeMills(long j) {
        this.vibrateTimeMills = j;
    }

    public final void showBorder(Rect2 rect2, Vec2 vec2, float f) {
        C13598b0 b0Var;
        C87412m.m108594g(rect2, "rect");
        C87412m.m108594g(vec2, "scale");
        MJHandleBoxUtilsKt.log(TAG, "showBorder rect origin: " + rect2.getOrigin() + ", size:" + rect2.getSize() + ", scale:" + vec2 + ", rotation:" + f);
        ImageView imageView = this.borderView;
        if (imageView == null) {
            b0Var = null;
        } else {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = (int) rect2.getSize().f309908x;
                layoutParams2.height = (int) rect2.getSize().f309909y;
                layoutParams2.setMargins((int) rect2.getOrigin().f309908x, (int) rect2.getOrigin().f309909y, 0, 0);
                imageView.setLayoutParams(layoutParams2);
                ImageView imageView2 = this.borderView;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                b0Var = C13598b0.f38549a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        if (b0Var == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadii(new float[]{8.0f, 8.0f, 8.0f, 8.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            gradientDrawable.setStroke(3, -16711936);
            ImageView imageView3 = new ImageView(getContext());
            this.borderView = imageView3;
            imageView3.setImageDrawable(gradientDrawable);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) rect2.getSize().f309908x, (int) rect2.getSize().f309909y);
            layoutParams3.setMargins((int) rect2.getOrigin().f309908x, (int) rect2.getOrigin().f309909y, 0, 0);
            addView(this.borderView, layoutParams3);
            ImageView imageView4 = this.borderView;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
        }
        ImageView imageView5 = this.borderView;
        if (imageView5 != null) {
            imageView5.setRotation(-((float) Math.toDegrees((double) f)));
        }
    }

    public final void showHorizontalGuideLine(boolean z) {
        MJHandleBoxUtilsKt.log(TAG, C87412m.m108600m("showHorizontalGuideLine ", Boolean.valueOf(z)));
        if (z) {
            if (!this.showHorizontalGuideLine) {
                vibrate(this.vibrateTimeMills);
            }
            View view = this.centerHorizontalLine;
            Boolean bool = null;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/maas/handlebox/view/RenderViewContainer", "showHorizontalGuideLine", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/maas/handlebox/view/RenderViewContainer", "showHorizontalGuideLine", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = this.centerHorizontalLine;
                if (view2 != null) {
                    bool = Boolean.valueOf(view2.postDelayed(new a$$a(this), 500));
                }
            }
            if (bool == null) {
                View view3 = new View(getContext());
                view3.setBackgroundColor(-16711936);
                C13598b0 b0Var = C13598b0.f38549a;
                this.centerHorizontalLine = view3;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.guideLineWidth);
                layoutParams.setMargins(0, getHeight() / 2, 0, 0);
                addView(this.centerHorizontalLine, layoutParams);
            }
        } else {
            View view4 = this.centerHorizontalLine;
            if (view4 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/maas/handlebox/view/RenderViewContainer", "showHorizontalGuideLine", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/maas/handlebox/view/RenderViewContainer", "showHorizontalGuideLine", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.showHorizontalGuideLine = z;
    }

    public final void showVerticalGuideLine(boolean z) {
        MJHandleBoxUtilsKt.log(TAG, C87412m.m108600m("showVerticalGuideLine ", Boolean.valueOf(z)));
        if (z) {
            if (!this.showVerticalGuideLine) {
                vibrate(this.vibrateTimeMills);
            }
            View view = this.centerVerticalLine;
            Boolean bool = null;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/maas/handlebox/view/RenderViewContainer", "showVerticalGuideLine", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/maas/handlebox/view/RenderViewContainer", "showVerticalGuideLine", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = this.centerVerticalLine;
                if (view2 != null) {
                    bool = Boolean.valueOf(view2.postDelayed(new a$$b(this), 500));
                }
            }
            if (bool == null) {
                View view3 = new View(getContext());
                view3.setBackgroundColor(-16711936);
                C13598b0 b0Var = C13598b0.f38549a;
                this.centerVerticalLine = view3;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.guideLineWidth, -1);
                layoutParams.setMargins(getWidth() / 2, 0, 0, 0);
                addView(this.centerVerticalLine, layoutParams);
            }
        } else {
            View view4 = this.centerVerticalLine;
            if (view4 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/maas/handlebox/view/RenderViewContainer", "showVerticalGuideLine", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/maas/handlebox/view/RenderViewContainer", "showVerticalGuideLine", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.showVerticalGuideLine = z;
    }

    public final void updateCornerPosView(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        C87412m.m108594g(fArr, "lt");
        C87412m.m108594g(fArr2, "lb");
        C87412m.m108594g(fArr3, "rt");
        C87412m.m108594g(fArr4, "rb");
        View view = this.ltView;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.lbView;
        if (view2 != null) {
            removeView(view2);
        }
        View view3 = this.rtView;
        if (view3 != null) {
            removeView(view3);
        }
        View view4 = this.rbView;
        if (view4 != null) {
            removeView(view4);
        }
        View view5 = new View(getContext());
        this.ltView = view5;
        view5.setBackgroundColor(-65536);
        int i = this.cornerPointSize;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.setMargins((int) fArr[0], (int) fArr[1], 0, 0);
        addView(this.ltView, layoutParams);
        View view6 = new View(getContext());
        this.lbView = view6;
        view6.setBackgroundColor(-65536);
        int i2 = this.cornerPointSize;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.setMargins((int) fArr2[0], (int) fArr2[1], 0, 0);
        addView(this.lbView, layoutParams2);
        View view7 = new View(getContext());
        this.rtView = view7;
        view7.setBackgroundColor(-65536);
        int i3 = this.cornerPointSize;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, i3);
        layoutParams3.setMargins((int) fArr3[0], (int) fArr3[1], 0, 0);
        addView(this.rtView, layoutParams3);
        View view8 = new View(getContext());
        this.rbView = view8;
        view8.setBackgroundColor(-65536);
        int i4 = this.cornerPointSize;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i4, i4);
        layoutParams4.setMargins((int) fArr4[0], (int) fArr4[1], 0, 0);
        addView(this.rbView, layoutParams4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RenderViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.vibrateTimeMills = 10;
        this.guideLineWidth = 5;
        this.cornerPointSize = 10;
        this.handleBoxTouchHelperListener = new RenderViewContainer$handleBoxTouchHelperListener$1(this);
        this.showVerticalGuideLineTag = "showVerticalGuideLine";
    }
}
