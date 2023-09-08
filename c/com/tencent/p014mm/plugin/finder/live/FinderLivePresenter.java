package com.tencent.p014mm.plugin.finder.live;

import al1.C54127h;
import al1.C54129i;
import al1.C54131l;
import android.content.Context;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cj1.C54741c;
import cl1.C55001u;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.live.FinderLiveRelatedLoader;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.sidebar.FinderLiveSideBar;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import dk1.C58307a;
import dk1.C58308b;
import dk1.C58312g;
import eg1.C58596u;
import eg1.C58597v;
import eg1.C58598w;
import fj1.C45795b;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C46526n3;
import o40.C61926c;
import ob0.C117747y;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64197v;
import te3.C48965c71;
import te3.C49731ho0;
import tf1.C64927s;

/* renamed from: com.tencent.mm.plugin.finder.live.FinderLivePresenter */
public final class FinderLivePresenter implements C58596u {

    /* renamed from: j */
    public static final boolean f159177j = (C32444a.f86159j1.mo60266n().intValue() == 0);

    /* renamed from: d */
    public final Context f159178d;

    /* renamed from: e */
    public C58597v f159179e;

    /* renamed from: f */
    public C58598w f159180f;

    /* renamed from: g */
    public boolean f159181g;

    /* renamed from: h */
    public C29958a f159182h;

    /* renamed from: i */
    public final FinderLivePresenter$feedChangeListener$1 f159183i = new FinderLivePresenter$feedChangeListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLivePresenter$a */
    public static final class C29958a {

        /* renamed from: a */
        public final ArrayList<C54127h> f81117a;

        /* renamed from: b */
        public final ArrayList<C54127h> f81118b;

        /* renamed from: c */
        public final C89349b f81119c;

