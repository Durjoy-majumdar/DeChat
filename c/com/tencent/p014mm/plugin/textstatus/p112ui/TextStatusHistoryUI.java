package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b03.C39688b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tav.coremedia.TimeUtil;
import di3.C86312j;
import dm2.C45418c;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jq3.C9493c;
import kotlin.Metadata;
import lz2.C46919a;
import mz2.C47149b;
import mz2.C47150c;
import mz2.C47151d;
import ob0.C11385n;
import ob0.C117747y;
import p606mm.C99933h;
import p640ox.C77049b;
import qo3.C89779i0;
import qy2.C47904x;
import uz2.C52673c1;
import uz2.C78315f0;
import vz2.C78501d;
import yz2.C53676g2;
import yz2.C53679h2;
import yz2.C53683i2;
import yz2.C53686j2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusHistoryUI;", "Lcom/tencent/mm/ui/MMFragment;", "Lob0/n;", "<init>", "()V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI */
public final class TextStatusHistoryUI extends MMFragment implements C11385n {

    /* renamed from: d */
    public RefreshLoadMoreLayout f116924d;

    /* renamed from: e */
    public WxRecyclerView f116925e;

    /* renamed from: f */
    public ArrayList<C9493c> f116926f = new ArrayList<>();

    /* renamed from: g */
    public C39688b f116927g;

    /* renamed from: h */
    public boolean f116928h;

    /* renamed from: i */
    public long f116929i;

    /* renamed from: j */
    public boolean f116930j;

