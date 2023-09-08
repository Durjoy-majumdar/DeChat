package h21;

import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import e21.C75489r;
import hp3.C87581a;
import kg3.C76577a;
import ob0.C89132b;
import qo3.C101218e0;
import te3.C48745ap;

/* renamed from: h21.g0 */
public class C117025g0 implements C87581a<Object, C89132b.C89134c<C48745ap>> {

    /* renamed from: a */
    public final /* synthetic */ CollectMainUI f350682a;

    public C117025g0(CollectMainUI collectMainUI) {
        this.f350682a = collectMainUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (this.f350682a.isFinishing() || this.f350682a.isDestroyed()) {
            return null;
        }
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            CollectMainUI collectMainUI = this.f350682a;
            collectMainUI.f345621n1 = (C48745ap) cVar.f256796d;
            C101218e0 e0Var = collectMainUI.f345617k1;
            if (e0Var == null || !e0Var.mo140661h()) {
                C101218e0 e0Var2 = new C101218e0(collectMainUI, 1, 3, false);
                collectMainUI.f345617k1 = e0Var2;
                e0Var2.f296384g.setFocusable(false);
                C101218e0 e0Var3 = collectMainUI.f345617k1;
                C48745ap apVar = collectMainUI.f345621n1;
                e0Var3.mo140667n(apVar.f130704g.f354532d, apVar.f130705h.f354532d);
                TextView textView = new TextView(collectMainUI);
                textView.setPadding(C76577a.m92151b(collectMainUI, 24), C76577a.m92151b(collectMainUI, 40), C76577a.m92151b(collectMainUI, 24), C76577a.m92151b(collectMainUI, 24));
                textView.setTextSize(1, C76577a.m92165p(collectMainUI.getContext()) * 17.0f);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                textView.setTextColor(collectMainUI.getResources().getColor(C0966R.color.FG_0));
                textView.setText(collectMainUI.f345621n1.f130701d);
                collectMainUI.f345617k1.mo140673s(textView);
                RecyclerView recyclerView = new RecyclerView(collectMainUI, (AttributeSet) null);
                if (collectMainUI.f345619m1 == null) {
                    C75489r rVar = new C75489r(collectMainUI, collectMainUI.f345621n1.f130703f);
                    collectMainUI.f345619m1 = rVar;
                    rVar.f221853e = collectMainUI.f345621n1.f130702e;
                    rVar.f221856h = collectMainUI;
                }
                recyclerView.setFocusable(false);
                recyclerView.setAdapter(collectMainUI.f345619m1);
                recyclerView.setLayoutManager(new LinearLayoutManager(collectMainUI));
                recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                collectMainUI.f345617k1.mo140663j(recyclerView);
                collectMainUI.f345619m1.f221855g = new C117036q(collectMainUI);
                C117040r rVar2 = new C117040r(collectMainUI);
                C117043s sVar = new C117043s(collectMainUI);
                collectMainUI.f345617k1.mo140656b(false);
                C101218e0 e0Var4 = collectMainUI.f345617k1;
                e0Var4.f296373D = rVar2;
                e0Var4.f296374E = sVar;
                e0Var4.mo140655A();
                collectMainUI.f345634t1 = collectMainUI.f345617k1.f296384g.getMeasuredHeight();
            }
        }
        return Boolean.TRUE;
    }
}
