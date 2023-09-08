package qm1;

import an1.C0090c;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cm1.C0740i2;
import cm1.C0797z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jq3.C9493c;
import pm1.C62381d;
import sx3.C110818d0;

/* renamed from: qm1.b */
public final class C12881b implements C63285a {

    /* renamed from: d */
    public static int f36856d = 2;

    /* renamed from: a */
    public final List<C9493c> f36857a;

    /* renamed from: b */
    public final WxRecyclerAdapter<?> f36858b;

    /* renamed from: c */
    public final int f36859c = MMApplicationContext.getContext().getResources().getDisplayMetrics().heightPixels;

    public C12881b(List<? extends C9493c> list, WxRecyclerAdapter<?> wxRecyclerAdapter) {
        C87412m.m108594g(list, "feedList");
        this.f36857a = list;
        this.f36858b = wxRecyclerAdapter;
        int i = MMApplicationContext.getContext().getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: a */
    public Set<C62381d.C62382a> mo12393a(StaggeredGridLayoutManager staggeredGridLayoutManager, HashSet<C62381d.C62382a> hashSet) {
        C87412m.m108594g(staggeredGridLayoutManager, "layoutManager");
        C87412m.m108594g(hashSet, "curLivePreviewDataSet");
        boolean z = true;
        if (hashSet.size() != 1 || !mo12396d(((C62381d.C62382a) C110818d0.m150913K(hashSet)).f177311a)) {
            z = false;
        }
        if (hashSet.size() < f36856d && !z) {
            return new HashSet();
        }
        Log.m105924i("NearbyLiveAutoPlaySelector", "findAutoStopItem isSingleOneLine:" + z);
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x01e7 A[LOOP:0: B:9:0x006b->B:37:0x01e7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x039c A[LOOP:1: B:41:0x0221->B:67:0x039c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x03ad A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03ac A[EDGE_INSN: B:75:0x03ac->B:68:0x03ac ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] mo12394b(androidx.recyclerview.widget.StaggeredGridLayoutManager r26, int[] r27, int[] r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "layoutManager"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "firstVisibleItemPos"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "lastVisibleItemPos"
            gy3.C87412m.m108594g(r3, r4)
            pe1.c<java.lang.Integer> r4 = gg1.C32444a.f86085O
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r6 = 1
            if (r4 != r6) goto L_0x0028
            r4 = 1
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            java.lang.String r7 = "findAutoPlayItem item hit baseline, focus["
            java.lang.String r8 = "findAutoPlayItem item hit baseline for big card, focus["
            java.lang.String r9 = "findAutoPlayItem item hit divider, focus["
            java.lang.String r10 = "findAutoPlayItem item hit cache, focus["
            java.lang.String r11 = ", "
            java.lang.String r12 = "] focusItemIndex:"
            java.lang.String r13 = " rect:"
            java.lang.String r14 = " baseline:"
            java.lang.String r15 = "findAutoPlayItem invalid view index:"
            java.lang.String r6 = " index:"
            java.lang.String r5 = "findAutoPlayItem invalid feed:"
            r18 = r15
            java.lang.String r15 = "NearbyLiveAutoPlaySelector"
            r19 = r10
            r10 = 2
            if (r4 == 0) goto L_0x01f7
            f36856d = r10
            int r4 = r0.f36859c
            int r4 = r4 / r10
            r20 = r9
            int[] r9 = new int[r10]
            r17 = 0
            r21 = r2[r17]
            r9[r17] = r21
            r16 = 1
            r21 = r2[r16]
            r9[r16] = r21
            r2 = r2[r17]
            int r10 = r3.length
            int r10 = r10 + -1
            r3 = r3[r10]
            if (r2 > r3) goto L_0x03ad
            r27 = r3
            r28 = 0
            r10 = 1
        L_0x006b:
            cm1.i2 r3 = r0.mo12395c(r2)
            r22 = r7
            boolean r7 = r3 instanceof cm1.C0797z
            if (r7 != 0) goto L_0x0093
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r3)
            r7.append(r6)
            r7.append(r2)
            java.lang.String r3 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r3)
            r7 = r28
            r3 = r22
            goto L_0x0131
        L_0x0093:
            android.view.View r3 = r1.findViewByPosition(r2)
            if (r3 == 0) goto L_0x01c6
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r3.getGlobalVisibleRect(r7)
            int r3 = r7.left
            boolean r3 = r7.contains(r3, r4)
            if (r3 == 0) goto L_0x013b
            if (r10 == 0) goto L_0x00ae
            r3 = 0
            r10 = 0
            goto L_0x00b0
        L_0x00ae:
            r3 = r28
        L_0x00b0:
            r28 = r10
            int r10 = r3 + 1
            r9[r3] = r2
            boolean r3 = r0.mo12396d(r2)
            if (r3 == 0) goto L_0x00f4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r3 = 0
            r5 = r9[r3]
            r1.append(r5)
            r1.append(r11)
            r3 = 1
            r5 = r9[r3]
            r1.append(r5)
            r1.append(r12)
            r1.append(r10)
            r1.append(r13)
            r1.append(r7)
            r1.append(r14)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            int[] r9 = new int[r3]
            r16 = 0
            r9[r16] = r2
            goto L_0x03ad
        L_0x00f4:
            r3 = 2
            r16 = 0
            if (r10 < r3) goto L_0x012c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = r22
            r1.append(r3)
            r2 = r9[r16]
            r1.append(r2)
            r1.append(r11)
            r2 = 1
            r2 = r9[r2]
            r1.append(r2)
            r1.append(r12)
            r1.append(r10)
            r1.append(r13)
            r1.append(r7)
            r1.append(r14)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            goto L_0x03ad
        L_0x012c:
            r3 = r22
            r7 = r10
            r10 = r28
        L_0x0131:
            r22 = r3
            r23 = r8
            r24 = r11
            r8 = r18
            goto L_0x01e3
        L_0x013b:
            int r3 = r7.top
            if (r3 <= r4) goto L_0x0175
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = r20
            r1.append(r3)
            r2 = 0
            r2 = r9[r2]
            r1.append(r2)
            r1.append(r11)
            r2 = 1
            r2 = r9[r2]
            r1.append(r2)
            r1.append(r12)
            r2 = r28
            r1.append(r2)
            r1.append(r13)
            r1.append(r7)
            r1.append(r14)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            goto L_0x03ad
        L_0x0175:
            r3 = r28
            r28 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r23 = r8
            r8 = r19
            r10.append(r8)
            r17 = 0
            r8 = r9[r17]
            r10.append(r8)
            r10.append(r11)
            r24 = r11
            r8 = 1
            r11 = r9[r8]
            r10.append(r11)
            r10.append(r12)
            r10.append(r3)
            r10.append(r13)
            r10.append(r7)
            r10.append(r14)
            r10.append(r4)
            java.lang.String r7 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r7)
            int r7 = r3 + 1
            r9[r3] = r2
            r3 = 2
            if (r7 < r3) goto L_0x01bf
            r3 = r27
            r10 = r28
            r8 = r18
            r7 = 0
            goto L_0x01e5
        L_0x01bf:
            r3 = r27
            r10 = r28
            r8 = r18
            goto L_0x01e5
        L_0x01c6:
            r3 = r28
            r23 = r8
            r28 = r10
            r24 = r11
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r18
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r7)
            r7 = r3
        L_0x01e3:
            r3 = r27
        L_0x01e5:
            if (r2 == r3) goto L_0x03ad
            int r2 = r2 + 1
            r27 = r3
            r28 = r7
            r18 = r8
            r7 = r22
            r8 = r23
            r11 = r24
            goto L_0x006b
        L_0x01f7:
            r4 = r7
            r23 = r8
            r7 = r9
            r24 = r11
            r8 = r18
            r9 = 2
            f36856d = r9
            int r10 = r0.f36859c
            int r10 = r10 / r9
            int[] r11 = new int[r9]
            r9 = 0
            r17 = r2[r9]
            r11[r9] = r17
            r16 = 1
            r17 = r2[r16]
            r11[r16] = r17
            r2 = r2[r9]
            int r9 = r3.length
            int r9 = r9 + -1
            r3 = r3[r9]
            if (r2 > r3) goto L_0x03ac
            r27 = r3
            r18 = r8
            r3 = 0
            r9 = 1
        L_0x0221:
            cm1.i2 r8 = r0.mo12395c(r2)
            r20 = r3
            boolean r3 = r8 instanceof cm1.C0797z
            if (r3 != 0) goto L_0x024b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r8)
            r3.append(r6)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r3)
            r3 = r20
            r22 = r23
            r0 = r24
            goto L_0x02e8
        L_0x024b:
            android.view.View r3 = r1.findViewByPosition(r2)
            if (r3 == 0) goto L_0x037a
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r3.getGlobalVisibleRect(r8)
            int r3 = r8.left
            boolean r3 = r8.contains(r3, r10)
            if (r3 == 0) goto L_0x02f4
            if (r9 == 0) goto L_0x0266
            r9 = 0
            r20 = 0
        L_0x0266:
            int r3 = r20 + 1
            r11[r20] = r2
            boolean r20 = r0.mo12396d(r2)
            if (r20 == 0) goto L_0x02ad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r4 = r23
            r1.append(r4)
            r4 = 0
            r5 = r11[r4]
            r1.append(r5)
            r4 = r24
            r1.append(r4)
            r4 = 1
            r5 = r11[r4]
            r1.append(r5)
            r1.append(r12)
            r1.append(r3)
            r1.append(r13)
            r1.append(r8)
            r1.append(r14)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            int[] r1 = new int[r4]
            r16 = 0
            r1[r16] = r2
            r9 = r1
            goto L_0x03ad
        L_0x02ad:
            r22 = r23
            r0 = r24
            r1 = 2
            r16 = 0
            r17 = 1
            if (r3 < r1) goto L_0x02e8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r2 = r11[r16]
            r1.append(r2)
            r1.append(r0)
            r0 = r11[r17]
            r1.append(r0)
            r1.append(r12)
            r1.append(r3)
            r1.append(r13)
            r1.append(r8)
            r1.append(r14)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x03ac
        L_0x02e8:
            r24 = r0
            r20 = r4
            r8 = r18
            r1 = 2
            r4 = 1
            r17 = 0
            goto L_0x0398
        L_0x02f4:
            r22 = r23
            r0 = r24
            int r1 = r8.top
            if (r1 <= r10) goto L_0x0330
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r2 = 0
            r2 = r11[r2]
            r1.append(r2)
            r1.append(r0)
            r0 = 1
            r0 = r11[r0]
            r1.append(r0)
            r1.append(r12)
            r3 = r20
            r1.append(r3)
            r1.append(r13)
            r1.append(r8)
            r1.append(r14)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x03ac
        L_0x0330:
            r3 = r20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r20 = r4
            r4 = r19
            r1.append(r4)
            r17 = 0
            r4 = r11[r17]
            r1.append(r4)
            r1.append(r0)
            r24 = r0
            r4 = 1
            r0 = r11[r4]
            r1.append(r0)
            r1.append(r12)
            r1.append(r3)
            r1.append(r13)
            r1.append(r8)
            r1.append(r14)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            int r0 = r3 + 1
            r11[r3] = r2
            r1 = 2
            if (r0 < r1) goto L_0x0376
            r0 = r27
            r8 = r18
            r3 = 0
            goto L_0x039a
        L_0x0376:
            r3 = r0
            r8 = r18
            goto L_0x0398
        L_0x037a:
            r3 = r20
            r22 = r23
            r1 = 2
            r17 = 0
            r20 = r4
            r4 = 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r8 = r18
            r0.append(r8)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r0)
        L_0x0398:
            r0 = r27
        L_0x039a:
            if (r2 == r0) goto L_0x03ac
            int r2 = r2 + 1
            r1 = r26
            r27 = r0
            r18 = r8
            r4 = r20
            r23 = r22
            r0 = r25
            goto L_0x0221
        L_0x03ac:
            r9 = r11
        L_0x03ad:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qm1.C12881b.mo12394b(androidx.recyclerview.widget.StaggeredGridLayoutManager, int[], int[]):int[]");
    }

    /* renamed from: c */
    public final C0740i2 mo12395c(int i) {
        if (this.f36857a == null) {
            Log.m105928w("NearbyLiveAutoPlaySelector", "getFeedByPos return for feedList:" + this.f36857a);
            return null;
        }
        WxRecyclerAdapter<?> wxRecyclerAdapter = this.f36858b;
        int c6 = i - (wxRecyclerAdapter != null ? wxRecyclerAdapter.mo85796c6() : 0);
        if (c6 < 0 || c6 >= this.f36857a.size()) {
            Log.m105928w("NearbyLiveAutoPlaySelector", "getFeedByPos return for invalid pos:" + i);
            return null;
        }
        C9493c cVar = this.f36857a.get(c6);
        if (cVar instanceof C0740i2) {
            return (C0740i2) cVar;
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo12396d(int i) {
        if (mo12395c(i) instanceof C0090c) {
            return true;
        }
        boolean z = !(mo12395c(i + 1) instanceof C0797z);
        int i2 = i;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            boolean z2 = (i4 - i3) % 2 == 0 && !(mo12395c(i4 + 1) instanceof C0797z);
            if (!(mo12395c(i4) instanceof C0797z) || (mo12395c(i4) instanceof C0090c) || z2) {
                i2--;
                i3++;
            }
        }
        return (i2 % 2 == 0) && z;
    }
}
