package ak1;

import ak1.C54067f0;
import ak1.C54095l;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cm1.C0707a0;
import cm1.C0712b0;
import cm1.C0727e0;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60191o5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import op3.C117877b;
import op3.C117878c;
import op3.C117882j;
import p185kq.C10383h;

/* renamed from: ak1.j */
public final class C54091j {

    /* renamed from: a */
    public final C54065c0 f151757a;

    /* renamed from: b */
    public WeakReference<StaggeredGridLayoutManager> f151758b;

    /* renamed from: c */
    public WeakReference<WxRecyclerAdapter<?>> f151759c;

    /* renamed from: d */
    public WeakReference<C60191o5> f151760d;

    /* renamed from: e */
    public WeakReference<WxRecyclerAdapter<C0740i2>> f151761e;

    /* renamed from: f */
    public int f151762f;

    /* renamed from: g */
    public long f151763g = -1;

    /* renamed from: h */
    public int f151764h;

    /* renamed from: i */
    public final HashMap<String, C54095l> f151765i = new HashMap<>();

    /* renamed from: j */
    public final HashMap<String, C54100n> f151766j = new HashMap<>();

    /* renamed from: k */
    public final HashMap<String, C54095l> f151767k = new HashMap<>();

    public C54091j(C54065c0 c0Var) {
        this.f151757a = c0Var;
    }

    /* renamed from: a */
    public final String mo74765a(C0740i2 i2Var, String str, int i, C54067f0.C54078q qVar, String str2) {
        String str3;
        String str4;
        C0740i2 i2Var2 = i2Var;
        long itemId = i2Var.getItemId();
        String XQ = ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(itemId);
        if (!this.f151765i.containsKey(XQ)) {
            C54095l.C54096a aVar = C54095l.f151788x;
            C117878c<Long, Integer, Boolean> a = aVar.mo74779a(i2Var2);
            C87412m.m108593f(XQ, "feedId");
            Object a2 = a.mo182596a(0);
            C87412m.m108593f(a2, "tuple3.`$1`()");
            long longValue = ((Number) a2).longValue();
            Object a3 = a.mo182596a(1);
            C87412m.m108593f(a3, "tuple3.`$2`()");
            int intValue = ((Number) a3).intValue();
            String b = aVar.mo74780b(i2Var2);
            C54095l.C0078b bVar = C54095l.C0078b.UNDEFINE;
            Object a4 = a.mo182596a(2);
            C87412m.m108593f(a4, "tuple3.`$3`()");
            C54095l lVar = r1;
            String str5 = "feedId";
            C54095l lVar2 = new C54095l(i2Var, str, i, XQ, itemId, longValue, qVar, str2, intValue, b, bVar, false, ((Boolean) a4).booleanValue(), 0, (String) null, (String) null, (String) null, (String) null, 0, (String) null, this.f151762f, this.f151763g, this.f151764h, 1040384, (C8480h) null);
            C54095l lVar3 = lVar;
            str3 = XQ;
            this.f151765i.put(str3, lVar3);
            C54065c0 c0Var = this.f151757a;
            if (c0Var != null) {
                c0Var.mo74743f(lVar3, false);
            }
            str4 = str5;
        } else {
            str3 = XQ;
            str4 = "feedId";
        }
        C87412m.m108593f(str3, str4);
        return str3;
    }

