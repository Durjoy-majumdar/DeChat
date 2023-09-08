package com.tencent.p014mm.sdk.platformtools;

import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo182094d2 = {"DEFAULT_SLOT_SECONDS", "", "now", "isExpire", "", "seconds", "", "millSeconds", "libcompatible_release"}, mo182095k = 2, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.platformtools.MMSlotKt */
public final class MMSlotKt {
    private static final long DEFAULT_SLOT_SECONDS = 900;

    public static final boolean isExpire(long j, long j2) {
        return now() - j > j2;
    }

    public static final long now() {
        return System.currentTimeMillis();
    }

    public static final boolean isExpire(long j, int i) {
        return isExpire(j, ((long) i) * 1000);
    }
}
