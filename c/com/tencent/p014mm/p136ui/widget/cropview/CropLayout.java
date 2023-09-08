package com.tencent.p014mm.p136ui.widget.cropview;

import ai2.C92013g;
import ai2.C92026t;
import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.item.EditorItemContainer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C59741c0;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import po3.C110237g;
import po3.C110238h;
import po3.C110240j;
import po3.C110241k;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\n\u0001\u0001\u0001\u0001\u0001B!\b\u0016\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001B+\b\u0016\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001\u0012\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00107\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\"\u0010?\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u00102\u001a\u0004\b=\u00104\"\u0004\b>\u00106R\"\u0010C\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u00102\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\"\u0010G\u001a\u00020D8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0017\u0010P\u001a\u00020K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010V\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010Y\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010UR\u0017\u0010[\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\b2\u0010S\u001a\u0004\bZ\u0010UR\u0017\u0010^\u001a\u00020K8\u0006¢\u0006\f\n\u0004\b\\\u0010M\u001a\u0004\b]\u0010OR\"\u0010c\u001a\u00020Q8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b_\u0010S\u001a\u0004\b`\u0010U\"\u0004\ba\u0010bR\"\u0010g\u001a\u00020Q8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bd\u0010S\u001a\u0004\be\u0010U\"\u0004\bf\u0010bR$\u0010o\u001a\u0004\u0018\u00010h8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010y\u001a\u00020D8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bx\u0010F\u001a\u0004\by\u0010H\"\u0004\bz\u0010JR1\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020D0{8\u0004@\u0004X\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\"\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00020K8\u0004X\u0004¢\u0006\u000e\n\u0005\b\u0001\u0010M\u001a\u0005\b\u0001\u0010O¨\u0006\u0001"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/cropview/CropLayout;", "Lcom/tencent/mm/ui/widget/cropview/BaseCropLayout;", "", "getRotateDegrees", "getRotate", "", "getMatrixValues", "getContentViewTrans", "getContentViewScale", "Lcom/tencent/mm/ui/widget/cropview/CropLayout$a;", "q", "Lcom/tencent/mm/ui/widget/cropview/CropLayout$a;", "getCropLayoutTouchListener", "()Lcom/tencent/mm/ui/widget/cropview/CropLayout$a;", "setCropLayoutTouchListener", "(Lcom/tencent/mm/ui/widget/cropview/CropLayout$a;)V", "cropLayoutTouchListener", "Lcom/tencent/mm/ui/widget/cropview/CropLayout$b;", "r", "Lcom/tencent/mm/ui/widget/cropview/CropLayout$b;", "getOnChangeListener", "()Lcom/tencent/mm/ui/widget/cropview/CropLayout$b;", "setOnChangeListener", "(Lcom/tencent/mm/ui/widget/cropview/CropLayout$b;)V", "onChangeListener", "Landroid/view/View$OnClickListener;", "s", "Landroid/view/View$OnClickListener;", "getClickListener", "()Landroid/view/View$OnClickListener;", "setClickListener", "(Landroid/view/View$OnClickListener;)V", "clickListener", "Lcom/tencent/mm/ui/widget/cropview/CropLayout$d;", "t", "Lcom/tencent/mm/ui/widget/cropview/CropLayout$d;", "getOnScaleListener", "()Lcom/tencent/mm/ui/widget/cropview/CropLayout$d;", "setOnScaleListener", "(Lcom/tencent/mm/ui/widget/cropview/CropLayout$d;)V", "onScaleListener", "Landroid/graphics/Matrix;", "u", "Landroid/graphics/Matrix;", "getMainMatrix", "()Landroid/graphics/Matrix;", "setMainMatrix", "(Landroid/graphics/Matrix;)V", "mainMatrix", "v", "F", "getMinScaleFactor", "()F", "setMinScaleFactor", "(F)V", "minScaleFactor", "w", "getMaxScaleFactor", "setMaxScaleFactor", "maxScaleFactor", "x", "getMinScaleValue", "setMinScaleValue", "minScaleValue", "y", "getMaxScaleValue", "setMaxScaleValue", "maxScaleValue", "", "A", "Z", "isShouldLayout", "()Z", "setShouldLayout", "(Z)V", "Landroid/graphics/RectF;", "C", "Landroid/graphics/RectF;", "getVisibilityRect", "()Landroid/graphics/RectF;", "visibilityRect", "Landroid/graphics/Rect;", "D", "Landroid/graphics/Rect;", "getWidgetRect", "()Landroid/graphics/Rect;", "widgetRect", "E", "getContentOriginalRect", "contentOriginalRect", "getContentRect", "contentRect", "G", "getContentRectF", "contentRectF", "H", "getContentBaseRect", "setContentBaseRect", "(Landroid/graphics/Rect;)V", "contentBaseRect", "I", "getContentCenterRect", "setContentCenterRect", "contentCenterRect", "Landroid/view/View;", "J", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "contentView", "Lcom/tencent/mm/ui/widget/cropview/CropLayout$e;", "K", "Lcom/tencent/mm/ui/widget/cropview/CropLayout$e;", "getScaleType", "()Lcom/tencent/mm/ui/widget/cropview/CropLayout$e;", "setScaleType", "(Lcom/tencent/mm/ui/widget/cropview/CropLayout$e;)V", "scaleType", "L", "isFirstCancelOrUp", "setFirstCancelOrUp", "Lkotlin/Function1;", "V", "Lfy3/l;", "getInitFinish", "()Lfy3/l;", "setInitFinish", "(Lfy3/l;)V", "initFinish", "W", "getTmpRectF", "tmpRectF", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "d", "e", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout */
public class CropLayout extends BaseCropLayout {

    /* renamed from: y0 */
    public static final /* synthetic */ int f319541y0 = 0;

    /* renamed from: A */
    public boolean f319542A;

    /* renamed from: B */
    public float f319543B = 1.0f;

    /* renamed from: C */
    public final RectF f319544C = new RectF();

    /* renamed from: D */
    public final Rect f319545D = new Rect();

    /* renamed from: E */
    public final Rect f319546E = new Rect();

    /* renamed from: F */
    public final Rect f319547F = new Rect();

    /* renamed from: G */
    public final RectF f319548G = new RectF();

    /* renamed from: H */
    public Rect f319549H = new Rect();

    /* renamed from: I */
    public Rect f319550I = new Rect();

    /* renamed from: J */
    public View f319551J;

    /* renamed from: K */
    public C97279e f319552K = C97279e.CENTER_CROP;

    /* renamed from: L */
    public boolean f319553L = true;

