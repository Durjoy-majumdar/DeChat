package oq1;

import android.view.View;
import er1.C58784w3;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import sq1.C64151e;

/* renamed from: oq1.h */
public final class C62127h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f176658d;

    /* renamed from: e */
    public final /* synthetic */ String f176659e;

    /* renamed from: f */
    public final /* synthetic */ C64151e f176660f;

    public C62127h(C60905o oVar, String str, C64151e eVar) {
        this.f176658d = oVar;
        this.f176659e = str;
        this.f176660f = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C58784w3.f168295a.mo83944k1(this.f176658d, this.f176659e, this.f176660f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
