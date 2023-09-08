package l23;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import l23.C99310q;

/* renamed from: l23.v */
public final class C99323v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C99310q f291239d;

    public C99323v(C99310q qVar) {
        this.f291239d = qVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/MagicTimeEditPlugin$checkInit$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C99310q.C99311a aVar = this.f291239d.f291225s;
        if (aVar != null) {
            aVar.mo138697a();
        }
        this.f291239d.f291213d.setShow(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/MagicTimeEditPlugin$checkInit$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
