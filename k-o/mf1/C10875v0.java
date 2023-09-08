package mf1;

import fy3.C32226l;
import gy3.C87413o;
import jq3.C60905o;
import rf1.C12982a;
import rx3.C13598b0;

/* renamed from: mf1.v0 */
public final class C10875v0 extends C87413o implements C32226l<C12982a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60905o f32469d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10875v0(C60905o oVar) {
        super(1);
        this.f32469d = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001b, code lost:
        r4 = r4.f34830d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            rf1.a r1 = (rf1.C12982a) r1
            java.lang.String r2 = "observer"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onJumpViewUnFocus feedId="
            r2.append(r3)
            pf1.q r4 = r1.f37015d
            r5 = 0
            if (r4 == 0) goto L_0x0024
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r4.f34830d
            if (r4 == 0) goto L_0x0024
            long r7 = r4.getItemId()
            goto L_0x0025
        L_0x0024:
            r7 = r5
        L_0x0025:
            java.lang.String r4 = o40.C61926c.m72691p(r7)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "Finder.BaseAdFeedJumperUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            jq3.o r2 = r0.f32469d
            java.lang.Object r7 = r2.f173503E
            boolean r8 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            r9 = 0
            if (r8 == 0) goto L_0x0041
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
            goto L_0x0042
        L_0x0041:
            r7 = r9
        L_0x0042:
            if (r7 == 0) goto L_0x00b7
            er1.w3 r8 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r7.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.getFeedObject()
            boolean r8 = r8.mo83872H0(r10)
            if (r8 == 0) goto L_0x00b7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            long r10 = r7.getItemId()
            r8.append(r10)
            java.lang.String r3 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            r3 = 1
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "hasObserver"
            r14.put(r4, r3)
            pf1.q r3 = r1.f37015d
            if (r3 == 0) goto L_0x0080
            pf1.p r4 = r3.f34832f
            goto L_0x0081
        L_0x0080:
            r4 = r9
        L_0x0081:
            boolean r7 = r4 instanceof pf1.C11916o
            if (r7 == 0) goto L_0x0088
            r9 = r4
            pf1.o r9 = (pf1.C11916o) r9
        L_0x0088:
            if (r9 == 0) goto L_0x008e
            long r7 = r9.f34786i
            r15 = r7
            goto L_0x008f
        L_0x008e:
            r15 = r5
        L_0x008f:
            if (r3 == 0) goto L_0x0099
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r3.f34830d
            if (r3 == 0) goto L_0x0099
            long r5 = r3.getItemId()
        L_0x0099:
            r11 = r5
            bl3.r r3 = bl3.C39818r.f106831a
            android.content.Context r2 = r2.f173499A
            java.lang.String r4 = "holder.context"
            gy3.C87412m.m108593f(r2, r4)
            bl3.r$a r2 = r3.mo62443b(r2)
            java.lang.Class<rs1.t> r3 = rs1.C13448t.class
            bl3.t r2 = r2.mo62449e(r3)
            r10 = r2
            rs1.t r10 = (rs1.C13448t) r10
            if (r10 == 0) goto L_0x00b7
            java.lang.String r13 = "onJumpViewUnFocus"
            r10.mo12876c3(r11, r13, r14, r15)
        L_0x00b7:
            pf1.q r2 = r1.f37015d
            android.view.View r3 = r1.f37012a
            jq3.o r4 = r0.f32469d
            if (r2 == 0) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            r5 = 0
            r2.f34846t = r5
            android.view.View r5 = r4.f44854d
            r6 = 2131302959(0x7f091a2f, float:1.8224019E38)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r5.setTag(r6, r7)
            r1.mo11101n(r4, r3, r2)
        L_0x00d1:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mf1.C10875v0.invoke(java.lang.Object):java.lang.Object");
    }
}
