package de1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ee1.C31570b;
import ei3.C86522b;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13598b0;

@C86522b(creator = C7300w.class)
/* renamed from: de1.b */
public final class C7267b extends C86301e implements C31570b {

    /* renamed from: d */
    public static final C7267b f25328d = new C7267b();

    /* renamed from: e */
    public static final ConcurrentHashMap<String, C7301x> f25329e = new ConcurrentHashMap<>();

    /* renamed from: de1.b$a */
    public static final class C7268a extends C87413o implements C32228q<Activity, Bundle, Boolean, C13598b0> {

        /* renamed from: d */
        public static final C7268a f25330d = new C7268a();

        public C7268a() {
            super(3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
            if (r5 == null) goto L_0x00a0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r24, java.lang.Object r25, java.lang.Object r26) {
            /*
                r23 = this;
                r3 = r24
                android.app.Activity r3 = (android.app.Activity) r3
                r0 = r25
                android.os.Bundle r0 = (android.os.Bundle) r0
                r0 = r26
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                java.lang.String r1 = "activity"
                gy3.C87412m.m108594g(r3, r1)
                de1.b r1 = de1.C7267b.f25328d
                java.lang.String r2 = "key_anim_intent_id"
                if (r0 == 0) goto L_0x014a
                r1.getClass()
                android.content.Intent r4 = r3.getIntent()
                if (r4 != 0) goto L_0x0026
                goto L_0x016c
            L_0x0026:
                boolean r0 = r4.hasExtra(r2)
                if (r0 != 0) goto L_0x002e
                goto L_0x016c
            L_0x002e:
                r0 = 0
                r3.overridePendingTransition(r0, r0)
                android.view.Window r2 = r3.getWindow()
                android.view.View r2 = r2.getDecorView()
                java.lang.String r5 = "null cannot be cast to non-null type android.view.ViewGroup"
                gy3.C87412m.m108592e(r2, r5)
                r9 = r2
                android.view.ViewGroup r9 = (android.view.ViewGroup) r9
                r6 = 280(0x118, double:1.383E-321)
                java.lang.String r2 = "key_intent_anim_duration"
                long r6 = r4.getLongExtra(r2, r6)
                android.view.View r8 = r1.Dx0(r4)
                android.view.View r2 = r9.getChildAt(r0)
                gy3.C87412m.m108592e(r2, r5)
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                de1.u r10 = new de1.u
                r10.<init>(r3)
                r9.removeView(r2)
                r10.setContentView(r2)
                android.view.View r5 = r1.Dx0(r4)
                r10.setSourceView(r5)
                r10.addView(r2)
                android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
                r5 = -1
                r2.<init>(r5, r5)
                r9.addView(r10, r2)
                android.view.View r2 = r10.getContentView()
                r5 = 0
                if (r8 == 0) goto L_0x0081
                android.content.Context r11 = r8.getContext()
                goto L_0x0082
            L_0x0081:
                r11 = r5
            L_0x0082:
                boolean r12 = r11 instanceof android.app.Activity
                if (r12 == 0) goto L_0x0089
                android.app.Activity r11 = (android.app.Activity) r11
                goto L_0x008a
            L_0x0089:
                r11 = r5
            L_0x008a:
                r15 = 1
                if (r11 == 0) goto L_0x0095
                boolean r11 = r11.isDestroyed()
                if (r11 != r15) goto L_0x0095
                r11 = 1
                goto L_0x0096
            L_0x0095:
                r11 = 0
            L_0x0096:
                if (r11 != 0) goto L_0x00a0
                if (r8 == 0) goto L_0x009e
                android.content.Context r5 = r8.getContext()
            L_0x009e:
                if (r5 != 0) goto L_0x00ac
            L_0x00a0:
                java.lang.String r5 = "key_intent_animating_flag"
                r4.removeExtra(r5)
                java.lang.String r5 = "ActivityToggleAnimator"
                java.lang.String r11 = "check remove KEY_INTENT_ANIMATING_FLAG"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r11)
            L_0x00ac:
                android.graphics.Rect r5 = new android.graphics.Rect
                android.content.Context r11 = r2.getContext()
                android.content.res.Resources r11 = r11.getResources()
                android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
                int r11 = r11.widthPixels
                android.content.Context r12 = r2.getContext()
                android.content.res.Resources r12 = r12.getResources()
                android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
                int r12 = r12.heightPixels
                r5.<init>(r0, r0, r11, r12)
                android.graphics.Rect r11 = r1.Bx0(r4)
                float r14 = r1.Cx0(r5, r11, r15)
                float[] r1 = r1.Ex0(r5, r11)
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
                r11 = 0
                java.lang.Float r11 = java.lang.Float.valueOf(r11)
                r5.mo10233c(r11)
                java.lang.Object[] r12 = r5.mo10232b()
                java.lang.String r13 = "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator"
                java.lang.String r16 = "initContentViewLocation"
                java.lang.String r17 = "(Landroid/content/Intent;Landroid/view/View;)V"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setAlpha"
                java.lang.String r20 = "(F)V"
                r11 = r2
                r21 = r14
                r14 = r16
                r22 = 1
                r15 = r17
                r16 = r18
                r17 = r19
                r18 = r20
                j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
                java.lang.Object r5 = r5.mo10231a(r0)
                java.lang.Float r5 = (java.lang.Float) r5
                float r5 = r5.floatValue()
                r2.setAlpha(r5)
                java.lang.String r12 = "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator"
                java.lang.String r13 = "initContentViewLocation"
                java.lang.String r14 = "(Landroid/content/Intent;Landroid/view/View;)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setAlpha"
                java.lang.String r17 = "(F)V"
                j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
                r0 = r1[r0]
                r2.setTranslationX(r0)
                r0 = r1[r22]
                r2.setTranslationY(r0)
                r0 = r21
                r2.setScaleX(r0)
                r2.setScaleY(r0)
                de1.c r11 = new de1.c
                r0 = r11
                r1 = r2
                r2 = r4
                r4 = r8
                r5 = r6
                r7 = r10
                r8 = r9
                r0.<init>(r1, r2, r3, r4, r5, r7, r8)
                r9.post(r11)
                goto L_0x016c
            L_0x014a:
                r1.getClass()
                android.content.Intent r0 = r3.getIntent()
                if (r0 != 0) goto L_0x0154
                goto L_0x016c
            L_0x0154:
                boolean r0 = r0.hasExtra(r2)
                if (r0 != 0) goto L_0x015b
                goto L_0x016c
            L_0x015b:
                android.content.Intent r0 = r3.getIntent()
                java.lang.String r0 = r0.getStringExtra(r2)
                java.util.concurrent.ConcurrentHashMap<java.lang.String, de1.x> r1 = de1.C7267b.f25329e
                java.util.Map r1 = gy3.C24564k0.m30739c(r1)
                r1.remove(r0)
            L_0x016c:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: de1.C7267b.C7268a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: de1.b$b */
    public static final class C7269b extends C87413o implements C32226l<Intent, C13598b0> {

        /* renamed from: d */
        public static final C7269b f25331d = new C7269b();

        public C7269b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((Intent) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: de1.b$c */
    public static final class C7270c extends C87413o implements C32227p<Intent, C32226l<? super View, ? extends C13598b0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Intent, C13598b0> f25332d;

        /* renamed from: e */
        public final /* synthetic */ List<C0740i2> f25333e;

        /* renamed from: f */
        public final /* synthetic */ RecyclerView f25334f;

        /* renamed from: g */
        public final /* synthetic */ long f25335g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7270c(C32226l<? super Intent, C13598b0> lVar, List<? extends C0740i2> list, RecyclerView recyclerView, long j) {
            super(2);
            this.f25332d = lVar;
            this.f25333e = list;
            this.f25334f = recyclerView;
            this.f25335g = j;
        }

        /* JADX WARNING: Removed duplicated region for block: B:67:0x017a  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0185  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r18, java.lang.Object r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                android.content.Intent r1 = (android.content.Intent) r1
                r2 = r19
                fy3.l r2 = (fy3.C32226l) r2
                java.lang.String r3 = "intent"
                gy3.C87412m.m108594g(r1, r3)
                java.lang.String r3 = "finishCall"
                gy3.C87412m.m108594g(r2, r3)
                fy3.l<android.content.Intent, rx3.b0> r3 = r0.f25332d
                r3.invoke(r1)
                r3 = -1
                java.lang.String r5 = "KEY_INTENT_EXIT_ITEM_ID"
                long r3 = r1.getLongExtra(r5, r3)
                gy3.d0 r1 = new gy3.d0
                r1.<init>()
                java.util.List<cm1.i2> r5 = r0.f25333e
                java.util.Iterator r5 = r5.iterator()
                r7 = 0
            L_0x002d:
                boolean r8 = r5.hasNext()
                r9 = 1
                r10 = -1
                if (r8 == 0) goto L_0x004c
                java.lang.Object r8 = r5.next()
                cm1.i2 r8 = (cm1.C0740i2) r8
                long r11 = r8.getItemId()
                int r8 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r8 != 0) goto L_0x0045
                r8 = 1
                goto L_0x0046
            L_0x0045:
                r8 = 0
            L_0x0046:
                if (r8 == 0) goto L_0x0049
                goto L_0x004d
            L_0x0049:
                int r7 = r7 + 1
                goto L_0x002d
            L_0x004c:
                r7 = -1
            L_0x004d:
                r1.f27483d = r7
                androidx.recyclerview.widget.RecyclerView r5 = r0.f25334f
                android.content.res.Resources r5 = r5.getResources()
                r7 = 2131165284(0x7f070064, float:1.794478E38)
                float r5 = r5.getDimension(r7)
                int r5 = (int) r5
                androidx.recyclerview.widget.RecyclerView r7 = r0.f25334f
                androidx.recyclerview.widget.RecyclerView$LayoutManager r7 = r7.getLayoutManager()
                androidx.recyclerview.widget.RecyclerView r8 = r0.f25334f
                androidx.recyclerview.widget.RecyclerView$e r8 = r8.getAdapter()
                boolean r11 = r8 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
                if (r11 == 0) goto L_0x0070
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r8 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r8
                goto L_0x0071
            L_0x0070:
                r8 = 0
            L_0x0071:
                if (r8 == 0) goto L_0x0078
                int r8 = r8.mo85796c6()
                goto L_0x0079
            L_0x0078:
                r8 = 0
            L_0x0079:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r13 = "[exitCallback] position="
                r11.append(r13)
                int r13 = r1.f27483d
                r11.append(r13)
                java.lang.String r13 = " backItemId="
                r11.append(r13)
                java.lang.String r3 = o40.C61926c.m72691p(r3)
                r11.append(r3)
                java.lang.String r3 = " clickItemId="
                r11.append(r3)
                long r3 = r0.f25335g
                r11.append(r3)
                java.lang.String r3 = r11.toString()
                java.lang.String r4 = "ActivityToggleAnimator"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                int r3 = r1.f27483d
                if (r3 < 0) goto L_0x0171
                int r3 = r3 + r8
                r1.f27483d = r3
                android.graphics.Rect r3 = new android.graphics.Rect
                r3.<init>()
                androidx.recyclerview.widget.RecyclerView r4 = r0.f25334f
                int r4 = r4.getChildCount()
                r11 = 0
                r13 = -1
                r14 = -1
            L_0x00bc:
                if (r11 >= r4) goto L_0x0105
                androidx.recyclerview.widget.RecyclerView r15 = r0.f25334f
                android.view.View r15 = r15.getChildAt(r11)
                r3.setEmpty()
                boolean r16 = r15.getGlobalVisibleRect(r3)
                if (r16 == 0) goto L_0x0102
                int r12 = r3.height()
                int r6 = r15.getHeight()
                if (r12 < r6) goto L_0x0102
                if (r14 != r10) goto L_0x00ee
                android.view.ViewGroup$LayoutParams r6 = r15.getLayoutParams()
                boolean r12 = r6 instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams
                if (r12 == 0) goto L_0x00e4
                androidx.recyclerview.widget.RecyclerView$LayoutParams r6 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r6
                goto L_0x00e5
            L_0x00e4:
                r6 = 0
            L_0x00e5:
                if (r6 == 0) goto L_0x00ec
                int r6 = r6.mo17279a()
                goto L_0x00ed
            L_0x00ec:
                r6 = -1
            L_0x00ed:
                r14 = r6
            L_0x00ee:
                android.view.ViewGroup$LayoutParams r6 = r15.getLayoutParams()
                boolean r12 = r6 instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams
                if (r12 == 0) goto L_0x00f9
                androidx.recyclerview.widget.RecyclerView$LayoutParams r6 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r6
                goto L_0x00fa
            L_0x00f9:
                r6 = 0
            L_0x00fa:
                if (r6 == 0) goto L_0x0101
                int r13 = r6.mo17279a()
                goto L_0x0102
            L_0x0101:
                r13 = -1
            L_0x0102:
                int r11 = r11 + 1
                goto L_0x00bc
            L_0x0105:
                int r3 = r1.f27483d
                if (r3 > r13) goto L_0x010b
                if (r3 >= r14) goto L_0x0171
            L_0x010b:
                de1.n r3 = de1.C7286n.f25385d
                boolean r4 = r7 instanceof androidx.recyclerview.widget.GridLayoutManager
                if (r4 == 0) goto L_0x011c
                r3 = r7
                androidx.recyclerview.widget.GridLayoutManager r3 = (androidx.recyclerview.widget.GridLayoutManager) r3
                int r3 = r3.f44669w
                de1.j r4 = new de1.j
                r4.<init>(r7, r1, r5)
                goto L_0x0136
            L_0x011c:
                boolean r4 = r7 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
                if (r4 == 0) goto L_0x012b
                r3 = r7
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r3
                int r3 = r3.f44890d
                de1.k r4 = new de1.k
                r4.<init>(r7, r1, r5)
                goto L_0x0136
            L_0x012b:
                boolean r4 = r7 instanceof androidx.recyclerview.widget.LinearLayoutManager
                if (r4 == 0) goto L_0x0134
                de1.l r3 = new de1.l
                r3.<init>(r7, r1, r5)
            L_0x0134:
                r4 = r3
                r3 = 1
            L_0x0136:
                r4.invoke()
                int r4 = r1.f27483d
                int r3 = r3 + r8
                java.lang.String r5 = "null cannot be cast to non-null type android.view.ViewGroup"
                if (r4 >= r3) goto L_0x0158
                de1.b r3 = de1.C7267b.f25328d
                androidx.recyclerview.widget.RecyclerView r4 = r0.f25334f
                android.view.View r4 = r4.getRootView()
                gy3.C87412m.m108592e(r4, r5)
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                com.google.android.material.appbar.AppBarLayout r3 = r3.wx0(r4)
                if (r3 == 0) goto L_0x016f
                r4 = 0
                r3.mo146163d(r9, r4, r9)
                goto L_0x016f
            L_0x0158:
                r4 = 0
                de1.b r3 = de1.C7267b.f25328d
                androidx.recyclerview.widget.RecyclerView r6 = r0.f25334f
                android.view.View r6 = r6.getRootView()
                gy3.C87412m.m108592e(r6, r5)
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                com.google.android.material.appbar.AppBarLayout r3 = r3.wx0(r6)
                if (r3 == 0) goto L_0x016f
                r3.mo146163d(r4, r4, r9)
            L_0x016f:
                r6 = 1
                goto L_0x0173
            L_0x0171:
                r4 = 0
                r6 = 0
            L_0x0173:
                gy3.f0 r3 = new gy3.f0
                r3.<init>()
                if (r6 == 0) goto L_0x0185
                androidx.recyclerview.widget.RecyclerView r4 = r0.f25334f
                de1.m r5 = new de1.m
                r5.<init>(r3, r4, r1, r2)
                r4.post(r5)
                goto L_0x0198
            L_0x0185:
                androidx.recyclerview.widget.RecyclerView r4 = r0.f25334f
                int r1 = r1.f27483d
                androidx.recyclerview.widget.RecyclerView$z r1 = r4.mo17023I0(r1)
                if (r1 == 0) goto L_0x0192
                android.view.View r12 = r1.f44854d
                goto L_0x0193
            L_0x0192:
                r12 = 0
            L_0x0193:
                r3.f27484d = r12
                r2.invoke(r12)
            L_0x0198:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: de1.C7267b.C7270c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    static {
        Context context = MMApplicationContext.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Application");
        ((Application) context).registerActivityLifecycleCallbacks(new C7266a(C7268a.f25330d));
    }

    public static /* synthetic */ C32227p Ax0(C7267b bVar, RecyclerView recyclerView, long j, List list, C32226l lVar, int i, Object obj) {
        if ((i & 8) != 0) {
            lVar = C7269b.f25331d;
        }
        return bVar.zx0(recyclerView, j, list, lVar);
    }

    public static final void vx0(C7267b bVar, View view, Intent intent) {
        bVar.getClass();
        int intExtra = intent.getIntExtra("key_intent_content_view_height", 0);
        if (intExtra > 0) {
            int height = intExtra - view.getHeight();
            Rect rect = (Rect) intent.getParcelableExtra("key_intent_source_rect");
            if (rect == null) {
                rect = new Rect();
            }
            rect.offset(0, -height);
            Log.m105924i("ActivityToggleAnimator", "[fixAnimSourceRectRect] offset=" + height + " sourceHeight=" + intExtra + " currentHeight=" + view.getHeight() + " rect=" + rect);
            intent.putExtra("key_intent_source_rect", rect);
        }
    }

    public final Rect Bx0(Intent intent) {
        Rect rect = (Rect) intent.getParcelableExtra("key_intent_source_rect");
        return rect == null ? new Rect() : rect;
    }

    public final float Cx0(Rect rect, Rect rect2, boolean z) {
        float width = (((float) rect2.width()) * 1.0f) / ((float) rect.width());
        float height = (((float) rect2.height()) * 1.0f) / ((float) rect.height());
        if (z) {
            if (width >= height) {
                return width;
            }
        } else if (width <= height) {
            return width;
        }
        return height;
    }

    public final View Dx0(Intent intent) {
        WeakReference<View> weakReference;
        C7301x xVar = f25329e.get(intent.getStringExtra("key_anim_intent_id"));
        if (xVar == null || (weakReference = xVar.f25403b) == null) {
            return null;
        }
        return weakReference.get();
    }

    public final float[] Ex0(Rect rect, Rect rect2) {
        return new float[]{rect2.exactCenterX() - rect.exactCenterX(), rect2.exactCenterY() - rect.exactCenterY()};
    }

    /* renamed from: ge */
    public void mo8445ge(Intent intent, View view, long j) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(view, "view");
        C7287o.m7447c(intent, view, j, false, false, (C32227p) null, 28, (Object) null);
    }

    public final AppBarLayout wx0(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "vg");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C87412m.m108593f(childAt, "getChildAt(index)");
            if ((childAt instanceof ViewGroup) && !(childAt instanceof AppBarLayout)) {
                AppBarLayout wx02 = f25328d.wx0((ViewGroup) childAt);
                if (wx02 != null) {
                    return wx02;
                }
            } else if (childAt instanceof AppBarLayout) {
                return (AppBarLayout) childAt;
            }
        }
        return null;
    }

    public final long xx0(ViewGroup viewGroup) {
        RecyclerView.C16613e adapter;
        RecyclerView yx02 = yx0(viewGroup);
        LinearLayoutManager linearLayoutManager = null;
        RecyclerView.LayoutManager layoutManager = yx02 != null ? yx02.getLayoutManager() : null;
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        }
        int C = linearLayoutManager != null ? linearLayoutManager.mo16957C() : -1;
        if (C < 0 || yx02 == null || (adapter = yx02.getAdapter()) == null) {
            return -1;
        }
        return adapter.getItemId(C);
    }

    public final RecyclerView yx0(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "vg");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C87412m.m108593f(childAt, "getChildAt(index)");
            if ((childAt instanceof ViewGroup) && !(childAt instanceof RecyclerView)) {
                RecyclerView yx02 = f25328d.yx0((ViewGroup) childAt);
                if (yx02 != null) {
                    return yx02;
                }
            } else if (childAt instanceof RecyclerView) {
                return (RecyclerView) childAt;
            }
        }
        return null;
    }

    public final C32227p<Intent, C32226l<? super View, C13598b0>, C13598b0> zx0(RecyclerView recyclerView, long j, List<? extends C0740i2> list, C32226l<? super Intent, C13598b0> lVar) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(list, "dataList");
        C87412m.m108594g(lVar, "callback");
        return new C7270c(lVar, list, recyclerView, j);
    }
}
