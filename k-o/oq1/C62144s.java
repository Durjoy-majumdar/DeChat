package oq1;

import android.view.View;
import er1.C58784w3;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import sq1.C64151e;

/* renamed from: oq1.s */
public final class C62144s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f176699d;

    /* renamed from: e */
    public final /* synthetic */ String f176700e;

    /* renamed from: f */
    public final /* synthetic */ C64151e f176701f;

    public C62144s(C60905o oVar, String str, C64151e eVar) {
        this.f176699d = oVar;
        this.f176700e = str;
        this.f176701f = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C58784w3.f168295a.mo83944k1(this.f176699d, this.f176700e, this.f176701f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
