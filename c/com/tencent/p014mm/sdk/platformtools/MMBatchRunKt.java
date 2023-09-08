package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.sdk.storage.MStorageEventData;
import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\n\u001a\u00020\b\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\b\u0004\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006H\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0007\n\u0005\b20\u0001¨\u0006\f"}, mo182094d2 = {"T", "data", "", "delay", "", "key", "Lkotlin/Function1;", "", "Lrx3/b0;", "run", "batchRun", "(Ljava/lang/Object;JLjava/lang/String;Lfy3/l;)V", "libcompatible_release"}, mo182095k = 2, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.MMBatchRunKt */
public final class MMBatchRunKt {
    public static final <T> void batchRun(T t, long j, String str, C32226l<? super List<? extends T>, C13598b0> lVar) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(lVar, "run");
        C87412m.m108602o();
        throw null;
    }

    public static void batchRun$default(Object obj, long j, String str, C32226l lVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            str = MStorageEventData.EventType.BATCH;
        }
        C87412m.m108594g(str, "key");
        C87412m.m108594g(lVar, "run");
        C87412m.m108602o();
        throw null;
    }
}
