package com.tencent.p014mm.plugin.finder.feed.model;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import fy3.C32226l;
import gy3.C87413o;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.j0 */
public final class C2804j0 extends C87413o implements C32226l<FinderItem, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ List<FinderItem> f14032d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2804j0(List<? extends FinderItem> list) {
        super(1);
        this.f14032d = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048 A[EDGE_INSN: B:20:0x0048->B:15:0x0048 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r11
            java.lang.String r0 = "removeIt"
            gy3.C87412m.m108594g(r11, r0)
            java.util.List<com.tencent.mm.plugin.finder.storage.FinderItem> r0 = r10.f14032d
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r1 = r0.hasNext()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r0.next()
            r4 = r1
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r4
            long r5 = r4.getLocalId()
            long r7 = r11.getLocalId()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0043
            long r5 = r4.field_id
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0036
            long r7 = r11.field_id
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0043
        L_0x0036:
            int r4 = r4.getCreateTime()
            int r5 = r11.getCreateTime()
            if (r4 != r5) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r4 = 0
            goto L_0x0044
        L_0x0043:
            r4 = 1
        L_0x0044:
            if (r4 == 0) goto L_0x000d
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r1
            if (r1 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.C2804j0.invoke(java.lang.Object):java.lang.Object");
    }
}
