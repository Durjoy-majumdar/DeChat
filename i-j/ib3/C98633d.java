package ib3;

import android.view.View;
import android.widget.TextView;
import bb3.C92221d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import xa3.C102587c;

/* renamed from: ib3.d */
public class C98633d extends C98628a {

    /* renamed from: ib3.d$a */
    public class C98634a implements View.OnClickListener {
        public C98634a(C98633d dVar) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteComplaintItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            NoteEditorUI.m124142O7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteComplaintItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C98633d(View view, C96679b bVar, C92221d dVar) {
        super(view, bVar, dVar);
        ((TextView) view.findViewById(C0966R.C0970id.hig)).setOnClickListener(new C98634a(this));
    }

    /* renamed from: y */
    public int mo138058y() {
        return 30;
    }

    /* renamed from: z */
    public void mo138059z(C102587c cVar, int i, int i2) {
        Log.m105924i("MicroMsg.Note.NoteTextItemHolder", "TextItemHolder position is " + mo17364k());
    }
}
