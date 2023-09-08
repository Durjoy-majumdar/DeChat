package i92;

import aj3.C103374a;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
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

/* renamed from: i92.a */
public final class C108425a extends C108177a {

    /* renamed from: a */
    public C107028a f324653a;

    /* renamed from: b */
    public C108974b f324654b;

    /* renamed from: c */
    public C108178b f324655c;

    /* renamed from: d */
    public C98325d f324656d;

    /* renamed from: e */
    public C109296d f324657e;

    /* renamed from: f */
    public long f324658f = -1;

    /* renamed from: g */
    public boolean f324659g = true;

    /* renamed from: h */
    public boolean f324660h;

    /* renamed from: i92.a$d */
    public static final class C98617d implements C103374a.C67055a {

        /* renamed from: a */
        public final /* synthetic */ boolean f289135a;

        /* renamed from: b */
        public final /* synthetic */ int f289136b;

        /* renamed from: c */
        public final /* synthetic */ int f289137c;

        /* renamed from: d */
        public final /* synthetic */ float f289138d;

        /* renamed from: e */
        public final /* synthetic */ Rect f289139e;

        /* renamed from: f */
        public final /* synthetic */ C108425a f289140f;

        /* renamed from: g */
        public final /* synthetic */ int f289141g;

        /* renamed from: h */
        public final /* synthetic */ int f289142h;

        /* renamed from: i */
        public final /* synthetic */ int f289143i;

        public C98617d(boolean z, int i, int i2, float f, Rect rect, C108425a aVar, int i3, int i4, int i5) {
            this.f289135a = z;
            this.f289136b = i;
            this.f289137c = i2;
            this.f289138d = f;
            this.f289139e = rect;
            this.f289140f = aVar;
            this.f289141g = i3;
            this.f289142h = i4;
            this.f289143i = i5;
        }

        /* renamed from: a */
        public final void mo91065a(float f) {
            float f2;
            float f3;
            float f4;
            float f5 = 0.0f;
            if (!this.f289135a) {
                f4 = (float) this.f289136b;
                f2 = (((((float) this.f289137c) * this.f289138d) - ((float) this.f289139e.height())) / ((float) 2)) * f * (((float) 1) / this.f289138d);
                f3 = ((float) this.f289137c) - f2;
            } else {
                float width = (((((float) this.f289136b) * this.f289138d) - ((float) this.f289139e.width())) / ((float) 2)) * f * (((float) 1) / this.f289138d);
                f5 = width;
                f4 = ((float) this.f289136b) - width;
                f3 = ((float) this.f289137c) - 0.0f;
                f2 = 0.0f;
            }
            C98325d dVar = this.f289140f.f324656d;
            if (dVar != null) {
                dVar.setMaskAlpha((int) (((float) 255) * f));
            }
            C98325d dVar2 = this.f289140f.f324656d;
            if (dVar2 != null) {
                dVar2.mo137622a(f5, f2, f4, f3);
            }
            int i = C98325d.f288196u;
            float f6 = (((float) C98325d.f288196u) * f) / this.f289138d;
            C98325d dVar3 = this.f289140f.f324656d;
            if (dVar3 != null) {
                dVar3.mo137623b(f6, f6, f6, f6, f6, f6, f6, f6);
            }
            C98325d dVar4 = this.f289140f.f324656d;
            if (dVar4 != null) {
                dVar4.setPivotX((float) this.f289141g);
            }
            C98325d dVar5 = this.f289140f.f324656d;
            if (dVar5 != null) {
                dVar5.setPivotY((float) this.f289142h);
            }
            C98325d dVar6 = this.f289140f.f324656d;
            if (dVar6 != null) {
                dVar6.setRotate(((float) this.f289143i) * f);
            }
            C98325d dVar7 = this.f289140f.f324656d;
            if (dVar7 != null) {
                dVar7.postInvalidate();
            }
        }
    }

    /* renamed from: i92.a$e */
    public static final class C98618e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108425a f289144d;

        /* renamed from: e */
        public final /* synthetic */ C109296d f289145e;

        /* renamed from: f */
        public final /* synthetic */ Bitmap f289146f;

