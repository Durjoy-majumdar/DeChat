package com.tencent.p014mm.plugin.scanner.p101ui.widget;

import android.animation.Animator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82766t1;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanProductMaskDecorView;
import com.tencent.p014mm.plugin.scanner.view.C71029e;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C76879j;
import nl2.C109753o;
import qo3.C89779i0;
import rx3.C13598b0;
import tl2.C78037h;
import ul2.C111210o;
import ul2.C111212p;
import ul2.C111214q;
import ul2.C111216r;
import ul2.C111217s;
import ul2.C111218u;
import ul2.C111219v;
import ul2.C14246t;
import vk2.C111554i;
import vk2.C111555k;
import vl2.C111557w;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\u001b\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 B#\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\"J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u0006\u0010\u001a\u001a\u00020\u0006¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView;", "Lcom/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView;", "Lvk2/i;", "Lvk2/k;", "Landroid/graphics/Point;", "getPreviewImageSize", "", "getLayoutId", "Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView;", "getScanProductView", "Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$d;", "scanProductCallBack", "Lrx3/b0;", "setScanProductCallBack", "Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$e;", "listener", "setScanProductOnItemClickListener", "bottomHeight", "setBottomExtraHeight", "", "translationY", "setBackgroundTransY", "getBackgroundTransY", "setMarkViewTransY", "getMarkViewTransY", "getMarkViewHeight", "getQrCodeButtonHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView */
public final class ScanCodeProductMergeMaskView extends ScanCodeMaskView implements C111554i, C111555k {

    /* renamed from: j1 */
    public static final /* synthetic */ int f316025j1 = 0;

    /* renamed from: R0 */
    public View f316026R0;

    /* renamed from: S0 */
    public ImageView f316027S0;

    /* renamed from: T0 */
    public ImageView f316028T0;

    /* renamed from: U0 */
    public ImageView f316029U0;

    /* renamed from: V0 */
    public View f316030V0;

    /* renamed from: W0 */
    public ScanProductMaskDecorView f316031W0;

    /* renamed from: X0 */
    public View f316032X0;

    /* renamed from: Y0 */
    public LinearInterpolator f316033Y0;

    /* renamed from: Z0 */
    public DecelerateInterpolator f316034Z0;

    /* renamed from: a1 */
    public boolean f316035a1;

    /* renamed from: b1 */
    public boolean f316036b1;

    /* renamed from: c1 */
    public boolean f316037c1;

    /* renamed from: d1 */
    public Bitmap f316038d1;

    /* renamed from: e1 */
    public Bitmap f316039e1;

    /* renamed from: f1 */
    public boolean f316040f1;

    /* renamed from: g1 */
    public int f316041g1;

    /* renamed from: h1 */
    public C89779i0 f316042h1;

    /* renamed from: i1 */
    public Vibrator f316043i1;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView$a */
    public static final class C106118a {

        /* renamed from: a */
        public final C109753o f316044a;

        /* renamed from: b */
        public final boolean f316045b;