    /* renamed from: b */
    public final void mo74766b(ArrayList<String> arrayList) {
        Iterator<Map.Entry<String, C54095l>> it = this.f151765i.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, C54095l> next = it.next();
            C87412m.m108593f(next, "iterator.next()");
            Map.Entry entry = next;
            if (!arrayList.contains(entry.getKey())) {
                it.remove();
                C54065c0 c0Var = this.f151757a;
                if (c0Var != null) {
                    Object value = entry.getValue();
                    C87412m.m108593f(value, "hellFeedPair.value");
                    c0Var.mo74742e((C54095l) value);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo74767c(WxRecyclerAdapter<C0740i2> wxRecyclerAdapter, RecyclerView.LayoutManager layoutManager, C54067f0.C54078q qVar, String str, boolean z) {
        int i;
        int i2;
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.f44890d];
            staggeredGridLayoutManager.mo17394A(iArr);
            int[] iArr2 = new int[staggeredGridLayoutManager.f44890d];
            staggeredGridLayoutManager.mo17395B(iArr2);
            i = Math.min(iArr[0], iArr[1]);
            i2 = Math.max(iArr2[0], iArr2[1]);
        } else if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            i = gridLayoutManager.mo16957C();
            i2 = gridLayoutManager.mo16959E();
        } else {
            return;
        }
        int c6 = wxRecyclerAdapter.mo85796c6();
        ArrayList arrayList = new ArrayList();
        List<C0740i2> data = wxRecyclerAdapter.getData();
        if ((true ^ data.isEmpty()) && i <= i2) {
            while (true) {
                int i3 = i - c6;
                if (i3 < 0) {
                    i3 = i;
                }
                if (i3 < data.size() && i3 >= 0) {
                    C0740i2 i2Var = data.get(i3);
                    arrayList.add(mo74765a(i2Var, i2Var instanceof BaseFinderFeed ? ((BaseFinderFeed) i2Var).mo3513o().getUserName() : "", i, qVar, str));
                }
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        mo74766b(arrayList);
        arrayList.clear();
    }

    /* renamed from: d */
    public final void mo74768d(WxRecyclerAdapter<?> wxRecyclerAdapter, StaggeredGridLayoutManager staggeredGridLayoutManager, C54067f0.C54078q qVar, String str) {
        int i;
        List<?> list;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str2;
        C54067f0.C54078q qVar2;
        Iterator<C0740i2> it;
        List<?> list2;
        int i7;
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = staggeredGridLayoutManager;
        int[] iArr = new int[staggeredGridLayoutManager2.f44890d];
        staggeredGridLayoutManager2.mo17394A(iArr);
        int[] iArr2 = new int[staggeredGridLayoutManager2.f44890d];
        staggeredGridLayoutManager2.mo17395B(iArr2);
        int c6 = wxRecyclerAdapter.mo85796c6();
        int min = Math.min(iArr[0], iArr[1]);
        int max = Math.max(iArr2[0], iArr2[1]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<?> data = wxRecyclerAdapter.getData();
        if ((!data.isEmpty()) && min <= max) {
            int i8 = min;
            while (true) {
                if (staggeredGridLayoutManager2.findViewByPosition(i8) != null && data.size() > (i5 = c6 + i8)) {
                    Object obj = data.get(i5);
                    if (obj instanceof C0707a0) {
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        Iterator<C0740i2> it4 = ((C0707a0) obj).f1691e.iterator();
                        while (it4.hasNext()) {
                            C0740i2 next = it4.next();
                            int i9 = i;
                            long itemId = next.getItemId();
                            String XQ = ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(itemId);
                            if (this.f151767k.containsKey(XQ)) {
                                if (!this.f151765i.containsKey(XQ)) {
                                    C54095l.C54096a aVar = C54095l.f151788x;
                                    C117878c<Long, Integer, Boolean> a = aVar.mo74779a(next);
                                    it = it4;
                                    String str3 = next instanceof C0712b0 ? ((C0712b0) next).f1709d.username : "";
                                    i7 = c6;
                                    C87412m.m108593f(XQ, "feedId");
                                    list2 = data;
                                    Object a2 = a.mo182596a(0);
                                    C87412m.m108593f(a2, "liveIdTuple3.`$1`()");
                                    long longValue = ((Number) a2).longValue();
                                    Object a3 = a.mo182596a(1);
                                    C87412m.m108593f(a3, "liveIdTuple3.`$2`()");
                                    int intValue = ((Number) a3).intValue();
                                    String b = aVar.mo74780b(next);
                                    C54095l.C0078b bVar = C54095l.C0078b.UNDEFINE;
                                    Object a4 = a.mo182596a(2);
                                    C87412m.m108593f(a4, "liveIdTuple3.`$3`()");
                                    C54095l lVar = new C54095l(next, str3, i8, XQ, itemId, longValue, qVar, str, intValue, b, bVar, ((Boolean) a4).booleanValue(), false, 0, (String) null, (String) null, (String) null, (String) null, 0, (String) null, this.f151762f, this.f151763g, this.f151764h, 1044480, (C8480h) null);
                                    if (next instanceof C0727e0) {
                                        lVar.f151795g = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR;
                                    }
                                    this.f151765i.put(XQ, lVar);
                                    C54065c0 c0Var = this.f151757a;
                                    if (c0Var != null) {
                                        c0Var.mo74743f(lVar, false);
                                    }
                                } else {
                                    it = it4;
                                    i7 = c6;
                                    list2 = data;
                                }
                                arrayList3.add(XQ);
                                it4 = it;
                                StaggeredGridLayoutManager staggeredGridLayoutManager3 = staggeredGridLayoutManager;
                                i = i9;
                                c6 = i7;
                                data = list2;
                            } else {
                                Iterator<C0740i2> it5 = it4;
                                int i15 = c6;
                                List<?> list3 = data;
                                arrayList4.add(XQ);
                                StaggeredGridLayoutManager staggeredGridLayoutManager4 = staggeredGridLayoutManager;
                                i = i9;
                            }
                        }
                        i2 = c6;
                        i6 = i;
                        list = data;
                        C117877b c = C117882j.m166284c(arrayList3, arrayList4);
                        arrayList.addAll((Collection) c.mo182596a(0));
                        arrayList2.addAll((Collection) c.mo182596a(1));
                        String str4 = str;
                        i3 = i8;
                    } else {
                        i2 = c6;
                        i6 = i;
                        list = data;
                        if (obj instanceof BaseFinderFeed) {
                            String userName = ((BaseFinderFeed) obj).mo3513o().getUserName();
                            String str5 = str;
                            if (C87412m.m108589b(str5, "temp_10")) {
                                qVar2 = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD;
                                str2 = "15";
                            } else {
                                qVar2 = qVar;
                                str2 = str5;
                            }
                            i3 = i8;
                            arrayList.add(mo74765a((C0740i2) obj, userName, i8, qVar2, str2));
                        } else {
                            String str6 = str;
                            i3 = i8;
                            if ((obj instanceof C0740i2 ? (C0740i2) obj : null) != null) {
                                arrayList.add(mo74765a((C0740i2) obj, "", i3, qVar, str));
                            }
                        }
                    }
                    i4 = i6;
                } else {
                    String str7 = str;
                    i2 = c6;
                    i4 = i;
                    list = data;
                    i3 = i8;
                }
                if (i3 == i4) {
                    break;
                }
                i8 = i3 + 1;
                staggeredGridLayoutManager2 = staggeredGridLayoutManager;
                max = i4;
                c6 = i2;
                data = list;
            }
        }
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            this.f151765i.remove((String) it6.next());
        }
        mo74766b(arrayList);
        arrayList.clear();
        arrayList2.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5 A[LOOP:0: B:7:0x004c->B:49:0x00f5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fd A[EDGE_INSN: B:60:0x00fd->B:50:0x00fd ?: BREAK  , SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74769e(ht1.C60191o5 r26, androidx.recyclerview.widget.StaggeredGridLayoutManager r27, ak1.C54067f0.C54078q r28, java.lang.String r29) {
        /*
            r25 = this;
            r6 = r25
            r7 = r26
            r8 = r27
            int r0 = r8.f44890d
            int[] r0 = new int[r0]
            r8.mo17394A(r0)
            int r1 = r8.f44890d
            int[] r1 = new int[r1]
            r8.mo17395B(r1)
            r9 = 0
            r2 = r0[r9]
            r10 = 1
            r0 = r0[r10]
            int r0 = java.lang.Math.min(r2, r0)
            r2 = r1[r9]
            r1 = r1[r10]
            int r11 = java.lang.Math.max(r2, r1)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.List r13 = r26.getData()
            java.util.List r14 = r26.mo3956m()
            boolean r1 = r13.isEmpty()
            r1 = r1 ^ r10
            if (r1 != 0) goto L_0x0041
            boolean r1 = r14.isEmpty()
            r1 = r1 ^ r10
            if (r1 == 0) goto L_0x00fd
        L_0x0041:
            int r15 = r14.size()
            int r5 = r13.size()
            if (r0 > r11) goto L_0x00fd
            r4 = r0
        L_0x004c:
            android.view.View r0 = r8.findViewByPosition(r4)
            if (r0 != 0) goto L_0x0053
            goto L_0x005d
        L_0x0053:
            int r0 = r7.getItemViewType(r4)
            r1 = 2
            if (r0 == r1) goto L_0x0096
            r1 = 4
            if (r0 == r1) goto L_0x0063
        L_0x005d:
            r9 = r4
            r24 = r5
        L_0x0060:
            r4 = 0
            goto L_0x00f3
        L_0x0063:
            int r3 = r7.mo3957y1(r4)
            if (r3 < 0) goto L_0x006d
            if (r3 >= r5) goto L_0x006d
            r0 = 1
            goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r13.get(r3)
            r1 = r0
            cm1.i2 r1 = (cm1.C0740i2) r1
            java.lang.Object r0 = r13.get(r3)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            java.lang.String r2 = r0.getUserName()
            r0 = r25
            r9 = r4
            r4 = r28
            r24 = r5
            r5 = r29
            java.lang.String r0 = r0.mo74765a(r1, r2, r3, r4, r5)
            r12.add(r0)
            goto L_0x0060
        L_0x0096:
            r9 = r4
            r24 = r5
            if (r9 >= r15) goto L_0x0060
            java.lang.Object r0 = r14.get(r9)
            te3.bk1 r0 = (te3.C48868bk1) r0
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r0.f131162d
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x00ef
            java.lang.String r1 = r1.username
            if (r1 != 0) goto L_0x00ac
            goto L_0x00ef
        L_0x00ac:
            java.util.HashMap<java.lang.String, ak1.n> r3 = r6.f151766j
            boolean r3 = r3.containsKey(r1)
            if (r3 != 0) goto L_0x00ec
            ak1.n r3 = new ak1.n
            ak1.f0$q r20 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r0.f131162d
            if (r4 == 0) goto L_0x00c3
            int r5 = r4.liveStatus
            if (r5 != r10) goto L_0x00c3
            r22 = 1
            goto L_0x00c5
        L_0x00c3:
            r22 = 0
        L_0x00c5:
            if (r4 == 0) goto L_0x00cf
            java.lang.String r4 = r4.nickname
            if (r4 != 0) goto L_0x00cc
            goto L_0x00cf
        L_0x00cc:
            r23 = r4
            goto L_0x00d1
        L_0x00cf:
            r23 = r2
        L_0x00d1:
            java.lang.String r21 = "23"
            r16 = r3
            r17 = r0
            r18 = r9
            r19 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            java.util.HashMap<java.lang.String, ak1.n> r0 = r6.f151766j
            r0.put(r1, r3)
            ak1.c0 r0 = r6.f151757a
            if (r0 == 0) goto L_0x00ec
            r4 = 0
            r0.mo74740c(r3, r4)
            goto L_0x00ed
        L_0x00ec:
            r4 = 0
        L_0x00ed:
            r2 = r1
            goto L_0x00f0
        L_0x00ef:
            r4 = 0
        L_0x00f0:
            r12.add(r2)
        L_0x00f3:
            if (r9 == r11) goto L_0x00fd
            int r0 = r9 + 1
            r4 = r0
            r5 = r24
            r9 = 0
            goto L_0x004c
        L_0x00fd:
            r6.mo74766b(r12)
            java.util.HashMap<java.lang.String, ak1.n> r0 = r6.f151766j
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x010a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x013b
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = "iterator.next()"
            gy3.C87412m.m108593f(r1, r2)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r12.contains(r2)
            if (r2 != 0) goto L_0x010a
            r0.remove()
            ak1.c0 r2 = r6.f151757a
            if (r2 == 0) goto L_0x010a
            java.lang.Object r1 = r1.getValue()
            java.lang.String r3 = "hellFeedPair.value"
            gy3.C87412m.m108593f(r1, r3)
            ak1.n r1 = (ak1.C54100n) r1
            r2.mo74739b(r1)
            goto L_0x010a
        L_0x013b:
            r12.clear()
            r12.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54091j.mo74769e(ht1.o5, androidx.recyclerview.widget.StaggeredGridLayoutManager, ak1.f0$q, java.lang.String):void");
    }
}
