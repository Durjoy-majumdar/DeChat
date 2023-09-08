package com.tencent.p014mm.sdk.p134kt;

import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sdk/kt/IntentTransfer;", "", "()V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.kt.IntentTransfer */
public final class IntentTransfer {
    public static final Companion Companion = new Companion((C8480h) null);
    /* access modifiers changed from: private */
    public static final ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/sdk/kt/IntentTransfer$Companion;", "", "", "key", "value", "Lrx3/b0;", "put", "pop", "get", "Ljava/util/concurrent/ConcurrentHashMap;", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.sdk.kt.IntentTransfer$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public final Object get(String str) {
            C87412m.m108594g(str, "key");
            Object obj = IntentTransfer.map.get(str);
            if (obj != null) {
                return obj;
            }
            return null;
        }

        public final Object pop(String str) {
            C87412m.m108594g(str, "key");
            Object obj = get(str);
            if (obj != null) {
                IntentTransfer.map.remove(str);
            }
            return obj;
        }

        public final void put(String str, Object obj) {
            C87412m.m108594g(str, "key");
            C87412m.m108594g(obj, "value");
            IntentTransfer.map.put(str, obj);
        }
    }
}
