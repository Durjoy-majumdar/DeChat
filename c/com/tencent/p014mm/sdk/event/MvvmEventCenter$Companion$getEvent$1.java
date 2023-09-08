package com.tencent.p014mm.sdk.event;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"com/tencent/mm/sdk/event/MvvmEventCenter$Companion$getEvent$1", "Landroidx/lifecycle/k0$b;", "Landroidx/lifecycle/i0;", "T", "Ljava/lang/Class;", "eventClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/i0;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.event.MvvmEventCenter$Companion$getEvent$1 */
public final class MvvmEventCenter$Companion$getEvent$1 implements C54209k0.C54210b {
    public <T extends C39622i0> T create(Class<T> cls) {
        C87412m.m108594g(cls, "eventClass");
        return (C39622i0) cls.newInstance();
    }
}
