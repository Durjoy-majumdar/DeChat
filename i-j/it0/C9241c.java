package it0;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: it0.c */
public final class C9241c {

    /* renamed from: e */
    public static final C9245d f28978e = new C9245d((C8480h) null);

    /* renamed from: f */
    public static final C13601g<Integer> f28979f = C36568h.m40985a(C9244c.f28988d);

    /* renamed from: g */
    public static final C13601g<Integer> f28980g = C36568h.m40985a(C9243b.f28987d);

    /* renamed from: h */
    public static final C13601g<Integer> f28981h = C36568h.m40985a(C9242a.f28986d);

    /* renamed from: a */
    public View f28982a;

    /* renamed from: b */
    public View f28983b = this.f28982a.findViewById(C0966R.C0970id.msp);

    /* renamed from: c */
    public View f28984c;

    /* renamed from: d */
    public int f28985d = this.f28982a.getLayoutParams().height;

    /* renamed from: it0.c$a */
    public static final class C9242a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C9242a f28986d = new C9242a();

        public C9242a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92151b(MMApplicationContext.getContext(), 4));
        }
    }

    /* renamed from: it0.c$b */
    public static final class C9243b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C9243b f28987d = new C9243b();

        public C9243b() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92151b(MMApplicationContext.getContext(), 16));
        }
    }

    /* renamed from: it0.c$c */
    public static final class C9244c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C9244c f28988d = new C9244c();

        public C9244c() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92151b(MMApplicationContext.getContext(), 56));
        }
    }

    /* renamed from: it0.c$d */
    public static final class C9245d {
        public C9245d(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo10025a(View view, View view2, View view3, float f, int i, int i2) {
            View view4 = view2;
            View view5 = view3;
            float f2 = f;
            int i3 = i2;
            C87412m.m108594g(view, "panelIndicator");
            C87412m.m108594g(view4, "headerLine");
            C87412m.m108594g(view5, "headerArrow");
            Log.m105918d("AppBrandHalfScreenPanelHeadIndicatorHolder", "updatePanelHead " + f2);
            float f3 = 1.0f;
            float f4 = 0.0f;
            if (f2 < 0.0f) {
                int min = Math.min(Math.max(0, i - 44), 44);
                float f5 = ((((float) min) * 1.0f) / ((float) 44)) * 1.0f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(f5));
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/halfscreen/AppBrandHalfScreenPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;FII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/halfscreen/AppBrandHalfScreenPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;FII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                float max = ((float) Math.max(0, C85875k4.m106198o(view.getContext()) - i3)) * (((float) 1) - f5);
                view.getLayoutParams().height = (int) (((float) i3) + max);
                view.requestLayout();
                Log.m105918d("AppBrandHalfScreenPanelHeadIndicatorHolder", "updatePanelHead  maxRange[" + 44 + "] currentRange[" + min + "] alpha[" + f5 + "] panelDiff[" + max + ']');
                return;
            }
            float intValue = f2 / ((float) ((Number) ((C36570n) C9241c.f28979f).getValue()).intValue());
            float f6 = (intValue - 0.5f) * 2.0f;
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            if (intValue <= 1.0f) {
                f3 = intValue;
            }
            if (0.0f < f3) {
                f4 = f3;
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                C9245d dVar = C9241c.f28978e;
                C13601g<Integer> gVar = C9241c.f28981h;
                layoutParams.height = (int) (((float) ((Number) ((C36570n) gVar).getValue()).intValue()) + (f4 * ((float) (((Number) ((C36570n) C9241c.f28980g).getValue()).intValue() - ((Number) ((C36570n) gVar).getValue()).intValue()))));
            } else {
                layoutParams = null;
            }
            view4.setLayoutParams(layoutParams);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(f6));
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/halfscreen/AppBrandHalfScreenPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;FII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/widget/halfscreen/AppBrandHalfScreenPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;FII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public C9241c(View view) {
        C87412m.m108594g(view, "panelIndicator");
        this.f28982a = view;
        this.f28984c = view.findViewById(C0966R.C0970id.mso);
        Log.m105924i("AppBrandHalfScreenPanelHeadIndicatorHolder", "init headerLine:" + this.f28983b + ",headerArrow:" + this.f28984c);
    }
}
