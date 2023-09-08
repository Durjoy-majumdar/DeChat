package go3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.p136ui.widget.TouchMediaPreviewLayout;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: go3.c0 */
public final class C107868c0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ TouchMediaPreviewLayout f323006d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<View, C13598b0> f323007e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107868c0(TouchMediaPreviewLayout touchMediaPreviewLayout, C32226l<? super View, C13598b0> lVar) {
        super(0);
        this.f323006d = touchMediaPreviewLayout;
        this.f323007e = lVar;
    }

    public Object invoke() {
        ViewParent parent;
        View touchView = this.f323006d.getTouchView();
        if (!(touchView == null || (parent = touchView.getParent()) == null)) {
            ((ViewGroup) parent).removeView(this.f323006d.getTouchView());
        }
        this.f323006d.f319216v.mo154436B(true);
        TouchMediaPreviewLayout touchMediaPreviewLayout = this.f323006d;
        touchMediaPreviewLayout.f319216v.removeView(touchMediaPreviewLayout.getTouchView());
        TouchMediaPreviewLayout touchMediaPreviewLayout2 = this.f323006d;
        ViewGroup viewGroup = touchMediaPreviewLayout2.f319217w;
        if (viewGroup != null) {
            viewGroup.removeView(touchMediaPreviewLayout2.f319216v);
            viewGroup.addView(touchMediaPreviewLayout2.getTouchView(), touchMediaPreviewLayout2.f319219y, touchMediaPreviewLayout2.f319218x);
            touchMediaPreviewLayout2.f319219y = 0;
        }
        View touchView2 = this.f323006d.getTouchView();
        if (touchView2 != null) {
            C32226l<View, C13598b0> lVar = this.f323007e;
            touchView2.setScaleX(1.0f);
            touchView2.setScaleY(1.0f);
            touchView2.setTranslationX(0.0f);
            touchView2.setTranslationY(0.0f);
            lVar.invoke(touchView2);
        }
        TouchMediaPreviewLayout touchMediaPreviewLayout3 = this.f323006d;
        touchMediaPreviewLayout3.f319200C = false;
        touchMediaPreviewLayout3.f319205h = false;
        touchMediaPreviewLayout3.f319198A = false;
        View a = touchMediaPreviewLayout3.getBackgroundView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        View view = a;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$removeTouchView$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        a.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$removeTouchView$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        return C13598b0.f38549a;
    }
}
