package h21;

import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import java.util.Iterator;
import nj3.C11182m0;
import nj3.C76874e0;
import te3.C118479xj3;
import te3.C51549ui;

/* renamed from: h21.d0 */
public class C117015d0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C51549ui f350663d;

    public C117015d0(CollectMainUI collectMainUI, C51549ui uiVar) {
        this.f350663d = uiVar;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        String str;
        Iterator<C118479xj3> it = this.f350663d.f142863e.iterator();
        int i = 0;
        while (it.hasNext()) {
            C118479xj3 next = it.next();
            if (!(next == null || (str = next.f354532d) == null)) {
                e0Var.mo107142f(i, str);
                i++;
            }
        }
    }
}
