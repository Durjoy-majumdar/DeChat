package cb3;

import android.text.Spanned;
import android.view.View;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import xa3.C102587c;
import xa3.C102593i;
import za3.C102988a;

/* renamed from: cb3.s */
public class C92409s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C92400k f264460d;

    public C92409s(C92400k kVar) {
        this.f264460d = kVar;
    }

    public void onClick(View view) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("NoteSelectManager", "select all");
        this.f264460d.mo126389p();
        if (!C92400k.f264411N) {
            Log.m105920e("NoteSelectManager", "select all: not init");
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int n = ((NoteEditorUI) this.f264460d.f264445v).f283238X0.mo126204n();
        int p = ((NoteEditorUI) this.f264460d.f264445v).f283238X0.mo126206p();
        C102587c k = ((NoteEditorUI) this.f264460d.f264445v).f283238X0.mo126201k(n);
        C102587c k2 = ((NoteEditorUI) this.f264460d.f264445v).f283238X0.mo126201k(p);
        if (k == null || k2 == null) {
            Log.m105920e("NoteSelectManager", "select all: item is null");
            this.f264460d.mo126392s();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (k2.mo142212c() == 1) {
            Spanned a = C102988a.m136184a(((C102593i) k2).f302126s);
            if (a == null) {
                Log.m105920e("NoteSelectManager", "select all: spanned is null");
                this.f264460d.mo126392s();
                C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            i = a.length();
        } else {
            i = 1;
        }
        this.f264460d.mo126376b();
        this.f264460d.mo126398y(n, 0, p, i);
        this.f264460d.mo126387n();
        this.f264460d.mo126389p();
        this.f264460d.mo126373I(true, 300);
        this.f264460d.mo126365A(false);
        C92400k kVar = this.f264460d;
        kVar.f264412A.postDelayed(new C92402l(kVar, false), 50);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
