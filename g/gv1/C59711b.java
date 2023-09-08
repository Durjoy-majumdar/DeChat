package gv1;

import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import ev1.C58838a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import rx3.C36570n;

/* renamed from: gv1.b */
public final class C59711b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59706a f170574d;

    public C59711b(C59706a aVar) {
        this.f170574d = aVar;
    }

    public final void run() {
        RecyclerView.C16613e adapter;
        C59706a aVar = this.f170574d;
        if (aVar.f170566f) {
            aVar.f170566f = false;
            View view = aVar.f170565e;
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/forcenotify/ui/BaseWindow$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/forcenotify/ui/BaseWindow$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            try {
                ((WindowManager) ((C36570n) this.f170574d.f170569i).getValue()).removeView(this.f170574d.f170565e);
            } catch (Exception unused) {
                this.f170574d.getClass();
                Log.m105920e("ForceNotify.BaseWindow", "detach from window failed");
            }
            C59712c cVar = (C59712c) this.f170574d;
            cVar.mo84693k().removeCallbacksAndMessages((Object) null);
            cVar.mo84702s();
            ArrayList arrayList = new ArrayList(cVar.f170589q);
            cVar.f170589q.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C58838a) it.next()).mo84044q();
            }
            RecyclerView recyclerView = cVar.f170586n;
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                adapter.notifyDataSetChanged();
            }
            cVar.f170586n = null;
            this.f170574d.f170565e = null;
        }
    }
}
