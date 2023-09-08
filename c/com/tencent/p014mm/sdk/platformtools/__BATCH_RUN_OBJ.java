package com.tencent.p014mm.sdk.platformtools;

import a14.C53973z1;
import java.util.HashMap;
import java.util.Queue;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR3\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR;\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u0002j\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n`\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/__BATCH_RUN_OBJ;", "", "Ljava/util/HashMap;", "", "La14/z1;", "Lkotlin/collections/HashMap;", "batchJobs", "Ljava/util/HashMap;", "getBatchJobs", "()Ljava/util/HashMap;", "Ljava/util/Queue;", "batchData", "getBatchData", "<init>", "()V", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.__BATCH_RUN_OBJ */
public final class __BATCH_RUN_OBJ {
    public static final __BATCH_RUN_OBJ INSTANCE = new __BATCH_RUN_OBJ();
    private static final HashMap<String, Queue<?>> batchData = new HashMap<>();
    private static final HashMap<String, C53973z1> batchJobs = new HashMap<>();

    private __BATCH_RUN_OBJ() {
    }

    public final HashMap<String, Queue<?>> getBatchData() {
        return batchData;
    }

    public final HashMap<String, C53973z1> getBatchJobs() {
        return batchJobs;
    }
}
