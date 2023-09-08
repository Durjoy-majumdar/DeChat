package pf2;

import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import ex0.C45696d;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import sj3.C63941p;
import te3.C52257zg;

/* renamed from: pf2.t */
public final class C47496t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C52257zg f127427d;

    /* renamed from: e */
    public final /* synthetic */ C47499w f127428e;

    public C47496t(C52257zg zgVar, C47499w wVar) {
        this.f127427d = zgVar;
        this.f127428e = wVar;
    }

    public final void onClick(View view) {
        Class cls = C45696d.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder$bindClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C63941p pVar = C63941p.f181254a;
        C52257zg zgVar = this.f127427d;
        FinderObject c = pVar.mo88705c(zgVar.f145868f, zgVar.f145867e);
        C52257zg zgVar2 = this.f127427d;
        pVar.mo88708f(14, zgVar2.f145868f, c, zgVar2.f145866d, this.f127428e.f127316z.f126807f.getUsername());
        int gg02 = ((C45696d) C86709a0.m107533q(cls)).gg0(this.f127428e.f127316z.f126807f.getUsername());
        C47499w wVar = this.f127428e;
        ((C45696d) C86709a0.m107533q(cls)).mo70995gj(wVar.f127443D, wVar.f127316z.f126807f.getUsername(), this.f127427d.f145868f, 14, gg02);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder$bindClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
