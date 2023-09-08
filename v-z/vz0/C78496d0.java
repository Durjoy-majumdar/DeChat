package vz0;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rz0.C22280a;
import te3.C22498fy;

/* renamed from: vz0.d0 */
public class C78496d0 extends C22821l {

    /* renamed from: b */
    public View f229933b;

    /* renamed from: c */
    public void mo35949c() {
    }

    /* renamed from: d */
    public void mo35950d(int i) {
        View view = this.f229933b;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardThirdFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardThirdFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public void mo35951e() {
        if (this.f229933b == null) {
            this.f229933b = ((ViewStub) mo35969b(C0966R.C0970id.axd)).inflate();
        }
        C22498fy fyVar = ((CardDetailUIContoller) this.f65616a).f51776E.mo23263J0().f63956u;
        View view = this.f229933b;
        if (view != null) {
            ((TextView) view.findViewById(C0966R.C0970id.kj7)).setText(fyVar.f63884d);
            ((TextView) this.f229933b.findViewById(C0966R.C0970id.kj6)).setText(fyVar.f63885e);
            if (!((C22280a) ((CardDetailUIContoller) this.f65616a).f51798f).mo35449w() || !((C22280a) ((CardDetailUIContoller) this.f65616a).f51798f).mo35448v()) {
                ((LinearLayout.LayoutParams) ((LinearLayout) this.f229933b).getLayoutParams()).bottomMargin = 0;
            } else {
                ((LinearLayout.LayoutParams) ((LinearLayout) this.f229933b).getLayoutParams()).bottomMargin = ((CardDetailUIContoller) this.f65616a).f51797e.getResources().getDimensionPixelSize(C0966R.dimen.f3946l5);
            }
        }
    }
}
