package com.tencent.tav.core.parallel.util;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/tav/core/parallel/util/ParallelSPStorage;", "", "Lrx3/b0;", "makeDebugError", "", "DEBUG_COUNT", "I", "DEBUG_ERROR_FREQUENCY", "<init>", "()V", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
public final class ParallelSPStorage {
    private static int DEBUG_COUNT;
    private static int DEBUG_ERROR_FREQUENCY = 4;
    public static final ParallelSPStorage INSTANCE = new ParallelSPStorage();

    private ParallelSPStorage() {
    }

    public final void makeDebugError() {
        int i = DEBUG_COUNT + 1;
        DEBUG_COUNT = i;
        if (i % DEBUG_ERROR_FREQUENCY == 0) {
            throw new Exception("debug error");
        }
    }
}
