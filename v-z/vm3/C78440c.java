package vm3;

import bi3.C0289a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.util.WXWebReporter;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lv1.C99672i;
import lv1.C99681n;
import om3.C77020b;
import p749xh.C53335e1;
import qm3.C77374a;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import zb2.C79317n;

/* renamed from: vm3.c */
public final class C78440c extends C87413o implements C32226l<List<? extends String>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C78436b f229817d;

    /* renamed from: e */
    public final /* synthetic */ C78441d f229818e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78440c(C78436b bVar, C78441d dVar) {
        super(1);
        this.f229817d = bVar;
        this.f229818e = dVar;
    }

    public Object invoke(Object obj) {
        List<String> list = (List) obj;
        C87412m.m108594g(list, LocaleUtil.ITALIAN);
        Log.m105924i("MicroMsg.SelectContactRecommendUIC", "commonChatroomSearchResultListener: resultSize: " + list.size());
        WxRecyclerView g = this.f229817d.mo108388j3().mo109049g();
        C87412m.m108593f(g, "uiBinding.selectContactRv");
        MvvmList a = C79317n.m96015a(g);
        if (a != null) {
            a.mo129614r(this.f229818e);
        }
        List<C72996z1> c = C0289a.f857a.mo338c(list);
        SelectSql build = C53335e1.f149283M.selectAll().where(C53335e1.f149285P.inString(list)).build();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (C44661m1 m1Var : build.multiQuery(C86709a0.m107535s().f251811i, C44661m1.class)) {
            String str = m1Var.field_chatroomname;
            C87412m.m108593f(str, "chatRoomMember.field_chatroomname");
            hashMap.put(str, m1Var);
        }
        for (String str2 : list) {
            C44661m1 m1Var2 = (C44661m1) hashMap.get(str2);
            if (m1Var2 != null) {
                arrayList.add(m1Var2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        C78436b bVar = this.f229817d;
        Iterator it = ((ArrayList) c).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C72996z1 z1Var = (C72996z1) next;
                C44661m1 m1Var3 = (C44661m1) C110818d0.m150917O(arrayList, i);
                if (m1Var3 != null) {
                    StringBuilder sb = new StringBuilder();
                    String nickname = z1Var.getNickname();
                    if (nickname == null) {
                        nickname = "";
                    }
                    sb.append(nickname);
                    sb.append(m1Var3.field_memberlist);
                    if (hashSet.add(sb.toString())) {
                        C77374a aVar = r8;
                        C77374a aVar2 = new C77374a((C99681n) null, (C99672i) null, 0, 0, i, 0, (String) null, false, WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC, (C8480h) null);
                        String username = z1Var.getUsername();
                        C87412m.m108593f(username, "contact.username");
                        C77020b a2 = C77374a.f225586i.mo107495a(bVar.getActivity(), username + '-' + 1 + '-' + i, z1Var, 1, aVar);
                        if (aVar.f225591e == 0) {
                            a2.f225012n = true;
                            String string = bVar.getActivity().getString(C0966R.string.f361257ij3);
                            C87412m.m108593f(string, "activity.getString(com.t…mmend_group_catalog_name)");
                            a2.f225013o = string;
                        }
                        arrayList2.add(a2);
                    }
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        WxRecyclerView g2 = this.f229817d.mo108388j3().mo109049g();
        C87412m.m108593f(g2, "uiBinding.selectContactRv");
        MvvmList a3 = C79317n.m96015a(g2);
        if (a3 != null) {
            a3.mo129607j(arrayList2, false);
        }
        return C13598b0.f38549a;
    }
}
