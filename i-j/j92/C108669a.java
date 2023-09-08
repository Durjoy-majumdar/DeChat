package j92;

import aj3.C103374a;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import ba2.C39747a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import d92.C107028a;
import gy3.C87412m;
import h92.C108177a;
import h92.C108178b;
import h92.C98325d;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import k92.C108974b;
import l92.C109296d;
import nj3.C88990b;
import z04.C66723k;

/* renamed from: j92.a */
public final class C108669a extends C108177a {

    /* renamed from: a */
    public C107028a f325428a;

    /* renamed from: b */
    public C108974b f325429b;

    /* renamed from: c */
    public C108178b f325430c;

    /* renamed from: d */
    public C98325d f325431d;

    /* renamed from: e */
    public C109296d f325432e;

    /* renamed from: f */
    public boolean f325433f;

    /* renamed from: g */
    public long f325434g = -1;

    /* renamed from: h */
    public boolean f325435h = true;

    /* renamed from: j92.a$a */
    public final class C108670a extends C108178b.C108179a implements C88990b.C61771c {

        /* renamed from: a */
        public int f325436a = -1;

        /* renamed from: b */
        public int f325437b = -1;

        /* renamed from: c */
        public Rect f325438c;

        /* renamed from: d */
        public boolean f325439d;

        /* renamed from: e */
        public final int f325440e = 400;

        /* renamed from: j92.a$a$a */
        public static final class C98922a implements C103374a.C67055a {

            /* renamed from: a */
            public final /* synthetic */ float f289966a;

            /* renamed from: b */
            public final /* synthetic */ int f289967b;

            /* renamed from: c */
            public final /* synthetic */ int f289968c;

            /* renamed from: d */
            public final /* synthetic */ float f289969d;

            /* renamed from: e */
            public final /* synthetic */ Rect f289970e;

            /* renamed from: f */
            public final /* synthetic */ C98325d f289971f;

            /* renamed from: g */
            public final /* synthetic */ int f289972g;

            /* renamed from: h */
            public final /* synthetic */ int f289973h;

            public C98922a(float f, int i, int i2, float f2, Rect rect, C98325d dVar, int i3, int i4) {
                this.f289966a = f;
                this.f289967b = i;
                this.f289968c = i2;
                this.f289969d = f2;
                this.f289970e = rect;
                this.f289971f = dVar;
                this.f289972g = i3;
                this.f289973h = i4;
            }

            /* renamed from: a */
            public final void mo91065a(float f) {
                float f2 = this.f289966a;
                float f3 = (float) 1;
                float f4 = f2 + ((f3 - f2) * f);
                float height = (((((float) this.f289968c) * this.f289969d) - ((float) this.f289970e.height())) / ((float) 2)) * f4 * (f3 / this.f289969d);
                this.f289971f.setPivotX((float) this.f289972g);
                this.f289971f.setPivotY((float) this.f289973h);
                this.f289971f.setMaskAlpha((int) (((float) 255) * f4));
                this.f289971f.mo137622a(0.0f, height, (float) this.f289967b, ((float) this.f289968c) - height);
                int i = C98325d.f288196u;
                float f5 = (((float) C98325d.f288196u) * f4) / this.f289969d;
                this.f289971f.mo137623b(f5, f5, f5, f5, f5, f5, f5, f5);
                this.f289971f.postInvalidate();
            }
        }

        /* renamed from: j92.a$a$c */
        public static final class C98923c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C108669a f289974d;

            public C98923c(C108669a aVar) {
                this.f289974d = aVar;
            }

