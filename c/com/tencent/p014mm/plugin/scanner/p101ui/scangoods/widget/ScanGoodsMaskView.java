package com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82766t1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.api.BaseScanRequest;
import com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest;
import com.tencent.p014mm.plugin.scanner.model.C106075o0;
import com.tencent.p014mm.plugin.scanner.model.C106076p0;
import com.tencent.p014mm.plugin.scanner.model.C106082s0;
import com.tencent.p014mm.plugin.scanner.model.C106083t0;
import com.tencent.p014mm.plugin.scanner.model.C19016e1;
import com.tencent.p014mm.plugin.scanner.model.C19030n0;
import com.tencent.p014mm.plugin.scanner.view.BaseScanMaskView;
import com.tencent.p014mm.plugin.scanner.view.C71029e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TimerTask;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import lp3.C88629c;
import lp3.C88633e;
import lp3.C88643g;
import lu3.C34379c;
import nj3.C76879j;
import o40.C61926c;
import p907k3.C108867b;
import p907k3.C108879d;
import qo3.C89779i0;
import rx3.C13598b0;
import tl2.C111012a;
import tl2.C111016c;
import tl2.C111019e;
import tl2.C111024i;
import tl2.C111026j;
import tl2.C111029o;
import tl2.C111030p;
import tl2.C111032q;
import tl2.C111033s;
import tl2.C111034t;
import tl2.C111035u;
import tl2.C111036v;
import tl2.C14014g;
import tl2.C78037h;
import tl2.C90515r;
import vk2.C111554i;
import vk2.C111555k;
import vl2.C111557w;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB#\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0012\u0010\u0014\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView;", "Lcom/tencent/mm/plugin/scanner/view/BaseScanMaskView;", "Lcom/tencent/mm/plugin/scanner/api/ScanGoodsRequest;", "Lvk2/i;", "Lvk2/k;", "Landroid/graphics/Point;", "getPreviewImageSize", "request", "Lrx3/b0;", "setCustomTipsWording", "Landroid/graphics/Bitmap;", "bitmap", "setCustomBackgroundBitmap", "", "translationY", "setBackgroundTransY", "getBackgroundTransY", "setMarkViewTransY", "getMarkViewTransY", "getMarkViewHeight", "setScanRequest", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView */
public final class ScanGoodsMaskView extends BaseScanMaskView<ScanGoodsRequest> implements C111554i, C111555k {

    /* renamed from: W0 */
    public static final /* synthetic */ int f315898W0 = 0;

    /* renamed from: A */
    public ImageView f315899A;

    /* renamed from: B */
    public ImageView f315900B;

    /* renamed from: C */
    public View f315901C;

    /* renamed from: D */
    public boolean f315902D;

    /* renamed from: E */
    public ImageView f315903E;

    /* renamed from: F */
    public ImageView f315904F;

    /* renamed from: G */
    public LinearLayout f315905G;

    /* renamed from: H */
    public LinearLayout f315906H;

    /* renamed from: I */
    public ImageView f315907I;

    /* renamed from: J */
    public TextView f315908J;

    /* renamed from: K */
    public ArrayList<Runnable> f315909K;

    /* renamed from: L */
    public long f315910L;

    /* renamed from: M */
    public int f315911M;

    /* renamed from: N */
    public int f315912N;

    /* renamed from: P */
    public int f315913P;

    /* renamed from: Q */
    public int f315914Q;

    /* renamed from: Q0 */
    public boolean f315915Q0;

    /* renamed from: R */
    public boolean f315916R;

    /* renamed from: R0 */
    public C89779i0 f315917R0;

    /* renamed from: S */
    public boolean f315918S;

    /* renamed from: S0 */
    public Vibrator f315919S0;

    /* renamed from: T */
    public boolean f315920T;

    /* renamed from: T0 */
    public TimerTask f315921T0;

    /* renamed from: U */
    public Bitmap f315922U;

    /* renamed from: U0 */
    public C34379c<?> f315923U0;

    /* renamed from: V */
    public Bitmap f315924V;

    /* renamed from: V0 */
    public C108879d f315925V0;

    /* renamed from: W */
    public C71029e f315926W;

    /* renamed from: p0 */
    public LinearInterpolator f315927p0;

    /* renamed from: v */
    public ScanAnimationDotsView f315928v;

    /* renamed from: w */
    public View f315929w;

    /* renamed from: x */
    public ImageView f315930x;

    /* renamed from: x0 */
    public DecelerateInterpolator f315931x0;

    /* renamed from: y */
    public View f315932y;

    /* renamed from: y0 */
    public boolean f315933y0;

    /* renamed from: z */
    public ImageView f315934z;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView$a */
    public static final class C106100a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ScanGoodsMaskView f315935d;

        /* renamed from: e */
        public final /* synthetic */ boolean f315936e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106100a(ScanGoodsMaskView scanGoodsMaskView, boolean z) {
            super(0);
            this.f315935d = scanGoodsMaskView;
            this.f315936e = z;
        }

