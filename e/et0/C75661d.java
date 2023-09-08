package et0;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C16631z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68688d;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e;
import java.util.List;

/* renamed from: et0.d */
public class C75661d<T extends RecyclerView.C16631z> extends C75659b<T> {

    /* renamed from: a */
    public FrameLayout f222246a;

    /* renamed from: b */
    public View f222247b;

    /* renamed from: c */
    public List f222248c;

    /* renamed from: d */
    public C75658a f222249d;

    /* renamed from: e */
    public Object f222250e;

    /* renamed from: f */
    public C75664f f222251f;

    /* renamed from: g */
    public int f222252g = 0;

    /* renamed from: h */
    public int f222253h = 0;

    /* renamed from: et0.d$a */
    public class C75662a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f222254d;

        public C75662a(Runnable runnable) {
            this.f222254d = runnable;
        }

        public void run() {
            C68688d.C68689a aVar;
            C75661d dVar = C75661d.this;
            C75658a aVar2 = dVar.f222249d;
            if (aVar2 != null) {
                View view = dVar.f222247b;
                int i = dVar.f222252g;
                int i2 = dVar.f222253h;
                Object obj = dVar.f222250e;
                AppBrandDesktopDragView.C68670b bVar = (AppBrandDesktopDragView.C68670b) aVar2;
                bVar.getClass();
                if ((obj instanceof C68691e.C68692a) && ((C68691e.C68692a) obj).f197341b == 2 && (aVar = AppBrandDesktopDragView.this.f197236H) != null) {
                    aVar.mo94424b(i, i2, obj);
                }
            }
            Runnable runnable = this.f222254d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C75661d(FrameLayout frameLayout, List list, C75664f fVar) {
        this.f222246a = frameLayout;
        this.f222248c = list;
        this.f222251f = fVar;
    }

    /* renamed from: a */
    public void mo106004a(RecyclerView recyclerView, View view, float f, float f2, RecyclerView.C16631z zVar, int i, float f3, float f4) {
        if (view != null) {
            view.setTranslationX(view.getTranslationX() - f);
            view.setTranslationY(view.getTranslationY() - f2);
            C75658a aVar = this.f222249d;
            if (aVar != null) {
                AppBrandDesktopDragView.C68670b bVar = (AppBrandDesktopDragView.C68670b) aVar;
                AppBrandDesktopDragView appBrandDesktopDragView = AppBrandDesktopDragView.this;
                if (appBrandDesktopDragView.f197236H != null) {
                    view.getGlobalVisibleRect(appBrandDesktopDragView.f197241M);
                    AppBrandDesktopDragView.this.f197236H.mo94423a(f3, f4);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0176  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo106005b(androidx.recyclerview.widget.RecyclerView r18, T r19, int r20, boolean r21, boolean r22, java.lang.Runnable r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            et0.a r3 = r0.f222249d
            r4 = 0
            if (r3 == 0) goto L_0x0018
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$b r3 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68670b) r3
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r3 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.this
            com.tencent.mm.plugin.appbrand.widget.desktop.d$a r3 = r3.f197236H
            if (r3 == 0) goto L_0x0018
            r5 = r21
            r3.mo94425c(r2, r4, r5)
        L_0x0018:
            if (r22 == 0) goto L_0x01db
            et0.d$a r3 = new et0.d$a
            r5 = r23
            r3.<init>(r5)
            if (r19 == 0) goto L_0x01db
            android.view.View r5 = r0.f222247b
            if (r5 == 0) goto L_0x01db
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[finishMove] position"
            r5.append(r6)
            int r6 = r19.mo17363j()
            r5.append(r6)
            java.lang.String r6 = " dragViewPosition:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ItemMoveHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            androidx.recyclerview.widget.RecyclerView$z r5 = r1.mo17023I0(r2)
            android.view.View r6 = r0.f222247b
            float r6 = r6.getTranslationX()
            android.view.View r7 = r0.f222247b
            float r7 = r7.getTranslationY()
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            int r9 = r19.mo17363j()
            r10 = 2
            r11 = 1073741824(0x40000000, float:2.0)
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 1
            if (r2 == r9) goto L_0x0085
            if (r5 != 0) goto L_0x0085
            androidx.recyclerview.widget.RecyclerView$LayoutManager r9 = r18.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r9 = (androidx.recyclerview.widget.LinearLayoutManager) r9
            int r9 = r9.mo16957C()
            if (r9 <= r2) goto L_0x007d
            int r2 = r18.getHeight()
            float r2 = (float) r2
            float r7 = r7 - r2
            goto L_0x011d
        L_0x007d:
            int r2 = r18.getHeight()
            float r2 = (float) r2
            float r7 = r7 + r2
            goto L_0x011d
        L_0x0085:
            if (r5 == 0) goto L_0x011d
            et0.a r2 = r0.f222249d
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$b r2 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68670b) r2
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r2 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.this
            com.tencent.mm.plugin.appbrand.widget.desktop.d$b r2 = r2.f197237I
            if (r2 != 0) goto L_0x0092
            goto L_0x00ad
        L_0x0092:
            com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView$c r2 = (com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp.TaskBarSectionWeAppRecyclerView.C71344c) r2
            com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView r2 = com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp.TaskBarSectionWeAppRecyclerView.this
            com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView$e r2 = r2.f206642G1
            if (r2 != 0) goto L_0x009b
            goto L_0x00ad
        L_0x009b:
            android.view.View r2 = r2.mo98226i()
            if (r2 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a2:
            r9 = 2131309507(0x7f0933c3, float:1.82373E38)
            android.view.View r2 = r2.findViewById(r9)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 != 0) goto L_0x00af
        L_0x00ad:
            r9 = 0
            goto L_0x00b4
        L_0x00af:
            int[] r9 = new int[r10]
            r2.getLocationOnScreen(r9)
        L_0x00b4:
            if (r9 == 0) goto L_0x0110
            et0.a r2 = r0.f222249d
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$b r2 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68670b) r2
            int r2 = r2.mo94406c()
            r15 = 8
            if (r2 <= r15) goto L_0x0110
            et0.a r2 = r0.f222249d
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$b r2 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68670b) r2
            boolean r2 = r2.mo94405b(r1)
            if (r2 == 0) goto L_0x0110
            r2 = r9[r4]
            float r2 = (float) r2
            android.view.View r6 = r0.f222247b
            int r6 = r6.getWidth()
            float r6 = (float) r6
            float r6 = r6 / r11
            float r6 = r2 - r6
            r2 = r9[r14]
            float r2 = (float) r2
            android.view.View r7 = r0.f222247b
            int r7 = r7.getHeight()
            float r7 = (float) r7
            float r7 = r7 / r11
            float r7 = r2 - r7
            et0.f r2 = r0.f222251f
            android.view.View r9 = r0.f222247b
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$a r2 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68669a) r2
            r2.getClass()
            r2 = 2131306160(0x7f0926b0, float:1.8230511E38)
            android.view.View r2 = r9.findViewById(r2)
            et0.a r9 = r0.f222249d
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$b r9 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68670b) r9
            android.widget.ImageView r9 = r9.mo94404a()
            if (r2 == 0) goto L_0x011d
            if (r9 == 0) goto L_0x011d
            int r9 = r9.getHeight()
            float r9 = (float) r9
            float r9 = r9 * r13
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r9 = r9 / r2
            goto L_0x011f
        L_0x0110:
            et0.a r2 = r0.f222249d
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$b r2 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68670b) r2
            boolean r2 = r2.mo94405b(r1)
            r2 = r2 ^ r14
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
        L_0x011d:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x011f:
            et0.f r2 = r0.f222251f
            android.view.View r15 = r0.f222247b
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$a r2 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68669a) r2
            r2.getClass()
            r2 = 2131306213(0x7f0926e5, float:1.8230619E38)
            android.view.View r2 = r15.findViewById(r2)
            if (r2 != 0) goto L_0x0133
            android.view.View r2 = r0.f222247b
        L_0x0133:
            boolean r8 = r8.booleanValue()
            r15 = 0
            if (r8 == 0) goto L_0x013e
            r12 = 300(0x12c, double:1.48E-321)
            goto L_0x013f
        L_0x013e:
            r12 = r15
        L_0x013f:
            int r8 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x0199
            r8 = 1065353048(0x3f7fff58, float:0.99999)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x0199
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.appbrand.widget.desktop.C68687c
            r7 = 0
            if (r6 != 0) goto L_0x0151
            r4 = 0
            goto L_0x0168
        L_0x0151:
            r8 = r5
            com.tencent.mm.plugin.appbrand.widget.desktop.c r8 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.C68687c) r8
            android.widget.ImageView r8 = r8.f197332B
            int[] r15 = new int[r10]
            r8.getLocationOnScreen(r15)
            r4 = r15[r4]
            float r4 = (float) r4
            android.content.Context r8 = r18.getContext()
            float r8 = dt0.C75446e.m90468a(r8)
            float r8 = r8 / r11
            float r4 = r4 + r8
        L_0x0168:
            et0.f r8 = r0.f222251f
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$a r8 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68669a) r8
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r8 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.this
            float r8 = r8.getOffsetX()
            float r4 = r4 + r8
            if (r6 != 0) goto L_0x0176
            goto L_0x018d
        L_0x0176:
            r6 = r5
            com.tencent.mm.plugin.appbrand.widget.desktop.c r6 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.C68687c) r6
            android.widget.ImageView r6 = r6.f197332B
            int[] r7 = new int[r10]
            r6.getLocationOnScreen(r7)
            r6 = r7[r14]
            float r6 = (float) r6
            android.content.Context r7 = r18.getContext()
            float r7 = dt0.C75446e.m90468a(r7)
            float r7 = r7 / r11
            float r7 = r7 + r6
        L_0x018d:
            et0.f r6 = r0.f222251f
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$a r6 = (com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68669a) r6
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r6 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.this
            float r6 = r6.getOffsetY()
            float r7 = r7 + r6
            r6 = r4
        L_0x0199:
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r4 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r2.scaleX(r4)
            android.view.ViewPropertyAnimator r2 = r2.scaleY(r4)
            r10 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r10)
            r4 = 0
            android.view.ViewPropertyAnimator r2 = r2.setListener(r4)
            r2.start()
            android.view.View r2 = r0.f222247b
            android.view.ViewPropertyAnimator r2 = r2.animate()
            android.view.ViewPropertyAnimator r2 = r2.scaleX(r9)
            android.view.ViewPropertyAnimator r2 = r2.scaleY(r9)
            android.view.ViewPropertyAnimator r2 = r2.translationX(r6)
            android.view.ViewPropertyAnimator r2 = r2.translationY(r7)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r12)
            et0.e r4 = new et0.e
            r4.<init>(r0, r1, r5, r3)
            android.view.ViewPropertyAnimator r1 = r2.setListener(r4)
            r1.start()
        L_0x01db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: et0.C75661d.mo106005b(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z, int, boolean, boolean, java.lang.Runnable):void");
    }

    /* renamed from: c */
    public boolean mo106006c(RecyclerView recyclerView, T t, T t2, int i, int i2) {
        int i3;
        C75658a aVar = this.f222249d;
        if (aVar == null) {
            return true;
        }
        AppBrandDesktopDragView appBrandDesktopDragView = AppBrandDesktopDragView.this;
        if (appBrandDesktopDragView.f197237I == null) {
            return appBrandDesktopDragView.f197239K && ((i3 = t2.f44859i) == 2 || i3 == 5);
        }
        if (appBrandDesktopDragView.f197239K) {
            int i4 = t2.f44859i;
            if (i4 == 2 || i4 == 5) {
                return true;
            }
            if (recyclerView.getId() == C0966R.C0970id.f359352kg1) {
                return true;
            }
        }
    }
}
