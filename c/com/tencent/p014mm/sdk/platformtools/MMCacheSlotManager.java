package com.tencent.p014mm.sdk.platformtools;

import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0014J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bR0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0012j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002`\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/MMCacheSlotManager;", "Lcom/tencent/mm/sdk/platformtools/BaseSlotManager;", "Lcom/tencent/mm/sdk/platformtools/MMCacheSlot;", "", "slotId", "slot", "Lrx3/b0;", "clearSlot", "", "slotKey", "getSlotByKey", "remarkSlot", "", "verifySlot", "key", "containsKey", "add", "contains", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "caches", "Ljava/util/HashMap;", "<init>", "()V", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.MMCacheSlotManager */
public final class MMCacheSlotManager extends BaseSlotManager<MMCacheSlot> {
    private final HashMap<String, MMCacheSlot> caches = new HashMap<>();

    public MMCacheSlotManager() {
        super(60, 0, 2, (C8480h) null);
    }

    public final void add(String str) {
        C87412m.m108594g(str, "key");
        ((MMCacheSlot) getSlotForWrite()).getKeys$libcompatible_release().add(str);
    }

    public final boolean contains(String str) {
        C87412m.m108594g(str, "key");
        return findSlot(str) != null;
    }

    public void remarkSlot(String str, long j) {
        C87412m.m108594g(str, "slotKey");
        MMCacheSlot mMCacheSlot = this.caches.get(str);
        if (mMCacheSlot != null) {
            mMCacheSlot.setId$libcompatible_release(j);
        }
    }

    public boolean verifySlot(String str, long j) {
        C87412m.m108594g(str, "slotKey");
        MMCacheSlot mMCacheSlot = this.caches.get(str);
        return mMCacheSlot != null && mMCacheSlot.getId$libcompatible_release() == j;
    }

    public void clearSlot(long j, MMCacheSlot mMCacheSlot) {
        C87412m.m108594g(mMCacheSlot, "slot");
        mMCacheSlot.getKeys$libcompatible_release().clear();
    }

    public boolean containsKey(MMCacheSlot mMCacheSlot, String str) {
        C87412m.m108594g(mMCacheSlot, "slot");
        C87412m.m108594g(str, "key");
        return mMCacheSlot.getKeys$libcompatible_release().contains(str);
    }

    public synchronized MMCacheSlot getSlotByKey(String str, long j) {
        MMCacheSlot mMCacheSlot;
        C87412m.m108594g(str, "slotKey");
        mMCacheSlot = this.caches.get(str);
        if (mMCacheSlot == null) {
            mMCacheSlot = new MMCacheSlot();
            this.caches.put(str, mMCacheSlot);
        }
        return mMCacheSlot;
    }
}