        /* renamed from: g */
        public final /* synthetic */ int f289147g;

        public C98618e(C108425a aVar, C109296d dVar, Bitmap bitmap, int i) {
            this.f289144d = aVar;
            this.f289145e = dVar;
            this.f289146f = bitmap;
            this.f289147g = i;
        }

        public final void run() {
            C98325d dVar = this.f289144d.f324656d;
            if (dVar != null) {
                dVar.setTranslationX(0.0f);
            }
            C98325d dVar2 = this.f289144d.f324656d;
            if (dVar2 != null) {
                dVar2.setTranslationY(0.0f);
            }
            C98325d dVar3 = this.f289144d.f324656d;
            if (dVar3 != null) {
                dVar3.setScaleX(1.0f);
            }
            C98325d dVar4 = this.f289144d.f324656d;
            if (dVar4 != null) {
                dVar4.setScaleY(1.0f);
            }
            C109296d dVar5 = this.f289145e;
            if (dVar5 != null) {
                dVar5.mo90716a(this.f289146f, false, this.f289147g);
            }
        }
    }

    /* renamed from: i92.a$a */
    public final class C108426a extends C108178b.C108179a implements C88990b.C61771c {

        /* renamed from: a */
        public int f324661a = -1;

        /* renamed from: b */
        public int f324662b = -1;

        /* renamed from: c */
        public float f324663c;

        /* renamed from: d */
        public Rect f324664d;

        /* renamed from: e */
        public boolean f324665e;

        /* renamed from: f */
        public final int f324666f = 400;

        /* renamed from: i92.a$a$a */
        public static final class C98615a implements C103374a.C67055a {

            /* renamed from: a */
            public final /* synthetic */ float f289123a;

            /* renamed from: b */
            public final /* synthetic */ boolean f289124b;

            /* renamed from: c */
            public final /* synthetic */ int f289125c;

            /* renamed from: d */
            public final /* synthetic */ int f289126d;

            /* renamed from: e */
            public final /* synthetic */ float f289127e;

            /* renamed from: f */
            public final /* synthetic */ Rect f289128f;

            /* renamed from: g */
            public final /* synthetic */ float f289129g;

            /* renamed from: h */
            public final /* synthetic */ C98325d f289130h;

            /* renamed from: i */
            public final /* synthetic */ int f289131i;

            /* renamed from: j */
            public final /* synthetic */ int f289132j;

            /* renamed from: k */
            public final /* synthetic */ int f289133k;

            public C98615a(float f, boolean z, int i, int i2, float f2, Rect rect, float f3, C98325d dVar, int i3, int i4, int i5) {
                this.f289123a = f;
                this.f289124b = z;
                this.f289125c = i;
                this.f289126d = i2;
                this.f289127e = f2;
                this.f289128f = rect;
                this.f289129g = f3;
                this.f289130h = dVar;
                this.f289131i = i3;
                this.f289132j = i4;
                this.f289133k = i5;
            }

            /* renamed from: a */
            public final void mo91065a(float f) {
                float f2;
                float f3;
                float f4;
                float f5 = this.f289123a;
                float f6 = (float) 1;
                float f7 = f5 + ((f6 - f5) * f);
                float f8 = 0.0f;
                if (!this.f289124b) {
                    f3 = (float) this.f289125c;
                    f2 = (((((float) this.f289126d) * this.f289127e) - ((float) this.f289128f.height())) / ((float) 2)) * f7 * (f6 / this.f289127e);
                    f4 = ((float) this.f289126d) - f2;
                } else {
                    float height = (((((float) this.f289125c) * this.f289127e) - ((float) this.f289128f.height())) / ((float) 2)) * f7 * (f6 / this.f289129g);
                    float f9 = ((float) this.f289125c) - height;
                    f8 = height;
                    f2 = 0.0f;
                    f3 = f9;
                    f4 = (float) this.f289126d;
                }
                this.f289130h.setPivotX((float) this.f289131i);
                this.f289130h.setPivotY((float) this.f289132j);
                this.f289130h.setMaskAlpha((int) (((float) 255) * f7));
                this.f289130h.mo137622a(f8, f2, f3, f4);
                int i = C98325d.f288196u;
                float f15 = (((float) C98325d.f288196u) * f7) / this.f289127e;
                this.f289130h.mo137623b(f15, f15, f15, f15, f15, f15, f15, f15);
                this.f289130h.setRotate(((float) this.f289133k) * f);
                this.f289130h.postInvalidate();
            }
        }

        /* renamed from: i92.a$a$c */
        public static final class C98616c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C108425a f289134d;

            public C98616c(C108425a aVar) {
                this.f289134d = aVar;
            }

            public final void run() {
                C98325d dVar = this.f289134d.f324656d;
                if (dVar != null) {
                    ViewParent viewParent = null;
                    if ((dVar != null ? dVar.getParent() : null) != null) {
                        C98325d dVar2 = this.f289134d.f324656d;
                        if (dVar2 != null) {
                            viewParent = dVar2.getParent();
                        }
                        C87412m.m108592e(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) viewParent).removeView(this.f289134d.f324656d);
                    }
                }
            }
        }

        /* renamed from: i92.a$a$b */
        public static final class C108427b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C98325d f324668d;

            /* renamed from: e */
            public final /* synthetic */ C108425a f324669e;

            /* renamed from: f */
            public final /* synthetic */ Bitmap f324670f;

            /* renamed from: i92.a$a$b$a */
            public static final class C108428a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C108425a f324671d;

                /* renamed from: e */
                public final /* synthetic */ Bitmap f324672e;

                public C108428a(C108425a aVar, Bitmap bitmap) {
                    this.f324671d = aVar;
                    this.f324672e = bitmap;
                }

                public final void run() {
                    C109296d dVar = this.f324671d.f324657e;
                    if (dVar != null) {
                        dVar.mo90718c(this.f324672e, 3);
                    }
                }
            }

            public C108427b(C98325d dVar, C108425a aVar, Bitmap bitmap) {
                this.f324668d = dVar;
                this.f324669e = aVar;
                this.f324670f = bitmap;
            }

            public final void run() {
                this.f324668d.setVisibility(8);
                MMHandlerThread.postToMainThread(new C108428a(this.f324669e, this.f324670f));
            }
        }

        /* renamed from: i92.a$a$d */
        public static final class C108429d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C108425a f324673d;

            public C108429d(C108425a aVar) {
                this.f324673d = aVar;
            }

            public final void run() {
                C108425a aVar = this.f324673d;
                C109296d dVar = aVar.f324657e;
                if (dVar != null) {
                    C98325d dVar2 = aVar.f324656d;
                    dVar.mo90718c(dVar2 != null ? dVar2.getContentBitmap() : null, 3);
                }
            }
        }

        public C108426a() {
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
            Log.m105924i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "onViewCaptured");
            if (this.f324665e) {
                Log.m105924i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "onViewCaptured, isFinish!");
                return;
            }
            C108425a.this.mo158968c(3, false, false);
            this.f324661a = -1;
            this.f324662b = -1;
        }

        /* renamed from: d */
        public void mo158607d(int i) {
            Log.m105918d("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "onViewDragStateChanged, state:" + i);
        }

        /* renamed from: e */
        public void mo158608e(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: f */
        public void mo158609f(View view, float f, float f2, float f3, float f4) {
            Log.m105919d("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "onViewReleased, xvel: %f, yvel: %f", Float.valueOf(f), Float.valueOf(f2));
            if (this.f324665e) {
                Log.m105924i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "onViewReleased, isFinish!");
            } else if (Math.abs(f) <= ((float) this.f324666f) || !mo158971i(this.f324663c)) {
                MMHandlerThread.postToMainThread(new C98616c(C108425a.this));
                C108425a aVar = C108425a.this;
                aVar.f324658f = -1;
                View contentView = aVar.mo158969d().getContentView();
                if (contentView != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view2 = contentView;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/multitask/animation/swipeback/multiscene/MultiTaskSwipeBackAnimWrapperMS$ViewDragCallback", "onViewReleased", "(Landroid/view/View;FFFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    contentView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/multitask/animation/swipeback/multiscene/MultiTaskSwipeBackAnimWrapperMS$ViewDragCallback", "onViewReleased", "(Landroid/view/View;FFFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C108425a.this.mo158969d().mo70829d();
                C108425a.this.mo158969d().mo70834j(true);
            } else {
                this.f324665e = true;
                Log.m105924i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "onViewReleased, auto add multitask!");
            }
        }

        /* renamed from: g */
        public void mo158610g(float f, float f2, int i, int i2, int i3, int i4) {
            Rect rect;
            C98325d dVar = C108425a.this.f324656d;
            if (dVar != null) {
                if (!(dVar != null && dVar.getWidth() == 0)) {
                    C108425a aVar = C108425a.this;
                    C108178b bVar = aVar.f324655c;
                    if ((bVar != null ? bVar.f323928v : null) != null) {
                        C98325d dVar2 = aVar.f324656d;
                        int width = dVar2 != null ? dVar2.getWidth() : 0;
                        C98325d dVar3 = C108425a.this.f324656d;
                        int height = dVar3 != null ? dVar3.getHeight() : 0;
                        if (this.f324664d == null) {
                            this.f324664d = C39747a.m42531c(C108425a.this.f324656d);
                        }
                        if (this.f324661a == -1 && this.f324662b == -1) {
                            C98325d dVar4 = C108425a.this.f324656d;
                            this.f324661a = dVar4 != null ? (int) dVar4.getTranslationX() : 0;
                            C98325d dVar5 = C108425a.this.f324656d;
                            this.f324662b = dVar5 != null ? (int) dVar5.getTranslationY() : 0;
                        }
                        float f3 = (float) width;
                        float f4 = (f / f3) / ((float) 3);
                        C108178b bVar2 = C108425a.this.f324655c;
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
                        } else if (f8 < 0.0f) {
                            f8 = 0.0f;
                        }
                        float f9 = (f6 - f8) / f7;
                        if (f9 <= 1.0f) {
                            f5 = f9 < 0.0f ? 0.0f : f9;
                        }
                        float f15 = (float) width3;
                        Rect rect2 = this.f324664d;
                        float width4 = f15 - ((float) ((rect2 != null ? rect2.left : 0) + ((rect2 != null ? rect2.width() : 0) / 2)));
                        float f16 = (float) height2;
                        Rect rect3 = this.f324664d;
                        int i5 = rect3 != null ? rect3.top : 0;
                        int height3 = rect3 != null ? rect3.height() : 0;
                        float f17 = ((float) this.f324661a) + (width4 * width2 * f5);
                        float f18 = ((float) this.f324662b) + ((f16 - ((float) (i5 + (height3 / 2)))) * width2 * f5);
                        this.f324663c = f5;
                        if (f5 < 0.16f || this.f324665e) {
                            float f19 = (float) height;
                            float height4 = (((f19 * width2) - ((float) rect.height())) / ((float) 2)) * f5 * (f6 / width2);
                            float f25 = f19 - height4;
                            C98325d dVar6 = C108425a.this.f324656d;
                            if (dVar6 != null) {
                                dVar6.setMaskAlpha((int) (((float) 255) * f5));
                            }
                            C98325d dVar7 = C108425a.this.f324656d;
                            if (dVar7 != null) {
                                dVar7.mo137622a(0.0f, height4, f3, f25);
                            }
                            int i6 = C98325d.f288196u;
                            float f26 = (((float) C98325d.f288196u) * f5) / f8;
                            C98325d dVar8 = C108425a.this.f324656d;
                            if (dVar8 != null) {
                                dVar8.mo137623b(f26, f26, f26, f26, f26, f26, f26, f26);
                            }
                            C98325d dVar9 = C108425a.this.f324656d;
                            if (dVar9 != null) {
                                dVar9.setPivotX(f15);
                            }
                            C98325d dVar10 = C108425a.this.f324656d;
                            if (dVar10 != null) {
                                dVar10.setPivotY(f16);
                            }
                            C98325d dVar11 = C108425a.this.f324656d;
                            if (dVar11 != null) {
                                dVar11.setTranslationX(f17);
                            }
                            C98325d dVar12 = C108425a.this.f324656d;
                            if (dVar12 != null) {
                                dVar12.setTranslationY(f18);
                            }
                            C98325d dVar13 = C108425a.this.f324656d;
                            if (dVar13 != null) {
                                dVar13.setScaleX(f8);
                            }
                            C98325d dVar14 = C108425a.this.f324656d;
                            if (dVar14 != null) {
                                dVar14.setScaleY(f8);
                            }
                            C98325d dVar15 = C108425a.this.f324656d;
                            if (dVar15 != null) {
                                dVar15.postInvalidate();
                                return;
                            }
                            return;
                        }
                        this.f324665e = true;
                        if (!mo158971i(f5)) {
                            MMHandlerThread.postToMainThread(new C108429d(C108425a.this));
                        }
                    }
                }
            }
        }

        /* renamed from: h */
        public boolean mo158611h(View view, int i) {
            C108178b bVar = C108425a.this.f324655c;
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
        public final boolean mo158971i(float f) {
            Rect rect;
            float f2;
            float f3;
            C98325d dVar = C108425a.this.f324656d;
            Bitmap contentBitmap = dVar != null ? dVar.getContentBitmap() : null;
            C108425a aVar = C108425a.this;
            if (dVar == null || contentBitmap == null) {
                return false;
            }
            C108974b bVar = aVar.f324654b;
            boolean b = bVar != null ? bVar.mo160079b() : false;
            int width = (int) (((float) contentBitmap.getWidth()) * 1.0f);
            int height = (int) (((float) contentBitmap.getHeight()) * 1.0f);
            Rect rect2 = new Rect(0, 0, width, height);
            C108178b bVar2 = aVar.f324655c;
            if (bVar2 == null || (rect = bVar2.f323928v) == null) {
                rect = new Rect();
            }
            Rect rect3 = rect;
            int width2 = rect3.left + (rect3.width() / 2);
            int height2 = rect3.top + (rect3.height() / 2);
            int width3 = rect3.width();
            if (b) {
                f3 = (float) width3;
                f2 = (float) height;
            } else {
                f3 = (float) width3;
                f2 = (float) width;
            }
            float f4 = f3 / f2;
            float height3 = ((float) (b ? rect3.height() : rect3.width())) / ((float) width);
            float width4 = ((float) (width2 - (rect2.left + (rect2.width() / 2)))) * f4;
            float height4 = ((float) (height2 - (rect2.top + (rect2.height() / 2)))) * f4;
            int i = b ? 90 : 0;
            if (b) {
                dVar.setGradientOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            }
            C98615a aVar2 = r2;
            C103374a a = C103374a.m137034a(dVar);
            C98615a aVar3 = new C98615a(f, b, width, height, f4, rect3, height3, dVar, width2, height2, i);
            float f5 = f4;
            a.mo143285h(aVar3).mo143289l(new C108427b(dVar, aVar, contentBitmap)).mo143280c(f5).mo143281d(f5).mo143287j(width4).mo143288k(height4).mo143283f(new AccelerateInterpolator()).mo143282e(250).mo143286i();
            return true;
        }

        public void onComplete(boolean z) {
            Log.m105918d("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "onComplete");
        }
    }

    /* renamed from: i92.a$b */
    public static final class C108430b implements C107028a.C45291b {

        /* renamed from: a */
        public final /* synthetic */ C108425a f324674a;

        public C108430b(C108425a aVar) {
            this.f324674a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
            r2 = r2.mo160086j();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onComplete(boolean r2) {
            /*
                r1 = this;
                if (r2 != 0) goto L_0x0018
                i92.a r2 = r1.f324674a
                k92.b r2 = r2.f324654b
                if (r2 == 0) goto L_0x0011
                te3.i13 r2 = r2.mo160086j()
                if (r2 == 0) goto L_0x0011
                te3.h13 r2 = r2.f332065o
                goto L_0x0012
            L_0x0011:
                r2 = 0
            L_0x0012:
                if (r2 != 0) goto L_0x0015
                goto L_0x0018
            L_0x0015:
                r0 = 0
                r2.f134407e = r0
            L_0x0018:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i92.C108425a.C108430b.onComplete(boolean):void");
        }
    }

    /* renamed from: i92.a$c */
    public static final class C108431c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108425a f324675d;

        /* renamed from: e */
        public final /* synthetic */ int f324676e;

        /* renamed from: f */
        public final /* synthetic */ boolean f324677f;

        public C108431c(C108425a aVar, int i, boolean z) {
            this.f324675d = aVar;
            this.f324676e = i;
            this.f324677f = z;
        }

        public final void run() {
            C108425a aVar = this.f324675d;
            C108178b bVar = aVar.f324655c;
            if ((bVar != null ? bVar.f323928v : null) != null) {
                aVar.mo158970e(this.f324676e, this.f324677f, aVar.f324657e);
                return;
            }
            C109296d dVar = aVar.f324657e;
            if (dVar != null && dVar != null) {
                dVar.mo90717b(this.f324676e);
            }
        }
    }

    /* renamed from: i92.a$f */
    public static final class C108432f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108425a f324678d;

        /* renamed from: e */
        public final /* synthetic */ C109296d f324679e;

        /* renamed from: f */
        public final /* synthetic */ Bitmap f324680f;

        /* renamed from: g */
        public final /* synthetic */ int f324681g;

        /* renamed from: i92.a$f$a */
        public static final class C108433a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C109296d f324682d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f324683e;

            /* renamed from: f */
            public final /* synthetic */ int f324684f;

            public C108433a(C109296d dVar, Bitmap bitmap, int i) {
                this.f324682d = dVar;
                this.f324683e = bitmap;
                this.f324684f = i;
            }

            public final void run() {
                C109296d dVar = this.f324682d;
                if (dVar != null) {
                    dVar.mo90718c(this.f324683e, this.f324684f);
                }
            }
        }

        public C108432f(C108425a aVar, C109296d dVar, Bitmap bitmap, int i) {
            this.f324678d = aVar;
            this.f324679e = dVar;
            this.f324680f = bitmap;
            this.f324681g = i;
        }

        public final void run() {
            this.f324678d.f324660h = false;
            MMHandlerThread.postToMainThread(new C108433a(this.f324679e, this.f324680f, this.f324681g));
        }
    }

    /* renamed from: i92.a$g */
    public static final class C108434g implements C107028a.C45290a {

        /* renamed from: a */
        public final /* synthetic */ C108425a f324685a;

        /* renamed from: b */
        public final /* synthetic */ C108974b f324686b;

        public C108434g(C108425a aVar, C108974b bVar) {
            this.f324685a = aVar;
            this.f324686b = bVar;
        }

        /* renamed from: a */
        public void mo70814a(MotionEvent motionEvent) {
            C87412m.m108594g(motionEvent, "event");
            C108178b bVar = this.f324685a.f324655c;
            if (bVar != null) {
                bVar.mo158596j(motionEvent);
            }
        }

        /* renamed from: b */
        public void mo70815b(float f) {
        }

        /* renamed from: c */
        public boolean mo70816c() {
            return this.f324686b.mo160087m();
        }

        /* renamed from: d */
        public int mo70817d(boolean z) {
            return 0;
        }

        public boolean enableSwipeBack() {
            C108425a aVar = this.f324685a;
            if (aVar.f324658f == -1) {
                aVar.f324659g = this.f324686b.mo160080e();
                this.f324685a.f324658f = 0;
            }
            return this.f324685a.f324659g && mo70816c();
        }

        /* renamed from: f */
        public boolean mo70819f(MotionEvent motionEvent) {
            C87412m.m108594g(motionEvent, "ev");
            C108178b bVar = this.f324685a.f324655c;
            if (bVar != null) {
                return bVar.mo158602p(motionEvent);
            }
            return false;
        }

        /* renamed from: i */
        public int mo70820i() {
            C108178b bVar = this.f324685a.f324655c;
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
            r6.f324653a = r7
            r6.f324654b = r8
            r6.f324657e = r9
            d92.a r7 = r6.mo158969d()
            i92.a$g r9 = new i92.a$g
            r9.<init>(r6, r8)
            r7.mo67911m(r9)
            d92.a r7 = r6.mo158969d()
            android.app.Activity r7 = r7.getActivity()
            r8 = 2130772111(0x7f01008f, float:1.7147331E38)
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r7, r8)
            d92.a r7 = r6.mo158969d()
            android.view.ViewGroup r2 = r7.mo67905b()
            if (r2 == 0) goto L_0x0051
            i92.a$a r3 = new i92.a$a
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
            r6.f324655c = r7
        L_0x0051:
            h92.b r7 = r6.f324655c
            if (r7 == 0) goto L_0x0058
            r8 = 1
            r7.f323922p = r8
        L_0x0058:
            d92.a r7 = r6.mo158969d()
            android.app.Activity r7 = r7.getActivity()
            if (r7 == 0) goto L_0x0071
            android.content.res.Resources r7 = r7.getResources()
            if (r7 == 0) goto L_0x0071
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 == 0) goto L_0x0071
            float r7 = r7.density
            goto L_0x007d
        L_0x0071:
            d92.a r7 = r6.mo158969d()
            android.app.Activity r7 = r7.getActivity()
            float r7 = kg3.C76577a.m92156g(r7)
        L_0x007d:
            r8 = 100
            float r8 = (float) r8
            float r8 = r8 * r7
            r9 = 300(0x12c, float:4.2E-43)
            float r9 = (float) r9
            float r9 = r9 * r7
            h92.b r7 = r6.f324655c
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
        throw new UnsupportedOperationException("Method not decompiled: i92.C108425a.mo158585a(d92.a, k92.b, l92.d):void");
    }

    /* renamed from: b */
    public void mo158586b(int i) {
        mo158968c(i, true, true);
    }

    /* renamed from: c */
    public final void mo158968c(int i, boolean z, boolean z2) {
        if (!mo158969d().mo70828c()) {
            C109296d dVar = this.f324657e;
            if (dVar != null && dVar != null) {
                dVar.mo90717b(i);
            }
        } else if (MMHandlerThread.isMainThread()) {
            mo158969d().mo67912n(new C108430b(this));
            if (z2) {
                MMHandlerThread.postToMainThread(new C108431c(this, i, z));
                return;
            }
            C108178b bVar = this.f324655c;
            if ((bVar != null ? bVar.f323928v : null) != null) {
                mo158970e(i, z, this.f324657e);
                return;
            }
            C109296d dVar2 = this.f324657e;
            if (dVar2 != null && dVar2 != null) {
                dVar2.mo90717b(i);
            }
        } else {
            C109296d dVar3 = this.f324657e;
            if (dVar3 != null && dVar3 != null) {
                dVar3.mo90717b(i);
            }
        }
    }

    /* renamed from: d */
    public final C107028a mo158969d() {
        C107028a aVar = this.f324653a;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("pageAdapter");
        throw null;
    }

    /* renamed from: e */
    public final void mo158970e(int i, boolean z, C109296d dVar) {
        Rect rect;
        float f;
        float f2;
        C98325d dVar2;
        int i2 = i;
        C109296d dVar3 = dVar;
        Log.m105925i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "initMaskView, way:%d", Integer.valueOf(i));
        if (mo158969d().getMaskView() == null) {
            Log.m105928w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "doMaskAnimation, page mask view is null");
            if (dVar3 != null) {
                dVar3.mo90717b(i2);
            }
        } else if (mo158969d().getContentView() == null) {
            Log.m105928w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "doMaskAnimation, page content view is null");
            if (dVar3 != null) {
                dVar3.mo90717b(i2);
            }
        } else if (mo158969d().mo67905b() == null) {
            Log.m105928w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "doMaskAnimation, page root view is null");
            if (dVar3 != null) {
                dVar3.mo90717b(i2);
            }
        } else if (this.f324660h) {
            Log.m105928w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "isExitAnimating now!");
        } else {
            mo158969d().mo70835k();
            Bitmap bitmap = mo158969d().getBitmap();
            if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
                Log.m105928w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "doMaskAnimation, page get bitmap is null");
                if (dVar3 != null) {
                    dVar3.mo90717b(i2);
                    return;
                }
                return;
            }
            C98325d dVar4 = this.f324656d;
            Bitmap bitmap2 = null;
            if (dVar4 == null || dVar4.getParent() == null) {
                C98325d dVar5 = new C98325d(mo158969d().getActivity(), bitmap);
                this.f324656d = dVar5;
                dVar5.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ViewGroup b = mo158969d().mo67905b();
                if (b != null) {
                    b.setBackgroundColor(0);
                }
                if (b != null) {
                    b.addView(this.f324656d, b.getChildCount());
                }
            }
            C108974b bVar = this.f324654b;
            String i3 = bVar != null ? bVar.mo160085i(i2) : null;
            if (Util.isNullOrNil(i3)) {
                if (i2 == 4) {
                    C108974b bVar2 = this.f324654b;
                    if (bVar2 != null) {
                        i3 = bVar2.mo160088n();
                    }
                } else {
                    C108974b bVar3 = this.f324654b;
                    if (bVar3 != null) {
                        i3 = bVar3.getPosition();
                    }
                }
                i3 = null;
            }
            if (i3 != null) {
                try {
                    Object[] array = new C66723k(",").mo90760e(i3, 0).toArray(new String[0]);
                    C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    String[] strArr = (String[]) array;
                    if (strArr.length == 4) {
                        C108178b bVar4 = this.f324655c;
                        if (bVar4 != null) {
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
                            bVar4.f323928v = new Rect(new Rect(intValue, intValue2, intValue3, valueOf4.intValue()));
                        }
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "refreshPosition, get pos failed, %s", e.getMessage());
                }
            }
            View contentView = mo158969d().getContentView();
            if (contentView != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = contentView;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/animation/swipeback/multiscene/MultiTaskSwipeBackAnimWrapperMS", "initMaskView", "(IZLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/animation/swipeback/multiscene/MultiTaskSwipeBackAnimWrapperMS", "initMaskView", "(IZLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (z) {
                C108974b bVar5 = this.f324654b;
                boolean b2 = bVar5 != null ? bVar5.mo160079b() : false;
                int i4 = b2 ? 90 : 0;
                this.f324660h = true;
                int width = (int) (((float) bitmap.getWidth()) * 1.0f);
                int height = (int) (((float) bitmap.getHeight()) * 1.0f);
                Rect rect2 = new Rect(0, 0, width, height);
                C108178b bVar6 = this.f324655c;
                if (bVar6 == null || (rect = bVar6.f323928v) == null) {
                    rect = new Rect();
                }
                Rect rect3 = rect;
                int width2 = rect3.left + (rect3.width() / 2);
                int height2 = rect3.top + (rect3.height() / 2);
                if (b2) {
                    f2 = (float) rect3.height();
                    f = (float) height;
                } else {
                    f2 = (float) rect3.width();
                    f = (float) width;
                }
                float f3 = f2 / f;
                rect3.width();
                float width3 = ((float) (width2 - (rect2.left + (rect2.width() / 2)))) * f3;
                float height3 = ((float) (height2 - (rect2.top + (rect2.height() / 2)))) * f3;
                if (b2 && (dVar2 = this.f324656d) != null) {
                    dVar2.setGradientOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                }
                C103374a d = C103374a.m137034a(this.f324656d).mo143287j(width3).mo143288k(height3).mo143280c(f3).mo143281d(f3);
                int i5 = width;
                C98617d dVar6 = r1;
                C98617d dVar7 = new C98617d(b2, i5, height, f3, rect3, this, width2, height2, i4);
                d.mo143285h(dVar6).mo143283f(new AccelerateInterpolator()).mo143290m(new C98618e(this, dVar3, bitmap, i2)).mo143289l(new C108432f(this, dVar3, bitmap, i2)).mo143282e(250).mo143286i();
            } else if (dVar3 != null) {
                C98325d dVar8 = this.f324656d;
                if (dVar8 != null) {
                    bitmap2 = dVar8.getContentBitmap();
                }
                dVar3.mo90716a(bitmap2, true, i2);
            }
        }
    }
}
