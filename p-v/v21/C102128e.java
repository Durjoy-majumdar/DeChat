package v21;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.C93074h;
import com.tencent.p014mm.plugin.component.editor.EditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import t21.C101712a;

/* renamed from: v21.e */
public class C102128e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C102132i f300739d;

    public C102128e(C102132i iVar) {
        this.f300739d = iVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.Editor.EditorSelectManager", "delete");
        if (C102132i.f300744K) {
            C102132i iVar = this.f300739d;
            if (iVar.f300754a) {
                if (C102132i.m134537a(iVar)) {
                    C101712a aVar = this.f300739d.f300775v;
                    if (aVar != null) {
                        ((EditorUI) aVar).mo127488W7();
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C102132i iVar2 = this.f300739d;
                C101712a aVar2 = iVar2.f300775v;
                if (aVar2 != null) {
                    EditorUI editorUI = (EditorUI) aVar2;
                    C76879j.m92707A(editorUI, editorUI.getString(C0966R.string.by9), "", editorUI.getString(C0966R.string.by8), editorUI.getString(C0966R.string.by7), new C93074h(editorUI), (DialogInterface.OnClickListener) null);
                } else {
                    iVar2.mo141656d();
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        Log.m105920e("MicroMsg.Editor.EditorSelectManager", "delete: not init or not editable");
        this.f300739d.mo141667p();
        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
