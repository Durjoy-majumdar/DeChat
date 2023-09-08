package oo1;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60172g4;
import j20.C117292a;
import java.util.ArrayList;
import nr3.C89059e;
import ob0.C89132b;
import oo1.C11614d0;
import qo3.C89779i0;
import te3.C48722aj0;
import te3.C49098d51;
import te3.C49712hj1;
import tf0.C13887q1;
import tf0.C64916p1;
import zc1.C66785b;

/* renamed from: oo1.i0 */
public final class C11661i0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C11614d0 f34176d;

    /* renamed from: e */
    public final /* synthetic */ C11614d0.C11618c f34177e;

    public C11661i0(C11614d0 d0Var, C11614d0.C11618c cVar) {
        this.f34176d = d0Var;
        this.f34177e = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$RecyclerAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C11614d0 d0Var = this.f34176d;
        C11614d0.C11618c cVar = this.f34177e;
        d0Var.f34051p.mo11526a();
        Context context = d0Var.f34037b;
        C49712hj1 hj12 = null;
        C89779i0 e = C89779i0.m112248e(context, context.getString(C0966R.string.ett), false, 2, (DialogInterface.OnCancelListener) null);
        C13887q1 q1Var = (C13887q1) C86312j.m106911c(C13887q1.class);
        String O5 = C66785b.f191882e.mo90662O5();
        C49098d51 d512 = cVar.f34065a;
        C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(d0Var.f34037b);
        if (gr02 != null) {
            hj12 = gr02.mo12861q3();
        }
        C89059e<C89132b.C89134c<C48722aj0>> i = q1Var.c90(O5, d512, 1, hj12).mo9225i();
        Context context2 = d0Var.f34037b;
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        i.mo11397F((MMActivity) context2).mo123420E(new C11675p0(e, d0Var, cVar));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$RecyclerAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
