package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C55033u;
import cm1.C55034v;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import rx3.C13604l;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.k */
public final class C55772k {

    /* renamed from: a */
    public long f158790a;

    /* renamed from: b */
    public long f158791b;

    /* renamed from: c */
    public C55034v f158792c;

    /* renamed from: d */
    public final ArrayList<C55033u> f158793d = new ArrayList<>();

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo77381a(cm1.C55033u r13) {
        /*
            r12 = this;
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "addItem "
            r0.append(r1)
            long r1 = r13.getItemId()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderCommentLoader"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            up1.w0 r0 = r13.f154492d
            long r0 = r0.mo89531n2()
            r2 = 0
            r4 = -1
            r5 = 0
            r6 = 1
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0056
            java.util.ArrayList<cm1.u> r0 = r12.f158793d
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0035:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0082
            java.lang.Object r7 = r0.next()
            cm1.u r7 = (cm1.C55033u) r7
            up1.w0 r7 = r7.f154492d
            long r7 = r7.field_localCommentId
            up1.w0 r9 = r13.f154492d
            long r9 = r9.field_localCommentId
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x004f
            r7 = 1
            goto L_0x0050
        L_0x004f:
            r7 = 0
        L_0x0050:
            if (r7 == 0) goto L_0x0053
            goto L_0x0083
        L_0x0053:
            int r1 = r1 + 1
            goto L_0x0035
        L_0x0056:
            java.util.ArrayList<cm1.u> r0 = r12.f158793d
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x005d:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0082
            java.lang.Object r7 = r0.next()
            cm1.u r7 = (cm1.C55033u) r7
            up1.w0 r7 = r7.f154492d
            long r7 = r7.mo89531n2()
            up1.w0 r9 = r13.f154492d
            long r9 = r9.mo89531n2()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x007b
            r7 = 1
            goto L_0x007c
        L_0x007b:
            r7 = 0
        L_0x007c:
            if (r7 == 0) goto L_0x007f
            goto L_0x0083
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x005d
        L_0x0082:
            r1 = -1
        L_0x0083:
            if (r1 < 0) goto L_0x008b
            java.util.ArrayList<cm1.u> r0 = r12.f158793d
            r0.set(r1, r13)
            return r1
        L_0x008b:
            up1.w0 r0 = r13.f154492d
            te3.ye0 r0 = r0.field_actionInfo
            long r0 = r0.f186500h
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x00b2
            java.util.ArrayList<cm1.u> r0 = r12.f158793d
            int r0 = r0.size()
            up1.w0 r1 = r13.f154492d
            int r2 = r1.field_state
            if (r2 == r4) goto L_0x00a5
            boolean r1 = r1.f188279P
            if (r1 == 0) goto L_0x00ac
        L_0x00a5:
            cm1.v r0 = r12.f158792c
            if (r0 != 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r5 = 1
        L_0x00ab:
            r0 = r5
        L_0x00ac:
            java.util.ArrayList<cm1.u> r1 = r12.f158793d
            r1.add(r0, r13)
            return r0
        L_0x00b2:
            int r0 = r12.mo77386f(r0, r6)
            java.util.ArrayList<cm1.u> r1 = r12.f158793d
            r1.add(r0, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.C55772k.mo77381a(cm1.u):int");
    }

    /* renamed from: b */
    public final void mo77382b(List<? extends C55033u> list, boolean z, boolean z2) {
        C87412m.m108594g(list, "itemList");
        List<C55033u> d = mo77384d(list);
        int size = list.size() - ((ArrayList) d).size();
        Log.m105924i("Finder.FinderCommentLoader", "reduce size: " + size + ", data size: " + this.f158793d.size());
        if (z) {
            this.f158793d.addAll(this.f158792c == null ? 0 : 1, d);
        } else if (z2) {
            ArrayList<C55033u> arrayList = this.f158793d;
            arrayList.addAll(arrayList.size(), d);
        }
    }

    /* renamed from: c */
    public final C13604l<Integer, Integer> mo77383c(long j) {
        ArrayList<C55033u> arrayList = this.f158793d;
        ArrayList arrayList2 = new ArrayList();
        int i = -1;
        int i2 = 0;
        for (T next : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C55033u uVar = (C55033u) next;
                if (uVar.f154492d.mo89531n2() == j) {
                    i = i2;
                }
                if (uVar.f154492d.mo89531n2() == j || uVar.f154492d.field_actionInfo.f186500h == j) {
                    arrayList2.add(next);
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        int size = arrayList2.size();
        this.f158793d.removeAll(arrayList2);
        return new C13604l<>(Integer.valueOf(i), Integer.valueOf(size));
    }

    /* renamed from: d */
    public final List<C55033u> mo77384d(List<? extends C55033u> list) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (C55033u uVar : list) {
            Iterator<C55033u> it = this.f158793d.iterator();
            int i2 = 0;
            while (true) {
                i = -1;
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (it.next().f154492d.mo89531n2() == uVar.f154492d.mo89531n2()) {
                    break;
                }
                i2++;
            }
            Iterator it4 = arrayList.iterator();
            int i3 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (((C55033u) it4.next()).f154492d.mo89531n2() == uVar.f154492d.mo89531n2()) {
                    i = i3;
                    break;
                }
                i3++;
            }
            if (i2 >= 0) {
                this.f158793d.set(i2, uVar);
                Log.m105924i("Finder.FinderCommentLoader", "filter1:" + uVar.f154492d.mo89531n2() + ", " + uVar.f154492d.mo89530m2());
            } else if (i >= 0) {
                Log.m105924i("Finder.FinderCommentLoader", "filter2:" + uVar.f154492d.mo89531n2());
            } else {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final C55033u mo77385e(int i) {
        C55033u uVar = this.f158793d.get(i);
        C87412m.m108593f(uVar, "data[index]");
        return uVar;
    }

    /* renamed from: f */
    public final int mo77386f(long j, boolean z) {
        int i;
        boolean z2;
        Iterator<C55033u> it = this.f158793d.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().f154492d.mo89531n2() == j) {
                break;
            }
            i2++;
        }
        ArrayList<C55033u> arrayList = this.f158793d;
        ListIterator<C55033u> listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (listIterator.previous().f154492d.field_actionInfo.f186500h == j) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    i = listIterator.nextIndex();
                    break;
                }
            } else {
                break;
            }
        }
        return (z && i >= 0) ? i + 1 : i2 + 1;
    }

    /* renamed from: g */
    public final int mo77387g() {
        return this.f158793d.size();
    }

    /* renamed from: h */
    public final boolean mo77388h(C55033u uVar, C55033u uVar2) {
        C87412m.m108594g(uVar, "comment1");
        C87412m.m108594g(uVar2, "comment2");
        long j = uVar.f154492d.field_actionInfo.f186500h;
        return j != 0 && j == uVar2.f154492d.field_actionInfo.f186500h;
    }
}
