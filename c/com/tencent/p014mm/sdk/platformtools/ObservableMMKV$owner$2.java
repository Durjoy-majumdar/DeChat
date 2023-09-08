package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.sdk.observer.MvvmObserverOwner;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo182094d2 = {"<anonymous>", "com/tencent/mm/sdk/platformtools/ObservableMMKV$owner$2$1", "invoke", "()Lcom/tencent/mm/sdk/platformtools/ObservableMMKV$owner$2$1;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.platformtools.ObservableMMKV$owner$2 */
public final class ObservableMMKV$owner$2 extends C87413o implements C32224a<C195921> {
    public static final ObservableMMKV$owner$2 INSTANCE = new ObservableMMKV$owner$2();

    public ObservableMMKV$owner$2() {
        super(0);
    }

    public final C195921 invoke() {
        return new MvvmObserverOwner<IMMKVStorageObserver, MMKVStorageEvent>() {
            public String getLogTag() {
                return ObservableMMKV.TAG;
            }
        };
    }
}
