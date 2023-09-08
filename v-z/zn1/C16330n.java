package zn1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader;
import com.tencent.p014mm.plugin.finder.feed.model.C2819w0;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicTimelineUI;
import com.tencent.p014mm.plugin.finder.playlist.FinderPlayListDrawer;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import er1.C58684b;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kf1.C10019vb;
import kf1.C9629ac;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C50124kf1;
import te3.C50862pq3;
import te3.C51108rh0;
import wp1.C15585f;

/* renamed from: zn1.n */
public final class C16330n implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C16323l f43666d;

    public C16330n(C16323l lVar) {
        this.f43666d = lVar;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C16340u uVar;
        C16340u uVar2;
        boolean z;
        C51108rh0 rh02;
        int i2 = i;
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        C16340u uVar3 = (C16340u) oVar.f173503E;
        Log.m105924i("Finder.FinderPlayListDrawerPresenter", "onItemClick: position:" + i2 + ", item:" + uVar3.getItemId() + ", scene:" + this.f43666d.f43653l);
        C16323l lVar = this.f43666d;
        if (lVar.f43653l == 0) {
            Intent intent = new Intent();
            intent.putExtra("key_topic_type", 16);
            long j = 0;
            C50124kf1 kf12 = this.f43666d.mo14813e().getFeedObject().object_extend;
            String str = "";
            if (!(kf12 == null || (rh02 = kf12.f136745d) == null)) {
                String str2 = rh02.f140918e;
                if (str2 != null) {
                    str = str2;
                }
                j = rh02.f140917d;
            }
            intent.putExtra("key_topic_title", str);
            intent.putExtra("KEY_TOPIC_ID", j);
            intent.putExtra("key_ref_object_id", this.f43666d.mo14813e().getId());
            intent.putExtra("KEY_CLICK_FEED_ID", uVar3.getItemId());
            intent.putExtra("KEY_CLICK_FEED_POSITION", i2);
            C16323l lVar2 = this.f43666d;
            C16341v vVar = lVar2.f43643b;
            C9629ac acVar = new C9629ac((C50862pq3) null, lVar2.f43649h);
            C89349b bVar = this.f43666d.f43649h;
            vVar.getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList<C16340u> arrayList2 = vVar.f43693a;
            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
            Iterator<C16340u> it = arrayList2.iterator();
            while (it.hasNext()) {
                C16340u next = it.next();
                next.mo3513o().setCommentScene(0);
                arrayList3.add(C15585f.f42211a.mo14348k(next.mo3513o()));
            }
            arrayList.addAll(arrayList3);
            vVar.f43694b.mo2926b(new C2819w0(arrayList, bVar, i2, acVar), intent);
            C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this.f43666d.f43642a, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
            ((C58684b) C86312j.m106911c(C58684b.class)).ty0(this.f43666d.f43642a, intent);
            FinderPlayListDrawer finderPlayListDrawer = this.f43666d.f43645d;
            if (finderPlayListDrawer == null) {
                C87412m.m108603p("drawer");
                throw null;
            } else if (finderPlayListDrawer.mo82541i()) {
                finderPlayListDrawer.mo82540h(true);
            }
        } else {
            Context context = lVar.f43642a;
            FinderTopicTimelineUI finderTopicTimelineUI = context instanceof FinderTopicTimelineUI ? (FinderTopicTimelineUI) context : null;
            if (finderTopicTimelineUI != null) {
                C10019vb vbVar = finderTopicTimelineUI.f14913u;
                if (vbVar != null) {
                    RecyclerView recyclerView = vbVar.getRecyclerView();
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof FinderLinearLayoutManager ? (FinderLinearLayoutManager) layoutManager : null;
                    if (finderLinearLayoutManager != null) {
                        FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader = finderTopicTimelineUI.f14914v;
                        if (finderTopicTimelineUIContract$Loader != null) {
                            DataBuffer dataList = finderTopicTimelineUIContract$Loader.getDataList();
                            Iterator it4 = dataList.iterator();
                            int i3 = 0;
                            while (true) {
                                if (!it4.hasNext()) {
                                    i3 = -1;
                                    break;
                                }
                                if (((C0740i2) it4.next()).getItemId() == uVar3.getItemId()) {
                                    break;
                                }
                                i3++;
                            }
                            if (i3 == -1) {
                                dataList.clear();
                                C16341v vVar2 = lVar.f43643b;
                                vVar2.getClass();
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList<C16340u> arrayList5 = vVar2.f43693a;
                                ArrayList arrayList6 = new ArrayList(C36907w.m41090l(arrayList5, 10));
                                Iterator<C16340u> it5 = arrayList5.iterator();
                                while (it5.hasNext()) {
                                    C16340u next2 = it5.next();
                                    next2.mo3513o().setCommentScene(0);
                                    arrayList6.add(C15585f.f42211a.mo14348k(next2.mo3513o()));
                                }
                                arrayList4.addAll(arrayList6);
                                dataList.addAll(arrayList4);
                                RecyclerView.C16613e adapter = recyclerView.getAdapter();
                                WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
                                if (wxRecyclerAdapter != null) {
                                    wxRecyclerAdapter.notifyDataSetChanged();
                                }
                                Iterator it6 = dataList.iterator();
                                int i4 = 0;
                                while (true) {
                                    if (!it6.hasNext()) {
                                        i4 = -1;
                                        break;
                                    }
                                    if (((C0740i2) it6.next()).getItemId() == uVar3.getItemId()) {
                                        break;
                                    }
                                    i4++;
                                }
                                FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader2 = finderTopicTimelineUI.f14914v;
                                if (finderTopicTimelineUIContract$Loader2 != null) {
                                    C32224a<C13598b0> aVar = finderTopicTimelineUIContract$Loader2.f13439q;
                                    if (aVar != null) {
                                        aVar.invoke();
                                    }
                                    i3 = i4;
                                } else {
                                    C87412m.m108603p("feedLoader");
                                    throw null;
                                }
                            }
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            aVar2.mo10233c(Integer.valueOf(i3));
                            FinderLinearLayoutManager finderLinearLayoutManager2 = finderLinearLayoutManager;
                            C117292a.m165358d(finderLinearLayoutManager2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerPresenter$getAdapter$2", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                            finderLinearLayoutManager.mo16973V(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                            C117292a.m165359e(finderLinearLayoutManager2, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerPresenter$getAdapter$2", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                            Iterator<C16340u> it7 = lVar.f43643b.f43693a.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    uVar = null;
                                    break;
                                }
                                C16340u next3 = it7.next();
                                if (next3.f43691d) {
                                    uVar = next3;
                                    break;
                                }
                            }
                            C16340u uVar4 = uVar;
                            if (uVar4 != null) {
                                uVar4.f43691d = false;
                            }
                            Iterator<C16340u> it8 = lVar.f43643b.f43693a.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    uVar2 = null;
                                    break;
                                }
                                C16340u next4 = it8.next();
                                if (next4.getItemId() == uVar3.getItemId()) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
                                    uVar2 = next4;
                                    break;
                                }
                            }
                            C16340u uVar5 = uVar2;
                            if (uVar5 != null) {
                                uVar5.f43692e = true;
                                uVar5.f43691d = true;
                            }
                            eVar.notifyDataSetChanged();
                            FinderPlayListDrawer finderPlayListDrawer2 = lVar.f43645d;
                            if (finderPlayListDrawer2 == null) {
                                C87412m.m108603p("drawer");
                                throw null;
                            } else if (finderPlayListDrawer2.mo82541i()) {
                                finderPlayListDrawer2.mo82540h(true);
                            }
                        } else {
                            C87412m.m108603p("feedLoader");
                            throw null;
                        }
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
        }
    }
}