        public C29958a(ArrayList<C54127h> arrayList, ArrayList<C54127h> arrayList2, C89349b bVar) {
            C87412m.m108594g(arrayList, "preList");
            C87412m.m108594g(arrayList2, "sufList");
            this.f81117a = arrayList;
            this.f81118b = arrayList2;
            this.f81119c = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29958a)) {
                return false;
            }
            C29958a aVar = (C29958a) obj;
            return C87412m.m108589b(this.f81117a, aVar.f81117a) && C87412m.m108589b(this.f81118b, aVar.f81118b) && C87412m.m108589b(this.f81119c, aVar.f81119c);
        }

        public int hashCode() {
            int hashCode = ((this.f81117a.hashCode() * 31) + this.f81118b.hashCode()) * 31;
            C89349b bVar = this.f81119c;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "SideBarDataCache(preList=" + this.f81117a + ", sufList=" + this.f81118b + ", lastBuffer=" + this.f81119c + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLivePresenter$b */
    public static final class C55873b extends C87413o implements C32226l<C54127h, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C54127h f159184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55873b(C54127h hVar) {
            super(1);
            this.f159184d = hVar;
        }

        public Object invoke(Object obj) {
            C54127h hVar = (C54127h) obj;
            C87412m.m108594g(hVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(hVar.f151977d.f157064e == this.f159184d.f151977d.f157064e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLivePresenter$c */
    public static final class C55874c extends C87413o implements C32226l<C54127h, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C54127h f159185d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55874c(C54127h hVar) {
            super(1);
            this.f159185d = hVar;
        }

        public Object invoke(Object obj) {
            C54127h hVar = (C54127h) obj;
            C87412m.m108594g(hVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(hVar.f151977d.f157064e == this.f159185d.f151977d.f157064e);
        }
    }

    public FinderLivePresenter(Context context) {
        C87412m.m108594g(context, "context");
        this.f159178d = context;
    }

    /* renamed from: N */
    public static final boolean m63672N(FinderLivePresenter finderLivePresenter, C45795b bVar, int i, int i2) {
        C58598w wVar = finderLivePresenter.f159180f;
        boolean z = true;
        if (wVar != null && wVar.f167772d) {
            return false;
        }
        int i3 = C58598w.f167764h;
        StringBuilder sb = new StringBuilder();
        sb.append("needPreload curPos:");
        sb.append(i);
        sb.append(", listSize:");
        sb.append(i2);
        sb.append(", threshold:");
        int i4 = C58598w.f167764h;
        sb.append(i4);
        sb.append('!');
        Log.m105924i("FinderLiveDataLoader", sb.toString());
        if (i2 - i > i4) {
            z = false;
        }
        if (!z || !finderLivePresenter.mo77504k()) {
            return false;
        }
        return m63673x(finderLivePresenter, 3, false, bVar, false, 8, (Object) null);
    }

    /* renamed from: x */
    public static boolean m63673x(FinderLivePresenter finderLivePresenter, int i, boolean z, C45795b bVar, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            FinderLiveService.f159376d.getClass();
            bVar = FinderLiveService.f159348A;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return finderLivePresenter.mo77509t(i, z, bVar, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r4 = r4.f151977d;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo77492G(eg1.C58597v r11) {
        /*
            r10 = this;
            java.lang.String r0 = "callback"
            gy3.C87412m.m108594g(r11, r0)
            r10.f159179e = r11
            al1.i r11 = r10.mo77507q()
            if (r11 == 0) goto L_0x006b
            eg1.v r0 = r10.f159179e
            r1 = 0
            if (r0 == 0) goto L_0x0028
            int r3 = r11.mo74925c()
            al1.h r4 = r11.mo74924b()
            if (r4 == 0) goto L_0x0024
            com.tencent.mm.live.api.LiveConfig r4 = r4.f151977d
            if (r4 == 0) goto L_0x0024
            long r4 = r4.f157064e
            goto L_0x0025
        L_0x0024:
            r4 = r1
        L_0x0025:
            r0.mo77522n0(r11, r3, r4)
        L_0x0028:
            eg1.w r11 = new eg1.w
            android.content.Context r0 = r10.f159178d
            r11.<init>(r0)
            r10.f159180f = r11
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            eg1.C58598w.f167768l = r0
            r11.f167770b = r10
            pe1.c<java.lang.Integer> r0 = gg1.C32444a.f86115Y
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x004e
            com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader r0 = r11.f167775g
            tf1.s<al1.h> r11 = r11.f167771c
            r0.setPreload(r11)
        L_0x004e:
            eg1.v r11 = r10.f159179e
            if (r11 == 0) goto L_0x0063
            com.tencent.mm.view.RefreshLoadMoreLayout r11 = r11.mo77517M()
            if (r11 == 0) goto L_0x0063
            eg1.w r0 = r10.f159180f
            if (r0 == 0) goto L_0x0063
            com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader r0 = r0.f167775g
            if (r0 == 0) goto L_0x0063
            r0.register(r11)
        L_0x0063:
            com.tencent.mm.plugin.finder.live.FinderLivePresenter$feedChangeListener$1 r11 = r10.f159183i
            r11.alive()
            rx3.b0 r11 = rx3.C13598b0.f38549a
            goto L_0x006c
        L_0x006b:
            r11 = 0
        L_0x006c:
            if (r11 != 0) goto L_0x0084
            java.lang.String r11 = "FinderLivePresenter"
            java.lang.String r0 = "presenter attach error, live data is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            ft1.a r1 = ft1.C59319a.f169618b
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 60
            r9 = 0
            java.lang.String r2 = "liveAttachError"
            o40.C11348f.C11349a.m11178b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.FinderLivePresenter.mo77492G(eg1.v):void");
    }

    /* renamed from: G0 */
    public C54129i mo77493G0() {
        return mo77507q();
    }

    /* renamed from: I */
    public void mo77494I(C54129i iVar, int i, int i2, List<C54127h> list) {
        C87412m.m108594g(list, "incrementList");
        C58597v vVar = this.f159179e;
        if (vVar != null) {
            vVar.mo77525z(iVar, i, i2);
        }
        mo77499e(list);
    }

    /* renamed from: K0 */
    public void mo77495K0() {
        RefreshLoadMoreLayout M;
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(1);
        C58597v vVar = this.f159179e;
        if (vVar != null && (M = vVar.mo77517M()) != null) {
            M.mo82441G(cVar);
        }
    }

    /* renamed from: b1 */
    public boolean mo77496b1(int i, int i2, C45795b bVar) {
        Log.m105924i("FinderLivePresenter", "preloadData newPos:" + i + ", dataSize:" + i2);
        if (this.f159181g) {
            StringBuilder sb = new StringBuilder();
            sb.append("preloadData, return for hasPreload(");
            FinderLiveService.f159376d.getClass();
            sb.append(FinderLiveService.f159377e);
            sb.append(')');
            Log.m105928w("FinderLivePresenter", sb.toString());
            return m63672N(this, bVar, i, i2);
        }
        this.f159181g = true;
        if (i != 0 || i2 > 1) {
            Log.m105928w("FinderLivePresenter", "preloadData, return for newPos:" + i + ", dataSize:" + i2);
            return m63672N(this, bVar, i, i2);
        }
        Log.m105924i("FinderLivePresenter", "preloadData");
        return mo77509t(3, true, bVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = (r0 = r0.mo77517M()).getRecyclerView();
     */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo77497c0() {
        /*
            r4 = this;
            eg1.v r0 = r4.f159179e
            r1 = 0
            if (r0 == 0) goto L_0x0016
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r0.mo77517M()
            if (r0 == 0) goto L_0x0016
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            if (r0 == 0) goto L_0x0016
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            boolean r2 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r2 == 0) goto L_0x001e
            r1 = r0
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
        L_0x001e:
            r0 = -1
            if (r1 == 0) goto L_0x0026
            int r1 = r1.mo16959E()
            goto L_0x0027
        L_0x0026:
            r1 = -1
        L_0x0027:
            al1.i r2 = r4.mo77507q()
            if (r2 == 0) goto L_0x004b
            java.util.ArrayList<al1.h> r2 = r2.f151990e
            int r3 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r3)
        L_0x0037:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r2.previous()
            al1.h r3 = (al1.C54127h) r3
            boolean r3 = r3.f151982i
            if (r3 == 0) goto L_0x0037
            int r0 = r2.nextIndex()
        L_0x004b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "lastVisibleItemPos:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = ",lastPlayPos:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderLivePresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            if (r1 >= r0) goto L_0x006c
            r1 = r0
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.FinderLivePresenter.mo77497c0():int");
    }

    /* renamed from: c1 */
    public void mo77498c1(C54129i iVar, int i, int i2, List<C54127h> list) {
        C87412m.m108594g(list, "incrementList");
        C58597v vVar = this.f159179e;
        if (vVar != null) {
            vVar.mo77523q0(iVar, i, i2);
        }
        mo77499e(list);
    }

    /* renamed from: e */
    public final void mo77499e(List<C54127h> list) {
        C54131l lVar;
        C58598w wVar = this.f159180f;
        if (wVar != null && wVar.f167774f == 1) {
            C39622i0 a = C39818r.f106831a.mo62443b(this.f159178d).mo75002a(C58312g.class);
            C87412m.m108593f(a, "UICProvider.of(context).…veSideBarUIC::class.java)");
            FinderLiveSideBar finderLiveSideBar = ((C58312g) a).f166968f;
            if (finderLiveSideBar != null) {
                C54129i q = mo77507q();
                C89349b bVar = (q == null || (lVar = q.f151988c) == null) ? null : lVar.f152021a;
                C87412m.m108594g(list, "dataList");
                String str = finderLiveSideBar.f159510b;
                Log.m105924i(str, "appendData origin " + finderLiveSideBar.f159517i.size() + ", " + list.size());
                finderLiveSideBar.f159519k = bVar;
                ArrayList<C58307a> arrayList = finderLiveSideBar.f159517i;
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                Iterator<C58307a> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().f166953d);
                }
                LinkedList<C54127h> linkedList = new LinkedList<>();
                for (C54127h hVar : list) {
                    Iterator it4 = arrayList2.iterator();
                    int i = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (((C54127h) it4.next()).mo76f(hVar) == 0) {
                            break;
                        }
                        i++;
                    }
                    Iterator it5 = linkedList.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it5.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (((C54127h) it5.next()).mo76f(hVar) == 0) {
                            break;
                        }
                        i2++;
                    }
                    if (i == -1 && i2 == -1) {
                        linkedList.add(hVar);
                    }
                }
                ArrayList<C58307a> arrayList3 = finderLiveSideBar.f159517i;
                ArrayList arrayList4 = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (C54127h aVar : linkedList) {
                    arrayList4.add(new C58307a(aVar));
                }
                arrayList3.addAll(arrayList4);
                RecyclerView.C16613e adapter = finderLiveSideBar.mo77736c().getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                String str2 = finderLiveSideBar.f159510b;
                Log.m105924i(str2, "appendData after " + finderLiveSideBar.f159517i.size() + ", liveIds: " + C110818d0.m150921S(finderLiveSideBar.f159517i, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C58308b.f166955d, 31, (Object) null));
            }
        }
    }

    /* renamed from: e1 */
    public boolean mo77500e1() {
        C54129i q = mo77507q();
        if (q == null) {
            return false;
        }
        C54131l lVar = q.f151988c;
        if (!(lVar != null && lVar.f152026f == 3)) {
            if (!(lVar != null && lVar.f152026f == 1)) {
                if (!(lVar != null && lVar.f152026f == 2)) {
                    return lVar != null && lVar.f152026f == 1010;
                }
            }
        }
    }

    /* renamed from: f0 */
    public final int mo77501f0(ArrayList<C54127h> arrayList, C54127h hVar, ArrayList<C54127h> arrayList2, ArrayList<C54127h> arrayList3) {
        Iterator<C54127h> it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().f151977d.f157064e == hVar.f151977d.f157064e) {
                break;
            }
            i++;
        }
        if (i > 0) {
            arrayList2.addAll(arrayList.subList(0, i));
        }
        if (i < arrayList.size() - 1) {
            arrayList3.addAll(arrayList.subList(i + 1, arrayList.size()));
        }
        return i;
    }

    /* renamed from: i */
    public void mo77502i(C54129i iVar, int i, int i2, int i3) {
        C58597v vVar = this.f159179e;
        if (vVar != null) {
            vVar.mo77519i(iVar, i, i2, i3);
        }
    }

    /* renamed from: j0 */
    public final void mo77503j0(ArrayList<C54127h> arrayList, ArrayList<C54127h> arrayList2, C54127h hVar, ArrayList<C54127h> arrayList3, C89349b bVar) {
        String str;
        RefreshLoadMoreLayout M;
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        ArrayList<C54127h> arrayList4 = arrayList;
        C54127h hVar2 = hVar;
        ArrayList<C54127h> arrayList5 = arrayList3;
        C89349b bVar2 = bVar;
        StringBuilder sb = new StringBuilder();
        sb.append("sidebar switchList preList:");
        sb.append(arrayList2.size());
        sb.append(", sufList:");
        sb.append(arrayList3.size());
        sb.append(", lastBuf:");
        sb.append(bVar2 != null ? Integer.valueOf(bVar2.f257327a.length) : null);
        String str2 = "FinderLivePresenter";
        Log.m105924i(str2, sb.toString());
        ArrayList arrayList6 = new ArrayList();
        arrayList6.addAll(arrayList4);
        arrayList.clear();
        C61926c.m72673R(arrayList2, new C55873b(hVar2));
        C61926c.m72673R(arrayList5, new C55874c(hVar2));
        StringBuilder sb4 = new StringBuilder();
        sb4.append("sidebar switchList after filter preList:");
        sb4.append(arrayList2.size());
        sb4.append(", sufList:");
        sb4.append(arrayList3.size());
        sb4.append(", lastBuf:");
        sb4.append(bVar2 != null ? Integer.valueOf(bVar2.f257327a.length) : null);
        Log.m105924i(str2, sb4.toString());
        arrayList.addAll(arrayList2);
        arrayList4.add(hVar2);
        arrayList4.addAll(arrayList5);
        int size = arrayList2.size();
        Iterator it = arrayList6.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                str = str2;
                i = -1;
                break;
            }
            str = str2;
            if (((C54127h) it.next()).f151977d.f157064e == hVar2.f151977d.f157064e) {
                break;
            }
            i++;
            str2 = str;
        }
        C54129i q = mo77507q();
        if (q != null) {
            q.mo74928f(size);
        }
        C54129i q2 = mo77507q();
        C54131l lVar = q2 != null ? q2.f151988c : null;
        if (lVar != null) {
            lVar.f152021a = bVar2;
        }
        C58597v vVar = this.f159179e;
        if (vVar != null && (M = vVar.mo77517M()) != null && (recyclerView = M.getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
            if (i < 0) {
                adapter.notifyDataSetChanged();
                return;
            }
            int size2 = (arrayList6.size() - i) - 1;
            int size3 = arrayList2.size();
            int size4 = arrayList3.size();
            if (i > 0) {
                adapter.notifyItemRangeRemoved(0, i);
            }
            if (size2 > 0) {
                adapter.notifyItemRangeRemoved(1, size2);
            }
            if (size3 > 0) {
                adapter.notifyItemRangeInserted(0, size3);
            }
            if (size4 > 0) {
                adapter.notifyItemRangeInserted(size3 + 1, size4);
            }
            Log.m105924i(str, "sidebar notify originCurPos:" + i + ", preRemoveCount:" + i + ", sufRemoveCount:" + size2 + ", preInsertCount:" + size3 + ", sufInsertCount:" + size4);
        }
    }

    /* renamed from: k */
    public boolean mo77504k() {
        C54129i q = mo77507q();
        if (q == null) {
            return false;
        }
        C54131l lVar = q.f151988c;
        if (!(lVar != null && lVar.f152026f == 2)) {
            if (!(lVar != null && lVar.f152026f == 2)) {
                if (!(lVar != null && lVar.f152026f == 1001)) {
                    return lVar != null && lVar.f152032l == 1;
                }
            }
        }
    }

    /* renamed from: n */
    public final C46526n3 mo77505n(C89349b bVar) {
        int i;
        ArrayList<C54127h> arrayList;
        Class cls = C55001u.class;
        C54129i q = mo77507q();
        C49731ho0 ho02 = null;
        C54131l lVar = q != null ? q.f151988c : null;
        FinderLiveService.f159376d.getClass();
        C45795b bVar2 = FinderLiveService.f159348A;
        if (lVar == null || bVar2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("preloadDataImpl loaderParams:");
            C54129i q2 = mo77507q();
            sb.append(q2 != null ? q2.f151988c : null);
            sb.append(",curLiveRoomData:");
            sb.append(FinderLiveService.f159348A);
            Log.m105924i("FinderLivePresenter", sb.toString());
            return null;
        }
        lVar.f152022b = ((C55001u) bVar2.mo71262a(cls)).f154416j;
        String str = ((C55001u) bVar2.mo71262a(cls)).f154423t;
        C87412m.m108594g(str, "<set-?>");
        lVar.f152027g = str;
        lVar.f152023c = ((C55001u) bVar2.mo71262a(cls)).f154424u;
        LinkedList<C48965c71> linkedList = new LinkedList<>();
        C54129i q3 = mo77507q();
        int i2 = 0;
        if (q3 == null || (arrayList = q3.f151990e) == null) {
            i = 0;
        } else {
            i = 0;
            for (C54127h hVar : arrayList) {
                if (hVar.f151982i) {
                    C48965c71 c712 = new C48965c71();
                    c712.f131557d = hVar.f151977d.f157075s;
                    linkedList.add(c712);
                    if (hVar.f151983j) {
                        i++;
                    }
                }
            }
        }
        lVar.f152036p = linkedList;
        int i3 = 0;
        for (T next : linkedList) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                if (lVar.f152022b == ((C48965c71) next).f131557d) {
                    lVar.f152037q = i3 - i;
                }
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        C58598w wVar = this.f159180f;
        if (wVar == null) {
            return null;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("genNetScene presenter:");
        C58596u uVar = wVar.f167770b;
        if (uVar != null) {
            i2 = uVar.hashCode();
        }
        sb4.append(i2);
        sb4.append(", type:");
        sb4.append(2);
        sb4.append(", loading:");
        sb4.append(wVar.f167772d);
        sb4.append(", isIgnorePreloadForFeedId=");
        sb4.append(C58598w.f167765i);
        Log.m105924i("FinderLiveDataLoader", sb4.toString());
        FinderLiveRelatedLoader finderLiveRelatedLoader = wVar.f167775g;
        finderLiveRelatedLoader.getClass();
        finderLiveRelatedLoader.f159187d = lVar;
        FinderLiveRelatedLoader.C55877c cVar = wVar.f167775g.f159190g;
        if (!(cVar instanceof FinderLiveRelatedLoader.C55875a)) {
            cVar = null;
        }
        C117747y genLoadMoreNetScene = cVar != null ? cVar.genLoadMoreNetScene() : null;
        C46526n3 n3Var = genLoadMoreNetScene instanceof C46526n3 ? (C46526n3) genLoadMoreNetScene : null;
        if (n3Var != null) {
            ho02 = n3Var.mo71876o1();
        }
        if (ho02 != null) {
            ho02.f134769e = bVar;
        }
        return n3Var;
    }

    /* renamed from: o */
    public boolean mo77506o() {
        Log.m105924i("FinderLivePresenter", "loadMoreData");
        this.f159181g = true;
        return m63673x(this, 2, false, (C45795b) null, false, 12, (Object) null);
    }

    public void onDetach() {
        RefreshLoadMoreLayout M;
        C58598w wVar;
        FinderLiveRelatedLoader finderLiveRelatedLoader;
        C58597v vVar = this.f159179e;
        if (!(vVar == null || (M = vVar.mo77517M()) == null || (wVar = this.f159180f) == null || (finderLiveRelatedLoader = wVar.f167775g) == null)) {
            finderLiveRelatedLoader.unregister(M);
        }
        this.f159179e = null;
        C58598w wVar2 = this.f159180f;
        if (wVar2 != null) {
            C64927s<C54127h> sVar = wVar2.f167771c;
            if (sVar != null) {
                sVar.mo89085d();
            }
            wVar2.f167772d = false;
            C58598w.f167765i = -1;
            wVar2.f167770b = null;
        }
        this.f159183i.dead();
    }

    /* renamed from: q */
    public final C54129i mo77507q() {
        FinderLiveService.f159376d.getClass();
        return FinderLiveService.f159398z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f151988c;
     */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo77508s0() {
        /*
            r5 = this;
            al1.i r0 = r5.mo77507q()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            al1.l r0 = r0.f151988c
            if (r0 == 0) goto L_0x0012
            int r0 = r0.f152032l
            if (r0 != r1) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "isEnableNestedScroll hasLoadMore:"
            r3.append(r4)
            boolean r4 = r5.f159181g
            r3.append(r4)
            java.lang.String r4 = ", canPullMore:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FinderLivePresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            boolean r3 = r5.f159181g
            if (r3 != 0) goto L_0x003b
            if (r0 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "isEnableNestedScroll "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.FinderLivePresenter.mo77508s0():boolean");
    }

    /* renamed from: t */
    public final boolean mo77509t(int i, boolean z, C45795b bVar, boolean z2) {
        int i2;
        boolean z3;
        ArrayList<C54127h> arrayList;
        int i3 = i;
        C45795b bVar2 = bVar;
        boolean z4 = z2;
        Class cls = C55001u.class;
        C54129i q = mo77507q();
        C54131l lVar = null;
        C54131l lVar2 = q != null ? q.f151988c : null;
        if (lVar2 == null || bVar2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("preloadDataImpl loaderParams:");
            C54129i q2 = mo77507q();
            if (q2 != null) {
                lVar = q2.f151988c;
            }
            sb.append(lVar);
            sb.append(",curLiveRoomData:");
            FinderLiveService.f159376d.getClass();
            sb.append(FinderLiveService.f159348A);
            Log.m105924i("FinderLivePresenter", sb.toString());
            return false;
        } else if (!z || lVar2.f152032l == 1) {
            lVar2.f152022b = ((C55001u) bVar2.mo71262a(cls)).f154416j;
            String str = ((C55001u) bVar2.mo71262a(cls)).f154423t;
            C87412m.m108594g(str, "<set-?>");
            lVar2.f152027g = str;
            lVar2.f152023c = ((C55001u) bVar2.mo71262a(cls)).f154424u;
            LinkedList<C48965c71> linkedList = new LinkedList<>();
            C54129i q3 = mo77507q();
            if (q3 == null || (arrayList = q3.f151990e) == null) {
                i2 = 0;
            } else {
                i2 = 0;
                for (C54127h hVar : arrayList) {
                    if (hVar.f151982i) {
                        C48965c71 c712 = new C48965c71();
                        c712.f131557d = hVar.f151977d.f157075s;
                        linkedList.add(c712);
                        if (hVar.f151983j) {
                            i2++;
                        }
                    }
                }
            }
            lVar2.f152036p = linkedList;
            int i4 = 0;
            for (T next : linkedList) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    if (lVar2.f152022b == ((C48965c71) next).f131557d) {
                        lVar2.f152037q = i4 - i2;
                    }
                    i4 = i5;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            lVar2.f152039s = z4;
            Log.m105924i("FinderLivePresenter", "loadDataImpl isFirstPagePreload:" + z4);
            C58598w wVar = this.f159180f;
            if (wVar == null) {
                return false;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("loadData presenter:");
            C58596u uVar = wVar.f167770b;
            sb4.append(uVar != null ? uVar.hashCode() : 0);
            sb4.append(", curLoadType:");
            sb4.append(wVar.f167773e);
            sb4.append(", type:");
            sb4.append(i3);
            sb4.append(", loadType:");
            sb4.append(wVar.f167773e);
            sb4.append(", loading:");
            sb4.append(wVar.f167772d);
            sb4.append(", isIgnorePreloadForFeedId=");
            sb4.append(C58598w.f167765i);
            sb4.append(",thread:");
            sb4.append(Thread.currentThread().getName());
            Log.m105924i("FinderLiveDataLoader", sb4.toString());
            if (wVar.f167772d) {
                if (wVar.f167773e == 3 && (i3 == 2 || i3 == 4)) {
                    wVar.f167773e = i3;
                }
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return false;
            }
            if (C58598w.f167765i == lVar2.f152022b) {
                C58598w.f167765i = -1;
                return false;
            }
            wVar.f167772d = true;
            wVar.f167773e = i3;
            FinderLiveRelatedLoader finderLiveRelatedLoader = wVar.f167775g;
            finderLiveRelatedLoader.getClass();
            finderLiveRelatedLoader.f159187d = lVar2;
            if (wVar.f167773e == 4) {
                wVar.f167775g.requestRefresh();
            } else {
                BaseFeedLoader.requestLoadMore$default(wVar.f167775g, false, 1, (Object) null);
            }
            return true;
        } else {
            Log.m105924i("FinderLivePresenter", "preloadDataImpl loadType:" + i3 + ", pullType:" + lVar2.f152032l + ", pullMoreType:" + lVar2.f152032l);
            return false;
        }
    }

    /* renamed from: z */
    public void mo77510z(boolean z) {
        C13598b0 b0Var;
        ArrayList<C54127h> arrayList;
        C13598b0 b0Var2;
        C13598b0 b0Var3;
        C89349b bVar;
        C54131l lVar;
        Log.m105924i("FinderLivePresenter", "onSideBarStateChanged " + z);
        C58598w wVar = this.f159180f;
        if (wVar != null) {
            wVar.f167774f = z ? 1 : 0;
            wVar.f167775g.f159189f = z;
        }
        ArrayList<C54127h> arrayList2 = null;
        if (z) {
            FinderLiveRelatedLoader finderLiveRelatedLoader = wVar != null ? wVar.f167775g : null;
            if (finderLiveRelatedLoader != null) {
                finderLiveRelatedLoader.f159191h = false;
            }
            C54129i q = mo77507q();
            C54127h b = q != null ? q.mo74924b() : null;
            C54129i q2 = mo77507q();
            ArrayList<C54127h> arrayList3 = q2 != null ? q2.f151990e : null;
            if (b == null || arrayList3 == null) {
                b0Var2 = null;
            } else {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                Log.m105924i("FinderLivePresenter", "sidebar old curPos:" + mo77501f0(arrayList3, b, arrayList4, arrayList5) + ", preList:" + arrayList4.size() + ", sufList:" + arrayList5.size() + ", fullList:" + arrayList3.size());
                C54129i q3 = mo77507q();
                this.f159182h = new C29958a(arrayList4, arrayList5, (q3 == null || (lVar = q3.f151988c) == null) ? null : lVar.f152021a);
                C39622i0 a = C39818r.f106831a.mo62443b(this.f159178d).mo75002a(C58312g.class);
                C87412m.m108593f(a, "UICProvider.of(context).…veSideBarUIC::class.java)");
                C58312g gVar = (C58312g) a;
                FinderLiveSideBar finderLiveSideBar = gVar.f166968f;
                if (finderLiveSideBar != null) {
                    ArrayList<C58307a> arrayList6 = finderLiveSideBar.f159517i;
                    ArrayList arrayList7 = new ArrayList(C36907w.m41090l(arrayList6, 10));
                    Iterator<C58307a> it = arrayList6.iterator();
                    while (it.hasNext()) {
                        arrayList7.add(it.next().f166953d);
                    }
                    C89349b bVar2 = finderLiveSideBar.f159519k;
                    List list = arrayList7;
                    if (bVar2 == null) {
                        C54741c cVar = (C54741c) C110818d0.m150916N(gVar.f166970h);
                        bVar = cVar != null ? cVar.f153442f : null;
                    } else {
                        bVar = bVar2;
                    }
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.addAll(list);
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    Log.m105924i("FinderLivePresenter", "sidebar new curPos:" + mo77501f0(arrayList8, b, arrayList9, arrayList10) + ", preList:" + arrayList9.size() + ", sufList:" + arrayList10.size() + ", fullList:" + arrayList8.size());
                    mo77503j0(arrayList3, arrayList9, b, arrayList10, bVar);
                    b0Var3 = C13598b0.f38549a;
                } else {
                    b0Var3 = null;
                }
                if (b0Var3 == null) {
                    Log.m105920e("FinderLivePresenter", "currentSideBarJumpInfo is empty!");
                }
                b0Var2 = C13598b0.f38549a;
            }
            if (b0Var2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("show data?.curLiveData liveDataList is null: ");
                C54129i q4 = mo77507q();
                sb.append(q4 != null ? q4.mo74924b() : null);
                sb.append(", ");
                C54129i q5 = mo77507q();
                if (q5 != null) {
                    arrayList2 = q5.f151990e;
                }
                sb.append(arrayList2);
                Log.m105920e("FinderLivePresenter", sb.toString());
                return;
            }
            return;
        }
        C54129i q6 = mo77507q();
        C54127h b2 = q6 != null ? q6.mo74924b() : null;
        C29958a aVar = this.f159182h;
        if (b2 == null || aVar == null) {
            b0Var = null;
        } else {
            C54129i q7 = mo77507q();
            if (q7 == null || (arrayList = q7.f151990e) == null) {
                arrayList = new ArrayList<>();
            }
            mo77503j0(arrayList, aVar.f81117a, b2, aVar.f81118b, aVar.f81119c);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("hide data?.curLiveData sideBarDataCache is null: ");
            C54129i q8 = mo77507q();
            sb4.append(q8 != null ? q8.mo74924b() : null);
            sb4.append(", ");
            sb4.append(this.f159182h);
            Log.m105920e("FinderLivePresenter", sb4.toString());
        }
        this.f159182h = null;
    }
}
