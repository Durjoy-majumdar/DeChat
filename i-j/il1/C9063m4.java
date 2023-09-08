package il1;

import ak1.C0073g0;
import ak1.C54108o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import hp3.C87581a;
import ht1.C8777j5;
import java.util.ArrayList;
import java.util.LinkedList;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C89132b;
import org.json.JSONObject;
import qk1.C12794c1;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C50542nh0;
import te3.C51778w31;

/* renamed from: il1.m4 */
public final class C9063m4<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C9028j4 f28601a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList<String> f28602b;

    /* renamed from: c */
    public final /* synthetic */ JSONObject f28603c;

    public C9063m4(C9028j4 j4Var, ArrayList<String> arrayList, JSONObject jSONObject) {
        this.f28601a = j4Var;
        this.f28602b = arrayList;
        this.f28603c = jSONObject;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        LinkedList<C50542nh0> linkedList = ((C51778w31) cVar.f256796d).f143843d;
        C87412m.m108593f(linkedList, "it.resp.ret_list");
        C50542nh0 nh02 = (C50542nh0) C110818d0.m150916N(linkedList);
        String str = nh02 != null ? nh02.f138604f : null;
        if (cVar.f256793a != 0 || cVar.f256794b != 0) {
            Log.m105924i("FinderLivecommentListWidget", "errType = " + cVar.f256793a + ", errCode = " + cVar.f256794b + ", errMsg = " + cVar.f256795c);
            C76912y0.m92767f(this.f28601a.f28507i.getContext(), this.f28601a.f28507i.getContext().getString(C0966R.string.del));
        } else if (str != null) {
            C9028j4 j4Var = this.f28601a;
            j4Var.getClass();
            C61926c.m72668M(new C9074n4(str, j4Var));
            C12794c1 c1Var = this.f28601a.f28513r;
            c1Var.f36620e.clear();
            int i = c1Var.f36621f - 1;
            if (i >= 0) {
                int i2 = 0;
                while (true) {
                    c1Var.f36620e.add("");
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            c1Var.notifyDataSetChanged();
        } else {
            this.f28601a.mo9845c(this.f28602b);
            this.f28603c.put("anchor_status", "2");
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_FAST_COMMENT, this.f28603c.toString(), (String) null, 4, (Object) null);
            C9028j4 j4Var2 = this.f28601a;
            if (j4Var2.f28512q) {
                C76912y0.m92768g(j4Var2.f28507i.getContext(), this.f28601a.f28507i.getContext().getString(C0966R.string.dej));
            } else {
                C76912y0.m92768g(j4Var2.f28507i.getContext(), this.f28601a.f28507i.getContext().getString(C0966R.string.dei));
            }
            this.f28601a.mo9844b();
        }
        return C13598b0.f38549a;
    }
}
