package ve1;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import mo1.C11025q;
import o40.C61926c;
import up1.C65418l;
import up1.C65420m;

/* renamed from: ve1.m */
public final class C65623m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C65628n f188828d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f188829e;

    /* renamed from: f */
    public final /* synthetic */ C65418l f188830f;

    public C65623m(C65628n nVar, C60905o oVar, C65418l lVar) {
        this.f188828d = nVar;
        this.f188829e = oVar;
        this.f188830f = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert$updateProgress$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C65628n nVar = this.f188828d;
        C60905o oVar = this.f188829e;
        C65418l lVar = this.f188830f;
        lVar.getClass();
        nVar.getClass();
        long j = lVar.field_localId;
        C65420m.f188268a.mo89519a(j);
        String p = C61926c.m72691p(j);
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C39622i0 a = rVar.mo62443b(context).mo75002a(C11025q.class);
        C87412m.m108593f(a, "UICProvider.of(holder.co…rofileEduUIC::class.java)");
        C11025q.m10965k3((C11025q) a, "draftdelete", 1, p, 0, (String) null, 24, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert$updateProgress$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
