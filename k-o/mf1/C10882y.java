package mf1;

import android.os.Looper;
import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import jq3.C60905o;
import pf1.C11920q;
import rf1.C12982a;
import te3.uc4;

/* renamed from: mf1.y */
public class C10882y extends C12982a {

    /* renamed from: q */
    public static final HashMap<Long, Integer> f32490q = new HashMap<>();

    /* renamed from: o */
    public final Map<Integer, C12982a> f32491o = new LinkedHashMap();

    /* renamed from: p */
    public final MMHandler f32492p = new MMHandler(Looper.myLooper());

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: rf1.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11020b(com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r29, jq3.C60905o r30, android.view.View r31, pf1.C11920q r32, java.lang.String r33) {
        /*
            r28 = this;
            r0 = r28
            r7 = r30
            r8 = r31
            r9 = r32
            java.lang.String r1 = "feed"
            r10 = r29
            gy3.C87412m.m108594g(r10, r1)
            java.lang.String r1 = "holder"
            gy3.C87412m.m108594g(r7, r1)
            java.lang.String r1 = "jumpView"
            gy3.C87412m.m108594g(r8, r1)
            java.lang.String r1 = "infoEx"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.String r1 = "source"
            r11 = r33
            gy3.C87412m.m108594g(r11, r1)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r9.f34827a
            java.lang.String r12 = "info"
            gy3.C87412m.m108594g(r1, r12)
            go1.c r2 = go1.C8368c.f27352a
            int r3 = r30.hashCode()
            go1.a r1 = r0.mo11037g(r1)
            boolean r1 = r2.mo9335b(r3, r1)
            r13 = 8
            if (r1 != 0) goto L_0x004a
            r0.mo12512t(r13)
            java.lang.String r1 = "Finder.FeedJumperCombinationLayoutObserver"
            java.lang.String r2 = "[onBindView] priority not ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            return
        L_0x004a:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r9.f34827a
            java.util.LinkedList<te3.uc4> r1 = r1.style
            java.lang.String r2 = "infoEx.jumpInfo.style"
            gy3.C87412m.m108593f(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0057:
            boolean r2 = r1.hasNext()
            r15 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0072
            java.lang.Object r2 = r1.next()
            r3 = r2
            te3.uc4 r3 = (te3.uc4) r3
            int r3 = r3.f142762h
            r4 = 15
            if (r3 != r4) goto L_0x006e
            r3 = 1
            goto L_0x006f
        L_0x006e:
            r3 = 0
        L_0x006f:
            if (r3 == 0) goto L_0x0057
            goto L_0x0073
        L_0x0072:
            r2 = 0
        L_0x0073:
            te3.uc4 r2 = (te3.uc4) r2
            if (r2 == 0) goto L_0x007a
            te3.ey r1 = r2.f142757N
            goto L_0x007b
        L_0x007a:
            r1 = 0
        L_0x007b:
            if (r1 != 0) goto L_0x007e
            return
        L_0x007e:
            java.util.LinkedList<te3.uc4> r1 = r1.f133169d
            java.lang.String r2 = "combinationStyle.style"
            gy3.C87412m.m108593f(r1, r2)
            java.util.Iterator r16 = r1.iterator()
            r5 = 0
        L_0x008a:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0218
            java.lang.Object r1 = r16.next()
            te3.uc4 r1 = (te3.uc4) r1
            java.util.Map<java.lang.Integer, rf1.a> r2 = r0.f32491o
            int r1 = r1.f142762h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r1 = r2.get(r1)
            r4 = r1
            rf1.a r4 = (rf1.C12982a) r4
            if (r5 != 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r5.f37022k = r4
        L_0x00ac:
            if (r4 == 0) goto L_0x00dd
            android.view.View r3 = r4.f37012a
            if (r3 == 0) goto L_0x00dd
            r1 = r4
            r2 = r29
            r17 = r3
            r3 = r30
            r14 = r4
            r4 = r17
            r18 = r5
            r5 = r32
            r19 = 0
            r6 = r33
            r1.mo11020b(r2, r3, r4, r5, r6)
            android.view.ViewGroup$LayoutParams r1 = r17.getLayoutParams()
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            gy3.C87412m.m108592e(r1, r2)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r2 = 8388691(0x800053, float:1.175506E-38)
            r1.gravity = r2
            r2 = r17
            r2.setLayoutParams(r1)
            goto L_0x00e2
        L_0x00dd:
            r14 = r4
            r18 = r5
            r19 = 0
        L_0x00e2:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r9.f34830d
            if (r1 == 0) goto L_0x00eb
            long r1 = r1.getItemId()
            goto L_0x00ed
        L_0x00eb:
            r1 = -1
        L_0x00ed:
            java.util.HashMap<java.lang.Long, java.lang.Integer> r3 = f32490q
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.Object r3 = r3.get(r4)
            r4 = -1
            if (r3 != 0) goto L_0x00fe
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
        L_0x00fe:
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != r4) goto L_0x0161
            if (r18 != 0) goto L_0x0161
            if (r14 == 0) goto L_0x010d
            android.view.View r3 = r14.f37012a
            goto L_0x010e
        L_0x010d:
            r3 = 0
        L_0x010e:
            if (r3 != 0) goto L_0x0112
            r6 = 0
            goto L_0x0154
        L_0x0112:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r19)
            r5.mo10233c(r6)
            java.lang.Object[] r21 = r5.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver"
            java.lang.String r23 = "onBindView"
            java.lang.String r24 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r3
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r21 = "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver"
            java.lang.String r22 = "onBindView"
            java.lang.String r23 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
        L_0x0154:
            if (r14 == 0) goto L_0x015c
            te3.uc4 r3 = r14.f37017f
            if (r3 == 0) goto L_0x015c
            int r4 = r3.f142762h
        L_0x015c:
            r0.mo11102x(r1, r4)
            goto L_0x0215
        L_0x0161:
            r6 = 0
            if (r3 == r4) goto L_0x01cb
            if (r14 == 0) goto L_0x0170
            te3.uc4 r5 = r14.f37017f
            if (r5 == 0) goto L_0x0170
            int r5 = r5.f142762h
            if (r5 != r3) goto L_0x0170
            r3 = 1
            goto L_0x0171
        L_0x0170:
            r3 = 0
        L_0x0171:
            if (r3 == 0) goto L_0x01cb
            if (r14 == 0) goto L_0x0178
            android.view.View r3 = r14.f37012a
            goto L_0x0179
        L_0x0178:
            r3 = 0
        L_0x0179:
            if (r3 != 0) goto L_0x017c
            goto L_0x01bd
        L_0x017c:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r17 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r4)
            java.lang.Object[] r19 = r5.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver"
            java.lang.String r21 = "onBindView"
            java.lang.String r22 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r4 = r5.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver"
            java.lang.String r20 = "onBindView"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x01bd:
            if (r14 == 0) goto L_0x01c6
            te3.uc4 r3 = r14.f37017f
            if (r3 == 0) goto L_0x01c6
            int r4 = r3.f142762h
            goto L_0x01c7
        L_0x01c6:
            r4 = -1
        L_0x01c7:
            r0.mo11102x(r1, r4)
            goto L_0x0215
        L_0x01cb:
            if (r14 == 0) goto L_0x01d0
            android.view.View r1 = r14.f37012a
            goto L_0x01d1
        L_0x01d0:
            r1 = 0
        L_0x01d1:
            if (r1 != 0) goto L_0x01d4
            goto L_0x0215
        L_0x01d4:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r2.mo10233c(r3)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver"
            java.lang.String r21 = "onBindView"
            java.lang.String r22 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver"
            java.lang.String r20 = "onBindView"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x0215:
            r5 = r14
            goto L_0x008a
        L_0x0218:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r9.f34827a
            gy3.C87412m.m108594g(r1, r12)
            go1.c r2 = go1.C8368c.f27352a
            go1.a r1 = r0.mo11037g(r1)
            r2.mo9337d(r7, r8, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mf1.C10882y.mo11020b(com.tencent.mm.plugin.finder.model.BaseFinderFeed, jq3.o, android.view.View, pf1.q, java.lang.String):void");
    }

    /* renamed from: i */
    public boolean mo11021i(C11920q qVar) {
        C87412m.m108594g(qVar, "infoEx");
        return true;
    }

    /* renamed from: m */
    public void mo11100m(C60905o oVar, View view, C11920q qVar) {
        C11920q qVar2;
        BaseFinderFeed baseFinderFeed;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        super.mo11100m(oVar, view, qVar);
        BaseFinderFeed baseFinderFeed2 = qVar.f34830d;
        long j = -1;
        int i = f32490q.get(Long.valueOf(baseFinderFeed2 != null ? baseFinderFeed2.getItemId() : -1));
        if (i == null) {
            i = -1;
        }
        C12982a aVar = (C12982a) ((LinkedHashMap) this.f32491o).get(Integer.valueOf(i.intValue()));
        C12982a aVar2 = aVar != null ? aVar.f37022k : null;
        if (!(aVar == null || (qVar2 = aVar.f37015d) == null || (baseFinderFeed = qVar2.f34830d) == null)) {
            j = baseFinderFeed.getItemId();
        }
        long j2 = j;
        if (aVar2 != null) {
            uc4 uc4 = aVar2.f37017f;
            int i2 = uc4 != null ? uc4.f142772u : 0;
            this.f32492p.removeCallbacksAndMessages((Object) null);
            this.f32492p.postDelayed(new C10879x(aVar, aVar2, this, j2), ((long) i2) * 1000);
        }
    }

    /* renamed from: n */
    public void mo11101n(C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        super.mo11101n(oVar, view, qVar);
        this.f32492p.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: x */
    public final void mo11102x(long j, int i) {
        f32490q.put(Long.valueOf(j), Integer.valueOf(i));
    }
}
