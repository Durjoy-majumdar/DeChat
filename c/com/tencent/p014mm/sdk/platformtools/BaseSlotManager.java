package com.tencent.p014mm.sdk.platformtools;

import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0011\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b3\u00104J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H$J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H$J!\u0010\u000e\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H$¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\tH$¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0006J\u0017\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0006R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0004X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\t8\u0014X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u0010.\u001a\u00020\u001b*\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010)R\u0018\u0010\u0010\u001a\u00020\t*\u00020\u001b8DX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/BaseSlotManager;", "T", "", "", "slotId", "slot", "Lrx3/b0;", "clearSlot", "(JLjava/lang/Object;)V", "", "slotKey", "remarkSlot", "", "verifySlot", "getSlotByKey", "(Ljava/lang/String;J)Ljava/lang/Object;", "key", "containsKey", "(Ljava/lang/Object;Ljava/lang/String;)Z", "verifyAllSlot", "findSlot", "(Ljava/lang/String;)Ljava/lang/Object;", "getSlotForWrite", "()Ljava/lang/Object;", "clearAll", "soltSeconds", "J", "", "SLOT_SIZE", "I", "getSLOT_SIZE", "()I", "prefix", "Ljava/lang/String;", "getPrefix", "()Ljava/lang/String;", "", "verifiedCache", "[J", "lastCurrentId", "getLastCurrentId", "()J", "setLastCurrentId", "(J)V", "getToSlot", "(J)I", "toSlot", "getCurrentSlotId", "currentSlotId", "getKey", "(I)Ljava/lang/String;", "<init>", "(JI)V", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.BaseSlotManager */
public abstract class BaseSlotManager<T> {
    private final int SLOT_SIZE;
    private long lastCurrentId;
    private final String prefix;
    private final long soltSeconds;
    private final long[] verifiedCache;

    public BaseSlotManager() {
        this(0, 0, 3, (C8480h) null);
    }

    public BaseSlotManager(long j, int i) {
        String str;
        this.soltSeconds = j;
        this.SLOT_SIZE = i;
        StringBuilder sb = new StringBuilder();
        sb.append("_slots_id");
        if (j == 900) {
            str = "";
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append('_');
            sb4.append(j);
            str = sb4.toString();
        }
        sb.append(str);
        sb.append('_');
        this.prefix = sb.toString();
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = -1;
        }
        this.verifiedCache = jArr;
        this.lastCurrentId = getCurrentSlotId();
    }

    private static final <T> T findSlot$checkSlot(BaseSlotManager<T> baseSlotManager, long j, String str) {
        int toSlot = baseSlotManager.getToSlot(j);
        T slotByKey = baseSlotManager.getSlotByKey(baseSlotManager.getKey(toSlot), j);
        if (!baseSlotManager.containsKey(slotByKey, str)) {
            return null;
        }
        baseSlotManager.verifiedCache[toSlot] = -1;
        return slotByKey;
    }

    private final long getCurrentSlotId() {
        return MMSlotKt.now() / (this.soltSeconds * 1000);
    }

    public static /* synthetic */ Object getSlotByKey$default(BaseSlotManager baseSlotManager, String str, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = -1;
            }
            return baseSlotManager.getSlotByKey(str, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSlotByKey");
    }

    private final int getToSlot(long j) {
        int i = this.SLOT_SIZE;
        return (int) (((j % ((long) i)) + ((long) i)) % ((long) 3));
    }

    public final void clearAll() {
        int i = this.SLOT_SIZE;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                clearSlot(-1, getSlotByKey$default(this, getKey(i2), 0, 2, (Object) null));
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void clearSlot(long j, T t);

    public abstract boolean containsKey(T t, String str);

    public final T findSlot(String str) {
        C87412m.m108594g(str, "key");
        verifyAllSlot();
        long currentSlotId = getCurrentSlotId();
        T findSlot$checkSlot = findSlot$checkSlot(this, currentSlotId, str);
        if (findSlot$checkSlot != null) {
            return findSlot$checkSlot;
        }
        T findSlot$checkSlot2 = findSlot$checkSlot(this, currentSlotId - 1, str);
        if (findSlot$checkSlot2 != null) {
            return findSlot$checkSlot2;
        }
        return null;
    }

    public final String getKey(int i) {
        return getPrefix() + (i % this.SLOT_SIZE);
    }

    public final long getLastCurrentId() {
        return this.lastCurrentId;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public final int getSLOT_SIZE() {
        return this.SLOT_SIZE;
    }

    public abstract T getSlotByKey(String str, long j);

    public final T getSlotForWrite() {
        verifyAllSlot();
        long currentSlotId = getCurrentSlotId();
        return getSlotByKey(getKey(getToSlot(currentSlotId)), currentSlotId);
    }

    public abstract void remarkSlot(String str, long j);

    public final void setLastCurrentId(long j) {
        this.lastCurrentId = j;
    }

    public final void verifyAllSlot() {
        int i;
        long currentSlotId = getCurrentSlotId();
        boolean z = this.lastCurrentId != currentSlotId;
        this.lastCurrentId = currentSlotId;
        long j = currentSlotId - 1;
        long j2 = currentSlotId + 1;
        if (j <= j2) {
            long j3 = j;
            while (true) {
                int toSlot = getToSlot(j3);
                String key = getKey(toSlot);
                if (z || this.verifiedCache[toSlot] != j3) {
                    if (!verifySlot(key, j3)) {
                        String str = key;
                        i = toSlot;
                        clearSlot(j3, getSlotByKey$default(this, key, 0, 2, (Object) null));
                        if (j3 == currentSlotId) {
                            remarkSlot(str, j3);
                        }
                    } else {
                        i = toSlot;
                    }
                    this.verifiedCache[i] = j3;
                }
                if (j3 != j2) {
                    j3++;
                } else {
                    return;
                }
            }
        }
    }

    public abstract boolean verifySlot(String str, long j);

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseSlotManager(long j, int i, int i2, C8480h hVar) {
        this((i2 & 1) != 0 ? 900 : j, (i2 & 2) != 0 ? 3 : i);
    }
}
