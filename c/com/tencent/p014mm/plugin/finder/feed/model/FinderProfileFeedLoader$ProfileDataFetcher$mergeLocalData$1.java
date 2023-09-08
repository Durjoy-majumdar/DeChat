package com.tencent.p014mm.plugin.finder.feed.model;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import fy3.C32226l;
import gy3.C87413o;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"<anonymous>", "", "removeIt", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "invoke", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)Ljava/lang/Boolean;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$ProfileDataFetcher$mergeLocalData$1 */
public final class FinderProfileFeedLoader$ProfileDataFetcher$mergeLocalData$1 extends C87413o implements C32226l<FinderItem, Boolean> {
    public final /* synthetic */ List<FinderItem> $nowList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileFeedLoader$ProfileDataFetcher$mergeLocalData$1(List<? extends FinderItem> list) {
        super(1);
        this.$nowList = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[EDGE_INSN: B:20:0x0046->B:15:0x0046 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean invoke(com.tencent.p014mm.plugin.finder.storage.FinderItem r11) {
        /*
            r10 = this;
            java.lang.String r0 = "removeIt"
            gy3.C87412m.m108594g(r11, r0)
            java.util.List<com.tencent.mm.plugin.finder.storage.FinderItem> r0 = r10.$nowList
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()
            r4 = r1
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r4
            long r5 = r4.getLocalId()
            long r7 = r11.getLocalId()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0041
            long r5 = r4.field_id
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0034
            long r7 = r11.field_id
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0041
        L_0x0034:
            int r4 = r4.getCreateTime()
            int r5 = r11.getCreateTime()
            if (r4 != r5) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r4 = 0
            goto L_0x0042
        L_0x0041:
            r4 = 1
        L_0x0042:
            if (r4 == 0) goto L_0x000b
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r1
            if (r1 == 0) goto L_0x004b
            r2 = 1
        L_0x004b:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader$ProfileDataFetcher$mergeLocalData$1.invoke(com.tencent.mm.plugin.finder.storage.FinderItem):java.lang.Boolean");
    }
}
