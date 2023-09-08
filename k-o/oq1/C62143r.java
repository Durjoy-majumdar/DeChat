package oq1;

import android.view.View;
import er1.C58784w3;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import sq1.C64151e;

/* renamed from: oq1.r */
public final class C62143r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f176696d;

    /* renamed from: e */
    public final /* synthetic */ String f176697e;

    /* renamed from: f */
    public final /* synthetic */ C64151e f176698f;

    public C62143r(C60905o oVar, String str, C64151e eVar) {
        this.f176696d = oVar;
        this.f176697e = str;
        this.f176698f = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C58784w3.f168295a.mo83944k1(this.f176696d, this.f176697e, this.f176698f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
