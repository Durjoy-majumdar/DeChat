package com.tencent.p014mm.plugin.recordvideo.p095ui;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.cropview.VideoTimeView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import po3.C11994o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sn0.C90259e;
import wh2.C111811c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000f\u0012B!\b\u0016\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001B*\b\u0016\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001\u0012\u0007\u0010\u0001\u001a\u00020\u001b¢\u0006\u0006\b\u0001\u0010\u0001R\u001b\u0010\b\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\u000b\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u001b\u0010\u000e\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R\u001b\u0010\u0011\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R\u001b\u0010\u0014\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007R\u001b\u0010\u0017\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0016\u0010\u0007R\u001b\u0010\u001a\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0005\u001a\u0004\b\u0019\u0010\u0007R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b \u0010\u0005\u001a\u0004\b!\u0010\u001eR\u001b\u0010'\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b$\u0010\u0005\u001a\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0004X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0004X\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u0010;\u001a\u0004\u0018\u0001048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010D\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010M\u001a\u00020E2\u0006\u0010F\u001a\u00020E8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020V8BX\u0002¢\u0006\f\n\u0004\bW\u0010\u0005\u001a\u0004\bX\u0010YR\"\u0010^\u001a\u00020N8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b[\u0010P\u001a\u0004\b\\\u0010R\"\u0004\b]\u0010TR*\u0010d\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020\u001b8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010\u001e\"\u0004\bb\u0010cR\u0017\u0010j\u001a\u00020e8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR*\u0010o\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00038\u0006@FX\u000e¢\u0006\u0012\n\u0004\bk\u0010[\u001a\u0004\bl\u0010\u0007\"\u0004\bm\u0010nR*\u0010s\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00038\u0006@FX\u000e¢\u0006\u0012\n\u0004\bp\u0010[\u001a\u0004\bq\u0010\u0007\"\u0004\br\u0010nR\u001a\u0010v\u001a\u00020e8\u0004X\u0004¢\u0006\f\n\u0004\bt\u0010g\u001a\u0004\bu\u0010iR\"\u0010x\u001a\u00020N8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bw\u0010P\u001a\u0004\bx\u0010R\"\u0004\by\u0010TR\"\u0010{\u001a\u00020N8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bz\u0010P\u001a\u0004\b{\u0010R\"\u0004\b|\u0010TR)\u0010\u0001\u001a\u0004\u0018\u00010}8\u0006@\u0006X\u000e¢\u0006\u0016\n\u0004\b~\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/GestureDetector$OnGestureListener;", "", "d", "Lrx3/g;", "getBOX_LINE_WIDTH", "()F", "BOX_LINE_WIDTH", "e", "getBOX_GIRD_WIDTH", "BOX_GIRD_WIDTH", "f", "getCORNER_WIDTH", "CORNER_WIDTH", "g", "getBLOCK_WIDTH", "BLOCK_WIDTH", "h", "getBOX_PADDING", "BOX_PADDING", "i", "getCORNER_LENGTH", "CORNER_LENGTH", "j", "getTOUCH_BLOCK_PADDING", "TOUCH_BLOCK_PADDING", "", "n", "get_1A", "()I", "_1A", "o", "get_4A", "_4A", "Landroid/view/GestureDetector;", "p", "getTouchDetector", "()Landroid/view/GestureDetector;", "touchDetector", "Landroid/graphics/Path;", "q", "Landroid/graphics/Path;", "getGridLinePath", "()Landroid/graphics/Path;", "gridLinePath", "Landroid/graphics/Paint;", "s", "Landroid/graphics/Paint;", "getGridLinePaint", "()Landroid/graphics/Paint;", "gridLinePaint", "Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$g;", "z", "Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$g;", "getOnOperationCallback", "()Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$g;", "setOnOperationCallback", "(Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$g;)V", "onOperationCallback", "Lkotlin/Function0;", "Lrx3/b0;", "A", "Lfy3/a;", "getOutsideTouckListener", "()Lfy3/a;", "setOutsideTouckListener", "(Lfy3/a;)V", "outsideTouckListener", "Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;", "value", "B", "Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;", "getStyle", "()Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;", "setStyle", "(Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;)V", "style", "", "C", "Z", "getBlockOutsideTouch", "()Z", "setBlockOutsideTouch", "(Z)V", "blockOutsideTouch", "Landroid/graphics/drawable/Drawable;", "D", "getBlockDrawable", "()Landroid/graphics/drawable/Drawable;", "blockDrawable", "F", "getShowGridLine", "setShowGridLine", "showGridLine", "G", "I", "getBgColor", "setBgColor", "(I)V", "bgColor", "Landroid/graphics/RectF;", "J", "Landroid/graphics/RectF;", "getVisibilityRect", "()Landroid/graphics/RectF;", "visibilityRect", "K", "getLimitMaxHeight", "setLimitMaxHeight", "(F)V", "limitMaxHeight", "L", "getLimitMinHeight", "setLimitMinHeight", "limitMinHeight", "N", "getBoxRect", "boxRect", "Q", "isBelongTopBlock", "setBelongTopBlock", "R", "isBelongBottomBlock", "setBelongBottomBlock", "Lpo3/o;", "S", "Lpo3/o;", "getBorderVisibilityCallback", "()Lpo3/o;", "setBorderVisibilityCallback", "(Lpo3/o;)V", "borderVisibilityCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "video-recorder-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout */
public class WxCropOperationLayout extends FrameLayout implements GestureDetector.OnGestureListener {

