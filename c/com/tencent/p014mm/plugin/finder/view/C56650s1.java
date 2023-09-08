package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.autogen.events.FinderExposeInfoChangeEvent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.s1 */
public final class C56650s1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderExposeInfoChangeEvent f162387d;

    /* renamed from: e */
    public final /* synthetic */ FinderExposeChangedEventListener f162388e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56650s1(FinderExposeInfoChangeEvent finderExposeInfoChangeEvent, FinderExposeChangedEventListener finderExposeChangedEventListener) {
        super(0);
        this.f162387d = finderExposeInfoChangeEvent;
        this.f162388e = finderExposeChangedEventListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0024, code lost:
        r6 = r3.f133475d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r10 = this;
            com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent r0 = r10.f162387d
            com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent$a r0 = r0.f154769d
            long r1 = r0.f154770a
            te3.ff1 r3 = r0.f154771b
            int r0 = r0.f154772c
            com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener r4 = r10.f162388e
            java.lang.String r4 = r4.mo2474f()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[FinderExposeChangedEventListener] feedId="
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = " commentList="
            r5.append(r6)
            if (r3 == 0) goto L_0x0031
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r6 = r3.f133475d
            if (r6 == 0) goto L_0x0031
            int r6 = r6.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0032
        L_0x0031:
            r6 = 0
        L_0x0032:
            r5.append(r6)
            java.lang.String r6 = " totalCommentCount="
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener r4 = r10.f162388e
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo2473e(r1)
            if (r4 == 0) goto L_0x008e
            com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener r5 = r10.f162388e
            java.lang.String r6 = r5.mo2474f()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[FinderExposeChangedEventListener] feedObject: "
            r7.append(r8)
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r4.getFeedObject()
            int r8 = r8.hashCode()
            r7.append(r8)
            java.lang.String r8 = ", "
            r7.append(r8)
            long r8 = r4.getId()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            if (r3 == 0) goto L_0x0086
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r6 = r3.f133475d
            java.lang.String r7 = "exposeInfo.commentList"
            gy3.C87412m.m108593f(r6, r7)
            r4.setCommentList(r6)
        L_0x0086:
            if (r0 < 0) goto L_0x008b
            r4.setCommentCount(r0)
        L_0x008b:
            r5.mo2475g(r1, r3)
        L_0x008e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C56650s1.invoke():java.lang.Object");
    }
}
