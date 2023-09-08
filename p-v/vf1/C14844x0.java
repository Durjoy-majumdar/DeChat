package vf1;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0734g2;
import cm1.C0740i2;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderFavTopicUpdateEvent;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.C2819w0;
import com.tencent.p014mm.plugin.finder.feed.model.C2826y0;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderInteractionSearchUIContract$ViewCallback;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.event.IListener;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import fo1.C59264a;
import gy3.C87412m;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import je1.C46512c1;
import je1.C9308f2;
import k20.C60958c;
import k20.C9556a;
import nr3.C89059e;
import ob0.C89132b;
import oq3.C21804c;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49157dk1;
import te3.C49712hj1;
import te3.C50942qc1;
import wp1.C15585f;

/* renamed from: vf1.x0 */
public final class C14844x0 implements C59264a<FinderInteractionSearchUIContract$ViewCallback> {

    /* renamed from: d */
    public final MMFragmentActivity f40843d;

    /* renamed from: e */
    public final ArrayList<C0734g2> f40844e;

    /* renamed from: f */
    public final int f40845f;

    /* renamed from: g */
    public FinderInteractionSearchUIContract$ViewCallback f40846g;

    /* renamed from: h */
    public C89349b f40847h;

    /* renamed from: i */
    public int f40848i;

    /* renamed from: j */
    public final C49712hj1 f40849j;

    /* renamed from: n */
    public String f40850n = "";

    /* renamed from: o */
    public String f40851o = "";

    /* renamed from: p */
    public LinkedList<String> f40852p = new LinkedList<>();

    /* renamed from: q */
    public final ArrayList<C0740i2> f40853q = new ArrayList<>();

    /* renamed from: r */
    public final C2826y0 f40854r = new C2826y0();

    /* renamed from: s */
    public IListener<FinderFavTopicUpdateEvent> f40855s;

    /* renamed from: t */
    public final int f40856t = 7;

    /* renamed from: vf1.x0$a */
    public static final class C14845a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C14844x0 f40857a;

