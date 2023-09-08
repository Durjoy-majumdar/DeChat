package com.tencent.p014mm.sdk.platformtools;

import android.os.Parcelable;
import com.tencent.p014mm.sdk.observer.MvvmObserverOwner;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110823p;
import sx3.C36907w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\u0010\"\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 62\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b4\u00105J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0007J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\tJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\nJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0010\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0011\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\bJ\u0010\u0010\u0012\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0012\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\tJ\u0010\u0010\u0013\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0013\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\nJ\u0010\u0010\u0014\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0014\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0005J\u001a\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J,\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000bJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J3\u0010\u001a\u001a\u00028\u0000\"\n\b\u0000\u0010\u0017*\u0004\u0018\u00010\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\u001a\u001a\u00028\u0000\"\n\b\u0000\u0010\u0017*\u0004\u0018\u00010\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00182\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002J\u001f\u0010\"\u001a\u00020\u001e2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0006\u0010$\u001a\u00020\bJ\u0006\u0010%\u001a\u00020\bJ\u0006\u0010&\u001a\u00020\u001eJ\u0006\u0010'\u001a\u00020\u001eJ\u0006\u0010(\u001a\u00020\u001eR\u0014\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R'\u00103\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,8FX\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00067"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/ObservableMMKV;", "", "", "key", "value", "", "encode", "", "", "", "", "", "", "Landroid/os/Parcelable;", "decodeString", "defaultValue", "decodeInt", "decodeLong", "decodeFloat", "decodeDouble", "decodeBool", "decodeStringSet", "decodeBytes", "T", "Ljava/lang/Class;", "tClass", "decodeParcelable", "(Ljava/lang/String;Ljava/lang/Class;)Landroid/os/Parcelable;", "(Ljava/lang/String;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;", "containsKey", "Lrx3/b0;", "removeValueForKey", "", "arrKeys", "removeValuesForKeys", "([Ljava/lang/String;)V", "totalSize", "count", "clearMemoryCache", "clearAll", "trim", "Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;", "mmkv", "Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;", "Lcom/tencent/mm/sdk/observer/MvvmObserverOwner;", "Lcom/tencent/mm/sdk/platformtools/IMMKVStorageObserver;", "Lcom/tencent/mm/sdk/platformtools/MMKVStorageEvent;", "owner$delegate", "Lrx3/g;", "getOwner", "()Lcom/tencent/mm/sdk/observer/MvvmObserverOwner;", "owner", "<init>", "(Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;)V", "Companion", "wechat-internal-support_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.ObservableMMKV */
public final class ObservableMMKV {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.ObservableMMKV";
    private final MultiProcessMMKV mmkv;
    private final C13601g owner$delegate = C36568h.m40985a(ObservableMMKV$owner$2.INSTANCE);

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/ObservableMMKV$Companion;", "", "()V", "TAG", "", "wechat-internal-support_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.platformtools.ObservableMMKV$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public ObservableMMKV(MultiProcessMMKV multiProcessMMKV) {
        C87412m.m108594g(multiProcessMMKV, "mmkv");
        this.mmkv = multiProcessMMKV;
    }

    public final void clearAll() {
        this.mmkv.clearAll();
    }

    public final void clearMemoryCache() {
        this.mmkv.clearMemoryCache();
    }

    public final boolean containsKey(String str) {
        return this.mmkv.containsKey(str);
    }

    public final long count() {
        return this.mmkv.count();
    }

    public final boolean decodeBool(String str) {
        return this.mmkv.decodeBool(str);
    }

    public final byte[] decodeBytes(String str) {
        return this.mmkv.decodeBytes(str);
    }

    public final double decodeDouble(String str) {
        return this.mmkv.decodeDouble(str);
    }

    public final float decodeFloat(String str) {
        return this.mmkv.decodeFloat(str);
    }

    public final int decodeInt(String str) {
        return this.mmkv.decodeInt(str);
    }

    public final long decodeLong(String str) {
        return this.mmkv.decodeLong(str);
    }

    public final <T extends Parcelable> T decodeParcelable(String str, Class<T> cls) {
        return this.mmkv.decodeParcelable(str, cls);
    }

    public final String decodeString(String str) {
        return this.mmkv.decodeString(str);
    }

    public final Set<String> decodeStringSet(String str) {
        return this.mmkv.decodeStringSet(str);
    }

    public final boolean encode(String str, String str2) {
        C87412m.m108594g(str, "key");
        boolean encode = this.mmkv.encode(str, str2);
        if (encode) {
            MvvmObserverOwner<IMMKVStorageObserver, MMKVStorageEvent> owner = getOwner();
            MMKVStorageEvent mMKVStorageEvent = new MMKVStorageEvent(MMKVStorageEventType.ENCODE, str);
            mMKVStorageEvent.setStringValue(str2);
            owner.notify(mMKVStorageEvent);
        }
        return encode;
    }

    public final MvvmObserverOwner<IMMKVStorageObserver, MMKVStorageEvent> getOwner() {
        return (MvvmObserverOwner) this.owner$delegate.getValue();
    }

    public final void removeValueForKey(String str) {
        C87412m.m108594g(str, "key");
        this.mmkv.removeValueForKey(str);
        getOwner().notify(new MMKVStorageEvent(MMKVStorageEventType.REMOVE, str));
    }

    public final void removeValuesForKeys(String[] strArr) {
        ArrayList arrayList;
        this.mmkv.removeValuesForKeys(strArr);
        if (strArr != null) {
            List<String> z = C110823p.m151010z(strArr);
            arrayList = new ArrayList(C36907w.m41090l(z, 10));
            for (String mMKVStorageEvent : z) {
                arrayList.add(new MMKVStorageEvent(MMKVStorageEventType.REMOVE, mMKVStorageEvent));
            }
        } else {
            arrayList = null;
        }
        boolean z2 = false;
        if (arrayList != null && (!arrayList.isEmpty())) {
            z2 = true;
        }
        if (z2) {
            getOwner().notify(arrayList);
        }
    }

    public final long totalSize() {
        return this.mmkv.totalSize();
    }

    public final void trim() {
        this.mmkv.trim();
    }

    public final boolean decodeBool(String str, boolean z) {
        return this.mmkv.decodeBool(str, z);
    }

    public final double decodeDouble(String str, double d) {
        return this.mmkv.decodeDouble(str, d);
    }

    public final float decodeFloat(String str, float f) {
        return this.mmkv.decodeFloat(str, f);
    }

    public final int decodeInt(String str, int i) {
        return this.mmkv.decodeInt(str, i);
    }

    public final long decodeLong(String str, long j) {
        return this.mmkv.decodeLong(str, j);
    }

    public final <T extends Parcelable> T decodeParcelable(String str, Class<T> cls, T t) {
        return this.mmkv.decodeParcelable(str, cls, t);
    }

    public final String decodeString(String str, String str2) {
        return this.mmkv.decodeString(str, str2);
    }

    public final Set<String> decodeStringSet(String str, Set<String> set) {
        return this.mmkv.decodeStringSet(str, set);
    }

    public final boolean encode(String str, int i) {
        C87412m.m108594g(str, "key");
        boolean encode = this.mmkv.encode(str, i);
        if (encode) {
            MvvmObserverOwner<IMMKVStorageObserver, MMKVStorageEvent> owner = getOwner();
            MMKVStorageEvent mMKVStorageEvent = new MMKVStorageEvent(MMKVStorageEventType.ENCODE, str);
            mMKVStorageEvent.setIntValue(i);
            owner.notify(mMKVStorageEvent);
        }
        return encode;
    }

    public final boolean encode(String str, long j) {
        C87412m.m108594g(str, "key");
        boolean encode = this.mmkv.encode(str, j);
        if (encode) {
            MvvmObserverOwner<IMMKVStorageObserver, MMKVStorageEvent> owner = getOwner();
            MMKVStorageEvent mMKVStorageEvent = new MMKVStorageEvent(MMKVStorageEventType.ENCODE, str);
            mMKVStorageEvent.setLongValue(j);
            owner.notify(mMKVStorageEvent);
        }
        return encode;
    }

    public final boolean encode(String str, float f) {
        C87412m.m108594g(str, "key");
        boolean encode = this.mmkv.encode(str, f);
        if (encode) {
            MvvmObserverOwner<IMMKVStorageObserver, MMKVStorageEvent> owner = getOwner();
            MMKVStorageEvent mMKVStorageEvent = new MMKVStorageEvent(MMKVStorageEventType.ENCODE, str);
            mMKVStorageEvent.setFloatValue(f);
            owner.notify(mMKVStorageEvent);
        }
        return encode;
    }

    public final boolean encode(String str, double d) {
        C87412m.m108594g(str, "key");
        boolean encode = this.mmkv.encode(str, d);
        if (encode) {
            MvvmObserverOwner<IMMKVStorageObserver, MMKVStorageEvent> owner = getOwner();
            MMKVStorageEvent mMKVStorageEvent = new MMKVStorageEvent(MMKVStorageEventType.ENCODE, str);
            mMKVStorageEvent.setDoubleValue(d);
            owner.notify(mMKVStorageEvent);
        }
        return encode;
    }

    public final boolean encode(String str, boolean z) {
        C87412m.m108594g(str, "key");
        boolean encode = this.mmkv.encode(str, z);
        if (encode) {
            MvvmObserverOwner<IMMKVStorageObserver, MMKVStorageEvent> owner = getOwner();
            MMKVStorageEvent mMKVStorageEvent = new MMKVStorageEvent(MMKVStorageEventType.ENCODE, str);
            mMKVStorageEvent.setBooleanValue(z);
            owner.notify(mMKVStorageEvent);
        }
        return encode;
    }

    public final boolean encode(String str, Set<String> set) {
        C87412m.m108594g(str, "key");
        boolean encode = this.mmkv.encode(str, set);
        if (encode) {
            MvvmObserverOwner<IMMKVStorageObserver, MMKVStorageEvent> owner = getOwner();
            MMKVStorageEvent mMKVStorageEvent = new MMKVStorageEvent(MMKVStorageEventType.ENCODE, str);
            mMKVStorageEvent.setSetValue(set);
            owner.notify(mMKVStorageEvent);
        }
        return encode;
    }

    public final boolean encode(String str, byte[] bArr) {
        C87412m.m108594g(str, "key");
        boolean encode = this.mmkv.encode(str, bArr);
        if (encode) {
            MvvmObserverOwner<IMMKVStorageObserver, MMKVStorageEvent> owner = getOwner();
            MMKVStorageEvent mMKVStorageEvent = new MMKVStorageEvent(MMKVStorageEventType.ENCODE, str);
            mMKVStorageEvent.setByteArrayValue(bArr);
            owner.notify(mMKVStorageEvent);
        }
        return encode;
    }

    public final boolean encode(String str, Parcelable parcelable) {
        C87412m.m108594g(str, "key");
        boolean encode = this.mmkv.encode(str, parcelable);
        if (encode) {
            MvvmObserverOwner<IMMKVStorageObserver, MMKVStorageEvent> owner = getOwner();
            MMKVStorageEvent mMKVStorageEvent = new MMKVStorageEvent(MMKVStorageEventType.ENCODE, str);
            mMKVStorageEvent.setParcelableValue(parcelable);
            owner.notify(mMKVStorageEvent);
        }
        return encode;
    }
}
