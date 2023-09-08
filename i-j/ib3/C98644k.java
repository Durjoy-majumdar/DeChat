package ib3;

import ab3.C91983a;
import android.view.View;
import com.tencent.p014mm.autogen.events.NotifyWNNoteOperationEvent;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96728e0;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import wa3.C102364c;
import xa3.C102587c;
import xa3.C102599o;

/* renamed from: ib3.k */
public final class C98644k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C98640j f289223d;

    /* renamed from: e */
    public final /* synthetic */ int f289224e;

    /* renamed from: f */
    public final /* synthetic */ int f289225f;

    /* renamed from: g */
    public final /* synthetic */ C102587c f289226g;

    public C98644k(C98640j jVar, int i, int i2, C102587c cVar) {
        this.f289223d = jVar;
        this.f289224e = i;
        this.f289225f = i2;
        this.f289226g = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder$bindItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C96679b bVar = this.f289223d.f289192z;
        if (bVar.f283197m == 2) {
            NoteEditorUI noteEditorUI = (NoteEditorUI) bVar.f283188d;
            noteEditorUI.getClass();
            C96728e0 e0Var = noteEditorUI.f283263q;
            if (e0Var != null) {
                e0Var.mo134989c((C91983a) null);
            }
            this.f289223d.f289192z.mo134903a();
        }
        C102587c cVar = this.f289226g;
        C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.wenote.model.datamodel.WNNoteFavItemBase");
        Log.m105925i("NoteMediaGroupItemHolder", "click item, pos:%s offset:%s type:%d id:%s", Integer.valueOf(this.f289224e), Integer.valueOf(this.f289225f), Integer.valueOf(((C102599o) this.f289226g).f302099p), ((C102599o) cVar).f302098o);
        NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new NotifyWNNoteOperationEvent();
        NotifyWNNoteOperationEvent.C92535a aVar = notifyWNNoteOperationEvent.f264942d;
        C102587c cVar2 = this.f289226g;
        C87412m.m108592e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.wenote.model.datamodel.WNNoteFavItemBase");
        aVar.f264945b = ((C102599o) cVar2).f302098o;
        notifyWNNoteOperationEvent.f264942d.f264947d = view.getContext();
        notifyWNNoteOperationEvent.f264942d.f264944a = 1;
        C102364c.vx0().mo137946Rd().mo141953o(notifyWNNoteOperationEvent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder$bindItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
