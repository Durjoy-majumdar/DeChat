package r91;

import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import gy3.C24564k0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t91.C22462f;
import t91.C36981l;
import t91.C64208c;
import u91.C22618a;
import v91.C22733i;
import v91.C22734j;

/* renamed from: r91.c */
public final class C22219c {

    /* renamed from: a */
    public C22734j f62959a;

    /* renamed from: b */
    public final C22220a f62960b = new C22220a(this);

    /* renamed from: r91.c$a */
    public static final class C22220a implements C22462f {

        /* renamed from: a */
        public final /* synthetic */ C22219c f62961a;

        public C22220a(C22219c cVar) {
            this.f62961a = cVar;
        }

        /* renamed from: a */
        public void mo35354a(String str, C36981l.C36982a aVar) {
            C22734j jVar = this.f62961a.f62959a;
            if (jVar != null) {
                Log.m105924i("HABBYGE-MALI.WaterfallsFlowStatistics", "computeOnRefreshEnd...");
                if ((aVar != null ? aVar.f98071a : null) != null) {
                    List<?> list = aVar.f98071a;
                    C87412m.m108591d(list);
                    if (!list.isEmpty()) {
                        jVar.mo35834e(jVar.f65422q);
                        jVar.mo35835f(jVar.f65422q, System.currentTimeMillis());
                        return;
                    }
                }
                Log.m105924i("HABBYGE-MALI.WaterfallsFlowStatistics", "computeOnRefreshEnd, no refresh feed !!!");
                jVar.f65406a.putAll(jVar.f65422q);
                jVar.f65422q.clear();
                List<String> list2 = C64208c.f181975y;
                List<String> list3 = C64208c.f181935B;
                ((ArrayList) list2).addAll(list3);
                List<String> list4 = C64208c.f181976z;
                List<String> list5 = C64208c.f181936C;
                ((ArrayList) list4).addAll(list5);
                List<String> list6 = C64208c.f181934A;
                List<String> list7 = C64208c.f181937D;
                ((ArrayList) list6).addAll(list7);
                ((ArrayList) list3).clear();
                ((ArrayList) list5).clear();
                ((ArrayList) list7).clear();
                jVar.f65411f = jVar.f65424s;
                jVar.f65409d = jVar.f65423r;
            }
        }

        /* renamed from: b */
        public void mo35355b(String str, C36981l.C36982a aVar) {
            if (this.f62961a.f62959a != null) {
                Log.m105918d("HABBYGE-MALI.WaterfallsFlowStatistics", "computeOnLoadMoreEnd");
            }
        }

        /* renamed from: c */
        public void mo35356c(RecyclerView recyclerView, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
        }

        /* renamed from: d */
        public void mo35357d() {
            C22734j jVar = this.f62961a.f62959a;
            if (jVar != null) {
                Log.m105924i("HABBYGE-MALI.WaterfallsFlowStatistics", "computeOnRefreshBegin...");
                long currentTimeMillis = System.currentTimeMillis();
                jVar.f65424s = jVar.f65411f;
                jVar.f65423r = jVar.f65409d;
                jVar.f65409d = currentTimeMillis;
                jVar.f65411f = 3;
                jVar.f65422q.putAll(jVar.f65406a);
                jVar.f65406a.clear();
                C64208c.C64209a aVar = C64208c.f181951a;
                ArrayList arrayList = (ArrayList) C64208c.f181935B;
                arrayList.clear();
                List<String> list = C64208c.f181975y;
                arrayList.addAll(list);
                ArrayList arrayList2 = (ArrayList) C64208c.f181936C;
                arrayList2.clear();
                List<String> list2 = C64208c.f181976z;
                arrayList2.addAll(list2);
                ArrayList arrayList3 = (ArrayList) C64208c.f181937D;
                arrayList3.clear();
                List<String> list3 = C64208c.f181934A;
                arrayList3.addAll(list3);
                Log.m105924i("HABBYGE-MALI.HellFinderConfig", "resetFeedIdCache...");
                ((ArrayList) list).clear();
                ((ArrayList) list2).clear();
                ((ArrayList) list3).clear();
            }
        }

        /* renamed from: e */
        public void mo35358e() {
        }

