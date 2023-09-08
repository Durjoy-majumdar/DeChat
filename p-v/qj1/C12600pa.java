package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import tf0.C13883o1;

/* renamed from: qj1.pa */
public final class C12600pa implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12389fa f36131d;

    public C12600pa(C12389fa faVar) {
        this.f36131d = faVar;
    }

    public final void onClick(View view) {
        Class cls = C54991o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin$initListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderObject finderObject = ((C54991o) ((C54991o) this.f36131d.mo87696x0(cls)).business(cls)).f154341n;
        if (finderObject != null) {
            C12389fa faVar = this.f36131d;
            ((C54991o) ((C54991o) faVar.mo87696x0(cls)).business(cls)).f154350p0 = false;
            C7335d c = C86312j.m106911c(C13883o1.class);
            C87412m.m108593f(c, "getService(IActivityRouter::class.java)");
            Context context = faVar.mo14484z0().getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C13883o1.C13884a.m13254f((C13883o1) c, (MMActivity) context, FinderItem.Companion.mo79056a(finderObject, 16384), (Bundle) null, 0, (C32226l) null, 28, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin$initListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