            public final void run() {
                C98325d dVar = this.f289974d.f325431d;
                if (dVar != null) {
                    ViewParent viewParent = null;
                    if ((dVar != null ? dVar.getParent() : null) != null) {
                        C98325d dVar2 = this.f289974d.f325431d;
                        if (dVar2 != null) {
                            viewParent = dVar2.getParent();
                        }
                        C87412m.m108592e(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) viewParent).removeView(this.f289974d.f325431d);
                    }
                }
            }
        }

        /* renamed from: j92.a$a$b */
        public static final class C108671b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C108669a f325442d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f325443e;

            /* renamed from: j92.a$a$b$a */
            public static final class C108672a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C108669a f325444d;

                /* renamed from: e */
                public final /* synthetic */ Bitmap f325445e;

                public C108672a(C108669a aVar, Bitmap bitmap) {
                    this.f325444d = aVar;
                    this.f325445e = bitmap;
                }

                public final void run() {
                    C109296d dVar = this.f325444d.f325432e;
                    if (dVar != null) {
                        dVar.mo90718c(this.f325445e, 3);
                    }
                    C98325d dVar2 = this.f325444d.f325431d;
                    if (dVar2 != null) {
                        ViewParent viewParent = null;
                        if ((dVar2 != null ? dVar2.getParent() : null) != null) {
                            C98325d dVar3 = this.f325444d.f325431d;
                            if (dVar3 != null) {
                                viewParent = dVar3.getParent();
                            }
                            C87412m.m108592e(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
                            ((ViewGroup) viewParent).removeView(this.f325444d.f325431d);
                        }
                    }
                }
            }

            public C108671b(C108669a aVar, Bitmap bitmap) {
                this.f325442d = aVar;
                this.f325443e = bitmap;
            }

            public final void run() {
                MMHandlerThread.postToMainThread(new C108672a(this.f325442d, this.f325443e));
            }
        }

        /* renamed from: j92.a$a$d */
        public static final class C108673d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C108669a f325446d;

            public C108673d(C108669a aVar) {
                this.f325446d = aVar;
            }

            public final void run() {
                C108669a aVar = this.f325446d;
                C109296d dVar = aVar.f325432e;
                ViewParent viewParent = null;
                if (dVar != null) {
                    C98325d dVar2 = aVar.f325431d;
                    dVar.mo90718c(dVar2 != null ? dVar2.getContentBitmap() : null, 3);
                }
                C98325d dVar3 = this.f325446d.f325431d;
                if (dVar3 != null) {
                    if ((dVar3 != null ? dVar3.getParent() : null) != null) {
                        C98325d dVar4 = this.f325446d.f325431d;
                        if (dVar4 != null) {
                            viewParent = dVar4.getParent();
                        }
                        C87412m.m108592e(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) viewParent).removeView(this.f325446d.f325431d);
                    }
                }
            }
        }

        public C108670a() {
        }

        /* renamed from: a */
        public int mo158604a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public int mo158605b(View view) {
            return 1;
        }

        /* renamed from: c */
        public void mo158606c(View view, int i) {
            Log.m105924i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "onViewCaptured");
            C108669a.this.mo159683c(3, false);
            this.f325436a = -1;
            this.f325437b = -1;
            this.f325439d = false;
        }

        /* renamed from: d */
        public void mo158607d(int i) {
            Log.m105918d("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "onViewDragStateChanged, state:" + i);
        }

        /* renamed from: e */
        public void mo158608e(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: f */
        public void mo158609f(View view, float f, float f2, float f3, float f4) {
            if (!this.f325439d) {
                if (Math.abs(f) <= ((float) this.f325440e) || !mo159686i(0.0f)) {
                    MMHandlerThread.postToMainThread(new C98923c(C108669a.this));
                    C108669a aVar = C108669a.this;
                    aVar.f325434g = -1;
                    View contentView = aVar.mo159684d().getContentView();
                    if (contentView != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view2 = contentView;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/multitask/animation/swipeback/singlescene/MultiTaskSwipeBackAnimWrapperSS$ViewDragCallback", "onViewReleased", "(Landroid/view/View;FFFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        contentView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/multitask/animation/swipeback/singlescene/MultiTaskSwipeBackAnimWrapperSS$ViewDragCallback", "onViewReleased", "(Landroid/view/View;FFFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    return;
                }
                this.f325439d = true;
                Log.m105924i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "onViewReleased, auto add multitask!");
            }
        }

        /* renamed from: g */
        public void mo158610g(float f, float f2, int i, int i2, int i3, int i4) {
            Rect rect;
            C98325d dVar = C108669a.this.f325431d;
            if (dVar != null) {
                if (!(dVar != null && dVar.getWidth() == 0)) {
                    C108669a aVar = C108669a.this;
                    C108178b bVar = aVar.f325430c;
                    if ((bVar != null ? bVar.f323928v : null) != null) {
                        C98325d dVar2 = aVar.f325431d;
                        int width = dVar2 != null ? dVar2.getWidth() : 0;
                        C98325d dVar3 = C108669a.this.f325431d;
                        int height = dVar3 != null ? dVar3.getHeight() : 0;
                        if (this.f325438c == null) {
                            this.f325438c = C39747a.m42531c(C108669a.this.f325431d);
                        }
                        if (this.f325436a == -1 && this.f325437b == -1) {
                            C98325d dVar4 = C108669a.this.f325431d;
                            this.f325436a = dVar4 != null ? (int) dVar4.getTranslationX() : 0;
                            C98325d dVar5 = C108669a.this.f325431d;
                            this.f325437b = dVar5 != null ? (int) dVar5.getTranslationY() : 0;
                        }
                        float f3 = (float) width;
                        float f4 = (f / f3) / ((float) 3);
                        C108178b bVar2 = C108669a.this.f325430c;
                        if (bVar2 == null || (rect = bVar2.f323928v) == null) {
                            rect = new Rect();
                        }
                        float width2 = ((float) rect.width()) / f3;
                        int width3 = rect.left + (rect.width() / 2);
                        int height2 = rect.top + (rect.height() / 2);
                        float f5 = 1.0f;
                        if (f4 > 1.0f) {
                            f4 = 1.0f;
                        } else if (f4 < 0.0f) {
                            f4 = 0.0f;
                        }
                        float f6 = (float) 1;
                        float f7 = f6 - width2;
                        float f8 = 1.0f - (f4 * f7);
                        if (f8 > 1.0f) {
                            f8 = 1.0f;
                        }
                        float f9 = (f6 - f8) / f7;
                        if (f9 <= 1.0f) {
                            f5 = f9 < 0.0f ? 0.0f : f9;
                        }
                        float f15 = (float) width3;
                        Rect rect2 = this.f325438c;
                        float width4 = f15 - ((float) ((rect2 != null ? rect2.left : 0) + ((rect2 != null ? rect2.width() : 0) / 2)));
                        float f16 = (float) height2;
                        Rect rect3 = this.f325438c;
                        int i5 = rect3 != null ? rect3.top : 0;
                        int height3 = rect3 != null ? rect3.height() : 0;
                        float f17 = ((float) this.f325436a) + (width4 * width2 * f5);
                        float f18 = ((float) this.f325437b) + ((f16 - ((float) (i5 + (height3 / 2)))) * width2 * f5);
                        if (f5 < 0.16f || this.f325439d) {
                            float f19 = (float) height;
                            float height4 = (((f19 * width2) - ((float) rect.height())) / ((float) 2)) * f5 * (f6 / width2);
                            float f25 = f19 - height4;
                            C98325d dVar6 = C108669a.this.f325431d;
                            if (dVar6 != null) {
                                dVar6.setMaskAlpha((int) (((float) 255) * f5));
                            }
                            C98325d dVar7 = C108669a.this.f325431d;
                            if (dVar7 != null) {
                                dVar7.mo137622a(0.0f, height4, f3, f25);
                            }
                            int i6 = C98325d.f288196u;
                            float f26 = (((float) C98325d.f288196u) * f5) / f8;
                            C98325d dVar8 = C108669a.this.f325431d;
                            if (dVar8 != null) {
                                dVar8.mo137623b(f26, f26, f26, f26, f26, f26, f26, f26);
                            }
                            C98325d dVar9 = C108669a.this.f325431d;
                            if (dVar9 != null) {
                                dVar9.setPivotX(f15);
                            }
                            C98325d dVar10 = C108669a.this.f325431d;
                            if (dVar10 != null) {
                                dVar10.setPivotY(f16);
                            }
                            C98325d dVar11 = C108669a.this.f325431d;
                            if (dVar11 != null) {
                                dVar11.setTranslationX(f17);
                            }
                            C98325d dVar12 = C108669a.this.f325431d;
                            if (dVar12 != null) {
                                dVar12.setTranslationY(f18);
                            }
                            C98325d dVar13 = C108669a.this.f325431d;
                            if (dVar13 != null) {
                                dVar13.setScaleX(f8);
                            }
                            C98325d dVar14 = C108669a.this.f325431d;
                            if (dVar14 != null) {
                                dVar14.setScaleY(f8);
                            }
                            C98325d dVar15 = C108669a.this.f325431d;
                            if (dVar15 != null) {
                                dVar15.postInvalidate();
                            }
                            Log.m105919d("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "touchX: %f, touchY: %f, dx: %d, dy: %d, transX: %f, transY: %f, scale: %f ", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f17), Float.valueOf(f18), Float.valueOf(f8));
                            return;
                        }
                        this.f325439d = true;
                        if (!mo159686i(f5)) {
                            MMHandlerThread.postToMainThread(new C108673d(C108669a.this));
                        }
                    }
                }
            }
        }

        /* renamed from: h */
        public boolean mo158611h(View view, int i) {
            C108178b bVar = C108669a.this.f325430c;
            if (bVar == null) {
                return false;
            }
            if (!(((bVar.f323917k & 1) << i) != 0)) {
                return false;
            }
            int[] iArr = bVar.f323914h;
            return ((iArr != null ? iArr[i] : 0) & 1) != 0;
        }

        /* renamed from: i */
        public final boolean mo159686i(float f) {
            Rect rect;
            C98325d dVar = C108669a.this.f325431d;
            Bitmap contentBitmap = dVar != null ? dVar.getContentBitmap() : null;
            C108669a aVar = C108669a.this;
            if (dVar == null || contentBitmap == null) {
                return false;
            }
            int width = (int) (((float) contentBitmap.getWidth()) * 1.0f);
            int height = (int) (((float) contentBitmap.getHeight()) * 1.0f);
            Rect rect2 = new Rect(0, 0, width, height);
            C108178b bVar = aVar.f325430c;
            if (bVar == null || (rect = bVar.f323928v) == null) {
                rect = new Rect();
            }
            Rect rect3 = rect;
            int width2 = rect3.left + (rect3.width() / 2);
            int height2 = rect3.top + (rect3.height() / 2);
            float width3 = ((float) rect3.width()) / ((float) width);
            float width4 = ((float) (width2 - (rect2.left + (rect2.width() / 2)))) * width3;
            float height3 = ((float) (height2 - (rect2.top + (rect2.height() / 2)))) * width3;
            C103374a a = C103374a.m137034a(dVar);
            C98922a aVar2 = r2;
            C98922a aVar3 = new C98922a(f, width, height, width3, rect3, dVar, width2, height2);
            a.mo143285h(aVar2).mo143289l(new C108671b(aVar, contentBitmap)).mo143280c(width3).mo143281d(width3).mo143287j(width4).mo143288k(height3).mo143283f(new AccelerateInterpolator()).mo143282e(250).mo143286i();
            return true;
        }

        public void onComplete(boolean z) {
            Log.m105918d("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "onComplete");
        }
    }

    /* renamed from: j92.a$b */
    public static final class C108674b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108669a f325447d;

        /* renamed from: e */
        public final /* synthetic */ int f325448e;

        /* renamed from: f */
        public final /* synthetic */ boolean f325449f;

        public C108674b(C108669a aVar, int i, boolean z) {
            this.f325447d = aVar;
            this.f325448e = i;
            this.f325449f = z;
        }

        public final void run() {
            Rect rect;
            C108669a aVar = this.f325447d;
            C108178b bVar = aVar.f325430c;
            if ((bVar != null ? bVar.f323928v : null) != null) {
                int i = this.f325448e;
                boolean z = this.f325449f;
                C109296d dVar = aVar.f325432e;
                Log.m105925i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "initMaskView, exitAnim:%b, enterAnim:%b, way:%d", Boolean.valueOf(z), Boolean.FALSE, Integer.valueOf(i));
                if (aVar.mo159684d().getMaskView() == null) {
                    Log.m105928w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "doMaskAnimation, page mask view is null");
                    if (dVar != null) {
                        dVar.mo90717b(i);
                    }
                } else if (aVar.mo159684d().getContentView() == null) {
                    Log.m105928w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "doMaskAnimation, page content view is null");
                    if (dVar != null) {
                        dVar.mo90717b(i);
                    }
                } else if (aVar.mo159684d().mo67905b() == null) {
                    Log.m105928w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "doMaskAnimation, page root view is null");
                    if (dVar != null) {
                        dVar.mo90717b(i);
                    }
                } else if (aVar.f325433f) {
                    Log.m105928w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "isExitAnimating now!");
                } else {
                    Bitmap bitmap = aVar.mo159684d().getBitmap();
                    if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
                        Log.m105928w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "doMaskAnimation, page get bitmap is null");
                        if (dVar != null) {
                            dVar.mo90717b(i);
                            return;
                        }
                        return;
                    }
                    C98325d dVar2 = aVar.f325431d;
                    if (dVar2 == null || dVar2.getParent() == null) {
                        C98325d dVar3 = new C98325d(aVar.mo159684d().getActivity(), bitmap);
                        aVar.f325431d = dVar3;
                        dVar3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        ViewGroup b = aVar.mo159684d().mo67905b();
                        if (b != null) {
                            b.addView(aVar.f325431d, b.getChildCount());
                        }
                    }
                    C108974b bVar2 = aVar.f325429b;
                    String i2 = bVar2 != null ? bVar2.mo160085i(i) : null;
                    if (Util.isNullOrNil(i2)) {
                        if (i == 4) {
                            C108974b bVar3 = aVar.f325429b;
                            if (bVar3 != null) {
                                i2 = bVar3.mo160088n();
                            }
                        } else {
                            C108974b bVar4 = aVar.f325429b;
                            if (bVar4 != null) {
                                i2 = bVar4.getPosition();
                            }
                        }
                        i2 = null;
                    }
                    if (i2 != null) {
                        try {
                            Object[] array = new C66723k(",").mo90760e(i2, 0).toArray(new String[0]);
                            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            String[] strArr = (String[]) array;
                            if (strArr.length == 4) {
                                C108178b bVar5 = aVar.f325430c;
                                if (bVar5 != null) {
                                    Integer valueOf = Integer.valueOf(strArr[0]);
                                    C87412m.m108593f(valueOf, "valueOf(posVec[0])");
                                    int intValue = valueOf.intValue();
                                    Integer valueOf2 = Integer.valueOf(strArr[1]);
                                    C87412m.m108593f(valueOf2, "valueOf(posVec[1])");
                                    int intValue2 = valueOf2.intValue();
                                    Integer valueOf3 = Integer.valueOf(strArr[2]);
                                    C87412m.m108593f(valueOf3, "valueOf(posVec[2])");
                                    int intValue3 = valueOf3.intValue();
                                    Integer valueOf4 = Integer.valueOf(strArr[3]);
                                    C87412m.m108593f(valueOf4, "valueOf(posVec[3])");
                                    bVar5.f323928v = new Rect(new Rect(intValue, intValue2, intValue3, valueOf4.intValue()));
                                }
                            }
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "refreshPosition, get pos failed, %s", e.getMessage());
                        }
                    }
                    View contentView = aVar.mo159684d().getContentView();
                    if (contentView != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view = contentView;
                        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/multitask/animation/swipeback/singlescene/MultiTaskSwipeBackAnimWrapperSS", "initMaskView", "(IZZLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        contentView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/animation/swipeback/singlescene/MultiTaskSwipeBackAnimWrapperSS", "initMaskView", "(IZZLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (z) {
                        aVar.f325433f = true;
                        int width = (int) (((float) bitmap.getWidth()) * 1.0f);
                        int height = (int) (((float) bitmap.getHeight()) * 1.0f);
                        Rect rect2 = new Rect(0, 0, width, height);
                        C108178b bVar6 = aVar.f325430c;
                        if (bVar6 == null || (rect = bVar6.f323928v) == null) {
                            rect = new Rect();
                        }
                        Rect rect3 = rect;
                        int width2 = rect3.left + (rect3.width() / 2);
                        int height2 = rect3.top + (rect3.height() / 2);
                        float width3 = ((float) rect3.width()) / ((float) width);
                        C103374a.m137034a(aVar.f325431d).mo143287j(((float) (width2 - (rect2.left + (rect2.width() / 2)))) * width3).mo143288k(((float) (height2 - (rect2.top + (rect2.height() / 2)))) * width3).mo143280c(width3).mo143281d(width3).mo143285h(new C98924b(width, height, width3, rect3, aVar, width2, height2)).mo143283f(new AccelerateInterpolator()).mo143290m(new C108676c(aVar, dVar, bitmap, i)).mo143289l(new C108677d(aVar, dVar, bitmap, i)).mo143282e(250).mo143286i();
                        return;
                    }
                    if (dVar != null) {
                        C98325d dVar4 = aVar.f325431d;
                        dVar.mo90716a(dVar4 != null ? dVar4.getContentBitmap() : null, true, i);
                    }
                    aVar.mo159685e();
                }
            } else {
                C109296d dVar5 = aVar.f325432e;
                if (dVar5 != null) {
                    dVar5.mo90717b(this.f325448e);
                }
            }
        }
    }

    /* renamed from: j92.a$c */
    public static final class C108675c implements C107028a.C45290a {

        /* renamed from: a */
        public final /* synthetic */ C108669a f325450a;

        /* renamed from: b */
        public final /* synthetic */ C108974b f325451b;

        public C108675c(C108669a aVar, C108974b bVar) {
            this.f325450a = aVar;
            this.f325451b = bVar;
        }

        /* renamed from: a */
        public void mo70814a(MotionEvent motionEvent) {
            C87412m.m108594g(motionEvent, "event");
            C108178b bVar = this.f325450a.f325430c;
            if (bVar != null) {
                bVar.mo158596j(motionEvent);
            }
        }

        /* renamed from: b */
        public void mo70815b(float f) {
        }

        /* renamed from: c */
        public boolean mo70816c() {
            return this.f325451b.mo160087m();
        }

        /* renamed from: d */
        public int mo70817d(boolean z) {
            return 0;
        }

        public boolean enableSwipeBack() {
            C108669a aVar = this.f325450a;
            if (aVar.f325434g == -1) {
                aVar.f325435h = this.f325451b.mo160080e();
                this.f325450a.f325434g = 0;
            }
            return this.f325450a.f325435h;
        }

        /* renamed from: f */
        public boolean mo70819f(MotionEvent motionEvent) {
            C87412m.m108594g(motionEvent, "ev");
            C108178b bVar = this.f325450a.f325430c;
            if (bVar != null) {
                return bVar.mo158602p(motionEvent);
            }
            return false;
        }

        /* renamed from: i */
        public int mo70820i() {
            C108178b bVar = this.f325450a.f325430c;
            if (bVar != null) {
                return bVar.f323907a;
            }
            return 0;
        }

        /* renamed from: j */
        public void mo70821j(int i, int i2) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0068, code lost:
        r7 = (r7 = r7.getResources()).getDisplayMetrics();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158585a(d92.C107028a r7, k92.C108974b r8, l92.C109296d r9) {
        /*
            r6 = this;
            java.lang.String r0 = "pageAdapter"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "multiTaskHelper"
            gy3.C87412m.m108594g(r8, r0)
            r6.f325428a = r7
            r6.f325429b = r8
            r6.f325432e = r9
            d92.a r7 = r6.mo159684d()
            j92.a$c r9 = new j92.a$c
            r9.<init>(r6, r8)
            r7.mo67911m(r9)
            d92.a r7 = r6.mo159684d()
            android.app.Activity r7 = r7.getActivity()
            r8 = 2130772111(0x7f01008f, float:1.7147331E38)
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r7, r8)
            d92.a r7 = r6.mo159684d()
            android.view.ViewGroup r2 = r7.mo67905b()
            if (r2 == 0) goto L_0x0051
            j92.a$a r3 = new j92.a$a
            r3.<init>()
            java.lang.String r7 = "interpolator"
            gy3.C87412m.m108593f(r4, r7)
            h92.b r7 = new h92.b
            android.content.Context r1 = r2.getContext()
            java.lang.String r8 = "forParent.context"
            gy3.C87412m.m108593f(r1, r8)
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f325430c = r7
        L_0x0051:
            h92.b r7 = r6.f325430c
            if (r7 == 0) goto L_0x0058
            r8 = 1
            r7.f323922p = r8
        L_0x0058:
            d92.a r7 = r6.mo159684d()
            android.app.Activity r7 = r7.getActivity()
            if (r7 == 0) goto L_0x0071
            android.content.res.Resources r7 = r7.getResources()
            if (r7 == 0) goto L_0x0071
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 == 0) goto L_0x0071
            float r7 = r7.density
            goto L_0x007d
        L_0x0071:
            d92.a r7 = r6.mo159684d()
            android.app.Activity r7 = r7.getActivity()
            float r7 = kg3.C76577a.m92156g(r7)
        L_0x007d:
            r8 = 100
            float r8 = (float) r8
            float r8 = r8 * r7
            r9 = 300(0x12c, float:4.2E-43)
            float r9 = (float) r9
            float r9 = r9 * r7
            h92.b r7 = r6.f325430c
            if (r7 != 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r7.f323920n = r8
        L_0x008e:
            if (r7 != 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r7.f323919m = r9
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j92.C108669a.mo158585a(d92.a, k92.b, l92.d):void");
    }

    /* renamed from: b */
    public void mo158586b(int i) {
        mo159683c(i, true);
    }

    /* renamed from: c */
    public final void mo159683c(int i, boolean z) {
        if (mo159684d().mo70828c()) {
            if (mo159684d().mo70833i()) {
                mo159684d().mo67912n((C107028a.C45291b) null);
            }
            MMHandlerThread.postToMainThread(new C108674b(this, i, z));
            return;
        }
        C109296d dVar = this.f325432e;
        if (dVar != null && dVar != null) {
            dVar.mo90717b(i);
        }
    }

    /* renamed from: d */
    public final C107028a mo159684d() {
        C107028a aVar = this.f325428a;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("pageAdapter");
        throw null;
    }

    /* renamed from: e */
    public final void mo159685e() {
        C98325d dVar = this.f325431d;
        if (dVar != null) {
            dVar.setTranslationX(0.0f);
        }
        C98325d dVar2 = this.f325431d;
        if (dVar2 != null) {
            dVar2.setTranslationY(0.0f);
        }
        C98325d dVar3 = this.f325431d;
        if (dVar3 != null) {
            dVar3.setScaleX(1.0f);
        }
        C98325d dVar4 = this.f325431d;
        if (dVar4 != null) {
            dVar4.setScaleY(1.0f);
        }
    }
}
