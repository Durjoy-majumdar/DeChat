package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86016v1;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Lcom/tencent/mm/vfs/m1;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "name", "", "accept", "(Lcom/tencent/mm/vfs/m1;Ljava/lang/String;)Z", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.MMFileSlotManager$clearSlot$1 */
public final class MMFileSlotManager$clearSlot$1 implements C86016v1 {
    public final /* synthetic */ long $slotId;

    public MMFileSlotManager$clearSlot$1(long j) {
        this.$slotId = j;
    }

    public final boolean accept(C86009m1 m1Var, String str) {
        C87412m.m108594g(str, "name");
        return !C87412m.m108589b(str, String.valueOf(this.$slotId));
    }
}
