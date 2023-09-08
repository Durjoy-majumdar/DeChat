package am1;

import cm1.C55011a;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import di3.C86312j;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C46524k;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import on1.C11548q;
import p749xh.C66274t3;
import p749xh.C66276va;
import rx3.C13598b0;
import te3.C49686hc1;
import te3.C50128kg0;
import te3.C64257bc1;

/* renamed from: am1.b */
public final class C54137b {

    /* renamed from: a */
    public final int f152051a;

    /* renamed from: b */
    public final C11548q<C55011a> f152052b;

    /* renamed from: c */
    public final FinderNotifyContractNew.NotifyViewCallback f152053c;

    /* renamed from: am1.b$a */
    public static final class C54138a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ ArrayList<C55011a> f152054a;

        /* renamed from: b */
        public final /* synthetic */ C54137b f152055b;

        public C54138a(ArrayList<C55011a> arrayList, C54137b bVar) {
            this.f152054a = arrayList;
            this.f152055b = bVar;
        }

        public Object call(Object obj) {
            C49686hc1 hc12;
            char c;
            T t;
            boolean z;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            Log.m105924i("CgiFinderBatchGetMentionInfo", "requestDiffData: " + i + ", " + i2);
            if (i == 0 && i2 == 0 && (hc12 = ((C50128kg0) cVar.f256796d).f136781d) != null) {
                ArrayList<C55011a> arrayList = this.f152054a;
                C54137b bVar = this.f152055b;
                Log.m105924i("CgiFinderBatchGetMentionInfo", "FinderMentionList size " + hc12.f134566d.size());
                LinkedList<C64257bc1> linkedList = hc12.f134566d;
                C87412m.m108593f(linkedList, "mentionList.mentions");
                if (!linkedList.isEmpty()) {
                    LinkedList<C64257bc1> linkedList2 = hc12.f134566d;
                    C87412m.m108593f(linkedList2, "mentionList.mentions");
                    for (C64257bc1 bc12 : linkedList2) {
                        Iterator<T> it = arrayList.iterator();
                        while (true) {
                            c = 0;
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            if (bc12.f182258P == ((C55011a) t).f154465d.field_svrMentionId) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        C55011a aVar = (C55011a) t;
                        if (aVar != null) {
                            C66276va vaVar = aVar.f154465d;
                            vaVar.field_followFlag = bc12.f182259Q;
                            int i3 = bVar.f152051a;
                            MAutoStorage<C66274t3> Ix0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Ix0(i3 != 1 ? i3 != 2 ? 0 : 1 : 2);
                            if (i3 == 1) {
                                c = 2;
                            } else if (i3 == 2) {
                                c = 1;
                            }
                            int i4 = C66274t3.f190671z1;
                            String str = c == 1 ? "WxIdentityMsg" : "FinderIdentityMsg";
                            String str2 = "UPDATE " + str + " SET followFlag=" + vaVar.field_followFlag + " WHERE id=" + vaVar.field_id;
                            Log.m105924i("Finder.FinderMentionLogic", "updateMentionFollowFlag sql:" + str2 + ", success:" + Ix0.execSQL(str, str2) + ", flag:" + vaVar.field_followFlag);
                        }
                    }
                    C61926c.m72668M(new C54136a(bVar));
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C54137b(int i, C11548q<C55011a> qVar, FinderNotifyContractNew.NotifyViewCallback notifyViewCallback) {
        C87412m.m108594g(qVar, "loader");
        C87412m.m108594g(notifyViewCallback, "viewCallback");
        this.f152051a = i;
        this.f152052b = qVar;
        this.f152053c = notifyViewCallback;
    }

    /* renamed from: a */
    public final void mo74961a(List<? extends C55011a> list) {
        C87412m.m108594g(list, "data");
        LinkedList linkedList = new LinkedList();
        for (C55011a aVar : list) {
            linkedList.add(Long.valueOf(aVar.f154465d.field_svrMentionId));
        }
        ArrayList arrayList = new ArrayList(this.f152052b.f33886d);
        C89059e i = new C46524k(linkedList).mo9225i();
        i.mo11397F(this.f152053c.getActivity());
        i.mo123420E(new C54138a(arrayList, this));
    }
}
