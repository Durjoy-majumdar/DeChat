package oq1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import sq1.C64151e;

/* renamed from: oq1.d */
public final class C62123d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f176647d;

    /* renamed from: e */
    public final /* synthetic */ View f176648e;

    /* renamed from: f */
    public final /* synthetic */ C62131l f176649f;

    /* renamed from: g */
    public final /* synthetic */ C64151e f176650g;

    public C62123d(View view, View view2, C62131l lVar, C64151e eVar) {
        this.f176647d = view;
        this.f176648e = view2;
        this.f176649f = lVar;
        this.f176650g = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View view2 = this.f176647d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$14", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$14", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = this.f176648e;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view5 = view4;
        C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$14", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$14", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f176649f.f176670e.mo79238i0(this.f176650g, true);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