        public C106118a(C109753o oVar, boolean z) {
            C87412m.m108594g(oVar, "data");
            this.f316044a = oVar;
            this.f316045b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C106118a)) {
                return false;
            }
            C106118a aVar = (C106118a) obj;
            return C87412m.m108589b(this.f316044a, aVar.f316044a) && this.f316045b == aVar.f316045b;
        }

        public int hashCode() {
            int hashCode = this.f316044a.hashCode() * 31;
            boolean z = this.f316045b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "ScanMergeSuccessDataWrapper(data=" + this.f316044a + ", needSuccessMarkAnimation=" + this.f316045b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView$b */
    public static final class C106119b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ScanCodeProductMergeMaskView f316046d;

        /* renamed from: e */
        public final /* synthetic */ boolean f316047e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106119b(ScanCodeProductMergeMaskView scanCodeProductMergeMaskView, boolean z) {
            super(0);
            this.f316046d = scanCodeProductMergeMaskView;
            this.f316047e = z;
        }

        public Object invoke() {
            ImageView imageView = this.f316046d.f316029U0;
            if (imageView != null) {
                imageView.setVisibility(8);
                ImageView imageView2 = this.f316046d.f316029U0;
                if (imageView2 != null) {
                    imageView2.setImageBitmap((Bitmap) null);
                    ImageView imageView3 = this.f316046d.f316027S0;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                        ImageView imageView4 = this.f316046d.f316027S0;
                        if (imageView4 != null) {
                            imageView4.setImageBitmap((Bitmap) null);
                            ImageView imageView5 = this.f316046d.f316028T0;
                            if (imageView5 != null) {
                                imageView5.setVisibility(8);
                                ImageView imageView6 = this.f316046d.f316028T0;
                                if (imageView6 != null) {
                                    imageView6.setImageBitmap((Bitmap) null);
                                    this.f316046d.mo151859t(!this.f316047e);
                                    View view = this.f316046d.f316026R0;
                                    if (view != null) {
                                        C9556a aVar = new C9556a();
                                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                        aVar.mo10233c(8);
                                        View view2 = view;
                                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                        C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        View view3 = this.f316046d.f316030V0;
                                        if (view3 != null) {
                                            C9556a aVar2 = new C9556a();
                                            aVar2.mo10233c(8);
                                            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                            C117292a.m165359e(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            View view4 = this.f316046d.f316032X0;
                                            if (view4 != null) {
                                                view4.setTranslationY(0.0f);
                                            }
                                            ScanProductMaskDecorView scanProductMaskDecorView = this.f316046d.f316031W0;
                                            if (scanProductMaskDecorView != null) {
                                                scanProductMaskDecorView.setAlpha(1.0f);
                                                ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f316046d;
                                                scanCodeProductMergeMaskView.f316035a1 = false;
                                                scanCodeProductMergeMaskView.f316036b1 = false;
                                                scanCodeProductMergeMaskView.f316037c1 = false;
                                                scanCodeProductMergeMaskView.f316039e1 = null;
                                                scanCodeProductMergeMaskView.mo151778G();
                                                return C13598b0.f38549a;
                                            }
                                            C87412m.m108603p("scanProductListView");
                                            throw null;
                                        }
                                        C87412m.m108603p("successMarkView");
                                        throw null;
                                    }
                                    C87412m.m108603p("maskView");
                                    throw null;
                                }
                                C87412m.m108603p(C82766t1.NAME);
                                throw null;
                            }
                            C87412m.m108603p(C82766t1.NAME);
                            throw null;
                        }
                        C87412m.m108603p("bottomBlurView");
                        throw null;
                    }
                    C87412m.m108603p("bottomBlurView");
                    throw null;
                }
                C87412m.m108603p("blurView");
                throw null;
            }
            C87412m.m108603p("blurView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView$c */
    public static final class C106120c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ScanCodeProductMergeMaskView f316048d;

        public C106120c(ScanCodeProductMergeMaskView scanCodeProductMergeMaskView) {
            this.f316048d = scanCodeProductMergeMaskView;
        }

        public final void run() {
            ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f316048d;
            ScanProductMaskDecorView scanProductMaskDecorView = scanCodeProductMergeMaskView.f316031W0;
            if (scanProductMaskDecorView == null) {
                C87412m.m108603p("scanProductListView");
                throw null;
            } else if (scanProductMaskDecorView != null) {
                scanProductMaskDecorView.mo151817d(scanCodeProductMergeMaskView.getMBottomExtraHeight() + this.f316048d.getProductListBottomMarginDelta());
            } else {
                C87412m.m108603p("scanProductListView");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView$d */
    public static final class C106121d implements ScanProductMaskDecorView.C106130d {

        /* renamed from: a */
        public final /* synthetic */ ScanProductMaskDecorView.C106130d f316049a;

        /* renamed from: b */
        public final /* synthetic */ ScanCodeProductMergeMaskView f316050b;

        public C106121d(ScanProductMaskDecorView.C106130d dVar, ScanCodeProductMergeMaskView scanCodeProductMergeMaskView) {
            this.f316049a = dVar;
            this.f316050b = scanCodeProductMergeMaskView;
        }

        /* renamed from: a */
        public void mo24350a(int i) {
            this.f316050b.f316041g1 = i;
            this.f316049a.mo24350a(i);
            if (i == 3) {
                ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f316050b;
                ImageView imageView = scanCodeProductMergeMaskView.f316029U0;
                if (imageView != null) {
                    ViewPropertyAnimator animate = imageView.animate();
                    if (animate != null) {
                        animate.cancel();
                    }
                    View view = scanCodeProductMergeMaskView.f316026R0;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "switchScanProductViewExpand", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "switchScanProductViewExpand", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C111557w.m152065a(view2, 0.0f, 0.7f, 250, new C14246t(scanCodeProductMergeMaskView));
                        view.setOnClickListener(new C111218u(scanCodeProductMergeMaskView));
                        C111557w.m152065a(scanCodeProductMergeMaskView.getScanTips(), 1.0f, 0.0f, 250, (Animator.AnimatorListener) null);
                        return;
                    }
                    C87412m.m108603p("maskView");
                    throw null;
                }
                C87412m.m108603p("blurView");
                throw null;
            } else if (i == 6) {
                ScanCodeProductMergeMaskView scanCodeProductMergeMaskView2 = this.f316050b;
                Bitmap bitmap = scanCodeProductMergeMaskView2.f316038d1;
                if (bitmap != null && !bitmap.isRecycled()) {
                    ImageView imageView2 = scanCodeProductMergeMaskView2.f316029U0;
                    if (imageView2 != null) {
                        imageView2.setAlpha(1.0f);
                        imageView2.setImageBitmap(scanCodeProductMergeMaskView2.f316038d1);
                        imageView2.setVisibility(0);
                        scanCodeProductMergeMaskView2.f316040f1 = true;
                    } else {
                        C87412m.m108603p("blurView");
                        throw null;
                    }
                }
                View view3 = scanCodeProductMergeMaskView2.f316026R0;
                if (view3 != null) {
                    view3.setOnClickListener((View.OnClickListener) null);
                } else {
                    C87412m.m108603p("maskView");
                    throw null;
                }
            }
        }

        /* renamed from: b */
        public void mo24351b(int i, long j, int i2) {
            this.f316049a.mo24351b(i, j, i2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScanCodeProductMergeMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    private final Point getPreviewImageSize() {
        Bitmap bitmap = this.f316039e1;
        if (bitmap != null) {
            C87412m.m108591d(bitmap);
            if (!bitmap.isRecycled()) {
                try {
                    Bitmap bitmap2 = this.f316039e1;
                    C87412m.m108591d(bitmap2);
                    Bitmap bitmap3 = this.f316039e1;
                    C87412m.m108591d(bitmap3);
                    float width = (((float) bitmap2.getWidth()) * 1.0f) / ((float) bitmap3.getHeight());
                    if (width < (((float) getMeasuredWidth()) * 1.0f) / ((float) getMeasuredHeight())) {
                        int measuredHeight = getMeasuredHeight();
                        return new Point((int) (width * ((float) measuredHeight)), measuredHeight);
                    }
                    int measuredWidth = getMeasuredWidth();
                    return new Point(measuredWidth, (int) (((float) measuredWidth) / width));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.ScanCodeProductMergeMaskView", e, "alvinluo getPreviewImageSize exception", new Object[0]);
                    return new Point(0, 0);
                }
            }
        }
        return new Point(0, 0);
    }

    /* renamed from: F */
    public final void mo151777F(Bitmap bitmap) {
        mo151778G();
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.ScanCodeProductMergeMaskView", "alvinluo updatePreview bitmap width: %d, height: %d, showPreviewImage: %b, animateShowPreviewImage: %b", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Boolean.valueOf(this.f316036b1), Boolean.valueOf(this.f316037c1));
            this.f316039e1 = bitmap;
            ImageView imageView = this.f316028T0;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
                if (this.f316036b1) {
                    ImageView imageView2 = this.f316028T0;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        if (this.f316037c1) {
                            ImageView imageView3 = this.f316028T0;
                            if (imageView3 != null) {
                                imageView3.setAlpha(0.0f);
                            } else {
                                C87412m.m108603p(C82766t1.NAME);
                                throw null;
                            }
                        } else {
                            ImageView imageView4 = this.f316028T0;
                            if (imageView4 != null) {
                                imageView4.setAlpha(1.0f);
                            } else {
                                C87412m.m108603p(C82766t1.NAME);
                                throw null;
                            }
                        }
                    } else {
                        C87412m.m108603p(C82766t1.NAME);
                        throw null;
                    }
                } else {
                    ImageView imageView5 = this.f316028T0;
                    if (imageView5 != null) {
                        imageView5.setVisibility(8);
                    } else {
                        C87412m.m108603p(C82766t1.NAME);
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p(C82766t1.NAME);
                throw null;
            }
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.ScanCodeProductMergeMaskView", "setPreviewBitmap width: %d, height: %d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
            new C111210o(this, bitmap, false).invoke();
        }
    }

    /* renamed from: G */
    public final void mo151778G() {
        Bitmap bitmap = this.f316038d1;
        if (bitmap != null) {
            C87412m.m108591d(bitmap);
            if (!bitmap.isRecycled()) {
                Bitmap bitmap2 = this.f316038d1;
                C87412m.m108591d(bitmap2);
                bitmap2.recycle();
                this.f316038d1 = null;
            }
        }
    }

    /* renamed from: a */
    public void mo33407a() {
    }

    /* renamed from: b */
    public void mo33408b() {
    }

    /* renamed from: c */
    public void mo33409c() {
    }

    /* renamed from: d */
    public void mo33410d(int i, float f, float f2) {
        boolean z;
        int i2 = i;
        float f3 = f2;
        if (!(this.f316041g1 == 1)) {
            float max = Math.max(0.0f, Math.min(1.0f, f3));
            if (i2 == 1 || i2 == 2) {
                if (max >= 0.5f && i2 == 1) {
                    z = this.f316035a1;
                    float f4 = (max - 0.5f) / 0.5f;
                    ImageView imageView = this.f316029U0;
                    if (imageView != null) {
                        imageView.setAlpha(this.f316034Z0.getInterpolation(f4));
                        View view = this.f316030V0;
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(Float.valueOf(1.0f - f4));
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            ImageView imageView2 = this.f316028T0;
                            if (imageView2 != null) {
                                ImageView imageView3 = this.f316029U0;
                                if (imageView3 != null) {
                                    imageView2.setAlpha(1.0f - imageView3.getAlpha());
                                } else {
                                    C87412m.m108603p("blurView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p(C82766t1.NAME);
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("successMarkView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("blurView");
                        throw null;
                    }
                } else if (i2 == 2) {
                    z = this.f316035a1;
                    ImageView imageView4 = this.f316029U0;
                    if (imageView4 != null) {
                        imageView4.setAlpha(this.f316034Z0.getInterpolation(max));
                        View view3 = this.f316030V0;
                        if (view3 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(Float.valueOf(1.0f - max));
                            View view4 = view3;
                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            ImageView imageView5 = this.f316028T0;
                            if (imageView5 != null) {
                                ImageView imageView6 = this.f316029U0;
                                if (imageView6 != null) {
                                    imageView5.setAlpha(1.0f - imageView6.getAlpha());
                                } else {
                                    C87412m.m108603p("blurView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p(C82766t1.NAME);
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("successMarkView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("blurView");
                        throw null;
                    }
                } else {
                    View view5 = this.f316030V0;
                    if (view5 != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(Float.valueOf(1.0f));
                        View view6 = view5;
                        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        ImageView imageView7 = this.f316028T0;
                        if (imageView7 != null) {
                            imageView7.setAlpha(1.0f);
                            z = false;
                        } else {
                            C87412m.m108603p(C82766t1.NAME);
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("successMarkView");
                        throw null;
                    }
                }
                View view7 = this.f316026R0;
                if (view7 != null) {
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(Float.valueOf(0.5f));
                    View view8 = view7;
                    C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view7.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    C87412m.m108603p("maskView");
                    throw null;
                }
            } else {
                View view9 = this.f316026R0;
                if (view9 != null) {
                    float max2 = Math.max(0.0f, Math.min(0.5f, 1.0f - max));
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar5.mo10233c(Float.valueOf(max2));
                    C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view9.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    if (this.f316036b1) {
                        if (this.f316037c1) {
                            float max3 = Math.max(0.0f, Math.min(1.0f, (f3 - 0.5f) / 0.5f));
                            ImageView imageView8 = this.f316028T0;
                            if (imageView8 != null) {
                                imageView8.setAlpha(1.0f - max3);
                                Object[] objArr = new Object[2];
                                ImageView imageView9 = this.f316028T0;
                                if (imageView9 != null) {
                                    objArr[0] = Float.valueOf(imageView9.getAlpha());
                                    objArr[1] = Float.valueOf(max3);
                                    Log.m105927v("MicroMsg.ScanCodeProductMergeMaskView", "alvinluo onDialogMovedY previewImage.alpha: %f, targetFactor: %f", objArr);
                                } else {
                                    C87412m.m108603p(C82766t1.NAME);
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p(C82766t1.NAME);
                                throw null;
                            }
                        } else {
                            ImageView imageView10 = this.f316028T0;
                            if (imageView10 != null) {
                                imageView10.setAlpha(1.0f);
                                z = false;
                            } else {
                                C87412m.m108603p(C82766t1.NAME);
                                throw null;
                            }
                        }
                    }
                    z = false;
                } else {
                    C87412m.m108603p("maskView");
                    throw null;
                }
            }
            ImageView imageView11 = this.f316029U0;
            if (imageView11 != null) {
                imageView11.setVisibility(z ? 0 : 8);
                View view10 = this.f316026R0;
                if (view10 != null) {
                    C9556a aVar6 = new C9556a();
                    aVar6.mo10233c(0);
                    View view11 = view10;
                    C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view11, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Object[] objArr2 = new Object[7];
                    objArr2[0] = Integer.valueOf(i);
                    objArr2[1] = Float.valueOf(f);
                    objArr2[2] = Float.valueOf(f2);
                    objArr2[3] = Boolean.valueOf(z);
                    ImageView imageView12 = this.f316029U0;
                    if (imageView12 != null) {
                        objArr2[4] = Float.valueOf(imageView12.getAlpha());
                        View view12 = this.f316026R0;
                        if (view12 != null) {
                            objArr2[5] = Float.valueOf(view12.getAlpha());
                            ImageView imageView13 = this.f316028T0;
                            if (imageView13 != null) {
                                objArr2[6] = Float.valueOf(imageView13.getAlpha());
                                Log.m105927v("MicroMsg.ScanCodeProductMergeMaskView", "alvinluo onDialogMovedY dialogState: %d, offsetY: %s, factor: %f, showBlurView: %b, blurView alpha: %s, maskView alpha: %s, previewImage alpha: %s", objArr2);
                                return;
                            }
                            C87412m.m108603p(C82766t1.NAME);
                            throw null;
                        }
                        C87412m.m108603p("maskView");
                        throw null;
                    }
                    C87412m.m108603p("blurView");
                    throw null;
                }
                C87412m.m108603p("maskView");
                throw null;
            }
            C87412m.m108603p("blurView");
            throw null;
        }
    }

    /* renamed from: e */
    public void mo33411e() {
    }

    /* renamed from: f */
    public void mo33412f(int i, float f, float f2) {
    }

    /* renamed from: g */
    public void mo33413g() {
    }

    public float getBackgroundTransY() {
        View view = this.f316032X0;
        if (view != null) {
            return view.getTranslationY();
        }
        return 0.0f;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b4p;
    }

    public float getMarkViewHeight() {
        return (float) getSuccessMarkViewSize();
    }

    public float getMarkViewTransY() {
        View view = this.f316030V0;
        if (view != null) {
            return view.getTranslationY();
        }
        C87412m.m108603p("successMarkView");
        throw null;
    }

    public final int getQrCodeButtonHeight() {
        try {
            return getMyQrCodeButton().getHeight();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanCodeProductMergeMaskView", e, "getQrCodeButtonHeight", new Object[0]);
            return 0;
        }
    }

    public final ScanProductMaskDecorView getScanProductView() {
        ScanProductMaskDecorView scanProductMaskDecorView = this.f316031W0;
        if (scanProductMaskDecorView != null) {
            return scanProductMaskDecorView;
        }
        C87412m.m108603p("scanProductListView");
        throw null;
    }

    /* renamed from: i */
    public void mo151679i(View view) {
        this.f316032X0 = view;
        boolean z = true;
        Log.m105927v("MicroMsg.ScanCodeProductMergeMaskView", "alvinluo attachBackgroundView source: %d", Integer.valueOf(getMScanSource()));
        if (view instanceof TextureView) {
            if (getMScanSource() != 3) {
                z = false;
            }
            if (z) {
                ((C119157j) C119157j.f356862d).mo183875f(new C111219v(this, (TextureView) view));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d8  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo151680m(boolean r9) {
        /*
            r8 = this;
            com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView$b r0 = new com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView$b
            r0.<init>(r8, r9)
            android.widget.ImageView r1 = r8.f316029U0
            java.lang.String r2 = "blurView"
            r3 = 0
            if (r1 == 0) goto L_0x00e7
            int r1 = r1.getVisibility()
            java.lang.String r4 = "bottomBlurView"
            java.lang.String r5 = "previewImage"
            if (r1 == 0) goto L_0x003c
            android.widget.ImageView r1 = r8.f316028T0
            if (r1 == 0) goto L_0x0038
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L_0x003c
            android.widget.ImageView r1 = r8.f316027S0
            if (r1 == 0) goto L_0x0034
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x002c
            goto L_0x003c
        L_0x002c:
            super.mo151680m(r9)
            r0.invoke()
            goto L_0x00cf
        L_0x0034:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x0038:
            gy3.C87412m.m108603p(r5)
            throw r3
        L_0x003c:
            com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView r1 = r8.f316031W0
            if (r1 == 0) goto L_0x00e0
            r6 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r6)
            super.mo151680m(r9)
            android.widget.ImageView r9 = r8.f316028T0
            if (r9 == 0) goto L_0x00dc
            float r9 = r9.getAlpha()
            r1 = 0
            r7 = 1
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0058
            r9 = 1
            goto L_0x0059
        L_0x0058:
            r9 = 0
        L_0x0059:
            if (r9 == 0) goto L_0x006b
            android.widget.ImageView r9 = r8.f316028T0
            if (r9 == 0) goto L_0x0067
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x006b
            r9 = 1
            goto L_0x006c
        L_0x0067:
            gy3.C87412m.m108603p(r5)
            throw r3
        L_0x006b:
            r9 = 0
        L_0x006c:
            android.widget.ImageView r5 = r8.f316027S0
            if (r5 == 0) goto L_0x00d8
            float r5 = r5.getAlpha()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x007a
            r5 = 1
            goto L_0x007b
        L_0x007a:
            r5 = 0
        L_0x007b:
            if (r5 == 0) goto L_0x008d
            android.widget.ImageView r5 = r8.f316027S0
            if (r5 == 0) goto L_0x0089
            int r4 = r5.getVisibility()
            if (r4 != 0) goto L_0x008d
            r1 = 1
            goto L_0x008d
        L_0x0089:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x008d:
            android.widget.ImageView r4 = r8.f316029U0
            if (r4 == 0) goto L_0x00d4
            r4.setAlpha(r6)
            android.widget.ImageView r4 = r8.f316029U0
            if (r4 == 0) goto L_0x00d0
            android.view.ViewPropertyAnimator r2 = r4.animate()
            if (r2 == 0) goto L_0x00cf
            r3 = 0
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            if (r2 == 0) goto L_0x00cf
            boolean r3 = r8.f316040f1
            if (r3 == 0) goto L_0x00ac
            r3 = 500(0x1f4, double:2.47E-321)
            goto L_0x00ae
        L_0x00ac:
            r3 = 300(0x12c, double:1.48E-321)
        L_0x00ae:
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r3)
            if (r2 == 0) goto L_0x00cf
            android.view.animation.LinearInterpolator r3 = r8.f316033Y0
            android.view.ViewPropertyAnimator r2 = r2.setInterpolator(r3)
            if (r2 == 0) goto L_0x00cf
            ul2.k r3 = new ul2.k
            r3.<init>(r0, r8)
            android.view.ViewPropertyAnimator r0 = r2.setListener(r3)
            if (r0 == 0) goto L_0x00cf
            ul2.l r2 = new ul2.l
            r2.<init>(r8, r9, r1)
            r0.setUpdateListener(r2)
        L_0x00cf:
            return
        L_0x00d0:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x00d4:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x00d8:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x00dc:
            gy3.C87412m.m108603p(r5)
            throw r3
        L_0x00e0:
            java.lang.String r9 = "scanProductListView"
            gy3.C87412m.m108603p(r9)
            throw r3
        L_0x00e7:
            gy3.C87412m.m108603p(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView.mo151680m(boolean):void");
    }

    /* renamed from: o */
    public void mo151681o(Object obj, C71029e eVar) {
        PointF pointF;
        Object obj2 = obj;
        C71029e eVar2 = eVar;
        C87412m.m108594g(obj2, "data");
        Log.m105927v("MicroMsg.ScanCodeProductMergeMaskView", "onScanSuccess data: %s", obj2);
        if (obj2 instanceof C106118a) {
            C106118a aVar = (C106118a) obj2;
            C109753o oVar = aVar.f316044a;
            boolean z = aVar.f316045b;
            if (!(this.f316041g1 == 1)) {
                ScanProductMaskDecorView scanProductMaskDecorView = this.f316031W0;
                if (scanProductMaskDecorView != null) {
                    mo151719A(200, new C111214q(scanProductMaskDecorView.getAlpha() == 1.0f, this));
                } else {
                    C87412m.m108603p("scanProductListView");
                    throw null;
                }
            }
            if (z) {
                setSuccessAnimationListener(eVar2);
                RectF rectF = oVar.f328503j;
                if (rectF != null) {
                    float f = (rectF.left + rectF.right) / 2.0f;
                    float f2 = (rectF.top + rectF.bottom) / 2.0f;
                    Log.m105926v("MicroMsg.ScanCodeProductMergeMaskView", "alvinluo showSuccessView with animation");
                    if (getMScanSource() == 3) {
                        float measuredWidth = ((float) getMeasuredWidth()) * f;
                        float measuredHeight = ((float) getMeasuredHeight()) * f2;
                        Log.m105927v("MicroMsg.ScanCodeProductMergeMaskView", "alvinluo getRealPosition center: %f, %f, result: %f, %f", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(measuredWidth), Float.valueOf(measuredHeight));
                        pointF = new PointF(measuredWidth, measuredHeight);
                    } else {
                        Point previewImageSize = getPreviewImageSize();
                        int measuredWidth2 = (getMeasuredWidth() - previewImageSize.x) / 2;
                        int measuredHeight2 = (getMeasuredHeight() - previewImageSize.y) / 2;
                        Log.m105927v("MicroMsg.ScanCodeProductMergeMaskView", "alvinluo getRealPositionForImage previewImageSize: %s, centerX: %s, centerY: %s, left: %d, top: %d", previewImageSize, Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(measuredWidth2), Integer.valueOf(measuredHeight2));
                        pointF = new PointF(((float) measuredWidth2) + (((float) previewImageSize.x) * f), ((float) measuredHeight2) + (((float) previewImageSize.y) * f2));
                    }
                    View view = this.f316030V0;
                    if (view != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "showSuccessView", "(FFLcom/tencent/mm/plugin/scanner/view/ScanResultAnimationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "showSuccessView", "(FFLcom/tencent/mm/plugin/scanner/view/ScanResultAnimationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setPivotX(((float) getSuccessMarkViewSize()) / 2.0f);
                        view.setPivotY(((float) getSuccessMarkViewSize()) / 2.0f);
                        view.setTranslationX(pointF.x - ((float) (getSuccessMarkViewSize() / 2)));
                        view.setTranslationY(pointF.y - ((float) (getSuccessMarkViewSize() / 2)));
                        view.setScaleX(0.0f);
                        view.setScaleY(0.0f);
                        View view3 = this.f316030V0;
                        if (view3 != null) {
                            C78037h.m94188a(view3, (C71029e) null);
                            View view4 = this.f316026R0;
                            if (view4 != null) {
                                C9556a aVar3 = new C9556a();
                                aVar3.mo10233c(Float.valueOf(0.0f));
                                View view5 = view4;
                                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "showSuccessView", "(FFLcom/tencent/mm/plugin/scanner/view/ScanResultAnimationListener;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                view4.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                                C117292a.m165359e(view5, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "showSuccessView", "(FFLcom/tencent/mm/plugin/scanner/view/ScanResultAnimationListener;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                C9556a aVar4 = new C9556a();
                                aVar4.mo10233c(0);
                                C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "showSuccessView", "(FFLcom/tencent/mm/plugin/scanner/view/ScanResultAnimationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                C117292a.m165359e(view5, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "showSuccessView", "(FFLcom/tencent/mm/plugin/scanner/view/ScanResultAnimationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                ImageView imageView = this.f316029U0;
                                if (imageView != null) {
                                    imageView.setVisibility(8);
                                    mo151859t(false);
                                    TextView scanTips = getScanTips();
                                    if (scanTips != null) {
                                        scanTips.setAlpha(1.0f);
                                    }
                                } else {
                                    C87412m.m108603p("blurView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("maskView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("successMarkView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("successMarkView");
                        throw null;
                    }
                }
                ((C119157j) C119157j.f356862d).mo183875f(new C111216r(this));
                postDelayed(new C111217s(this), 100);
                return;
            }
            if (eVar2 != null) {
                eVar.mo24257b();
            }
            if (eVar2 != null) {
                eVar2.mo24256a(false);
                return;
            }
            return;
        }
        ScanProductMaskDecorView scanProductMaskDecorView2 = this.f316031W0;
        if (scanProductMaskDecorView2 != null) {
            if (scanProductMaskDecorView2.getVisibility() == 0) {
                ScanProductMaskDecorView scanProductMaskDecorView3 = this.f316031W0;
                if (scanProductMaskDecorView3 != null) {
                    C111557w.m152065a(scanProductMaskDecorView3, 1.0f, 0.0f, 200, (Animator.AnimatorListener) null);
                } else {
                    C87412m.m108603p("scanProductListView");
                    throw null;
                }
            }
            super.mo151681o(obj, eVar);
            return;
        }
        C87412m.m108603p("scanProductListView");
        throw null;
    }

    /* renamed from: s */
    public void mo151685s(boolean z, DialogInterface.OnCancelListener onCancelListener) {
        if (z) {
            C89779i0 i0Var = this.f316042h1;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            this.f316042h1 = C76879j.m92723Q(getContext(), "", getResources().getString(C0966R.string.idg), false, true, onCancelListener);
            return;
        }
        C89779i0 i0Var2 = this.f316042h1;
        if (i0Var2 != null) {
            i0Var2.dismiss();
        }
    }

    public void setBackgroundTransY(float f) {
        View view = this.f316032X0;
        if (view != null) {
            view.setTranslationY(f);
        }
        ImageView imageView = this.f316029U0;
        if (imageView != null) {
            imageView.setTranslationY(f);
            ImageView imageView2 = this.f316028T0;
            if (imageView2 != null) {
                imageView2.setTranslationY(f);
                ImageView imageView3 = this.f316027S0;
                if (imageView3 != null) {
                    imageView3.setTranslationY(f);
                } else {
                    C87412m.m108603p("bottomBlurView");
                    throw null;
                }
            } else {
                C87412m.m108603p(C82766t1.NAME);
                throw null;
            }
        } else {
            C87412m.m108603p("blurView");
            throw null;
        }
    }

    public void setBottomExtraHeight(int i) {
        super.setBottomExtraHeight(i);
        post(new C106120c(this));
    }

    public void setMarkViewTransY(float f) {
        View view = this.f316030V0;
        if (view != null) {
            view.setTranslationY(f);
        } else {
            C87412m.m108603p("successMarkView");
            throw null;
        }
    }

    public final void setScanProductCallBack(ScanProductMaskDecorView.C106130d dVar) {
        C87412m.m108594g(dVar, "scanProductCallBack");
        ScanProductMaskDecorView scanProductMaskDecorView = this.f316031W0;
        if (scanProductMaskDecorView != null) {
            scanProductMaskDecorView.setScanProductCallBack(new C106121d(dVar, this));
        } else {
            C87412m.m108603p("scanProductListView");
            throw null;
        }
    }

    public final void setScanProductOnItemClickListener(ScanProductMaskDecorView.C106131e eVar) {
        C87412m.m108594g(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ScanProductMaskDecorView scanProductMaskDecorView = this.f316031W0;
        if (scanProductMaskDecorView != null) {
            scanProductMaskDecorView.setScanProductOnItemClickListener(eVar);
        } else {
            C87412m.m108603p("scanProductListView");
            throw null;
        }
    }

    /* renamed from: y */
    public void mo151752y(View view) {
        Object systemService;
        C87412m.m108594g(view, "view");
        super.mo151752y(view);
        View findViewById = view.findViewById(C0966R.C0970id.i1z);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.p…ew_blur_view_for_gallery)");
        this.f316027S0 = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.i1y);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.preview_blur_view)");
        this.f316029U0 = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.goy);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.mask_view)");
        this.f316026R0 = findViewById3;
        View findViewById4 = view.findViewById(C0966R.C0970id.i25);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.preview_image)");
        this.f316028T0 = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(C0966R.C0970id.j1z);
        C87412m.m108593f(findViewById5, "view.findViewById(R.id.scan_success_dot_view)");
        this.f316030V0 = findViewById5;
        View findViewById6 = view.findViewById(C0966R.C0970id.j1s);
        C87412m.m108593f(findViewById6, "view.findViewById(R.id.scan_product_list_view)");
        this.f316031W0 = (ScanProductMaskDecorView) findViewById6;
        if (this.f316043i1 == null && (systemService = getContext().getSystemService("vibrator")) != null) {
            this.f316043i1 = (Vibrator) systemService;
        }
        ScanProductMaskDecorView scanProductMaskDecorView = this.f316031W0;
        if (scanProductMaskDecorView != null) {
            scanProductMaskDecorView.setVisibility(0);
            ScanProductMaskDecorView scanProductMaskDecorView2 = this.f316031W0;
            if (scanProductMaskDecorView2 != null) {
                scanProductMaskDecorView2.getViewTreeObserver().addOnGlobalLayoutListener(new C111212p(this));
            } else {
                C87412m.m108603p("scanProductListView");
                throw null;
            }
        } else {
            C87412m.m108603p("scanProductListView");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanCodeProductMergeMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f316033Y0 = new LinearInterpolator();
        this.f316034Z0 = new DecelerateInterpolator();
    }
}
