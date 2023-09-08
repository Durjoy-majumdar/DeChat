package com.tencent.p014mm.plugin.scanner.p101ui.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.C5176w;
import com.tencent.p014mm.plugin.scanner.api.BaseScanRequest;
import com.tencent.p014mm.plugin.scanner.model.C106071g1;
import com.tencent.p014mm.plugin.scanner.view.BaseScanMaskView;
import com.tencent.p014mm.plugin.scanner.view.C71029e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.qbar.ScanDecodeFrameData;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Metadata;
import sx3.C110818d0;
import sx3.C64197v;
import ul2.C111201f;
import ul2.C111202g;
import ul2.C111204h;
import vl2.C111557w;
import wc3.C15141z;
import yk2.C112475a;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010@\u001a\u00020?\u0012\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bC\u0010DB#\b\u0016\u0012\u0006\u0010@\u001a\u00020?\u0012\b\u0010B\u001a\u0004\u0018\u00010A\u0012\u0006\u0010E\u001a\u00020\u0003¢\u0006\u0004\bC\u0010FJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010J\u0012\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016R\"\u0010\u001e\u001a\u00020\u00168\u0004@\u0004X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u00168\u0004@\u0004X.¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR2\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00160#j\b\u0012\u0004\u0012\u00020\u0016`$8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00102\u001a\u00020\u00038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010:\u001a\u0004\u0018\u0001038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/\"\u0004\b=\u00101¨\u0006G"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView;", "Lcom/tencent/mm/plugin/scanner/view/BaseScanMaskView;", "Lcom/tencent/mm/plugin/scanner/api/BaseScanRequest;", "", "getLayoutId", "", "visible", "Lrx3/b0;", "setMyQrCodeButtonVisible", "Landroid/graphics/Rect;", "rect", "setAnimationRect", "bottomHeight", "setBottomExtraHeight", "needRotate", "setNeedRotate", "Lcom/tencent/mm/plugin/scanner/model/g1;", "successMarkClickListener", "setSuccessMarkClickListener", "Lcom/tencent/qbar/ScanDecodeFrameData;", "frameData", "setDecodeSuccessFrameData", "Landroid/view/View;", "getTargetSuccessMarkView", "w", "Landroid/view/View;", "getMyQrCodeButton", "()Landroid/view/View;", "setMyQrCodeButton", "(Landroid/view/View;)V", "myQrCodeButton", "x", "getIvMyQrCodeButton", "setIvMyQrCodeButton", "ivMyQrCodeButton", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "C", "Ljava/util/ArrayList;", "getSuccessMarkViewList", "()Ljava/util/ArrayList;", "setSuccessMarkViewList", "(Ljava/util/ArrayList;)V", "successMarkViewList", "D", "I", "getSuccessMarkViewSize", "()I", "setSuccessMarkViewSize", "(I)V", "successMarkViewSize", "Lcom/tencent/mm/plugin/scanner/view/e;", "J", "Lcom/tencent/mm/plugin/scanner/view/e;", "getSuccessAnimationListener", "()Lcom/tencent/mm/plugin/scanner/view/e;", "setSuccessAnimationListener", "(Lcom/tencent/mm/plugin/scanner/view/e;)V", "successAnimationListener", "y0", "getProductListBottomMarginDelta", "setProductListBottomMarginDelta", "productListBottomMarginDelta", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView */
public class ScanCodeMaskView extends BaseScanMaskView<BaseScanRequest> {

    /* renamed from: Q0 */
    public static final /* synthetic */ int f315975Q0 = 0;

    /* renamed from: A */
    public ImageView f315976A;

    /* renamed from: B */
    public Bitmap f315977B;

    /* renamed from: C */
    public ArrayList<View> f315978C;

    /* renamed from: D */
    public int f315979D;

    /* renamed from: E */
    public int f315980E;

    /* renamed from: F */
    public int f315981F;

    /* renamed from: G */
    public ValueAnimator f315982G;

    /* renamed from: H */
    public ValueAnimator f315983H;

    /* renamed from: I */
    public float f315984I;

    /* renamed from: J */
    public C71029e f315985J;

    /* renamed from: K */
    public Rect f315986K;

    /* renamed from: L */
    public boolean f315987L;

    /* renamed from: M */
    public boolean f315988M;

    /* renamed from: N */
    public int f315989N;

    /* renamed from: P */
    public C106071g1 f315990P;

    /* renamed from: Q */
    public int f315991Q;

    /* renamed from: R */
    public final MTimerHandler.CallBack f315992R;

    /* renamed from: S */
    public MTimerHandler f315993S;

    /* renamed from: T */
    public ValueAnimator f315994T;

    /* renamed from: U */
    public AccelerateInterpolator f315995U;

    /* renamed from: V */
    public DecelerateInterpolator f315996V;

    /* renamed from: W */
    public int f315997W;

    /* renamed from: p0 */
    public PointF f315998p0;

    /* renamed from: v */
    public ImageView f315999v;

    /* renamed from: w */
    public View f316000w;

    /* renamed from: x */
    public View f316001x;

    /* renamed from: x0 */
    public boolean f316002x0;

    /* renamed from: y */
    public View f316003y;

    /* renamed from: y0 */
    public int f316004y0;

    /* renamed from: z */
    public TextView f316005z;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView$a */
    public static final class C5171a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ScanCodeMaskView f20602d;