        /* renamed from: f */
        public void mo35359f(RecyclerView recyclerView, int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager;
            C22734j jVar;
            ArrayList arrayList;
            String str;
            boolean z;
            boolean z2;
            RecyclerView recyclerView2 = recyclerView;
            C87412m.m108594g(recyclerView2, "recyclerView");
            this.f62961a.getClass();
            if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
                staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            } else {
                staggeredGridLayoutManager = null;
            }
            if (staggeredGridLayoutManager != null && staggeredGridLayoutManager.f44890d < 2) {
                staggeredGridLayoutManager = null;
            }
            if (staggeredGridLayoutManager != null && (jVar = this.f62961a.f62959a) != null && staggeredGridLayoutManager.f44890d == 2) {
                long currentTimeMillis = System.currentTimeMillis();
                WeakReference<StaggeredGridLayoutManager> weakReference = jVar.f65420o;
                if ((weakReference != null ? weakReference.get() : null) == null) {
                    jVar.f65420o = new WeakReference<>(staggeredGridLayoutManager);
                }
                WeakReference<RecyclerView> weakReference2 = jVar.f65421p;
                if ((weakReference2 != null ? weakReference2.get() : null) == null) {
                    jVar.f65421p = new WeakReference<>(recyclerView2);
                }
                int[] A = staggeredGridLayoutManager.mo17394A((int[]) null);
                int min = Math.min(A[0], A[1]);
                int[] B = staggeredGridLayoutManager.mo17395B((int[]) null);
                int max = Math.max(Math.max(B[0], B[1]) - C22734j.f65405t, 0);
                int max2 = Math.max(min, C22734j.f65405t) - C22734j.f65405t;
                ArrayList arrayList2 = new ArrayList();
                int i3 = max + 1;
                while (max2 < i3) {
                    View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(C22734j.f65405t + max2);
                    if (findViewByPosition != null) {
                        Pair<Integer, Integer> a = C116711b.m164576a(findViewByPosition);
                        C87412m.m108593f(a, "getCoordinateOnScreen(feedView)");
                        Integer num = (Integer) a.first;
                        Integer num2 = (Integer) a.second;
                        C22733i d = jVar.mo35833d(findViewByPosition, max2, recyclerView2);
                        if (!(d == null || (str = d.f65399t) == null)) {
                            arrayList2.add(str);
                            arrayList = arrayList2;
                            long j = jVar.f65409d;
                            if (j <= 0) {
                                j = jVar.f65410e;
                            }
                            d.f65388i = j;
                            C87412m.m108593f(num, "x");
                            d.f65391l = num.intValue();
                            C87412m.m108593f(num2, "y");
                            d.f65392m = num2.intValue();
                            d.f65395p = max2;
                            jVar.mo35832c(d);
                            jVar.mo35831b(d);
                            jVar.mo35830a(d);
                            if (d.f65390k) {
                                z = false;
                            } else {
                                float f = (float) d.f65392m;
                                z = f < jVar.f65415j && d.f65393n + f > jVar.f65414i;
                                d.f65390k = z;
                            }
                            if (z && d.f65381b <= 0) {
                                d.f65381b = currentTimeMillis;
                            }
                            if (!d.f65390k) {
                                z2 = false;
                            } else {
                                float f2 = (float) d.f65392m;
                                z2 = f2 >= jVar.f65415j || d.f65393n + f2 <= jVar.f65414i;
                                d.f65390k = !z2;
                            }
                            if (z2 || d.f65384e <= 0.0f) {
                                if (d.f65384e <= 0.0f) {
                                    d.f65390k = false;
                                }
                                long j2 = d.f65381b;
                                if (j2 > 0 && d.f65382c <= 0) {
                                    d.f65382c = currentTimeMillis;
                                    d.f65389j = currentTimeMillis - j2;
                                    jVar.f65411f = 0;
                                    d.f65383d = 0;
                                    if (d.f65388i <= 0) {
                                        long j3 = jVar.f65409d;
                                        if (j3 <= 0) {
                                            j3 = jVar.f65410e;
                                        }
                                        d.f65388i = j3;
                                    }
                                    C22618a.f65058a.mo35742c(d);
                                    C24564k0.m30739c(jVar.f65406a).remove(d.f65399t);
                                }
                                max2++;
                                arrayList2 = arrayList;
                            } else {
                                max2++;
                                arrayList2 = arrayList;
                            }
                        }
                    }
                    arrayList = arrayList2;
                    max2++;
                    arrayList2 = arrayList;
                }
                ArrayList arrayList3 = arrayList2;
                if (!jVar.f65406a.isEmpty()) {
                    Iterator<Map.Entry<String, C22733i>> it = jVar.f65406a.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry next = it.next();
                        C22733i iVar = (C22733i) next.getValue();
                        if (!arrayList3.contains((String) next.getKey())) {
                            long j4 = iVar.f65381b;
                            if (j4 > 0) {
                                iVar.f65382c = currentTimeMillis;
                                iVar.f65389j = currentTimeMillis - j4;
                                jVar.f65411f = 0;
                                iVar.f65383d = 0;
                                if (iVar.f65388i <= 0) {
                                    long j5 = jVar.f65409d;
                                    if (j5 <= 0) {
                                        j5 = jVar.f65410e;
                                    }
                                    iVar.f65388i = j5;
                                }
                                C22618a.f65058a.mo35742c(iVar);
                                it.remove();
                            }
                        }
                    }
                }
                C64208c.C64209a aVar = C64208c.f181951a;
                ((ArrayList) C64208c.f181976z).clear();
                ((ArrayList) C64208c.f181934A).clear();
            }
        }
    }
}
