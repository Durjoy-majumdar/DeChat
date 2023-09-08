package vz0;

import a70.C112760b;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import gc0.C20828a;
import hc0.C20937c;
import hz0.C76251l;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import te3.C22513m40;

/* renamed from: vz0.n */
public class C22822n extends C22821l {

    /* renamed from: b */
    public View f65617b;

    /* renamed from: c */
    public void mo35949c() {
    }

    /* renamed from: d */
    public void mo35950d(int i) {
        View view = this.f65617b;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public void mo35951e() {
        if (this.f65617b == null) {
            this.f65617b = ((ViewStub) mo35969b(C0966R.C0970id.aty)).inflate();
        }
        if (((CardDetailUIContoller) this.f65616a).f51776E.mo23284h()) {
            this.f65617b.setBackgroundResource(C0966R.C0969drawable.f4707kl);
        }
        this.f65617b.setOnClickListener(((CardDetailUIContoller) this.f65616a).f51794X);
        C22513m40 m402 = ((CardDetailUIContoller) this.f65616a).f51776E.mo23264L0().f64115M;
        if (!TextUtils.isEmpty(m402.f64224h)) {
            ((TextView) mo35969b(C0966R.C0970id.ats)).setText(m402.f64224h);
            View b = mo35969b(C0966R.C0970id.att);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = b;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View b2 = mo35969b(C0966R.C0970id.att);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = b2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ImageView imageView = (ImageView) mo35969b(C0966R.C0970id.atx);
        LinkedList<String> linkedList = m402.f64223g;
        if (linkedList == null || linkedList.size() <= 0 || TextUtils.isEmpty(m402.f64223g.get(0))) {
            imageView.setVisibility(8);
            return;
        }
        String str = m402.f64223g.get(0);
        imageView.setVisibility(0);
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59351g = C112760b.m154195C();
        bVar.f59350f = C76251l.m91644m(str);
        bVar.f59346b = true;
        bVar.f59364t = false;
        bVar.f59345a = true;
        C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
    }
}
