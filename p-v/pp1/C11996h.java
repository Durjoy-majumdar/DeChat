package pp1;

import android.view.View;
import android.view.ViewGroup;
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
import ok1.C62042e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: pp1.h */
public final class C11996h {

    /* renamed from: d */
    public static final C12000d f34989d = new C12000d((C8480h) null);

    /* renamed from: e */
    public static final C13601g<Integer> f34990e = C36568h.m40985a(C11999c.f34998d);

    /* renamed from: f */
    public static final C13601g<Integer> f34991f = C36568h.m40985a(C11998b.f34997d);

    /* renamed from: g */
    public static final C13601g<Integer> f34992g = C36568h.m40985a(C11997a.f34996d);

    /* renamed from: a */
    public View f34993a;

    /* renamed from: b */
    public View f34994b;

    /* renamed from: c */
    public int f34995c;

    /* renamed from: pp1.h$a */
    public static final class C11997a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C11997a f34996d = new C11997a();

        public C11997a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92151b(MMApplicationContext.getContext(), 4));
        }
    }

    /* renamed from: pp1.h$b */
    public static final class C11998b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C11998b f34997d = new C11998b();

        public C11998b() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92151b(MMApplicationContext.getContext(), 16));
        }
    }

    /* renamed from: pp1.h$c */
    public static final class C11999c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C11999c f34998d = new C11999c();

        public C11999c() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92151b(MMApplicationContext.getContext(), 56));
        }
    }

    /* renamed from: pp1.h$d */
    public static final class C12000d {
        public C12000d(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo11874a(View view, View view2, int i, float f) {
            C87412m.m108594g(view, "headerLine");
            C87412m.m108594g(view2, "headerArrow");
            C62042e eVar = C62042e.f176370a;
            eVar.mo86998D1("ShoppingPanelHeadIndicatorHolder", "updatePanelHead " + f + ",panelPosY:" + i);
            float intValue = f / ((float) ((Number) ((C36570n) C11996h.f34990e).getValue()).intValue());
            float f2 = (intValue - 0.5f) * 2.0f;
            float f3 = 0.0f;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (intValue > 1.0f) {
                intValue = 1.0f;
            }
            if (0.0f < intValue) {
                f3 = intValue;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                C12000d dVar = C11996h.f34989d;
                C13601g<Integer> gVar = C11996h.f34992g;
                layoutParams.height = (int) (((float) ((Number) ((C36570n) gVar).getValue()).intValue()) + (f3 * ((float) (((Number) ((C36570n) C11996h.f34991f).getValue()).intValue() - ((Number) ((C36570n) gVar).getValue()).intValue()))));
            } else {
                layoutParams = null;
            }
            view.setLayoutParams(layoutParams);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f2));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;IF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;IF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public C11996h(View view, View view2, int i) {
        this.f34993a = view;
        this.f34994b = view2;
        this.f34995c = i;
        Log.m105924i("ShoppingPanelHeadIndicatorHolder", "init headerLine:" + this.f34993a + ",headerArrow:" + this.f34994b + ",panelPosY:" + this.f34995c);
    }
}
