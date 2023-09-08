package lq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import sq1.C64151e;
import sx3.C77813z;
import ux3.C65486b;

/* renamed from: lq1.b0 */
public final class C61346b0 {

    /* renamed from: a */
    public final ArrayList<C64151e> f174500a = new ArrayList<>();

    /* renamed from: lq1.b0$a */
    public static final class C61347a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Long.valueOf(((C64151e) t2).f181868d.mo88878p2()), Long.valueOf(((C64151e) t).f181868d.mo88878p2()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo86296a(sq1.C64151e r13, boolean r14) {
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
            java.lang.String r1 = ", sort:"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MusicUni.FinderCommentLoader"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            sq1.b r0 = r13.f181868d
            long r0 = r0.mo88875m2()
            r2 = 0
            r4 = -1
            r5 = 1
            r6 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x005e
            java.util.ArrayList<sq1.e> r0 = r12.f174500a
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x003d:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x008a
            java.lang.Object r7 = r0.next()
            sq1.e r7 = (sq1.C64151e) r7
            sq1.b r7 = r7.f181868d
            long r7 = r7.field_localCommentId
            sq1.b r9 = r13.f181868d
            long r9 = r9.field_localCommentId
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0057
            r7 = 1
            goto L_0x0058
        L_0x0057:
            r7 = 0
        L_0x0058:
            if (r7 == 0) goto L_0x005b
            goto L_0x008b
        L_0x005b:
            int r1 = r1 + 1
            goto L_0x003d
        L_0x005e:
            java.util.ArrayList<sq1.e> r0 = r12.f174500a
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0065:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x008a
            java.lang.Object r7 = r0.next()
            sq1.e r7 = (sq1.C64151e) r7
            sq1.b r7 = r7.f181868d
            long r7 = r7.mo88875m2()
            sq1.b r9 = r13.f181868d
            long r9 = r9.mo88875m2()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0083
            r7 = 1
            goto L_0x0084
        L_0x0083:
            r7 = 0
        L_0x0084:
            if (r7 == 0) goto L_0x0087
            goto L_0x008b
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x0065
        L_0x008a:
            r1 = -1
        L_0x008b:
            if (r1 < 0) goto L_0x0093
            java.util.ArrayList<sq1.e> r14 = r12.f174500a
            r14.set(r1, r13)
            return r1
        L_0x0093:
            sq1.b r0 = r13.f181868d
            te3.ye0 r0 = r0.field_actionInfo
            long r0 = r0.f186500h
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x00f3
            java.util.ArrayList<sq1.e> r0 = r12.f174500a
            int r0 = r0.size()
            sq1.b r1 = r13.f181868d
            int r7 = r1.field_state
            if (r7 == r4) goto L_0x00ed
            long r7 = r1.mo88878p2()
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x00b2
            goto L_0x00ed
        L_0x00b2:
            if (r14 == 0) goto L_0x00ec
            java.util.ArrayList<sq1.e> r14 = r12.f174500a
            java.util.Iterator r14 = r14.iterator()
            r0 = 0
        L_0x00bb:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x00e1
            java.lang.Object r1 = r14.next()
            sq1.e r1 = (sq1.C64151e) r1
            sq1.b r1 = r1.f181868d
            long r1 = r1.mo88878p2()
            sq1.b r3 = r13.f181868d
            long r7 = r3.mo88878p2()
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x00d9
            r1 = 1
            goto L_0x00da
        L_0x00d9:
            r1 = 0
        L_0x00da:
            if (r1 == 0) goto L_0x00de
            r4 = r0
            goto L_0x00e1
        L_0x00de:
            int r0 = r0 + 1
            goto L_0x00bb
        L_0x00e1:
            if (r4 >= 0) goto L_0x00ea
            java.util.ArrayList<sq1.e> r14 = r12.f174500a
            int r6 = r14.size()
            goto L_0x00ed
        L_0x00ea:
            r6 = r4
            goto L_0x00ed
        L_0x00ec:
            r6 = r0
        L_0x00ed:
            java.util.ArrayList<sq1.e> r14 = r12.f174500a
            r14.add(r6, r13)
            return r6
        L_0x00f3:
            int r14 = r12.mo86300e(r0, r5)
            java.util.ArrayList<sq1.e> r0 = r12.f174500a
            r0.add(r14, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: lq1.C61346b0.mo86296a(sq1.e, boolean):int");
    }

    /* renamed from: b */
    public final void mo86297b(List<? extends C64151e> list, boolean z, boolean z2) {
        C87412m.m108594g(list, "itemList");
        List<C64151e> c = mo86298c(list);
        ArrayList arrayList = (ArrayList) c;
        if (arrayList.size() > 1) {
            C77813z.m93909o(c, new C61347a());
        }
        int size = list.size() - arrayList.size();
        Log.m105924i("MicroMsg.MusicUni.FinderCommentLoader", "reduce size: " + size + ", data size: " + this.f174500a.size());
        if (z) {
            this.f174500a.addAll(0, c);
        } else if (z2) {
            ArrayList<C64151e> arrayList2 = this.f174500a;
            arrayList2.addAll(arrayList2.size(), c);
        }
    }

    /* renamed from: c */
    public final List<C64151e> mo86298c(List<? extends C64151e> list) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (C64151e eVar : list) {
            Iterator<C64151e> it = this.f174500a.iterator();
            int i2 = 0;
            while (true) {
                i = -1;
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (it.next().f181868d.mo88875m2() == eVar.f181868d.mo88875m2()) {
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
                if (((C64151e) it4.next()).f181868d.mo88875m2() == eVar.f181868d.mo88875m2()) {
                    i = i3;
                    break;
                }
                i3++;
            }
            if (i2 >= 0) {
                this.f174500a.set(i2, eVar);
                Log.m105924i("MicroMsg.MusicUni.FinderCommentLoader", "filter1:" + eVar.f181868d.mo88875m2() + ", " + eVar.f181868d.mo88874l2());
            } else if (i >= 0) {
                Log.m105924i("MicroMsg.MusicUni.FinderCommentLoader", "filter2:" + eVar.f181868d.mo88875m2());
            } else {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final C64151e mo86299d(int i) {
        C64151e eVar = this.f174500a.get(i);
        C87412m.m108593f(eVar, "data[index]");
        return eVar;
    }

    /* renamed from: e */
    public final int mo86300e(long j, boolean z) {
        int i;
        boolean z2;
        Iterator<C64151e> it = this.f174500a.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().f181868d.mo88875m2() == j) {
                break;
            }
            i2++;
        }
        ArrayList<C64151e> arrayList = this.f174500a;
        ListIterator<C64151e> listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (listIterator.previous().f181868d.field_actionInfo.f186500h == j) {
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

    /* renamed from: f */
    public final int mo86301f() {
        return this.f174500a.size();
    }

    /* renamed from: g */
    public final boolean mo86302g(C64151e eVar, C64151e eVar2) {
        C87412m.m108594g(eVar, "comment1");
        C87412m.m108594g(eVar2, "comment2");
        long j = eVar.f181868d.field_actionInfo.f186500h;
        return j != 0 && j == eVar2.f181868d.field_actionInfo.f186500h;
    }
}
