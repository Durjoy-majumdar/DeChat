package pf2;

import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import ex0.C45696d;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import sj3.C63941p;
import te3.C52257zg;

/* renamed from: pf2.j */
public final class C47485j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C52257zg f127378d;

    /* renamed from: e */
    public final /* synthetic */ C47489n f127379e;

    public C47485j(C52257zg zgVar, C47489n nVar) {
        this.f127378d = zgVar;
        this.f127379e = nVar;
    }

    public final void onClick(View view) {
        Class cls = C45696d.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder$bindClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C63941p pVar = C63941p.f181254a;
        C52257zg zgVar = this.f127378d;
        FinderObject c = pVar.mo88705c(zgVar.f145868f, zgVar.f145867e);
        C52257zg zgVar2 = this.f127378d;
        pVar.mo88708f(14, zgVar2.f145868f, c, zgVar2.f145866d, this.f127379e.f127399z.f126807f.getUsername());
        int gg02 = ((C45696d) C86709a0.m107533q(cls)).gg0(this.f127379e.f127399z.f126807f.getUsername());
        C47489n nVar = this.f127379e;
        ((C45696d) C86709a0.m107533q(cls)).mo70995gj(nVar.f127395B, nVar.f127399z.f126807f.getUsername(), this.f127378d.f145868f, 14, gg02);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder$bindClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
