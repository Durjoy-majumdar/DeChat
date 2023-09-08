package rs1;

import android.view.View;
import android.widget.TextView;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import te3.C50949qe1;

/* renamed from: rs1.x6 */
public final class C13531x6 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ View f38366d;

    /* renamed from: e */
    public final /* synthetic */ View f38367e;

    /* renamed from: f */
    public final /* synthetic */ TextView f38368f;

    /* renamed from: g */
    public final /* synthetic */ C50949qe1 f38369g;

    /* renamed from: h */
    public final /* synthetic */ String f38370h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13531x6(View view, View view2, TextView textView, C50949qe1 qe12, String str) {
        super(0);
        this.f38366d = view;
        this.f38367e = view2;
        this.f38368f = textView;
        this.f38369g = qe12;
        this.f38370h = str;
    }

    public Object invoke() {
        View view = this.f38366d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$animateToNextQuestion$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$animateToNextQuestion$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f38367e;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(4);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$animateToNextQuestion$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$animateToNextQuestion$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        TextView textView = this.f38368f;
        String str = this.f38369g.f140258e;
        if (str == null) {
            str = this.f38370h;
        }
        textView.setText(str);
        return C13598b0.f38549a;
    }
}
