package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.view.View;
import com.tencent.p014mm.autogen.events.StatusSquareItemScrollEvent;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusOtherTopicFriendsActivity;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.textstatus.ui.h */
public final class C43246h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextStatusOtherTopicFriendsActivity f117035d;

    /* renamed from: e */
    public final /* synthetic */ String f117036e;

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.h$a */
    public static final class C43247a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f117037d;

        /* renamed from: e */
        public final /* synthetic */ TextStatusOtherTopicFriendsActivity f117038e;

        public C43247a(String str, TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
            this.f117037d = str;
            this.f117038e = textStatusOtherTopicFriendsActivity;
        }

        public final void run() {
            StatusSquareItemScrollEvent statusSquareItemScrollEvent = new StatusSquareItemScrollEvent();
            String str = this.f117037d;
            TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity = this.f117038e;
            statusSquareItemScrollEvent.f107778d.f107779a = str;
            if (!(str == null || C112551y.m153811k(str))) {
                TextStatusOtherTopicFriendsActivity.C30508a aVar = TextStatusOtherTopicFriendsActivity.f116976t;
                View findViewWithTag = textStatusOtherTopicFriendsActivity.mo67463H7().findViewWithTag("status_avatar_" + str);
                if (findViewWithTag != null) {
                    int[] iArr = new int[2];
                    findViewWithTag.getLocationInWindow(iArr);
                    int i = iArr[0];
                    int i2 = iArr[1];
                    StatusSquareItemScrollEvent.C40172a aVar2 = statusSquareItemScrollEvent.f107778d;
                    aVar2.f107780b = i;
                    aVar2.f107781c = i2;
                }
            }
            statusSquareItemScrollEvent.publish();
        }
    }

    public C43246h(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity, String str) {
        this.f117035d = textStatusOtherTopicFriendsActivity;
        this.f117036e = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[Catch:{ all -> 0x010f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            java.lang.Class<yz2.f2> r0 = yz2.C53673f2.class
            com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity r2 = r1.f117035d
            androidx.lifecycle.i0 r2 = r2.component(r0)
            yz2.f2 r2 = (yz2.C53673f2) r2
            java.lang.String r3 = r1.f117036e
            r2.f150748f = r3
            com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity r2 = r1.f117035d
            com.tencent.mm.plugin.mvvmlist.MvvmList<sz2.b> r3 = r2.f116984n
            if (r3 == 0) goto L_0x011a
            java.util.ArrayList<T> r3 = r3.f272353o
            if (r3 == 0) goto L_0x011a
            r2.getClass()
            java.lang.Class<yz2.v2> r4 = yz2.C16089v2.class
            java.lang.String r5 = "context"
            r6 = 0
            androidx.lifecycle.i0 r7 = r2.component(r0)     // Catch:{ all -> 0x010f }
            yz2.f2 r7 = (yz2.C53673f2) r7     // Catch:{ all -> 0x010f }
            java.lang.String r7 = r7.f150748f     // Catch:{ all -> 0x010f }
            if (r7 == 0) goto L_0x0035
            boolean r9 = z04.C112551y.m153811k(r7)     // Catch:{ all -> 0x010f }
            if (r9 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r9 = 0
            goto L_0x0036
        L_0x0035:
            r9 = 1
        L_0x0036:
            if (r9 != 0) goto L_0x011a
            androidx.lifecycle.i0 r0 = r2.component(r0)     // Catch:{ all -> 0x010f }
            yz2.f2 r0 = (yz2.C53673f2) r0     // Catch:{ all -> 0x010f }
            r9 = 0
            r0.f150748f = r9     // Catch:{ all -> 0x010f }
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r2.mo67463H7()     // Catch:{ all -> 0x010f }
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()     // Catch:{ all -> 0x010f }
            boolean r10 = r0 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter     // Catch:{ all -> 0x010f }
            if (r10 == 0) goto L_0x0050
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r0     // Catch:{ all -> 0x010f }
            goto L_0x0051
        L_0x0050:
            r0 = r9
        L_0x0051:
            if (r0 == 0) goto L_0x0058
            jq3.i r0 = r0.mo82613u6(r6)     // Catch:{ all -> 0x010f }
            goto L_0x0059
        L_0x0058:
            r0 = r9
        L_0x0059:
            boolean r10 = r0 instanceof ez2.C45733q     // Catch:{ all -> 0x010f }
            if (r10 == 0) goto L_0x0060
            ez2.q r0 = (ez2.C45733q) r0     // Catch:{ all -> 0x010f }
            goto L_0x0061
        L_0x0060:
            r0 = r9
        L_0x0061:
            r10 = -1
            if (r0 == 0) goto L_0x0067
            int r11 = r0.f123577e     // Catch:{ all -> 0x010f }
            goto L_0x0068
        L_0x0067:
            r11 = -1
        L_0x0068:
            bl3.r r12 = bl3.C39818r.f106831a     // Catch:{ all -> 0x010f }
            androidx.appcompat.app.AppCompatActivity r13 = r2.getContext()     // Catch:{ all -> 0x010f }
            gy3.C87412m.m108593f(r13, r5)     // Catch:{ all -> 0x010f }
            bl3.r$a r12 = r12.mo62444c(r13)     // Catch:{ all -> 0x010f }
            androidx.lifecycle.i0 r12 = r12.mo75002a(r4)     // Catch:{ all -> 0x010f }
            yz2.v2 r12 = (yz2.C16089v2) r12     // Catch:{ all -> 0x010f }
            java.util.Map<java.lang.String, java.lang.Boolean> r12 = r12.f43236d     // Catch:{ all -> 0x010f }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x010f }
            r13 = 0
        L_0x0082:
            boolean r14 = r3.hasNext()     // Catch:{ all -> 0x010f }
            if (r14 == 0) goto L_0x011a
            java.lang.Object r14 = r3.next()     // Catch:{ all -> 0x010f }
            int r15 = r13 + 1
            if (r13 < 0) goto L_0x010a
            sz2.b r14 = (sz2.C48518b) r14     // Catch:{ all -> 0x010f }
            rz2.h$b r14 = r14.f129772d     // Catch:{ all -> 0x010f }
            java.lang.String r6 = r14.f129192a     // Catch:{ all -> 0x010f }
            java.util.List<rz2.c> r14 = r14.f129193b     // Catch:{ all -> 0x010f }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x010f }
            r8 = 0
        L_0x009d:
            boolean r16 = r14.hasNext()     // Catch:{ all -> 0x010f }
            if (r16 == 0) goto L_0x0104
            java.lang.Object r16 = r14.next()     // Catch:{ all -> 0x010f }
            int r17 = r8 + 1
            if (r8 < 0) goto L_0x00ff
            r9 = r16
            rz2.c r9 = (rz2.C48201c) r9     // Catch:{ all -> 0x010f }
            java.lang.String r9 = r9.field_UserName     // Catch:{ all -> 0x010f }
            boolean r9 = gy3.C87412m.m108589b(r9, r7)     // Catch:{ all -> 0x010f }
            if (r9 == 0) goto L_0x00f5
            if (r11 == r10) goto L_0x00d0
            if (r8 < r11) goto L_0x00d0
            r8 = r12
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch:{ all -> 0x010f }
            boolean r8 = r8.containsKey(r6)     // Catch:{ all -> 0x010f }
            if (r8 != 0) goto L_0x00d0
            if (r0 == 0) goto L_0x00d0
            androidx.appcompat.app.AppCompatActivity r8 = r2.getContext()     // Catch:{ all -> 0x010f }
            gy3.C87412m.m108593f(r8, r5)     // Catch:{ all -> 0x010f }
            r0.mo71230j(r8, r6)     // Catch:{ all -> 0x010f }
        L_0x00d0:
            androidx.lifecycle.i0 r8 = r2.component(r4)     // Catch:{ all -> 0x010f }
            yz2.v2 r8 = (yz2.C16089v2) r8     // Catch:{ all -> 0x010f }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x010f }
            r8.f43238f = r9     // Catch:{ all -> 0x010f }
            androidx.recyclerview.widget.RecyclerView r9 = r8.f43237e     // Catch:{ all -> 0x010f }
            if (r9 == 0) goto L_0x00e5
            int r9 = r9.getMeasuredHeight()     // Catch:{ all -> 0x010f }
            goto L_0x00e6
        L_0x00e5:
            r9 = 0
        L_0x00e6:
            int r9 = r9 / 3
            r8.f43239g = r9     // Catch:{ all -> 0x010f }
            r16 = r2
            r2 = 0
            r9 = 0
            r10 = 1
            yz2.C16089v2.m14974c3(r8, r2, r10, r9)     // Catch:{ all -> 0x00f3 }
            goto L_0x00f8
        L_0x00f3:
            r0 = move-exception
            goto L_0x0111
        L_0x00f5:
            r16 = r2
            r10 = 1
        L_0x00f8:
            r2 = r16
            r8 = r17
            r9 = 0
            r10 = -1
            goto L_0x009d
        L_0x00ff:
            sx3.C64197v.m75542k()     // Catch:{ all -> 0x010f }
            r0 = 0
            throw r0     // Catch:{ all -> 0x010f }
        L_0x0104:
            r10 = 1
            r13 = r15
            r6 = 0
            r10 = -1
            goto L_0x0082
        L_0x010a:
            sx3.C64197v.m75542k()     // Catch:{ all -> 0x010f }
            r0 = 0
            throw r0     // Catch:{ all -> 0x010f }
        L_0x010f:
            r0 = move-exception
            r2 = 0
        L_0x0111:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity"
            java.lang.String r4 = "handleClickBackPosErr"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r2)
        L_0x011a:
            com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity r0 = r1.f117035d
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r0.mo67463H7()
            com.tencent.mm.plugin.textstatus.ui.h$a r2 = new com.tencent.mm.plugin.textstatus.ui.h$a
            java.lang.String r3 = r1.f117036e
            com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity r4 = r1.f117035d
            r2.<init>(r3, r4)
            r0.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.C43246h.run():void");
    }
}