    /* renamed from: A */
    public C32224a<C13598b0> f315414A;

    /* renamed from: B */
    public C94436h f315415B;

    /* renamed from: C */
    public boolean f315416C;

    /* renamed from: D */
    public final C13601g f315417D;

    /* renamed from: E */
    public final View[] f315418E;

    /* renamed from: F */
    public boolean f315419F;

    /* renamed from: G */
    public int f315420G;

    /* renamed from: H */
    public ValueAnimator f315421H;

    /* renamed from: I */
    public final Paint f315422I;

    /* renamed from: J */
    public final RectF f315423J;

    /* renamed from: K */
    public float f315424K;

    /* renamed from: L */
    public float f315425L;

    /* renamed from: M */
    public final RectF f315426M;

    /* renamed from: N */
    public final RectF f315427N;

    /* renamed from: P */
    public final PorterDuffXfermode f315428P;

    /* renamed from: Q */
    public boolean f315429Q;

    /* renamed from: R */
    public boolean f315430R;

    /* renamed from: S */
    public C11994o f315431S;

    /* renamed from: T */
    public ValueAnimator f315432T;

    /* renamed from: U */
    public final RectF f315433U;

    /* renamed from: V */
    public final PointF f315434V;

    /* renamed from: W */
    public final PointF f315435W;

    /* renamed from: d */
    public final C13601g f315436d = C36568h.m40985a(new C105983c(this));

    /* renamed from: e */
    public final C13601g f315437e = C36568h.m40985a(new C105982b(this));

    /* renamed from: f */
    public final C13601g f315438f = C36568h.m40985a(new C105986f(this));

    /* renamed from: g */
    public final C13601g f315439g = C36568h.m40985a(new C105981a(this));

    /* renamed from: h */
    public final C13601g f315440h = C36568h.m40985a(new C105984d(this));

    /* renamed from: i */
    public final C13601g f315441i = C36568h.m40985a(new C105985e(this));

    /* renamed from: j */
    public final C13601g f315442j = C36568h.m40985a(new C105988i(this));

    /* renamed from: n */
    public final C13601g f315443n = C36568h.m40985a(new C105989j(this));

    /* renamed from: o */
    public final C13601g f315444o = C36568h.m40985a(new C105990k(this));

    /* renamed from: p */
    public final C13601g f315445p = C36568h.m40985a(new C105995p(this));

    /* renamed from: q */
    public final Path f315446q = new Path();

    /* renamed from: r */
    public final Paint f315447r;

    /* renamed from: s */
    public final Paint f315448s;

    /* renamed from: t */
    public final Paint f315449t;

    /* renamed from: u */
    public final Paint f315450u;

    /* renamed from: v */
    public final Paint f315451v;

    /* renamed from: w */
    public final RectF f315452w;

    /* renamed from: x */
    public final RectF f315453x;

    /* renamed from: y */
    public int f315454y;

    /* renamed from: z */
    public C105987g f315455z;

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$h */
    public enum C94436h {
        CIRCLE,
        RECT_ADJUST,
        RECT_HARD,
        RECT_LINE_HARD
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$a */
    public static final class C105981a extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ WxCropOperationLayout f315456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105981a(WxCropOperationLayout wxCropOperationLayout) {
            super(0);
            this.f315456d = wxCropOperationLayout;
        }