    public void dealContentView(View view) {
        C78315f0 f0Var;
        Class cls = C78315f0.class;
        Class cls2 = C77049b.class;
        C87412m.m108594g(view, "v");
        super.dealContentView(view);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((C77049b) C86312j.m106911c(cls2)).mo72352Rp(activity, new C45418c(cls, 9, true));
            C78315f0 f0Var2 = (C78315f0) ((C77049b) C86312j.m106911c(cls2)).Wi0(activity, 9, cls);
            if (f0Var2 != null) {
                try {
                    f0Var = (C78315f0) ((C99933h) C86312j.m106911c(C99933h.class)).mo84402PX(9, "TextStatusCardExposed");
                } catch (Throwable unused) {
                    f0Var = null;
                }
                f0Var2.f229428d = f0Var != null ? f0Var.f229428d : null;
            }
        }
        View findViewById = view.findViewById(C0966R.C0970id.iiq);
        C87412m.m108593f(findViewById, "v.findViewById(R.id.recycler_view)");
        this.f116925e = (WxRecyclerView) findViewById;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        WxRecyclerView wxRecyclerView = this.f116925e;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(linearLayoutManager);
            WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new TextStatusHistoryUI$buildItemConverts$1(), this.f116926f, true);
            wxRecyclerAdapter.f165737C = new C53679h2(wxRecyclerAdapter, this);
            WxRecyclerView wxRecyclerView2 = this.f116925e;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.setAdapter(wxRecyclerAdapter);
                WxRecyclerView wxRecyclerView3 = this.f116925e;
                if (wxRecyclerView3 != null) {
                    wxRecyclerView3.setOverScrollMode(2);
                    WxRecyclerView wxRecyclerView4 = this.f116925e;
                    if (wxRecyclerView4 != null) {
                        wxRecyclerView4.mo17043c(new C53683i2(linearLayoutManager, this));
                        View findViewById2 = view.findViewById(C0966R.C0970id.ivb);
                        C87412m.m108593f(findViewById2, "v.findViewById(R.id.rl_layout)");
                        RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById2;
                        this.f116924d = refreshLoadMoreLayout;
                        refreshLoadMoreLayout.setActionCallback(new C53686j2(this, wxRecyclerAdapter));
                        RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f116924d;
                        if (refreshLoadMoreLayout2 != null) {
                            this.f116927g = new C39688b(wxRecyclerAdapter, refreshLoadMoreLayout2, getContext());
                            Log.m105924i("MicroMsg.TextStatus.TextStatusHistoryUI", "init OK");
                            return;
                        }
                        C87412m.m108603p("mRefreshLayout");
                        throw null;
                    }
                    C87412m.m108603p("rvSelfHistory");
                    throw null;
                }
                C87412m.m108603p("rvSelfHistory");
                throw null;
            }
            C87412m.m108603p("rvSelfHistory");
            throw null;
        }
        C87412m.m108603p("rvSelfHistory");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cqo;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f7545j9);
        setBackBtn(new C53676g2(this));
        C86709a0.m107524d().mo123455a(5967, this);
        this.f116929i = C31543z5.m39453c();
    }

    public void onDestroy() {
        super.onDestroy();
        C78501d.m94809k(C78501d.f229945a, 3, C31543z5.m39453c() - this.f116929i, (String) null, 4, (Object) null);
        C39688b bVar = this.f116927g;
        if (bVar != null) {
            bVar.f106476a.getData().clear();
            C39688b bVar2 = this.f116927g;
            if (bVar2 != null) {
                C86709a0.m107524d().mo123470p(4245, bVar2.f106484i);
                C39688b.f106472m.clear();
                C39688b.f106473n.clear();
                C86709a0.m107524d().mo123470p(5967, this);
                return;
            }
            C87412m.m108603p("dataLoader");
            throw null;
        }
        C87412m.m108603p("dataLoader");
        throw null;
    }

    public void onPause() {
        super.onPause();
        if (this.f116927g != null) {
            C89779i0 i0Var = C39688b.f106470k;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C39688b.f106470k = null;
            return;
        }
        C87412m.m108603p("dataLoader");
        throw null;
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if ((yVar instanceof C46919a) && i == 0 && i2 == 0) {
            Iterator<C9493c> it = this.f116926f.iterator();
            C87412m.m108593f(it, "dataList.iterator()");
            while (it.hasNext()) {
                C9493c next = it.next();
                C87412m.m108593f(next, "dataListIterator.next()");
                C9493c cVar = next;
                if (cVar instanceof C47151d) {
                    C47151d dVar = (C47151d) cVar;
                    Iterator<C52673c1> it4 = dVar.f126677f.iterator();
                    int size = dVar.f126677f.size();
                    int i3 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        C52673c1 next2 = it4.next();
                        if (C87412m.m108589b(next2.f147067d, ((C46919a) yVar).f126144d)) {
                            dVar.f126677f.remove(next2);
                            if (dVar.f126677f.isEmpty()) {
                                it.remove();
                            } else if (i3 == 0 || i3 == size - 1) {
                                List<C52673c1> list = dVar.f126677f;
                                LinkedList linkedList = new LinkedList();
                                if (!(list == null || list.isEmpty())) {
                                    int i4 = -1;
                                    LinkedList linkedList2 = new LinkedList();
                                    for (C52673c1 c1Var : list) {
                                        long j = ((long) C47149b.m52432a(c1Var).field_CreateTime) * ((long) 1000);
                                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS);
                                        Date parse = simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j)));
                                        Calendar instance = Calendar.getInstance();
                                        instance.setTime(parse);
                                        int i5 = instance.get(5);
                                        if (i5 != i4) {
                                            if (!linkedList2.isEmpty()) {
                                                linkedList.add(new C47150c(linkedList2));
                                            }
                                            linkedList2 = new LinkedList();
                                            linkedList2.add(c1Var);
                                            i4 = i5;
                                        } else {
                                            linkedList2.add(c1Var);
                                        }
                                    }
                                    if (!linkedList2.isEmpty()) {
                                        linkedList.add(new C47150c(linkedList2));
                                    }
                                }
                                dVar.f126678g = dVar.mo72237a(dVar.mo72237a(linkedList));
                            }
                        } else {
                            i3++;
                        }
                    }
                    Iterator<C47150c> it5 = dVar.f126678g.iterator();
                    while (it5.hasNext()) {
                        C47150c next3 = it5.next();
                        List<C52673c1> list2 = next3.f126668d;
                        if (!(list2 == null || list2.isEmpty())) {
                            List<C52673c1> list3 = next3.f126668d;
                            C87412m.m108591d(list3);
                            Iterator<C52673c1> it6 = list3.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    break;
                                }
                                C52673c1 next4 = it6.next();
                                if (C87412m.m108589b(next4.f147067d, ((C46919a) yVar).f126144d)) {
                                    List<C52673c1> list4 = next3.f126668d;
                                    C87412m.m108591d(list4);
                                    list4.remove(next4);
                                    next3.f126669e = new LinkedList();
                                    next3.f126670f = new LinkedList();
                                    next3.f126672h = new LinkedList();
                                    next3.f126673i = 0;
                                    next3.f126674j = new LinkedList();
                                    next3.mo72236a();
                                    break;
                                }
                            }
                        }
                    }
                    C39688b.C39689a aVar = C39688b.f106469j;
                    String str2 = ((C46919a) yVar).f126144d;
                    C87412m.m108594g(str2, "statusId");
                    Iterator<C52673c1> it7 = C39688b.f106472m.iterator();
                    C87412m.m108593f(it7, "cacheDataList.iterator()");
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        C52673c1 next5 = it7.next();
                        C87412m.m108593f(next5, "iterator.next()");
                        if (C87412m.m108589b(next5.f147067d, str2)) {
                            it7.remove();
                            break;
                        }
                    }
                    Iterator<Map.Entry<Long, C52673c1>> it8 = C39688b.f106473n.entrySet().iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        Map.Entry<Long, C52673c1> next6 = it8.next();
                        C87412m.m108593f(next6, "mapIterator.next()");
                        if (C87412m.m108589b(((C52673c1) next6.getValue()).f147067d, str2)) {
                            it8.remove();
                            break;
                        }
                    }
                }
            }
            WxRecyclerView wxRecyclerView = this.f116925e;
            if (wxRecyclerView != null) {
                RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
            C87412m.m108603p("rvSelfHistory");
            throw null;
        }
    }

    public void onVisibilityChanged(boolean z) {
        super.onVisibilityChanged(z);
        Log.m105924i("MicroMsg.TextStatus.TextStatusHistoryUI", "[onVisibilityChanged]" + z + ' ' + this.f116930j);
        if (z && !this.f116930j) {
            C39688b bVar = this.f116927g;
            if (bVar != null) {
                bVar.mo62268b();
                this.f116930j = true;
                return;
            }
            C87412m.m108603p("dataLoader");
            throw null;
        }
    }

    public void setUserVisibleHint(boolean z) {
        Class cls = C47904x.class;
        super.setUserVisibleHint(z);
        if (z) {
            C78501d.m94809k(C78501d.f229945a, 1, 0, (String) null, 6, (Object) null);
            ((C47904x) C86312j.m106911c(cls)).mo72669hl();
            ((C47904x) C86312j.m106911c(cls)).mo72665af();
            return;
        }
        ((C47904x) C86312j.m106911c(cls)).mo72666aw();
        ((C47904x) C86312j.m106911c(cls)).mo72660Dj();
    }

    public boolean supportNavigationSwipeBack() {
        return false;
    }
}
