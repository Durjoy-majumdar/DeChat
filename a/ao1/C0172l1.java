package ao1;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao1.C0157h1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50829ph1;
import te3.C51270sn1;

/* renamed from: ao1.l1 */
public final class C0172l1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C0157h1 f635a;

    public C0172l1(C0157h1 h1Var) {
        this.f635a = h1Var;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            if (!((C50829ph1) cVar.f256796d).f139766d.isEmpty()) {
                C0157h1 h1Var = this.f635a;
                h1Var.f601e = true;
                h1Var.f602f = ((C50829ph1) cVar.f256796d).f139766d.size();
                C0157h1 h1Var2 = this.f635a;
                LinkedList<C51270sn1> linkedList = ((C50829ph1) cVar.f256796d).f139766d;
                C87412m.m108593f(linkedList, "it.resp.usual_topics");
                h1Var2.f604h = linkedList;
                LinearLayout linearLayout = (LinearLayout) h1Var2.getActivity().findViewById(C0966R.C0970id.edm);
                h1Var2.f600d = linearLayout;
                if (linearLayout != null) {
                    linearLayout.setOnClickListener(C0161i1.f612d);
                }
                LinearLayout linearLayout2 = h1Var2.f600d;
                RecyclerView recyclerView = linearLayout2 != null ? (RecyclerView) linearLayout2.findViewById(C0966R.C0970id.edn) : null;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new LinearLayoutManager(h1Var2.getActivity(), 0, false));
                    recyclerView.mo17085h0(new C0163j1(h1Var2));
                    C0157h1.C0158a aVar = new C0157h1.C0158a(linkedList, new C0165k1(h1Var2));
                    h1Var2.f605i = aVar;
                    recyclerView.setAdapter(aVar);
                }
            }
            Log.m105924i("Finder.PostTopicUIC", "[requestPostPreData] usual_topics.size=" + ((C50829ph1) cVar.f256796d).f139766d.size());
        } else {
            Log.m105924i("Finder.PostTopicUIC", "[requestPostPreData] errType=" + cVar.f256793a + " errCode=" + cVar.f256794b + " errMsg=" + cVar.f256795c);
        }
        return C13598b0.f38549a;
    }
}
