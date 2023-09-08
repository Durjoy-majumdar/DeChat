package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.vfs.C86013q1;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.MMFileSlotManager$clearSlot$3$1$1 */
public final class MMFileSlotManager$clearSlot$3$1$1 implements Runnable {
    public final /* synthetic */ List<String> $toClear;

    public MMFileSlotManager$clearSlot$3$1$1(List<String> list) {
        this.$toClear = list;
    }

    public final void run() {
        for (String f : this.$toClear) {
            C86013q1.m106445f(f);
        }
    }
}