    /* renamed from: M */
    public boolean f319554M;

    /* renamed from: N */
    public boolean f319555N;

    /* renamed from: P */
    public final Matrix f319556P;

    /* renamed from: Q */
    public final float[] f319557Q;

    /* renamed from: R */
    public Animator f319558R;

    /* renamed from: S */
    public final float[] f319559S;

    /* renamed from: T */
    public Animator f319560T;

    /* renamed from: U */
    public Animator f319561U;

    /* renamed from: V */
    public C32226l<? super Matrix, Boolean> f319562V;

    /* renamed from: W */
    public final RectF f319563W;

    /* renamed from: p0 */
    public final float[] f319564p0;

    /* renamed from: q */
    public C106803a f319565q;

    /* renamed from: r */
    public C106804b f319566r;

    /* renamed from: s */
    public View.OnClickListener f319567s;

    /* renamed from: t */
    public C106806d f319568t;

    /* renamed from: u */
    public Matrix f319569u = new Matrix();

    /* renamed from: v */
    public float f319570v = 0.25f;

    /* renamed from: w */
    public float f319571w = 5.0f;

    /* renamed from: x */
    public float f319572x = 1.0f;

    /* renamed from: x0 */
    public float[] f319573x0;

    /* renamed from: y */
    public float f319574y = 1.0f;

    /* renamed from: z */
    public boolean f319575z = true;

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$l */
    public static final class C57863l extends C87413o implements C32226l<Matrix, Boolean> {

        /* renamed from: d */
        public static final C57863l f165528d = new C57863l();

        public C57863l() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((Matrix) obj, LocaleUtil.ITALIAN);
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$e */
    public enum C97279e {
        CENTER_CROP,
        CENTER_INSIDE,
        ALIGN_START
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$f */
    public static final class C97280f extends C87413o implements C32226l<Matrix, Boolean> {

        /* renamed from: d */
        public static final C97280f f285529d = new C97280f();

        public C97280f() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((Matrix) obj, LocaleUtil.ITALIAN);
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$a */
    public interface C106803a {
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$b */
    public interface C106804b {
        void onChange();
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$c */
    public interface C106805c extends C106804b {
        /* renamed from: a */
        void mo154489a();

        /* renamed from: b */
        void mo154490b();
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$d */
    public interface C106806d {
        /* renamed from: a */
        void mo153943a();

        /* renamed from: b */
        void mo153944b();
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$g */
    public static final class C106807g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public float f319576d;

        /* renamed from: e */
        public float f319577e;

        /* renamed from: f */
        public final /* synthetic */ CropLayout f319578f;

