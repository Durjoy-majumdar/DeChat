package cb3;

import ab3.C91983a;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96732h;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: cb3.e */
public class C92394e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C92400k f264404d;

    public C92394e(C92400k kVar) {
        this.f264404d = kVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("NoteSelectManager", "delete");
        if (C92400k.f264411N) {
            C92400k kVar = this.f264404d;
            if (kVar.f264424a) {
                if (C92400k.m116190a(kVar)) {
                    C91983a aVar = this.f264404d.f264445v;
                    if (aVar != null) {
                        ((NoteEditorUI) aVar).mo134933b8();
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C92400k kVar2 = this.f264404d;
                C91983a aVar2 = kVar2.f264445v;
                if (aVar2 != null) {
                    NoteEditorUI noteEditorUI = (NoteEditorUI) aVar2;
                    C76879j.m92707A(noteEditorUI, noteEditorUI.getString(C0966R.string.h_f), "", noteEditorUI.getString(C0966R.string.h_e), noteEditorUI.getString(C0966R.string.h_d), new C96732h(noteEditorUI), (DialogInterface.OnClickListener) null);
                } else {
                    kVar2.mo126378d();
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        Log.m105920e("NoteSelectManager", "delete: not init or not editable");
        this.f264404d.mo126389p();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
