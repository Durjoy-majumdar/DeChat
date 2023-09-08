package hr1;

import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hr1.b */
public final class C60137b extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f171668d;

    /* renamed from: e */
    public final /* synthetic */ C60134a f171669e;

    public C60137b(RecyclerView recyclerView, C60134a aVar) {
        this.f171668d = recyclerView;
        this.f171669e = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r22, int r23) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/video/autoplay/FinderFeedSelectorAdapter$bindPrepareFeedListener$1$1"
            java.lang.String r1 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r2 = "onScrollStateChanged"
            java.lang.String r3 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            r4 = r21
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "recyclerView"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            java.lang.String r1 = "onScrollStateChanged"
            java.lang.String r2 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r3 = "com/tencent/mm/plugin/finder/video/autoplay/FinderFeedSelectorAdapter$bindPrepareFeedListener$1$1"
            if (r23 != 0) goto L_0x025d
            androidx.recyclerview.widget.RecyclerView r4 = r6.f171668d
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r4.getLayoutManager()
            boolean r5 = r4 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r5 == 0) goto L_0x0043
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            goto L_0x0044
        L_0x0043:
            r4 = 0
        L_0x0044:
            r5 = -1
            if (r4 == 0) goto L_0x004c
            int r4 = r4.mo16957C()
            goto L_0x004d
        L_0x004c:
            r4 = -1
        L_0x004d:
            r9 = 32
            java.lang.String r10 = "FinderFeedSelectorAdapter"
            if (r4 != r5) goto L_0x006e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "bindPrepareFeedListener: invalid pos = "
            r5.append(r7)
            r5.append(r4)
            r5.append(r9)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            j20.C117292a.m165361g(r6, r3, r2, r1, r0)
            return
        L_0x006e:
            hr1.a r5 = r6.f171669e
            int r5 = r5.f171661g
            r11 = 2
            r12 = 1
            if (r5 == r12) goto L_0x007c
            if (r5 == r11) goto L_0x0079
            goto L_0x007c
        L_0x0079:
            int r5 = r4 + -1
            goto L_0x007e
        L_0x007c:
            int r5 = r4 + 1
        L_0x007e:
            androidx.recyclerview.widget.RecyclerView$e r7 = r22.getAdapter()
            java.lang.String r13 = "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>"
            gy3.C87412m.m108592e(r7, r13)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r7 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r7
            java.util.List r7 = r7.getData()
            if (r5 < 0) goto L_0x0242
            int r14 = r7.size()
            if (r5 < r14) goto L_0x0097
            goto L_0x0242
        L_0x0097:
            androidx.recyclerview.widget.RecyclerView r9 = r6.f171668d
            r14 = 0
            androidx.recyclerview.widget.RecyclerView$z r9 = r9.mo17024J0(r5, r14)
            boolean r15 = r9 instanceof jq3.C60905o
            if (r15 == 0) goto L_0x00a5
            jq3.o r9 = (jq3.C60905o) r9
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r9 == 0) goto L_0x00ab
            java.lang.Object r15 = r9.f173503E
            goto L_0x00ac
        L_0x00ab:
            r15 = 0
        L_0x00ac:
            boolean r8 = r15 instanceof cm1.C55018j0
            if (r8 == 0) goto L_0x00b3
            cm1.j0 r15 = (cm1.C55018j0) r15
            goto L_0x00b4
        L_0x00b3:
            r15 = 0
        L_0x00b4:
            if (r9 == 0) goto L_0x021e
            if (r15 != 0) goto L_0x00ba
            goto L_0x021e
        L_0x00ba:
            int r8 = r9.f44859i
            hr1.a r14 = r6.f171669e
            r16 = r0
            int r0 = r14.f171661g
            if (r0 == r12) goto L_0x00ca
            if (r0 == r11) goto L_0x00c7
            goto L_0x00ca
        L_0x00c7:
            int r0 = r4 + -1
            goto L_0x00cc
        L_0x00ca:
            int r0 = r4 + 1
        L_0x00cc:
            r11 = 46
            java.lang.String r12 = " nextPos:"
            if (r5 == r0) goto L_0x0103
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "isNextFeed return for curPos:"
            r13.append(r15)
            r13.append(r4)
            r13.append(r12)
            r13.append(r0)
            java.lang.String r0 = " position:"
            r13.append(r0)
            r13.append(r5)
            java.lang.String r0 = " curScrollDirection:"
            r13.append(r0)
            int r0 = r14.f171661g
            r13.append(r0)
            r13.append(r11)
            java.lang.String r0 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x0182
        L_0x0103:
            androidx.recyclerview.widget.RecyclerView r0 = r14.f171656b
            gy3.C87412m.m108591d(r0)
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            gy3.C87412m.m108592e(r0, r13)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r0
            java.util.List r0 = r0.getData()
            java.lang.Object r0 = r0.get(r5)
            jq3.c r0 = (jq3.C9493c) r0
            int r13 = r15.mo75c()
            int r14 = r0.mo75c()
            java.lang.String r11 = " nextFeedInSource:"
            if (r13 == r14) goto L_0x014f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "isNextFeed return for nextFeedType:"
            r13.append(r14)
            int r14 = r15.mo75c()
            r13.append(r14)
            r13.append(r11)
            int r0 = r0.mo75c()
            r13.append(r0)
            r0 = 46
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x0182
        L_0x014f:
            long r13 = r15.getItemId()
            long r18 = r0.getItemId()
            int r20 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r20 == 0) goto L_0x0185
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "isNextFeed return for nextFeedId:"
            r13.append(r14)
            int r14 = r15.mo75c()
            r13.append(r14)
            r13.append(r11)
            long r14 = r0.getItemId()
            r13.append(r14)
            r0 = 46
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x0182:
            r17 = 0
            goto L_0x0187
        L_0x0185:
            r17 = 1
        L_0x0187:
            java.lang.String r0 = " holder"
            java.lang.String r11 = " type:"
            java.lang.String r13 = "bindPrepareFeedListener curPos:"
            if (r17 == 0) goto L_0x01f7
            hr1.a r14 = r6.f171669e
            er1.l r14 = r14.mo85113d(r5, r9)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            r15.append(r4)
            r15.append(r12)
            r15.append(r5)
            r15.append(r11)
            r15.append(r8)
            r15.append(r0)
            r15.append(r9)
            java.lang.String r0 = " feed:"
            r15.append(r0)
            if (r14 == 0) goto L_0x01c2
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r14.f168206d
            if (r0 == 0) goto L_0x01c2
            java.lang.String r8 = r0.getDescription()
            goto L_0x01c3
        L_0x01c2:
            r8 = 0
        L_0x01c3:
            r15.append(r8)
            java.lang.String r0 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            hr1.a r0 = r6.f171669e
            qt1.c r4 = r0.f171663i
            java.lang.String r5 = "onNextFeedPrepare begin"
            r4.mo12482c(r5)
            java.lang.String r4 = "dispatchOnNextFeedPrepare"
            boolean r4 = r0.mo85114e(r14, r4)
            if (r4 == 0) goto L_0x01ef
            hr1.a$a r4 = r0.f171658d
            if (r4 == 0) goto L_0x01ef
            gy3.C87412m.m108591d(r14)
            jq3.o r5 = r14.f168209g
            gy3.C87412m.m108591d(r5)
            int r8 = r14.f168208f
            r4.mo79666n0(r7, r14, r5, r8)
        L_0x01ef:
            qt1.c r0 = r0.f171663i
            java.lang.String r4 = "onNextFeedPrepare end"
            r0.mo12482c(r4)
            goto L_0x021b
        L_0x01f7:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r13)
            r7.append(r4)
            r7.append(r12)
            r7.append(r5)
            r7.append(r11)
            r7.append(r8)
            r7.append(r0)
            r7.append(r9)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x021b:
            r0 = r16
            goto L_0x025d
        L_0x021e:
            r16 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "bindPrepareFeedListener: invalid holder or item  holder="
            r0.append(r4)
            r0.append(r9)
            java.lang.String r4 = ", item="
            r0.append(r4)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r0 = r16
            j20.C117292a.m165361g(r6, r3, r2, r1, r0)
            return
        L_0x0242:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "bindPrepareFeedListener: pos out of range, nextPos= "
            r4.append(r7)
            r4.append(r5)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            j20.C117292a.m165361g(r6, r3, r2, r1, r0)
            return
        L_0x025d:
            j20.C117292a.m165361g(r6, r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hr1.C60137b.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/video/autoplay/FinderFeedSelectorAdapter$bindPrepareFeedListener$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/autoplay/FinderFeedSelectorAdapter$bindPrepareFeedListener$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
