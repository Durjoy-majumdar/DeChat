package com.tencent.p014mm.sdk.platformtools;

import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import pe3.C47465a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J \u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0003J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bJ&\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u001a2\u0006\u0010\t\u001a\u00020\bH\b¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/MMKVSlotManager;", "Lcom/tencent/mm/sdk/platformtools/BaseSlotManager;", "Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;", "", "slotId", "slot", "Lrx3/b0;", "clearSlot", "", "key", "removeKey", "slotKey", "remarkSlot", "", "verifySlot", "kotlin.jvm.PlatformType", "getSlotByKey", "containsKey", "", "default", "decodeInt", "decodeLong", "decodeString", "", "decodeBytes", "decodeBool", "Lpe3/a;", "T", "decodeProtoBuffer", "(Ljava/lang/String;)Lpe3/a;", "slotRecorder", "Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;", "slotSeconds", "<init>", "(Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;J)V", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.MMKVSlotManager */
public class MMKVSlotManager extends BaseSlotManager<MultiProcessMMKV> {
    private final MultiProcessMMKV slotRecorder;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MMKVSlotManager(MultiProcessMMKV multiProcessMMKV, long j, int i, C8480h hVar) {
        this(multiProcessMMKV, (i & 2) != 0 ? 900 : j);
    }

    public static /* synthetic */ boolean decodeBool$default(MMKVSlotManager mMKVSlotManager, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return mMKVSlotManager.decodeBool(str, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeBool");
    }

    public static /* synthetic */ int decodeInt$default(MMKVSlotManager mMKVSlotManager, String str, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return mMKVSlotManager.decodeInt(str, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeInt");
    }

    public static /* synthetic */ long decodeLong$default(MMKVSlotManager mMKVSlotManager, String str, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = 0;
            }
            return mMKVSlotManager.decodeLong(str, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeLong");
    }

    public static /* synthetic */ String decodeString$default(MMKVSlotManager mMKVSlotManager, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str2 = "";
            }
            return mMKVSlotManager.decodeString(str, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeString");
    }

    public final boolean decodeBool(String str, boolean z) {
        C87412m.m108594g(str, "key");
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) findSlot(str);
        return multiProcessMMKV != null ? multiProcessMMKV.decodeBool(str, z) : z;
    }

    public final byte[] decodeBytes(String str) {
        C87412m.m108594g(str, "key");
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) findSlot(str);
        if (multiProcessMMKV != null) {
            return multiProcessMMKV.decodeBytes(str);
        }
        return null;
    }

    public final int decodeInt(String str, int i) {
        C87412m.m108594g(str, "key");
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) findSlot(str);
        return multiProcessMMKV != null ? multiProcessMMKV.decodeInt(str, i) : i;
    }

    public final long decodeLong(String str, long j) {
        C87412m.m108594g(str, "key");
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) findSlot(str);
        return multiProcessMMKV != null ? multiProcessMMKV.decodeLong(str) : j;
    }

    public final <T extends C47465a> T decodeProtoBuffer(String str) {
        byte[] decodeBytes;
        C87412m.m108594g(str, "key");
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) findSlot(str);
        if (!(multiProcessMMKV == null || !multiProcessMMKV.containsKey(str) || (decodeBytes = multiProcessMMKV.decodeBytes(str)) == null)) {
            if (!(decodeBytes.length == 0)) {
                try {
                    C87412m.m108602o();
                    throw null;
                } catch (Exception e) {
                    Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e, "decode ProtoBuffer", new Object[0]);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r2 = r0.decodeString(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String decodeString(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "key"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.Object r0 = r1.findSlot(r2)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r0
            if (r0 == 0) goto L_0x0015
            java.lang.String r2 = r0.decodeString(r2, r3)
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r3 = r2
        L_0x0015:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.MMKVSlotManager.decodeString(java.lang.String, java.lang.String):java.lang.String");
    }

    public void remarkSlot(String str, long j) {
        C87412m.m108594g(str, "slotKey");
        this.slotRecorder.putLong(str, j);
    }

    public final void removeKey(String str) {
        C87412m.m108594g(str, "key");
        int slot_size = getSLOT_SIZE();
        if (slot_size >= 0) {
            int i = 0;
            while (true) {
                MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) BaseSlotManager.getSlotByKey$default(this, getKey(i), 0, 2, (Object) null);
                if (multiProcessMMKV != null) {
                    multiProcessMMKV.remove(str);
                }
                if (i != slot_size) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean verifySlot(String str, long j) {
        C87412m.m108594g(str, "slotKey");
        return this.slotRecorder.getLong(str, 0) == j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMKVSlotManager(MultiProcessMMKV multiProcessMMKV, long j) {
        super(j, 0, 2, (C8480h) null);
        C87412m.m108594g(multiProcessMMKV, "slotRecorder");
        this.slotRecorder = multiProcessMMKV;
    }

    public void clearSlot(long j, MultiProcessMMKV multiProcessMMKV) {
        C87412m.m108594g(multiProcessMMKV, "slot");
        if (multiProcessMMKV.count() > 0) {
            multiProcessMMKV.clear();
        }
    }

    public boolean containsKey(MultiProcessMMKV multiProcessMMKV, String str) {
        C87412m.m108594g(multiProcessMMKV, "slot");
        C87412m.m108594g(str, "key");
        return multiProcessMMKV.containsKey(str);
    }

    public MultiProcessMMKV getSlotByKey(String str, long j) {
        C87412m.m108594g(str, "slotKey");
        return MultiProcessMMKV.getMMKV(str, 2);
    }

    public final boolean containsKey(String str) {
        C87412m.m108594g(str, "key");
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) findSlot(str);
        if (multiProcessMMKV != null) {
            return multiProcessMMKV.containsKey(str);
        }
        return false;
    }
}
