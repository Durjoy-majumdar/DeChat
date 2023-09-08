package cb3;

import ab3.C91983a;
import android.text.SpannableStringBuilder;
import android.view.View;
import bb3.C92231j;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import xa3.C102587c;
import xa3.C102593i;
import za3.C102990c;

/* renamed from: cb3.g */
public class C92396g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C92400k f264406d;

    public C92396g(C92400k kVar) {
        this.f264406d = kVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("NoteSelectManager", "copy");
        if (!C92400k.f264411N) {
            Log.m105920e("NoteSelectManager", "copy: not init");
            this.f264406d.mo126389p();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (C92400k.m116190a(this.f264406d)) {
            C91983a aVar = this.f264406d.f264445v;
            if (aVar != null) {
                ((NoteEditorUI) aVar).mo134933b8();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            this.f264406d.mo126389p();
            int m = this.f264406d.mo126386m();
            if (m == 2) {
                SpannableStringBuilder f = this.f264406d.mo126380f(false, (ArrayList<C102587c>) null, "");
                if (Util.isNullOrNil((CharSequence) f)) {
                    Log.m105920e("NoteSelectManager", "copy: selectedSpan is null or empty");
                    this.f264406d.mo126392s();
                    C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C102593i iVar = new C102593i();
                iVar.f302126s = C102990c.m136185a(f);
                iVar.f302072c = -1;
                iVar.f302071b = false;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(iVar);
                C92231j.m115957e(MMApplicationContext.getContext(), arrayList2);
            } else if (m == 3) {
                ArrayList<C102587c> e = this.f264406d.mo126379e(false, (ArrayList<C102587c>) null, "");
                if (e == null || e.size() <= 0) {
                    Log.m105920e("NoteSelectManager", "copy: dataList is null or empty");
                    this.f264406d.mo126392s();
                } else {
                    C92231j.m115957e(MMApplicationContext.getContext(), e);
                }
            } else {
                Log.m105920e("NoteSelectManager", "copy: not in select");
                this.f264406d.mo126392s();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
