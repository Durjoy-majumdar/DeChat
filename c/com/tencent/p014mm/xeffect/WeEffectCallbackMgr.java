package com.tencent.p014mm.xeffect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0007J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R0\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f`\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/xeffect/WeEffectCallbackMgr;", "", "", "ptr", "id", "", "status", "playedTime", "maxPlayTime", "instanceId", "Lrx3/b0;", "dispatch", "Lcom/tencent/mm/xeffect/IWeEffectCallback;", "callback", "setCallback", "clearCallback", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "callbackMap", "Ljava/util/HashMap;", "<init>", "()V", "renderlib_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.WeEffectCallbackMgr */
public final class WeEffectCallbackMgr {
    public static final WeEffectCallbackMgr INSTANCE = new WeEffectCallbackMgr();
    private static final HashMap<String, IWeEffectCallback> callbackMap = new HashMap<>();

    private WeEffectCallbackMgr() {
    }

    public static final void dispatch(long j, long j2, int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('-');
        sb.append(j2);
        IWeEffectCallback iWeEffectCallback = callbackMap.get(sb.toString());
        if (iWeEffectCallback != null) {
            iWeEffectCallback.mo84253a(i, i2, i3, i4);
        }
    }

    public final void clearCallback(long j) {
        Iterator<Map.Entry<String, IWeEffectCallback>> it = callbackMap.entrySet().iterator();
        while (it.hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append('-');
            if (C112551y.m153820t((String) it.next().getKey(), sb.toString(), false, 2, (Object) null)) {
                it.remove();
            }
        }
    }

    public final void setCallback(long j, long j2, IWeEffectCallback iWeEffectCallback) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('-');
        sb.append(j2);
        String sb4 = sb.toString();
        if (iWeEffectCallback == null) {
            callbackMap.remove(sb4);
        } else {
            callbackMap.put(sb4, iWeEffectCallback);
        }
    }
}
