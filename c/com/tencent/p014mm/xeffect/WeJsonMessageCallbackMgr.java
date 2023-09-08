package com.tencent.p014mm.xeffect;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;
import qr3.C63321d;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002R4\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000ej\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n`\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/xeffect/WeJsonMessageCallbackMgr;", "", "", "nPtr", "", "sourceId", "", "message", "type", "callback", "Lcom/tencent/mm/xeffect/IWeJsonMessageCallback;", "Lrx3/b0;", "setCallback", "removeAll", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "callbackMap", "Ljava/util/HashMap;", "<init>", "()V", "renderlib_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.WeJsonMessageCallbackMgr */
public final class WeJsonMessageCallbackMgr {
    public static final WeJsonMessageCallbackMgr INSTANCE = new WeJsonMessageCallbackMgr();
    private static final HashMap<Long, IWeJsonMessageCallback> callbackMap = new HashMap<>();

    private WeJsonMessageCallbackMgr() {
    }

    public static final int callback(long j, int i, String str, int i2) {
        C87412m.m108595h(str, StateEvent.Name.MESSAGE);
        IWeJsonMessageCallback iWeJsonMessageCallback = callbackMap.get(Long.valueOf(j));
        if (iWeJsonMessageCallback == null) {
            return 0;
        }
        iWeJsonMessageCallback.mo75594a(i, str, C63321d.values()[i2]);
        return 0;
    }

    public final IWeJsonMessageCallback removeAll(long j) {
        IWeJsonMessageCallback remove;
        HashMap<Long, IWeJsonMessageCallback> hashMap = callbackMap;
        synchronized (hashMap) {
            remove = hashMap.remove(Long.valueOf(j));
        }
        return remove;
    }

    public final void setCallback(long j, IWeJsonMessageCallback iWeJsonMessageCallback) {
        HashMap<Long, IWeJsonMessageCallback> hashMap = callbackMap;
        synchronized (hashMap) {
            hashMap.put(Long.valueOf(j), iWeJsonMessageCallback);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
