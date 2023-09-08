package jz2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qy2.C77452i;
import rz2.C48201c;
import vz2.C78501d;

/* renamed from: jz2.c */
public final class C76472c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77452i f223842d;

    /* renamed from: e */
    public final /* synthetic */ C76452b f223843e;

    /* renamed from: f */
    public final /* synthetic */ C48201c f223844f;

    public C76472c(C77452i iVar, C76452b bVar, C48201c cVar) {
        this.f223842d = iVar;
        this.f223843e = bVar;
        this.f223844f = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleAuthor$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77452i iVar = this.f223842d;
        if (iVar != null) {
            iVar.mo84141b(this.f223843e.mo106716y());
        }
        C78501d.m94806h(C78501d.f229945a, this.f223843e.mo106716y(), 61, (String) null, this.f223844f, 0, 0, 0, 0, (Integer) null, 500, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleAuthor$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