        public C106807g(CropLayout cropLayout) {
            this.f319578f = cropLayout;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C87412m.m108594g(valueAnimator, LocaleUtil.ITALIAN);
            Object animatedValue = valueAnimator.getAnimatedValue("transX");
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            Object animatedValue2 = valueAnimator.getAnimatedValue("transY");
            C87412m.m108592e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            float floatValue2 = ((Float) animatedValue2).floatValue();
            int i = CropLayout.f319541y0;
            this.f319578f.mo154488z(this.f319576d - floatValue, this.f319577e - floatValue2, 1);
            this.f319576d = floatValue;
            this.f319577e = floatValue2;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$h */
    public static final class C106808h implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ CropLayout f319579d;

        public C106808h(CropLayout cropLayout) {
            this.f319579d = cropLayout;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            CropLayout.m144359E(this.f319579d, (Animator.AnimatorListener) null, 1, (Object) null);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$i */
    public static final class C106809i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ CropLayout f319580d;

        /* renamed from: e */
        public final /* synthetic */ C59741c0 f319581e;

        public C106809i(CropLayout cropLayout, C59741c0 c0Var) {
            this.f319580d = cropLayout;
            this.f319581e = c0Var;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION);
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            CropLayout.m144362j(this.f319580d, floatValue - this.f319581e.f170634d);
            this.f319581e.f170634d = floatValue;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$j */
    public static final class C106810j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ CropLayout f319582d;

        /* renamed from: e */
        public final /* synthetic */ float f319583e;

        /* renamed from: f */
        public final /* synthetic */ float f319584f;

        public C106810j(CropLayout cropLayout, float f, float f2) {
            this.f319582d = cropLayout;
            this.f319583e = f;
            this.f319584f = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue("scale");
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            CropLayout cropLayout = this.f319582d;
            cropLayout.mo154487y(floatValue / cropLayout.getContentViewScale()[0], this.f319583e, this.f319584f);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$k */
    public static final class C106811k implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ CropLayout f319585d;

        public C106811k(CropLayout cropLayout) {
            this.f319585d = cropLayout;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105924i("CropLayout", "onAnimationEnd!!");
            C106806d onScaleListener = this.f319585d.getOnScaleListener();
            if (onScaleListener != null) {
                onScaleListener.mo153943a();
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            C106806d onScaleListener = this.f319585d.getOnScaleListener();
            if (onScaleListener != null) {
                onScaleListener.mo153944b();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$m */
    public static final class C106812m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C106812m f319586d = new C106812m();

        public C106812m() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$n */
    public static final class C106813n implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ CropLayout f319587d;

        public C106813n(CropLayout cropLayout) {
            this.f319587d = cropLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue("scale");
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            Object animatedValue2 = valueAnimator.getAnimatedValue("transX");
            C87412m.m108592e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            float floatValue2 = ((Float) animatedValue2).floatValue();
            Object animatedValue3 = valueAnimator.getAnimatedValue("transY");
            C87412m.m108592e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
            float floatValue3 = ((Float) animatedValue3).floatValue();
            float[] unused = this.f319587d.getMatrixValues();
            float f = (floatValue * 1.0f) / this.f319587d.getContentViewScale()[0];
            CropLayout cropLayout = this.f319587d;
            cropLayout.f319569u.postScale(f, f, 0.0f, 0.0f);
            cropLayout.mo154485v();
            this.f319587d.mo154441I(-(floatValue2 - this.f319587d.getContentRectF().centerX()), -(floatValue3 - this.f319587d.getContentRectF().centerY()));
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.CropLayout$o */
    public static final class C106814o implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f319588d;

        public C106814o(C32224a<C13598b0> aVar) {
            this.f319588d = aVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f319588d.invoke();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CropLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setBackgroundColor(getContext().getResources().getColor(17170444));
        this.f319556P = new Matrix();
        this.f319557Q = new float[2];
        this.f319559S = new float[2];
        this.f319562V = C97280f.f285529d;
        this.f319563W = new RectF();
        this.f319564p0 = new float[2];
        this.f319573x0 = new float[9];
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [com.tencent.mm.ui.widget.cropview.CropLayout$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m144359E(com.tencent.p014mm.p136ui.widget.cropview.CropLayout r6, android.animation.Animator.AnimatorListener r7, int r8, java.lang.Object r9) {
        /*
            if (r9 != 0) goto L_0x0103
            r9 = 1
            r8 = r8 & r9
            r0 = 0
            if (r8 == 0) goto L_0x0008
            r7 = r0
        L_0x0008:
            android.animation.Animator r8 = r6.f319560T
            if (r8 == 0) goto L_0x000f
            r8.cancel()
        L_0x000f:
            boolean r8 = r6.f165534g
            if (r8 == 0) goto L_0x0015
            goto L_0x0102
        L_0x0015:
            android.graphics.RectF r8 = r6.f319548G
            float r1 = r8.left
            android.graphics.RectF r2 = r6.f319544C
            float r3 = r2.left
            float r1 = r1 - r3
            int r1 = (int) r1
            float r3 = r8.top
            float r4 = r2.top
            float r3 = r3 - r4
            int r3 = (int) r3
            float r4 = r2.right
            float r5 = r8.right
            float r4 = r4 - r5
            int r4 = (int) r4
            float r2 = r2.bottom
            float r8 = r8.bottom
            float r2 = r2 - r8
            int r8 = (int) r2
            boolean r2 = r6.mo154465q()
            r5 = 0
            if (r2 == 0) goto L_0x004e
            if (r1 <= 0) goto L_0x004e
            boolean r2 = r6.mo154467s()
            if (r2 == 0) goto L_0x0041
            goto L_0x006e
        L_0x0041:
            android.graphics.RectF r1 = r6.f319548G
            float r1 = r1.centerX()
            android.graphics.RectF r2 = r6.f319544C
            float r2 = r2.centerX()
            goto L_0x006a
        L_0x004e:
            boolean r1 = r6.mo154465q()
            if (r1 == 0) goto L_0x006d
            if (r4 <= 0) goto L_0x006d
            boolean r1 = r6.mo154467s()
            if (r1 == 0) goto L_0x005e
            int r1 = -r4
            goto L_0x006e
        L_0x005e:
            android.graphics.RectF r1 = r6.f319548G
            float r1 = r1.centerX()
            android.graphics.RectF r2 = r6.f319544C
            float r2 = r2.centerX()
        L_0x006a:
            float r1 = r1 - r2
            int r1 = (int) r1
            goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            boolean r2 = r6.mo154466r()
            if (r2 == 0) goto L_0x008a
            if (r3 <= 0) goto L_0x008a
            boolean r8 = r6.mo154484t()
            if (r8 == 0) goto L_0x007d
            goto L_0x00aa
        L_0x007d:
            android.graphics.RectF r8 = r6.f319548G
            float r8 = r8.centerY()
            android.graphics.RectF r2 = r6.f319544C
            float r2 = r2.centerY()
            goto L_0x00a6
        L_0x008a:
            boolean r2 = r6.mo154466r()
            if (r2 == 0) goto L_0x00a9
            if (r8 <= 0) goto L_0x00a9
            boolean r2 = r6.mo154484t()
            if (r2 == 0) goto L_0x009a
            int r3 = -r8
            goto L_0x00aa
        L_0x009a:
            android.graphics.RectF r8 = r6.f319548G
            float r8 = r8.centerY()
            android.graphics.RectF r2 = r6.f319544C
            float r2 = r2.centerY()
        L_0x00a6:
            float r8 = r8 - r2
            int r3 = (int) r8
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            if (r1 != 0) goto L_0x00bd
            if (r3 != 0) goto L_0x00bd
            com.tencent.mm.ui.widget.cropview.CropLayout$b r6 = r6.f319566r
            boolean r7 = r6 instanceof com.tencent.p014mm.p136ui.widget.cropview.CropLayout.C106805c
            if (r7 == 0) goto L_0x00b7
            r0 = r6
            com.tencent.mm.ui.widget.cropview.CropLayout$c r0 = (com.tencent.p014mm.p136ui.widget.cropview.CropLayout.C106805c) r0
        L_0x00b7:
            if (r0 == 0) goto L_0x0102
            r0.mo154489a()
            goto L_0x0102
        L_0x00bd:
            r8 = 2
            int[] r0 = new int[r8]
            r0[r5] = r5
            r0[r9] = r1
            java.lang.String r1 = "transX"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofInt(r1, r0)
            int[] r1 = new int[r8]
            r1[r5] = r5
            r1[r9] = r3
            java.lang.String r2 = "transY"
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofInt(r2, r1)
            android.animation.PropertyValuesHolder[] r8 = new android.animation.PropertyValuesHolder[r8]
            r8[r5] = r0
            r8[r9] = r1
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofPropertyValuesHolder(r8)
            po3.l r9 = new po3.l
            r9.<init>(r6)
            r8.addUpdateListener(r9)
            po3.m r9 = new po3.m
            r9.<init>(r7, r6)
            r8.addListener(r9)
            android.view.animation.DecelerateInterpolator r7 = new android.view.animation.DecelerateInterpolator
            r7.<init>()
            r8.setInterpolator(r7)
            r0 = 160(0xa0, double:7.9E-322)
            r8.setDuration(r0)
            r8.start()
            r6.f319560T = r8
        L_0x0102:
            return
        L_0x0103:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "Super calls with default arguments not supported in this target, function: startEdgeAnimation"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cropview.CropLayout.m144359E(com.tencent.mm.ui.widget.cropview.CropLayout, android.animation.Animator$AnimatorListener, int, java.lang.Object):void");
    }

    /* renamed from: G */
    public static /* synthetic */ void m144360G(CropLayout cropLayout, C32224a aVar, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                aVar = C106812m.f319586d;
            }
            if ((i & 2) != 0) {
                animatorUpdateListener = null;
            }
            cropLayout.mo154439F(aVar, animatorUpdateListener);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startRevertAnimation");
    }

    /* access modifiers changed from: private */
    public final float[] getMatrixValues() {
        this.f319569u.getValues(this.f319573x0);
        float[] fArr = this.f319573x0;
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i3 = i2 + 1;
            if (Float.isNaN(fArr[i])) {
                Log.m105920e("CropLayout", "MatrixValues Error! index=" + i2 + " value=" + this.f319573x0[i2]);
                this.f319573x0[i2] = 1.0f;
                break;
            }
            i++;
            i2 = i3;
        }
        return this.f319573x0;
    }

    private final float getRotate() {
        Matrix matrix;
        View view = this.f319551J;
        if (!(view == null || (matrix = view.getMatrix()) == null)) {
            matrix.getValues(this.f319573x0);
        }
        float[] fArr = this.f319573x0;
        return -((float) Math.round(Math.atan2((double) fArr[1], (double) fArr[0]) * 57.29577951308232d));
    }

    private final float getRotateDegrees() {
        this.f319569u.getValues(this.f319573x0);
        float[] fArr = this.f319573x0;
        return -((float) Math.round(Math.atan2((double) fArr[1], (double) fArr[0]) * 57.29577951308232d));
    }

    /* renamed from: j */
    public static final void m144362j(CropLayout cropLayout, float f) {
        Matrix matrix;
        Matrix matrix2;
        cropLayout.f319556P.reset();
        View view = cropLayout.f319551J;
        if (!(view == null || (matrix2 = view.getMatrix()) == null)) {
            matrix2.invert(cropLayout.f319556P);
        }
        cropLayout.f319557Q[0] = cropLayout.f319544C.centerX();
        cropLayout.f319557Q[1] = cropLayout.f319544C.centerY();
        cropLayout.f319556P.mapPoints(cropLayout.f319557Q);
        cropLayout.f319556P.getValues(cropLayout.f319573x0);
        cropLayout.f319569u.postRotate(f);
        cropLayout.mo154485v();
        View view2 = cropLayout.f319551J;
        if (!(view2 == null || (matrix = view2.getMatrix()) == null)) {
            matrix.mapPoints(cropLayout.f319557Q);
        }
        cropLayout.f319569u.postTranslate(cropLayout.f319544C.centerX() - cropLayout.f319557Q[0], cropLayout.f319544C.centerY() - cropLayout.f319557Q[1]);
        cropLayout.mo154485v();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c3  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m144363k(com.tencent.p014mm.p136ui.widget.cropview.CropLayout r3, android.graphics.RectF r4, boolean r5, int r6, java.lang.Object r7) {
        /*
            if (r7 != 0) goto L_0x0107
            r7 = 2
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0007
            r5 = 0
        L_0x0007:
            r3.getClass()
            java.lang.String r6 = "widget"
            gy3.C87412m.m108594g(r4, r6)
            float r6 = r4.width()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 * r0
            android.graphics.Rect r1 = r3.f319549H
            int r1 = r1.width()
            float r1 = (float) r1
            float r6 = r6 / r1
            float r4 = r4.height()
            float r4 = r4 * r0
            android.graphics.Rect r0 = r3.f319549H
            int r0 = r0.height()
            float r0 = (float) r0
            float r4 = r4 / r0
            float r4 = java.lang.Math.max(r6, r4)
            android.graphics.RectF r6 = r3.f319548G
            float r6 = r6.height()
            android.graphics.RectF r0 = r3.f319544C
            float r0 = r0.height()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0057
            android.graphics.RectF r6 = r3.f319548G
            float r6 = r6.centerX()
            android.graphics.RectF r0 = r3.f319544C
            float r0 = r0.centerX()
            float r6 = r6 - r0
            android.graphics.RectF r0 = r3.f319548G
            float r0 = r0.top
            android.graphics.RectF r1 = r3.f319544C
            float r1 = r1.top
            goto L_0x0095
        L_0x0057:
            android.graphics.RectF r6 = r3.f319548G
            float r6 = r6.width()
            android.graphics.RectF r0 = r3.f319544C
            float r0 = r0.width()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x007c
            android.graphics.RectF r6 = r3.f319548G
            float r0 = r6.left
            android.graphics.RectF r1 = r3.f319544C
            float r1 = r1.left
            float r0 = r0 - r1
            float r6 = r6.centerY()
            android.graphics.RectF r1 = r3.f319544C
            float r1 = r1.centerY()
            float r6 = r6 - r1
            goto L_0x0099
        L_0x007c:
            android.graphics.RectF r6 = r3.f319548G
            float r6 = r6.centerX()
            android.graphics.RectF r0 = r3.f319544C
            float r0 = r0.centerX()
            float r6 = r6 - r0
            android.graphics.RectF r0 = r3.f319548G
            float r0 = r0.centerY()
            android.graphics.RectF r1 = r3.f319544C
            float r1 = r1.centerY()
        L_0x0095:
            float r0 = r0 - r1
            r2 = r0
            r0 = r6
            r6 = r2
        L_0x0099:
            r3.f319543B = r4
            float r1 = r3.f319570v
            float r1 = r1 * r4
            r3.f319572x = r1
            float r1 = r3.f319571w
            float r1 = r1 * r4
            r3.f319574y = r1
            if (r5 != 0) goto L_0x00c3
            r3.mo154441I(r0, r6)
            android.graphics.RectF r5 = r3.f319544C
            float r5 = r5.centerX()
            android.graphics.RectF r7 = r3.f319544C
            float r7 = r7.centerY()
            r3.mo154440H(r4, r5, r7)
            android.graphics.RectF r5 = r3.f319548G
            android.graphics.Rect r7 = r3.f319550I
            r5.round(r7)
            goto L_0x00cc
        L_0x00c3:
            po3.f r5 = new po3.f
            r5.<init>(r3)
            r1 = 0
            m144360G(r3, r5, r1, r7, r1)
        L_0x00cc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "[alignStart] scale="
            r5.append(r7)
            r5.append(r4)
            java.lang.String r4 = " offsetX="
            r5.append(r4)
            r5.append(r0)
            java.lang.String r4 = " offsetY="
            r5.append(r4)
            r5.append(r6)
            java.lang.String r4 = " contentBaseRect="
            r5.append(r4)
            android.graphics.Rect r4 = r3.f319549H
            r5.append(r4)
            java.lang.String r4 = " contentRect="
            r5.append(r4)
            android.graphics.Rect r3 = r3.f319547F
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r4 = "CropLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            return
        L_0x0107:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "Super calls with default arguments not supported in this target, function: alignStart"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cropview.CropLayout.m144363k(com.tencent.mm.ui.widget.cropview.CropLayout, android.graphics.RectF, boolean, int, java.lang.Object):void");
    }

    /* renamed from: o */
    public static void m144364o(CropLayout cropLayout, RectF rectF, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            cropLayout.getClass();
            C87412m.m108594g(rectF, "widget");
            float max = Math.max((rectF.width() * 1.0f) / ((float) cropLayout.f319549H.width()), (rectF.height() * 1.0f) / ((float) cropLayout.f319549H.height()));
            float centerX = cropLayout.f319548G.centerX() - cropLayout.f319544C.centerX();
            float centerY = cropLayout.f319548G.centerY() - cropLayout.f319544C.centerY();
            cropLayout.f319543B = max;
            cropLayout.f319572x = cropLayout.f319570v * max;
            cropLayout.f319574y = cropLayout.f319571w * max;
            if (!z) {
                cropLayout.mo154441I(centerX, centerY);
                cropLayout.mo154440H(max, cropLayout.f319544C.centerX(), cropLayout.f319544C.centerY());
                cropLayout.f319548G.round(cropLayout.f319550I);
            } else {
                m144360G(cropLayout, new C110237g(cropLayout), (ValueAnimator.AnimatorUpdateListener) null, 2, (Object) null);
            }
            Log.m105924i("CropLayout", "[centerCrop] scale=" + max + " offsetX=" + centerX + " offsetY=" + centerY + " contentBaseRect=" + cropLayout.f319549H + " contentRect=" + cropLayout.f319547F);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: centerCrop");
    }

    /* renamed from: p */
    public static void m144365p(CropLayout cropLayout, RectF rectF, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            cropLayout.getClass();
            C87412m.m108594g(rectF, "widget");
            float min = Math.min((rectF.width() * 1.0f) / ((float) cropLayout.f319549H.width()), (rectF.height() * 1.0f) / ((float) cropLayout.f319549H.height()));
            float centerX = cropLayout.f319548G.centerX() - cropLayout.f319544C.centerX();
            float centerY = cropLayout.f319548G.centerY() - cropLayout.f319544C.centerY();
            cropLayout.f319543B = min;
            cropLayout.f319572x = cropLayout.f319570v * min;
            cropLayout.f319574y = cropLayout.f319571w * min;
            if (!z) {
                cropLayout.mo154441I(centerX, centerY);
                cropLayout.mo154440H(min, cropLayout.f319544C.centerX(), cropLayout.f319544C.centerY());
                cropLayout.f319548G.round(cropLayout.f319550I);
            } else {
                m144360G(cropLayout, new C110238h(cropLayout), (ValueAnimator.AnimatorUpdateListener) null, 2, (Object) null);
            }
            Log.m105924i("CropLayout", "[centerInside] scale=" + min + " offsetX=" + centerX + " offsetY=" + centerY + " contentBaseRect=" + cropLayout.f319549H + " contentRect=" + cropLayout.f319547F);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: centerInside");
    }

    /* renamed from: A */
    public final void mo154435A(float f, float f2, float f3, float f4) {
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scale", new float[]{f2, f})});
        ofPropertyValuesHolder.addUpdateListener(new C106810j(this, f3, f4));
        ofPropertyValuesHolder.addListener(new C106811k(this));
        ofPropertyValuesHolder.setDuration(128);
        ofPropertyValuesHolder.start();
    }

    /* renamed from: B */
    public final void mo154436B(boolean z) {
        View view = this.f319551J;
        if (view != null) {
            removeView(view);
            if (z) {
                mo154437C();
            }
            this.f319551J = null;
        }
    }

    /* renamed from: C */
    public final void mo154437C() {
        this.f319544C.setEmpty();
        this.f319547F.setEmpty();
        this.f319548G.setEmpty();
        this.f319550I.setEmpty();
        this.f319549H.setEmpty();
        this.f319563W.setEmpty();
        this.f319569u = new Matrix();
        this.f319543B = 1.0f;
        this.f319572x = 1.0f;
        this.f319574y = 1.0f;
        this.f319571w = 5.0f;
        this.f319570v = 0.25f;
        float[] fArr = this.f319564p0;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        this.f319575z = true;
        this.f319542A = false;
        this.f319553L = true;
        this.f319562V = C57863l.f165528d;
        this.f319573x0 = new float[9];
    }

    /* renamed from: D */
    public final void mo154438D(View view, int i, int i2, Matrix matrix, C97279e eVar, C32226l<? super Matrix, Boolean> lVar) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(matrix, "matrix");
        C87412m.m108594g(eVar, "scaleType");
        C87412m.m108594g(lVar, "initFinish");
        this.f319546E.set(0, 0, i, i2);
        this.f319562V = lVar;
        this.f319551J = view;
        this.f319569u = matrix;
        this.f319575z = matrix.isIdentity();
        this.f319542A = true;
        this.f319552K = eVar;
        removeView(view);
        addView(view, 0, new FrameLayout.LayoutParams(i, i2));
    }

    /* renamed from: F */
    public final void mo154439F(C32224a<C13598b0> aVar, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        C87412m.m108594g(aVar, "onAnimationEnd");
        Animator animator = this.f319561U;
        if (animator != null) {
            animator.cancel();
        }
        getMatrixValues();
        float f = getContentViewScale()[0];
        float centerX = this.f319548G.centerX();
        float centerY = this.f319548G.centerY();
        float exactCenterX = this.f319550I.exactCenterX();
        float exactCenterY = this.f319550I.exactCenterY();
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scale", new float[]{f, this.f319543B});
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("percent", new float[]{0.0f, 1.0f}), ofFloat, PropertyValuesHolder.ofFloat("transX", new float[]{centerX, exactCenterX}), PropertyValuesHolder.ofFloat("transY", new float[]{centerY, exactCenterY})});
        ofPropertyValuesHolder.addUpdateListener(new C106813n(this));
        ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
        ofPropertyValuesHolder.setDuration(300);
        ofPropertyValuesHolder.addListener(new C106814o(aVar));
        if (animatorUpdateListener != null) {
            ofPropertyValuesHolder.addUpdateListener(animatorUpdateListener);
        }
        ofPropertyValuesHolder.start();
    }

    /* renamed from: H */
    public final void mo154440H(float f, float f2, float f3) {
        if (!this.f319548G.isEmpty()) {
            RectF rectF = this.f319548G;
            float width = (f2 - rectF.left) / rectF.width();
            RectF rectF2 = this.f319548G;
            float height = (f3 - rectF2.top) / rectF2.height();
            this.f319569u.postScale(f, f, 0.0f, 0.0f);
            mo154485v();
            C106803a aVar = this.f319565q;
            if (aVar != null) {
                EditorItemContainer editorItemContainer = (EditorItemContainer) aVar;
                int childCount = editorItemContainer.f273059j.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = editorItemContainer.f273059j.getChildAt(i);
                    if (childAt instanceof C92013g) {
                        ((C92013g) childAt).getTouchTracker().f321806g.postScale(f, f, f2, f3);
                        childAt.invalidate();
                    } else if (childAt instanceof C92026t) {
                        ((C92026t) childAt).getTouchTracker().f321806g.postScale(f, f, f2, f3);
                        childAt.invalidate();
                    }
                }
            }
            RectF rectF3 = this.f319548G;
            float width2 = rectF3.left + (width * rectF3.width());
            RectF rectF4 = this.f319548G;
            this.f319569u.postTranslate(f2 - width2, f3 - (rectF4.top + (height * rectF4.height())));
            mo154485v();
        }
    }

    /* renamed from: I */
    public final void mo154441I(float f, float f2) {
        C106803a aVar = this.f319565q;
        if (aVar != null) {
            float f3 = -f;
            float f4 = -f2;
            EditorItemContainer editorItemContainer = (EditorItemContainer) aVar;
            int childCount = editorItemContainer.f273059j.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = editorItemContainer.f273059j.getChildAt(i);
                if (childAt instanceof C92013g) {
                    ((C92013g) childAt).getTouchTracker().f321806g.postTranslate(f3, f4);
                    childAt.invalidate();
                }
                if (childAt instanceof C92026t) {
                    ((C92026t) childAt).getTouchTracker().f321806g.postTranslate(f3, f4);
                    childAt.invalidate();
                }
            }
        }
        this.f319569u.postTranslate(-f, -f2);
        mo154485v();
    }

    /* renamed from: c */
    public void mo82325c(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e1");
        super.mo82325c(motionEvent);
        boolean z = false;
        this.f319553L = false;
        Animator animator = this.f319558R;
        boolean isStarted = animator != null ? animator.isStarted() : false;
        if (!this.f165534g && !isStarted) {
            boolean s = mo154467s();
            boolean t = mo154484t();
            if (!t || !s) {
                Animator animator2 = this.f319558R;
                if (animator2 != null) {
                    animator2.cancel();
                }
                Animator animator3 = this.f319561U;
                if (animator3 != null) {
                    animator3.cancel();
                }
                float centerX = this.f319548G.centerX();
                float centerY = this.f319548G.centerY();
                float centerX2 = this.f319544C.centerX();
                float centerY2 = this.f319544C.centerY();
                float f = getContentViewScale()[0];
                float width = this.f319544C.width() / this.f319548G.width();
                float height = this.f319544C.height() / this.f319548G.height();
                PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scale", new float[]{f, (this.f319552K == C97279e.CENTER_CROP ? Math.max(height, width) : Math.min(height, width)) * f});
                PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("transX", new float[]{centerX, centerX2});
                PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("transY", new float[]{centerY, centerY2});
                RectF rectF = this.f319544C;
                float f2 = rectF.right;
                RectF rectF2 = this.f319548G;
                float f3 = f2 - rectF2.right;
                float f4 = rectF.left - rectF2.left;
                float[] fArr = new float[2];
                fArr[0] = 0.0f;
                fArr[1] = (f4 >= 0.0f || f3 >= 0.0f) ? (f4 <= 0.0f || f3 <= 0.0f) ? 0.0f : f3 : f4;
                PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat("edgeX", fArr);
                RectF rectF3 = this.f319544C;
                float f5 = rectF3.bottom;
                RectF rectF4 = this.f319548G;
                float f6 = f5 - rectF4.bottom;
                float f7 = rectF3.top - rectF4.top;
                float[] fArr2 = new float[2];
                float f8 = 0.0f;
                fArr2[0] = 0.0f;
                if (f7 < 0.0f && f6 < 0.0f) {
                    f8 = f7;
                } else if (f7 > 0.0f && f6 > 0.0f) {
                    f8 = f6;
                }
                fArr2[1] = f8;
                PropertyValuesHolder ofFloat5 = PropertyValuesHolder.ofFloat("edgeY", fArr2);
                Log.m105918d("CropLayout", "[startCenterAnim] source=" + (isStarted ? 1 : 0) + " edgeLeft=" + f4 + " edgeRight=" + f3 + " edgeTop=" + f7 + " edgeBottom=" + f6);
                C59741c0 c0Var = new C59741c0();
                C59741c0 c0Var2 = new C59741c0();
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
                ofPropertyValuesHolder.addUpdateListener(new C110240j(this, t, s, c0Var, c0Var2));
                ofPropertyValuesHolder.addListener(new C110241k(this));
                ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
                ofPropertyValuesHolder.setDuration(160);
                ofPropertyValuesHolder.start();
                this.f319561U = ofPropertyValuesHolder;
                z = true;
            }
        }
        if (!z) {
            Log.m105918d("CropLayout", "onTouchCancel startCenterAnim == false isFling=" + isStarted);
            if (!isStarted) {
                m144359E(this, (Animator.AnimatorListener) null, 1, (Object) null);
            }
        } else {
            Log.m105918d("CropLayout", "onTouchCancel startCenterAnim == true isFling=" + isStarted);
        }
        this.f319555N = false;
    }

    public final View.OnClickListener getClickListener() {
        return this.f319567s;
    }

    public final Rect getContentBaseRect() {
        return this.f319549H;
    }

    public final Rect getContentCenterRect() {
        return this.f319550I;
    }

    public final Rect getContentOriginalRect() {
        return this.f319546E;
    }

    public final Rect getContentRect() {
        return this.f319547F;
    }

    public final RectF getContentRectF() {
        return this.f319548G;
    }

    public final View getContentView() {
        return this.f319551J;
    }

    public final float[] getContentViewScale() {
        getMatrixValues();
        float[] fArr = this.f319573x0;
        float f = fArr[0];
        double d = (double) fArr[3];
        float sqrt = (float) Math.sqrt(((double) (f * f)) + (d * d));
        return new float[]{sqrt, sqrt};
    }

    public final float[] getContentViewTrans() {
        this.f319569u.getValues(this.f319573x0);
        float[] fArr = this.f319573x0;
        float f = fArr[2];
        float f2 = fArr[5];
        float[] fArr2 = this.f319564p0;
        fArr2[0] = f;
        fArr2[1] = f2;
        return fArr2;
    }

    public final C106803a getCropLayoutTouchListener() {
        return this.f319565q;
    }

    public final C32226l<Matrix, Boolean> getInitFinish() {
        return this.f319562V;
    }

    public final Matrix getMainMatrix() {
        return this.f319569u;
    }

    public final float getMaxScaleFactor() {
        return this.f319571w;
    }

    public final float getMaxScaleValue() {
        return this.f319574y;
    }

    public final float getMinScaleFactor() {
        return this.f319570v;
    }

    public final float getMinScaleValue() {
        return this.f319572x;
    }

    public final C106804b getOnChangeListener() {
        return this.f319566r;
    }

    public final C106806d getOnScaleListener() {
        return this.f319568t;
    }

    public final C97279e getScaleType() {
        return this.f319552K;
    }

    public final RectF getTmpRectF() {
        return this.f319563W;
    }

    public final RectF getVisibilityRect() {
        return this.f319544C;
    }

    public final Rect getWidgetRect() {
        return this.f319545D;
    }

    /* renamed from: l */
    public void mo152390l(boolean z, int i, int i2, int i3, int i4) {
        if (this.f319544C.isEmpty()) {
            this.f319544C.set(0.0f, 0.0f, (float) (i3 - i), (float) (i4 - i2));
        }
        View view = this.f319551J;
        if (view == null) {
            return;
        }
        if (this.f319542A) {
            this.f319542A = false;
            if (this.f319575z) {
                this.f319569u.reset();
            }
            this.f319549H.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            view.setPivotX(this.f319549H.exactCenterX());
            view.setPivotY(this.f319549H.exactCenterY());
            this.f319563W.set(this.f319549H);
            this.f319569u.mapRect(this.f319563W);
            this.f319563W.round(this.f319547F);
            this.f319548G.set(this.f319563W);
            if (this.f319575z) {
                this.f319569u.reset();
                int ordinal = this.f319552K.ordinal();
                if (ordinal == 0) {
                    m144364o(this, this.f319544C, false, 2, (Object) null);
                } else if (ordinal == 1) {
                    m144365p(this, this.f319544C, false, 2, (Object) null);
                } else if (ordinal == 2) {
                    m144363k(this, this.f319544C, false, 2, (Object) null);
                }
                if (this.f319562V.invoke(this.f319569u).booleanValue()) {
                    mo154485v();
                    this.f319548G.round(this.f319550I);
                }
            } else if (this.f319562V.invoke(this.f319569u).booleanValue()) {
                mo154485v();
                this.f319548G.round(this.f319550I);
            }
        } else if (z) {
            int ordinal2 = this.f319552K.ordinal();
            if (ordinal2 == 0) {
                m144364o(this, this.f319544C, false, 2, (Object) null);
            } else if (ordinal2 == 1) {
                m144365p(this, this.f319544C, false, 2, (Object) null);
            } else if (ordinal2 == 2) {
                m144363k(this, this.f319544C, false, 2, (Object) null);
            }
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        super.onDown(motionEvent);
        C106804b bVar = this.f319566r;
        C106805c cVar = bVar instanceof C106805c ? (C106805c) bVar : null;
        if (cVar != null) {
            cVar.mo154490b();
        }
        Animator animator = this.f319558R;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f319560T;
        if (animator2 == null) {
            return true;
        }
        animator2.cancel();
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C97279e eVar = C97279e.ALIGN_START;
        C97279e eVar2 = C97279e.CENTER_CROP;
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        if (!this.f165533f) {
            return false;
        }
        float f3 = f * 0.5f;
        float f4 = f2 * 0.5f;
        if (this.f319554M || (Math.abs(f3) < 1000.0f && Math.abs(f4) < 1000.0f)) {
            return false;
        }
        boolean q = mo154465q();
        boolean r = mo154466r();
        boolean s = mo154467s();
        boolean t = mo154484t();
        if (q && r) {
            return false;
        }
        RectF rectF = this.f319548G;
        float f5 = rectF.left;
        RectF rectF2 = this.f319544C;
        float f6 = rectF2.left;
        if ((f5 >= f6 && f3 > 0.0f) || (rectF.right <= f6 && f3 < 0.0f)) {
            C97279e eVar3 = this.f319552K;
            if (eVar3 == eVar2 || eVar3 == eVar) {
                return false;
            }
            f3 = 0.0f;
        }
        if ((rectF.top >= rectF2.top && f4 > 0.0f) || (rectF.bottom <= rectF2.bottom && f4 < 0.0f)) {
            C97279e eVar4 = this.f319552K;
            if (eVar4 == eVar2 || eVar4 == eVar) {
                return false;
            }
            f4 = 0.0f;
        }
        Animator animator = this.f319558R;
        if (animator != null) {
            animator.cancel();
        }
        float[] fArr = this.f319559S;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        RectF rectF3 = this.f319548G;
        float f7 = rectF3.right;
        RectF rectF4 = this.f319544C;
        float f8 = f7 - rectF4.right;
        float f9 = rectF4.left - rectF3.left;
        if (f3 < 0.0f) {
            fArr[0] = -Math.min(Math.abs(f3), Math.abs(f8));
        } else {
            fArr[0] = Math.min(Math.abs(f3), Math.abs(f9));
        }
        RectF rectF5 = this.f319548G;
        float f15 = rectF5.bottom;
        RectF rectF6 = this.f319544C;
        float f16 = f15 - rectF6.bottom;
        float f17 = rectF6.top - rectF5.top;
        if (f4 < 0.0f) {
            this.f319559S[1] = -Math.min(Math.abs(f4), Math.abs(f16));
        } else {
            this.f319559S[1] = Math.min(Math.abs(f4), Math.abs(f17));
        }
        float[] fArr2 = this.f319559S;
        Log.m105918d("CropLayout", "[onFling] velocityX=" + f3 + " velocityY=" + f4 + "  fixTransX=" + fArr2[0] + " fixTransY=" + fArr2[1] + " isOverEdgeHorizontal=" + q + " isOverEdgeVertical=" + r + " isOverHorizontal=" + s + " isOverVertical=" + t);
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("transX", new float[]{0.0f, fArr2[0]}), PropertyValuesHolder.ofFloat("transY", new float[]{0.0f, fArr2[1]})});
        ofPropertyValuesHolder.addUpdateListener(new C106807g(this));
        ofPropertyValuesHolder.addListener(new C106808h(this));
        ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
        ofPropertyValuesHolder.setDuration(400);
        ofPropertyValuesHolder.start();
        this.f319558R = ofPropertyValuesHolder;
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f319545D.set(i, i2, i3, i4);
            this.f319542A = true;
        }
        mo152390l(z, i, i2, i3, i4);
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C87412m.m108594g(scaleGestureDetector, "detector");
        mo154487y(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        if (!this.f165535h) {
            return true;
        }
        mo154488z(f, f2, 0);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        View.OnClickListener onClickListener = this.f319567s;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
        super.onSingleTapUp(motionEvent);
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            this.f319554M = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f319554M = true;
        }
        return super.onTouch(view, motionEvent);
    }

    /* renamed from: q */
    public boolean mo154465q() {
        RectF rectF = this.f319544C;
        float f = rectF.left;
        RectF rectF2 = this.f319548G;
        return f < rectF2.left || rectF.right > rectF2.right;
    }

    /* renamed from: r */
    public boolean mo154466r() {
        RectF rectF = this.f319544C;
        float f = rectF.top;
        RectF rectF2 = this.f319548G;
        return f < rectF2.top || rectF.bottom > rectF2.bottom;
    }

    /* renamed from: s */
    public boolean mo154467s() {
        return this.f319548G.width() > this.f319544C.width();
    }

    public final void setClickListener(View.OnClickListener onClickListener) {
        this.f319567s = onClickListener;
    }

    public final void setContentBaseRect(Rect rect) {
        C87412m.m108594g(rect, "<set-?>");
        this.f319549H = rect;
    }

    public final void setContentCenterRect(Rect rect) {
        C87412m.m108594g(rect, "<set-?>");
        this.f319550I = rect;
    }

    public final void setContentView(View view) {
        this.f319551J = view;
    }

    public final void setCropLayoutTouchListener(C106803a aVar) {
        this.f319565q = aVar;
    }

    public final void setFirstCancelOrUp(boolean z) {
        this.f319553L = z;
    }

    public final void setInitFinish(C32226l<? super Matrix, Boolean> lVar) {
        C87412m.m108594g(lVar, "<set-?>");
        this.f319562V = lVar;
    }

    public final void setMainMatrix(Matrix matrix) {
        C87412m.m108594g(matrix, "<set-?>");
        this.f319569u = matrix;
    }

    public final void setMaxScaleFactor(float f) {
        this.f319571w = f;
    }

    public final void setMaxScaleValue(float f) {
        this.f319574y = f;
    }

    public final void setMinScaleFactor(float f) {
        this.f319570v = f;
    }

    public final void setMinScaleValue(float f) {
        this.f319572x = f;
    }

    public final void setOnChangeListener(C106804b bVar) {
        this.f319566r = bVar;
    }

    public final void setOnScaleListener(C106806d dVar) {
        this.f319568t = dVar;
    }

    public final void setScaleType(C97279e eVar) {
        C87412m.m108594g(eVar, "<set-?>");
        this.f319552K = eVar;
    }

    public final void setShouldLayout(boolean z) {
        this.f319542A = z;
    }

    /* renamed from: t */
    public boolean mo154484t() {
        return this.f319548G.height() > this.f319544C.height();
    }

    /* renamed from: v */
    public final void mo154485v() {
        View view = this.f319551J;
        if (view != null) {
            float[] matrixValues = getMatrixValues();
            boolean z = false;
            float f = getContentViewScale()[0];
            if (!(f == Float.NEGATIVE_INFINITY)) {
                if (f == Float.POSITIVE_INFINITY) {
                    z = true;
                }
                if (!z && !Float.isNaN(f)) {
                    view.setRotation(getRotateDegrees());
                    view.setPivotX(0.0f);
                    view.setPivotY(0.0f);
                    view.setScaleX(f);
                    view.setScaleY(f);
                    view.setTranslationX(matrixValues[2]);
                    view.setTranslationY(matrixValues[5]);
                }
            }
            Log.m105928w("CropLayout", "return apply scale is " + f);
        }
        View view2 = this.f319551J;
        if (view2 != null) {
            this.f319563W.set(this.f319549H);
            view2.getMatrix().mapRect(this.f319563W);
            this.f319548G.set(this.f319563W);
            this.f319563W.round(this.f319547F);
        }
        C106804b bVar = this.f319566r;
        if (bVar != null) {
            bVar.onChange();
        }
    }

    /* renamed from: w */
    public void mo152391w(RectF rectF, boolean z) {
        C87412m.m108594g(rectF, "rectF");
        RectF rectF2 = this.f319544C;
        float f = rectF2.bottom;
        RectF rectF3 = this.f319548G;
        float f2 = f - rectF3.bottom;
        float f3 = rectF2.top - rectF3.top;
        if (f2 > 0.0f && f2 <= f3) {
            mo154488z(0.0f, -f2, 4);
        } else if (rectF3.height() <= this.f319544C.height() || z) {
            mo154487y((this.f319544C.height() * 1.0f) / this.f319548G.height(), this.f319548G.centerX(), this.f319548G.bottom);
            mo154488z(0.0f, -(this.f319544C.bottom - this.f319548G.bottom), 4);
        }
        this.f319544C.set(rectF);
    }

    /* renamed from: x */
    public final void mo154486x() {
        float f = -getRotateDegrees();
        Log.m105924i("CropLayout", "[onRevertRotate] currentDegrees=" + f);
        if (!(f == 0.0f)) {
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, new float[]{0.0f, f})});
            ofPropertyValuesHolder.addUpdateListener(new C106809i(this, new C59741c0()));
            ofPropertyValuesHolder.setDuration((long) (((float) 110) * (Math.abs(f) / 90.0f)));
            ofPropertyValuesHolder.start();
        }
    }

