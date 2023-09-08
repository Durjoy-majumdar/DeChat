package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.os.Process;
import android.widget.AbsListView;
import by0.C16825a;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.pluginsdk.model.C19449k;
import com.tencent.p014mm.pluginsdk.model.C19459p;
import com.tencent.p014mm.pluginsdk.model.C19462s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fx0.C20729b;
import fy0.C20734b;
import gc0.C20828a;
import j20.C117292a;
import java.util.ArrayList;
import q73.C22079o;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.p4 */
public class C18477p4 implements AbsListView.OnScrollListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineUI f51303d;

    public C18477p4(BizTimeLineUI bizTimeLineUI) {
        this.f51303d = bizTimeLineUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$8"
            java.lang.String r1 = "android/widget/AbsListView$OnScrollListener"
            java.lang.String r2 = "onScroll"
            java.lang.String r3 = "(Landroid/widget/AbsListView;III)V"
            r4 = r24
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r0 = r6.f51303d
            java.util.Set<q73.o> r0 = r0.f50220M
            java.util.Iterator r0 = r0.iterator()
        L_0x0041:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r0.next()
            q73.o r1 = (q73.C22079o) r1
            r2 = r28
            r1.onScroll(r7, r8, r9, r2)
            goto L_0x0041
        L_0x0053:
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r0 = r6.f51303d
            int r1 = r8 + r9
            r2 = 1
            int r1 = r1 - r2
            r0.mo22781I7(r8, r1)
            wd3.j r0 = wd3.C118762j.f355306a
            boolean r0 = r0.mo183489b(r2)
            r3 = 0
            if (r0 == 0) goto L_0x0240
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r0 = r6.f51303d
            boolean r4 = r0.f50211D
            java.lang.String r5 = "MicroMsg.BizTimeLineUI"
            if (r4 != 0) goto L_0x023b
            boolean r4 = r0.f50232Z
            if (r4 == 0) goto L_0x0073
            goto L_0x023b
        L_0x0073:
            if (r8 < r1) goto L_0x0077
            goto L_0x0240
        L_0x0077:
            int r4 = r0.f50214G
            com.tencent.mm.plugin.bizui.widget.StoryListView r9 = r0.f50235f
            int r9 = r9.getMeasuredHeight()
            if (r4 == r9) goto L_0x0089
            com.tencent.mm.plugin.bizui.widget.StoryListView r4 = r0.f50235f
            int r4 = r4.getMeasuredHeight()
            r0.f50214G = r4
        L_0x0089:
            r4 = 2
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r26)
            r9[r3] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r9[r2] = r10
            java.lang.String r10 = "alvinluo updateVisibleImageView firstVisibleItem: %d, lastVisibleItem: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r5, r10, r9)
            java.util.HashSet<java.lang.String> r9 = r0.f50219L
            r9.clear()
            r9 = r8
            r10 = 0
        L_0x00a4:
            if (r9 > r1) goto L_0x0218
            if (r9 != 0) goto L_0x00ad
            int r10 = r10 + 1
            r3 = 2
            goto L_0x0211
        L_0x00ad:
            int r11 = r0.f50215H
            if (r9 <= r11) goto L_0x00b7
            int r11 = r0.f50216I
            if (r9 >= r11) goto L_0x00b7
            r11 = 1
            goto L_0x00b8
        L_0x00b7:
            r11 = 0
        L_0x00b8:
            com.tencent.mm.plugin.bizui.widget.StoryListView r12 = r0.f50235f
            android.view.View r12 = r12.getChildAt(r10)
            int r10 = r10 + 1
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r13 = r0.f50246s
            int r14 = r9 + -1
            com.tencent.mm.storage.o0 r13 = r13.getItem(r14)
            if (r12 == 0) goto L_0x020c
            if (r13 != 0) goto L_0x00ce
            goto L_0x020c
        L_0x00ce:
            int r14 = r12.getTop()
            r15 = 2131298050(0x7f090702, float:1.8214062E38)
            android.view.View r15 = r12.findViewById(r15)
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            if (r15 != 0) goto L_0x00df
            goto L_0x020c
        L_0x00df:
            java.lang.Class<gw0.b> r16 = gw0.C76073b.class
            di3.d r16 = di3.C86312j.m106911c(r16)
            r2 = r16
            gw0.b r2 = (gw0.C76073b) r2
            long r3 = r13.field_msgId
            r17 = r10
            java.lang.String r10 = r13.field_content
            s90.f r2 = r2.mo94597JZ(r3, r10)
            java.util.LinkedList<s90.j> r2 = r2.f226295i
            int r3 = r15.getChildCount()
            boolean r4 = r13.field_isExpand
            if (r4 == 0) goto L_0x0102
            int r4 = r2.size()
            goto L_0x010b
        L_0x0102:
            int r4 = r2.size()
            r10 = 2
            int r4 = java.lang.Math.min(r4, r10)
        L_0x010b:
            r10 = 0
            r13 = 0
        L_0x010d:
            if (r10 >= r3) goto L_0x020a
            r18 = r3
            android.view.View r3 = r15.getChildAt(r10)
            r19 = r15
            boolean r15 = r3 instanceof android.view.ViewStub
            if (r15 == 0) goto L_0x0122
        L_0x011b:
            r22 = r2
            r23 = r4
            r3 = 2
            goto L_0x01fe
        L_0x0122:
            int r15 = r3.getVisibility()
            if (r15 == 0) goto L_0x0129
            goto L_0x011b
        L_0x0129:
            if (r13 >= r4) goto L_0x011b
            java.lang.Object r15 = r2.get(r13)
            s90.j r15 = (s90.C77630j) r15
            int r13 = r13 + 1
            if (r15 != 0) goto L_0x0136
            goto L_0x011b
        L_0x0136:
            int r20 = r13 + -1
            r21 = 0
            r22 = r2
            int r2 = r3.getId()
            r23 = r4
            if (r20 != 0) goto L_0x017d
            r4 = 2131298096(0x7f090730, float:1.8214156E38)
            if (r2 != r4) goto L_0x0153
            r4 = 2131300531(0x7f0910b3, float:1.8219094E38)
            android.view.View r2 = r3.findViewById(r4)
        L_0x0150:
            r21 = r2
            goto L_0x017a
        L_0x0153:
            r4 = 2131298092(0x7f09072c, float:1.8214147E38)
            if (r2 != r4) goto L_0x0160
            r2 = 2131298126(0x7f09074e, float:1.8214216E38)
            android.view.View r2 = r3.findViewById(r2)
            goto L_0x0150
        L_0x0160:
            r4 = 2131298098(0x7f090732, float:1.821416E38)
            if (r2 != r4) goto L_0x016d
            r2 = 2131300509(0x7f09109d, float:1.821905E38)
            android.view.View r2 = r3.findViewById(r2)
            goto L_0x0150
        L_0x016d:
            r4 = 2131298049(0x7f090701, float:1.821406E38)
            if (r2 != r4) goto L_0x017a
            r2 = 2131300531(0x7f0910b3, float:1.8219094E38)
            android.view.View r2 = r3.findViewById(r2)
            goto L_0x0150
        L_0x017a:
            r20 = r13
            goto L_0x018b
        L_0x017d:
            r20 = r13
            r4 = 2131298049(0x7f090701, float:1.821406E38)
            r13 = 2131300531(0x7f0910b3, float:1.8219094E38)
            if (r2 != r4) goto L_0x018b
            android.view.View r21 = r3.findViewById(r13)
        L_0x018b:
            r2 = r21
            kw0.a r3 = kw0.C46746a.f125826a
            int r3 = r3.mo71976i(r12, r2)
            int r3 = r3 + r14
            if (r2 == 0) goto L_0x01cc
            r4 = 2131297867(0x7f09064b, float:1.8213691E38)
            if (r11 == 0) goto L_0x01ab
            java.lang.Object r4 = r2.getTag(r4)
            boolean r13 = r4 instanceof java.lang.String
            if (r13 == 0) goto L_0x01cc
            java.util.HashSet<java.lang.String> r13 = r0.f50219L
            java.lang.String r4 = (java.lang.String) r4
            r13.add(r4)
            goto L_0x01cc
        L_0x01ab:
            int r13 = r2.getMeasuredHeight()
            int r13 = r13 + r3
            if (r13 < 0) goto L_0x01b8
            int r13 = r0.f50214G
            if (r3 >= r13) goto L_0x01b8
            r13 = 1
            goto L_0x01b9
        L_0x01b8:
            r13 = 0
        L_0x01b9:
            if (r13 == 0) goto L_0x01cc
            java.lang.Object r4 = r2.getTag(r4)
            boolean r13 = r4 instanceof java.lang.String
            if (r13 == 0) goto L_0x01ca
            java.util.HashSet<java.lang.String> r13 = r0.f50219L
            java.lang.String r4 = (java.lang.String) r4
            r13.add(r4)
        L_0x01ca:
            r4 = 1
            goto L_0x01cd
        L_0x01cc:
            r4 = r11
        L_0x01cd:
            r13 = 5
            java.lang.Object[] r13 = new java.lang.Object[r13]
            if (r2 != 0) goto L_0x01d4
            r2 = 1
            goto L_0x01d5
        L_0x01d4:
            r2 = 0
        L_0x01d5:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r21 = 0
            r13[r21] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = 1
            r13[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r3 = 2
            r13[r3] = r2
            r2 = 3
            java.lang.String r15 = r15.f226325d
            r13[r2] = r15
            r2 = 4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r13[r2] = r4
            java.lang.String r2 = "alvinluo targetImageView == null: %b, viewTop: %d, itemTop: %d, title: %s, onScreen: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r5, r2, r13)
            r13 = r20
        L_0x01fe:
            int r10 = r10 + 1
            r3 = r18
            r15 = r19
            r2 = r22
            r4 = r23
            goto L_0x010d
        L_0x020a:
            r3 = 2
            goto L_0x020f
        L_0x020c:
            r17 = r10
            goto L_0x020a
        L_0x020f:
            r10 = r17
        L_0x0211:
            int r9 = r9 + 1
            r2 = 1
            r3 = 0
            r4 = 2
            goto L_0x00a4
        L_0x0218:
            com.tencent.mm.pluginsdk.model.k r2 = com.tencent.p014mm.pluginsdk.model.C19449k.f54939a
            java.util.HashSet<java.lang.String> r2 = r0.f50219L
            java.lang.String r3 = "urlSet"
            gy3.C87412m.m108594g(r2, r3)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r3.addAll(r2)
            long r4 = java.lang.System.currentTimeMillis()
            com.tencent.mm.pluginsdk.model.r r2 = new com.tencent.mm.pluginsdk.model.r
            r2.<init>(r3, r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            r0.f50215H = r8
            r0.f50216I = r1
            goto L_0x0240
        L_0x023b:
            java.lang.String r0 = "alvinluo updateVisibleImageView ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
        L_0x0240:
            int r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI.f50206R0
            if (r0 == r8) goto L_0x024a
            com.tencent.p014mm.storage.C19641z0.f55647c = r8
            qx0.C22136a.f62622e = r8
            fx0.C20729b.f58604d = r8
        L_0x024a:
            r0 = 0
            android.view.View r1 = r7.getChildAt(r0)
            if (r1 == 0) goto L_0x0278
            int r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI.f50206R0
            if (r2 != r8) goto L_0x0263
            android.view.View r0 = r7.getChildAt(r0)
            int r0 = r0.getTop()
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r2 = r6.f51303d
            int r2 = r2.f50248u
            if (r0 == r2) goto L_0x0270
        L_0x0263:
            by0.a r0 = by0.C16825a.f45444a
            by0.a$a r2 = by0.C16825a.C16826a.SCROLL
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r3 = r6.f51303d
            com.tencent.mm.plugin.bizui.widget.StoryListView r4 = r3.f50235f
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r3 = r3.f50246s
            r0.mo17863a(r2, r4, r3)
        L_0x0270:
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r0 = r6.f51303d
            int r1 = r1.getTop()
            r0.f50248u = r1
        L_0x0278:
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI.f50206R0 = r8
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r0 = r6.f51303d
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r0 = r0.f50249v
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$a r0 = r0.f51083q
            if (r0 != 0) goto L_0x0283
            goto L_0x0291
        L_0x0283:
            if (r8 != 0) goto L_0x028f
            int r1 = r0.f51090g
            if (r1 == r8) goto L_0x028f
            int r1 = r0.f51084a
            r2 = 1
            int r1 = r1 + r2
            r0.f51084a = r1
        L_0x028f:
            r0.f51090g = r8
        L_0x0291:
            com.tencent.mm.plugin.brandservice.ui.timeline.r4$a r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C68777r4.f197582a
            if (r0 != 0) goto L_0x0296
            goto L_0x02b9
        L_0x0296:
            int r1 = r0.f51351f
            if (r1 == 0) goto L_0x029b
            goto L_0x02b9
        L_0x029b:
            gy3.C87412m.m108591d(r0)
            int r0 = r0.f51350e
            if (r0 != 0) goto L_0x02a3
            goto L_0x02b9
        L_0x02a3:
            com.tencent.mm.plugin.brandservice.ui.timeline.r4$a r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C68777r4.f197582a
            gy3.C87412m.m108591d(r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C68777r4.f197583b
            long r1 = r1 - r3
            int r2 = (int) r1
            r0.f51351f = r2
            java.lang.String r0 = "MicroMsg.BizTimeReport"
            java.lang.String r1 = "markFirstScroll"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x02b9:
            java.lang.String r0 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$8"
            java.lang.String r1 = "android/widget/AbsListView$OnScrollListener"
            java.lang.String r2 = "onScroll"
            java.lang.String r3 = "(Landroid/widget/AbsListView;III)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18477p4.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        AbsListView absListView2 = absListView;
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView2);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        this.f51303d.f50217J = i2;
        Log.m105919d("MicroMsg.BizTimeLineUI", "onScrollStateChanged scrollState=%d", Integer.valueOf(i));
        if (i2 == 2) {
            this.f51303d.f50227U = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcBizEnable(), C40318k.m43492a().getHcBizDelay(), C40318k.m43492a().getHcBizCPU(), C40318k.m43492a().getHcBizIO(), C40318k.m43492a().getHcBizThr() ? Process.myTid() : 0, C40318k.m43492a().getHcBizTimeout(), 903, C40318k.m43492a().getHcBizAction(), "MicroMsg.BizTimeLineUI");
            Log.m105919d("MicroMsg.BizTimeLineUI", "summer hardcoder biz startPerformance [%s] [%s]", 903, Integer.valueOf(this.f51303d.f50227U));
        }
        for (C22079o onScrollStateChanged : this.f51303d.f50220M) {
            onScrollStateChanged.onScrollStateChanged(absListView2, i2);
        }
        int i3 = C20734b.f58616a;
        C20828a.m22825b().mo32525n(i2);
        if (i2 == 0 || i2 == 1) {
            C19449k kVar = C19449k.f54939a;
            if (C19449k.f54943e) {
                MMHandlerThread.postToMainThread(new C19459p(System.currentTimeMillis()));
            }
        } else {
            C19449k kVar2 = C19449k.f54939a;
            if (!C19449k.f54943e) {
                MMHandlerThread.postToMainThread(new C19462s(System.currentTimeMillis()));
            }
        }
        C16825a aVar = C16825a.f45444a;
        C16825a.f45455l = i2;
        if (i2 == 0) {
            BizTimeLineUI bizTimeLineUI = this.f51303d;
            bizTimeLineUI.f50246s.mo23140d(bizTimeLineUI.f50235f.getFirstVisiblePosition() - this.f51303d.f50235f.getHeaderViewsCount(), this.f51303d.f50235f.getLastVisiblePosition());
            C16825a.C16826a aVar2 = C16825a.C16826a.IDLE;
            BizTimeLineUI bizTimeLineUI2 = this.f51303d;
            aVar.mo17863a(aVar2, bizTimeLineUI2.f50235f, bizTimeLineUI2.f50246s);
            C20729b bVar = C20729b.f58601a;
            BizTimeLineUI bizTimeLineUI3 = this.f51303d;
            bVar.mo32440a(bizTimeLineUI3.f50235f, bizTimeLineUI3.f50246s);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
