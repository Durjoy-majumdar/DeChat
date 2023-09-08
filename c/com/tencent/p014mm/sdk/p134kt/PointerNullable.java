package com.tencent.p014mm.sdk.p134kt;

import gy3.C8480h;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/sdk/kt/PointerNullable;", "T", "", "obj", "(Ljava/lang/Object;)V", "getObj", "()Ljava/lang/Object;", "setObj", "Ljava/lang/Object;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.kt.PointerNullable */
public final class PointerNullable<T> {
    private T obj;

    public PointerNullable() {
        this((Object) null, 1, (C8480h) null);
    }

    public PointerNullable(T t) {
        this.obj = t;
    }

    public final T getObj() {
        return this.obj;
    }

    public final void setObj(T t) {
        this.obj = t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PointerNullable(Object obj2, int i, C8480h hVar) {
        this((i & 1) != 0 ? null : obj2);
    }
}
