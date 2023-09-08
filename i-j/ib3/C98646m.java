package ib3;

import android.view.View;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import gy3.C87412m;
import ib3.C98640j;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ib3.m */
public final class C98646m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C98640j.C98642b f289229d;

    public C98646m(C98640j.C98642b bVar) {
        this.f289229d = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder$clear$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WXRTEditText wXRTEditText = this.f289229d.f289218f;
        if (wXRTEditText != null) {
            wXRTEditText.mo134853A(0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder$clear$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("btnPre");
        throw null;
    }
}
