package ao1;

import a14.C53934p0;
import android.content.DialogInterface;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import bl3.C0317e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.p056ui.FinderCreateContactUI;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import it1.C9247b;
import j20.C117292a;
import java.util.ArrayList;
import je1.C46531q4;
import qo3.C12925w;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: ao1.j */
public final class C0162j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0166l f613d;

    public C0162j(C0166l lVar) {
        this.f613d = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/post/PostCreateContactUIC$initView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C0166l lVar = this.f613d;
        C12925w wVar = lVar.f619d;
        if (wVar != null) {
            View findViewById = wVar.f36927f.findViewById(C0966R.C0970id.nfe);
            C12925w wVar2 = lVar.f619d;
            if (wVar2 != null) {
                if (((CheckBox) wVar2.f36927f.findViewById(C0966R.C0970id.nfd)).isChecked()) {
                    String q = C86013q1.m106456q(C0166l.f617g);
                    int l = (int) C86013q1.m106451l(C0166l.f617g);
                    String a = FinderCreateContactUI.f16795U0.mo4033a(q, l);
                    String str = FinderCreateContactUI.f16807g1.get(a);
                    if ((a.length() == 0) || str == null) {
                        C87412m.m108593f(q, "avatarFileMD5");
                        C0317e.launch$default(lVar, (C66212f) null, (C53934p0) null, new C0175n(new C46531q4(C0166l.f617g, 1, q, l), lVar, (C15601d<? super C0175n>) null), 3, (Object) null);
                    } else {
                        lVar.mo158e3(str);
                    }
                    C9247b bVar = lVar.f620e;
                    if (bVar != null) {
                        bVar.mo8913b();
                    }
                    C9247b a2 = C9247b.C9248a.m8889a(C9247b.f28989d, lVar.getContext(), lVar.getContext().getString(C0966R.string.a2w), 500, (DialogInterface.OnCancelListener) null, 8, (Object) null);
                    lVar.f620e = a2;
                    a2.begin();
                } else {
                    findViewById.startAnimation(AnimationUtils.loadAnimation(lVar.getContext(), C0966R.C0968anim.f2342a7));
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/post/PostCreateContactUIC$initView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("bottomSheet");
            throw null;
        }
        C87412m.m108603p("bottomSheet");
        throw null;
    }
}
