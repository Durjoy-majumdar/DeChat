package ib3;

import ab3.C91983a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.autogen.events.NotifyWNNoteOperationEvent;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96728e0;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import wa3.C102364c;
import xa3.C102599o;

public class o$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C98648o f289253d;

    public o$$e(C98648o oVar) {
        this.f289253d = oVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C96679b bVar = this.f289253d.f289192z;
        if (bVar.f283197m == 2) {
            NoteEditorUI noteEditorUI = (NoteEditorUI) bVar.f283188d;
            noteEditorUI.getClass();
            C96728e0 e0Var = noteEditorUI.f283263q;
            if (e0Var != null) {
                e0Var.mo134989c((C91983a) null);
            }
            this.f289253d.f289192z.mo134903a();
        }
        int j = ((RecyclerView.C16631z) view.getTag()).mo17363j();
        NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new NotifyWNNoteOperationEvent();
        if (this.f289253d.f289191A.mo126201k(j) == null) {
            Log.m105921e("Micromsg.NoteOtherItemHolder", "click not response, null == NoteDataManager.getMgr().get(position),position is %d,datalist size = %d", Integer.valueOf(j), Integer.valueOf(this.f289253d.f289191A.mo126186F()));
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (C102364c.vx0().mo137946Rd() == null) {
            Log.m105920e("Micromsg.NoteOtherItemHolder", "getWnNoteBase is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            Log.m105925i("Micromsg.NoteOtherItemHolder", "click item, type is %d", Integer.valueOf(this.f289253d.f289191A.mo126201k(j).mo142212c()));
            notifyWNNoteOperationEvent.f264942d.f264945b = ((C102599o) this.f289253d.f289191A.mo126201k(j)).f302098o;
            notifyWNNoteOperationEvent.f264942d.f264947d = view.getContext();
            notifyWNNoteOperationEvent.f264942d.f264944a = 1;
            C102364c.vx0().mo137946Rd().mo141953o(notifyWNNoteOperationEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