        public Object invoke() {
            return Float.valueOf(this.f315456d.getContext().getResources().getDimension(C0966R.dimen.f4168uy));
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$b */
    public static final class C105982b extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ WxCropOperationLayout f315457d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105982b(WxCropOperationLayout wxCropOperationLayout) {
            super(0);
            this.f315457d = wxCropOperationLayout;
        }

        public Object invoke() {
            return Float.valueOf(this.f315457d.getContext().getResources().getDimension(C0966R.dimen.f4171v1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$c */
    public static final class C105983c extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ WxCropOperationLayout f315458d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105983c(WxCropOperationLayout wxCropOperationLayout) {
            super(0);
            this.f315458d = wxCropOperationLayout;
        }

        public Object invoke() {
            return Float.valueOf(this.f315458d.getContext().getResources().getDimension(C0966R.dimen.f4172v2));
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$d */
    public static final class C105984d extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ WxCropOperationLayout f315459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105984d(WxCropOperationLayout wxCropOperationLayout) {
            super(0);
            this.f315459d = wxCropOperationLayout;
        }

        public Object invoke() {
            return Float.valueOf(this.f315459d.getContext().getResources().getDimension(C0966R.dimen.f4173v3));
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$e */
    public static final class C105985e extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ WxCropOperationLayout f315460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105985e(WxCropOperationLayout wxCropOperationLayout) {
            super(0);
            this.f315460d = wxCropOperationLayout;
        }

        public Object invoke() {
            return Float.valueOf(this.f315460d.getContext().getResources().getDimension(C0966R.dimen.f4169uz));
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$f */
    public static final class C105986f extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ WxCropOperationLayout f315461d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105986f(WxCropOperationLayout wxCropOperationLayout) {
            super(0);
            this.f315461d = wxCropOperationLayout;
        }

        public Object invoke() {
            return Float.valueOf(this.f315461d.getContext().getResources().getDimension(C0966R.dimen.f4170v0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$g */
    public interface C105987g {
        /* renamed from: a */
        void mo151325a(boolean z);

        /* renamed from: b */
        void mo151326b(boolean z);

        /* renamed from: c */
        void mo151327c(RectF rectF);
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$i */
    public static final class C105988i extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ WxCropOperationLayout f315462d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105988i(WxCropOperationLayout wxCropOperationLayout) {
            super(0);
            this.f315462d = wxCropOperationLayout;
        }

        public Object invoke() {
            return Float.valueOf(this.f315462d.getContext().getResources().getDimension(C0966R.dimen.arh));
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$j */
    public static final class C105989j extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ WxCropOperationLayout f315463d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105989j(WxCropOperationLayout wxCropOperationLayout) {
            super(0);
            this.f315463d = wxCropOperationLayout;
        }

        public Object invoke() {
            return Integer.valueOf((int) (this.f315463d.getContext().getResources().getDimension(C0966R.dimen.f3766df) * 1.2f));
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$k */
    public static final class C105990k extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ WxCropOperationLayout f315464d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105990k(WxCropOperationLayout wxCropOperationLayout) {
            super(0);
            this.f315464d = wxCropOperationLayout;
        }

        public Object invoke() {
            return Integer.valueOf((int) this.f315464d.getContext().getResources().getDimension(C0966R.dimen.f3749d0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$l */
    public static final class C105991l extends C87413o implements C32224a<Drawable> {

        /* renamed from: d */
        public final /* synthetic */ WxCropOperationLayout f315465d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105991l(WxCropOperationLayout wxCropOperationLayout) {
            super(0);
            this.f315465d = wxCropOperationLayout;
        }

        public Object invoke() {
            return this.f315465d.getResources().getDrawable(C0966R.C0969drawable.f4628i_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$m */
    public static final class C105992m implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ WxCropOperationLayout f315466d;

        public C105992m(WxCropOperationLayout wxCropOperationLayout) {
            this.f315466d = wxCropOperationLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            WxCropOperationLayout wxCropOperationLayout = this.f315466d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            wxCropOperationLayout.setBgColor(((Integer) animatedValue).intValue());
            this.f315466d.invalidate();
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$n */
    public static final class C105993n implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ WxCropOperationLayout f315467d;

        public C105993n(WxCropOperationLayout wxCropOperationLayout) {
            this.f315467d = wxCropOperationLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            WxCropOperationLayout wxCropOperationLayout = this.f315467d;
            wxCropOperationLayout.f315454y = intValue;
            wxCropOperationLayout.invalidate();
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$o */
    public static final class C105994o implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ WxCropOperationLayout f315468d;

        public C105994o(WxCropOperationLayout wxCropOperationLayout) {
            this.f315468d = wxCropOperationLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            WxCropOperationLayout wxCropOperationLayout = this.f315468d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            wxCropOperationLayout.setBgColor(((Integer) animatedValue).intValue());
            this.f315468d.invalidate();
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$p */
    public static final class C105995p extends C87413o implements C32224a<GestureDetector> {

        /* renamed from: d */
        public final /* synthetic */ WxCropOperationLayout f315469d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105995p(WxCropOperationLayout wxCropOperationLayout) {
            super(0);
            this.f315469d = wxCropOperationLayout;
        }

        public Object invoke() {
            return new GestureDetector(this.f315469d.getContext(), this.f315469d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WxCropOperationLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        new Path();
        new Path();
        new Path();
        new Path();
        new Path();
        new Path();
        this.f315447r = new Paint();
        this.f315448s = new Paint();
        this.f315449t = new Paint();
        this.f315450u = new Paint();
        this.f315451v = new Paint();
        this.f315452w = new RectF();
        this.f315453x = new RectF();
        this.f315415B = C94436h.RECT_ADJUST;
        this.f315417D = C36568h.m40985a(new C105991l(this));
        View[] viewArr = new View[8];
        for (int i = 0; i < 8; i++) {
            viewArr[i] = null;
        }
        this.f315418E = viewArr;
        this.f315419F = true;
        setBackgroundColor(0);
        this.f315447r.setColor(-1);
        this.f315447r.setStrokeWidth(getBOX_LINE_WIDTH());
        this.f315447r.setStyle(Paint.Style.STROKE);
        this.f315447r.setAntiAlias(true);
        this.f315448s.set(this.f315447r);
        this.f315448s.setStrokeWidth(getBOX_GIRD_WIDTH());
        this.f315449t.set(this.f315447r);
        this.f315449t.setStrokeWidth(getCORNER_WIDTH());
        this.f315450u.set(this.f315447r);
        this.f315450u.setStrokeCap(Paint.Cap.ROUND);
        this.f315450u.setStrokeWidth(getBLOCK_WIDTH());
        this.f315451v.set(this.f315447r);
        this.f315451v.setStrokeCap(Paint.Cap.ROUND);
        this.f315451v.setStrokeWidth(getBOX_GIRD_WIDTH());
        this.f315451v.setColor(-7829368);
        this.f315420G = Color.parseColor("#bf232323");
        Paint paint = new Paint();
        paint.setDither(false);
        paint.setColor(this.f315420G);
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(true);
        this.f315422I = paint;
        this.f315423J = new RectF();
        this.f315426M = new RectF();
        this.f315427N = new RectF();
        this.f315428P = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f315433U = new RectF();
        this.f315434V = new PointF();
        this.f315435W = new PointF();
    }

    /* renamed from: d */
    public static /* synthetic */ void m142543d(WxCropOperationLayout wxCropOperationLayout, int i, long j, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j = 1000;
            }
            wxCropOperationLayout.mo151289c(i, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showBorder");
    }

    private final float getBLOCK_WIDTH() {
        return ((Number) this.f315439g.getValue()).floatValue();
    }

    private final float getBOX_GIRD_WIDTH() {
        return ((Number) this.f315437e.getValue()).floatValue();
    }

    private final float getBOX_LINE_WIDTH() {
        return ((Number) this.f315436d.getValue()).floatValue();
    }

    private final float getBOX_PADDING() {
        return ((Number) this.f315440h.getValue()).floatValue();
    }

    private final Drawable getBlockDrawable() {
        Object value = this.f315417D.getValue();
        C87412m.m108593f(value, "<get-blockDrawable>(...)");
        return (Drawable) value;
    }

    private final float getCORNER_LENGTH() {
        return ((Number) this.f315441i.getValue()).floatValue();
    }

    private final float getCORNER_WIDTH() {
        return ((Number) this.f315438f.getValue()).floatValue();
    }

    private final float getTOUCH_BLOCK_PADDING() {
        return ((Number) this.f315442j.getValue()).floatValue();
    }

    private final GestureDetector getTouchDetector() {
        return (GestureDetector) this.f315445p.getValue();
    }

    private final int get_1A() {
        return ((Number) this.f315443n.getValue()).intValue();
    }

    private final int get_4A() {
        return ((Number) this.f315444o.getValue()).intValue();
    }

    /* renamed from: a */
    public void mo151287a(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        C94436h hVar = this.f315415B;
        C94436h hVar2 = C94436h.RECT_ADJUST;
        if (hVar == hVar2 || hVar == C94436h.RECT_LINE_HARD) {
            this.f315448s.setAlpha(this.f315454y);
            this.f315447r.setAlpha(this.f315454y);
            if (this.f315419F) {
                canvas.drawPath(this.f315446q, this.f315448s);
            }
            canvas.drawRect(this.f315427N, this.f315448s);
            if (this.f315415B == hVar2) {
                canvas.save();
                PointF pointF = this.f315435W;
                canvas.translate(pointF.x, pointF.y);
                if (getBlockDrawable() instanceof BitmapDrawable) {
                    getBlockDrawable().setBounds(0, 0, get_4A(), get_1A());
                    getBlockDrawable().draw(canvas);
                }
                canvas.restore();
                canvas.save();
                PointF pointF2 = this.f315434V;
                canvas.translate(pointF2.x, pointF2.y);
                if (getBlockDrawable() instanceof BitmapDrawable) {
                    getBlockDrawable().setBounds(0, 0, get_4A(), get_1A());
                    getBlockDrawable().draw(canvas);
                }
                canvas.restore();
            }
        }
    }

    /* renamed from: b */
    public final void mo151288b() {
        ValueAnimator valueAnimator = this.f315421H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{this.f315420G, -14474461});
        ofArgb.addUpdateListener(new C105992m(this));
        ofArgb.start();
        this.f315421H = ofArgb;
    }

    /* renamed from: c */
    public void mo151289c(int i, long j) {
        ValueAnimator valueAnimator = this.f315432T;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("alpha", new int[]{this.f315454y, i})});
        if (ofPropertyValuesHolder != null) {
            ofPropertyValuesHolder.addUpdateListener(new C105993n(this));
            ofPropertyValuesHolder.setDuration(300);
            ofPropertyValuesHolder.setStartDelay(j);
            ofPropertyValuesHolder.start();
        } else {
            ofPropertyValuesHolder = null;
        }
        this.f315432T = ofPropertyValuesHolder;
        if (i == 0) {
            this.f315454y = 255;
            float dimension = getContext().getResources().getDimension(C0966R.dimen.f3736cp);
            View[] viewArr = this.f315418E;
            int length = viewArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i3 < length) {
                View view = viewArr[i3];
                int i4 = i2 + 1;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout", "showCornerViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout", "showCornerViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(Float.valueOf(0.0f));
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout", "showCornerViews", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout", "showCornerViews", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.animate().setStartDelay(300).withStartAction(new C111811c(i2, view, this, dimension, view)).alpha(1.0f).setDuration(300).start();
                }
                i3++;
                i2 = i4;
            }
            C11994o oVar = this.f315431S;
            if (oVar != null) {
                ((VideoTimeView) oVar).setVisibility(0);
                return;
            }
            return;
        }
        for (View view3 : this.f315418E) {
            if (view3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout", "hideCornerView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout", "hideCornerView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        C11994o oVar2 = this.f315431S;
        if (oVar2 != null) {
            ((VideoTimeView) oVar2).setVisibility(4);
        }
    }

    /* renamed from: e */
    public final void mo151290e() {
        ValueAnimator valueAnimator = this.f315421H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{this.f315420G, -1088216285});
        ofArgb.addUpdateListener(new C105994o(this));
        ofArgb.start();
        this.f315421H = ofArgb;
    }

    public final int getBgColor() {
        return this.f315420G;
    }

    public final boolean getBlockOutsideTouch() {
        return this.f315416C;
    }

    public final C11994o getBorderVisibilityCallback() {
        return this.f315431S;
    }

    public final RectF getBoxRect() {
        return this.f315427N;
    }

    public final Paint getGridLinePaint() {
        return this.f315448s;
    }

    public final Path getGridLinePath() {
        return this.f315446q;
    }

    public final float getLimitMaxHeight() {
        return this.f315424K;
    }

    public final float getLimitMinHeight() {
        return this.f315425L;
    }

    public final C105987g getOnOperationCallback() {
        return this.f315455z;
    }

    public final C32224a<C13598b0> getOutsideTouckListener() {
        return this.f315414A;
    }

    public final boolean getShowGridLine() {
        return this.f315419F;
    }

    public final C94436h getStyle() {
        return this.f315415B;
    }

    public final RectF getVisibilityRect() {
        return this.f315423J;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f315432T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f315421H;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        C32224a<C13598b0> aVar;
        C87412m.m108594g(motionEvent, "event");
        if (!this.f315423J.contains(motionEvent.getX(), motionEvent.getY()) && (aVar = this.f315414A) != null) {
            aVar.invoke();
        }
        if (this.f315415B != C94436h.RECT_ADJUST) {
            return false;
        }
        this.f315430R = false;
        this.f315429Q = false;
        if (this.f315452w.contains(motionEvent.getX(), motionEvent.getY())) {
            this.f315429Q = true;
            C105987g gVar = this.f315455z;
            if (gVar != null) {
                gVar.mo151326b(true);
            }
        } else if (this.f315453x.contains(motionEvent.getX(), motionEvent.getY())) {
            this.f315430R = true;
            C105987g gVar2 = this.f315455z;
            if (gVar2 != null) {
                gVar2.mo151326b(false);
            }
        }
        if (this.f315429Q || this.f315430R) {
            mo151289c(255, 0);
        }
        return this.f315429Q || this.f315430R || (this.f315416C && !this.f315423J.contains(motionEvent.getX(), motionEvent.getY()));
    }

    public void onDraw(Canvas canvas) {
        C94436h hVar = C94436h.RECT_HARD;
        C87412m.m108594g(canvas, "canvas");
        int saveLayer = canvas.saveLayer(this.f315426M, (Paint) null);
        canvas.drawRect(this.f315426M, this.f315422I);
        this.f315422I.setXfermode(this.f315428P);
        C94436h hVar2 = C94436h.CIRCLE;
        C94436h hVar3 = this.f315415B;
        if (hVar2 == hVar3) {
            canvas.drawCircle(this.f315423J.centerX(), this.f315423J.centerY(), Math.min(this.f315423J.width(), this.f315423J.height()) / ((float) 2), this.f315422I);
        } else if (C94436h.RECT_ADJUST == hVar3 || hVar == hVar3 || C94436h.RECT_LINE_HARD == hVar3) {
            canvas.drawRect(this.f315423J, this.f315422I);
        }
        this.f315422I.setXfermode((Xfermode) null);
        canvas.restoreToCount(saveLayer);
        C94436h hVar4 = this.f315415B;
        if (!(hVar4 == hVar2 || hVar4 == hVar || C87412m.m108589b(this.f315423J, this.f315433U))) {
            this.f315433U.set(this.f315423J);
            C105987g gVar = this.f315455z;
            if (gVar != null) {
                gVar.mo151327c(this.f315423J);
            }
            this.f315427N.set(this.f315423J);
            this.f315427N.set(this.f315423J.left + getBOX_PADDING(), this.f315423J.top + getBOX_PADDING(), this.f315423J.right - getBOX_PADDING(), this.f315423J.bottom - getBOX_PADDING());
            RectF rectF = this.f315427N;
            float f = (float) 2;
            float width = rectF.left + (rectF.width() / f);
            float f2 = this.f315427N.bottom;
            this.f315453x.set(width - (getTOUCH_BLOCK_PADDING() * f), f2 - (getTOUCH_BLOCK_PADDING() * 1.5f), (getTOUCH_BLOCK_PADDING() * f) + width, f2 + (getTOUCH_BLOCK_PADDING() * 1.5f));
            this.f315434V.set(((this.f315427N.width() / f) - ((float) (get_4A() / 2))) + this.f315423J.left, this.f315427N.top - ((float) (get_1A() / 2)));
            this.f315435W.set(((this.f315427N.width() / f) - ((float) (get_4A() / 2))) + this.f315423J.left, this.f315427N.bottom - ((float) (get_1A() / 2)));
            float f3 = this.f315427N.top;
            this.f315452w.set(width - (getTOUCH_BLOCK_PADDING() * f), f3 - (getTOUCH_BLOCK_PADDING() * 1.5f), width + (f * getTOUCH_BLOCK_PADDING()), f3 + (getTOUCH_BLOCK_PADDING() * 1.5f));
            this.f315446q.reset();
            for (int i = 1; i < 3; i++) {
                Path path = this.f315446q;
                RectF rectF2 = this.f315427N;
                float f4 = (float) 3;
                float f5 = (float) i;
                path.moveTo(rectF2.left + ((rectF2.width() / f4) * f5), this.f315427N.top);
                Path path2 = this.f315446q;
                RectF rectF3 = this.f315427N;
                path2.lineTo(rectF3.left + ((rectF3.width() / f4) * f5), this.f315427N.bottom);
                Path path3 = this.f315446q;
                RectF rectF4 = this.f315427N;
                path3.moveTo(rectF4.left, rectF4.top + ((rectF4.height() / f4) * f5));
                Path path4 = this.f315446q;
                RectF rectF5 = this.f315427N;
                path4.lineTo(rectF5.right, rectF5.top + ((rectF5.height() / f4) * f5));
            }
        }
        mo151287a(canvas);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!z) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        mo151289c(255, 500);
        float f = (float) i;
        float f2 = (float) i3;
        this.f315426M.set(f, (float) i2, f2, (float) i4);
        if (this.f315423J.isEmpty()) {
            this.f315423J.set(f, (float) ((getHeight() / 4) + i2), f2, (float) (i4 - (getHeight() / 4)));
        }
        boolean z2 = true;
        if (this.f315424K == 0.0f) {
            setLimitMaxHeight(this.f315426M.height() / ((float) 2));
        }
        if (this.f315425L != 0.0f) {
            z2 = false;
        }
        if (z2) {
            setLimitMinHeight(this.f315426M.height() / ((float) 4));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C87412m.m108594g(motionEvent, "e");
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "event");
        C87412m.m108594g(motionEvent2, "e2");
        motionEvent.toString();
        if (this.f315429Q) {
            RectF rectF = this.f315423J;
            rectF.top -= f2;
            rectF.bottom += f2;
        }
        if (this.f315430R) {
            RectF rectF2 = this.f315423J;
            rectF2.top += f2;
            rectF2.bottom -= f2;
        }
        float height = this.f315423J.height();
        float f3 = this.f315424K;
        if (height > f3) {
            float height2 = f3 - this.f315423J.height();
            RectF rectF3 = this.f315423J;
            float f4 = height2 / ((float) 2);
            rectF3.top -= f4;
            rectF3.bottom += f4;
        } else {
            float height3 = this.f315423J.height();
            float f5 = this.f315425L;
            if (height3 < f5) {
                float height4 = f5 - this.f315423J.height();
                RectF rectF4 = this.f315423J;
                float f6 = height4 / ((float) 2);
                rectF4.top -= f6;
                rectF4.bottom += f6;
            }
        }
        postInvalidate();
        return this.f315430R || this.f315429Q;
    }

    public void onShowPress(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C87412m.m108594g(motionEvent, "e");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if ((motionEvent.getAction() == 3 || motionEvent.getAction() == 1) && (this.f315429Q || this.f315430R)) {
            mo151289c(0, 1000);
            C105987g gVar = this.f315455z;
            if (gVar != null) {
                gVar.mo151325a(this.f315429Q);
            }
        }
        GestureDetector touchDetector = getTouchDetector();
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector = touchDetector;
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = touchDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }

    public final void setBelongBottomBlock(boolean z) {
        this.f315430R = z;
    }

    public final void setBelongTopBlock(boolean z) {
        this.f315429Q = z;
    }

    public final void setBgColor(int i) {
        this.f315422I.setColor(i);
        this.f315420G = i;
    }

    public final void setBlockOutsideTouch(boolean z) {
        this.f315416C = z;
    }

    public final void setBorderVisibilityCallback(C11994o oVar) {
        this.f315431S = oVar;
    }

    public final void setLimitMaxHeight(float f) {
        this.f315424K = f;
        postInvalidate();
    }

    public final void setLimitMinHeight(float f) {
        this.f315425L = f;
        postInvalidate();
    }

    public final void setOnOperationCallback(C105987g gVar) {
        this.f315455z = gVar;
    }

    public final void setOutsideTouckListener(C32224a<C13598b0> aVar) {
        this.f315414A = aVar;
    }

    public final void setShowGridLine(boolean z) {
        this.f315419F = z;
    }

    public final void setStyle(C94436h hVar) {
        C87412m.m108594g(hVar, "value");
        this.f315415B = hVar;
        postInvalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WxCropOperationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        new Path();
        new Path();
        new Path();
        new Path();
        new Path();
        new Path();
        this.f315447r = new Paint();
        this.f315448s = new Paint();
        this.f315449t = new Paint();
        this.f315450u = new Paint();
        this.f315451v = new Paint();
        this.f315452w = new RectF();
        this.f315453x = new RectF();
        this.f315415B = C94436h.RECT_ADJUST;
        this.f315417D = C36568h.m40985a(new C105991l(this));
        View[] viewArr = new View[8];
        for (int i = 0; i < 8; i++) {
            viewArr[i] = null;
        }
        this.f315418E = viewArr;
        this.f315419F = true;
        setBackgroundColor(0);
        this.f315447r.setColor(-1);
        this.f315447r.setStrokeWidth(getBOX_LINE_WIDTH());
        this.f315447r.setStyle(Paint.Style.STROKE);
        this.f315447r.setAntiAlias(true);
        this.f315448s.set(this.f315447r);
        this.f315448s.setStrokeWidth(getBOX_GIRD_WIDTH());
        this.f315449t.set(this.f315447r);
        this.f315449t.setStrokeWidth(getCORNER_WIDTH());
        this.f315450u.set(this.f315447r);
        this.f315450u.setStrokeCap(Paint.Cap.ROUND);
        this.f315450u.setStrokeWidth(getBLOCK_WIDTH());
        this.f315451v.set(this.f315447r);
        this.f315451v.setStrokeCap(Paint.Cap.ROUND);
        this.f315451v.setStrokeWidth(getBOX_GIRD_WIDTH());
        this.f315451v.setColor(-7829368);
        this.f315420G = Color.parseColor("#bf232323");
        Paint paint = new Paint();
        paint.setDither(false);
        paint.setColor(this.f315420G);
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(true);
        this.f315422I = paint;
        this.f315423J = new RectF();
        this.f315426M = new RectF();
        this.f315427N = new RectF();
        this.f315428P = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f315433U = new RectF();
        this.f315434V = new PointF();
        this.f315435W = new PointF();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WxCropOperationLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        new Path();
        new Path();
        new Path();
        new Path();
        new Path();
        new Path();
        this.f315447r = new Paint();
        this.f315448s = new Paint();
        this.f315449t = new Paint();
        this.f315450u = new Paint();
        this.f315451v = new Paint();
        this.f315452w = new RectF();
        this.f315453x = new RectF();
        this.f315415B = C94436h.RECT_ADJUST;
        this.f315417D = C36568h.m40985a(new C105991l(this));
        View[] viewArr = new View[8];
        for (int i2 = 0; i2 < 8; i2++) {
            viewArr[i2] = null;
        }
        this.f315418E = viewArr;
        this.f315419F = true;
        setBackgroundColor(0);
        this.f315447r.setColor(-1);
        this.f315447r.setStrokeWidth(getBOX_LINE_WIDTH());
        this.f315447r.setStyle(Paint.Style.STROKE);
        this.f315447r.setAntiAlias(true);
        this.f315448s.set(this.f315447r);
        this.f315448s.setStrokeWidth(getBOX_GIRD_WIDTH());
        this.f315449t.set(this.f315447r);
        this.f315449t.setStrokeWidth(getCORNER_WIDTH());
        this.f315450u.set(this.f315447r);
        this.f315450u.setStrokeCap(Paint.Cap.ROUND);
        this.f315450u.setStrokeWidth(getBLOCK_WIDTH());
        this.f315451v.set(this.f315447r);
        this.f315451v.setStrokeCap(Paint.Cap.ROUND);
        this.f315451v.setStrokeWidth(getBOX_GIRD_WIDTH());
        this.f315451v.setColor(-7829368);
        this.f315420G = Color.parseColor("#bf232323");
        Paint paint = new Paint();
        paint.setDither(false);
        paint.setColor(this.f315420G);
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(true);
        this.f315422I = paint;
        this.f315423J = new RectF();
        this.f315426M = new RectF();
        this.f315427N = new RectF();
        this.f315428P = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f315433U = new RectF();
        this.f315434V = new PointF();
        this.f315435W = new PointF();
    }
}
