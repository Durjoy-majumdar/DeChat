package ez2;

import android.view.View;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p773yy.C66710j;
import rx3.C13598b0;
import rz2.C48200b;
import rz2.C48201c;
import vz2.C78501d;

/* renamed from: ez2.e */
public final class C45725e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C45727g f123561d;

    /* renamed from: e */
    public final /* synthetic */ C45723c f123562e;

    public C45725e(C45727g gVar, C45723c cVar) {
        this.f123561d = gVar;
        this.f123562e = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<? super String, C13598b0> lVar = this.f123561d.f123566e;
        if (lVar != null) {
            lVar.invoke(C48200b.m53529b(this.f123562e.f123556d.f129772d.f129193b.get(0)));
            C48201c cVar = this.f123562e.f123556d.f129772d.f129193b.get(0);
            C78501d dVar = C78501d.f229945a;
            String str = cVar.field_IconID;
            C87412m.m108593f(str, "userItem.field_IconID");
            C78501d.m94807i(dVar, 8, str, this.f123562e.f123556d.f129772d.f129193b.size(), (String) null, (String) null, (String) null, 0, 0, 0, C66710j.C53637a.m60171a(cVar, false, 1, (Object) null).f147092i, Integer.valueOf(C66710j.C53637a.m60171a(cVar, false, 1, (Object) null).f147099s), (String) null, 2552, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("clickArrowListener");
        throw null;
    }
}
