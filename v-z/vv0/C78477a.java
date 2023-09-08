package vv0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fj3.C20713c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p646pn.C110234e;
import p646pn.C62408g;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wv0.C78727a;
import xv0.C112181e;

/* renamed from: vv0.a */
public final class C78477a implements C62408g {

    /* renamed from: a */
    public final C13601g f229886a = C36568h.m40985a(C65883b.f189438d);

    /* renamed from: vv0.a$b */
    public static final class C65883b extends C87413o implements C32224a<C112181e> {

        /* renamed from: d */
        public static final C65883b f189438d = new C65883b();

        public C65883b() {
            super(0);
        }

        public Object invoke() {
            return ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY();
        }
    }

    /* renamed from: vv0.a$a */
    public static final class C78478a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C78477a f229887d;

        /* renamed from: e */
        public final /* synthetic */ int f229888e;

        /* renamed from: f */
        public final /* synthetic */ AnimatorListenerAdapter f229889f;

        public C78478a(C78477a aVar, int i, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f229887d = aVar;
            this.f229888e = i;
            this.f229889f = animatorListenerAdapter;
        }

        /* renamed from: a */
        public final void mo108411a(int i) {
            if (i == 1) {
                C112181e d = this.f229887d.mo108408d();
                if (d != null) {
                    d.mo149123h(true);
                    return;
                }
                return;
            }
            C112181e d2 = this.f229887d.mo108408d();
            if (d2 != null) {
                d2.mo149112b0(1.0f);
            }
        }