    /* renamed from: y */
    public final void mo154487y(float f, float f2, float f3) {
        if (getContentViewScale()[0] * f < this.f319572x || getContentViewScale()[0] * f > this.f319574y) {
            if (!this.f319555N) {
                performHapticFeedback(0, 2);
                this.f319555N = true;
            }
        } else if (this.f319551J != null) {
            mo154440H(f, f2, f3);
        }
    }

    /* renamed from: z */
    public final void mo154488z(float f, float f2, int i) {
        if (i == 4) {
            mo154441I(f, f2);
            return;
        }
        if (!mo154467s()) {
            f = 0.0f;
        } else if (mo154465q()) {
            f *= 0.4f;
        }
        if (!mo154484t()) {
            f2 = 0.0f;
        } else if (mo154466r()) {
            f2 *= 0.4f;
        }
        mo154441I(f, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CropLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setBackgroundColor(getContext().getResources().getColor(17170444));
        this.f319556P = new Matrix();
        this.f319557Q = new float[2];
        this.f319559S = new float[2];
        this.f319562V = C97280f.f285529d;
        this.f319563W = new RectF();
        this.f319564p0 = new float[2];
        this.f319573x0 = new float[9];
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CropLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setBackgroundColor(getContext().getResources().getColor(17170444));
        this.f319556P = new Matrix();
        this.f319557Q = new float[2];
        this.f319559S = new float[2];
        this.f319562V = C97280f.f285529d;
        this.f319563W = new RectF();
        this.f319564p0 = new float[2];
        this.f319573x0 = new float[9];
    }
}
