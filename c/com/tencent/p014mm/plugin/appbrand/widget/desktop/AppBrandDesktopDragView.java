package com.tencent.p014mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68688d;
import com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp.TaskBarSectionMyWeAppRecyclerView;
import com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp.TaskBarSectionWeAppRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import dt0.C75445d;
import dt0.C75446e;
import dt0.C75447f;
import et0.C75658a;
import et0.C75660c;
import et0.C75661d;
import et0.C75664f;
import gy2.C76076b;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView */
public class AppBrandDesktopDragView extends DragFeatureView implements C68688d {

    /* renamed from: G */
    public List f197235G;

    /* renamed from: H */
    public C68688d.C68689a f197236H = null;

    /* renamed from: I */
    public C68688d.C68690b f197237I = null;

    /* renamed from: J */
    public int f197238J = 0;

    /* renamed from: K */
    public boolean f197239K = true;

    /* renamed from: L */
    public boolean f197240L = false;

    /* renamed from: M */
    public Rect f197241M = new Rect();

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$a */
    public class C68669a implements C75664f {
        public C68669a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView$b */
    public class C68670b implements C75658a {
        public C68670b() {
        }

        /* renamed from: a */
        public ImageView mo94404a() {
            TaskBarSectionWeAppRecyclerView.C71348e eVar;
            View i;
            C68688d.C68690b bVar = AppBrandDesktopDragView.this.f197237I;
            if (bVar == null || (eVar = TaskBarSectionWeAppRecyclerView.this.f206642G1) == null || (i = eVar.mo98226i()) == null) {
                return null;
            }
            return (ImageView) i.findViewById(C0966R.C0970id.m4t);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
            r0 = (gy2.C76076b) r0.mo98226i();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo94405b(androidx.recyclerview.widget.RecyclerView r4) {
            /*
                r3 = this;
                com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r0 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.this
                com.tencent.mm.plugin.appbrand.widget.desktop.d$b r0 = r0.f197237I
                r1 = 0
                if (r0 != 0) goto L_0x000f
                java.lang.String r4 = "MicroMsg.AppBrandDesktopDragView"
                java.lang.String r0 = "jacob InAreaFalse"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                return r1
            L_0x000f:
                com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView$c r0 = (com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp.TaskBarSectionWeAppRecyclerView.C71344c) r0
                com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView r0 = com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp.TaskBarSectionWeAppRecyclerView.this
                com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView$e r0 = r0.f206642G1
                if (r0 != 0) goto L_0x0019
            L_0x0017:
                r0 = 0
                goto L_0x0024
            L_0x0019:
                android.view.View r0 = r0.mo98226i()
                gy2.b r0 = (gy2.C76076b) r0
                if (r0 != 0) goto L_0x0022
                goto L_0x0017
            L_0x0022:
                boolean r0 = r0.f222941t
            L_0x0024:
                r2 = 1
                if (r0 == 0) goto L_0x003f
                com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView r0 = com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.this
                com.tencent.mm.plugin.appbrand.widget.desktop.d$b r0 = r0.f197237I
                com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView$c r0 = (com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp.TaskBarSectionWeAppRecyclerView.C71344c) r0
                r0.getClass()
                int r4 = r4.getId()
                r0 = 2131314946(0x7f094902, float:1.8248331E38)
                if (r4 != r0) goto L_0x003b
                r4 = 1
                goto L_0x003c
            L_0x003b:
                r4 = 0
            L_0x003c:
                if (r4 == 0) goto L_0x003f
                r1 = 1
            L_0x003f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.C68670b.mo94405b(androidx.recyclerview.widget.RecyclerView):boolean");
        }

        /* renamed from: c */
        public int mo94406c() {
            C76076b bVar;
            TaskBarSectionMyWeAppRecyclerView taskBarSectionMyWeAppRecyclerView;
            TaskBarSectionWeAppRecyclerView.C71348e eVar = TaskBarSectionWeAppRecyclerView.this.f206642G1;
            if (eVar == null || (bVar = (C76076b) eVar.mo98226i()) == null || (taskBarSectionMyWeAppRecyclerView = (TaskBarSectionMyWeAppRecyclerView) bVar.findViewById(C0966R.C0970id.f359352kg1)) == null) {
                return -1;
            }
            return taskBarSectionMyWeAppRecyclerView.getDataList().size();
        }
    }

    public AppBrandDesktopDragView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    public float getOffsetX() {
        return ((float) (-this.f197238J)) / 2.0f;
    }

    /* access modifiers changed from: private */
    public float getOffsetY() {
        return (-0.0f - ((float) C76577a.m92151b(getContext(), 40))) - (((C75446e.m90468a(getContext()) * 1.5f) + ((float) (C76577a.m92151b(getContext(), 8) * 2))) / 2.0f);
    }

    /* renamed from: d */
    public C75660c mo94392d(RecyclerView.C16631z zVar) {
        C75661d dVar = new C75661d(this, this.f197235G, new C68669a());
        getRecyclerScrollComputer();
        dVar.f222249d = new C68670b();
        return dVar;
    }

    /* renamed from: e */
    public boolean mo94393e(MotionEvent motionEvent) {
        if (this.f197298i.f44859i == 1) {
            return false;
        }
        return super.mo94393e(motionEvent);
    }

    /* renamed from: g */
    public RecyclerView.C16631z mo94394g(float f, float f2, boolean z) {
        RecyclerView.C16631z zVar;
        getRecyclerView().getGlobalVisibleRect(this.f197290C);
        int i = (int) f;
        int i2 = (int) f2;
        if (!this.f197290C.contains(i, i2)) {
            return null;
        }
        boolean z2 = false;
        RecyclerView.C16631z zVar2 = null;
        int i3 = 0;
        while (true) {
            if (i3 >= getRecyclerView().getChildCount()) {
                zVar = null;
                break;
            }
            zVar = getRecyclerView().mo17031P0(getRecyclerView().getChildAt(i3));
            int i4 = zVar.f44859i;
            if (!(i4 == 5 || i4 == 3)) {
                zVar.f44854d.getGlobalVisibleRect(this.f197290C);
                if (this.f197290C.contains(i, i2)) {
                    z2 = true;
                    zVar2 = zVar;
                    break;
                }
                zVar2 = zVar;
            }
            i3++;
        }
        if (z2) {
            return zVar;
        }
        if (!z) {
            Rect rect = this.f197290C;
            if ((f <= ((float) rect.right) || f2 <= ((float) rect.top)) && f2 <= ((float) rect.bottom)) {
                return null;
            }
            return zVar2;
        }
        return null;
    }

    /* renamed from: m */
    public View mo94395m(RecyclerView recyclerView, C68687c cVar) {
        C68687c cVar2 = cVar;
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.b3y, (ViewGroup) null, false);
        inflate.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
        C68687c cVar3 = new C68687c(inflate);
        inflate.setScaleX(1.0f);
        inflate.setScaleY(1.0f);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(inflate, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        inflate.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(inflate, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(inflate, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(inflate, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int[] iArr = new int[2];
        cVar2.f197332B.getLocationOnScreen(iArr);
        cVar3.f197332B.setImageDrawable(cVar2.f197332B.getDrawable());
        cVar3.f197332B.setBackground(cVar2.f197332B.getBackground());
        cVar3.f197336F.setText(cVar2.f197336F.getText());
        cVar3.f197336F.setVisibility(cVar2.f197336F.getVisibility());
        cVar3.f197337G.setVisibility(4);
        float a = C75446e.m90468a(getContext());
        float b = (a * 1.5f) + ((float) (C76577a.m92151b(getContext(), 8) * 2));
        Log.m105925i("MicroMsg.AppBrandDesktopDragView", "alvinluo fillFloatView iconLayout: %f", Float.valueOf(b));
        int i = (int) b;
        inflate.findViewById(C0966R.C0970id.f2m).getLayoutParams().height = i;
        cVar3.f197334D.getLayoutParams().height = i;
        int i2 = (int) a;
        cVar3.f197334D.getLayoutParams().width = ((int) (((float) (C76577a.m92155f(getContext(), C0966R.dimen.f3956le) * 2)) * C75447f.m90469a(getContext()))) + i2;
        cVar3.f197332B.getLayoutParams().width = i2;
        cVar3.f197332B.getLayoutParams().height = i2;
        cVar3.f197333C.getLayoutParams().width = i2;
        cVar3.f197333C.getLayoutParams().height = i2;
        ViewGroup.LayoutParams layoutParams = cVar3.f197337G.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = C76577a.m92151b(getContext(), 6) + ((int) ((a * 0.5f) / 2.0f));
            layoutParams.width = (int) (((float) getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3895i6)) * C75447f.m90469a(getContext()));
            layoutParams.height = (int) (((float) getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3895i6)) * C75447f.m90469a(getContext()));
        }
        float f = a / 2.0f;
        int i3 = (int) (((float) iArr[0]) + f);
        iArr[0] = i3;
        iArr[1] = (int) (((float) iArr[1]) + f);
        float offsetX = ((float) i3) + getOffsetX();
        float offsetY = ((float) iArr[1]) + getOffsetY();
        View findViewById = inflate.findViewById(C0966R.C0970id.f6021v3);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(4);
        View view = findViewById;
        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.findViewById(C0966R.C0970id.f2b).animate().alpha(0.5f).setDuration(300).setListener((Animator.AnimatorListener) null).start();
        Log.m105925i("MicroMsg.DragFeatureView", "alvinluo enableScroll %b", Boolean.FALSE);
        this.f197312z = false;
        inflate.findViewById(C0966R.C0970id.f2b).animate().scaleX(1.5f).scaleY(1.5f).setDuration(300).setListener(new C75445d(this)).start();
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.k1a);
        imageView.getLayoutParams().height = (int) (((float) C76577a.m92151b(getContext(), 24)) * C75447f.m90469a(getContext()));
        imageView.getLayoutParams().width = (int) (((float) C76577a.m92151b(getContext(), 24)) * C75447f.m90469a(getContext()));
        imageView.setTranslationY(((-a) * 0.5f) / 2.0f);
        imageView.setTranslationX((a * 0.5f) / 2.0f);
        inflate.setTranslationX(offsetX);
        inflate.setTranslationY(offsetY);
        Log.m105925i("MicroMsg.AppBrandDesktopDragView", "alvinluo fillFloatView offsetX: %f, transX: %f, transY: %f", Float.valueOf(getOffsetX()), Float.valueOf(offsetX), Float.valueOf(offsetY));
        return inflate;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getGlobalVisibleRect(this.f197302p);
        Rect rect = this.f197302p;
        Rect rect2 = this.f197302p;
        rect.set(rect.left, ((rect.bottom - this.f197293d) - ((int) (((float) getContext().getResources().getDimensionPixelSize(C0966R.dimen.f357036ab1)) * 1.0f))) - 40, rect2.right, rect2.bottom - this.f197293d);
        Log.m105925i("MicroMsg.AppBrandDesktopDragView", "alvinluo bottomRect: %s", this.f197302p);
        getRecyclerView().getGlobalVisibleRect(this.f197303q);
        Rect rect3 = this.f197303q;
        rect3.set(rect3.left, 0, rect3.right, rect3.top + this.f197293d);
    }

    public void setAppBrandDragCallback(C68688d.C68689a aVar) {
        this.f197236H = aVar;
    }

    public void setCanMyWeAppMove(boolean z) {
        this.f197239K = z;
    }

    public void setList(List list) {
        this.f197235G = list;
    }

    public void setRubbishViewVisible(int i) {
        super.setRubbishViewVisible(i);
    }

    public void setSectionCallback(C68688d.C68690b bVar) {
        this.f197237I = bVar;
    }

    public void setShouldDoDeleteAnimation(boolean z) {
        this.f197240L = z;
    }

    public void setViewWidth(int i) {
        this.f197238J = i;
    }

    public AppBrandDesktopDragView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
