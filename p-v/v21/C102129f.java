package v21;

import android.text.SpannableStringBuilder;
import android.view.View;
import com.tencent.p014mm.plugin.component.editor.EditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import p21.C100616a;
import p21.C100628m;
import s21.C101498c;
import t21.C101712a;
import u21.C101940b;

/* renamed from: v21.f */
public class C102129f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C102132i f300740d;

    public C102129f(C102132i iVar) {
        this.f300740d = iVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.Editor.EditorSelectManager", "cut");
        if (C102132i.f300744K) {
            C102132i iVar = this.f300740d;
            if (iVar.f300754a) {
                if (C102132i.m134537a(iVar)) {
                    C101712a aVar = this.f300740d.f300775v;
                    if (aVar != null) {
                        ((EditorUI) aVar).mo127488W7();
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                this.f300740d.mo141667p();
                int m = this.f300740d.mo141664m();
                if (m == 2) {
                    SpannableStringBuilder f = this.f300740d.mo141658f(true, (ArrayList<C100616a>) null, "");
                    if (Util.isNullOrNil((CharSequence) f)) {
                        Log.m105920e("MicroMsg.Editor.EditorSelectManager", "cut: selectedSpan is null or empty");
                        this.f300740d.mo141669r();
                        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    C100628m mVar = new C100628m();
                    mVar.f294819s = C101498c.m133261a(f);
                    mVar.f294797c = -1;
                    mVar.f294796b = false;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(mVar);
                    C101940b.m134172e(MMApplicationContext.getContext(), arrayList2);
                } else if (m == 3) {
                    ArrayList<C100616a> e = this.f300740d.mo141657e(true, (ArrayList<C100616a>) null, "");
                    if (e == null || e.size() <= 0) {
                        Log.m105920e("MicroMsg.Editor.EditorSelectManager", "cut: dataList is null or empty");
                        this.f300740d.mo141669r();
                    } else {
                        C101940b.m134172e(MMApplicationContext.getContext(), e);
                    }
                } else {
                    Log.m105920e("MicroMsg.Editor.EditorSelectManager", "cut: not in select");
                    this.f300740d.mo141669r();
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        Log.m105920e("MicroMsg.Editor.EditorSelectManager", "cut: not init or not editable");
        this.f300740d.mo141667p();
        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
