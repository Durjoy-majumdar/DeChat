package f92;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import ba2.C28275c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import d92.C107028a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import l92.C109296d;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: f92.b */
public final class C107522b implements C107028a.C45291b {

    /* renamed from: a */
    public final /* synthetic */ C109296d f321695a;

    /* renamed from: b */
    public final /* synthetic */ Point f321696b;

    /* renamed from: c */
    public final /* synthetic */ C107028a f321697c;

    /* renamed from: d */
    public final /* synthetic */ Bitmap f321698d;

    /* renamed from: e */
    public final /* synthetic */ boolean f321699e;

    /* renamed from: f */
    public final /* synthetic */ float f321700f;

    /* renamed from: f92.b$a */
    public static final class C107523a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109296d f321701d;

        public C107523a(C109296d dVar) {
            this.f321701d = dVar;
        }

        public final void run() {
            C109296d dVar = this.f321701d;
            if (dVar != null) {
                C109296d.C109297a.m148405a(dVar, 0, 1, (Object) null);
            }
        }
    }

    /* renamed from: f92.b$b */
    public static final class C107524b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Point f321702d;

        /* renamed from: e */
        public final /* synthetic */ C107028a f321703e;

        /* renamed from: f */
        public final /* synthetic */ Bitmap f321704f;

        /* renamed from: g */
        public final /* synthetic */ boolean f321705g;

        /* renamed from: h */
        public final /* synthetic */ float f321706h;

        /* renamed from: i */
        public final /* synthetic */ C109296d f321707i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107524b(Point point, C107028a aVar, Bitmap bitmap, boolean z, float f, C109296d dVar) {
            super(0);
            this.f321702d = point;
            this.f321703e = aVar;
            this.f321704f = bitmap;
            this.f321705g = z;
            this.f321706h = f;
            this.f321707i = dVar;
        }

        public Object invoke() {
            Point point = this.f321702d;
            if (point != null) {
                C107028a aVar = this.f321703e;
                Bitmap bitmap = this.f321704f;
                boolean z = this.f321705g;
                float f = this.f321706h;
                C109296d dVar = this.f321707i;
                C87412m.m108594g(aVar, "pageAdapter");
                Log.m105925i("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doMaskAnimation, ballPos(x:%d, y:%d), lastSwipePosX:%f", Integer.valueOf(point.x), Integer.valueOf(point.y), Float.valueOf(f));
                if (aVar.getMaskView() == null) {
                    Log.m105928w("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doMaskAnimation, page mask view is null");
                    if (dVar != null) {
                        C109296d.C109297a.m148405a(dVar, 0, 1, (Object) null);
                    }
                } else if (aVar.getContentView() == null) {
                    Log.m105928w("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doMaskAnimation, page content view is null");
                    if (dVar != null) {
                        C109296d.C109297a.m148405a(dVar, 0, 1, (Object) null);
                    }
                } else if (aVar.mo67905b() == null) {
                    Log.m105928w("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doMaskAnimation, page root view is null");
                    if (dVar != null) {
                        C109296d.C109297a.m148405a(dVar, 0, 1, (Object) null);
                    }
                } else {
                    Bitmap bitmap2 = aVar.getBitmap();
                    if (bitmap2 == null || bitmap2.isRecycled() || bitmap2.getWidth() == 0 || bitmap2.getHeight() == 0) {
                        Log.m105928w("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doMaskAnimation, page get bitmap is null");
                        if (dVar != null) {
                            C109296d.C109297a.m148405a(dVar, 0, 1, (Object) null);
                        }
                    } else {
                        if (z) {
                            bitmap = bitmap2;
                        }
                        C107529g gVar = new C107529g(aVar.getActivity(), bitmap2);
                        gVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        int i = point.x;
                        int i2 = point.y;
                        gVar.f321723p = i;
                        gVar.f321724q = i2;
                        gVar.f321722o = C28275c.f77849a / 2;
                        gVar.setContentStartPosX((int) f);
                        gVar.setListener(new C107520a(dVar, bitmap, gVar));
                        ViewGroup b = aVar.mo67905b();
                        if (b != null) {
                            b.addView(gVar, b.getChildCount());
                        }
                        View contentView = aVar.getContentView();
                        if (contentView != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            View view = contentView;
                            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBSwipeTransformationHelper", "doMaskAnimation", "(Lcom/tencent/mm/plugin/multitask/adapter/IMultiTaskPageAdapter;Landroid/graphics/Point;Landroid/graphics/Bitmap;ZFLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;Z)Landroid/graphics/Bitmap;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            contentView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBSwipeTransformationHelper", "doMaskAnimation", "(Lcom/tencent/mm/plugin/multitask/adapter/IMultiTaskPageAdapter;Landroid/graphics/Point;Landroid/graphics/Bitmap;ZFLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;Z)Landroid/graphics/Bitmap;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        LinearInterpolator linearInterpolator = new LinearInterpolator();
                        int i3 = gVar.f321727t;
                        gVar.f321728u = i3 > 0;
                        int i4 = gVar.f321723p;
                        if (i3 < i4) {
                            i4 = i3;
                        }
                        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("canvasTranslationX", new int[]{i4, -i3});
                        int i5 = gVar.f321723p;
                        if (gVar.f321728u) {
                            int i6 = gVar.f321727t;
                            i5 = i6 < i5 ? i5 - i6 : i6;
                        }
                        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("translationX", new int[]{i5, i5}), PropertyValuesHolder.ofInt("translationY", new int[]{0, gVar.f321724q}), PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, (((float) gVar.f321722o) * 2.0f) / ((float) gVar.f321725r)}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, (((float) gVar.f321722o) * 2.0f) / ((float) gVar.f321726s)}), ofInt, PropertyValuesHolder.ofInt("bgAlpha", new int[]{255, 0})});
                        ofPropertyValuesHolder.setDuration((long) 250);
                        ofPropertyValuesHolder.setInterpolator(linearInterpolator);
                        ofPropertyValuesHolder.addUpdateListener(new C107527e(gVar));
                        ofPropertyValuesHolder.addListener(new C107528f(gVar));
                        ofPropertyValuesHolder.start();
                    }
                }
            } else {
                C109296d dVar2 = this.f321707i;
                if (dVar2 != null) {
                    C109296d.C109297a.m148405a(dVar2, 0, 1, (Object) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C107522b(C109296d dVar, Point point, C107028a aVar, Bitmap bitmap, boolean z, float f) {
        this.f321695a = dVar;
        this.f321696b = point;
        this.f321697c = aVar;
        this.f321698d = bitmap;
        this.f321699e = z;
        this.f321700f = f;
    }

    public void onComplete(boolean z) {
        if (!z) {
            Log.m105924i("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doTransform, convertToTranslucent not complete");
            MMHandlerThread.postToMainThread(new C107523a(this.f321695a));
            return;
        }
        C61926c.m72668M(new C107524b(this.f321696b, this.f321697c, this.f321698d, this.f321699e, this.f321700f, this.f321695a));
    }
}