        public void onAnimationCancel(Animator animator) {
            C112181e d = this.f229887d.mo108408d();
            if (d != null) {
                d.mo149122g0(false);
            }
            mo108411a(this.f229888e);
            AnimatorListenerAdapter animatorListenerAdapter = this.f229889f;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationCancel(animator);
            }
        }

        public void onAnimationEnd(Animator animator) {
            C112181e d = this.f229887d.mo108408d();
            if (d != null) {
                d.mo149122g0(false);
            }
            mo108411a(this.f229888e);
            AnimatorListenerAdapter animatorListenerAdapter = this.f229889f;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(animator);
            }
        }

        public void onAnimationPause(Animator animator) {
            AnimatorListenerAdapter animatorListenerAdapter = this.f229889f;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationPause(animator);
            }
        }

        public void onAnimationRepeat(Animator animator) {
            AnimatorListenerAdapter animatorListenerAdapter = this.f229889f;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationRepeat(animator);
            }
        }

        public void onAnimationResume(Animator animator) {
            AnimatorListenerAdapter animatorListenerAdapter = this.f229889f;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationResume(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            Log.m105927v("MicroMsg.FloatBallPageAnimationHelper", "doPageAnimationInner onAnimationStart animationType: %d", Integer.valueOf(this.f229888e));
            if (this.f229888e == 1) {
                C112181e d = this.f229887d.mo108408d();
                if (d != null) {
                    d.mo149112b0(1.0f);
                }
                C112181e d2 = this.f229887d.mo108408d();
                if (d2 != null) {
                    d2.mo149123h(false);
                }
            } else {
                C112181e d3 = this.f229887d.mo108408d();
                if (d3 != null) {
                    d3.mo149123h(true);
                }
                C112181e d4 = this.f229887d.mo108408d();
                if (d4 != null) {
                    d4.mo149112b0(0.0f);
                }
            }
            C112181e d5 = this.f229887d.mo108408d();
            if (d5 != null) {
                d5.mo149122g0(true);
            }
            AnimatorListenerAdapter animatorListenerAdapter = this.f229889f;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationStart(animator);
            }
        }
    }

    /* renamed from: vv0.a$c */
    public static final class C78479c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ View f229890d;

        /* renamed from: e */
        public final /* synthetic */ C78477a f229891e;

        /* renamed from: f */
        public final /* synthetic */ Point f229892f;

        /* renamed from: g */
        public final /* synthetic */ AnimatorListenerAdapter f229893g;

        /* renamed from: h */
        public final /* synthetic */ int f229894h;

        /* renamed from: vv0.a$c$a */
        public static final class C78480a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C78477a f229895d;

            /* renamed from: e */
            public final /* synthetic */ int f229896e;

            /* renamed from: f */
            public final /* synthetic */ View f229897f;

            /* renamed from: g */
            public final /* synthetic */ Point f229898g;

            /* renamed from: h */
            public final /* synthetic */ Point f229899h;

            /* renamed from: i */
            public final /* synthetic */ AnimatorListenerAdapter f229900i;

            public C78480a(C78477a aVar, int i, View view, Point point, Point point2, AnimatorListenerAdapter animatorListenerAdapter) {
                this.f229895d = aVar;
                this.f229896e = i;
                this.f229897f = view;
                this.f229898g = point;
                this.f229899h = point2;
                this.f229900i = animatorListenerAdapter;
            }

            public final void run() {
                this.f229895d.mo108407c(this.f229896e, this.f229897f, this.f229898g, this.f229899h, this.f229900i);
            }
        }

        public C78479c(View view, C78477a aVar, Point point, AnimatorListenerAdapter animatorListenerAdapter, int i) {
            this.f229890d = view;
            this.f229891e = aVar;
            this.f229892f = point;
            this.f229893g = animatorListenerAdapter;
            this.f229894h = i;
        }

        public void onGlobalLayout() {
            int i;
            if (this.f229890d.getWidth() > 0 && this.f229890d.getHeight() > 0) {
                this.f229890d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C78477a aVar = this.f229891e;
                int width = this.f229890d.getWidth();
                Point point = this.f229892f;
                C112181e d = aVar.mo108408d();
                Point Y = d != null ? d.mo149106Y(width, point) : null;
                Log.m105925i("MicroMsg.FloatBallPageAnimationHelper", "handlePageAnimation contentView.width: %s, floatBallPosition: %s", Integer.valueOf(this.f229890d.getWidth()), Y);
                if (Y == null || (i = Y.x) == -1 || i == -1) {
                    Log.m105920e("MicroMsg.FloatBallPageAnimationHelper", "handlePageAnimation floatBallPosition invalid");
                    this.f229891e.mo108410f(this.f229893g);
                    return;
                }
                View view = this.f229890d;
                view.post(new C78480a(this.f229891e, this.f229894h, view, Y, this.f229892f, this.f229893g));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87456a(android.content.Intent r7, android.view.View r8, wv0.C78727a r9, android.animation.AnimatorListenerAdapter r10) {
        /*
            r6 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r8
            java.lang.String r3 = "MicroMsg.FloatBallPageAnimationHelper"
            java.lang.String r4 = "enterPage contentView: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            if (r8 != 0) goto L_0x0013
            r6.mo108410f(r10)
            return
        L_0x0013:
            if (r7 == 0) goto L_0x001c
            java.lang.String r1 = "key_enter_from_float_ball"
            boolean r1 = r7.getBooleanExtra(r1, r2)
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r1 == 0) goto L_0x002d
            if (r7 == 0) goto L_0x0028
            java.lang.String r1 = "key_enter_with_animation"
            boolean r1 = r7.getBooleanExtra(r1, r2)
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            if (r1 == 0) goto L_0x002d
            r1 = 1
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r1 != 0) goto L_0x0039
            java.lang.String r7 = "enterPage not enterFromFloatBallWithAnimation and ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r7)
            r6.mo108410f(r10)
            return
        L_0x0039:
            if (r7 == 0) goto L_0x0044
            java.lang.String r1 = "key_enter_orientation"
            int r7 = r7.getIntExtra(r1, r2)
            if (r7 != r0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            if (r0 != 0) goto L_0x0050
            java.lang.String r7 = "enterPage orientation not portrait and ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r7)
            r6.mo108410f(r10)
            return
        L_0x0050:
            if (r9 == 0) goto L_0x0064
            boolean r7 = r9.mo108650a()
            if (r7 != 0) goto L_0x0064
            java.lang.String r7 = "enterPage pageAnimationAdapter needEnterAnimation false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r7)
            if (r10 == 0) goto L_0x0063
            r7 = 0
            r10.onAnimationCancel(r7)
        L_0x0063:
            return
        L_0x0064:
            r2 = 1
            r3 = 0
            r0 = r6
            r1 = r8
            r4 = r9
            r5 = r10
            r0.mo108409e(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vv0.C78477a.mo87456a(android.content.Intent, android.view.View, wv0.a, android.animation.AnimatorListenerAdapter):void");
    }

    /* renamed from: b */
    public boolean mo87457b(Intent intent, View view, Point point, C78727a aVar, AnimatorListenerAdapter animatorListenerAdapter) {
        Log.m105925i("MicroMsg.FloatBallPageAnimationHelper", "exitPage contentView: %s", view);
        if (view == null) {
            mo108410f(animatorListenerAdapter);
            return false;
        } else if (aVar == null || aVar.mo108653d()) {
            return mo108409e(view, 2, point, aVar, animatorListenerAdapter);
        } else {
            Log.m105928w("MicroMsg.FloatBallPageAnimationHelper", "exitPage pageAnimationAdapter needExitAnimation false");
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationCancel((Animator) null);
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo108407c(int i, View view, Point point, Point point2, AnimatorListenerAdapter animatorListenerAdapter) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z;
        float f5;
        int i2;
        TimeInterpolator timeInterpolator;
        int i3 = i;
        View view2 = view;
        Point point3 = point;
        Point point4 = point2;
        C78478a aVar = new C78478a(this, i3, animatorListenerAdapter);
        C13601g gVar = C15010c.f41136a;
        C87412m.m108594g(view2, "contentView");
        C87412m.m108594g(point3, "floatBallPosition");
        C87412m.m108594g(point4, "floatBallSize");
        int i4 = point3.x;
        int i5 = point3.y;
        int i6 = point4.x;
        int width = view.getWidth();
        int height = view.getHeight();
        float f6 = ((float) i6) / (width < height ? (float) width : (float) height);
        PointF pointF = new PointF(f6, f6);
        if (i3 == 1) {
            float f7 = pointF.x;
            f2 = pointF.y;
            f4 = f7;
            f3 = 1.0f;
            f = 1.0f;
        } else {
            float f8 = pointF.x;
            f = pointF.y;
            f3 = f8;
            f4 = 1.0f;
            f2 = 1.0f;
        }
        float height2 = i3 == 1 ? ((float) point4.y) / f2 : (float) view.getHeight();
        float height3 = i3 == 1 ? (float) view.getHeight() : ((float) point4.y) / f;
        boolean z2 = !(height2 == height3);
        Log.m105924i("MicroMsg.FloatBallPageAnimator", "handlePageAnimation start floatBallSize: " + point4 + ", contentView.size: " + view.getWidth() + ", " + view.getHeight() + ", startScaleX: " + f4 + ", startScaleY: " + f2 + ", clipHeight: " + height2 + ", " + height3 + ", needClipHeight: " + z2);
        float f9 = i3 == 1 ? (float) i4 : 0.0f;
        if (i3 == 1) {
            z = z2;
            f5 = ((float) i5) - (((((float) view.getHeight()) * f2) - ((float) point4.y)) / 2.0f);
            i2 = 1;
        } else {
            z = z2;
            i2 = 1;
            f5 = 0.0f;
        }
        float f15 = i3 == i2 ? 0.0f : (float) i4;
        float height4 = i3 == i2 ? 0.0f : ((float) i5) - (((((float) view.getHeight()) * f3) - ((float) point4.y)) / 2.0f);
        view2.setTranslationX(f9);
        view2.setTranslationY(f5);
        view2.setPivotX(0.0f);
        view2.setPivotY(0.0f);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Float.valueOf(0.0f));
        C78478a aVar3 = aVar;
        float f16 = f2;
        float f17 = height3;
        float f18 = height2;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "handlePageAnimation", "(ILandroid/view/View;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "handlePageAnimation", "(ILandroid/view/View;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ViewPropertyAnimator translationY = view.animate().translationX(f15).translationY(height4);
        if (i3 == 1) {
            C20713c cVar = C20713c.f58572a;
            timeInterpolator = (Interpolator) ((C36570n) C20713c.f58574c).getValue();
        } else {
            timeInterpolator = new AccelerateInterpolator();
        }
        translationY.setInterpolator(timeInterpolator);
        translationY.setDuration(300);
        translationY.setUpdateListener(new C78481d(i, view, f4, f3, f16, f, z, f18, f17));
        translationY.setListener(new C78483e(aVar3, i3, view2));
        translationY.start();
    }

    /* renamed from: d */
    public final C112181e mo108408d() {
        return (C112181e) ((C36570n) this.f229886a).getValue();
    }

    /* renamed from: e */
    public final boolean mo108409e(View view, int i, Point point, C78727a aVar, AnimatorListenerAdapter animatorListenerAdapter) {
        Point point2;
        int i2;
        Bitmap c;
        View view2 = view;
        AnimatorListenerAdapter animatorListenerAdapter2 = animatorListenerAdapter;
        Point point3 = null;
        if (point == null) {
            C112181e d = mo108408d();
            point2 = d != null ? d.mo149137o() : null;
        } else {
            point2 = point;
        }
        if (point2 == null) {
            Log.m105920e("MicroMsg.FloatBallPageAnimationHelper", "handlePageAnimation floatBallSize invalid");
            mo108410f(animatorListenerAdapter2);
            return false;
        }
        if (aVar != null && aVar.mo108651b() && (c = aVar.mo108652c()) != null && !c.isRecycled()) {
            ImageView imageView = new ImageView(view.getContext());
            imageView.setImageBitmap(c);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (view2 instanceof ViewGroup) {
                ((ViewGroup) view2).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (i == 1) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(0.0f));
            View view3 = view;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimationHelper", "handlePageAnimation", "(Landroid/view/View;ILandroid/graphics/Point;Lcom/tencent/mm/plugin/ball/animation/api/IFloatBallPageAnimationAdapter;Landroid/animation/AnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimationHelper", "handlePageAnimation", "(Landroid/view/View;ILandroid/graphics/Point;Lcom/tencent/mm/plugin/ball/animation/api/IFloatBallPageAnimationAdapter;Landroid/animation/AnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C78479c(view, this, point2, animatorListenerAdapter, i));
        } else if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            Log.m105920e("MicroMsg.FloatBallPageAnimationHelper", "handlePageAnimation contentView size invalid");
            mo108410f(animatorListenerAdapter2);
        } else {
            int width = view.getWidth();
            C112181e d2 = mo108408d();
            if (d2 != null) {
                point3 = d2.mo149106Y(width, point2);
            }
            Point point4 = point3;
            Log.m105925i("MicroMsg.FloatBallPageAnimationHelper", "handlePageAnimation contentView.width: %s, floatBallPosition: %s", Integer.valueOf(view.getWidth()), point4);
            if (point4 == null || (i2 = point4.x) == -1 || i2 == -1) {
                Log.m105920e("MicroMsg.FloatBallPageAnimationHelper", "handlePageAnimation floatBallPosition invalid");
                mo108410f(animatorListenerAdapter2);
                return false;
            }
            mo108407c(i, view, point4, point2, animatorListenerAdapter);
        }
        return true;
    }

    /* renamed from: f */
    public final void mo108410f(AnimatorListenerAdapter animatorListenerAdapter) {
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel((Animator) null);
        }
    }
}