        public Object invoke() {
            ScanGoodsMaskView scanGoodsMaskView = this.f315935d;
            int i = ScanGoodsMaskView.f315898W0;
            scanGoodsMaskView.mo151690w(true);
            ImageView imageView = this.f315935d.f315900B;
            if (imageView != null) {
                imageView.setVisibility(8);
                ImageView imageView2 = this.f315935d.f315900B;
                if (imageView2 != null) {
                    imageView2.setImageBitmap((Bitmap) null);
                    ImageView imageView3 = this.f315935d.f315934z;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                        ImageView imageView4 = this.f315935d.f315934z;
                        if (imageView4 != null) {
                            imageView4.setImageBitmap((Bitmap) null);
                            ImageView imageView5 = this.f315935d.f315899A;
                            if (imageView5 != null) {
                                imageView5.setVisibility(8);
                                ImageView imageView6 = this.f315935d.f315899A;
                                if (imageView6 != null) {
                                    imageView6.setImageBitmap((Bitmap) null);
                                    this.f315935d.mo151859t(true ^ this.f315936e);
                                    View view = this.f315935d.f315932y;
                                    if (view != null) {
                                        C9556a aVar = new C9556a();
                                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                        aVar.mo10233c(8);
                                        View view2 = view;
                                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                        C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        View view3 = this.f315935d.f315929w;
                                        if (view3 != null) {
                                            C9556a aVar2 = new C9556a();
                                            aVar2.mo10233c(8);
                                            View view4 = view3;
                                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                            C117292a.m165359e(view4, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            View view5 = this.f315935d.f315901C;
                                            if (view5 != null) {
                                                view5.setTranslationY(0.0f);
                                            }
                                            ScanGoodsMaskView scanGoodsMaskView2 = this.f315935d;
                                            scanGoodsMaskView2.f315916R = false;
                                            scanGoodsMaskView2.f315918S = false;
                                            scanGoodsMaskView2.f315920T = false;
                                            scanGoodsMaskView2.f315924V = null;
                                            scanGoodsMaskView2.mo151674A();
                                            return C13598b0.f38549a;
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

    /* renamed from: com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView$b */
    public static final class C106101b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ScanGoodsMaskView f315937d;

        public C106101b(ScanGoodsMaskView scanGoodsMaskView) {
            this.f315937d = scanGoodsMaskView;
        }

        public final void run() {
            PlaySound.play(this.f315937d.getContext(), C0966R.string.hq6);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView$c */
    public static final class C106102c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ScanGoodsMaskView f315938d;

        public C106102c(ScanGoodsMaskView scanGoodsMaskView) {
            this.f315938d = scanGoodsMaskView;
        }

        public final void run() {
            Vibrator vibrator = this.f315938d.f315919S0;
            if (vibrator != null) {
                vibrator.vibrate(10);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView$d */
    public static final class C106103d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f315939d;

        /* renamed from: e */
        public final /* synthetic */ ScanGoodsMaskView f315940e;

        public C106103d(Bitmap bitmap, ScanGoodsMaskView scanGoodsMaskView) {
            this.f315939d = bitmap;
            this.f315940e = scanGoodsMaskView;
        }

        public final void run() {
            boolean z;
            Bitmap bitmap = this.f315939d;
            ScanGoodsMaskView scanGoodsMaskView = this.f315940e;
            ImageView imageView = scanGoodsMaskView.f315903E;
            if (imageView != null) {
                int i = scanGoodsMaskView.f315911M;
                int i2 = scanGoodsMaskView.f315912N;
                if (bitmap == null || bitmap.isRecycled()) {
                    imageView.setImageBitmap((Bitmap) null);
                    z = false;
                } else {
                    imageView.setImageBitmap(bitmap);
                    Matrix matrix = new Matrix();
                    imageView.setScaleType(ImageView.ScaleType.MATRIX);
                    Matrix imageMatrix = imageView.getImageMatrix();
                    float width = (((float) i) * 1.0f) / ((float) bitmap.getWidth());
                    float height = ((float) i2) - (((float) bitmap.getHeight()) * width);
                    Log.m105919d("MicroMsg.ScanViewUtils", "alvinluo fitBitmapBottom bitmap: %d, %d, scale: %f, translationY: %f, width: %d, height: %d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Float.valueOf(width), Float.valueOf(height), Integer.valueOf(i), Integer.valueOf(i2));
                    imageMatrix.postScale(width, width);
                    imageMatrix.postTranslate(0.0f, height);
                    matrix.set(imageMatrix);
                    imageView.setImageMatrix(matrix);
                    z = true;
                }
                if (z) {
                    ImageView imageView2 = this.f315940e.f315903E;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        ScanGoodsMaskView scanGoodsMaskView2 = this.f315940e;
                        if (scanGoodsMaskView2.getRequest() instanceof ScanGoodsRequest) {
                            BaseScanRequest request = scanGoodsMaskView2.getRequest();
                            C87412m.m108592e(request, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.api.ScanGoodsRequest");
                            ScanGoodsRequest scanGoodsRequest = (ScanGoodsRequest) request;
                            Log.m105924i("MicroMsg.ScanGoodsMaskView", "alvinluo onSetCustomBackgroundSuccess");
                            C88629c m = ((C88633e) C88643g.m110546d()).mo123060U(new C111032q(scanGoodsRequest)).mo123063m(true);
                            C87412m.m108593f(m, "val req = request as Sca…           }.serial(true)");
                            C61926c.m72665J(C61926c.m72665J(m, new C90515r(scanGoodsMaskView2)), new C111033s(scanGoodsRequest, scanGoodsMaskView2)).mo123065b(new C111034t(scanGoodsMaskView2)).mo114038a(new C111035u(scanGoodsMaskView2));
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("customMaskView");
                    throw null;
                }
                this.f315940e.mo151693z();
                return;
            }
            C87412m.m108603p("customMaskView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView$e */
    public static final class C106104e implements C106075o0 {

        /* renamed from: a */
        public final /* synthetic */ ScanGoodsMaskView f315941a;

        /* renamed from: b */
        public final /* synthetic */ ScanGoodsRequest f315942b;

        public C106104e(ScanGoodsMaskView scanGoodsMaskView, ScanGoodsRequest scanGoodsRequest) {
            this.f315941a = scanGoodsMaskView;
            this.f315942b = scanGoodsRequest;
        }

        /* renamed from: a */
        public void mo151631a(int i, String str) {
            C87412m.m108594g(str, "errMsg");
            Log.m105925i("MicroMsg.ScanGoodsMaskView", "alvinluo loadResource onLoadResult errCode: %d, errMsg: %s", Integer.valueOf(i), str);
            if (i == 0) {
                ScanGoodsMaskView scanGoodsMaskView = this.f315941a;
                String str2 = this.f315942b.f248905p;
                C87412m.m108593f(str2, "request.decorationImagePath");
                ScanGoodsMaskView.m142665v(scanGoodsMaskView, str2);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScanGoodsMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    private final Point getPreviewImageSize() {
        Bitmap bitmap = this.f315924V;
        if (bitmap != null) {
            C87412m.m108591d(bitmap);
            if (!bitmap.isRecycled()) {
                try {
                    Bitmap bitmap2 = this.f315924V;
                    C87412m.m108591d(bitmap2);
                    Bitmap bitmap3 = this.f315924V;
                    C87412m.m108591d(bitmap3);
                    float width = (((float) bitmap2.getWidth()) * 1.0f) / ((float) bitmap3.getHeight());
                    if (width < (((float) getMeasuredWidth()) * 1.0f) / ((float) getMeasuredHeight())) {
                        int measuredHeight = getMeasuredHeight();
                        return new Point((int) (width * ((float) measuredHeight)), measuredHeight);
                    }
                    int measuredWidth = getMeasuredWidth();
                    return new Point(measuredWidth, (int) (((float) measuredWidth) / width));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.ScanGoodsMaskView", e, "alvinluo getPreviewImageSize exception", new Object[0]);
                    return new Point(0, 0);
                }
            }
        }
        return new Point(0, 0);
    }

    private final void setCustomBackgroundBitmap(Bitmap bitmap) {
        C106103d dVar = new C106103d(bitmap, this);
        if (this.f315911M == 0 || this.f315912N == 0) {
            this.f315909K.add(dVar);
        } else {
            dVar.run();
        }
    }

    private final void setCustomTipsWording(ScanGoodsRequest scanGoodsRequest) {
        String str = scanGoodsRequest.f248908s;
        if (!(str == null || str.length() == 0)) {
            TextView textView = this.f315908J;
            if (textView != null) {
                textView.setText(scanGoodsRequest.f248908s);
            } else {
                C87412m.m108603p("customTipsWording");
                throw null;
            }
        } else {
            TextView textView2 = this.f315908J;
            if (textView2 != null) {
                textView2.setText(getContext().getResources().getString(C0966R.string.icb));
            } else {
                C87412m.m108603p("customTipsWording");
                throw null;
            }
        }
    }

    /* renamed from: v */
    public static final void m142665v(ScanGoodsMaskView scanGoodsMaskView, String str) {
        scanGoodsMaskView.getClass();
        Bitmap b = C106076p0.f315823a.mo151633b(str);
        if (b == null || b.isRecycled()) {
            scanGoodsMaskView.mo151693z();
        } else {
            scanGoodsMaskView.setCustomBackgroundBitmap(b);
        }
    }

    /* renamed from: A */
    public final void mo151674A() {
        Bitmap bitmap = this.f315922U;
        if (bitmap != null) {
            C87412m.m108591d(bitmap);
            if (!bitmap.isRecycled()) {
                Bitmap bitmap2 = this.f315922U;
                C87412m.m108591d(bitmap2);
                bitmap2.recycle();
                this.f315922U = null;
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
        float max = Math.max(0.0f, Math.min(1.0f, f3));
        if (i2 == 1 || i2 == 2) {
            if (max >= 0.5f && i2 == 1) {
                z = this.f315916R;
                float f4 = (max - 0.5f) / 0.5f;
                ImageView imageView = this.f315900B;
                if (imageView != null) {
                    imageView.setAlpha(this.f315931x0.getInterpolation(f4));
                    View view = this.f315929w;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Float.valueOf(1.0f - f4));
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        ImageView imageView2 = this.f315899A;
                        if (imageView2 != null) {
                            ImageView imageView3 = this.f315900B;
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
                z = this.f315916R;
                ImageView imageView4 = this.f315900B;
                if (imageView4 != null) {
                    imageView4.setAlpha(this.f315931x0.getInterpolation(max));
                    View view3 = this.f315929w;
                    if (view3 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(Float.valueOf(1.0f - max));
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        ImageView imageView5 = this.f315899A;
                        if (imageView5 != null) {
                            ImageView imageView6 = this.f315900B;
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
                View view5 = this.f315929w;
                if (view5 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(Float.valueOf(1.0f));
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    ImageView imageView7 = this.f315899A;
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
            View view7 = this.f315932y;
            if (view7 != null) {
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(Float.valueOf(0.5f));
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view7.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                C87412m.m108603p("maskView");
                throw null;
            }
        } else {
            View view9 = this.f315932y;
            if (view9 != null) {
                float max2 = Math.max(0.0f, Math.min(0.5f, 1.0f - max));
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar5.mo10233c(Float.valueOf(max2));
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view9.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                if (this.f315918S) {
                    if (this.f315920T) {
                        float max3 = Math.max(0.0f, Math.min(1.0f, (f3 - 0.5f) / 0.5f));
                        ImageView imageView8 = this.f315899A;
                        if (imageView8 != null) {
                            imageView8.setAlpha(1.0f - max3);
                            Object[] objArr = new Object[2];
                            ImageView imageView9 = this.f315899A;
                            if (imageView9 != null) {
                                objArr[0] = Float.valueOf(imageView9.getAlpha());
                                objArr[1] = Float.valueOf(max3);
                                Log.m105927v("MicroMsg.ScanGoodsMaskView", "alvinluo onDialogMovedY previewImage.alpha: %f, targetFactor: %f", objArr);
                            } else {
                                C87412m.m108603p(C82766t1.NAME);
                                throw null;
                            }
                        } else {
                            C87412m.m108603p(C82766t1.NAME);
                            throw null;
                        }
                    } else {
                        ImageView imageView10 = this.f315899A;
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
        ImageView imageView11 = this.f315900B;
        if (imageView11 != null) {
            imageView11.setVisibility(z ? 0 : 8);
            View view11 = this.f315932y;
            if (view11 != null) {
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(0);
                View view12 = view11;
                C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                Object[] objArr2 = new Object[8];
                objArr2[0] = Integer.valueOf(i);
                objArr2[1] = Float.valueOf(f);
                objArr2[2] = Float.valueOf(f2);
                objArr2[3] = Boolean.valueOf(z);
                ImageView imageView12 = this.f315900B;
                if (imageView12 != null) {
                    objArr2[4] = Float.valueOf(imageView12.getAlpha());
                    View view13 = this.f315929w;
                    if (view13 != null) {
                        objArr2[5] = Float.valueOf(view13.getAlpha());
                        View view14 = this.f315932y;
                        if (view14 != null) {
                            objArr2[6] = Float.valueOf(view14.getAlpha());
                            ImageView imageView13 = this.f315899A;
                            if (imageView13 != null) {
                                objArr2[7] = Float.valueOf(imageView13.getAlpha());
                                Log.m105927v("MicroMsg.ScanGoodsMaskView", "alvinluo onDialogMovedY dialogState: %d, offsetY: %s, factor: %f, showBlurView: %b, blurView alpha: %s, markView alpha: %s, maskView alpha: %s, previewImage alpha: %s", objArr2);
                                return;
                            }
                            C87412m.m108603p(C82766t1.NAME);
                            throw null;
                        }
                        C87412m.m108603p("maskView");
                        throw null;
                    }
                    C87412m.m108603p("successMarkView");
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
        View view = this.f315901C;
        if (view != null) {
            return view.getTranslationY();
        }
        return 0.0f;
    }

    public float getMarkViewHeight() {
        return (float) this.f315913P;
    }

    public float getMarkViewTransY() {
        View view = this.f315929w;
        if (view != null) {
            return view.getTranslationY();
        }
        C87412m.m108603p("successMarkView");
        throw null;
    }

    /* renamed from: h */
    public void mo151678h(Animator.AnimatorListener animatorListener) {
        super.mo151678h(animatorListener);
        mo151691x();
        C111557w.m152065a(this, 1.0f, 0.0f, 200, animatorListener);
    }

    /* renamed from: i */
    public void mo151679i(View view) {
        this.f315901C = view;
        boolean z = true;
        Log.m105927v("MicroMsg.ScanGoodsMaskView", "alvinluo attachBackgroundView source: %d", Integer.valueOf(getMScanSource()));
        if (view instanceof TextureView) {
            if (getMScanSource() != 1) {
                z = false;
            }
            if (z) {
                ((C119157j) C119157j.f356862d).mo183875f(new C111036v(this, (TextureView) view));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00bc  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo151680m(boolean r9) {
        /*
            r8 = this;
            super.mo151680m(r9)
            com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView$a r0 = new com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView$a
            r0.<init>(r8, r9)
            android.widget.ImageView r9 = r8.f315900B
            java.lang.String r1 = "blurView"
            r2 = 0
            if (r9 == 0) goto L_0x00c4
            int r9 = r9.getVisibility()
            java.lang.String r3 = "bottomBlurView"
            java.lang.String r4 = "previewImage"
            if (r9 == 0) goto L_0x003c
            android.widget.ImageView r9 = r8.f315899A
            if (r9 == 0) goto L_0x0038
            int r9 = r9.getVisibility()
            if (r9 == 0) goto L_0x003c
            android.widget.ImageView r9 = r8.f315934z
            if (r9 == 0) goto L_0x0034
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x002f
            goto L_0x003c
        L_0x002f:
            r0.invoke()
            goto L_0x00b7
        L_0x0034:
            gy3.C87412m.m108603p(r3)
            throw r2
        L_0x0038:
            gy3.C87412m.m108603p(r4)
            throw r2
        L_0x003c:
            android.widget.ImageView r9 = r8.f315899A
            if (r9 == 0) goto L_0x00c0
            float r9 = r9.getAlpha()
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r7 = 1
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x004e
            r9 = 1
            goto L_0x004f
        L_0x004e:
            r9 = 0
        L_0x004f:
            if (r9 == 0) goto L_0x0061
            android.widget.ImageView r9 = r8.f315899A
            if (r9 == 0) goto L_0x005d
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0061
            r9 = 1
            goto L_0x0062
        L_0x005d:
            gy3.C87412m.m108603p(r4)
            throw r2
        L_0x0061:
            r9 = 0
        L_0x0062:
            android.widget.ImageView r4 = r8.f315934z
            if (r4 == 0) goto L_0x00bc
            float r4 = r4.getAlpha()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0070
            r4 = 1
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            if (r4 == 0) goto L_0x0083
            android.widget.ImageView r4 = r8.f315934z
            if (r4 == 0) goto L_0x007f
            int r3 = r4.getVisibility()
            if (r3 != 0) goto L_0x0083
            r6 = 1
            goto L_0x0083
        L_0x007f:
            gy3.C87412m.m108603p(r3)
            throw r2
        L_0x0083:
            android.widget.ImageView r3 = r8.f315900B
            if (r3 == 0) goto L_0x00b8
            android.view.ViewPropertyAnimator r1 = r3.animate()
            if (r1 == 0) goto L_0x00b7
            r2 = 0
            android.view.ViewPropertyAnimator r1 = r1.alpha(r2)
            if (r1 == 0) goto L_0x00b7
            r2 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            if (r1 == 0) goto L_0x00b7
            android.view.animation.LinearInterpolator r2 = r8.f315927p0
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r2)
            if (r1 == 0) goto L_0x00b7
            tl2.k r2 = new tl2.k
            r2.<init>(r0)
            android.view.ViewPropertyAnimator r0 = r1.setListener(r2)
            if (r0 == 0) goto L_0x00b7
            tl2.l r1 = new tl2.l
            r1.<init>(r8, r9, r6)
            r0.setUpdateListener(r1)
        L_0x00b7:
            return
        L_0x00b8:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x00bc:
            gy3.C87412m.m108603p(r3)
            throw r2
        L_0x00c0:
            gy3.C87412m.m108603p(r4)
            throw r2
        L_0x00c4:
            gy3.C87412m.m108603p(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView.mo151680m(boolean):void");
    }

    /* renamed from: o */
    public void mo151681o(Object obj, C71029e eVar) {
        PointF pointF;
        Object obj2 = obj;
        C87412m.m108594g(obj2, "data");
        Log.m105924i("MicroMsg.ScanGoodsMaskView", "alvinluo onScanSuccess");
        this.f315926W = eVar;
        if (obj2 instanceof C19030n0) {
            C19030n0 n0Var = (C19030n0) obj2;
            Log.m105926v("MicroMsg.ScanGoodsMaskView", "alvinluo showSuccessView with animation");
            mo151690w(false);
            Log.m105927v("MicroMsg.ScanGoodsMaskView", "updateSuccessViewVisibility showCustomView: %b", Boolean.valueOf(this.f315902D));
            ImageView imageView = this.f315904F;
            if (imageView != null) {
                imageView.setVisibility(this.f315902D ? 0 : 8);
                ImageView imageView2 = this.f315930x;
                if (imageView2 != null) {
                    imageView2.setVisibility(this.f315902D ? 0 : 8);
                    mo151691x();
                    float f = n0Var.f53505b;
                    float f2 = n0Var.f53506c;
                    if (getMScanSource() == 1) {
                        float measuredWidth = ((float) getMeasuredWidth()) * f;
                        float measuredHeight = ((float) getMeasuredHeight()) * f2;
                        Log.m105927v("MicroMsg.ScanGoodsMaskView", "alvinluo getRealPosition center: %f, %f, result: %f, %f", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(measuredWidth), Float.valueOf(measuredHeight));
                        pointF = new PointF(measuredWidth, measuredHeight);
                    } else {
                        Point previewImageSize = getPreviewImageSize();
                        int measuredWidth2 = (getMeasuredWidth() - previewImageSize.x) / 2;
                        int measuredHeight2 = (getMeasuredHeight() - previewImageSize.y) / 2;
                        Log.m105927v("MicroMsg.ScanGoodsMaskView", "alvinluo getRealPositionForImage previewImageSize: %s, centerX: %s, centerY: %s, left: %d, top: %d", previewImageSize, Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(measuredWidth2), Integer.valueOf(measuredHeight2));
                        pointF = new PointF(((float) measuredWidth2) + (((float) previewImageSize.x) * f), ((float) measuredHeight2) + (((float) previewImageSize.y) * f2));
                    }
                    View view = this.f315929w;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "showSuccessView", "(Lcom/tencent/mm/plugin/scanner/model/ScanGoodsRemoteResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "showSuccessView", "(Lcom/tencent/mm/plugin/scanner/model/ScanGoodsRemoteResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setPivotX(((float) this.f315913P) / 2.0f);
                        view.setPivotY(((float) this.f315913P) / 2.0f);
                        view.setTranslationX(pointF.x - ((float) (this.f315913P / 2)));
                        view.setTranslationY(pointF.y - ((float) (this.f315913P / 2)));
                        view.setScaleX(0.0f);
                        view.setScaleY(0.0f);
                        if (!this.f315902D) {
                            View view3 = this.f315929w;
                            if (view3 != null) {
                                C78037h.m94188a(view3, this.f315926W);
                            } else {
                                C87412m.m108603p("successMarkView");
                                throw null;
                            }
                        } else {
                            Log.m105918d("MicroMsg.ScanGoodsMaskView", "alvinluo animateCustomSuccessView");
                            View view4 = this.f315929w;
                            if (view4 != null) {
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(Float.valueOf(1.0f));
                                View view5 = view4;
                                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanAnimationHelper", "animateCustomSuccessView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                                C117292a.m165359e(view5, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanAnimationHelper", "animateCustomSuccessView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                C108879d dVar = new C108879d(view4, C108867b.f326008m, 1.0f);
                                dVar.f326027s.mo159993b(200.0f);
                                dVar.f326027s.mo159992a(0.5f);
                                dVar.f326015b = 0.0f;
                                dVar.f326016c = true;
                                C108879d dVar2 = new C108879d(view4, C108867b.f326009n, 1.0f);
                                dVar2.f326027s.mo159993b(200.0f);
                                dVar2.f326027s.mo159992a(0.5f);
                                dVar2.f326015b = 0.0f;
                                dVar2.f326016c = true;
                                dVar.mo159991e();
                                dVar2.mo159991e();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{15.0f, 0.0f});
                                ofFloat.setDuration(300);
                                ofFloat.setInterpolator(new LinearInterpolator());
                                ofFloat.addUpdateListener(new C14014g(view4));
                                ofFloat.start();
                                ImageView imageView3 = this.f315930x;
                                if (imageView3 != null) {
                                    imageView3.setVisibility(0);
                                    imageView3.setPivotX(((float) this.f315914Q) / 2.0f);
                                    imageView3.setPivotY(((float) this.f315914Q) / 2.0f);
                                    imageView3.setTranslationX(pointF.x - ((float) (this.f315914Q / 2)));
                                    imageView3.setTranslationY(pointF.y - ((float) (this.f315914Q / 2)));
                                    imageView3.setScaleX(0.5f);
                                    imageView3.setScaleY(0.5f);
                                    imageView3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(300).setInterpolator(new LinearInterpolator()).setListener(new C111024i(this)).setUpdateListener(new C111026j(this)).start();
                                } else {
                                    C87412m.m108603p("successDecorationView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("successMarkView");
                                throw null;
                            }
                        }
                        View view6 = this.f315932y;
                        if (view6 != null) {
                            C9556a aVar3 = new C9556a();
                            aVar3.mo10233c(Float.valueOf(0.0f));
                            View view7 = view6;
                            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "showSuccessView", "(Lcom/tencent/mm/plugin/scanner/model/ScanGoodsRemoteResult;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view6.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                            C117292a.m165359e(view7, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "showSuccessView", "(Lcom/tencent/mm/plugin/scanner/model/ScanGoodsRemoteResult;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            C9556a aVar4 = new C9556a();
                            aVar4.mo10233c(0);
                            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "showSuccessView", "(Lcom/tencent/mm/plugin/scanner/model/ScanGoodsRemoteResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                            C117292a.m165359e(view7, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "showSuccessView", "(Lcom/tencent/mm/plugin/scanner/model/ScanGoodsRemoteResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            ImageView imageView4 = this.f315900B;
                            if (imageView4 != null) {
                                imageView4.setVisibility(8);
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
                    C87412m.m108603p("successDecorationView");
                    throw null;
                }
            } else {
                C87412m.m108603p("customSuccessView");
                throw null;
            }
        }
        if (this.f315933y0) {
            ((C119157j) C119157j.f356862d).mo183875f(new C106101b(this));
        }
        if (this.f315915Q0) {
            postDelayed(new C106102c(this), 100);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f315911M = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f315912N = measuredHeight;
        if (this.f315911M != 0 && measuredHeight != 0) {
            Iterator<Runnable> it = this.f315909K.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            this.f315909K.clear();
        }
    }

    /* renamed from: r */
    public void mo151683r() {
        super.mo151683r();
    }

    public void release() {
        ScanAnimationDotsView scanAnimationDotsView = this.f315928v;
        if (scanAnimationDotsView != null) {
            C111019e eVar = scanAnimationDotsView.f315895e;
            if (eVar != null) {
                ((C111012a) eVar).stopAnimation();
                Iterator<C111016c> it = C111012a.f332470p.iterator();
                while (it.hasNext()) {
                    it.next().release();
                }
                C111012a.f332470p.clear();
            }
            C106076p0 p0Var = C106076p0.f315823a;
            long j = this.f315910L;
            HashMap<Long, ScanGoodsRequest> hashMap = C106076p0.f315825c;
            ScanGoodsRequest scanGoodsRequest = hashMap.get(Long.valueOf(j));
            hashMap.remove(Long.valueOf(j));
            C106076p0.f315824b.remove(Long.valueOf(j));
            if (scanGoodsRequest != null) {
                Log.m105919d("MicroMsg.ScanGoodsResourceManager", "alvinluo releaseResource requestId: %s", Long.valueOf(j));
                String a = p0Var.mo151632a(scanGoodsRequest);
                C106076p0.f315827e.put(a, Boolean.TRUE);
                C119179t tVar = C119157j.f356862d;
                C106083t0 t0Var = new C106083t0(a, scanGoodsRequest);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183889t(t0Var, 10000, "ScanResourceTag");
            }
            mo151691x();
            return;
        }
        C87412m.m108603p("animationDotsView");
        throw null;
    }

    /* renamed from: s */
    public void mo151685s(boolean z, DialogInterface.OnCancelListener onCancelListener) {
        if (z) {
            C89779i0 i0Var = this.f315917R0;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            this.f315917R0 = C76879j.m92723Q(getContext(), "", getResources().getString(C0966R.string.idg), false, true, onCancelListener);
            return;
        }
        C89779i0 i0Var2 = this.f315917R0;
        if (i0Var2 != null) {
            i0Var2.dismiss();
        }
    }

    public void setBackgroundTransY(float f) {
        View view = this.f315901C;
        if (view != null) {
            view.setTranslationY(f);
        }
        ImageView imageView = this.f315900B;
        if (imageView != null) {
            imageView.setTranslationY(f);
            ImageView imageView2 = this.f315899A;
            if (imageView2 != null) {
                imageView2.setTranslationY(f);
                ImageView imageView3 = this.f315934z;
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

    public void setMarkViewTransY(float f) {
        View view = this.f315929w;
        if (view != null) {
            view.setTranslationY(f);
        } else {
            C87412m.m108603p("successMarkView");
            throw null;
        }
    }

    /* renamed from: w */
    public final void mo151690w(boolean z) {
        ScanAnimationDotsView scanAnimationDotsView = this.f315928v;
        if (scanAnimationDotsView != null) {
            scanAnimationDotsView.setVisibility(z ? 0 : 8);
            if (z) {
                ScanAnimationDotsView scanAnimationDotsView2 = this.f315928v;
                if (scanAnimationDotsView2 != null) {
                    scanAnimationDotsView2.startAnimation();
                } else {
                    C87412m.m108603p("animationDotsView");
                    throw null;
                }
            } else {
                ScanAnimationDotsView scanAnimationDotsView3 = this.f315928v;
                if (scanAnimationDotsView3 != null) {
                    scanAnimationDotsView3.stopAnimation();
                } else {
                    C87412m.m108603p("animationDotsView");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("animationDotsView");
            throw null;
        }
    }

    /* renamed from: x */
    public final void mo151691x() {
        try {
            C108879d dVar = this.f315925V0;
            if (dVar != null) {
                dVar.mo159990d();
            }
            TimerTask timerTask = this.f315921T0;
            if (timerTask != null) {
                timerTask.cancel();
            }
            C34379c<?> cVar = this.f315923U0;
            if (cVar != null) {
                cVar.cancel(false);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: y */
    public final void mo151692y(Bitmap bitmap) {
        mo151674A();
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.ScanGoodsMaskView", "alvinluo updatePreview bitmap width: %d, height: %d, showPreviewImage: %b, animateShowPreviewImage: %b", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Boolean.valueOf(this.f315918S), Boolean.valueOf(this.f315920T));
            this.f315924V = bitmap;
            ImageView imageView = this.f315899A;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
                if (this.f315918S) {
                    ImageView imageView2 = this.f315899A;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        if (this.f315920T) {
                            ImageView imageView3 = this.f315899A;
                            if (imageView3 != null) {
                                imageView3.setAlpha(0.0f);
                            } else {
                                C87412m.m108603p(C82766t1.NAME);
                                throw null;
                            }
                        } else {
                            ImageView imageView4 = this.f315899A;
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
                    ImageView imageView5 = this.f315899A;
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
            Log.m105925i("MicroMsg.ScanGoodsMaskView", "alvinluo setPreviewBitmap width: %d, height: %d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
            new C111029o(this, bitmap, false).invoke();
        }
    }

    /* renamed from: z */
    public final void mo151693z() {
        Log.m105920e("MicroMsg.ScanGoodsMaskView", "alvinluo onShowCustomViewFailed");
        this.f315902D = false;
        LinearLayout linearLayout = this.f315906H;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            ImageView imageView = this.f315903E;
            if (imageView != null) {
                imageView.setVisibility(8);
                ImageView imageView2 = this.f315903E;
                if (imageView2 != null) {
                    imageView2.setImageBitmap((Bitmap) null);
                    if (getRequest() instanceof ScanGoodsRequest) {
                        BaseScanRequest request = getRequest();
                        C87412m.m108592e(request, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.api.ScanGoodsRequest");
                        C19016e1 e1Var = C19016e1.f53424a;
                        if (((ScanGoodsRequest) request).f248902j == 5) {
                            C115669n.INSTANCE.mo175911u(1259, 110);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C87412m.m108603p("customMaskView");
                throw null;
            }
            C87412m.m108603p("customMaskView");
            throw null;
        }
        C87412m.m108603p("customTipsImageContainer");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanGoodsMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object systemService;
        C87412m.m108594g(context, "context");
        this.f315909K = new ArrayList<>();
        this.f315913P = getResources().getDimensionPixelSize(C0966R.dimen.alx);
        this.f315914Q = getResources().getDimensionPixelSize(C0966R.dimen.aln);
        this.f315927p0 = new LinearInterpolator();
        this.f315931x0 = new DecelerateInterpolator();
        this.f315933y0 = true;
        this.f315915Q0 = true;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b4t, this, true);
        View findViewById = inflate.findViewById(C0966R.C0970id.j18);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.scan_animation_dots_view)");
        this.f315928v = (ScanAnimationDotsView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.j1z);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.scan_success_dot_view)");
        this.f315929w = findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.i1z);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.p…ew_blur_view_for_gallery)");
        this.f315934z = (ImageView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.i1y);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.preview_blur_view)");
        this.f315900B = (ImageView) findViewById4;
        View findViewById5 = inflate.findViewById(C0966R.C0970id.goy);
        C87412m.m108593f(findViewById5, "view.findViewById(R.id.mask_view)");
        this.f315932y = findViewById5;
        View findViewById6 = inflate.findViewById(C0966R.C0970id.i25);
        C87412m.m108593f(findViewById6, "view.findViewById(R.id.preview_image)");
        this.f315899A = (ImageView) findViewById6;
        View findViewById7 = inflate.findViewById(C0966R.C0970id.f357823by1);
        C87412m.m108593f(findViewById7, "view.findViewById(R.id.custom_mask_view)");
        this.f315903E = (ImageView) findViewById7;
        View findViewById8 = inflate.findViewById(C0966R.C0970id.byd);
        C87412m.m108593f(findViewById8, "view.findViewById(R.id.custom_success_view)");
        this.f315904F = (ImageView) findViewById8;
        View findViewById9 = inflate.findViewById(C0966R.C0970id.k_f);
        C87412m.m108593f(findViewById9, "view.findViewById(R.id.success_decoration_view)");
        this.f315930x = (ImageView) findViewById9;
        View findViewById10 = inflate.findViewById(C0966R.C0970id.by6);
        C87412m.m108593f(findViewById10, "view.findViewById(R.id.custom_scan_tips_container)");
        this.f315905G = (LinearLayout) findViewById10;
        View findViewById11 = inflate.findViewById(C0966R.C0970id.by8);
        C87412m.m108593f(findViewById11, "view.findViewById(R.id.c…can_tips_image_container)");
        this.f315906H = (LinearLayout) findViewById11;
        View findViewById12 = inflate.findViewById(C0966R.C0970id.by7);
        C87412m.m108593f(findViewById12, "view.findViewById(R.id.custom_scan_tips_image)");
        this.f315907I = (ImageView) findViewById12;
        View findViewById13 = inflate.findViewById(C0966R.C0970id.by9);
        C87412m.m108593f(findViewById13, "view.findViewById(R.id.custom_scan_tips_wording)");
        this.f315908J = (TextView) findViewById13;
        if (this.f315919S0 == null && (systemService = context.getSystemService("vibrator")) != null) {
            this.f315919S0 = (Vibrator) systemService;
        }
        LinearLayout linearLayout = this.f315905G;
        ViewGroup.LayoutParams layoutParams = null;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            if (layoutParams2 != null) {
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = C76577a.m92151b(context, 154) + getMBottomExtraHeight();
                }
                layoutParams = layoutParams2;
            }
            linearLayout.setLayoutParams(layoutParams);
            return;
        }
        C87412m.m108603p("customTipsContainer");
        throw null;
    }

    public void setScanRequest(ScanGoodsRequest scanGoodsRequest) {
        super.setScanRequest(scanGoodsRequest);
        if (scanGoodsRequest != null) {
            if (!(C86013q1.m106450k(scanGoodsRequest.f248905p) && C86013q1.m106450k(scanGoodsRequest.f248906q) && C86013q1.m106450k(scanGoodsRequest.f248907r))) {
                Log.m105928w("MicroMsg.ScanGoodsMaskView", "alvinluo setScanRequest request is not valid and ignore");
                C19016e1 e1Var = C19016e1.f53424a;
                if (scanGoodsRequest.f248902j == 5) {
                    C115669n.INSTANCE.mo175911u(1259, 109);
                    return;
                }
                return;
            }
            LinearLayout linearLayout = this.f315905G;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                setCustomTipsWording(scanGoodsRequest);
                C106076p0 p0Var = C106076p0.f315823a;
                C106104e eVar = new C106104e(this, scanGoodsRequest);
                long j = -1;
                if (!(C86013q1.m106450k(scanGoodsRequest.f248905p) && C86013q1.m106450k(scanGoodsRequest.f248906q) && C86013q1.m106450k(scanGoodsRequest.f248907r))) {
                    Log.m105920e("MicroMsg.ScanGoodsResourceManager", "alvinluo prepare request not valid");
                } else {
                    j = System.currentTimeMillis();
                    Log.m105925i("MicroMsg.ScanGoodsResourceManager", "alvinluo loadResource requestId: %d", Long.valueOf(j));
                    C106076p0.f315824b.put(Long.valueOf(j), eVar);
                    C106076p0.f315825c.put(Long.valueOf(j), scanGoodsRequest);
                    ((C119157j) C119157j.f356862d).mo183871b(new C106082s0(scanGoodsRequest, j), "ScanResourceTag");
                }
                this.f315910L = j;
                if (scanGoodsRequest.f248911v) {
                    scanGoodsRequest.f248911v = false;
                    C111030p pVar = new C111030p(this);
                    this.f315921T0 = pVar;
                    this.f315923U0 = ((C119157j) C119157j.f356862d).mo183878i(pVar, 15000);
                    return;
                }
                return;
            }
            C87412m.m108603p("customTipsContainer");
            throw null;
        }
    }
}
