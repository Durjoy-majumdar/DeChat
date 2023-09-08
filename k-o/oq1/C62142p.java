package oq1;

import android.view.View;
import android.widget.TextView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import lq1.C61364h;

/* renamed from: oq1.p */
public final class C62142p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C62137n f176693d;

    /* renamed from: e */
    public final /* synthetic */ TextView f176694e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f176695f;

    public C62142p(C62137n nVar, TextView textView, C60905o oVar) {
        this.f176693d = nVar;
        this.f176694e = textView;
        this.f176695f = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$onBindViewHolder$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C61364h hVar = this.f176693d.f176682e;
        TextView textView = this.f176694e;
        C87412m.m108593f(textView, "commentFailTV");
        hVar.mo79233f(textView, this.f176695f.mo17363j());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$onBindViewHolder$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
