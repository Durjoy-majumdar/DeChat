package oz2;

import android.os.ResultReceiver;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import qy2.C77446d0;
import qy2.C77459z;
import vz2.C78501d;

/* renamed from: oz2.b */
public final class C77053b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f225096d;

    public C77053b(C60905o oVar) {
        this.f225096d = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/model/feed/CardFeedBottomItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77459z zVar = new C77459z();
        zVar.f229404i = 14;
        C77446d0.f225875a.mo107615b(this.f225096d.f173499A, zVar, (ResultReceiver) null);
        C78501d.m94805g(C78501d.f229945a, 34, (String) null, (String) null, 0, (String) null, 0, 62, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/model/feed/CardFeedBottomItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
