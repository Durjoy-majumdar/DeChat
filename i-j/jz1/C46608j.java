package jz1;

import android.view.View;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import cz1.C45230i;
import cz1.C7143c;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import sw1.C48478n;
import wy1.C53224d;

/* renamed from: jz1.j */
public final class C46608j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7143c f125525d;

    /* renamed from: e */
    public final /* synthetic */ C46612n f125526e;

    /* renamed from: f */
    public final /* synthetic */ int f125527f;

    /* renamed from: g */
    public final /* synthetic */ View f125528g;

    public C46608j(C7143c cVar, C46612n nVar, int i, View view) {
        this.f125525d = cVar;
        this.f125526e = nVar;
        this.f125527f = i;
        this.f125528g = view;
    }

    public final void onClick(View view) {
        Class cls = C53224d.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$bindHistoryConversation$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7143c cVar = this.f125525d;
        if (cVar.field_unReadCount != Integer.MAX_VALUE) {
            cVar.field_unReadCount = Integer.MAX_VALUE;
            C45230i zx02 = ((C53224d) C86312j.m106911c(cls)).zx0();
            C7143c cVar2 = this.f125525d;
            zx02.update(cVar2.systemRowid, cVar2, false);
            ((C53224d) C86312j.m106911c(cls)).zx0().doNotify(MStorageEventData.EventType.SINGLE, 4, this.f125525d);
        }
        C46612n.m51918a(this.f125526e, this.f125525d, 7, this.f125527f);
        ((C48478n) C86312j.m106911c(C48478n.class)).ew0(this.f125528g.getContext());
        C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$bindHistoryConversation$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