        public C5171a(ScanCodeMaskView scanCodeMaskView) {
            this.f20602d = scanCodeMaskView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean z = true;
            C115669n.INSTANCE.mo160131h(11264, 3);
            if (!(C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_ColorfulQRCode_Int, 0) == 1 || (!C87412m.m108589b(C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_QRCODE_OLD_STYLE_INT, -100), -100)) || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_colorful_qrcode_new_enable, 0) == 1)) {
                z = false;
            }
            if (z) {
                Context context = this.f20602d.getContext();
                Intent intent = new Intent();
                intent.setClassName(this.f20602d.getContext(), "com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI");
                intent.addFlags(67108864);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$initView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$initView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                C15141z a = C5176w.m5203a();
                Context context3 = this.f20602d.getContext();
                ((C67654r1) a).getClass();
                C88144b.m109791i(context3, "setting", ".ui.setting.SelfQRCodeUI", new Intent(), (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView$b */
    public static final class C106107b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ Animator.AnimatorListener f316006d;

        /* renamed from: e */
        public final /* synthetic */ ScanCodeMaskView f316007e;

        public C106107b(Animator.AnimatorListener animatorListener, ScanCodeMaskView scanCodeMaskView) {
            this.f316006d = animatorListener;
            this.f316007e = scanCodeMaskView;
        }

        public void onAnimationCancel(Animator animator) {
            this.f316007e.mo151722D();
            Animator.AnimatorListener animatorListener = this.f316006d;
            if (animatorListener != null) {
                animatorListener.onAnimationCancel(animator);
            }
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105924i("MicroMsg.ScanCodeMaskView", "alvinluo onViewDestroy onAnimationEnd");
            this.f316007e.mo151722D();
            Animator.AnimatorListener animatorListener = this.f316006d;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(animator);
            }
        }

        public void onAnimationRepeat(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f316006d;
            if (animatorListener != null) {
                animatorListener.onAnimationRepeat(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f316006d;
            if (animatorListener != null) {
                animatorListener.onAnimationStart(animator);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView$c */
    public static final class C106108c implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ ScanCodeMaskView f316008d;

        public C106108c(ScanCodeMaskView scanCodeMaskView) {
            this.f316008d = scanCodeMaskView;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105926v("MicroMsg.ScanCodeMaskView", "alvinluo showSuccessView onAnimationEnd");
            C71029e successAnimationListener = this.f316008d.getSuccessAnimationListener();
            if (successAnimationListener != null) {
                successAnimationListener.mo24256a(!this.f316008d.f315988M);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            C71029e successAnimationListener = this.f316008d.getSuccessAnimationListener();
            if (successAnimationListener != null) {
                successAnimationListener.mo24257b();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView$d */
    public static final class C106109d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f316009d;

        /* renamed from: e */
        public final /* synthetic */ ScanCodeMaskView f316010e;

        /* renamed from: f */
        public final /* synthetic */ ValueAnimator.AnimatorUpdateListener f316011f;

        public C106109d(boolean z, ScanCodeMaskView scanCodeMaskView, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            this.f316009d = z;
            this.f316010e = scanCodeMaskView;
            this.f316011f = animatorUpdateListener;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (this.f316009d) {
                View myQrCodeButton = this.f316010e.getMyQrCodeButton();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f - floatValue));
                C117292a.m165358d(myQrCodeButton, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$runSuccessAnimator$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                myQrCodeButton.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(myQrCodeButton, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$runSuccessAnimator$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            ScanCodeMaskView scanCodeMaskView = this.f316010e;
            int i = ScanCodeMaskView.f315975Q0;
            TextView scanTips = scanCodeMaskView.getScanTips();
            if (scanTips != null) {
                scanTips.setAlpha(1.0f - floatValue);
            }
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f316011f;
            if (animatorUpdateListener != null) {
                animatorUpdateListener.onAnimationUpdate(valueAnimator);
            }
            ArrayList<View> successMarkViewList = this.f316010e.getSuccessMarkViewList();
            ScanCodeMaskView scanCodeMaskView2 = this.f316010e;
            int i2 = 0;
            for (T next : successMarkViewList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    View view = (View) next;
                    if (i2 < scanCodeMaskView2.f315981F) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(Float.valueOf(floatValue));
                        View view2 = view;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$runSuccessAnimator$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$runSuccessAnimator$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setScaleX(floatValue);
                        view.setScaleY(floatValue);
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            ScanCodeMaskView scanCodeMaskView3 = this.f316010e;
            if (scanCodeMaskView3.f315988M) {
                TextView textView = scanCodeMaskView3.f316005z;
                if (textView != null) {
                    textView.setAlpha(floatValue);
                } else {
                    C87412m.m108603p("multiCodeTips");
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView$e */
    public static final class C106110e implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ ScanCodeMaskView f316012d;

        /* renamed from: e */
        public final /* synthetic */ C106113g f316013e;

        /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView$e$a */
        public static final class C106111a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ScanCodeMaskView f316014d;

            /* renamed from: e */
            public final /* synthetic */ C106113g f316015e;

            public C106111a(ScanCodeMaskView scanCodeMaskView, C106113g gVar) {
                this.f316014d = scanCodeMaskView;
                this.f316015e = gVar;
            }

            public final void run() {
                ScanCodeMaskView scanCodeMaskView = this.f316014d;
                scanCodeMaskView.mo151720B(0.8f, 1.0f, scanCodeMaskView.f315996V, this.f316015e);
            }
        }

        public C106110e(ScanCodeMaskView scanCodeMaskView, C106113g gVar) {
            this.f316012d = scanCodeMaskView;
            this.f316013e = gVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            MMHandlerThread.postToMainThreadDelayed(new C106111a(this.f316012d, this.f316013e), 50);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView$f */
    public static final class C106112f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ ScanCodeMaskView f316016d;

        public C106112f(ScanCodeMaskView scanCodeMaskView) {
            this.f316016d = scanCodeMaskView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            ArrayList<View> successMarkViewList = this.f316016d.getSuccessMarkViewList();
            ScanCodeMaskView scanCodeMaskView = this.f316016d;
            int i = 0;
            for (T next : successMarkViewList) {
                int i2 = i + 1;
                if (i >= 0) {
                    View view = (View) next;
                    if (i < scanCodeMaskView.f315981F) {
                        view.setScaleX(floatValue);
                        view.setScaleY(floatValue);
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView$g */
    public static final class C106113g implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ int f316017d;

        /* renamed from: e */
        public final /* synthetic */ ScanCodeMaskView f316018e;

        /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView$g$a */
        public static final class C106114a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f316019d;

            /* renamed from: e */
            public final /* synthetic */ ScanCodeMaskView f316020e;

            public C106114a(int i, ScanCodeMaskView scanCodeMaskView) {
                this.f316019d = i;
                this.f316020e = scanCodeMaskView;
            }

            public final void run() {
                int i = this.f316019d;
                if (i < 2) {
                    int i2 = ScanCodeMaskView.f315975Q0;
                    this.f316020e.mo151721C(i + 1);
                }
            }
        }

        public C106113g(int i, ScanCodeMaskView scanCodeMaskView) {
            this.f316017d = i;
            this.f316018e = scanCodeMaskView;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            MMHandlerThread.postToMainThreadDelayed(new C106114a(this.f316017d, this.f316018e), 50);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView$h */
    public static final class C106115h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ScanCodeMaskView f316021d;

        public C106115h(ScanCodeMaskView scanCodeMaskView) {
            this.f316021d = scanCodeMaskView;
        }

        public final void run() {
            ScanCodeMaskView scanCodeMaskView = this.f316021d;
            scanCodeMaskView.setProductListBottomMarginDelta(scanCodeMaskView.getMyQrCodeButton().getHeight() - C76577a.m92151b(this.f316021d.getContext(), 64));
            Log.m105924i("MicroMsg.ScanCodeMaskView", "productListBottomMarginDelta:" + this.f316021d.getProductListBottomMarginDelta());
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView$i */
    public static final class C106116i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ScanCodeMaskView f316022d;

        /* renamed from: e */
        public final /* synthetic */ ScanDecodeFrameData f316023e;

        /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView$i$a */
        public static final class C106117a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ScanCodeMaskView f316024d;

            public C106117a(ScanCodeMaskView scanCodeMaskView) {
                this.f316024d = scanCodeMaskView;
            }

            public final void run() {
                Bitmap bitmap;
                ViewPropertyAnimator alpha;
                ViewPropertyAnimator duration;
                ScanCodeMaskView scanCodeMaskView = this.f316024d;
                int i = ScanCodeMaskView.f315975Q0;
                if (!scanCodeMaskView.f316134s && (bitmap = scanCodeMaskView.f315977B) != null) {
                    C87412m.m108591d(bitmap);
                    if (!bitmap.isRecycled()) {
                        ScanCodeMaskView scanCodeMaskView2 = this.f316024d;
                        ImageView imageView = scanCodeMaskView2.f315976A;
                        if (imageView != null) {
                            imageView.setImageBitmap(scanCodeMaskView2.f315977B);
                            ImageView imageView2 = this.f316024d.f315976A;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                ImageView imageView3 = this.f316024d.f315976A;
                                if (imageView3 != null) {
                                    imageView3.setAlpha(0.0f);
                                    ImageView imageView4 = this.f316024d.f315976A;
                                    if (imageView4 != null) {
                                        ViewPropertyAnimator animate = imageView4.animate();
                                        if (animate != null) {
                                            animate.cancel();
                                        }
                                        ImageView imageView5 = this.f316024d.f315976A;
                                        if (imageView5 != null) {
                                            ViewPropertyAnimator animate2 = imageView5.animate();
                                            if (animate2 != null && (alpha = animate2.alpha(1.0f)) != null && (duration = alpha.setDuration(200)) != null) {
                                                duration.start();
                                                return;
                                            }
                                            return;
                                        }
                                        C87412m.m108603p("frameImage");
                                        throw null;
                                    }
                                    C87412m.m108603p("frameImage");
                                    throw null;
                                }
                                C87412m.m108603p("frameImage");
                                throw null;
                            }
                            C87412m.m108603p("frameImage");
                            throw null;
                        }
                        C87412m.m108603p("frameImage");
                        throw null;
                    }
                }
            }
        }

        public C106116i(ScanCodeMaskView scanCodeMaskView, ScanDecodeFrameData scanDecodeFrameData) {
            this.f316022d = scanCodeMaskView;
            this.f316023e = scanDecodeFrameData;
        }

        public final void run() {
            Bitmap bitmap;
            byte[] bArr;
            long currentTimeMillis = System.currentTimeMillis();
            ScanCodeMaskView scanCodeMaskView = this.f316022d;
            ScanDecodeFrameData scanDecodeFrameData = this.f316023e;
            int i = ScanCodeMaskView.f315975Q0;
            scanCodeMaskView.getClass();
            try {
                C112475a scanCamera = scanCodeMaskView.getScanCamera();
                C87412m.m108591d(scanCamera);
                int previewFormat = scanCamera.f324139a.getParameters().getPreviewFormat();
                C112475a scanCamera2 = scanCodeMaskView.getScanCamera();
                C87412m.m108591d(scanCamera2);
                Point point = scanCamera2.f324142d;
                if (!(scanDecodeFrameData == null || (bArr = scanDecodeFrameData.f320081d) == null)) {
                    Log.m105925i("MicroMsg.ScanCodeMaskView", "alvinluo getFrameBitmap data length: %d, size: %d, %d, rotation: %d, previewFormat: %d", Integer.valueOf(bArr.length), Integer.valueOf(scanDecodeFrameData.f320083f), Integer.valueOf(scanDecodeFrameData.f320084g), Integer.valueOf(scanDecodeFrameData.f320082e), Integer.valueOf(previewFormat));
                    YuvImage yuvImage = r9;
                    YuvImage yuvImage2 = new YuvImage(scanDecodeFrameData.f320081d, previewFormat, point.x, point.y, (int[]) null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(new Rect(0, 0, point.x, point.y), 100, byteArrayOutputStream);
                    bitmap = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Log.m105925i("MicroMsg.ScanCodeMaskView", "alvinluo getFrameBitmap bitmap width: %d, height: %d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
                        int i2 = scanDecodeFrameData.f320082e;
                        if (i2 != 0) {
                            bitmap = scanCodeMaskView.mo151753z(bitmap, i2, scanCodeMaskView.getMeasuredWidth(), scanCodeMaskView.getMeasuredHeight());
                        }
                        scanCodeMaskView.f315977B = bitmap;
                        Log.m105925i("MicroMsg.ScanCodeMaskView", "alvinluo getFrameBitmap cost: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        MMHandlerThread.postToMainThread(new C106117a(this.f316022d));
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ScanCodeMaskView", e, "alvinluo getFrameBitmap exception", new Object[0]);
            }
            bitmap = null;
            scanCodeMaskView.f315977B = bitmap;
            Log.m105925i("MicroMsg.ScanCodeMaskView", "alvinluo getFrameBitmap cost: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            MMHandlerThread.postToMainThread(new C106117a(this.f316022d));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScanCodeMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: A */
    public final void mo151719A(long j, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z = getMyQrCodeButton().getAlpha() == 1.0f;
        ValueAnimator valueAnimator = this.f315982G;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.removeAllListeners();
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setDuration(j);
        valueAnimator.addListener(new C106108c(this));
        valueAnimator.addUpdateListener(new C106109d(z, this, animatorUpdateListener));
        valueAnimator.start();
    }

    /* renamed from: B */
    public final void mo151720B(float f, float f2, Interpolator interpolator, Animator.AnimatorListener animatorListener) {
        Log.m105919d("MicroMsg.ScanCodeMaskView", "alvinluo runZoomAnimation from: %f, to: %f", Float.valueOf(f), Float.valueOf(f2));
        mo151749v();
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f315994T = valueAnimator;
        valueAnimator.setFloatValues(new float[]{f, f2});
        valueAnimator.setInterpolator(interpolator);
        valueAnimator.setDuration(300);
        valueAnimator.addUpdateListener(new C106112f(this));
        valueAnimator.addListener(animatorListener);
        valueAnimator.start();
    }

    /* renamed from: C */
    public final void mo151721C(int i) {
        Log.m105919d("MicroMsg.ScanCodeMaskView", "alvinluo runZoomAnimation %d", Integer.valueOf(i));
        mo151720B(1.0f, 0.8f, this.f315995U, new C106110e(this, new C106113g(i, this)));
    }

    /* renamed from: D */
    public final void mo151722D() {
        Log.m105918d("MicroMsg.ScanCodeMaskView", "alvinluo stopScanLineAnimation");
        this.f315983H.cancel();
    }

    /* renamed from: E */
    public final void mo151723E(int i) {
        Log.m105919d("MicroMsg.ScanCodeMaskView", "alvinluo updateMultiCodeTipsBottomMargin: %d", Integer.valueOf(i));
        TextView textView = this.f316005z;
        if (textView == null) {
            C87412m.m108603p("multiCodeTips");
            throw null;
        } else if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                this.f315997W = i;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C76577a.m92151b(getContext(), i) + getMBottomExtraHeight();
            }
            textView.setLayoutParams(layoutParams);
        } else {
            C87412m.m108603p("multiCodeTips");
            throw null;
        }
    }

    public final View getIvMyQrCodeButton() {
        View view = this.f316001x;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("ivMyQrCodeButton");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b4o;
    }

    public final View getMyQrCodeButton() {
        View view = this.f316000w;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("myQrCodeButton");
        throw null;
    }

    public final int getProductListBottomMarginDelta() {
        return this.f316004y0;
    }

    public final C71029e getSuccessAnimationListener() {
        return this.f315985J;
    }

    public final ArrayList<View> getSuccessMarkViewList() {
        return this.f315978C;
    }

    public final int getSuccessMarkViewSize() {
        return this.f315979D;
    }

    public View getTargetSuccessMarkView() {
        return this.f315988M ? (View) C110818d0.m150917O(this.f315978C, this.f315991Q) : (View) C110818d0.m150917O(this.f315978C, 0);
    }

    /* renamed from: h */
    public void mo151678h(Animator.AnimatorListener animatorListener) {
        super.mo151678h(animatorListener);
        this.f315983H.cancel();
        Bitmap bitmap = this.f315977B;
        if (bitmap != null && !bitmap.isRecycled()) {
            Bitmap bitmap2 = this.f315977B;
            C87412m.m108591d(bitmap2);
            bitmap2.recycle();
        }
        C111557w.m152065a(this, 1.0f, 0.0f, 200, new C106107b(animatorListener, this));
    }

    /* renamed from: l */
    public void mo151732l() {
        mo151722D();
    }

    /* renamed from: m */
    public void mo151680m(boolean z) {
        super.mo151680m(z);
        View myQrCodeButton = getMyQrCodeButton();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        View view = myQrCodeButton;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "onPreviewReady", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        myQrCodeButton.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "onPreviewReady", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        for (View view2 : this.f315978C) {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "onPreviewReady", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "onPreviewReady", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView = this.f316005z;
        if (textView != null) {
            textView.setVisibility(8);
            View view4 = this.f316003y;
            if (view4 != null) {
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "onPreviewReady", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "onPreviewReady", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ImageView imageView = this.f315976A;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f315988M = false;
                    this.f315981F = 0;
                    this.f315985J = null;
                    if (!z) {
                        mo151859t(true);
                        TextView scanTips = getScanTips();
                        if (scanTips != null) {
                            scanTips.setAlpha(1.0f);
                        }
                    }
                    if (true ^ (this instanceof ScanCodeProductMergeMaskView)) {
                        C111557w.m152065a(this, 0.0f, 1.0f, 50, (Animator.AnimatorListener) null);
                    }
                    this.f315993S.stopTimer();
                    mo151749v();
                    this.f315982G.removeAllListeners();
                    this.f315982G.removeAllUpdateListeners();
                    this.f315982G.cancel();
                    return;
                }
                C87412m.m108603p("frameImage");
                throw null;
            }
            C87412m.m108603p("multiCodeBgMask");
            throw null;
        }
        C87412m.m108603p("multiCodeTips");
        throw null;
    }

    /* renamed from: n */
    public void mo151733n() {
        Log.m105918d("MicroMsg.ScanCodeMaskView", "alvinluo startScanLineAnimation");
        this.f315983H.cancel();
        ImageView imageView = this.f315999v;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.f315983H.start();
            return;
        }
        C87412m.m108603p("scanLineImageView");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r7v26, types: [android.graphics.PointF] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0397  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo151681o(java.lang.Object r32, com.tencent.p014mm.plugin.scanner.view.C71029e r33) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            java.lang.String r2 = "data"
            gy3.C87412m.m108594g(r1, r2)
            r2 = r33
            r0.f315985J = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            boolean r4 = r1 instanceof java.util.ArrayList
            if (r4 == 0) goto L_0x05ea
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = sx3.C110818d0.m150916N(r4)
            boolean r4 = r4 instanceof com.tencent.qbar.WxQBarResult
            if (r4 == 0) goto L_0x05ea
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0031:
            boolean r5 = r1.hasNext()
            r6 = 4
            r7 = 0
            if (r5 == 0) goto L_0x0130
            java.lang.Object r5 = r1.next()
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.qbar.WxQBarResult"
            gy3.C87412m.m108592e(r5, r8)
            r8 = r5
            com.tencent.qbar.WxQBarResult r8 = (com.tencent.qbar.WxQBarResult) r8
            com.tencent.qbar.WxQBarPoint r9 = r8.f56824n
            if (r9 != 0) goto L_0x004b
            goto L_0x0031
        L_0x004b:
            int r10 = r9.point_cnt
            if (r10 != r6) goto L_0x00de
            android.graphics.Rect r10 = r31.getMPreviewRect()
            if (r10 == 0) goto L_0x00de
            yk2.a r10 = r31.getScanCamera()
            if (r10 == 0) goto L_0x00de
            yk2.a r10 = r31.getScanCamera()
            gy3.C87412m.m108591d(r10)
            boolean r10 = r10.f324146h
            if (r10 == 0) goto L_0x00a4
            boolean r10 = r0.f315987L
            if (r10 == 0) goto L_0x00a4
            android.graphics.PointF r10 = new android.graphics.PointF
            float r11 = r9.f56815x0
            float r12 = r9.f56816x1
            float r11 = r11 + r12
            float r12 = r9.f56817x2
            float r11 = r11 + r12
            float r12 = r9.f56818x3
            float r11 = r11 + r12
            android.graphics.Rect r12 = r31.getMPreviewRect()
            gy3.C87412m.m108591d(r12)
            int r12 = r12.height()
            int r12 = r12 * 4
            float r12 = (float) r12
            float r11 = r11 / r12
            float r12 = r9.f56819y0
            float r13 = r9.f56820y1
            float r12 = r12 + r13
            float r13 = r9.f56821y2
            float r12 = r12 + r13
            float r9 = r9.f56822y3
            float r12 = r12 + r9
            android.graphics.Rect r9 = r31.getMPreviewRect()
            gy3.C87412m.m108591d(r9)
            int r9 = r9.width()
            int r9 = r9 * 4
            float r6 = (float) r9
            float r12 = r12 / r6
            r10.<init>(r11, r12)
            goto L_0x00df
        L_0x00a4:
            android.graphics.PointF r10 = new android.graphics.PointF
            float r11 = r9.f56815x0
            float r12 = r9.f56816x1
            float r11 = r11 + r12
            float r12 = r9.f56817x2
            float r11 = r11 + r12
            float r12 = r9.f56818x3
            float r11 = r11 + r12
            android.graphics.Rect r12 = r31.getMPreviewRect()
            gy3.C87412m.m108591d(r12)
            int r12 = r12.width()
            int r12 = r12 * 4
            float r12 = (float) r12
            float r11 = r11 / r12
            float r12 = r9.f56819y0
            float r13 = r9.f56820y1
            float r12 = r12 + r13
            float r13 = r9.f56821y2
            float r12 = r12 + r13
            float r9 = r9.f56822y3
            float r12 = r12 + r9
            android.graphics.Rect r9 = r31.getMPreviewRect()
            gy3.C87412m.m108591d(r9)
            int r9 = r9.height()
            int r9 = r9 * 4
            float r6 = (float) r9
            float r12 = r12 / r6
            r10.<init>(r11, r12)
            goto L_0x00df
        L_0x00de:
            r10 = r7
        L_0x00df:
            if (r10 != 0) goto L_0x00e2
            goto L_0x0123
        L_0x00e2:
            android.graphics.Rect r6 = r31.getMScanRect()
            if (r6 == 0) goto L_0x0123
            android.graphics.PointF r7 = new android.graphics.PointF
            float r6 = r10.x
            android.graphics.Rect r9 = r31.getMScanRect()
            gy3.C87412m.m108591d(r9)
            int r9 = r9.width()
            float r9 = (float) r9
            float r6 = r6 * r9
            android.graphics.Rect r9 = r31.getMScanRect()
            gy3.C87412m.m108591d(r9)
            int r9 = r9.left
            float r9 = (float) r9
            float r6 = r6 + r9
            float r9 = r10.y
            android.graphics.Rect r10 = r31.getMScanRect()
            gy3.C87412m.m108591d(r10)
            int r10 = r10.height()
            float r10 = (float) r10
            float r9 = r9 * r10
            android.graphics.Rect r10 = r31.getMScanRect()
            gy3.C87412m.m108591d(r10)
            int r10 = r10.top
            float r10 = (float) r10
            float r9 = r9 + r10
            r7.<init>(r6, r9)
        L_0x0123:
            r4.add(r7)
            java.lang.String r6 = r8.f56829f
            r3.add(r6)
            r2.add(r5)
            goto L_0x0031
        L_0x0130:
            int r1 = r4.size()
            r5 = 0
            r8 = 1
            if (r1 <= r8) goto L_0x014a
            int r1 = r3.size()
            if (r1 != r8) goto L_0x014a
            java.lang.Object r1 = r4.get(r5)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            r4.clear()
            r4.add(r1)
        L_0x014a:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
            java.lang.String r3 = ""
        L_0x0155:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x01c5
            java.lang.Object r3 = r2.next()
            com.tencent.qbar.WxQBarResult r3 = (com.tencent.qbar.WxQBarResult) r3
            java.lang.String r9 = r3.f56828e
            int r9 = com.tencent.p014mm.plugin.scanner.C5177x.m5204a(r9)
            java.lang.Class<lx.x> r10 = p200lx.C61416x.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            lx.x r10 = (p200lx.C61416x) r10
            java.lang.String r3 = r3.f56829f
            boolean r3 = r10.mo71999h3(r9, r3)
            if (r3 == 0) goto L_0x018f
            android.content.Context r3 = r31.getContext()
            r10 = 2131835255(0x7f113977, float:1.9303643E38)
            java.lang.String r3 = r3.getString(r10)
            java.lang.String r10 = "context.getString(R.stri…_mask_view_appbrand_tips)"
            gy3.C87412m.m108593f(r3, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1.add(r9)
            goto L_0x0155
        L_0x018f:
            boolean r3 = com.tencent.p014mm.plugin.scanner.C5177x.m5205b(r9)
            if (r3 != 0) goto L_0x01ad
            android.content.Context r3 = r31.getContext()
            r10 = 2131835257(0x7f113979, float:1.9303647E38)
            java.lang.String r3 = r3.getString(r10)
            java.lang.String r10 = "context.getString(R.stri…code_mask_view_tiao_tips)"
            gy3.C87412m.m108593f(r3, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1.add(r9)
            goto L_0x0155
        L_0x01ad:
            android.content.Context r3 = r31.getContext()
            r10 = 2131835258(0x7f11397a, float:1.930365E38)
            java.lang.String r3 = r3.getString(r10)
            java.lang.String r10 = "context.getString(R.stri…_view_two_dimension_tips)"
            gy3.C87412m.m108593f(r3, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1.add(r9)
            goto L_0x0155
        L_0x01c5:
            int r1 = r1.size()
            if (r1 <= r8) goto L_0x01db
            android.content.Context r1 = r31.getContext()
            r2 = 2131835256(0x7f113978, float:1.9303645E38)
            java.lang.String r3 = r1.getString(r2)
            java.lang.String r1 = "context.getString(R.stri…ode_mask_view_multi_tips)"
            gy3.C87412m.m108593f(r3, r1)
        L_0x01db:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            int r2 = r4.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r1[r5] = r2
            java.lang.String r2 = "MicroMsg.ScanCodeMaskView"
            java.lang.String r10 = "alvinluo showSuccessView pointList %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r1)
            r0.f315981F = r5
            java.util.Iterator r1 = r4.iterator()
            r4 = 1
        L_0x01f9:
            boolean r10 = r1.hasNext()
            r11 = 2131312764(0x7f09407c, float:1.8243906E38)
            java.lang.String r12 = "multiCodeTips"
            r13 = 0
            r14 = 2
            if (r10 == 0) goto L_0x03b7
            java.lang.Object r10 = r1.next()
            android.graphics.PointF r10 = (android.graphics.PointF) r10
            if (r10 != 0) goto L_0x0210
            goto L_0x01f9
        L_0x0210:
            gy3.f0 r6 = new gy3.f0
            r6.<init>()
            java.util.ArrayList<android.view.View> r15 = r0.f315978C
            int r8 = r0.f315981F
            java.lang.Object r8 = sx3.C110818d0.m150917O(r15, r8)
            r6.f27484d = r8
            if (r8 != 0) goto L_0x0247
            android.content.Context r8 = r31.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            r15 = 2131496156(0x7f0c0cdc, float:1.8615869E38)
            android.view.View r8 = r8.inflate(r15, r7)
            android.widget.RelativeLayout$LayoutParams r15 = new android.widget.RelativeLayout$LayoutParams
            int r7 = r0.f315979D
            r15.<init>(r7, r7)
            r0.addView(r8, r15)
            java.lang.String r7 = "view"
            gy3.C87412m.m108593f(r8, r7)
            r6.f27484d = r8
            java.util.ArrayList<android.view.View> r7 = r0.f315978C
            r7.add(r8)
        L_0x0247:
            T r7 = r6.f27484d
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = r7.findViewById(r11)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 == 0) goto L_0x0259
            r11 = 2131756923(0x7f10077b, float:1.9144767E38)
            r8.setImageResource(r11)
        L_0x0259:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r8.mo10233c(r9)
            java.lang.Object[] r17 = r8.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView"
            java.lang.String r19 = "showSuccessView"
            java.lang.String r20 = "(Ljava/util/ArrayList;Ljava/lang/String;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r7
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.setVisibility(r8)
            java.lang.String r17 = "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView"
            java.lang.String r18 = "showSuccessView"
            java.lang.String r19 = "(Ljava/util/ArrayList;Ljava/lang/String;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            int r8 = r0.f315979D
            float r8 = (float) r8
            r11 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r11
            r7.setPivotX(r8)
            int r8 = r0.f315979D
            float r8 = (float) r8
            float r8 = r8 / r11
            r7.setPivotY(r8)
            float r8 = r10.x
            int r11 = r0.f315979D
            int r11 = r11 / r14
            float r11 = (float) r11
            float r8 = r8 - r11
            r7.setTranslationX(r8)
            float r8 = r10.y
            int r11 = r0.f315979D
            int r11 = r11 / r14
            float r11 = (float) r11
            float r8 = r8 - r11
            r7.setTranslationY(r8)
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.Float r11 = java.lang.Float.valueOf(r13)
            r8.mo10233c(r11)
            java.lang.Object[] r17 = r8.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView"
            java.lang.String r19 = "showSuccessView"
            java.lang.String r20 = "(Ljava/util/ArrayList;Ljava/lang/String;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            r7.setAlpha(r8)
            java.lang.String r17 = "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView"
            java.lang.String r18 = "showSuccessView"
            java.lang.String r19 = "(Ljava/util/ArrayList;Ljava/lang/String;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            r7.setScaleX(r13)
            r7.setScaleY(r13)
            float r8 = r10.x
            float r10 = r10.y
            r11 = 6
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Float r13 = java.lang.Float.valueOf(r8)
            r11[r5] = r13
            java.lang.Float r13 = java.lang.Float.valueOf(r10)
            r15 = 1
            r11[r15] = r13
            android.graphics.PointF r13 = r0.f315998p0
            float r13 = r13.x
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r11[r14] = r13
            android.graphics.PointF r13 = r0.f315998p0
            float r13 = r13.y
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r15 = 3
            r11[r15] = r13
            android.widget.TextView r13 = r0.f316005z
            if (r13 == 0) goto L_0x03b2
            int r13 = r13.getMeasuredWidth()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r15 = 4
            r11[r15] = r13
            r13 = 5
            android.widget.TextView r15 = r0.f316005z
            if (r15 == 0) goto L_0x03ad
            int r15 = r15.getMeasuredHeight()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r11[r13] = r15
            java.lang.String r13 = "alvinluo checkMultiCodeTipsPositionValid [%s, %s], multiCodeTips: [%s, %s], [%s, %s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r13, r11)
            int r11 = r0.f315980E
            int r11 = r11 / r14
            float r11 = (float) r11
            float r13 = r11 + r8
            android.graphics.PointF r15 = r0.f315998p0
            float r15 = r15.x
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 < 0) goto L_0x0394
            float r8 = r8 - r11
            android.widget.TextView r11 = r0.f316005z
            if (r11 == 0) goto L_0x038f
            int r11 = r11.getMeasuredWidth()
            float r11 = (float) r11
            float r15 = r15 + r11
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 > 0) goto L_0x0394
            int r8 = r0.f315980E
            int r8 = r8 / r14
            float r8 = (float) r8
            float r11 = r8 + r10
            android.graphics.PointF r13 = r0.f315998p0
            float r13 = r13.y
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L_0x0394
            float r10 = r10 - r8
            android.widget.TextView r8 = r0.f316005z
            if (r8 == 0) goto L_0x038a
            int r8 = r8.getMeasuredHeight()
            float r8 = (float) r8
            float r13 = r13 + r8
            int r8 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x0388
            goto L_0x0394
        L_0x0388:
            r8 = 0
            goto L_0x0395
        L_0x038a:
            gy3.C87412m.m108603p(r12)
            r8 = 0
            throw r8
        L_0x038f:
            r8 = 0
            gy3.C87412m.m108603p(r12)
            throw r8
        L_0x0394:
            r8 = 1
        L_0x0395:
            if (r8 != 0) goto L_0x0398
            r4 = 0
        L_0x0398:
            int r8 = r0.f315981F
            ul2.i r10 = new ul2.i
            r10.<init>(r0, r8, r6)
            r7.setOnClickListener(r10)
            int r6 = r0.f315981F
            r7 = 1
            int r6 = r6 + r7
            r0.f315981F = r6
            r6 = 4
            r7 = 0
            r8 = 1
            goto L_0x01f9
        L_0x03ad:
            gy3.C87412m.m108603p(r12)
            r1 = 0
            throw r1
        L_0x03b2:
            r1 = 0
            gy3.C87412m.m108603p(r12)
            throw r1
        L_0x03b7:
            int r1 = r0.f315981F
            java.util.ArrayList<android.view.View> r6 = r0.f315978C
            int r6 = r6.size()
        L_0x03bf:
            r7 = 8
            if (r1 >= r6) goto L_0x0414
            java.util.ArrayList<android.view.View> r8 = r0.f315978C
            java.lang.Object r8 = sx3.C110818d0.m150917O(r8, r1)
            android.view.View r8 = (android.view.View) r8
            if (r8 != 0) goto L_0x03ce
            goto L_0x0411
        L_0x03ce:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r15 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.mo10233c(r7)
            java.lang.Object[] r17 = r10.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView"
            java.lang.String r19 = "showSuccessView"
            java.lang.String r20 = "(Ljava/util/ArrayList;Ljava/lang/String;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r8
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r7 = r10.mo10231a(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8.setVisibility(r7)
            java.lang.String r17 = "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView"
            java.lang.String r18 = "showSuccessView"
            java.lang.String r19 = "(Ljava/util/ArrayList;Ljava/lang/String;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0411:
            int r1 = r1 + 1
            goto L_0x03bf
        L_0x0414:
            int r1 = r0.f315981F
            r6 = 1
            if (r1 <= r6) goto L_0x041b
            r1 = 1
            goto L_0x041c
        L_0x041b:
            r1 = 0
        L_0x041c:
            r0.f315988M = r1
            java.lang.String r6 = "multiCodeBgMask"
            if (r1 != 0) goto L_0x0496
            java.util.ArrayList<android.view.View> r1 = r0.f315978C
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x043b
            android.view.View r1 = r1.findViewById(r11)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L_0x043b
            r3 = 2131756922(0x7f10077a, float:1.9144765E38)
            r1.setImageResource(r3)
        L_0x043b:
            android.view.View r1 = r0.f316003y
            if (r1 == 0) goto L_0x0491
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.mo10233c(r7)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView"
            java.lang.String r19 = "showSuccessView"
            java.lang.String r20 = "(Ljava/util/ArrayList;Ljava/lang/String;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView"
            java.lang.String r18 = "showSuccessView"
            java.lang.String r19 = "(Ljava/util/ArrayList;Ljava/lang/String;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.widget.TextView r1 = r0.f316005z
            if (r1 == 0) goto L_0x048c
            r3 = 4
            r1.setVisibility(r3)
            goto L_0x0562
        L_0x048c:
            gy3.C87412m.m108603p(r12)
            r1 = 0
            throw r1
        L_0x0491:
            r1 = 0
            gy3.C87412m.m108603p(r6)
            throw r1
        L_0x0496:
            android.view.View r1 = r0.f316003y
            if (r1 == 0) goto L_0x05e5
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r7.mo10233c(r9)
            java.lang.Object[] r17 = r7.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView"
            java.lang.String r19 = "showSuccessView"
            java.lang.String r20 = "(Ljava/util/ArrayList;Ljava/lang/String;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r7 = r7.mo10231a(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r17 = "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView"
            java.lang.String r18 = "showSuccessView"
            java.lang.String r19 = "(Ljava/util/ArrayList;Ljava/lang/String;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r1 = r0.f316003y
            if (r1 == 0) goto L_0x05e0
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Float r8 = java.lang.Float.valueOf(r13)
            r7.mo10233c(r8)
            java.lang.Object[] r24 = r7.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView"
            java.lang.String r26 = "showSuccessView"
            java.lang.String r27 = "(Ljava/util/ArrayList;Ljava/lang/String;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setAlpha"
            java.lang.String r30 = "(F)V"
            r23 = r1
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r7 = r7.mo10231a(r5)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r1.setAlpha(r7)
            java.lang.String r24 = "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView"
            java.lang.String r25 = "showSuccessView"
            java.lang.String r26 = "(Ljava/util/ArrayList;Ljava/lang/String;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setAlpha"
            java.lang.String r29 = "(F)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            android.widget.TextView r1 = r0.f316005z
            if (r1 == 0) goto L_0x05db
            r1.setText(r3)
            android.widget.TextView r1 = r0.f316005z
            if (r1 == 0) goto L_0x05d6
            r1.setVisibility(r5)
            android.widget.TextView r1 = r0.f316005z
            if (r1 == 0) goto L_0x05d1
            r1.setAlpha(r13)
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            r1[r5] = r3
            int r3 = r0.f315997W
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7 = 1
            r1[r7] = r3
            java.lang.String r3 = "alvinluo fixMultiCodeTipsPosition valid: %b, current: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r1)
            r0.f316002x0 = r5
            if (r4 != 0) goto L_0x0557
            int r1 = r0.f315997W
            r3 = 32
            if (r1 == r3) goto L_0x0557
            r0.mo151723E(r3)
            goto L_0x0562
        L_0x0557:
            if (r4 == 0) goto L_0x0562
            int r1 = r0.f315997W
            r3 = 120(0x78, float:1.68E-43)
            if (r1 == r3) goto L_0x0562
            r0.mo151723E(r3)
        L_0x0562:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            boolean r3 = r0.f315988M
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1[r5] = r3
            int r3 = r0.f315981F
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r1[r5] = r3
            java.util.ArrayList<android.view.View> r3 = r0.f315978C
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r14] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            r4 = 3
            r1[r4] = r3
            java.lang.String r3 = "alvinluo showSuccessView isMultiCode: %b, pointCount: %d, successMarkViewList: %d, tipsPositionValid: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            r1 = 300(0x12c, double:1.48E-321)
            r3 = 0
            r0.mo151719A(r1, r3)
            boolean r1 = r0.f315988M
            if (r1 == 0) goto L_0x05ea
            android.view.View r1 = r0.f316003y
            if (r1 == 0) goto L_0x05cc
            android.view.ViewPropertyAnimator r1 = r1.animate()
            if (r1 == 0) goto L_0x05ea
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r1 = r1.alpha(r2)
            if (r1 == 0) goto L_0x05ea
            android.view.animation.LinearInterpolator r2 = new android.view.animation.LinearInterpolator
            r2.<init>()
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r2)
            if (r1 == 0) goto L_0x05ea
            r2 = 600(0x258, double:2.964E-321)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            if (r1 == 0) goto L_0x05ea
            ul2.j r2 = new ul2.j
            r2.<init>(r0)
            android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
            if (r1 == 0) goto L_0x05ea
            r1.start()
            goto L_0x05ea
        L_0x05cc:
            gy3.C87412m.m108603p(r6)
            r1 = 0
            throw r1
        L_0x05d1:
            r1 = 0
            gy3.C87412m.m108603p(r12)
            throw r1
        L_0x05d6:
            r1 = 0
            gy3.C87412m.m108603p(r12)
            throw r1
        L_0x05db:
            r1 = 0
            gy3.C87412m.m108603p(r12)
            throw r1
        L_0x05e0:
            r1 = 0
            gy3.C87412m.m108603p(r6)
            throw r1
        L_0x05e5:
            r1 = 0
            gy3.C87412m.m108603p(r6)
            throw r1
        L_0x05ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeMaskView.mo151681o(java.lang.Object, com.tencent.mm.plugin.scanner.view.e):void");
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!(getMeasuredWidth() == 0 || getMeasuredWidth() == this.f315989N)) {
            this.f315989N = getMeasuredWidth();
            mo151751x();
        }
        if (this.f316002x0) {
            PointF pointF = this.f315998p0;
            TextView textView = this.f316005z;
            if (textView != null) {
                pointF.x = textView.getX();
                PointF pointF2 = this.f315998p0;
                TextView textView2 = this.f316005z;
                if (textView2 != null) {
                    pointF2.y = textView2.getY();
                } else {
                    C87412m.m108603p("multiCodeTips");
                    throw null;
                }
            } else {
                C87412m.m108603p("multiCodeTips");
                throw null;
            }
        }
    }

    /* renamed from: p */
    public void mo151735p(boolean z) {
        Log.m105919d("MicroMsg.ScanCodeMaskView", "alvinluo onShowResultInfoView show: %b", Boolean.valueOf(z));
        if (z) {
            mo151750w();
        }
    }

    /* renamed from: q */
    public void mo151736q(boolean z) {
        Log.m105919d("MicroMsg.ScanCodeMaskView", "alvinluo onShowNetworkLoading show: %b", Boolean.valueOf(z));
        if (z) {
            mo151750w();
        }
    }

    /* renamed from: r */
    public void mo151683r() {
        super.mo151683r();
        Log.m105927v("MicroMsg.ScanCodeMaskView", "alvinluo onViewReady hashCode: %d", Integer.valueOf(hashCode()));
    }

    public void release() {
        this.f315993S.stopTimer();
        mo151749v();
        this.f315983H.removeAllListeners();
        this.f315983H.removeAllUpdateListeners();
        if (this.f315983H.isStarted() || this.f315983H.isRunning()) {
            this.f315983H.cancel();
        }
    }

    public final void setAnimationRect(Rect rect) {
        C87412m.m108594g(rect, "rect");
        this.f315986K.set(rect);
        Log.m105919d("MicroMsg.ScanCodeMaskView", "alvinluo setAnimationRect %s", rect);
        ImageView imageView = this.f315999v;
        ViewGroup.LayoutParams layoutParams = null;
        if (imageView == null) {
            C87412m.m108603p("scanLineImageView");
            throw null;
        } else if (imageView != null) {
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 != null) {
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = this.f315986K.left;
                }
                layoutParams = layoutParams2;
            }
            imageView.setLayoutParams(layoutParams);
            ValueAnimator valueAnimator = this.f315983H;
            Rect rect2 = this.f315986K;
            valueAnimator.setFloatValues(new float[]{(float) rect2.top, (float) rect2.bottom});
        } else {
            C87412m.m108603p("scanLineImageView");
            throw null;
        }
    }

    public void setBottomExtraHeight(int i) {
        super.setBottomExtraHeight(i);
        View myQrCodeButton = getMyQrCodeButton();
        ViewGroup.LayoutParams layoutParams = getMyQrCodeButton().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C76577a.m92151b(getContext(), 16) + getMBottomExtraHeight();
        }
        myQrCodeButton.setLayoutParams(layoutParams);
        post(new C106115h(this));
        mo151723E(120);
    }

    public void setDecodeSuccessFrameData(ScanDecodeFrameData scanDecodeFrameData) {
        super.setDecodeSuccessFrameData(scanDecodeFrameData);
        ((C119157j) C119157j.f356862d).mo183875f(new C106116i(this, scanDecodeFrameData));
    }

    public final void setIvMyQrCodeButton(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f316001x = view;
    }

    public final void setMyQrCodeButton(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f316000w = view;
    }

    public final void setMyQrCodeButtonVisible(boolean z) {
        View myQrCodeButton = getMyQrCodeButton();
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = myQrCodeButton;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "setMyQrCodeButtonVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        myQrCodeButton.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "setMyQrCodeButtonVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void setNeedRotate(boolean z) {
        this.f315987L = z;
    }

    public final void setProductListBottomMarginDelta(int i) {
        this.f316004y0 = i;
    }

    public final void setSuccessAnimationListener(C71029e eVar) {
        this.f315985J = eVar;
    }

    public final void setSuccessMarkClickListener(C106071g1 g1Var) {
        C87412m.m108594g(g1Var, "successMarkClickListener");
        this.f315990P = g1Var;
    }

    public final void setSuccessMarkViewList(ArrayList<View> arrayList) {
        C87412m.m108594g(arrayList, "<set-?>");
        this.f315978C = arrayList;
    }

    public final void setSuccessMarkViewSize(int i) {
        this.f315979D = i;
    }

    /* renamed from: v */
    public final void mo151749v() {
        ValueAnimator valueAnimator = this.f315994T;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f315994T;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.f315994T;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f315994T = null;
    }

    /* renamed from: w */
    public final void mo151750w() {
        if (this.f315988M) {
            View view = this.f316003y;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "dismissMultiCodeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "dismissMultiCodeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                for (View view2 : this.f315978C) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(Float.valueOf(0.0f));
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "dismissMultiCodeView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "dismissMultiCodeView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                this.f315993S.stopTimer();
                mo151749v();
                TextView textView = this.f316005z;
                if (textView != null) {
                    C111557w.m152065a(textView, 1.0f, 0.0f, 200, (Animator.AnimatorListener) null);
                } else {
                    C87412m.m108603p("multiCodeTips");
                    throw null;
                }
            } else {
                C87412m.m108603p("multiCodeBgMask");
                throw null;
            }
        }
    }

    /* renamed from: x */
    public final void mo151751x() {
        int measuredWidth = getMeasuredWidth();
        float measuredHeight = (float) getMeasuredHeight();
        setAnimationRect(new Rect(0, (int) (0.15f * measuredHeight), measuredWidth, (int) (measuredHeight * 0.6f)));
    }

    /* renamed from: y */
    public void mo151752y(View view) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.j1e);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.scan_line)");
        this.f315999v = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.h9y);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.my_qr_code)");
        setMyQrCodeButton(findViewById2);
        View findViewById3 = view.findViewById(C0966R.C0970id.j0b);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.iv_my_qr_code)");
        setIvMyQrCodeButton(findViewById3);
        View findViewById4 = view.findViewById(C0966R.C0970id.h2w);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.multi_code_mask)");
        this.f316003y = findViewById4;
        View findViewById5 = view.findViewById(C0966R.C0970id.f358785h30);
        C87412m.m108593f(findViewById5, "view.findViewById(R.id.multi_code_tips)");
        this.f316005z = (TextView) findViewById5;
        View findViewById6 = view.findViewById(C0966R.C0970id.eer);
        C87412m.m108593f(findViewById6, "view.findViewById(R.id.frame_image)");
        this.f315976A = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(C0966R.C0970id.j1z);
        if (findViewById7 != null) {
            this.f315978C.clear();
            this.f315978C.add(findViewById7);
        }
        getMyQrCodeButton().setOnClickListener(new C5171a(this));
        mo151751x();
        this.f315984I = 0.16f;
        this.f315983H.setInterpolator(new LinearInterpolator());
        this.f315983H.setDuration(2500);
        this.f315983H.addListener(new C111201f(this));
        this.f315983H.addUpdateListener(new C111202g(this));
        this.f315983H.setRepeatMode(1);
        this.f315983H.setRepeatCount(-1);
    }

    /* renamed from: z */
    public final Bitmap mo151753z(Bitmap bitmap, int i, int i2, int i3) {
        Bitmap bitmap2 = bitmap;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (bitmap2 == null) {
            return null;
        }
        Log.m105925i("MicroMsg.ScanCodeMaskView", "alvinlu rotateAndScaleBitmap rotation: %d, targetWidth: %d, targetHeight: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i4);
        boolean z = i4 % 180 != 0;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int height2 = z ? bitmap.getHeight() : bitmap.getWidth();
        int width2 = z ? bitmap.getWidth() : bitmap.getHeight();
        if (!(i5 == 0 || i6 == 0)) {
            float f = (float) height2;
            float f2 = (float) width2;
            float f3 = (((float) i5) * 1.0f) / ((float) i6);
            if ((f * 1.0f) / f2 > f3) {
                width = (int) (f3 * f2);
                height = width2;
            } else {
                height = (int) (f / f3);
                width = height2;
            }
        }
        int max = Math.max(0, (height2 - width) / 2);
        int max2 = Math.max(0, (width2 - height) / 2);
        Log.m105925i("MicroMsg.ScanCodeMaskView", "alvinluo rotateAndScaleBitmap finalWidth: %d, finalHeight: %d, x: %d, y: %d", Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(max), Integer.valueOf(max2));
        Bitmap createBitmap = z ? Bitmap.createBitmap(bitmap, max2, max, height, width, matrix, true) : Bitmap.createBitmap(bitmap, max, max2, width, height, matrix, true);
        if (!C87412m.m108589b(createBitmap, bitmap2) && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanCodeMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f315978C = new ArrayList<>();
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.aly);
        this.f315979D = dimensionPixelSize;
        this.f315980E = (dimensionPixelSize - (getResources().getDimensionPixelSize(C0966R.dimen.f3926j6) * 2)) + (getResources().getDimensionPixelSize(C0966R.dimen.f3963ll) * 2);
        this.f315982G = new ValueAnimator();
        this.f315983H = new ValueAnimator();
        this.f315986K = new Rect(0, 0, 0, 0);
        this.f315991Q = -1;
        C111204h hVar = new C111204h(this);
        this.f315992R = hVar;
        this.f315993S = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) hVar, true);
        this.f315995U = new AccelerateInterpolator(1.5f);
        this.f315996V = new DecelerateInterpolator(1.5f);
        this.f315997W = 120;
        this.f315998p0 = new PointF();
        this.f316002x0 = true;
        View inflate = LayoutInflater.from(context).inflate(getLayoutId(), this, true);
        C87412m.m108593f(inflate, "view");
        mo151752y(inflate);
    }
}