        public C14845a(C14844x0 x0Var) {
            this.f40857a = x0Var;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C14844x0 x0Var = this.f40857a;
            int i = cVar.f256794b;
            int i2 = cVar.f256793a;
            LinkedList<FinderObject> linkedList = ((C50942qc1) cVar.f256796d).f140238d;
            C87412m.m108593f(linkedList, "it.resp.object_list");
            C50942qc1 qc12 = (C50942qc1) cVar.f256796d;
            C14844x0.m14103e(x0Var, i, i2, linkedList, qc12.f140240f, qc12.f140239e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vf1.x0$b */
    public static final class C14846b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C14844x0 f40858a;

        public C14846b(C14844x0 x0Var) {
            this.f40858a = x0Var;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C14844x0 x0Var = this.f40858a;
            int i = cVar.f256794b;
            int i2 = cVar.f256793a;
            LinkedList<FinderObject> linkedList = ((C49157dk1) cVar.f256796d).f132378d;
            C87412m.m108593f(linkedList, "it.resp.object_list");
            C49157dk1 dk12 = (C49157dk1) cVar.f256796d;
            C14844x0.m14103e(x0Var, i, i2, linkedList, dk12.f132379e, dk12.f132380f);
            return C13598b0.f38549a;
        }
    }

    public C14844x0(MMFragmentActivity mMFragmentActivity, ArrayList<C0734g2> arrayList, int i) {
        C87412m.m108594g(mMFragmentActivity, "context");
        C87412m.m108594g(arrayList, "topicList");
        this.f40843d = mMFragmentActivity;
        this.f40844e = arrayList;
        this.f40845f = i;
        this.f40849j = ((C13442s8) C39818r.f106831a.mo62444c(mMFragmentActivity).mo75002a(C13442s8.class)).mo12861q3();
    }

    /* renamed from: e */
    public static final void m14103e(C14844x0 x0Var, int i, int i2, LinkedList linkedList, int i3, C89349b bVar) {
        View view;
        View view2;
        View view3;
        TextView textView;
        RecyclerView.C16613e adapter;
        RecyclerView.C16613e adapter2;
        C14844x0 x0Var2 = x0Var;
        int size = x0Var2.f40853q.size();
        boolean z = true;
        View view4 = null;
        if (i == 0 && i2 == 0) {
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                BaseFinderFeed k = C15585f.f42211a.mo14348k(FinderItem.Companion.mo79056a((FinderObject) it.next(), 16));
                if (!k.mo3513o().getMediaList().isEmpty()) {
                    x0Var2.f40853q.add(k);
                }
                arrayList.add(C13598b0.f38549a);
            }
            x0Var2.f40848i = i3;
            x0Var2.f40847h = bVar;
            C13442s8 s8Var = (C13442s8) C39818r.f106831a.mo62444c(x0Var2.f40843d).mo62449e(C13442s8.class);
            C49712hj1 q3 = s8Var != null ? s8Var.mo12861q3() : null;
            int i4 = x0Var2.f40845f == 2 ? 1 : 2;
            String str = (String) C110818d0.m150916N(x0Var2.f40852p);
            if (str == null) {
                str = "";
            }
            String str2 = str;
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0.Gx0((C58417y0) c, q3, x0Var2.f40851o, 1, i4, str2, x0Var2.f40850n, linkedList.size(), 0, 0, 384, (Object) null);
        }
        FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback = x0Var2.f40846g;
        if (finderInteractionSearchUIContract$ViewCallback != null) {
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            C87412m.m108594g(valueOf, "errCode");
            C87412m.m108594g(valueOf2, "errType");
            int size2 = finderInteractionSearchUIContract$ViewCallback.f14446e.f40853q.size();
            if (size2 > 0) {
                ((TextView) ((C36570n) finderInteractionSearchUIContract$ViewCallback.f14452n).getValue()).setVisibility(8);
                ((LinearLayout) ((C36570n) finderInteractionSearchUIContract$ViewCallback.f14453o).getValue()).setVisibility(8);
                finderInteractionSearchUIContract$ViewCallback.mo3007v().setVisibility(8);
                finderInteractionSearchUIContract$ViewCallback.mo3006p().setVisibility(0);
            } else {
                ((TextView) ((C36570n) finderInteractionSearchUIContract$ViewCallback.f14452n).getValue()).setVisibility(0);
                ((LinearLayout) ((C36570n) finderInteractionSearchUIContract$ViewCallback.f14453o).getValue()).setVisibility(8);
                finderInteractionSearchUIContract$ViewCallback.mo3007v().setVisibility(8);
                finderInteractionSearchUIContract$ViewCallback.mo3006p().setVisibility(8);
            }
            if (size == 0) {
                RecyclerView recyclerView = finderInteractionSearchUIContract$ViewCallback.getRecyclerView();
                if (!(recyclerView == null || (adapter2 = recyclerView.getAdapter()) == null)) {
                    adapter2.notifyDataSetChanged();
                }
            } else {
                RecyclerView recyclerView2 = finderInteractionSearchUIContract$ViewCallback.getRecyclerView();
                if (!(recyclerView2 == null || (adapter = recyclerView2.getAdapter()) == null)) {
                    adapter.notifyItemRangeInserted(size, size2);
                }
            }
            finderInteractionSearchUIContract$ViewCallback.mo3006p().mo26580f(true);
            finderInteractionSearchUIContract$ViewCallback.mo3006p().mo26642z(!(finderInteractionSearchUIContract$ViewCallback.f14446e.f40848i == 1));
            if (finderInteractionSearchUIContract$ViewCallback.f14446e.f40848i != 1) {
                z = false;
            }
            if (!z) {
                C21804c loadMoreFooter = finderInteractionSearchUIContract$ViewCallback.mo3006p().getLoadMoreFooter();
                View view5 = loadMoreFooter != null ? loadMoreFooter.getView() : null;
                if (view5 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onSearchCallback", "(Ljava/lang/Object;Ljava/lang/Object;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onSearchCallback", "(Ljava/lang/Object;Ljava/lang/Object;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C21804c loadMoreFooter2 = finderInteractionSearchUIContract$ViewCallback.mo3006p().getLoadMoreFooter();
                if (!(loadMoreFooter2 == null || (view3 = loadMoreFooter2.getView()) == null || (textView = (TextView) view3.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView.setText(C0966R.string.eat);
                }
                C21804c loadMoreFooter3 = finderInteractionSearchUIContract$ViewCallback.mo3006p().getLoadMoreFooter();
                TextView textView2 = (loadMoreFooter3 == null || (view2 = loadMoreFooter3.getView()) == null) ? null : (TextView) view2.findViewById(C0966R.C0970id.g2t);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                C21804c loadMoreFooter4 = finderInteractionSearchUIContract$ViewCallback.mo3006p().getLoadMoreFooter();
                if (!(loadMoreFooter4 == null || (view = loadMoreFooter4.getView()) == null)) {
                    view4 = view.findViewById(C0966R.C0970id.g2s);
                }
                if (view4 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view7 = view4;
                    C117292a.m165358d(view7, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onSearchCallback", "(Ljava/lang/Object;Ljava/lang/Object;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onSearchCallback", "(Ljava/lang/Object;Ljava/lang/Object;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo13929n(int i, long j) {
        C13442s8 s8Var = (C13442s8) C39818r.f106831a.mo62444c(this.f40843d).mo62449e(C13442s8.class);
        C49712hj1 q3 = s8Var != null ? s8Var.mo12861q3() : null;
        int i2 = this.f40845f == 2 ? 1 : 2;
        String str = (String) C110818d0.m150916N(this.f40852p);
        if (str == null) {
            str = "";
        }
        String str2 = str;
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.Gx0((C58417y0) c, q3, this.f40851o, 3, i2, str2, this.f40850n, 0, j, i, 64, (Object) null);
    }

    public void onDetach() {
        this.f40846g = null;
        IListener<FinderFavTopicUpdateEvent> iListener = this.f40855s;
        if (iListener != null) {
            iListener.dead();
        }
        ((C58417y0) C86312j.m106911c(C58417y0.class)).f167352f = "";
    }

    /* renamed from: q */
    public final void mo13930q(Intent intent, int i) {
        C87412m.m108594g(intent, "intent");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f40853q);
        this.f40854r.mo2926b(new C2819w0(arrayList, this.f40847h, i, (C2780c) null), intent);
    }

    /* renamed from: t */
    public final void mo13931t(String str, LinkedList<String> linkedList) {
        String str2 = str;
        LinkedList<String> linkedList2 = linkedList;
        C87412m.m108594g(str2, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(linkedList2, "tags");
        this.f40848i = 0;
        View view = null;
        this.f40847h = null;
        this.f40853q.clear();
        this.f40852p = linkedList2;
        this.f40850n = str2;
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        this.f40851o = uuid;
        ((C58417y0) C86312j.m106911c(C58417y0.class)).f167352f = String.valueOf(C31543z5.m39453c());
        FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback = this.f40846g;
        if (finderInteractionSearchUIContract$ViewCallback != null) {
            finderInteractionSearchUIContract$ViewCallback.mo3007v().setVisibility(8);
            finderInteractionSearchUIContract$ViewCallback.mo3006p().setVisibility(8);
            ((TextView) ((C36570n) finderInteractionSearchUIContract$ViewCallback.f14452n).getValue()).setVisibility(8);
            ((LinearLayout) ((C36570n) finderInteractionSearchUIContract$ViewCallback.f14453o).getValue()).setVisibility(0);
            C21804c loadMoreFooter = finderInteractionSearchUIContract$ViewCallback.mo3006p().getLoadMoreFooter();
            if (loadMoreFooter != null) {
                view = loadMoreFooter.getView();
            }
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onStartSearch", "(Ljava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onStartSearch", "(Ljava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            RecyclerView recyclerView = finderInteractionSearchUIContract$ViewCallback.getRecyclerView();
            if (recyclerView != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onStartSearch", "(Ljava/lang/String;Ljava/util/LinkedList;)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onStartSearch", "(Ljava/lang/String;Ljava/util/LinkedList;)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        if (this.f40845f == 4) {
            C89059e i = new C46512c1(str, this.f40851o, (C89349b) null, this.f40856t, this.f40849j).mo9225i();
            i.mo11397F(this.f40843d);
            i.mo123062e(new C14845a(this));
            return;
        }
        C89059e i2 = new C9308f2(str, this.f40845f, this.f40851o, this.f40852p, (C89349b) null, this.f40849j).mo9225i();
        i2.mo11397F(this.f40843d);
        i2.mo123062e(new C14846b(this));
    }
}
