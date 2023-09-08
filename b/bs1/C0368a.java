package bs1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import as1.C0201a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.drawer.FinderDraggableLayout;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import up1.C37521f;

/* renamed from: bs1.a */
public final class C0368a extends C0376e {

    /* renamed from: b */
    public final Context f962b;

    /* renamed from: c */
    public final boolean f963c;

    /* renamed from: d */
    public View f964d;

    /* renamed from: bs1.a$a */
    public static final class C0369a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C0368a f965d;

        public C0369a(C0368a aVar) {
            this.f965d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent$getView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C0201a aVar = this.f965d.f978a;
            if (aVar != null) {
                FinderDraggableLayout.m4279a(aVar, false, 1, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent$getView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C0368a(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        this.f962b = context;
        this.f963c = z;
    }

    /* renamed from: a */
    public View mo408a() {
        if (this.f964d == null) {
            View view = new View(this.f962b);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(view.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_5));
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(new C0369a(this));
            this.f964d = view;
        }
        return this.f964d;
    }

    /* renamed from: f */
    public void mo409f(C0201a aVar, float f, String str) {
        View view;
        View view2;
        C87412m.m108594g(aVar, "layout");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        super.mo409f(aVar, f, str);
        View view3 = this.f964d;
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        float borderPeek = aVar.getCanPeek() ? aVar.getBorderPeek() : aVar.getBorderExpand();
        float borderClose = aVar.getBorderClose();
        float f2 = (borderClose - f) / (borderClose - borderPeek);
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (0.0f >= f2) {
            f2 = 0.0f;
        }
        View view4 = this.f964d;
        if (view4 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(Float.valueOf(f2));
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        boolean z = true;
        if ((f2 == 0.0f) && (view2 = this.f964d) != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar4.mo10233c(8);
            C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C37521f.f99374d.getClass();
        if (C37521f.f99579z7.mo60266n().intValue() != 1) {
            z = false;
        }
        if (z && !this.f963c && (view = this.f964d) != null) {
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar5.mo10233c(Float.valueOf(0.0f));
            View view5 = view;
            C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/view/drawer/component/BackgroundMaskComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }
}
