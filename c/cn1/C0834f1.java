package cn1;

import an1.C0103p;
import android.content.Context;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import xm1.C15834h;

/* renamed from: cn1.f1 */
public final class C0834f1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f1965d;

    /* renamed from: e */
    public final /* synthetic */ C0827e1 f1966e;

    /* renamed from: f */
    public final /* synthetic */ C0103p f1967f;

    public C0834f1(C60905o oVar, C0827e1 e1Var, C0103p pVar) {
        this.f1965d = oVar;
        this.f1966e = e1Var;
        this.f1967f = pVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$checkMoreEntranceShow$moreEntranceClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Context context = this.f1965d.f173499A;
        MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
        if (mMActivity != null) {
            C0103p pVar = this.f1967f;
            C15834h hVar = (C15834h) C39818r.f106831a.mo62444c(mMActivity).mo75002a(C15834h.class);
            hVar.mo14507c3(0, hVar.getContext(), pVar.f545d.f130386p);
        }
        this.f1966e.mo756k(this.f1965d, this.f1967f.f545d.f130377d, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$checkMoreEntranceShow$moreEntranceClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
