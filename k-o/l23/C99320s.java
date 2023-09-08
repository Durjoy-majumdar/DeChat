package l23;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import l23.C99310q;

/* renamed from: l23.s */
public final class C99320s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C99310q f291236d;

    public C99320s(C99310q qVar) {
        this.f291236d = qVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/MagicTimeEditPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C99310q qVar = this.f291236d;
        long j = qVar.f291221o;
        qVar.f291223q = j;
        long j2 = qVar.f291222p;
        qVar.f291224r = j2;
        C99310q.C99311a aVar = qVar.f291225s;
        if (aVar != null) {
            aVar.mo138698b(j, j2);
        }
        C99310q.C99311a aVar2 = qVar.f291225s;
        if (aVar2 != null) {
            aVar2.onFinish();
        }
        this.f291236d.f291213d.setShow(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/MagicTimeEditPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
